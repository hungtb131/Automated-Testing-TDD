package triangle;

public class TriangleClassifier {
    public static String classifyTriangle(double firstSide, double secondSide, double thirdSide) {
        //xét theo 3 góc có được không ?
        //Tổng 3 góc là 180 2 góc bằng nhau,3 góc bằng nhau,1 góc vuông??
        if (firstSide + secondSide > thirdSide && secondSide + thirdSide > firstSide && thirdSide + firstSide > secondSide) {
            if (firstSide == secondSide && firstSide != thirdSide) return "isosceles triangle";
            if (thirdSide == secondSide && firstSide != thirdSide) return "isosceles triangle";
            if (firstSide == thirdSide && firstSide != secondSide) return "isosceles triangle";
            if (firstSide == secondSide && firstSide == thirdSide) return "equilateral triangle";
            else return "normal triangle";
        }
        else return "not triangle";
    }
}
