package com.qa.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BookingQa.class, formTestTwo.class, FormTestThree.class, FormTestFinish.class })
public class AllTests {

}
