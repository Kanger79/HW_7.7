import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import java.util.Arrays;

public class StatsServiceTest {

    @Test
    public void shouldCalcSumArray() {
        StatsService service = new StatsService();

        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,};

        int expectedSum = 12;
        int actualSum = StatsService.sumArray(array);

        Assertions.assertArrayEquals(new int[]{expectedSum}, new int[]{actualSum});
        System.out.println("Метод-1 - Сумма. В массиве " + Arrays.toString(array) + " сумма всех чисел массива равна " + actualSum);
    }

    @Test
    public void shouldCalcMidleSumArray() {
        StatsService service = new StatsService();

        int[] array = {2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7,};

        double expectedSum = 4.5;
        double actualSum = StatsService.midleSumArray(array);

        Assertions.assertArrayEquals(new double[]{expectedSum}, new double[]{actualSum});
        System.out.println("Метод-2 - Средняя сумма. Средняя сумма всех чисел массива " + Arrays.toString(array) + " равна " + actualSum);
    }

    @Test
    public void shouldShowMaxMonthArray() {
        StatsService service = new StatsService();

        int[] array = {1, 2, 3, 2, 5, 2, 23, 2, 4, 2, 2, 2,};

        int expectedSum = 7;
        int actualSum = StatsService.maxSaleMonth(array);

        Assertions.assertArrayEquals(new int[]{expectedSum}, new int[]{actualSum});
        System.out.println("Метод-3 - Максимальное число в массиве. Номер месяца с пиком продаж из массива " + Arrays.toString(array) + ") равен " + actualSum);
    }

    @Test
    public void shouldShowMinMonthArray() {
        StatsService service = new StatsService();

        int[] array = {4, 2, 3, 2, 5, 1, 23, 2, 4, 3, 2, 2,};

        int expectedSum = 6;
        int actualSum = StatsService.minSaleMonth(array);

        Assertions.assertArrayEquals(new int[]{expectedSum}, new int[]{actualSum});
        System.out.println("Метод-4 - Минимальное число в массиве. Номер месяца с минимальными продажами из массива " + Arrays.toString(array) + ") равен " + actualSum);
    }

    @Test
    public void shouldShowLessMidleSumArray() {
        StatsService service = new StatsService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 5;
        int actualSum = StatsService.lessMidleSumArray(array);

        Assertions.assertArrayEquals(new int[]{expectedSum}, new int[]{actualSum});
        System.out.println("Метод-5 - Количество чисел ниже среднего в массиве. Количество месяцев с продажами ниже среднего из массива " + Arrays.toString(array) + ") равно " + actualSum);
    }

    @Test
    public void shouldShowMoreMidleSumArray() {
        StatsService service = new StatsService();

        int[] array = {8, 16, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 6;
        int actualSum = StatsService.moreMidleSumArray(array);

        Assertions.assertArrayEquals(new int[]{expectedSum}, new int[]{actualSum});
        System.out.println("Метод-6 - Количество чисел выше среднего в массиве. Количество месяцев с продажами выше среднего из массива " + Arrays.toString(array) + ") равно " + actualSum);
    }

}
