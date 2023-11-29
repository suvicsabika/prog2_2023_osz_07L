using System;
using System.Collections;
using System.Text;

using static System.Console;

namespace MyProject {
    public class Program {
        //Java:
        //private final static int N = 1000;
        private const int N = 1000;

        private static Random rnd = new Random();
        public static void Main(string[] args) {
            /*if (args.Length != 1) {
                Error.WriteLine("Hiba! Pontosan csak egy paranccsori argumentumot adj meg!");
                Environment.Exit(1);
            }
            //WriteLine("Hello " + args[0] + "!");
            WriteLine($"Hello {args[0]}!");

            var argumentumok = Environment.GetCommandLineArgs();
            WriteLine(argumentumok[0]);*/

            // WriteLine("Kerlek adj meg egy sort!");
            // string sor = "";
            // int egesz = -1;
            // try {
            //     sor = ReadLine();
            //     egesz = int.Parse(sor);
            // }
            // catch (FormatException e){
            //     Error.WriteLine(e);
            //     Error.WriteLine(e.Message);
            //     Error.WriteLine("Hiba! Szamot kell megadni.");
            // }
            // finally {
            //     WriteLine("Bekeres - KESZ");
            // }

            // var szamok = new List<int> {2, 3, 5, 7, 11, 13};
            // WriteLine(szamok.First());
            // WriteLine(szamok.Last());
            // var elsoHarom = szamok.Take(3).ToList();
            // foreach (var szam in elsoHarom)
            // {
            //     WriteLine(szam);
            // }

            // var utolsoHarom = szamok.Skip(3).Take(2).ToList();            
            // foreach (var szam in utolsoHarom)
            // {
            //     WriteLine(szam);
            // }

            // var utolsoHarom2 = szamok.TakeLast(2).ToList();
            // foreach (var szam in utolsoHarom2)
            // {
            //     WriteLine(szam);
            // }

            // WriteLine(szamok.Average());
            
            // WriteLine(szamok.All(x => x>0));
            // WriteLine(szamok.Any(x => x>0));

            //int[,] matrix = new int[2,3];

            // String i = ",";
            // i += "2";
            // const int i2 = 0;

            // int[,] matrix = {
            //     {1, 2, 3},
            //     {3, 4, 5}
            // };
            // for (int i = 0; i < matrix.GetLength(0); i++) {
            //     for (int j = 0; j < matrix.GetLength(1); j++) {
            //         //matrix[i, j] = 0;
            //         WriteLine(matrix[i, j]);
            //     }
            // }

            // var sb = new StringBuilder();
            // sb.Append("AB");
            // sb.Append("CD");
            // sb.Append("EF");
            // sb.Append(3);
            // var result = sb.ToString();
            // WriteLine(result);
            
            // N += 1;
            // WriteLine(N);

            WriteLine(rnd.Next(1, 3));  // [1, 3)
            WriteLine(rnd.NextDouble());// [0.0, 1.0)
            //Java:
            //List<Integer> szamok = new ArrayList<>(); 
            List<int> szamok = new List<int>();
            //Java:
            //Set<Integer> szamok = new HashSet<>();
            HashSet<int> halmaz = new HashSet<int>();
            //Java:
            //Map<Integer, String> szotar = new HashMap<>();
            Dictionary<int, string> szotar = new Dictionary<int, string>();

            
        }
    }
}