package Util.Classes;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class UpperDocument extends PlainDocument {

    private int maxLength;

    public UpperDocument(int maxlen) {
        super();
        if (maxlen <= 0) {
            throw new IllegalArgumentException("You must specify a maximum length!");
        }
        maxLength = maxlen;
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr)
            throws BadLocationException {
        if (str == null || getLength() == maxLength) {
            return;
        }
        int totalLen = (getLength() + str.length());
        if (totalLen <= maxLength) {
            super.insertString(offset, str.toUpperCase(), attr);
            return;
        }
        String newStr = str.substring(0, (maxLength - getLength()));
        super.insertString(offset, newStr, attr);
    }
}
