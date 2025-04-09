public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ali", "Demir", 1001);
        Student student2 = new Student("Ayşe", "Kara", 1002);
        Student student3 = new Student("Ali", "Demir", 1001); // student1 ile aynı veriler

        // Bilgileri yazdır
        System.out.println("Öğrenci 1: " + student1);
        System.out.println("Öğrenci 2: " + student2);
        System.out.println("Öğrenci 3: " + student3);

        // equals() testi
        System.out.println("student1 equals student3? " + student1.equals(student3));

        // hashCode() testi
        System.out.println("student1 hashCode: " + student1.hashCode());
        System.out.println("student3 hashCode: " + student3.hashCode());
    }
}
