package perococco.aoc.day17;

import lombok.NonNull;
import perococco.aoc.common.ArrayOfChar;
import perococco.aoc.common.GameOfLife;
import perococco.aoc.input.Converter;
import perococco.aoc.input.SmartSolver;

public abstract class Day17Solver extends SmartSolver<ArrayOfChar, Integer> {

    @Override
    protected @NonNull Converter<ArrayOfChar> getConverter() {
        return Converter.TO_ARRAY_OF_CHAR;
    }

    protected abstract GameOfLife<?> createGameOfLife(@NonNull ArrayOfChar input);

    @Override
    public final @NonNull Integer solve(@NonNull ArrayOfChar input) {
        final var gameOfLife = createGameOfLife(input);
        gameOfLife.performCycles(6);
        return gameOfLife.numberOfActiveCells();
    }
}
