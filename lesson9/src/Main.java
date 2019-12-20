public class Main {
    public static void main(String[] args) {
        /*int a = 10;
        a = a/0;*/
        int index = 2;
        int[] a = new int[3];
        try {
            // помещаем код который может вызвать исключения

            a[2] = 17;
            index = index / 0;
            System.out.println("Эта надпись не должна отобразится");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Что - то пошло не так");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Деление на ноль");
        }
        System.out.println("Я не вылетела");

        // обработка и генерация пользовательских исключений
        try {
            // throw генерирует исключения
            throw new MyException();
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println(e.timestamp);

        }

        // порядок кетчей имеет значение
        // класс Exception и Throwable всегда находятся ниже чем пользавательские значения
        // если среди кетчей присутствует класс Exception или Throwable то этот кетч
        // сработает в случае если не сработал ни один из пользовательских классов - исключений
        try {
            test();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
        }

        // игра в угадай число
        Game game = new Game();
        game.start();
    }

        public static void test () throws MyException, RuntimeException {
            getMoney(-100);
        }

        public static void getMoney ( int money)throws MyException, RuntimeException {
            if (money <= 0 || money > 1000) {
                throw new MyException();
            }
            System.out.println("деньги сняты");
            throw new RuntimeException();
        }
    }