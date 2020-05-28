package Reg;

import java.awt.*;
import java.awt.datatransfer.StringSelection;

public class clipboard {
    public static void setClipboard(String str) {
        StringSelection ss = new StringSelection(str);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    }
}
