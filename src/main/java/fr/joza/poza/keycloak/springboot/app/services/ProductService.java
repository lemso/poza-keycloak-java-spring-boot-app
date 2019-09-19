package fr.joza.poza.keycloak.springboot.app.services;

import fr.joza.poza.keycloak.springboot.app.modele.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {


    public List<Product> getProducts(){
        return Arrays.asList(
                new Product("id1","XXABC",120.00),
                new Product("id2","XXZER",130.00),
                new Product("id3","XXRFR",110.00),
                new Product("id4","XXTER",140.00)
        );
    }
}
