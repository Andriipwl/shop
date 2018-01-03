package ua.com.owu.controller;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.owu.entity.OrderedProduct;
import ua.com.owu.service.ClientService;
import ua.com.owu.service.OrderService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private ClientService clientService;

    @GetMapping("/orderNow")
    public String orderNow(){
        return "orderNow";
    }

    @PostMapping("/order/{id}")
    public String order(@PathVariable("id") int id,
                        @RequestParam String FLS,
                        @RequestParam String email,
                        @RequestParam String phonenumber,
                        @RequestParam String address,
                        HttpSession session){
        OrderedProduct orderedProduct = new OrderedProduct(this.clientService.find(id),FLS,email,phonenumber,address);
        orderService.save(orderedProduct);
        return "redirect:/orderNow";
    }

}
