package book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this); // Инициализация моков перед каждым тестом
    }

    @Test
    public void testFindBookById() {
        // Создаем мок объект Book
        Book expectedBook = new Book("1", "Book1", "Author1");

        // Определяем поведение мок объекта
        Mockito.when(bookRepository.findById("1")).thenReturn(expectedBook);

        // Вызываем метод, который тестируем
        Book actualBook = bookService.findBookById("1");

        // Проверяем, что метод вернул ожидаемую книгу
        assertEquals(expectedBook, actualBook);
    }

    @Test
    public void testFindAllBooks() {
        // Создаем мок объекты Book
        Book book1 = new Book("1", "Book1", "Author1");
        Book book2 = new Book("2", "Book2", "Author2");

        // Определяем поведение мок объекта
        Mockito.when(bookRepository.findAll()).thenReturn(Arrays.asList(book1, book2));

        // Вызываем метод, который тестируем
        List<Book> actualBooks = bookService.findAllBooks();

        // Проверяем, что метод вернул ожидаемый список книг
        assertEquals(Arrays.asList(book1, book2), actualBooks);
    }
}
