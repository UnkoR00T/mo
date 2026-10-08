package zg;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 {
    public static String a(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            length = objArr.length;
            if (i16 >= length) {
                break;
            }
            Object obj = objArr[i16];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e15) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb5 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb5.append(name);
                    sb5.append("@");
                    sb5.append(hexString);
                    String string2 = sb5.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(string2), (Throwable) e15);
                    String name2 = e15.getClass().getName();
                    StringBuilder sb6 = new StringBuilder(string2.length() + 8 + name2.length() + 1);
                    sb6.append("<");
                    sb6.append(string2);
                    sb6.append(" threw ");
                    sb6.append(name2);
                    sb6.append(">");
                    string = sb6.toString();
                }
            }
            objArr[i16] = string;
            i16++;
        }
        StringBuilder sb7 = new StringBuilder(str.length() + (length * 16));
        int i17 = 0;
        while (true) {
            length2 = objArr.length;
            if (i15 >= length2 || (iIndexOf = str.indexOf("%s", i17)) == -1) {
                break;
            }
            sb7.append((CharSequence) str, i17, iIndexOf);
            sb7.append(objArr[i15]);
            i15++;
            i17 = iIndexOf + 2;
        }
        sb7.append((CharSequence) str, i17, str.length());
        if (i15 < length2) {
            sb7.append(" [");
            sb7.append(objArr[i15]);
            for (int i18 = i15 + 1; i18 < objArr.length; i18++) {
                sb7.append(", ");
                sb7.append(objArr[i18]);
            }
            sb7.append(']');
        }
        return sb7.toString();
    }
}
