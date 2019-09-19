import java.util.stream.Stream;

public class TriangleSequenceLauncher {

    public static void main(String[] args) {
        Stream.iterate(new triangleSequence(0), triangleSequence -> triangleSequence.generate())
                .limit(10)
                .map(TriangleSequence -> (TriangleSequence.getNumber() + 1) * TriangleSequence.getNumber() / 2)
                .forEach(System.out::println);
    }

}