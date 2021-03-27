import java.util.*;

class Descending implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		return i2.compareTo(i1);
	}
}

class HashMapDemo
{
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// add elements
		hm.put(22,"A");
    	hm.put(55,"B");
    	hm.put(33,"Z");
    	hm.put(44,"M");
    	hm.put(99,"I");
    	hm.put(88,"X");
    	System.out.println("Before sorting: ");
    	for(Map.Entry en:hm.entrySet())
    	{
    		System.out.println("key: "+en.getKey()+" Value: "+en.getValue());
    	}
    	
    	TreeMap<Integer, String> tm = new TreeMap<>(hm);
    	System.out.println("After sorting: ");

    	Set<Map.Entry<Integer, String>> s = tm.entrySet();
    	Iterator itr = s.iterator();

    	while(itr.hasNext())
    	{
    		Map.Entry m = (Map.Entry)itr.next();
    		System.out.println("key: "+m.getKey()+" Value: "+m.getValue());
    	}

    	TreeMap<Integer, String> tm1 = new TreeMap<>(new Descending());

    	tm1.put(22,"A");
    	tm1.put(55,"B");
    	tm1.put(33,"Z");
    	tm1.put(44,"M");
    	tm1.put(99,"I");
    	tm1.put(88,"X");

    	System.out.println("After sorting in descending order of keys: ");

    	Set<Map.Entry<Integer, String>> s1 = tm1.entrySet();
    	Iterator itr1 = s1.iterator();

    	while(itr1.hasNext())
    	{
    		Map.Entry m1 = (Map.Entry)itr1.next();
    		System.out.println("key: "+m1.getKey()+" Value: "+m1.getValue());
    	}

	}
}