public class BodyMassIndex {
    public static void main(String[] args) {

        BmiService bmiService = new BmiService();

        float index = (float) bmiService.calculate(80,1.72);

        System.out.println("Индекс массы тела равен: " + index);
    }
}
