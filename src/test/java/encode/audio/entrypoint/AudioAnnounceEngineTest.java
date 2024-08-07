package encode.audio.entrypoint;

import flux.AudioAnnounceTmlg;
import org.approvaltests.Approvals;
import org.approvaltests.reporters.DiffReporter;
import org.approvaltests.reporters.UseReporter;
import org.fest.assertions.api.Assertions;
import org.junit.Test;

@UseReporter(DiffReporter.class)
public class AudioAnnounceEngineTest {

    @Test
    public void dummyCoverageAudioEngineTest() throws Exception {
        // Given
        AudioAnnounceEngine audioAnnounceEngine = new AudioAnnounceEngine(new LocalHTTPSServer(), new LocalTmpFolder());
        AudioAnnounceTmlg mp3 = new AudioAnnounceTmlg("http://somehost/10.151.156.180Mon_Nov_04_140724_CET_2013343.mp3", "mp3", "10.151.156.180Mon_Nov_04_140724_CET_2013343.mp3");
        AudioDataObject audioConfigTmp = new AudioDataObject(".mp3");
        HttpDataObj httpConfigTmp = new HttpDataObj("./src/test/resources/", "http://localhost/get");

        // When
        String targetAudioFileMessage = audioAnnounceEngine.publishAudioFile(mp3, audioConfigTmp, httpConfigTmp);

        // Then
        Approvals.verify(targetAudioFileMessage);
    }
}
