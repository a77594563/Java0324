package com.study.d11.enums;

import java.util.stream.Stream;

public class RedEnvelopeDemo {
    public static void main(String[] args) {
        RedEnvelope re = RedEnvelope.雙親;
        System.out.println(re.getMoney());
        RedEnvelope[] res = {
            RedEnvelope.雙親,
            RedEnvelope.老婆,
            RedEnvelope.小孩    
        };
        // Java 7 以前的寫法
        int sum = 0;
        for(RedEnvelope r : res) {
            sum += r.getMoney();
        }
        System.out.println(sum);
        // Java 8
        int sum2 = Stream.of(res).mapToInt(r -> r.getMoney()).sum();
        System.out.println(sum2);
        int sum3 = Stream.of(res).mapToInt(RedEnvelope::getMoney).sum();
        System.out.println(sum3);
        
    }
}
