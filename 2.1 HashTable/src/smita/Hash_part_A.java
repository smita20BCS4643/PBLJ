package smita;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
public class Hash_part_A
{
public static void main(String[] args)
{
Hashtable ht = new Hashtable();
ht.put("KEY > A", "ONE");
ht.put("KEY > B", "TWO");
ht.put("KEY > C", "THREE");
System.out.println("Ananya Singh  UID = 20BCS4585\n");
Set st = ht.keySet();
System.out.println("<--- KEYS IN THE SET CREATED FROM HASHTABLE ARE --->");
Iterator itr = st.iterator();
while (itr.hasNext())
System.out.println(itr.next());
st.remove("KEY > 1");
System.out.println("<--- HASHTABLE KEYS AFTER REMOVAL FROM SET ARE --->");
Enumeration e = ht.keys();
while (e.hasMoreElements())
System.out.println(e.nextElement());
}
}
