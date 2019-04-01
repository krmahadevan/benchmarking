## JMH Execution results

```
# Run complete. Total time: 00:50:22

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                                                Mode    Cnt   Score   Error   Units
MyBenchmark.testUsingForEach                            thrpt     25   0.173 ± 0.001  ops/ms
MyBenchmark.testUsingForLoop                            thrpt     25   0.107 ± 0.001  ops/ms
MyBenchmark.testUsingForEach                             avgt     25   5.806 ± 0.147   ms/op
MyBenchmark.testUsingForLoop                             avgt     25   9.445 ± 0.100   ms/op
MyBenchmark.testUsingForEach                           sample  43210   5.782 ± 0.011   ms/op
MyBenchmark.testUsingForEach:testUsingForEach·p0.00    sample          5.202           ms/op
MyBenchmark.testUsingForEach:testUsingForEach·p0.50    sample          5.489           ms/op
MyBenchmark.testUsingForEach:testUsingForEach·p0.90    sample          7.077           ms/op
MyBenchmark.testUsingForEach:testUsingForEach·p0.95    sample          7.471           ms/op
MyBenchmark.testUsingForEach:testUsingForEach·p0.99    sample          8.053           ms/op
MyBenchmark.testUsingForEach:testUsingForEach·p0.999   sample          9.208           ms/op
MyBenchmark.testUsingForEach:testUsingForEach·p0.9999  sample         10.925           ms/op
MyBenchmark.testUsingForEach:testUsingForEach·p1.00    sample         13.140           ms/op
MyBenchmark.testUsingForLoop                           sample  26145   9.558 ± 0.025   ms/op
MyBenchmark.testUsingForLoop:testUsingForLoop·p0.00    sample          8.585           ms/op
MyBenchmark.testUsingForLoop:testUsingForLoop·p0.50    sample          9.011           ms/op
MyBenchmark.testUsingForLoop:testUsingForLoop·p0.90    sample         11.436           ms/op
MyBenchmark.testUsingForLoop:testUsingForLoop·p0.95    sample         12.059           ms/op
MyBenchmark.testUsingForLoop:testUsingForLoop·p0.99    sample         13.582           ms/op
MyBenchmark.testUsingForLoop:testUsingForLoop·p0.999   sample         19.235           ms/op
MyBenchmark.testUsingForLoop:testUsingForLoop·p0.9999  sample         21.756           ms/op
MyBenchmark.testUsingForLoop:testUsingForLoop·p1.00    sample         24.052           ms/op
MyBenchmark.testUsingForEach                               ss      5  17.773 ± 2.269   ms/op
MyBenchmark.testUsingForLoop                               ss      5  31.274 ± 0.238   ms/op
```
