import java.util.List;

public class Main {
    public static void main(String[] args) {
        //C盘
        Floder rootFloder=new Floder("C:");
        //目录 徐淼
        Floder xumiaoFloder=new Floder("xumiao ");
        //xm.txt
        File xmFile=new File("xm.txt");
        rootFloder.add(xumiaoFloder);
        rootFloder.add(xmFile);

        Floder hahah=new Floder("徐淼");
        File file=new File("徐淼.txt");
        xumiaoFloder.add(hahah);
        xumiaoFloder.add(file);
        displayTree(rootFloder);
    }

    public static void displayTree(Ifile file){
        file.display();
        List<Ifile>children=file.getChild();
        for (Ifile ifile:children){
            if(ifile instanceof File){
                ifile.display();
            }else {
                displayTree(ifile);
            }
        }
    }
}
