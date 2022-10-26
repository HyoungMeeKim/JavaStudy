package com.company;

import java.util.Scanner;

public class Main {

    static String[][] book = new String[100][2];
    static String[][] video = new String[100][2];

    static int bookIndex=0;
    static int videoIndex=0;

    public static void main(String[] args) {
        String name;
        int amount,index;
        int menu,kinds;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("----Library----");
            System.out.println("-----Books-----");
            //소장하는 책 출력 부
            int i=0;
            while(book[i][0]!=null){
                System.out.println(i+". "+book[i][0]+" "+book[i][1]);
                i++;
            }
            System.out.println("-----Videos----");
            int j=0;
            while(video[j][0]!=null){
                System.out.println(j+". "+video[j][0]+" "+video[j][1]);
                j++;
            }
            System.out.println("1.Insert 2.Delete 3.Exit");
            menu=scanner.nextInt();
            if(menu==3){
                return;
            }
            System.out.println("1.Book 2.Video");
            kinds=scanner.nextInt();
            scanner.nextLine();

            switch (menu){
                case 1:
                    System.out.print("Name : ");
                    name = scanner.nextLine();
                    System.out.print("Amount : ");
                    amount = scanner.nextInt();
                    Insert(name,amount,kinds);
                    break;
                case 2:
                    System.out.print("Index : ");
                    index = scanner.nextInt();
                    System.out.print("Amount : ");
                    amount = scanner.nextInt();
                    Delete(index,amount,kinds);
                    break;
                default:
                    System.out.println("ERROR: WRONG INPUT");
            }
        }


    }

    public static void Insert(String name, int amount, int kinds){
        if(kinds==1){
            book[bookIndex][0]=name;
            book[bookIndex][1]=Integer.toString(amount);//숫자->문자
            //Integer.parseInt()는 문자열->변수
            bookIndex++;
        }
        if(kinds==2){
            video[videoIndex][0]=name;
            video[videoIndex][1]=Integer.toString(amount);
            videoIndex++;
        }
    }

    public static void Delete(int index, int amount, int kinds){
        if(kinds==1){
            if(amount>=Integer.parseInt(book[index][1])){
                while(book[index][0]!=null){
                    book[index][0]=book[index+1][0];
                    book[index][1]=book[index+1][1];
                    index++;
                }
            }
            else{
                book[index][1]=Integer.toString(Integer.parseInt(book[index][1])-amount);

            }
        }
        if(kinds==2){
            if(amount>=Integer.parseInt(video[index][1])){
                while(video[index][0]!=null){
                    video[index][0]=video[index+1][0];
                    video[index][1]=video[index+1][1];
                    index++;
                }
            }
            else{
                video[index][1]=Integer.toString(Integer.parseInt(video[index][1])-amount);
            }
        }

    }
}