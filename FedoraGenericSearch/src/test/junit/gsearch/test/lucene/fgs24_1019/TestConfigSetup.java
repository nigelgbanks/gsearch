//$Id:  $
package gsearch.test.lucene.fgs24_1019;

import junit.framework.Test;

public class TestConfigSetup
        extends junit.extensions.TestSetup {

    public TestConfigSetup(Test test) {
        super(test);
    }

    @Override
    public void setUp() throws Exception {
        System.out.println("setUp configTestOnLuceneFgs24_1019");
        System.setProperty("fedoragsearch.fgsUserName", "fgsTester");
        System.setProperty("fedoragsearch.fgsPassword", "fgsTesterPassword");
    }

    @Override
    public void tearDown() throws Exception {
        System.out.println("tearDown configTestOnLuceneFgs24_1019");
    }
}
