public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Фёдор", "Достоевский");
        Book book1 = new Book("Игрок", 1866, author1 );
        Author author2 = new Author("Дейл", "Карнеги");
        Book book2 = new Book("Как завоевывать друзей и оказывать влияние на людей", 1936, author2);
        System.out.println("Год издания книги "+book1.getName()+"-"+book1.getYear()+" ; Автор книги: "+book1.getAuthor().getName()+ " "+book1.getAuthor().getSurname());
        System.out.println("Год издания книги "+book2.getName()+"-"+book2.getYear()+" ; Автор книги: "+book2.getAuthor().getName()+ " "+book2.getAuthor().getSurname());
    }

}