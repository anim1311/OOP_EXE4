import java.util.Arrays;

public class MyArray {
    
    
    private int capacity = 4;
    private int size = 0;
    private double values[];
    

    MyArray() {
        values = new double[capacity];
    }

    MyArray(MyArray other) {
        this.capacity = other.getSize();
        this.size = other.getSize();
        values = new double[other.getSize()];
        System.arraycopy(other.getValues(), 0, values, 0, other.getSize());
    }

    MyArray(double values[]) {
        
        capacity = values.length;
        size = values.length;
        this.values = new double[capacity];
        System.arraycopy(values, 0, this.values, 0, this.size);
        

    }

    public void addValue(double value) {
        
        if(size == capacity) {
            capacity *= 2;
            double newValues[] = new double[capacity];
            for(int i = 0; i < size; i++) {
                newValues[i] = values[i];
            }
            values = newValues;
        }
        values[size] = value;
        size++;

    }

    public void setValueAt(int index, double value) {
        
        if(index < 0 || index >= size) {
            return;
        }
        values[index] = value;

    }

    public double getValueAt(int index) {
        
        if(index < 0 || index >= size) {
            return -1;
        }
        return values[index];

    }

    public double getMedian(){

        double temp[] = new double[size];
        System.arraycopy(values,0,temp,0,size);
        Arrays.sort(temp);

        if (temp.length % 2 == 0) {
            return (temp[(temp.length / 2) - 1] + temp[temp.length / 2]) / 2.0;
        } else {
            return temp[temp.length / 2];
        }
        
    }

    public double getMean(){

        double sum = 0;
        for(int i = 0; i < size; i++) {
            sum += values[i];
        }
        return sum / size;
    }

    public int getSize() {
        return size;
    }

    public double[] getValues(){
        return values;
    }

    public double[] getSortedArray(){
        
        double temp[] = new double[size];
        System.arraycopy(values, 0, temp, 0, size);
        Arrays.sort(temp);
        return temp;
    }

    public double getMax(){
            
        double max = values[0];
        for(int i = 1; i < size; i++) {
            if(values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    public double getMin(){
            
        double min = values[0];
        for(int i = 1; i < size; i++) {
            if(values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    public double[] getPartialArray(int startInd, int endInd){

        double temp[] = new double[endInd - startInd + 1];
        if(startInd < 0 || endInd >= size || startInd > endInd) {
            return temp;
        }
       
        System.arraycopy(values, startInd, temp, 0, endInd - startInd + 1);
        return temp;
    }

    public boolean equals(MyArray other) {
        
        for(int i = 0; i < size; i++) {
            if(values[i] != other.getValueAt(i)) {
                return false;
            }
        }
        return true;
    }



}
