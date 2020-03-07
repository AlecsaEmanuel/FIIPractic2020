package fii.practic.yonder.demo.service;

import fii.practic.yonder.demo.service.TestServiceImpl;
import org.springframework.stereotype.Service;


public interface TestService   {




    String getTestMessage() ;

    String getAll();

    void save(String name);

    void update (Integer id, String newValue);

    void delete(Integer id);



}