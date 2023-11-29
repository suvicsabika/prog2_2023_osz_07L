using System;

namespace MyProject
{
    public static class StringExtensions
    {
        public static string ReverseStr(this string s)
        {
            var karakterek = s.ToCharArray();
            Array.Reverse(karakterek);
            return new string(karakterek);
        }

        public static string Shorten(this string s, int n)
        {
            return new string(s[0..5] + "...");
        }
    }
}