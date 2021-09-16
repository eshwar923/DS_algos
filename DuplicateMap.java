import java.util.Map;

public class DuplicateMap<K,V> {
	Entry[] entries = new Entry[12];
	
	public void put(K key, V value) {
		int hash = key.hashCode()&12;
		Entry newNode = new Entry(key,value);
		
		if(entries[hash]!=null) {
			Entry node = entries[hash];
			while(node.next!=null) {
				node=node.next;
			}
			node.next=newNode;
		}else {
			entries[hash]=newNode;
		}
		
	}
	

	class Entry<K,V>{
		K key;
		V value;
		Entry next;
		Entry(K key,V value){
			this.key=key;
			this.value=value;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
