package day33_LocalDataTime;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class times {

    public static void main(String[] args) {
        LocalTime t1 = LocalTime.of(15, 45, 55);

        System.out.println(t1);

        LocalTime t2 = LocalTime.now();
        System.out.println(t2);


        LocalDateTime t3 = LocalDateTime.of(2020, 01, 05, 15, 25);

        System.out.println(t3);

        LocalDateTime.now();
        System.out.println(LocalDateTime.now());


    }


}
