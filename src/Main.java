import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        List<Actor> actorList = new ArrayList<>();

        // проверка на 1 человеке

        Human human1 = new Human();
        human1.setName("Петр");
        actorList.addLast(human1);

        market.acceptToMarket(human1);
        market.takeInQueue(human1);
        market.giveOrders();
        market.takeOrders();
        market.releaseFromQueue();
        market.releaseFromMarket(actorList);
        System.out.println("-------------------------------------");

        // на 3 людях

        Human human2 = new Human();
        human2.setName("Василий");
        actorList.addLast(human2);

        Human human3 = new Human();
        human3.setName("Инокентий");
        actorList.addLast(human3);

        Human human4 = new Human();
        human4.setName("Николай");
        actorList.addLast(human4);


        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.takeInQueue(human2);
        market.giveOrders();
        market.takeOrders();
        market.releaseFromQueue();
        market.releaseFromMarket(actorList);
        market.acceptToMarket(human4);

        market.takeInQueue(human3);
        market.giveOrders();
        market.takeOrders();
        market.releaseFromQueue();
        market.releaseFromMarket(actorList);
        market.takeInQueue(human4);
        market.giveOrders();
        market.takeOrders();
        market.releaseFromQueue();
        market.releaseFromMarket(actorList);







    }
}