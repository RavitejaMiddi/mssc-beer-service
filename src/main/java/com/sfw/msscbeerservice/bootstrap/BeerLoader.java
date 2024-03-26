package com.sfw.msscbeerservice.bootstrap;

import com.sfw.msscbeerservice.domain.Beer;
import com.sfw.msscbeerservice.repository.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        beerObjectLoader();
    }

    private void beerObjectLoader() {
        if(beerRepository.count() == 0){
            beerRepository.save(Beer.builder()
                    .beerName("Galaxy")
                    .beerStyle("PALE_ALE")
                    .upc(12345678l)
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .price(new BigDecimal("12.33"))
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("Mango Bobs")
                    .beerStyle("IPA")
                    .upc(2638292291L)
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .price(new BigDecimal("11.08"))
                    .build());
        }
        System.out.println(beerRepository.count());
    }
}
