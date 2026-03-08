package com.workintech.developers;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;


    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[5];
        this.midDevelopers = new MidDeveloper[5];
        this.seniorDevelopers = new SeniorDeveloper[5];
    }
    @Override
    public void work(){
        System.out.println("JuniorDeveloper starts to working");
        setSalary(8.500);
    }

    public void addEmployee(int index, JuniorDeveloper developer) {

        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Hata: Belirtilen indeks dizinin sınırları dışında!");
        }

        else if (juniorDevelopers[index] == null) {
            juniorDevelopers[index] = developer;
            System.out.println("Junior Developer başarıyla eklendi.");
        }

        else {
            System.out.println("Uyarı: İlgili indeks zaten dolu. İçerideki veri ezilmedi.");
        }
    }

    public void addEmployee(int index, MidDeveloper developer) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Hata: Belirtilen indeks dizinin sınırları dışında!");
        } else if (midDevelopers[index] == null) {
            midDevelopers[index] = developer;
            System.out.println("Mid Developer başarıyla eklendi.");
        } else {
            System.out.println("Uyarı: İlgili indeks zaten dolu. İçerideki veri ezilmedi.");
        }
    }

    public void addEmployee(int index, SeniorDeveloper developer) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Hata: Belirtilen indeks dizinin sınırları dışında!");
        } else if (seniorDevelopers[index] == null) {
            seniorDevelopers[index] = developer;
            System.out.println("Senior Developer başarıyla eklendi.");
        } else {
            System.out.println("Uyarı: İlgili indeks zaten dolu. İçerideki veri ezilmedi.");
        }
    }


}
