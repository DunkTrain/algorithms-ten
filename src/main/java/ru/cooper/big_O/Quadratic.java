package ru.cooper.big_O;

public class Quadratic {

    /**
     * Выполняет двойной вложенный цикл от 0 до {@code n}, считая общее число итераций.
     * Демонстрирует поведение алгоритма с квадратичной сложностью — O(n²).
     * <p>
     * Метод также измеряет и выводит время выполнения в миллисекундах (с точностью до 6 знаков).
     * <p>
     * Пример:
     * <pre>{@code
     *     quadratic(1_000_000); // Вывод: quadratic: -727379968 Time: 13,708600 ms
     * }</pre>
     *
     * @param n размерность внешнего и внутреннего циклов
     * @return общее количество итераций (n * n)
     */
    public static int quadratic(int n) {
        long start = System.nanoTime();

        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                k += 1;
            }
        }

        long end = System.nanoTime();
        double runTimeMs = (end - start) / 1_000_000.0;

        System.out.printf("quadratic: %d Time: %.6f ms%n", k, runTimeMs);

        return k;
    }

    public static void main(String[] args) {
        quadratic(1_000_000); // Пример вызова
    }
}
