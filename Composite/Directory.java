import java.util.ArrayList;
import java.util.List;

public class Directory implements Component {
    private int size;
    private List<Component> child;

    

    public Directory() {
        this.size = 0;
        child= new ArrayList<>();
    }

    public void add(Component component){

        child.add(component);
    }

    @Override
    public int comp() {
        for (Component component : child) {
            size += component.comp();
        }
        return size;
    }

}
