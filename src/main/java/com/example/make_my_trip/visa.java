import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class visa {
    public visa() {
    }

    @GetMapping({"/visa"})
    public String getData() {
        return "Get Visa for 20 days";
    }
}
