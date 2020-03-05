package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;




public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;

    String url = ("http://shakespeare.mit.edu/macbeth/full.html");
    @Override
    public void start(Stage primaryStage) throws Exception{

        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //primaryStage.setTitle("Hello World");
        //primaryStage.setScene(new Scene(root, 800,500));
        //primaryStage.show();


        window = primaryStage;
        window.setTitle("Occurrence Counter");
        TextArea ta = new TextArea();
        ta.setPrefRowCount(22);


        System.setOut(new PrintStream(new OutputStream() {

            @Override
            public void write(int b) throws IOException {
                ta.appendText("" + ((char)b));
            }

            @Override
            public void write(byte[] b) throws IOException {
                ta.appendText(new String(b));
            }

            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                ta.appendText(new String(b, off, len));
            }
        }));


        TextField urlInput = new TextField(url);
        button = new Button("Generate Occurrences");
        button.setOnAction(event -> {
            url = urlInput.getText();
            OccurrenceCounter(url);
        });

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(urlInput, button, ta);


        scene = new Scene(layout, 300,500);
        window.setScene(scene);
        window.show();



    }


    public static void main(String[] args) {

        launch(args);
    }

    public static void OccurrenceCounter(String url)
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
