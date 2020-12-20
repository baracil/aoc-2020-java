package perococco.aoc.day19.structures;

import com.google.common.collect.ImmutableList;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import perococco.aoc.common.AOCException;

import java.util.Arrays;
import java.util.stream.IntStream;

@RequiredArgsConstructor
@ToString
public class Concatenation implements Rule {

    static @NonNull Concatenation parse(@NonNull String line) {
        try {
            final var ruleIds = Arrays.stream(line.trim().split(" "))
                                      .map(Integer::parseInt)
                                      .collect(ImmutableList.toImmutableList());
            return new Concatenation(ruleIds);
        } catch (Exception e) {
            throw new AOCException("This line is not a concatenation rule '" + line + "'");
        }
    }

    @Getter
    private final @NonNull ImmutableList<Integer> ruleIds;

    @Override
    public <I, O> @NonNull O accept(@NonNull RuleVisitor<I, O> visitor, @NonNull I parameter) {
        return visitor.visit(this, parameter);
    }

    public static @NonNull Concatenation concatenation(int...ruleIds) {
        return new Concatenation(IntStream.of(ruleIds).boxed().collect(ImmutableList.toImmutableList()));
    }

}
