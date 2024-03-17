import java.util.*;

public class Market implements MarketBehaviour, QueueBehaviour{
    private int count = 0;
    Queue<Actor> actorQueue = new ArrayDeque<>();
    @Override
    public void acceptToMarket(Actor actor) {
        count++;
        System.out.println(actor.getName() + " зашел в магазин");
        System.out.println("Сейчас в магазине " + count + " человек");

    }
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        System.out.println(actors.getFirst().getName() + " покинул магазин");
        actors.removeFirst();
        count--;

        System.out.println("В магазине осталось " + count + " человек");

    }

    @Override
    public void takeInQueue(Actor actor) {
        actorQueue.add(actor);
        System.out.println(actor.getName() + " встал в очередь");

    }

    @Override
    public void takeOrders() {
        actorQueue.peek().isTakeOrder();
        System.out.println(actorQueue.peek().getName() + " забрал заказ");

    }

    @Override
    public void giveOrders() {
        actorQueue.peek().isMakeOrder();
        System.out.println(actorQueue.peek().getName() + " сделал заказ");

    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actorQueue.peek().getName() + " покинул очередь");
        actorQueue.poll();

    }



}