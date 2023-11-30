using System;
using System.Collections.Generic;

using static System.Console;

using Example.Utils;

namespace MyProject
{
    class Project 
    {
        static void Main(string[] args) 
        {
            List<string> words = new List<string>();
            words.Add("Valami");
            words.Add("Valami1");
            WriteLine(string.Join(", ", words));

            List<int> szamok = new List<int>();
            szamok.Add(1);
            szamok.Add(2);
            WriteLine(string.Join(", ", szamok));

            szamok.Remove(1);
            WriteLine(string.Join(", ", szamok));
            szamok.Add(3);
            szamok.RemoveAt(1);
            WriteLine(string.Join(", ", szamok));
            

            if (szamok.Contains(3)) 
            {
                WriteLine("Benne van a 3-mas!");
            }

            WriteLine(szamok.IndexOf(3));
            WriteLine(szamok.Count);

            foreach (var n in szamok)
            {
                WriteLine(n);
            }

            List<int> szamokKetto = new List<int>() { 5, 6, 7};
            //var szavak = new List<string>();

            var filmek = new List<Film>() {
                new Film("Micimacko", 2004, 9.9),
                new Film("Tancolo Talpak", 2006, 9.4)
            };
            //filmek.Add(new Film(...))

            foreach (var film in filmek)
            {
                WriteLine(film);
            }

            var s = "Cica";
            //var forditott = StringUtils.Reverse(s);
            var forditott = s.ReverseStr();
            WriteLine(forditott);
            var s1 = "CicaValamiCicaValami";
            WriteLine(s1.Shorten(5));   
        }
    }
}