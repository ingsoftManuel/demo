package co.edu.co.spring.demo.service;

import org.apache.coyote.BadRequestException;

import java.util.List;

public interface IService <T>{
    List<T> listAll();
    void remover(Long id);
    T add(T user);
    T getById(Long id) throws BadRequestException;
}
