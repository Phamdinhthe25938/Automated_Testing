public class TriangleClassifier {
    public static String TriangleClassifier(int a,int b,int c){
       if(a>0 && b>0 && c>0){
            if(a==b && b==c && a==c){
                return "Tam giac deu!";
            }
            else if(a==b || b==c || a==c){
                return "Tam giac can!";
            }
            else {
                return "tam giac thuong!";
            }
        }
       else
           return "k phai tam giac";
    }
}
