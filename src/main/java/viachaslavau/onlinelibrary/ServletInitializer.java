package viachaslavau.onlinelibrary;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy // включаем использование AspectJ
public class ServletInitializer extends SpringBootServletInitializer {

}
