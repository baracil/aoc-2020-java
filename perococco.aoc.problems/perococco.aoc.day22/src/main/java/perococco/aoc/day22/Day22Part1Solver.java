package perococco.aoc.day22;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.day22.structures.CrabCombatRules;
import perococco.aoc.day22.structures.GameRules;

public class Day22Part1Solver extends Day22Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day22Part1Solver().createProblem();
    }

    @Override
    protected @NonNull GameRules getGameRules() {
        return new CrabCombatRules();
    }
}
