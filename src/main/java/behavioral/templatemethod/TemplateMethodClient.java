package behavioral.templatemethod;

public class TemplateMethodClient {


    /**

     Шаблонний медот визначає основні кроки алгоритму і дозволяє похідним класам
     надавати реалізацію одного або декількох кроків

    */


    public static void main(String[] args) {
        System.out.println("\nPreparing a cheese pizza");
        Pizza pizza1 = new CheesePizza();
        pizza1.preparePizza();

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("nPreparing a meat pizza");
        Pizza pizza2 = new MeatPizza();
        pizza2.preparePizza();
    }

}