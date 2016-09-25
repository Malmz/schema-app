package schema;

import java.io.IOException;

import org.apache.pdfbox.cos.COSArray;
import org.apache.pdfbox.cos.COSBoolean;
import org.apache.pdfbox.cos.COSDictionary;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.cos.COSFloat;
import org.apache.pdfbox.cos.COSInteger;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.cos.COSNull;
import org.apache.pdfbox.cos.COSStream;
import org.apache.pdfbox.cos.COSString;
import org.apache.pdfbox.cos.ICOSVisitor;

public class MyVisitor implements ICOSVisitor {

	@Override
	public Object visitFromArray(COSArray arg0) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(arg0);
		return null;
	}

	@Override
	public Object visitFromBoolean(COSBoolean arg0) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(arg0);
		return null;
	}

	@Override
	public Object visitFromDictionary(COSDictionary arg0) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(arg0);
		return null;
	}

	@Override
	public Object visitFromDocument(COSDocument arg0) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(arg0);
		return null;
	}

	@Override
	public Object visitFromFloat(COSFloat arg0) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(arg0);
		return null;
	}

	@Override
	public Object visitFromInt(COSInteger arg0) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(arg0);
		return null;
	}

	@Override
	public Object visitFromName(COSName arg0) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(arg0);
		return null;
	}

	@Override
	public Object visitFromNull(COSNull arg0) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(arg0);
		return null;
	}

	@Override
	public Object visitFromStream(COSStream arg0) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(arg0);
		return null;
	}

	@Override
	public Object visitFromString(COSString arg0) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(arg0);
		return null;
	}

}
