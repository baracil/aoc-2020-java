package perococco.aoc.day18;

import lombok.NonNull;
import perococco.aoc.input.Converter;
import perococco.aoc.input.SmartSolver;

import java.util.stream.Stream;

public abstract class Day18Solver extends SmartSolver<Stream<String>,Object> {

    @Override
    protected @NonNull Converter<Stream<String>> getConverter() {
        return s -> s;
    }
}
