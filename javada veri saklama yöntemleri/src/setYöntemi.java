import java.util.Set;
import java.util.TreeSet;

public class setYöntemi {
	
	public static void main(String[] args) {
		

	
	Set<String> treeSet = new TreeSet<String>();  // set yöntemi tanýmladýk
    treeSet.add("Osman");
    treeSet.add("Ayse");    // veri ekledik
    treeSet.add("Osman");
    for(String str : treeSet) {     // list ile benzer ama ayný objeden ike defa yazdýramayýz
       System.out.println(str);   // for each ile yazýdrýdk
       
    }

}
}