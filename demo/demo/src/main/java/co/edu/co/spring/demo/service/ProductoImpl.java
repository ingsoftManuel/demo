package co.edu.co.spring.demo.service;
import co.edu.co.spring.demo.domain.model.Product;
import co.edu.co.spring.demo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoImpl implements IService<Product>{

   @Autowired
   ProductoRepository productoRepository;
    @Override
    public List<Product> listAll() {
        return productoRepository.findAll();
    }

    @Override
    public void remover(Long id) {
        productoRepository.deleteById(id);
    }

    @Override
    public Product add(Product user) {
        return productoRepository.save(user);
    }

    @Override
    public Product getById(Long id) {
        return productoRepository.findById(id).orElseThrow();
    }
}
