package org.ltejeda.productserivice.repository;

import org.ltejeda.productserivice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
