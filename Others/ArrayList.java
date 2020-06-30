package list;

public class ArrayList{
	private int index;
	private int arr[] = new int[16];
	public boolean isEmpty(){
		return index == 0;
	}

	public void add(int val){
		if(arr.length == index){
			int[] newArr = new int[index*2];
			for(int i = 0; i < index; i++){
				newArr[i] = arr[i];
			}
			arr = newArr;
		}
		arr[index] = val;
		index++;
	}

	public int getLength(){
		return index + 1;
	}

	public int get(int i){
		if(i >= index){
			return -1;
		}else{
			return arr[i];
		}
	}

	public boolean remove(int i){
		if(i >= index){
			return false;
		}

		arr[i] = arr[--index];

		return true;
	}
}