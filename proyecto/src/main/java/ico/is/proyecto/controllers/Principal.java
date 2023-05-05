package ico.is.proyecto.controllers;

import ch.qos.logback.core.model.Model;
import ico.is.proyecto.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.Mapping;


@Controller
public class Principal {
    @GetMapping("/inicio")

        public String getinicio (Model model){
        Empleado emp = new Empleado(1,"José Sosa",23000,"Desarrollo", "12/12/2000");
        model.addAttribute(emp,"Empleado");
        //nuevo.addAttribute ("inicio", new inicio());
        return "index";
    }
}
