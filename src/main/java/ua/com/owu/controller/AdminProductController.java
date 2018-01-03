package ua.com.owu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.owu.entity.Client;
import ua.com.owu.entity.Product;
import ua.com.owu.service.ClientService;
import ua.com.owu.service.ProductService;

import java.util.List;

@Controller
public class AdminProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private ClientService clientService;
    @GetMapping("/admin")
    public String product(){
        return "admin";
    }

    @PostMapping("/createProduct")
    public String create(@RequestParam String name,
                         @RequestParam int price,
                         @RequestParam String description,
                         @RequestParam int count){

        Product product = new Product(name, price, description,count);
        productService.save(product);
        return "redirect:/showAllProduct";
    }

    @GetMapping("/showAllProduct")
    public String showAllClient(Model model){
        List<Product> products = productService.findAll();
        model.addAttribute("product",products);
        return "admin";
    }
    @GetMapping("/showAllClient")
    public String showClient(Model model){
        List<Client> clients = clientService.findAll();
        model.addAttribute("client",clients);
        return "showCustomers";
    }
}
