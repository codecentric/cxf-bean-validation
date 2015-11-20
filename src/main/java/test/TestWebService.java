package test;

import javax.jws.WebService;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlElement;

@WebService
public interface TestWebService {

    public TestDTO getTestDTO(
            @Pattern(regexp = "mypattern") @XmlElement(name = "testId", required = true, nillable = false) String testId);

    public void doTest(@XmlElement(name = "testInput", required = true, nillable = false) TestDTO testInput);

}
