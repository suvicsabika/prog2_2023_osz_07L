using System;

namespace Example.Utils 
{
    public static class StringUtils
    {
        public static string Reverse( string s) 
        {
            var karakterek = s.ToCharArray();
            Array.Reverse(karakterek);
            return new string(karakterek);
        }
    }
}