import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        for (; ; ) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Вас приветствует модифицированая таблица Менделеева!\n");
            System.out.print("Выберите элемет про который вы хотите узнать: ");
            String el = scan.nextLine();
            switch (el) {
                case "H":
                    name("Водород");
                    group(1);
                    val("1");
                    num(1);
                    mas(1.00794);
                    met("Нет\n");
                    break;
                case "He":
                    name("Гелий");
                    group(8);
                    val("0");
                    num(2);
                    mas(4.00260);
                    met("Нет\n");
                    break;
                case "Li":
                    name("Литий");
                    group(1);
                    val("1");
                    num(3);
                    mas(6.94);
                    met("Да\n");
                    break;
                case "Be":
                    name("Берилий");
                    group(2);
                    val("1");
                    num(4);
                    mas(9.01218);
                    met("Да\n");
                    break;
                case "B":
                    name("Бор");
                    group(3);
                    val("3");
                    num(5);
                    mas(10.81);
                    met("Нет\n");
                    break;
                case "C":
                    name("Углерод");
                    group(4);
                    val("4, 2");
                    num(6);
                    mas(12.011);
                    met("Нет\n");
                    break;
                case "N":
                    name("Азот");
                    group(5);
                    val("1, 2, 3, 4");
                    num(7);
                    mas(14.0067);
                    met("Нет\n");
                    break;
                case "O":
                case "F":
                case "Ne":
                case "Na":
                case "Mg":
                case "Al":
                case "Si":
                case "P":
                case "S":
                case "Cl":
                case "Ar":
                case "K":
                case "Ca":
                case "Sc":
                case "Ti":
                case "V":
                case "Cr":
                case "Mn":
                case "Fe":
                case "Co":
                case "Ni":
                case "Cu":
                case "Zn":
                case "Ga":
                case "Ge":
                case "As":
                case "Se":
                case "Br":
                case "Kr":
                case "Rb":
                case "Sr":
                case "Y":
                case "Zr":
                case "Nb":
                case "Mo":
                case "Tc":
                case "Ru":
                case "Rh":
                case "Pd":
                case "Ag":
                case "Cd":
                case "In":
                case "Sn":
                case "Sb":
                case "Te":
                case "I":
                case "Xe":
                case "Cs":
                case "Ba":
                case "La":
                case "Hf":
                case "Ta":
                case "W":
                case "Re":
                case "Os":
                case "Ir":
                case "Pt":
                case "Au":
                case "Hg":
                case "Tl":
                case "Pb":
                case "Bi":
                case "Po":
                case "At":
                case "Rn":
                case "Fr":
                case "Ra":
                case "Ac":
                case "Ku":
                case "Ns":
                default:
                    System.out.println("Извините, что-то пошло не так, скорее всего вы указали неправильный регистр.\n");
            }
         }
    }
    public static void val(String arg) {
        System.out.println("Валентность: " + arg);
    }
    public static void num(Integer arg) {
        System.out.println("Номер по порядку: " + arg);
    }
    public static void mas(Double arg) {
        System.out.println("Атомная масса: " + arg);
    }
    public static void met(String arg) {
        System.out.println("Метал: " + arg);
    }
    public static void name(String arg) {
        System.out.println("\nНазвание: " + arg);
    }
    public static void group(Integer arg) {
        System.out.println("Группа: " + arg);
    }
}
