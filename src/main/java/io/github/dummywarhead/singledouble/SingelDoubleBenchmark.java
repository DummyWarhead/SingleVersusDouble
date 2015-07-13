package io.github.dummywarhead.singledouble;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;


@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@State(Scope.Benchmark)
public class SingelDoubleBenchmark {

    final static String greeting = "Hello";

    String name = "World";

    private static String singleQuoteAppend(String name) {
        return greeting + ',' + name;
    }

    private static String doubleQuoteAppend(String name) {
        return greeting + "," + name;
    }

    @Benchmark
    public void singleQuote() {
        singleQuoteAppend(name);
    }

    @Benchmark
    public void doubleQuote() {
        doubleQuoteAppend(name);
    }


}
