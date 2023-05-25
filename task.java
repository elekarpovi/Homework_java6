import java.util.*;


public class task {
    public static void main(String[] args) {

        Set<Notebook> setNotebooks = new HashSet<>();

        setNotebooks.add(new Notebook("Sony", 4, 512, "Windows", "black"));
        setNotebooks.add(new Notebook("ASUS", 8, 512, "Windows", "grey"));
        setNotebooks.add(new Notebook("ASUS", 8, 1024, "Windows", "black"));
        setNotebooks.add(new Notebook("Lenovo", 16, 512, "Windows", "black"));
        setNotebooks.add(new Notebook("Sony", 8, 512, "Windows", "white"));
        
        setNotebooksFilter(setNotebooks, createFilter());
    }

    public static void setNotebooksFilter(Set<Notebook> setNotebooks, Notebook filterNotebook) {
        for (Notebook notes : setNotebooks) {
            if (notes.getBrand().contains(filterNotebook.getBrand()) 
                    && notes.getNotebook_ram() >= filterNotebook.getNotebook_ram() 
                    && notes.getNotebook_hdd() >= filterNotebook.getNotebook_hdd() 
                    && notes.getOs().contains(filterNotebook.getOs()) 
                    && notes.getNotebook_colour().contains(filterNotebook.getNotebook_colour()));
            System.out.println(notes);
        }
    }

    public static Notebook createFilter() {
        Notebook filterNotebook = new Notebook("", 0, 0, "", "");
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Выберите параметры фильтра:");
            System.out.println("1 - Бренд ноутбука");
            System.out.println("2 - Размер ОЗУ");
            System.out.println("3 - Размер ЖД");
            System.out.println("4 - OC");
            System.out.println("5 - Цвет");
            System.out.println("6 - Применить фильтр");
            System.out.print("-->");
            switch (scanner.nextInt()) {
                case 1:
                    filterNotebook.setBrand(parameterValue("Бренд ноутбука"));
                    break;
                case 2:
                    filterNotebook.setNotebook_ram(0); Integer.parseInt(parameterValue("ОЗУ в ГБайтах"));
                    break;
                case 3:
                    filterNotebook.setNotebook_hdd(0); Integer.parseInt(parameterValue("ЖД в ГБайтах"));
                    break;
                case 4:
                    filterNotebook.setOs(parameterValue("ОС"));
                    break;
                case 5:
                    filterNotebook.setNotebook_colour(null); parameterValue("Цвет");
                    break;
                default:
                    flag = false;
                    break;
            }
        }
        return filterNotebook;
    }

    private static String parameterValue(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Значение поля " + text + ":");
        return scanner.nextLine();
    }
}