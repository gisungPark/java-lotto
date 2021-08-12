package lotto.domain;

import java.util.List;
import java.util.Objects;

public class Lotto {

    private final List<Integer> numbers;

    public Lotto(final List<Integer> numbers) {
        this.numbers = numbers;
    }

    public boolean contains(final int number) {
        return numbers.contains(number);
    }

    public int countSameNumber(final Lotto lotto) {
        return (int) lotto.value().stream()
                .filter(number -> this.contains(number))
                .count();
    }

    public Rank findLottoRank(final Lotto win) {
        return Rank.findRank(win.countSameNumber(this));
    }

    public List<Integer> value() {
        return numbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lotto lotto = (Lotto) o;
        return Objects.equals(numbers, lotto.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbers);
    }

}
