package provider;

import com.abc.service.SomeServer;

public class SomeServiceImpl implements SomeServer {

    @Override
    public String Helle(String name) {
        System.out.println(name+"我是提供者");
        return "hello dubbo world!"+name;
    }
}
