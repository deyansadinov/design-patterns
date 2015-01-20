package task3.poolpattern;



/**
 * @author Deyan Sadinov <sadinov88@gmail.com>
 */
public class Main {
  public static void main(String[] args) {


    Book book = new Book("Deyan Sadinov","How to be a good programmer");

    MyPoolObject<Book> pool = new MyPoolObject<>(book,3);

    pool.acquire();
    pool.acquire();
    pool.acquire();

    pool.release();
    pool.release();

    pool.acquire();
    pool.acquire();







  }
}
