using System;

class Program
{
    static void Main()
    {
        Console.Write("Add meg az első számot: ");
        int a = int.Parse(Console.ReadLine());

        Console.Write("Add meg a második számot: ");
        int b = int.Parse(Console.ReadLine());

        int osszeg = a + b;

        Console.WriteLine("Az összeg: " + osszeg);
    }
}