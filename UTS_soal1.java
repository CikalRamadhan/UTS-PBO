package Java;

import java.util.Scanner;

public class UTS_soal1 {
    private final int perjam;
    private final int menit;
    private final int detik;

    public int getJamtelepon() {
        return perjam;
    }

    public int getMenit() {
        return menit;
    }

    public int getDetik() {
        return detik;
    }

    public double pulsa() {
        return (3600 * perjam + 60 * menit + detik) * 30;
    }

    public UTS_soal1(int jam, int menit, int detik) {
        this.perjam = jam;
        this.menit = menit;
        this.detik = detik;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input jam:");
        int perjam = sc.nextInt();
        System.out.print("Input menit:");
        int menit = sc.nextInt();
        System.out.print("Input detik:");
        int detik = sc.nextInt();

        UTS_soal1 oclock = new UTS_soal1(perjam, menit, detik);
        System.out.println("waktu yang dipakai : " + oclock.getJamtelepon()
                + ":" + oclock.getMenit() + ":" + oclock.getDetik());
        System.out.println("biaya percakapan: Rp. " + oclock.pulsa());
    }
}