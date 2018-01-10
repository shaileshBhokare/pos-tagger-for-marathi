package parser;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shailesh
 */
public class parser {
    public String parseResult(String fullhtml) {
        
        Document doc = Jsoup.parseBodyFragment(fullhtml);
        Elements usefull_ele = doc.getElementsByClass("success");
        for (Element usefull_ele1 : usefull_ele) {
           return usefull_ele1.text();
        }
        return "Something went wrong";
    }
}
