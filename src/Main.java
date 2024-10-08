//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*
        Задача 1: Управление животными (интерфейсы и абстрактные классы)
        Создайте систему управления зоопарком, используя абстрактные классы и интерфейсы.

        Требования:
        Создайте интерфейс Animal с методами:
        void eat()
        void sleep()
        Создайте абстрактный класс Mammal, который реализует интерфейс Animal и добавляет метод:
        void walk()
        Создайте классы, представляющие конкретные животные:
        Lion
                Elephant
        Каждое животное должно реализовать методы из интерфейса Animal и класса Mammal.

*/
interface Animal{
    void eat();
    void sleep();
}
abstract class Mammal implements Animal{
    abstract void walk();
}

class Lion extends Mammal {
    public void eat(){
        System.out.println("ням ням");

    }
    public void sleep(){
        System.out.println("zzZZ");
    }

    void walk(){
        System.out.println("бегу за жертвой");
    }
}
class Elephant extends Mammal {
    public void eat(){
        System.out.println("хрум хрум");

    }
    public void sleep(){
        System.out.println("не сплю");
    }
    void walk(){
        System.out.println("шагаю");
    }
}

/*
                Задача 2: Фигуры (интерфейсы и абстрактные классы)
        Создайте систему для работы с различными геометрическими фигурами, используя интерфейсы и абстрактные классы.

        Требования:
        Создайте интерфейс Shape с методами:

        double area()
        double perimeter()
        Создайте абстрактный класс Polygon, который реализует интерфейс Shape и добавляет метод:

        int numberOfSides()
        Создайте классы, представляющие конкретные фигуры:

        Triangle
                Rectangle
        Circle (не наследуется от Polygon, но реализует Shape напрямую)
        Каждая фигура должна реализовать свои методы для расчета площади и периметра.
*/
interface Shape{
    double area();
    double perimeter();
}
abstract class Polygon implements Shape{
    abstract int numberOfSides();
    }
class Triangle extends Polygon{
    double a, b, c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double area(){
        return Math.sqrt(perimeter()*(perimeter()-a)*(perimeter()-b)*(perimeter()-c));
    }


    public double perimeter() {
        return a+b+c;
    }
    @Override
    public int numberOfSides() {
        return 3;
    }
}
class Rectangle extends Polygon{
    double a, b;
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;

    }
    public double area(){
        return a*b;
    }


    public double perimeter() {
        return (a+b)*2;
    }

    public int numberOfSides() {
        return 4;
    }
}
class  Circle implements Shape{
    double r;
    public Circle(double r) {
        this.r = r;
    }
    public double area(){
        return Math.PI*r*r;
    }


    public double perimeter() {
        return Math.PI*2*r;
    }
}

 /*        Задача 3: Работа с устройствами (интерфейсы и абстрактные классы)
        Создайте систему для управления электронными устройствами, такими как телевизоры и компьютеры.

        Требования:
        Создайте интерфейс Device с методами:

        void turnOn()
        void turnOff()
        Создайте абстрактный класс ElectronicDevice, который реализует интерфейс Device и добавляет метод:

        int getPowerConsumption() (возвращает потребляемую мощность устройства в ваттах)
        Создайте классы для конкретных устройств:

        TV
                Computer
        Каждое устройство должно реализовать методы из интерфейса и абстрактного класса, описывая, как они включаются, выключаются, и сколько мощности они потребляют.
*/
interface Device{
     void turnOn();
     void turnOff();
 }
 abstract class ElectronicDevice implements Device{

     abstract int getPowerConsumption();
 }
 class TV extends ElectronicDevice{
     int powerConsumption;
     public TV(int powerConsumption) {
         this.powerConsumption = powerConsumption;
     }

     public int getPowerConsumption() {
         return powerConsumption;
     }


     public void turnOff() {
         System.out.println("не мигает");
     }


     public void turnOn() {
         System.out.println("мигает");
     }
 }

class Computer extends ElectronicDevice{
    int powerConsumption;
    public Computer(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }


    public void turnOff() {
        System.out.println("не жужжит");
    }


    public void turnOn() {
        System.out.println("жужжит");
    }
}

/*
        Задача 4: Магазин (интерфейсы и абстрактные классы)
        Создайте систему для работы с товарами в интернет-магазине.

                Требования:
        Создайте интерфейс Product с методами:

        double getPrice()
        String getName()
        Создайте абстрактный класс PhysicalProduct, который реализует интерфейс Product и добавляет метод:

        double getWeight() (возвращает вес товара в килограммах)
        Создайте классы для конкретных товаров:

        Book (физический товар)
        Software (виртуальный товар)
*/
interface  Product{
    double getPrice();
    String getName();
}
abstract class PhysicalProduct implements Product{
    abstract double getWeight();
}
class Book extends PhysicalProduct{
    double price;
    double weight;
    String name;
    Book(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
}
class Software implements Product{
    double price;
    String name;
    Software(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
}

        /*Задача 5: Спортивные соревнования (интерфейсы и абстрактные классы)
        Создайте систему для управления различными типами спортсменов и их достижениями на соревнованиях.

        Требования:
        Создайте интерфейс Athlete с методами:

        void train()
        void compete()
        Создайте абстрактный класс Runner, который реализует интерфейс Athlete и добавляет метод:

        double getBestTime() (возвращает лучшее время бегуна)
        Создайте классы для конкретных спортсменов:

        Sprinter
                MarathonRunner
        Каждый спортсмен должен иметь свою реализацию методов тренировки и участия в соревнованиях.
*/

interface Athlete{
    void train();
    void compete();
}
abstract class Runner implements Athlete{
    abstract  double getBestTime();
}
class MarathonRunner extends Runner{
    double bestTime;
    MarathonRunner(double bestTime) {
        this.bestTime = bestTime;
    }
    public double getBestTime() {
        return bestTime;
    }
    public void compete() {
        System.out.println("runr run!!");
    }
    public void train() {
        System.out.println("train hard");
    }
}
class Sprinter extends Runner{
    double bestTime;
    Sprinter(double bestTime) {
        this.bestTime = bestTime;
    }
    public double getBestTime() {
        return bestTime;
    }
    public void compete() {
        System.out.println("compete!!");
    }
    public void train() {
        System.out.println("train everyday");
    }
}
//Мэйн
public class Main {
    public static void main(String[] args) {



    }
}