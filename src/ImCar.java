public class ImCar {
    private final int year;
    private final String marka;
    private final int v;

    public ImCar(int year, String marka, int v) {
        this.year = year;
        this.marka = marka;
        this.v = v;
    }



    public int getYear() {
        return year;
    }

    public String getMarka() {
        return marka;
    }

    public int getV() {
        return v;
    }

    @Override
    public String toString() {
        return "ImCar{" +
                "year=" + year +
                ", marka='" + marka + '\'' +
                ", v=" + v +
                '}';
    }
}
