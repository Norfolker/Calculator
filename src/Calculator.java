import java.util.function.*;

public class Calculator {

    protected static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    // Немедленное завершение работы программы происходило, когда
    // в качестве аргумента подавался делитель 0.
    // Во избежание вылетов я обработал исключение с помощью try/catch
    BinaryOperator<Integer> devide = (x, y) -> {
       if (y != 0) {
           return x / y;
       } else {
           throw new ArithmeticException("Деление на ноль запрещено!");
       }
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;
    Predicate<Integer> isNegative = x -> x < 0;
    Predicate<Integer> isZero = x -> x == 0;

    Consumer<Integer> println = System.out::println;
}
