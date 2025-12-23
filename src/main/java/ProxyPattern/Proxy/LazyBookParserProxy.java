package ProxyPattern.Proxy;

import ProxyPattern.Book;
import ProxyPattern.BookParser;
import ProxyPattern.Interface.IBookParser;

public class LazyBookParserProxy implements IBookParser {

    BookParser parser = null;
    Book book;

    public LazyBookParserProxy(Book book){
        this.book = book;
    }


    @Override
    public int getNumPages() {
        if(parser == null){
            parser = new BookParser(book);
        }

        return parser.getNumPages();
    }
}
