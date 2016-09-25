package schema;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.cos.COSObject;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Schema {
	
	static String getText(File pdfFile) throws IOException {
	    PDDocument doc = PDDocument.load(pdfFile);
	    
	    List<COSObject> list = doc.getDocument().getObjects();
	    for (int i = 0; i < list.size(); i++) {
			COSObject o = list.get(i);
			o.accept(new MyVisitor());
			System.out.println(o);
			//new PDFTextStripper().getText(o);
		}
	    return new PDFTextStripper().getText(doc);
	}
	
	public static void main(String[] args) {
		try {
		    String text = getText(new File("C:/Users/Malmz/Downloads/test.pdf"));
		    //System.out.println("Text in PDF: " + text);
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}

}
