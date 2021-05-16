package com.javastart.StrukturySterujace.Cw2;

public class NumberService {

    public void wylosujLiczbe(){
       int value;
       value = (int)(Math.random()*10000);
        System.out.println("Wylosowana liczba: "+value);
        if (value<5000){
            System.out.println("Liczba "+value+" jest mniejsza od 5000");
        }else if (value>5000) {
            System.out.println("Liczba "+value+" jest większa od 5000");
        }else
            System.out.println("Liczbą jest równa 5000");

        if (value%2 == 0){
            System.out.println("Lczba "+value+" jest parzysta");
        }else
            System.out.println("Liczba "+value+" jest nieparzysta");

        zmodyfikujLiczbe(value);
    }

    private void zmodyfikujLiczbe(int wrt){
        int liczba = wrt;
        if(wrt != 0) {
            int liczbaCyfr = 0;

            while (liczba != 0){
            liczba = liczba/10;
            liczbaCyfr++;
            }

            if (liczbaCyfr<4){
                wrt = (int)(wrt* Math.pow(10,4-liczbaCyfr));
            }
        }
        show(wrt);
    }

    private void show(int wrt){
        System.out.println("Liczba uzupełniona do 4 cyfr: "+wrt);
    }


}
