import java.util.Set;
import java.util.TreeSet;

public class setY�ntemi {
	
	public static void main(String[] args) {
		

	
	Set<String> treeSet = new TreeSet<String>();  // set y�ntemi tan�mlad�k
    treeSet.add("Osman");
    treeSet.add("Ayse");    // veri ekledik
    treeSet.add("Osman");
    for(String str : treeSet) {     // list ile benzer ama ayn� objeden ike defa yazd�ramay�z
       System.out.println(str);   // for each ile yaz�dr�dk
       
    }

}
}