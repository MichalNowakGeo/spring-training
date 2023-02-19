package pl.sda;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

@Setter @Getter
public class Worker implements InitializingBean, DisposableBean {

    private String name;

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy 2");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init 2");
    }
    @PostConstruct
    public void initPostConstruct() {
        System.out.println("Postconstruct");
    }
}