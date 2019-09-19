public class triangleSequence {


    private final Integer number;


    public triangleSequence(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    //generate number
    public triangleSequence generate() {

        return new triangleSequence(number + 1);

    }
}

