package EnvioEmail.eMail.Controller;

import EnvioEmail.eMail.Service.S_EnvioEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// A função não responde
public class C_Email {
    @Autowired
    private S_EnvioEmail s_email;

    @GetMapping("/sendMail")
    public void sendMail(){
        s_email.sendMail("marciojosebaldo@gmail.com", "testes de envio", "Teste de e-mail com " +
                "Spring Boot Mail");
    }
}