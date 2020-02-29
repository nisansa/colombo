package com.nisansa.sample;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        students.add("Saman");
        students.add("Nimal");
        students.add("Aamal");
        students.add("Ruwan");
        students.add("Isuri");
        students.add("Amani");
        System.out.println(students);

        List<String> filtereddata = students.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
        System.out.println(filtereddata);

        List<sensor> sensors = new ArrayList<>();

        sensor sensor1 = new sensor("Living room", 28);
        sensors.add(sensor1);
        sensor sensor2 = new sensor("Office room", 26);
        sensors.add(sensor2);
        sensor sensor3 = new sensor("Bed room", 29);
        sensors.add(sensor3);
        sensor sensor4 = new sensor(" Kichen room", 30);
        sensors.add(sensor4);
        sensor sensor5 = new sensor(" Bath room", 25);
        sensors.add(sensor5);

        List<sensor> hotsensors = sensors.stream()
                .filter(sensor -> sensor.getValue() > 28)
                .collect(Collectors.toList());

        System.out.println(hotsensors);
    }
}

















