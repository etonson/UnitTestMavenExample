package lab;


import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;


import java.io.PrintWriter;

/*
    @author : Eton.lin
    @description TODO
    @date 2025-01-21 下午 11:15
*/
public class RunTest {
    SummaryGeneratingListener listener = new SummaryGeneratingListener();
    private void testSelectClass() {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder
                .request()
                .selectors(DiscoverySelectors.selectClass(CaculatorTest.class))
                .build();
        Launcher launcher = LauncherFactory.create();
        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);
    }

    private void testSelectPackage() {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder
                .request()
                .selectors(DiscoverySelectors.selectPackage("lab"))
                .build();
        Launcher launcher = LauncherFactory.create();
        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);
    }

    public static void main(String[] args) {
        RunTest runTest = new RunTest();
        TestExecutionSummary summary ;

        System.out.println("Starting test Class");
        runTest.testSelectClass();
        summary = runTest.listener.getSummary();
        summary.printTo(new PrintWriter(System.out));

        System.out.println("Starting test Package");
        runTest.testSelectPackage();
        summary = runTest.listener.getSummary();
        summary.printTo(new PrintWriter(System.out));
    }
}
