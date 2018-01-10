
import parser.parser;
import postRequest.postRequest;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shailesh
 */
public class main {
    public static void main(String[] args) {
        try {
            //input sentense
            String sentence = "नियाग्रा धबधबा हजारो पर्यटक दरवर्षी पाहातात";
            postRequest request = new postRequest();
            String response = request.sendPost(sentence);
            parser parse_response = new parser();
            String posTag = parse_response.parseResult(response);
            System.out.println(posTag);
        } catch (Exception ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
