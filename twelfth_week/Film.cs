using System;

namespace MyProject
{
    class Film
    {
        private string cim;
        private int ev;
        private double pont;

        public Film(string cim, int ev, double pont) 
        {
            this.cim = cim;
            this.ev = ev;
            this.pont = pont;
        }

        public string getCim()
        {
            return this.cim;
        }

        //Tovabbi Getter es Setter

        public override string ToString()
        {
            return $"Film({this.cim}, {this.ev}, {this.pont})";
        }
    }    
}