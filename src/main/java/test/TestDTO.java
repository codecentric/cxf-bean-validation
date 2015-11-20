package test;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class TestDTO {

    @Min(100)
    private int number;

    @Pattern(regexp = "mypattern")
    private String patternCheck;

    @Size(max = 100)
    private String lengthCheck;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPatternCheck() {
        return patternCheck;
    }

    public void setPatternCheck(String patternCheck) {
        this.patternCheck = patternCheck;
    }

    public String getLengthCheck() {
        return lengthCheck;
    }

    public void setLengthCheck(String lengthCheck) {
        this.lengthCheck = lengthCheck;
    }

}
