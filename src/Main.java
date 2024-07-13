public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println("Бонусных миль начислено: " + miles);

        price = 20_150;
        miles = service.calculate(price); // должно получиться 1007
        System.out.println("Бонусных миль начислено: " + miles);

        price = 5_518;
        miles = service.calculate(price); // должно получиться 275
        System.out.println("Бонусных миль начислено: " + miles);
    }
}

