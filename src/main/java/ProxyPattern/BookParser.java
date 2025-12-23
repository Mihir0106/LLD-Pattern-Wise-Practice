package ProxyPattern;

import ProxyPattern.Interface.IBookParser;

public class BookParser implements IBookParser {

    Book book;

    public BookParser(Book book){
        this.book = book;
    }


    @Override
    public int getNumPages() {
        return 0;
    }
}
