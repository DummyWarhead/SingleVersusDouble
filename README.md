# Single versus Double Quote

## Benchmark objective

Find out if there is a difference in performance between the appending a character 
versus appending a single-character string.

Example for single-quote:
```java
greeting + ',' + name;
```

Example for double-quote:
```java
greeting + "," + name;
```

## Results

```
Result "doubleQuote":
  53.968 ±(99.9%) 0.183 ns/op [Average]
  (min, avg, max) = (53.369, 53.968, 54.813), stdev = 0.370
  CI (99.9%): [53.785, 54.151] (assumes normal distribution)


Result "singleQuote":
  54.027 ±(99.9%) 0.242 ns/op [Average]
  (min, avg, max) = (53.115, 54.027, 55.619), stdev = 0.490
  CI (99.9%): [53.785, 54.269] (assumes normal distribution)


# Run complete. Total time: 00:07:03

Benchmark                          Mode  Cnt   Score   Error  Units
SingelDoubleBenchmark.doubleQuote  avgt   50  53.968 ± 0.183  ns/op
SingelDoubleBenchmark.singleQuote  avgt   50  54.027 ± 0.242  ns/op

```

## Interpretation

Either the benchmark is wrong, or there may not be any performance difference.

