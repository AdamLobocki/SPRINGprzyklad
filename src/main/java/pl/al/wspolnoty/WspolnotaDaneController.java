package pl.al.wspolnoty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class WspolnotaDaneController {

    @Autowired
    private WspolnotyRepository wspolnotyRepository;
    public WspolnotaDaneController(WspolnotyRepository wspolnotyRepository){
        this.wspolnotyRepository = wspolnotyRepository;
    }

    @GetMapping("/wspolnota/{id}")
        public String home(@PathVariable Integer id, Model model){
            Optional<Wspolnota> optional = wspolnotyRepository.findById(id);

            if(optional.isPresent()){
                Wspolnota wspolnota = optional.orElse(null);
                model.addAttribute("wspolnota", wspolnota);
                return "wspolnota";
            } else {
                return "notFound";
            }

        }
}
