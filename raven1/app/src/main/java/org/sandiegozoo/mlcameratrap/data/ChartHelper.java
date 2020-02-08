package org.sandiegozoo.mlcameratrap.data;

import android.graphics.Color;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

public class ChartHelper {

    public void displayLineGraph(LineChart chart)
    {
        List<Entry> entries = new ArrayList<>();

        for (int x = 0; x< 30; x++)
        {
            entries.add(new Entry(x, (float) Math.sin(x)));
        }

        LineDataSet dataSet = new LineDataSet(entries, "Sine graph");
        dataSet.setColor(Color.GREEN);
        dataSet.setValueTextColor(Color.BLUE);
        dataSet.setCircleColor(Color.BLACK);

        LineData lineData = new LineData(dataSet);
        chart.setData(lineData);
        chart.setMinimumHeight(800);
        chart.setDoubleTapToZoomEnabled(false);
        chart.invalidate();  // refresh view
    }
}
