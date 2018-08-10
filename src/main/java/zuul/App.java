package zuul;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableZuulProxy
public class App {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

}
