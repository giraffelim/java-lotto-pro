package step3.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class LottoNumberTest {
    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:false"}, delimiter = ':')
    void 동등성_비교(int number, boolean expectedResult) {
        assertThat(new LottoNumber(1).equals(new LottoNumber(number))).isEqualTo(expectedResult);
    }

    @Test
    void toString_호출시_숫자를_출력한다() {
        assertThat(new LottoNumber(1).toString()).isEqualTo("1");
    }

    @Test
    void 객체를_값을_통해_비교할_수_있다() {
        assertThat(new LottoNumber(2)).isGreaterThan(new LottoNumber(1));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 46})
    void 로또_숫자는_1부터_45사이의_수_이다(int number) {
        assertThatThrownBy(() -> new LottoNumber(number))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("로또 숫자의 범위는 1 ~ 45 이내여야 합니다.");
    }
}
