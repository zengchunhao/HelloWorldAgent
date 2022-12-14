package com.zh.agent;

import java.lang.instrument.Instrumentation;

public class HelloWorldAgent {
    public static void premain(String agentArgs, Instrumentation instrumentation) {
        System.out.println("Hello World " + agentArgs);
    }
}
