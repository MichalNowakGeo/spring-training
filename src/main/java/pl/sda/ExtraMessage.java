package pl.sda;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ExtraMessage {

    private String text;

    public void init() {
        System.out.println("Inicjalizacja obiektu w springu");
    }

    public void destroy() {
        System.out.println("Destroy");
    }
}
