public class UcBurchtuk {
    double a;
    double b;
    double c;

      public  double  arrea(double a,double b,double c) {
          double v = (a + b + c) / 2;
          double n =v* (v - a) * (v - b )* (v - c);

          return  Math.sqrt(n);
}}
