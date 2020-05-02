import java.util.ArrayList;
import java.util.List;

public class Floder  implements Ifile{
    private String name;
    private List<Ifile> children;

    public Floder(String name){
        this.name=name;
        children=new ArrayList<>();
    }
    @Override
    public void display() {
        System.out.println(name);
    }

    @Override
    public List<Ifile> getChild() {
        return children;
    }

    @Override
    public boolean remove(Ifile ifile) {
        return children.remove(ifile);
    }

    @Override
    public boolean add(Ifile ifile) {
        return children.add(ifile);
    }
}
