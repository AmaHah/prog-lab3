package characters;


import items.Eatable;
import items.Storage;
import java.util.LinkedList;
public class Kirre extends Human{
    public Kirre(String name) {
        super(name);
    }
    public Kirre(String name, LinkedList<Storage> storages) {
        super(name, storages);
    }
    public void eatCandy(){
        takeCandy(getStorages().peekFirst());
        System.out.println(toString() + " съел конфету");
    }
    public Eatable takeCandy(Storage storage){
        System.out.println(toString() + " взял конфету из " + storage.toString());
        return storage.take();
    }
}
