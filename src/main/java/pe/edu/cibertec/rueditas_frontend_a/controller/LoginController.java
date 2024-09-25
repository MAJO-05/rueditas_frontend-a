package pe.edu.cibertec.rueditas_frontend_a.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import pe.edu.cibertec.rueditas_frontend_a.viewmodel.LoginModel;
import pe.edu.cibertec.rueditas_frontend_a.dto.LoginRequestDTO;
import pe.edu.cibertec.rueditas_frontend_a.dto.LoginResponseDTO;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/inicio")
    public String inicio(Model model){
        LoginModel loginModel = new LoginModel("oo","","");
        model.addAttribute("loginModel", loginModel);
        return "inicio";
    }

    @PostMapping("/autenticar")
    public String autenticar(@RequestParam("numeroPlaca") String numeroPlaca,
            Model model){

        // Validar campos de entrada
        if (numeroPlaca == null || numeroPlaca.trim().length() == 0) {

            LoginModel loginModel = new LoginModel("01", "Error: Debe completar correctamente las credenciales", "");
            model.addAttribute("loginModel", loginModel);
            return "inicio";

        }




    }

}
