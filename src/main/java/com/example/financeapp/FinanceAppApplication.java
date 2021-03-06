package com.example.financeapp;

import com.example.financeapp.modules.share.Share;
import com.example.financeapp.modules.share.ShareRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FinanceAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinanceAppApplication.class, args);
    }

    @Bean
    CommandLineRunner init(ShareRepository shareRepository
    ) {
        return args -> {
            Share s1 = new Share("SAP", "test", 133);
            shareRepository.save(s1);
        };
    }
}
