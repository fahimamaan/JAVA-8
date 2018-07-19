import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.beans.Banana;
import com.gargoylesoftware.htmlunit.attachment.CollectingAttachmentHandler;

public class Stream {
	
	public static void main(String[] args) {
		List<String> cards = Arrays.asList("Visa-mam", "MasterCard-mm", "American Express-mmdd","Visa-mnn");
		List<Banana> list= new ArrayList<>();
		Banana a =new  Banana("green", 10, 150);
		Banana b =new  Banana("green", 15, 150);
		Banana c =new  Banana("green", 13, 250);
		Banana d =new  Banana("red", 10, 10);
		Banana e =new  Banana("red", 10, 10);
		Banana f =new  Banana("green", 110, 1150);
		
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		list.add(f);
		
		List<String> fruit=list.stream().filter(v->v.getSize()>9 ).sorted((v1,v2)->v1.getSize()-v2.getSize())
				.map(x->x.getColor()).collect(Collectors.toList());
				
		List<String> fruit1=list.stream().filter(v->v.getSize()>9 ).sorted((v1,v2)->v1.getColor().compareTo(v2.getColor()))
				.map(x->x.getColor()).collect(Collectors.toList());
		System.out.println(fruit);
		Map<String, String> map1=cards.stream().collect(Collectors.toMap(x->x.toString().split("-")[0], x->x.toString().split("-")[1],(oldValue,newValue)->oldValue));
		System.out.println(map1+"fl;l;a");
		Map<String, String> map= cards.parallelStream().collect(Collectors.toMap(x->x.toString().split("-")[0], x->x.toString().split("-")[1],(oldValue,newValue)->oldValue))
				.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
System.out.println(map);
 
System.out.println(list.stream().collect(Collectors.toSet()));
	}

}
