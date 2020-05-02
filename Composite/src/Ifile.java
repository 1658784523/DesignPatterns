import java.util.List;

/**
 * 文件结点抽象
 */
public interface Ifile {
    //显示文件的名称
    public void display();
    //添加
    public boolean add(Ifile ifile);
    //移除
    public boolean remove(Ifile ifile);
    //获得子节点
    public List<Ifile> getChild();
}
