// Level 1
//QUE 1. Write a program to calculate the age of a person in 2024, given their birth year.
public class Level_One {
    public static void main(String[] args) {
        int birthyear = 2000;
        int curryear = 2024;
        int age = curryear - birthyear;
        System.out.println("Harry's Age in 2024 is: " + age);
    }
}

// QUE 2. Write a program to calculate the average marks of a student in three
// subjects: Mathematics, Physics, and Chemistry.
public class Level_One {
    public static void main(String[] args) {
        int maths = 94, physics = 95, chemistry = 96;
        int total = maths + physics + chemistry;
        double average = total / 300.0;
        System.out.println("Sam's Average Marks in PCM is: " + average);
    }
}

// QUE 3. Write a program to convert a given distance in kilometers to miles. (1
// mile = 1.6 kilometers)
public class Level_One {
    public static void main(String[] args) {
        double kilometers, miles;
        kilometers = 10.8;
        miles = (1 / 1.6) * kilometers;
        System.out.println("The distance " + kilometers + "km in miles is: " + miles);

    }
}

// QUE 4. Write a program to calculate the profit and profit percentage of a
// product, given its cost price and selling price.
public class Level_One {
    public static void main(String[] args) {
        int costprice = 129, sellingprice = 191;
        int profit = sellingprice - costprice;
        int profitpercent = (profit * 100) / costprice;
        System.out.println("The cost price is INR " + costprice + " and the selling price is INR " + sellingprice);
        System.out.println("The profit is INR " + profit + " and the profit percentage is " + profitpercent + "%");
    }
}

// QUE 5. Write a program to calculate the number of pens each student will get
// if 14 pens are distributed equally among 3 students, and also calculate the
// number of remaining pens that cannot be distributed.
public class Level_One {
    public static void main(String[] args) {
        int pens = 14, students = 3;
        int pensperstudent = pens / students;
        int remainingpens = pens % students;
        System.out.println("The Pen Per Student is: " + pensperstudent + " and the remaining pens not distributed is: "
                + remainingpens);

    }
}

// QUE 6. Write a program to calculate the discount amount and the final
// discounted price of a product, given its original price and the discount
// percentage.
public class Level_One {
    public static void main(String[] args) {
        int fee = 125000, discountpercent = 10, actualfee = 0;
        int discount = (fee * discountpercent) / 100;
        actualfee = fee - discount;
        System.out
                .println("The discount amount is INR " + discount + " and the final discount fee  is INR " + actualfee);

    }
}

// QUE 7. Write a program to calculate the volume of a sphere given its radius,
// and then convert the volume from cubic kilometers to cubic miles. (1 mile =
// 1.6 kilometers)
public class Level_One {
    public static void main(String[] args) {
        double radius = 6378;
        double volume = (4 / 3.0) * 3.14 * radius * radius * radius;
        double km = 1 / 1.6;
        System.out.printf("The volume of the sphere in kilometers is %.2f and the distance in miles is %.2f", volume,
                (volume * km));
    }
}

// QUE 8. Write a program to convert a given distance in kilometers to miles,
// using user input. (1 mile = 1.6 kilometers)
import java.util.Scanner;

public class Level_One {
    public static void main(String[] args) {
        double km;
        Scanner input = new Scanner(System.in);
        km = input.nextInt();
        double miles = (1 / 1.6) * km;
        System.out.println("The distance " + km + "km in miles is: " + miles);
    }
}

// QUE 9. Write a program to calculate the profit and profit percentage of a
// product, given its cost price and selling price, using user input.
import java.util.Scanner;

public class Level_One {
    public static void main(String[] args) {
        int fee, discountpercent, actualfee = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fee: ");
        fee = input.nextInt();
        System.out.print("Enter the discount percentage: ");
        discountpercent = input.nextInt();
        int discount = (fee * discountpercent) / 100;
        actualfee = fee - discount;
        System.out
                .println("The discount amount is INR " + discount + " and the final discount fee  is INR " + actualfee);

    }
}
// Que 10.
import java.util.Scanner;

public class Level_One {
    public static void main(String[] args) {
        int height;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height: ");
        height = input.nextInt();
        double cm = 1 / 2.54;
        double inches = height * cm;
        double foot = inches * 12;
        System.out
                .println("The height in inches is: " + inches + " and the height in foot is: " + foot);

    }
}