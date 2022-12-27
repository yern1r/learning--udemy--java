package OOP.Collections;

public class Collection {
    private String[] array = new String[10];//size of array = 10
    private  int size = 0; // number of element = 0; no elements there

    public void add(String s){ //from this method we take
        // string and put it in array with index "size"
        // size is 0 means first element in array
        // => has value which we input in "s"
        array[size] = s; //array[0] = string s
        size++;// go to next element

        if (size == array.length){//when size equals to array.length there is no place for next value
            String[] newArray = new String[array.length * 2];//then we should increase it
            for (int i = 0 ; i < array.length; i++){// copying from first array to second new array
                newArray[i] = array[i];// we give all values from array to new array , and we have free places
            }
            array = newArray;// and we give modified new array to first array which used before
        }
    }
    //it will not return anything
    //method will do his function
        public void removeFromArray (int index) { //remove values from array with given index
            if (index >= 0 && index < size) {
                for (int i = index; i < size - 1; i++) {// if our index is 6
                    array[i] = array[i + 1];//6th element take value of 7 , then 7 take value of 8
                }
                size--;//we removed one element so size is also
            }
        }

        public void removeFromArray(String s){//remove by string values
        int index = -1;//we dont know index , but we can give impossible value for this case
        for (int i = 0 ; i <size; i++){//go through from first element to last element
            if (s.equals(array[i])){//check if string value which was giving in parameters "s"
                //"s" equals to value string of array at index i
                index = i; //then we find the index and give it to this index which was -1
                break;
            }
        }
        if (index != -1){//in this case there is no element with such string value
            removeFromArray(index);//so just return array
        }
        }
    public int getSize() {// in order to know how many elements in array
        return size;
    }
    public String get(int index) { //this method will return element of array by index of element
        if (index >= 0 && index < size) {
            return array[index];
        }else {return "Not found";}
    }
}

class RunCollection{
    public static void main(String[] args) {
        Collection employees = new Collection();
        employees.add("Nikita");
        employees.add("Egor");
        employees.add("Ivan");
        employees.add("Nikita");
        employees.add("Max");
        employees.add("Alex");
        employees.add("Nikita");
        employees.add("Sancho");

        //employees.removeFromArray(3);
        //employees.removeFromArray("Max");
        employees.removeFromArray("Fred");
        //for (int i = 1; i <= 20 ; i++){
          //  employees.add("Worker" + i);
       // }
        for (int i = 0; i < employees.getSize(); i++){// to OOP.Object.OOP.output employees
            // getSize() - to return quantity of elements in array
            System.out.println(employees.get(i));
            //get() - return string value by index
        }
    }
}
