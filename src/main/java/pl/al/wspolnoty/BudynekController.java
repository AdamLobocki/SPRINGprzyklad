package pl.al.wspolnoty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BudynekController {


   @Autowired
   BudynekRepository budynekRepository;


}
