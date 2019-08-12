package pl.al.wspolnoty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Controller
public class WspolnotaController {


    @Autowired private WspolnotyRepository wspolnotyRepository;

    @GetMapping("/")
    public String home(Model model){


        model.addAttribute("wspolnoty", wspolnotyRepository.findAll());
        return "home";
    }




}
