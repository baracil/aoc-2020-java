package perococco.aoc.day24;

import lombok.NonNull;
import perococco.aoc.input.Converter;
import perococco.aoc.input.SmartSolver;
import perococco.aoc.api.AOCProblem;

import java.util.stream.Stream;

public class Day24Part2Solver extends SmartSolver<Stream<String>,Object> {

    public static @NonNull AOCProblem<?> provider() {
        return new Day24Part2Solver().createProblem().skipped();
    }

    @Override
    protected @NonNull Converter<Stream<String>> getConverter() {
        return s -> s;
    }

    @Override
    public @NonNull Object solve(@NonNull Stream<String> input) {
        throw new RuntimeException("NOT IMPLEMENTED");
    }
}
