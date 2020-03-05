package sample;

import java.io.IOException;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class OccurCounter {


    /*
     *
     * @author Bruen
     */


//http://shakespeare.mit.edu/macbeth/full.html


    public void OccurrenceCounter(String url)
    {



        Document doc;
        try {
            //Get Document object after parsing the html from given url.
            doc = Jsoup.connect(url).get();

            String htmlString = doc.toString();

            htmlString = html2text(htmlString);

            htmlString = stringCleaner(htmlString);

            String split[] = htmlString.split(" ");

            Map<String, Integer> unsortedMap = new HashMap<>();
            for (String s : split)
            {
                Integer n = unsortedMap.get(s);
                n = (n == null) ? 1 : ++n;
                unsortedMap.put(s, n);
            }

            Map<String, Integer> sortedMap = new LinkedHashMap<>();
            unsortedMap.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));




            Set set = sortedMap.entrySet();

            Iterator iterator = set.iterator();

            int i = 1;

            while (iterator.hasNext() && i <= 20)
            {

                Map.Entry item = (Map.Entry) iterator.next();
                //8
                System.out.println(i + " " + item.getKey() + " appears " + item.getValue() + " times");
                i++;
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }



    public static String html2text(String html)
    {
        return Jsoup.parse(html).text();
    }

    public static String stringCleaner(String inputString)
    {
        return inputString
                .toLowerCase()
                .replaceAll("[^a-zA-Z ]", "")
                .replaceAll("\\<.*?\\>", "")
                .replaceAll("\\.","")
                .trim();
    }
}
