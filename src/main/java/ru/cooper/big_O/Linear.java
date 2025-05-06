package ru.cooper.big_O;

public class Linear {

    /**
     * Выполняет линейную итерацию от 0 до {@code n} и считает количество шагов.
     * Демонстрирует поведение алгоритма с линейной сложностью — O(n).
     * <p>
     * Метод также измеряет и выводит время выполнения в миллисекундах (с точностью до 6 знаков).
     * <p>
     * Пример:
     * <pre>{@code
     *     linear(1_000_000); // Вывод: liner: 1000000 Time: 3,154300 ms
     * }</pre>
     *
     * @param n количество итераций
     * @return количество выполненных шагов (равно {@code n})
     */
    public static int linear(int n) {
        long start = System.nanoTime();

        int k = 0;
        for (int i = 0; i < n; i++) {
            k += 1;
        }

        long end = System.nanoTime();
        double runTimeMs = (end - start) / 1_000_000.0;

        System.out.printf("liner: %d Time: %.6f ms%n", k, runTimeMs);
        return k;
    }

    public static void main(String[] args) {
        linear(1_000_000); // Пример вызова
    }
}
