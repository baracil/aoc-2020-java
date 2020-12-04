package perococco.aoc.day4;

import com.google.common.collect.ImmutableList;
import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.input.Converter;
import perococco.aoc.input.SmartSolver;

public class Day4Part2Solver extends SmartSolver<ImmutableList<Passport>,Long> {

    public static @NonNull AOCProblem<?> provider() {
        return new Day4Part2Solver().createProblem();
    }

    @Override
    protected @NonNull Converter<ImmutableList<Passport>> getConverter() {
        return Converter.ALL_LINES.andThen(PassportListBuilder::build);
    }

    @Override
    public @NonNull Long solve(@NonNull ImmutableList<Passport> passports) {
        final ValidityRule validityRule = new WithCIDOptionalAndValidValues();
        return passports.stream().filter(validityRule::isValid).count();
    }
}
