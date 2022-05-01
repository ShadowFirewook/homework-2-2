public class Main {
    public static void main(String[] args) {
        System.out.println(walk(generateRandomAge(),23));
        System.out.println(walk(generateRandomAge(),4));
        System.out.println(walk(generateRandomAge(),-9));
        System.out.println(walk(generateRandomAge(),16));
        System.out.println(walk(generateRandomAge(),55));
    }
    public static String walk (int ageOfMan, int temperature){

        if (ageOfMan > 20 && ageOfMan <45 && temperature > -20 && temperature <30){
            return "Можно идти гулять";
        } else if (ageOfMan <20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (ageOfMan >45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }

    }
    public static int generateRandomAge() {
        double randomAge = Math.random() * 120;
        return (int) randomAge;
    }

}