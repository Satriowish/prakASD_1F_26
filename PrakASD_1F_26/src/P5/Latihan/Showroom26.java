package P5.Latihan;

public class Showroom26 {
    Mobil26[] jnsMobil;

    public Showroom26(Mobil26[] jnsMobil) {
        this.jnsMobil = jnsMobil;
    }

    // Method mencari top_acceleration tertinggi menggunakan Divide and Conquer
    public int TopAccelerationTertinggi(int start, int end) {
        if (start == end)
            return jnsMobil[start].topAcceleration;

        int mid = (start + end) / 2;
        int lMax = TopAccelerationTertinggi(start, mid);
        int rMax = TopAccelerationTertinggi(mid + 1, end);

        return Math.max(lMax, rMax);
    }

    // Method mencari top_acceleration terendah menggunakan Divide and Conquer!
    public int TopAccelerationTerendah(int start, int end) {
        if (start == end)
            return jnsMobil[start].topAcceleration;

        int mid = (start + end) / 2;
        int lMin = TopAccelerationTerendah(start, mid);
        int rMin = TopAccelerationTerendah(mid + 1, end);

        return Math.min(lMin, rMin);
    }

    // Method mencari Rata-rata top_power seluruh mobil menggunakan Brute Force!
    public double RataTopPower() {
        int sum = 0;
        for (Mobil26 car : jnsMobil) {
            sum += car.topPower;
        }
        return (double) sum / jnsMobil.length;
    }

}
