import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        System.out.println("Вас приветствует банкомат компании NewBank.");
        System.out.println("Для начала работы войдите в свой личный кабинет используя номер карты и пароль.");
        System.out.println("Введите номер карты (по 4 цифры в строку):");
        System.out.println("XXXX—XXXX—XXXX—XXXX");
        int b1 = 345;
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        System.out.println(i + "—XXXX—XXXX—XXXX");
        int i1 = s.nextInt();
        System.out.println(i + "—" + i1 + "—XXXX—XXXX");
        int i2 = s.nextInt();
        System.out.println(i + "—" + i1 + "—" + i2 + "—XXXX");
        int i3 = s.nextInt();
        System.out.println("Ваша карта: " + i + "—" + i1 + "—" + i2 + "—" + i3);
        System.out.println("Теперь введите пароль в формате XXXX: ");
        int p1 = s.nextInt();
        if (i == 6622 && i1 == 5577 && i2 == 8811 && i3 == 3399 && p1 == 8383) {
            System.out.println("Подождите, идёт проверка...");
            System.out.println("Всё верно, перенаправление в личный кабинет...");
            System.out.println("Для работы с банкоматом выберите предложенные услуги из списка: ");
            System.out.println("1. Снятие денег с карты.");
            System.out.println("2. Проверка баланса.");
            System.out.println("3. Пополнение баланса.");
            int c1 = s.nextInt();
            if (c1 == 2) {
                System.out.println("Баланс вышей карты составляет: " + b1 + "руб.");
            } else if (c1 == 1) {
                System.out.println("Ваш баланс составляет: " + b1 + "руб.");
                System.out.println("Для снятия средств с баланса карты введи желаемую сумму...");
                int m = s.nextInt();
                int res = b1 - m;
                System.out.println("Вы сняли со счета " + m + "руб. На данный момент состояние счета: " + res + "руб.");
            }
            }  else if (c1 == 3) {
                System.out.println("В поле для ввода введите желаемую сумму для пополнения: ");}
                int po1 = s.nextInt();
            if (po1>1000000) {
                System.out.println("Сумма слишком велика.");
            } else {
                int sum = b1 + po1;
                System.out.println("Средства зачисленны, ваш баланс: " sum);
            }

            if (b1 <= 0) {
                System.out.println("У вас недостаточно денег на счету.");
            }
        }
    }

