package encode.audio.entrypoint;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.DiffReporter;
import org.approvaltests.reporters.UseReporter;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

@UseReporter(DiffReporter.class)
public class AudioAnnounceEngineTest {

    @Test
    public void checkJUnit() {
        Assert.assertTrue(true);
    }

    @Test
    public void checkApprovalTestsReporter() throws Exception {
        Approvals.verify("My diff reporter open a new window of my default diff tool. It works!");
    }
}
