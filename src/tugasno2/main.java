//hadinata
package tugasno2;

import java.util.Scanner;


class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Scanner y =new Scanner(System.in);
        int pilihan=0, balance,n=0,i,pilihan1,pilihan2;
        account akun[] = new account[5];
        String nama,id;

        while (pilihan!=6) {
            System.out.println("1.Register akun \n2.Kredit \n3.Debit \n4.Transfer \n5.lihat semua akun \n6.Keluar");
            System.out.println("Masukan Pilihan Anda : ");
            pilihan = x.nextInt();
            switch (pilihan) {
                case 1: {
                    System.out.println("Masukan nama: ");
                    nama = y.nextLine();
                    System.out.println("masukan balance : ");
                    balance = x.nextInt();
                    System.out.println("masukan id : ");
                    id = y.nextLine();
                    akun[n] = new account(id,nama,balance);
                    n+=1;

                }break;
                case 2: {
                    if (n == 0){
                        System.out.println("Belum Ada Akun Terdaftar, harap membuat akun terlebih dahulu");
                    }
                    else {
                        System.out.println("pilih akun : ");
                        for(i=0;i<n;i++) {
                            System.out.println(i+1 + ". " + akun[i].getID() + " a/n " + akun[i].getName());
                        }
                        pilihan1 = x.nextInt();
                        System.out.println("masukan amount: ");
                        int amount = x.nextInt();
                        System.out.println("credit berhasil, balance: " + akun[pilihan1-1].credit(amount));
                    }
                } break;
                case 3: {
                    if (n == 0){
                        System.out.println("Belum Ada Akun Terdaftar, harap membuat akun terlebih dahulu");
                    }
                    else {
                        System.out.println("pilih akun : ");
                        for(i=0;i<n;i++) {
                            System.out.println(i+1 + ". " + akun[i].getID() + " a/n " + akun[i].getName());
                        }
                        pilihan1 = x.nextInt();
                        System.out.println("masukan amount: ");
                        int amount = x.nextInt();
                        if(amount > akun[pilihan1-1].getBalance()){
                            System.out.println("balance anda tidak mencukupi");
                        }
                        else {
                            System.out.println("debit berhasil, balance: " + akun[pilihan1 - 1].debit(amount));
                        }
                    }
                } break;
                case 4: {
                    if (n == 0){
                        System.out.println("Belum Ada Akun Terdaftar, harap membuat akun terlebih dahulu");
                    }
                    else {
                        System.out.println("pilih akun : ");
                        for(i=0;i<n;i++) {
                            System.out.println(i+1 + ". " + akun[i].getID() + " a/n " + akun[i].getName());
                        }
                        pilihan1 = x.nextInt();
                        System.out.println("transfer ke : ");
                        for(i=0;i<n;i++) {
                            System.out.println(i+1 + ". " + akun[i].getID() + " a/n " + akun[i].getName());
                        }
                        pilihan2 = x.nextInt();
                        System.out.println("masukan amount yang ingin di transfer: ");
                        int amount = x.nextInt();
                        if(amount > akun[pilihan1-1].getBalance()){
                            System.out.println("balance anda tidak mencukupi");
                        }
                        else {
                            System.out.println("transfer berhasil, balance: " + akun[pilihan1 - 1].transferTo(akun[pilihan2-1],amount));
                        }
                    }
                } break;
                case 5: {
                    if (n == 0){
                        System.out.println("Belum Ada Akun Terdaftar, harap membuat akun terlebih dahulu");
                    }
                    else {
                        for(i=0;i<n;i++){
                            System.out.println(akun[i].toString());
                        }
                    }
                } break;
            }
        }
    }
}







