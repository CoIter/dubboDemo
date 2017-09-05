import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by maxsc on 2017/9/4.
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ( "provider.xml" );
        System.out.println (context.getDisplayName () + ": here");
        context.start ();
        System.out.println ("服务已启动...");
        System.in.read ();
    }
}
