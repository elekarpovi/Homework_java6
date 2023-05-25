/*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет 
ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, 
соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации 
можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.*/

public class Notebook {
    
    private String brand;
    private int notebook_ram;
    private int notebook_hdd;
    private String os;
    private String notebook_colour;
    
    Notebook(String brand, Integer notebook_ram, Integer notebook_hdd, String os, String notebook_colour) {
        this.brand = brand.toUpperCase();
        this.notebook_ram = notebook_ram;
        this.notebook_hdd = notebook_hdd;
        this.os = os.toUpperCase();
        this.notebook_colour = notebook_colour.toUpperCase();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand.toUpperCase();
    }

    public Integer getNotebook_ram() {
        return notebook_ram;
    }

    public void setNotebook_ram(int notebook_ram) {
        this.notebook_ram = notebook_ram;
    }

    public Integer getNotebook_hdd() {
        return notebook_hdd;
    }

    public void setNotebook_hdd(int notebook_hdd) {
        this.notebook_hdd = notebook_hdd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os.toUpperCase();
    }

    public String getNotebook_colour() {
        return notebook_colour;
    }

    public void setNotebook_colour(String notebook_colour) {
        this.notebook_colour = notebook_colour.toUpperCase();
    }

    @Override
    public String toString() {
        return "\n" + brand + "_" + "_RAM_" + notebook_ram + "_HDD_"
                + notebook_hdd + "_" + os + "_colour_" + notebook_colour;
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + 3 * notebook_ram + 7 * notebook_hdd
                + 11 * os.hashCode() + 13 * notebook_colour.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notebook)) {
            return false;
        }
        Notebook notebook = (Notebook) obj;
        return brand.equals(notebook.brand) && notebook_ram == notebook.notebook_ram 
               && notebook_hdd == notebook.notebook_hdd && os.equals(notebook.os) 
               && notebook_colour.equals(notebook.notebook_colour);
    }
}