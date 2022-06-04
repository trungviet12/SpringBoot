package com.example.demo.database;
import org.slf4j.Logger;
import com.example.demo.model.Product;
import com.example.demo.repositorie.ProductRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class database {
    private static final Logger logger = LoggerFactory.getLogger(database.class);
    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository) {

        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Product productA = new Product("Macbookair 15",2020,2400.0,"");
                Product productB = new Product("Ipadair Green",2020,400.0,"");
                logger.info("insert data:"+ productRepository.save(productA));
                logger.info("insert data:"+ productRepository.save(productB));
            }
        };
    }
}
