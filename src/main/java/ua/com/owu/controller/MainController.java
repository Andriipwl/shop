package ua.com.owu.controller;

import javafx.print.Collation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.owu.entity.Client;
import ua.com.owu.entity.Product;
import ua.com.owu.service.ClientService;
import ua.com.owu.service.ProductService;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    private ClientService clientService;
    @Autowired
    private ProductService productService;

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @PostMapping("/createClient")
    public String create(@RequestParam String name,
                         @RequestParam String lastName,
                         @RequestParam int age,
                         @RequestParam String email,
                         @RequestParam String phoneNumber,
                         @RequestParam String location) {


        Client client = new Client(name, lastName, age, email, phoneNumber, location);
        clientService.save(client);
        System.out.println(name + " " + lastName + " " + age + " " + email + " " + phoneNumber + " " + location);
        return "index";
    }

    @GetMapping("/")
    public String showProd(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("prod", products);
        return "main";
    }

    @GetMapping("/product/{id}")
    public String findOne(@PathVariable("id") int id, Model model) {
        Product product = productService.findById(id);
        model.addAttribute("findOne", product);
        return "showProduct";

    }

    @GetMapping("/sortByLowPrice")
    public String sortByLowName(Model model) {
        List<Product> products = productService.sortByLowPrice();
//        products.sort(Comparator.comparing(Product::getPrise));
        model.addAttribute("sortByLowPrice", products);
        return "main";
    }

    @GetMapping("/sortByHighPrice")
    public String sortByHightPrice(Model model) {
        List<Product> products = productService.findAll();
        products.sort(Comparator.comparing(Product::getPrise).reversed());
        model.addAttribute("sortByHighPrice", products);
        return "main";
    }

    @PostMapping("/findByName")
    public String findByname(Model model, @RequestParam String name) {
        List<Product> products = productService.findByName(name);
        model.addAttribute("findByName", products);
        return "main";
    }


}
