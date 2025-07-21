public class SwitchCase {

    static int getPrice(){
        String item = "pizza";
        int result = switch(item){
            case "burger","roll"->{
                System.out.println("Price is Rs 100");
                System.out.println("Veg burger/roll");
                System.out.println("Non Veg burger/roll");
                yield 100; // yield - pauses the current thread and gives the chance to another thread
            }

            case "pizza"->{
                System.out.println("Price is Rs 200");
                yield 200;
            }

            case "dessert"->{
                System.out.println("Price is Rs 300");
                yield 300;
            }

            case "drinks"->{
                System.out.println("Price is Rs 400");
                yield 400;
            }

            default ->{
                System.out.println("50% off on items");
                yield 0;
            }
        };
        return result;
    }
    public static void main(String[] args) {
        int e = getPrice();
        System.out.println("Price " + e);
        // int item = 3;

        // Switch case BEFORE java7:-
        // final int BURGER = 1;
        // final int PIZZA = 2;
        // final int DESSERT = 3;
        // final int DRINKS = 4;

        // switch(item){
        //     case BURGER:
        //     System.out.println("Price is Rs 100");
        //     break;
        //     case PIZZA:
        //     System.out.println("Price is Rs 200");
        //     break;
        //     case DESSERT:
        //     System.out.println("Price is Rs 300");
        //     break;
        //     case DRINKS:
        //     System.out.println("Price is Rs 50");
        //     break;
        //     default:
        //     System.out.println("50% off on items");
        // }

        // Switch case AFTER java7:-
        /*String item = "burger";
        switch(item){
            case "burger":
            System.out.println("Price is Rs 100");
            break; // exit from the block (switch block)
            case "pizza":
            System.out.println("Price is Rs 200");
            break;
            case "dessert":
            System.out.println("Price is Rs 300");
            break;
            case "drinks":
            System.out.println("Price is Rs 50");
            break;
            default:
            System.out.println("50% off on items");
        }*/

        // Java 14 Arrow
        /*String item = "roll";
        switch(item){
            // case "burger"->{
            // System.out.println("Price is Rs 100");
            // System.out.println("veg burger");
            // }
            case "burger", "roll"->{
                System.out.println("Price is Rs 100");
                System.out.println("veg burger/roll");
                }
            
            case "pizza"->
            System.out.println("Price is Rs 200");
            
            case "dessert"->
            System.out.println("Price is Rs 300");
           
            case "drinks"->
            System.out.println("Price is Rs 50");
            
            default->
            System.out.println("50% off on items");
        }*/

        /*String item = "pizza";
        int result = switch(item){
            case "roll"->100;
            case "pizza"->200;
            case "dessert"->300;
            default->0;
        };
        System.out.println(result);*/
    }
}
