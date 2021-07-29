public class BodyMassIndex {
    public static void main(String[] args) {

        BmiService bmiService = new BmiService();

        int index = (int)bmiService.calculate(80,1.72);

        System.out.println("Индекс массы тела равен: " + index);
    }
}
