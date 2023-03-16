package String;

public class StringPractice {

    public static void main(String[] args) {
        String name = new String("Pooja");
        //We can use new keyword to create String & assign value as shown above
        //2 objects will be created one in heap and other in string constant pool (SCP)
        //And reference variable name will be created in stack
        // So far we have 2 objects(1 in heap(Pooja)+ 1 in SCP(Pooja))
        System.out.println(name); // o/p is Pooja
        String name1 = "Anjuli";
        //We can create String & assign value in this way also
        // 1 object will be created in heap and reference variable name1 will be in stack
        //// So far we have 3 objects(1 in heap(Pooja)+ 1 in SCP(Pooja)+1 more in SCP (Anjuli)
        System.out.println(name1); // o/p is Anjuli
        name1 = "Ankita"; //re-assign value Ankita to variable name1
        //After this statement new object will be created in SCP with value Ankita and name1 will point to Ankita
        //And old reference will be lost now name1 will point to Ankita and name to Pooja
        //And Anjuli will be still there in SCP however no reference will be there
        //So in SCP we have 3 objects (Pooja Anjuli and Ankita but Anjuli will have no reference variable pointing to it)
        // And Anjuli will be deleted by GC when memory is full or GC is called explicitly in program by programmer
        //why String is called immutable in java?
        //String is called immutable because value cannot be changed once assigned however when we re-assign
        //value then variable refers to new value but old value still exists in SCP until collected by GC
        System.out.println(name1); // o/p is Ankita for name1 now
    }

}
