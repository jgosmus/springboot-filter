package net.way2code.filters;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MainController {

    @GetMapping
    public void test() {
        log.info("Print from Controller");
    }

    @GetMapping("/users")
    public void users() {
        log.info("Print from UsersController");
    }
}
