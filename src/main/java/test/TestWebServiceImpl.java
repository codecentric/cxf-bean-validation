package test;

import javax.jws.WebService;

@WebService(endpointInterface = "test.TestWebService")
public class TestWebServiceImpl implements TestWebService {

    public TestDTO getTestDTO(String testId) {
        // TODO Auto-generated method stub
        return null;
    }

    public void doTest(TestDTO testInput) {
        // TODO Auto-generated method stub

    }

}
