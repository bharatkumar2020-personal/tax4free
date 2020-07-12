package formulas;

/**
 * 
 * @author Bharat Kumar
 *
 */
public class Table {
	
	private String[] ids;
	private double[] values;
	private long size;
	
	public Table() {
		this.size = 0;
	}
	
	public Table(Table table) {
		this.ids = table.getIds();
		this.values = table.getValues();
		this.size = table.getSize();
	}
	
	public void add(String id, double value) {
		if (this.size <= 0) {
			ids = new String[1];
			ids[0] = id;
			values = new double[1];
			values[0] = value;
			this.size = 1;
			return;
		}
		
		int index = this.search(id);
		if (index != -1) {
			this.values[index] += value;
			return;
		}
		
		int sizeTemp = this.ids.length;
		
		int currentSize = (int) (this.size);
		
		if (this.size < sizeTemp) {
			this.ids[currentSize] = id;
			this.values[currentSize] = value;
			this.size++;
			return;
		}
		
		int newSize = 2 * currentSize;
		
		String[] tmpIds = new String[newSize];
		double[] tmpValues = new double[newSize];
		
		for (int i = 0; i < currentSize; i++) {
			tmpIds[i] = this.ids[i];
			tmpValues[i] = this.values[i];
		}
		
		tmpIds[currentSize] = id;
		tmpValues[currentSize] = value;
		
		this.ids = tmpIds;
		this.values = tmpValues;
		this.size++;
	}
	
	public int search(String id) {
		for (int i = 0; i < this.size; i++) {
			if (this.ids[i] != null && this.ids.equals(id)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public double getValue(String id) throws Exception {
		int index = this.search(id);
		if (index == -1) {
			throw new Exception();
		}
		return this.values[index];
	}
	
	public String[] getIds() {
		return this.ids;
	}
	
	public double[] getValues() {
		return this.values;
	}
	
	public long getSize() {
		return this.size;
	}
}
