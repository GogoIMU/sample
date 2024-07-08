package javaapis.string;

public class ReplaceAllSample {
    // 文字列の置き換え replaceALL()メソッド

    public static void main(String[] args) {
        String str = "100ドル";
        String sub = str.replaceAll("ドル", "円");
        System.out.println(sub);
    }

}
