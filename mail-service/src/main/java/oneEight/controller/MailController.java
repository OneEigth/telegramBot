package oneEight.controller;

import oneEight.Dto.MailParams;
import oneEight.service.MailSenderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/mail")
@RestController
public class MailController {
    private final MailSenderService mailSenderService;


    public MailController(MailSenderService mailSenderService) {
        this.mailSenderService = mailSenderService;
    }
    @PostMapping("/send")
    public ResponseEntity<?> sendActivationMail(@RequestBody MailParams mailParams) {
        mailSenderService.sendMail(mailParams);
        return ResponseEntity.ok().build();
    }
}
