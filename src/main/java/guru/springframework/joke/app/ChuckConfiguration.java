package guru.springframework.joke.app;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Created by jt on 5/25/17.
 */
@Configuration
public class ChuckConfiguration implements ApplicationListener<ContextRefreshedEvent>{

  @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }

@Override
public void onApplicationEvent(ContextRefreshedEvent arg0) {
	chuckNorrisQuotes();
	
}

}