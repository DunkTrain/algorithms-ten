package ru.cooper.big_O;

public class Logarithmic {

    /**
     * Вычисляет, сколько раз заданное целое число {@code n} можно целочисленно разделить на 2,
     * пока оно не станет равным нулю. Таким образом демонстрируется поведение алгоритма
     * с логарифмической сложностью — O(log n).
     * <p>
     * Метод также измеряет и выводит время выполнения в миллисекундах (с точностью до 6 знаков после запятой).
     * <p>
     * Пример:
     * <pre>{@code
     *     logarithmic(1_000_000); // Вывод: logarithmic: 20 Time: 0,000900 ms
     * }</pre>
     *
     * @param n входное число, которое будет делиться на 2 до достижения 0
     * @return количество итераций деления (приблизительно log₂(n) + 1)
     */
    public static int logarithmic(int n) {
        long start = System.nanoTime();

        int k = 0;
        while(n > 0) {
            n = n / 2;
            k += 1;
        }

        long end = System.nanoTime();
        double runTimeMs = (end - start) / 1_000_000.0;

        System.out.printf("logarithmic: %d Time: %.6f ms%n", k, runTimeMs);
        return k;
    }

    public static void main(String[] args) {
        logarithmic(1_000_000); // Пример вызова
    }
}
