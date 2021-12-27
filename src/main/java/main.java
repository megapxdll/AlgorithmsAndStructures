import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class main {

        /*
                1) Поиск элемента массива с известным индексом: O(1)
                2) Дублирование одномерного массива через foreach: O(n)
                3) Удаление элемента массива с известным индексом без сдвига: O(1)
                4) Удаление элемента массива с неизвестным индексом без сдвига: O(n)
                5) Удаление элемента массива с неизвестным индексом со сдвига: n*(n-1)

         */
        public static void main(String[] args) {
                int n = 3;

                System.out.println(factorial(BigInteger.valueOf(50)));
        }

        public void task_A(int n) { // O(n*log(n))
                List<Integer> arrayList = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                        for (int j = 1; j < n; j *= 2) {
                                arrayList.add(i * j);
                        }
                }
                System.out.println(arrayList);
        }

        public void task_B(int n) { //O(n^2)
                List<Integer> arrayList = new ArrayList<>();
                for (int i = 0; i < n; i += 2) {
                        for (int j = i; j < n; j++) {
                                arrayList.add(i * j);
                        }
                }
                System.out.println(arrayList);
        }

        public void task_C(int n) { // O(n^2)
                List<Integer> arrayList = new ArrayList<>();
                for (int i = 0; i < n; i ++) {
                        for (int j = 0; j < n; j++) {
                                arrayList.add(i * j);
                                n--;
                        }
                }
                System.out.println(arrayList);
        }

        public static BigInteger factorial(BigInteger n) { // O(n!)
                if (n.equals(BigInteger.ONE)) {
                        return n;
                }
                return n.multiply(factorial(n.subtract(BigInteger.valueOf(1))));
        }

        public static BigInteger fib(BigInteger n) { //O(2^n)
                if (n.equals(BigInteger.ONE)) {
                        return BigInteger.ONE;
                }
                if (n.equals(BigInteger.TWO)) {
                        return BigInteger.ONE;
                }

                return fib(n.subtract(BigInteger.ONE)).add(fib(n.subtract(BigInteger.TWO)));
        }
}