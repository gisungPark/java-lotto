package step2.domain;

import java.util.*;
import java.util.stream.Collectors;

public class LottoGames {

    public LottoGames() {
    }

    public int calculateBuyingTicketCount(int money, int manualLottoTicketCount) {
        money -= manualLottoTicketCount * LottoCommonValue.DEFAULT_LOTTO_PRICE.value();
        return new Integer(money / LottoCommonValue.DEFAULT_LOTTO_PRICE.value());
    }

    public List<LottoTicket> buyAutomaticLottoTickets(int gameCount) {
        List<LottoTicket> lottoTickets = new ArrayList<>(gameCount);
        for (int i = 0; i < gameCount; i++) {
            lottoTickets.add(createLottoGame());
        }
        return lottoTickets;
    }

    private LottoTicket createLottoGame() {
        List<LottoNo> lottoNumbers = RandomIntegersGenerator.createNumberList().stream()
                .map(i -> LottoNo.of(i))
                .collect(Collectors.toList());
        return new LottoTicket(lottoNumbers);
    }

    public Optional<LottoTicket> toLottoTicket(String[] splits) {
        Set<LottoNo> numbers = toSet(splits);
        if (numbers.size() != LottoCommonValue.DEFAULT_LOTTO_NUMBER_COUNT.value()) {
            return Optional.empty();
        }
        return Optional.ofNullable(new LottoTicket(numbers));
    }

    private String[] splitByDelimiter(String stringNumber) {
        stringNumber = stringNumber.replaceAll(" ", "");
        return stringNumber.split(",");
    }

    private Set<LottoNo> toSet(String[] numbers) {
        Set<LottoNo> hashSet = new HashSet<>();
        for (String number : numbers) {
            hashSet.add(LottoNo.of(toInt(number)));
        }
        return hashSet;
    }

    private Integer toInt(String element) {
        try {
            return Integer.parseInt(element);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(element + " : 유효한 정수 값이 아닙니다.");
        }
    }
}
