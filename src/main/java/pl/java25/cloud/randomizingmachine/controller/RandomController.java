package pl.java25.cloud.randomizingmachine.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomController {

    @Value("${random.words}")
    private String[] words;

    @Value("${random.numbers}")
    private String[] numbers;

    Random rnd = new Random();

    @GetMapping("/word")
    public String randomWord() {
        return words[rnd.nextInt()];
    }

    @GetMapping("/number")
    public String randomNumber() {
        return numbers[rnd.nextInt()];
    }
}
