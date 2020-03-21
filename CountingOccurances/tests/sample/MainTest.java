package sample;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    String url = ("https://www.york.ac.uk/teaching/cws/wws/webpage1.html");
    @org.junit.jupiter.api.Test
    void occurrenceCounter() throws IOException {
        String html = Main.stringUtil.docToString(url);
        html = Main.stringUtil.html2text(html);
        String clean = Main.stringUtil.stringCleaner(html);
        String expected = ("webpage starting    there are lots of ways to create web pages using already coded programmes these lessons will teach you how to use the underlying hypertext markup language  html html isnt computer code but is a language that uses us english to enable texts words images sounds to be inserted and formatting such as colour and centreering to be written in the process is fairly simple the main difficulties often lie in small mistakes  if you slip up while word processing your reader may pick up your typos but the page will still be legible however if your html is inaccurate the page may not appear  writing web pages is at the least very good practice for proof reading learning html will enable you to create your own simple pages read and appreciate pages created by others develop an understanding of the creative and literary implications of webtexts have the confidence to branch out into more complex web design a html web page is made up of tags tags are placed in brackets like this  tag   a tag tells the browser how to display information most tags need to be opened  tag  and closed  tag  to make a simple web page you need to know only four tags  html  tells the browser your page is written in html format  head  this is a kind of preface of vital information that doesnt appear on the screen  title write the title of the web page here  this is the information that viewers see on the upper bar of their screen ive given this page the title webpage  body this is where you put the content of your page the words and pictures that people read on the screen all these tags need to be closed exercise write a simple web page copy out exactly the html below using a wp program such as notepad information in italics indicates where you can insert your own text other information is html and needs to be exact however make sure there are no spaces between the tag brackets and the text inside find notepad by going to the start menu programs accessories notepad  html   head   title  title of page title   head   body write what you like here my first web page or a piece about what you are reading or a few thoughts on the course or copy out a few words from a book or cornflake packet just type in your words using no extras such as bold or italics as these have special html tags although you may use upper and lower case letters and single spaces  body   html  save the file as firsthtml ie call the file anything at all its useful if you start a folder  just as you would for wordprocessing  and call it something like webpages and put your firsthtml file in the folder now  open your browser on netscape the process is top menu file open page choose file click on your webpages folder first file click open and your page should appear on internet explorer top menu file open browse click on your webpages folder first file click open and your page should appear if the page doesnt open go back over your notepad typing and make sure that all the html tags are correct check there are no spaces between tags and internal text check that all tags are closed check that you havent written  htlm  or  bddy  your page will work eventually make another page call it somethingdifferenthtml and place it in the same webpages folder as detailed above start formatting in lesson two back to wws index");
        assertEquals(clean, expected);

    }
    @org.junit.jupiter.api.Test
    void stringCleaner() throws IOException {
        String html = Main.stringUtil.docToString(url);
        html = Main.stringUtil.html2text(html);
        String clean = Main.stringUtil.stringCleaner(html);
        String expected = ("webpage starting    there are lots of ways to create web pages using already coded programmes these lessons will teach you how to use the underlying hypertext markup language  html html isnt computer code but is a language that uses us english to enable texts words images sounds to be inserted and formatting such as colour and centreering to be written in the process is fairly simple the main difficulties often lie in small mistakes  if you slip up while word processing your reader may pick up your typos but the page will still be legible however if your html is inaccurate the page may not appear  writing web pages is at the least very good practice for proof reading learning html will enable you to create your own simple pages read and appreciate pages created by others develop an understanding of the creative and literary implications of webtexts have the confidence to branch out into more complex web design a html web page is made up of tags tags are placed in brackets like this  tag   a tag tells the browser how to display information most tags need to be opened  tag  and closed  tag  to make a simple web page you need to know only four tags  html  tells the browser your page is written in html format  head  this is a kind of preface of vital information that doesnt appear on the screen  title write the title of the web page here  this is the information that viewers see on the upper bar of their screen ive given this page the title webpage  body this is where you put the content of your page the words and pictures that people read on the screen all these tags need to be closed exercise write a simple web page copy out exactly the html below using a wp program such as notepad information in italics indicates where you can insert your own text other information is html and needs to be exact however make sure there are no spaces between the tag brackets and the text inside find notepad by going to the start menu programs accessories notepad  html   head   title  title of page title   head   body write what you like here my first web page or a piece about what you are reading or a few thoughts on the course or copy out a few words from a book or cornflake packet just type in your words using no extras such as bold or italics as these have special html tags although you may use upper and lower case letters and single spaces  body   html  save the file as firsthtml ie call the file anything at all its useful if you start a folder  just as you would for wordprocessing  and call it something like webpages and put your firsthtml file in the folder now  open your browser on netscape the process is top menu file open page choose file click on your webpages folder first file click open and your page should appear on internet explorer top menu file open browse click on your webpages folder first file click open and your page should appear if the page doesnt open go back over your notepad typing and make sure that all the html tags are correct check there are no spaces between tags and internal text check that all tags are closed check that you havent written  htlm  or  bddy  your page will work eventually make another page call it somethingdifferenthtml and place it in the same webpages folder as detailed above start formatting in lesson two back to wws index");
        assertEquals(clean, expected);

    }

    @org.junit.jupiter.api.Test
    void html2text() throws IOException {
       String html = Main.stringUtil.docToString(url);
       html = Main.stringUtil.html2text(html);
       String expected = ("webpage1 STARTING . . . There are lots of ways to create web pages using already coded programmes. These lessons will teach you how to use the underlying HyperText Markup Language - HTML. HTML isn't computer code, but is a language that uses US English to enable texts (words, images, sounds) to be inserted and formatting such as colo(u)r and centre/ering to be written in. The process is fairly simple; the main difficulties often lie in small mistakes - if you slip up while word processing your reader may pick up your typos, but the page will still be legible. However, if your HTML is inaccurate the page may not appear - writing web pages is, at the least, very good practice for proof reading! Learning HTML will enable you to: create your own simple pages read and appreciate pages created by others develop an understanding of the creative and literary implications of web-texts have the confidence to branch out into more complex web design A HTML web page is made up of tags. Tags are placed in brackets like this < tag > . A tag tells the browser how to display information. Most tags need to be opened < tag > and closed < /tag >. To make a simple web page you need to know only four tags: < HTML > tells the browser your page is written in HTML format < HEAD > this is a kind of preface of vital information that doesn't appear on the screen. < TITLE >Write the title of the web page here - this is the information that viewers see on the upper bar of their screen. (I've given this page the title 'webpage1'). < BODY >This is where you put the content of your page, the words and pictures that people read on the screen. All these tags need to be closed. EXERCISE Write a simple web page. Copy out exactly the HTML below, using a WP program such as Notepad. Information in italics indicates where you can insert your own text, other information is HTML and needs to be exact. However, make sure there are no spaces between the tag brackets and the text inside. (Find Notepad by going to the START menu\\ PROGRAMS\\ ACCESSORIES\\ NOTEPAD). < HTML > < HEAD > < TITLE > title of page< /TITLE > < /HEAD > < BODY> write what you like here: 'my first web page', or a piece about what you are reading, or a few thoughts on the course, or copy out a few words from a book or cornflake packet. Just type in your words using no extras such as bold, or italics, as these have special HTML tags, although you may use upper and lower case letters and single spaces. < /BODY > < /HTML > Save the file as 'first.html' (ie. call the file anything at all) It's useful if you start a folder - just as you would for word-processing - and call it something like WEBPAGES, and put your first.html file in the folder. NOW - open your browser. On Netscape the process is: Top menu; FILE\\ OPEN PAGE\\ CHOOSE FILE Click on your WEBPAGES folder\\ FIRST file Click 'open' and your page should appear. On Internet Explorer: Top menu; FILE\\ OPEN\\ BROWSE Click on your WEBPAGES folder\\ FIRST file Click 'open' and your page should appear. If the page doesn't open, go back over your notepad typing and make sure that all the HTML tags are correct. Check there are no spaces between tags and internal text; check that all tags are closed; check that you haven't written < HTLM > or < BDDY >. Your page will work eventually. Make another page. Call it somethingdifferent.html and place it in the same WEBPAGES folder as detailed above. start formatting in lesson two back to wws index");
       assertEquals(html, expected);


    }
    @org.junit.jupiter.api.Test
    void docToString() throws IOException {
        String doc = Main.stringUtil.docToString(url);
        String expected = ("<html>\n" +
                " <head></head>\n" +
                " <body BGCOLOR=\"FFFFFf\" LINK=\"006666\" ALINK=\"8B4513\" VLINK=\"006666\">\n" +
                "  <hmtl>  \n" +
                "   <title>webpage1</title>   \n" +
                "   <table width=\"75%\" align=\"center\"> \n" +
                "    <tbody>\n" +
                "     <tr> \n" +
                "      <td> \n" +
                "       <div align=\"center\">\n" +
                "        <h1>STARTING . . . </h1>\n" +
                "       </div> \n" +
                "       <div align=\"justify\">\n" +
                "        <p>There are lots of ways to create web pages using already coded programmes. These lessons will teach you how to use the underlying HyperText Markup Language - HTML. <br> </p>\n" +
                "        <p>HTML isn't computer code, but is a language that uses US English to enable texts (words, images, sounds) to be inserted and formatting such as colo(u)r and centre/ering to be written in. The process is fairly simple; the main difficulties often lie in small mistakes - if you slip up while word processing your reader may pick up your typos, but the page will still be legible. However, if your HTML is inaccurate the page may not appear - writing web pages is, at the least, very good practice for proof reading!</p> \n" +
                "        <p>Learning HTML will enable you to: </p>\n" +
                "        <ul> \n" +
                "         <li>create your own simple pages </li>\n" +
                "         <li>read and appreciate pages created by others </li>\n" +
                "         <li>develop an understanding of the creative and literary implications of web-texts </li>\n" +
                "         <li>have the confidence to branch out into more complex web design </li>\n" +
                "        </ul>\n" +
                "        <p></p> \n" +
                "        <p>A HTML web page is made up of tags. Tags are placed in brackets like this <b>&lt; tag &gt; </b>. A tag tells the browser how to display information. Most tags need to be opened &lt; tag &gt; and closed &lt; /tag &gt;. </p>\n" +
                "        <p> To make a simple web page you need to know only four tags: </p>\n" +
                "        <ul> \n" +
                "         <li>&lt; HTML &gt; tells the browser your page is written in HTML format </li>\n" +
                "         <li>&lt; HEAD &gt; this is a kind of preface of vital information that doesn't appear on the screen. </li>\n" +
                "         <li>&lt; TITLE &gt;Write the title of the web page here - this is the information that viewers see on the upper bar of their screen. (I've given this page the title 'webpage1'). </li>\n" +
                "         <li>&lt; BODY &gt;This is where you put the content of your page, the words and pictures that people read on the screen. </li>\n" +
                "        </ul> \n" +
                "        <p>All these tags need to be closed. </p>\n" +
                "        <h4>EXERCISE</h4> \n" +
                "        <p>Write a simple web page.</p> \n" +
                "        <p> Copy out exactly the HTML below, using a WP program such as Notepad.<br> Information in <i>italics</i> indicates where you can insert your own text, other information is HTML and needs to be exact. However, make sure there are no spaces between the tag brackets and the text inside.<br> (Find Notepad by going to the START menu\\ PROGRAMS\\ ACCESSORIES\\ NOTEPAD). </p>\n" +
                "        <p> &lt; HTML &gt;<br> &lt; HEAD &gt;<br> &lt; TITLE &gt;<i> title of page</i>&lt; /TITLE &gt;<br> &lt; /HEAD &gt;<br> &lt; BODY&gt;<br> <i> write what you like here: 'my first web page', or a piece about what you are reading, or a few thoughts on the course, or copy out a few words from a book or cornflake packet. Just type in your words using no extras such as bold, or italics, as these have special HTML tags, although you may use upper and lower case letters and single spaces. </i><br> &lt; /BODY &gt;<br> &lt; /HTML &gt;<br> </p>\n" +
                "        <p>Save the file as 'first.html' (ie. call the file anything at all) It's useful if you start a folder - just as you would for word-processing - and call it something like WEBPAGES, and put your first.html file in the folder. </p>\n" +
                "        <p>NOW - open your browser.<br> On Netscape the process is: <br> Top menu; FILE\\ OPEN PAGE\\ CHOOSE FILE<br> Click on your WEBPAGES folder\\ FIRST file<br> Click 'open' and your page should appear. </p>\n" +
                "        <p>On Internet Explorer: <br> Top menu; FILE\\ OPEN\\ BROWSE <br> Click on your WEBPAGES folder\\ FIRST file<br> Click 'open' and your page should appear.<br> </p>\n" +
                "        <p>If the page doesn't open, go back over your notepad typing and make sure that all the HTML tags are correct. Check there are no spaces between tags and internal text; check that all tags are closed; check that you haven't written &lt; HTLM &gt; or &lt; BDDY &gt;. Your page will work eventually. </p>\n" +
                "        <p> Make another page. Call it somethingdifferent.html and place it in the same WEBPAGES folder as detailed above. </p>\n" +
                "        <p>start formatting in <a href=\"webpage2.html\">lesson two</a> <br><a href=\"col3.html\">back to wws index</a> </p> \n" +
                "        <p></p> \n" +
                "       </div> </td> \n" +
                "     </tr> \n" +
                "    </tbody>\n" +
                "   </table>  \n" +
                "  </hmtl>\n" +
                " </body>\n" +
                "</html>");

        assertEquals(doc, expected);


    }

}