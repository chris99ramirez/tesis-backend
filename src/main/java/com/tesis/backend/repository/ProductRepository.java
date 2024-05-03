package com.tesis.backend.repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import com.tesis.backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p JOIN FETCH p.marca m JOIN FETCH p.categoria c JOIN FETCH p.unidad u ORDER BY p.nombre ASC")
    List<Product> findAllWithDetails();
}
