package lesson6;

public class Exist {

    public void ExistByProduct (Products [] list, String type){

        int count = 0;

        for (Products products : list) {
            if (products.exist) {
                count++;
            }
        } System.out.println(count);
    }
}
