package sample;

public class SevenNumber {

    public static void main(String[] args) {
        // 1から100までの数値を出力
        for (int i = 1; i < 100; i++) {
            // 7の倍数、7が入っている数を選出
            if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
                // clap!を表示する
                System.out.println("clap!");
        } else {
            System.out.println(i);
        }

    }

    }
}
