package ru.cooper.big_O;

public class Exponential {


    /**
     * Выполняет цикл {@code 2^n} раз, моделируя поведение алгоритма с экспоненциальной сложностью — O(2^n).
     * <p>
     * Метод также измеряет и выводит время выполнения в миллисекундах с точностью до 6 знаков.
     * <p>
     * Пример:
     * <pre>{@code
     *     exponential(10); // Вывод: exponential: 1 Time: 3,334000 ms
     * }</pre>
     *
     * @param n показатель степени, определяющий количество итераций (2^n)
     * @return общее количество итераций
     */
    public static int exponential(int n) {
        long start = System.nanoTime();

        int k = 0;
         int limit = (int) Math.pow(2, n);
        for (int i = 0; i < limit; i++) {
            k =+ 1;
        }

        long end = System.nanoTime();
        double runTimeMs = (end - start) / 1_000_000.0;

        System.out.printf("exponential: %d Time: %.6f ms%n", k, runTimeMs);

        return k;
    }

    public static void main(String[] args) {
        exponential(1_000_000); // Пример вызова
    }
}
