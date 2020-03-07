package fii.practic.yonder.demo.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {


    private Map <Integer, String> map = new HashMap<>();
private Integer id = 0;



    @Override
    public String getTestMessage() {
        return "Helloo from Servicd layer";
    }

    @Override
    public String getAll() {
        return map.toString();
    }

    @Override
    public void save (String  name) {
        map.put(1, name);
        id++;
    }

    @Override
    public void update(Integer id, String newValue) {

        map.put(id, newValue);

    }

    @Override
    public void delete( Integer id) {
        map.remove(id);

    }





}
