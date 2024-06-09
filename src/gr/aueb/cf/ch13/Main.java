package gr.aueb.cf.ch13;

public class Main {

    public static void main(String[] args) {

        //Υπερφορτωμένος Constructor
        PointXYZ pointXYZ = new PointXYZ(1, 2, 4);

        //Εκτύπωση αποτελεσμάτων μετά από χρήση των μεθόδων
        System.out.println(pointXYZ.convertToString());
        System.out.println(pointXYZ.getXYDistance());
        System.out.println(pointXYZ.getXZDistance());
        System.out.println(pointXYZ.getYZDistance());
        System.out.println(pointXYZ.getXYZDistance());
    }
}
