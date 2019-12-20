package com.bridgelabzs;

import java.io.Reader;
import java.util.Iterator;
import java.util.List;

public interface ICSVBuilder<E> {

    public List getCSVFileList(Reader reader, Class csvClass) throws CSVBuilderException;
    public Iterator getCSVFileIterator(Reader reader, Class csvClass) throws CSVBuilderException;

}
