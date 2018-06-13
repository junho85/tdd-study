import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertThat(product.amount).isEqualTo(10);
        product = five.times(3);
        assertThat(product.amount).isEqualTo(15);
    }

    @Test
    public void testEquality() {
        assertThat(new Dollar(5)).isEqualTo(new Dollar(5));
        assertThat(new Dollar(5)).isNotEqualTo(new Dollar(6));
    }
}