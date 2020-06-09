package com.study.d22.invoke;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAnyDemo {

    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newCachedThreadPool();
        Collection<Callable<String>> list = new ArrayList<>();
        list.add(new Food());
        list.add(new Drink());
        list.add(new Sidedish());
        String data = service.invokeAny(list);
        System.out.println(data);
        service.shutdown();
    }
}
