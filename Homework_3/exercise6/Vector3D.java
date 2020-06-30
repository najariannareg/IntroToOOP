
public class Vector3D {
	
	public int[] vector;
	
	public Vector3D vectorProduct(Vector3D vector2) {
		Vector3D vectorProduct = new Vector3D();
		vectorProduct.vector = new int[this.vector.length];
		for(int i = 0; i < this.vector.length; i++) {
			vectorProduct.vector[i] = this.vector[i] * vector2.vector[i];
		}
		return vectorProduct;
	}
	
	public void printVector() {
		for(int i = 0; i < this.vector.length; i++) {
			System.out.print(this.vector[i] + " ");
		}
	}
	
}
