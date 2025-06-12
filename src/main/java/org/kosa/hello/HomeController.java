package org.kosa.hello;

import jakarta.servlet.ServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // SLF4J Logger 설정
    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    public String index(ServletRequest request) {
        log.info("server port = {}", request.getServerPort());
        return "Hesdsdsdsdsdsorld... " + request.getServerPort();
    }
}


