public class Main {
    public static void main(String[] args) {
        /* ЗАДАНИЕ
        Напишите небольшой библиотечный справочник, где хранится информация о книгах.
        1. Создайте класс Book, который будет содержать в себе данные о названии, авторе и годе публикации книги.
        Убедитесь, что типы полей класса Book выбраны правильно: это String, Author и int.
        2. Создайте класс Author , который содержит в себе данные об имени и фамилии автора.
        3. Напишите конструкторы для обоих классов, заполняющие все поля.
        4. Создайте геттеры для всех полей автора и всех полей книги.
        5. Создайте сеттер для поля «Год публикации» у книги.
        6. В методе main создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор» (достаточно тоже двух)
        и инициализируйте их. Учтите, что авторы являются обязательными и книги не могут создаваться без авторов.
        Метод main не должен находиться в классах Book и Author.
        Создайте отдельный класс для запуска приложения и объявите метод main в нем.
        7. В том же методе main измените год публикации одной из книг с помощью сеттера. */

        Author burryBurd = new Author("Burry", "Burd");
        Author lewisCarrol = new Author("Lewis", "Carrol");

        Book java = new Book("Java for dummies", burryBurd, 2022);
        Book alice = new Book("Alice’s Adventures in Wonderland", lewisCarrol, 1865);

        System.out.println("alice.publicationYear = " + alice.getPublicationYear());

        alice.setPublicationYear(1966);

        System.out.println("alice.PublicationYear = " + alice.getPublicationYear());

        System.out.println("alice.getAuthor = " + alice.getAuthor().getName() + " " + alice.getAuthor().getSurname());

    }
}