package Main;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class Reduce extends Reducer<Text, IntWritable, Text, IntWritable> {
    

    @Override
    public void reduce(Text word, Iterable<IntWritable> values, Context con) throws IOException, InterruptedException {

        int sum = 0;

        for (IntWritable value : values) {

            sum += value.get();
        }
        String sonuc = Islem.islemler(String.valueOf(word).toLowerCase(), sum);

        if (sonuc != null) {
            String[] a = sonuc.split("///");
            String tur = a[0];
            int deger = Integer.parseInt(a[1]);

            sum = deger;

            Text t = new Text(tur);

            word = t;
        } else {
            Text t = new Text("Error");
            word = t;
            sum = -1;
        }
        con.write(word, new IntWritable(sum));

    }

}
