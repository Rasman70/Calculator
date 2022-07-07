import java.util.Scanner;
public class Main {
       public static void main(String[] args) {
           while (true) {
               int vote = 0; // результат вычислений
               int rom=2; // флаг римских цифр:
               int a=0, b=0;
        //System.out.println("beginning...");
        Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();
            //sc.close();
            String[] masStr = str.split(" "); //разбиваем строку на массив строк
            for (int i = 0; i <= 2; i = i + 2) {
                try {
                    switch (masStr[i]) { //читаем римские числа и в строку их
                        case "I":
                            masStr[i] = "1";
                            break;
                        case "II":
                            masStr[i] = "2";
                            break;
                        case "III":
                            masStr[i] = "3";
                            break;
                        case "IV":
                            masStr[i] = "4";
                            break;
                        case "V":
                            masStr[i] = "5";
                            break;
                        case "VI":
                            masStr[i] = "6";
                            break;
                        case "VII":
                            masStr[i] = "7";
                            break;
                        case "VIII":
                            masStr[i] = "8";
                            break;
                        case "IX":
                            masStr[i] = "9";
                            break;
                        case "X":
                            masStr[i] = "10";
                            break;
                        default:
                            --rom;
                            break;
                    }
                }
                catch (ArrayIndexOutOfBoundsException e) { //Это исключение возникает, когда индекс либо отрицательный, либо больше или равен размеру массива.
                    System.out.println("erro: введиде данные корректно a + b");
                    System.exit(0);
                }
            }
            try {
                 a = Integer.parseInt(masStr[0]); //преобразуем первую строкувую переменную в int a
                 b = Integer.parseInt(masStr[2]); //преобразуем вторую строковую переменную в int b
            } catch (NumberFormatException e) {   //сключение – когда не может преобразовать строку в тип числа
                System.out.println("erro: введены не корректные данные");
                System.exit(0);
            }
            String operations = masStr[1];
            if (a > 10 || b > 10) {
                System.out.println("erro: аргумент больше 10");
                System.exit(0);
            }
            switch (operations) {
                case "+":
                    vote = a + b;
                    break;
                case "-":
                    vote = a - b;
                    break;
                case "*":
                    vote = a * b;
                    break;
                case "/":
                    try {
                        vote = a / b;
                        break;
                    } catch (ArithmeticException e) {
                        System.out.println(e +" erro: деление на 0");
                        System.exit(0);
                    }
                default:
                    System.out.println("erro: неверный арифметический знак");
                    System.exit(0);
            }
               switch (rom) {
                   case 0:
                       System.out.println(vote);
                       break;
                   case 1:
                       System.out.println("erro: разные системы исчисления");
                       System.exit(0);
                       break;
                   case 2: // здесь обрабатываются римские числа
                       if (vote <= 0) {
                           System.out.println("erro: в римской системе исчисления нет отрицательных чиcел");
                           System.exit(0);
                       }
                       if (vote==100) System.out.print("C");
                       if (vote>=90&&vote<100) System.out.print("XC");
                       if (vote>=80&&vote<90) System.out.print("LXXX");
                       if (vote>=70&&vote<80) System.out.print("LXX");
                       if (vote>=60&&vote<70) System.out.print("LX");
                       if (vote>=50&&vote<60) System.out.print("L");
                       if (vote>=40&&vote<50) System.out.print("XL");
                       if (vote>=30&&vote<50) System.out.print("XXX");
                       if (vote>=20&&vote<30) System.out.print("XX");
                       if (vote>=10&&vote<20) System.out.print("X");
                       if (vote>10) vote =vote%10; // добавляем единички
String out = switch (vote) {
    case 1 -> "I";
    case 2 -> "II";
    case 3 -> "III";
    case 4 -> "IV";
    case 5 -> "V";
    case 6 -> "VI";
    case 7 -> "VII";
    case 8 -> "VIII";
    case 9 -> "IX"; // римское число 10 выше в if
    default ->"";
   };
   System.out.println(out);
}
               }
        }
    }



