package fh;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class il {
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
                    String str2 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e15);
                    string = "<" + str2 + " threw " + e15.getClass().getName() + ">";
                }
            }
            objArr[i16] = string;
            i16++;
        }
        StringBuilder sb5 = new StringBuilder(str.length() + (length * 16));
        int i17 = 0;
        while (true) {
            length2 = objArr.length;
            if (i15 >= length2 || (iIndexOf = str.indexOf("%s", i17)) == -1) {
                break;
            }
            sb5.append((CharSequence) str, i17, iIndexOf);
            sb5.append(objArr[i15]);
            i15++;
            i17 = iIndexOf + 2;
        }
        sb5.append((CharSequence) str, i17, str.length());
        if (i15 < length2) {
            sb5.append(" [");
            sb5.append(objArr[i15]);
            for (int i18 = i15 + 1; i18 < objArr.length; i18++) {
                sb5.append(", ");
                sb5.append(objArr[i18]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }

    public static boolean b(String str) {
        return str == null || str.isEmpty();
    }
}
