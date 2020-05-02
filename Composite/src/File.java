import java.util.List;

public class File implements Ifile {
    private String name;

    public File(String name){
        this.name=name;
    }

    @Override
    public boolean add(Ifile ifile) {
        return false;
    }

    @Override
    public boolean remove(Ifile ifile) {
        return false;
    }

    @Override
    public List<Ifile> getChild() {
        return null;
    }

    @Override
    public void display() {
        System.out.println(name);
    }
}
