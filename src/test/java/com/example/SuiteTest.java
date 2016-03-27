package com.example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by libin on 3/27/16.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CommandHelloWorldTest.class,
        CommandWithFallbackTest.class,
        HystrixApplicationTests.class
})
public class SuiteTest {
}
