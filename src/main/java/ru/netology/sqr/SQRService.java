package ru.netology.sqr;

public class SQRService {
    public int sqrCeil(int max, int min) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i <= max) {
                if (i * i >= min) {
                    count++;
                }
            }
        }
        return count;
    }
}





