package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("Данные ФИО сотрудника для заполнения отчета  - " + fullName.toUpperCase());
        System.out.println("Данные ФИО сотрудника для административного отдела  - " + fullName.replace(" ",";"));
//        String firstName1 = "Семён";
//        String middleName1 = "Семёнович";
//        fullName = lastName +" " + firstName1 + " " + middleName1;
        System.out.println("ФИО сотрудника - " + fullName.replace("ё","е"));
        fullName = fullName.replace(" ", " - ");
        System.out.println(fullName);
        lastName = fullName.substring(0,fullName.indexOf("-"));
//        int index = fullName.indexOf("-");
//        int index1 = fullName.lastIndexOf("-");
//        System.out.println(index1);
        firstName = fullName.substring(fullName.indexOf("-") + 1, fullName.lastIndexOf("-"));
        middleName = fullName.substring(fullName.lastIndexOf("-") + 1, fullName.length());
        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Отчество сотрудника - " + middleName);
        //Задача 6
        fullName = fullName.replace(" -","");
        fullName = fullName.toLowerCase();
        System.out.println(fullName);
        lastName = fullName.substring(0,fullName.indexOf(" "));
        firstName = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" "));
        middleName = fullName.substring(fullName.lastIndexOf(" ") + 1, fullName.length());
        fullName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1, lastName.length());
        fullName = fullName + " " + firstName.substring(0, 1).toUpperCase() + firstName.substring(1, firstName.length());
        fullName = fullName + " " + middleName.substring(0, 1).toUpperCase() + middleName.substring(1, middleName.length());
        System.out.println(fullName);
        //Задача 7
        String str1 = "135";
        String str2 = "246";
        StringBuilder str = new StringBuilder();
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            str.append(c1[i]);
            str.append(c2[i]);
           }
        System.out.println(str);

//     Задача 8
        String stroka = "abccddefgghiiijjk";
        StringBuilder sb = new StringBuilder();
        char[]  st = stroka.toCharArray();
        sb.append(st[0]);
        for (int i = 1; i < st.length; i++) {
            if (st[i-1] != st[i])
                sb.append(st[i]);
            }
        System.out.println(sb);

        // write your code here
    }
}
