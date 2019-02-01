package com.praveen.dp.gof.adapter.source;

import org.junit.Test;

import com.praveen.dp.gof.adapter.adaptee.CsvFormattable;
import com.praveen.dp.gof.adapter.adaptee.CsvFormatter;
import com.praveen.dp.gof.adapter.csvadapter.CsvAdapterImpl;
import com.praveen.dp.gof.adapter.source.NewLineFormatter;
import com.praveen.dp.gof.adapter.source.TextFormattable;

import static org.junit.Assert.*;


public class NewLineFormatterTest {
    @Test
    public void testFormatText() throws Exception {

            String testString=" Formatting line 1. Formatting line 2. Formatting line 3.";
            TextFormattable newLineFormatter=new NewLineFormatter();
            String resultString = newLineFormatter.formatText(testString);
            System.out.println(resultString);

            CsvFormattable csvFormatter=new CsvFormatter();
            TextFormattable csvAdapter=new CsvAdapterImpl(csvFormatter);
            String resultCsvString=csvAdapter.formatText(testString);
            System.out.println(resultCsvString);
    }
}