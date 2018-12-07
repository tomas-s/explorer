package worldexplorer.controller;

import java.util.concurrent.atomic.AtomicLong;

import dto.CountryDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @RequestMapping("/")
    public CountryDto greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new CountryDto("Slovakia", 5000000);
    }
}
