package com.example.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Controller
public class Controlar {

    @GetMapping("/hello")
    @ResponseBody
    public String getHello()
    {
        return "hello world";
    }

    @GetMapping("/capitalize/{text}")
    public String capitalize(@PathVariable("text") String text, Model model){
        model.addAttribute("Text", text.toUpperCase());
        return "capitalize.html";
    }

    @GetMapping("/")
    public String homeRoute()
    {
        return "home.html";
    }

    @GetMapping("/albums")
    public String albums(Model m) {
        Album album1=new Album("Alkhateeb's","Mohamad",5,350,"https://i.pinimg.com/originals/b4/75/00/b4750046d94fed05d00dd849aa5f0ab7.jpg");
        Album album2=new Album("leave the door open","bruno mars",10,554,"https://media-us.cdn.prod.wmgecom.com/media/catalog/product/cache/664/image/600x/9df78eab33525d08d6e5fb8d27136e95/d/i/digital_1100x1100.png");
        Album album3=new Album("lover","taylor swift",13,760,"https://upload.wikimedia.org/wikipedia/en/c/cd/Taylor_Swift_-_Lover.png");

        List<Album> Albums = new ArrayList<>();
        Albums.add(album1);
        Albums.add(album2);
        Albums.add(album3);

        m.addAttribute("Albums",Albums);
        return "albums.html";
    }



}
