/**
 * @author Yutaro M
 * @version 0.0.1
 * http://mitani.cs.tsukuba.ac.jp/book_support/java/java_dril_method30.pdf
 */

public class Practice {
    public static void main(String[] args) {
        double doubleValue = getTriangleArea(8.2, 4.0);
        System.out.println(doubleValue);
        printHello();
        printPI();
        printRandomMessage();
        printMessage("Hello");
        printCircleArea(3);
        printRandomMessage("tanaka");
        printMessage("messageです", 3);
        printRectangleArea(5, 7);
        printMaxValue(4, 3, 2);
        System.out.println(getMessage());
        System.out.println(getWeatherForecast());
        System.out.println("2の平方根 = " + getSquareRootOf2());
        System.out.println(getRandomMessage("yoshida"));
        System.out.println("-5.3の絶対値 = " + getAbsoluteValue(-5.3));
        System.out.println(isEvenNumber(4));
        System.out.println("getMinValue: " + getMinValue(3, 5));
        System.out.println("isSameAbsoluteValue: " + isSameAbsoluteValue(-5, 5));
        System.out.println("getMessage: " + getMessage("takashi", true));
        System.out.println("getMinValue: " + getMinValue(new int[] {1,2,3,4,5,5}));
        System.out.println("getAverage: " + getAverage(new double[] {3,5,2,6,7,8}));
        System.out.println("getLongestString: " + getLongestString(new String[] {"aa", "aaaa", "dsafsadda", "sssssss"}));
        
        Point point1 = new Point(4.5, 4.3);
        Point point2 = new Point(2.5, 5.6);
        Point point3 = new Point(8.3, 7.3);
        Point point4 = new Point(2.9, 4.9);
        Point[] points = {point1, point2, point3, point4};
        System.out.println(point1.getDistanceFromOrigin(point1));
        System.out.println(point1.getDistanceBetweenTwoPoints(point1, point2));
        System.out.println((point1.getBarycenter(points)).x + ", " + (point1.getBarycenter(points)).y);

        
    }

    static double getTriangleArea(double height, double base) {
        return (height * base) / 2.0;
    }

    static void printHello() {
        System.out.println("Hello");
    }

    static void printPI() {
        System.out.println(Math.PI);
    }

    static void printRandomMessage() {
        String[] greet = {"おはよう", "こんにちは", "こんばんは"};
        int n = (int)(3 * Math.random());
        System.out.println(greet[n]);
    }

    static void printMessage(String message) {
        System.out.println(message);
    }

    static void printCircleArea(double radius) {
        System.out.println(Math.pow(radius, 2) * Math.PI);
    }

    static void printRandomMessage(String name) {
        int n = (int)(Math.random() * 3);
        switch (n) {
            case 0: System.out.println("おはよう" + name + "さん");
                break;
            case 1: System.out.println("こんにちは" + name + "さん");
                break;
            case 2: System.out.println("こんばんは" + name + "さん");
        }
    }

    static void printMessage(String message, int count) {
        for(int i = 0; i < count; i++) System.out.println(message);
    }

    static void printRectangleArea(double height, double width) {
        System.out.println("長方形の面積 = " + height * width);
    }

    static void printMaxValue(double a, double b, double c) {
        System.out.println("最大値 = " + Math.max((Math.max(a, b)),c));
    }

    static String getMessage() {
        return "Return Message";
    }

    static String getWeatherForecast() {
        int n = (int)(Math.random() * 3);
        int m = (int)(Math.random() * 4);
        String resStr1, resStr2;
        resStr1 = resStr2 = null;
        switch(n) {
            case 0: resStr1 = "今日";
                break;
            case 1: resStr1 = "明日";
                break;
            case 2: resStr1 = "明後日";
        }
        switch(m) {
            case 0: resStr2 = "晴れ";
                break;
            case 1: resStr2 = "曇り";
                break;
            case 2: resStr2 = "雨";
                break;
            case 3: resStr2 = "雪";
        }
        return resStr1 + "の天気は" + resStr2 + "でしょう";
    }

    static double getSquareRootOf2() {
        return Math.sqrt(2);
    }

    static String getRandomMessage(String name) {
        int n = (int)(Math.random() * 3);
        String resStr = null;
        switch (n) {
            case 0: resStr = "おはよう" + name + "さん";
            case 1: resStr = "こんにちは" + name + "さん";
            case 2: resStr = "こんばんは" + name + "さん";
        }
        return resStr;
    }

    static double getAbsoluteValue(double value) {
        return Math.abs(value);
    }

    static boolean isEvenNumber(int value) {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }




    static double getMinValue(double a, double b) {
        return Math.min(a, b);
    }

    static boolean isSameAbsoluteValue(int i, int j) {
        return Math.abs(i) == Math.abs(j);
    }

    static String getMessage(String name, boolean isKid) {
        if (isKid) {
            return "こんにちは" + name + "ちゃん";
        } else {
            return "こんにちは" + name + "さん";
        }
    }

    static int getMinValue(int[] array) {
        int min = array[0];
        for (int n : array) {
            min = Math.min(min, n);
        }
        return min;
    }

    static double getAverage(double[] array) {
        double sum = 0;
        for (double n : array) {
            sum += n;
        }
        return sum / array.length;
    }

    static String getLongestString(String[] array) {
        String LongestStr = array[0];
        for (String str : array) {
            if (LongestStr.length() <= str.length()) {
                LongestStr = str;
            }
        }
        return LongestStr;
    }


}