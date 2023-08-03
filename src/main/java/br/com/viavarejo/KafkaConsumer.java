package br.com.viavarejo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @KafkaListener(id = "foo", topics = "pedido")
    public void listen(String data) {
    	System.out.println("******************************");
        System.out.println(data);
        System.out.println("******************************");
    }
}
