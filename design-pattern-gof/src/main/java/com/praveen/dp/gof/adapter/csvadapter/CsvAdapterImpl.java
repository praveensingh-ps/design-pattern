package com.praveen.dp.gof.adapter.csvadapter;

import com.praveen.dp.gof.adapter.adaptee.CsvFormattable;
import com.praveen.dp.gof.adapter.source.TextFormattable;

public class CsvAdapterImpl implements TextFormattable {
    CsvFormattable csvFormatter;
    public CsvAdapterImpl(CsvFormattable csvFormatter){
        this.csvFormatter=csvFormatter;
    }
    @Override
    public String formatText(String text)
    {
        String formattedText=csvFormatter.formatCsvText(text);
        return formattedText;
    }
}
