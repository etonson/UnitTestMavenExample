package lab.pacaages.JUnit5TestSuiteExample;


import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@SelectPackages({"lab.pacaages.packageA"
        , "lab.pacaages.packageB"})
@Suite
@SuiteDisplayName("A demo Test Suite")
public class JUnit5TestSuiteExample {

}