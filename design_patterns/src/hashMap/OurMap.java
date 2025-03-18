package hashMap;
import java.util.ArrayList;
import java.util.List;

public class OurMap<K, V>
{
	private class MapNode<K, V>
	{
		K key;
		V value;
		MapNode next;
		MapNode(K key, V value)
		{
			this.key=key;
			this.value=value;
		}
	}
	private int capacity;//length of the bucket 
	private List<MapNode<K,V>> bucket;
	private int size; //number of elements in the map
	private int INITIAL_CAPACITY=5;
	
	OurMap()
	{
		bucket=new ArrayList<>();
		capacity=INITIAL_CAPACITY;
		for(int i=0;i<capacity;i++)
			bucket.add(null);
	}
	public int getBucketIndex(K key)
	{
		int hash_code=key.hashCode();
		return hash_code%capacity;
	}
	public V get(K key) {
		int bucketIndex=getBucketIndex(key);
		MapNode<K,V> head=bucket.get(bucketIndex);
		while(head!=null)
		{
			if(head.key.equals(key))
				return head.value;
			head=head.next;
		}
		return null;
	}
	public void put(K key, V value)
	{
		int bucketIndex=getBucketIndex(key);
		MapNode<K,V> head=bucket.get(bucketIndex);
		while(head!=null)
		{
			if(head.key.equals(key))
			{
				head.value=value;
				return;
			}
			head=head.next;
		}
		size++;
		head=bucket.get(bucketIndex);
		MapNode<K,V> new_node=new MapNode<>(key,value);
		new_node.next=head;
		bucket.set(bucketIndex, new_node);
	}
	public void remove(K key)
	{
		int bucketIndex=getBucketIndex(key);
		MapNode<K,V> head=bucket.get(bucketIndex);
		MapNode<K,V> prev=null;
		while(head!=null)
		{
			if(head.key.equals(key))
			{
				if(prev==null)
					bucket.set(bucketIndex,head.next);
				else
				prev.next=head.next;
				head.next=null;
				size--;
				break;
			}
			prev=head;
			head=head.next;
		}
	}
	
	
}