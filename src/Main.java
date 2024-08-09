public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var oneBoxer = 78.2;
        var twoBoxer = 82.7;
        System.out.println(oneBoxer);
        System.out.println(twoBoxer);

        var totalMass = oneBoxer + twoBoxer;
        System.out.println(totalMass);

        var weightDifference = twoBoxer - oneBoxer;
        System.out.println(weightDifference);

        var remainderOfDivision = twoBoxer % oneBoxer;
        System.out.println(remainderOfDivision);

        var timeWork = 640;
        System.out.println(timeWork);

        var employeeEfficiency = 8;
        System.out.println(employeeEfficiency);

        var totalEmployees = timeWork / employeeEfficiency;
        System.out.println("Всего работников в компании " + totalEmployees);
        totalEmployees = totalEmployees + 94;
        System.out.println(totalEmployees);

        var workTime2 = totalEmployees * employeeEfficiency;
        System.out.println(workTime2);
        System.out.println("Если в компании работает " +  totalEmployees + " человек, то всего " + workTime2 + " часов работы может быть поделено между сотрудниками");
    }
}