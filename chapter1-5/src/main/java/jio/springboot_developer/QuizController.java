package jio.springboot_developer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuizController {

    @GetMapping("/quiz")
    public ResponseEntity<String> quiz(@RequestParam("code") int code) {
        switch(code){
            case 1:
                return ResponseEntity.created(null).body("Created!");

            case 2:
                return ResponseEntity.badRequest().body("Bad Request!");

            default:
                return ResponseEntity.ok("OK!");
        }
    }

    @PostMapping("/quiz")
    public ResponseEntity<String> quiz2(@RequestBody Code code){

        switch(code.value()){
            case 1:
                return ResponseEntity.status(403).body("Forbidden!");
            default:
                return ResponseEntity.ok("OK!");
        }
    }
}

record Code(int value) { } //매핑할 객체로 사용하기 위해 선언한 레코드
