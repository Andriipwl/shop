package ua.com.owu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ua.com.owu.entity.Item;
import ua.com.owu.entity.OrderedProduct;
import ua.com.owu.service.ClientService;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ShoppingCardController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/cart")
    public String cart(Model model,HttpSession session){
        model.addAttribute("list",session.getAttribute("cart"));
        return "cart";
    }
    @GetMapping("/ordernow/{id}")
    public String orderNow(@PathVariable(value = "id") int id, Model model, HttpSession session , RedirectAttributes redirectAttributes) {
        if (session.getAttribute("cart") == null) {
//            redirectAttributes.addFlashAttribute("asd",111)
            List<Item> list = new ArrayList<>();
            list.add(new Item(this.clientService.find(id), 1));
            session.setAttribute("cart", list);
        } else {
            List<Item> list = (List<Item>) session.getAttribute("cart");
            int index = isExisting(id,session);
            if(index ==-1){
                list.add(new Item(this.clientService.find(id),1));
            }else{
                int quantity = list.get(index).getQuantity()+1;
                list.get(index).setQuantity(quantity);
            }
                session.setAttribute("cart", list);
        }
        return "redirect:/cart";
    }
    @GetMapping("/remove/{id}")
    public String remove(@PathVariable(value = "id")int id,HttpSession session){
        List<Item>  list = (List<Item>) session.getAttribute("cart");
        int index = isExisting(id,session);
        list.remove(index);
        session.setAttribute("cart",list);
        return "redirect:/cart";
    }

    public int isExisting(int id,HttpSession session){
        List<Item> list = (List<Item>) session.getAttribute("cart");
        for (int i = 0; i < list.size(); i++)
            if(list.get(i).getProduct().getId()==id)
                return i;
            return -1;

    }



}
