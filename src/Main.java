import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scan.nextInt();
        NumBigger.NumBiggerSeven(num);

        Scanner getname = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = getname.nextLine();
        NumBigger.NumBiggerSeven(num);
        GetName.WhatName(name);

        Scanner arrayScan = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int n = arrayScan.nextInt();
        GetName.WhatName(name);

        System.out.println("Введите элементы массива: ");
        ArrayOfNums run = new ArrayOfNums(n);
        run.ourArray(arrayScan);
        System.out.println("Элементы массива, кратные 3:");
        run.printArray();
    }
}

// Введенное число больше 7
class NumBigger
{
    public static void NumBiggerSeven(int num)
    {
        if(num > 7)
        {
            System.out.println("Привет!");
        }
        else
        {
            System.out.println("Число 7 или меньше 7...");
        }
    }
}

// Имя Вячеслав
class GetName
{
    public static void WhatName(String name)
    {
        if("Вячеслав".equals(name))
        {
            System.out.println("Привет, Вячеслав!");
        }
        else
        {
            System.out.println("Имя не найдено...");
        }
    }
}

// Числа в массиве, кратные 3
class ArrayOfNums
{
    private int[] nums;

    public ArrayOfNums(int size)
    {
        nums = new int[size];
    }

    public void ourArray(Scanner scan)
    {
        for(int i = 0; i < nums.length; i++)
        {
            System.out.println("Элемент " + (i + 1) + ": ");
            nums[i] = scan.nextInt();
        }
    }

    public void printArray()
    {
        for(int num : nums)
        {
            if(num % 3 == 0)
            {
                System.out.println(num);
            }
        }
    }
}

