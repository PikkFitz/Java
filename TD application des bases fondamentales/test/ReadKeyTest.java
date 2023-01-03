import tools.TransCoder;
import model.Message;
import org.apache.commons.lang3.StringUtils;
import org.germain.tool.ManaBox;
import org.junit.Assert;
import org.junit.Test;


public class ReadKeyTest
{
    @Test
    public void readKeyTest()
    {
        // La clé cryptée donnée plus haut
        String keyCrypted = "6Qe0IsEEH1utWRe7UKzGMiDTytOB3HS1dEfIB4imna3IRHXHRn5ZrvKFEcPjmPgKYGuytG+gDAl1m2DdHalJQg==";
        // La clé décryptée que nous devrions obtenir
        String keyDecrypted = "CFfrkowl.aDzyS:eHjsGPZgMApWvRYVmtnK!BuU IQiEXTxbqhLdNJO,'c";
        // le test d'égalité entre la clé attendue et la sortie de la méthode de la librairie. Si le décryptage ne fonctionne pas nous aurons le message définit ici
        Assert.assertEquals("La librairie de décryptage est mal installée",keyDecrypted, ManaBox.decrypt(keyCrypted));
    }

    @Test
    public void createMapTest()
    {
        String keyCrypted = "6lUjKOzUj4e/Gelw9c6sDLqHniwulClN6XSayZ+HRF/kbZx+CMf95jxrhm4YFSY26OnxVlsrzGkO00IMeAFs3g==";
        TransCoder transcoderTest = new TransCoder(keyCrypted);
        Assert.assertNotNull(transcoderTest.getEncode());
        System.out.println(transcoderTest.getEncode().toString());
        Assert.assertNotNull(transcoderTest.getDecode());
        System.out.println(transcoderTest.getDecode().toString());
    }

    @Test
    public void messageTest()
    {
        Message messageEncoded = new Message(true);
        Assert.assertNotNull(messageEncoded);
        messageEncoded.readNwrite();
        Message messageClear = new Message(false);
        Assert.assertNotNull(messageClear);
        messageClear.readNwrite();
    }

    @Test
    public void testLissage()
    {
        String phrase = "ça éteint les lumières";
        String lissage = StringUtils.stripAccents(phrase);
        System.out.println(lissage);
    }

}

