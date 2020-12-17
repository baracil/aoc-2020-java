package perococco.aoc.day17;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.ArrayOfChar;

public class Day17Part2Solver extends Day17Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day17Part2Solver().createProblem();
    }

    @Override
    protected GameOfLife<?> createGameOfLife(@NonNull ArrayOfChar input) {
        return GameOfLife.initializeIn4D(input);
    }
}
