package TestDemo.Service;

import org.springframework.stereotype.Service;

/**
 * Created by lyh on 17-5-3.
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello "+word+" !";
    }
}
