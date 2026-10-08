package xg;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class u {
    public static String a(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb5 = new StringBuilder(str.length() + (objArr.length * 16));
        int i15 = 0;
        int i16 = 0;
        while (true) {
            length = objArr.length;
            if (i15 >= length || (iIndexOf = str.indexOf("%s", i16)) == -1) {
                break;
            }
            sb5.append((CharSequence) str, i16, iIndexOf);
            sb5.append(b(objArr[i15]));
            i16 = iIndexOf + 2;
            i15++;
        }
        sb5.append((CharSequence) str, i16, str.length());
        if (i15 < length) {
            String str2 = " [";
            while (i15 < objArr.length) {
                sb5.append(str2);
                sb5.append(b(objArr[i15]));
                i15++;
                str2 = ", ";
            }
            sb5.append(']');
        }
        return sb5.toString();
    }

    private static String b(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e15) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb5 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb5.append(name);
            sb5.append("@");
            sb5.append(hexString);
            String string = sb5.toString();
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(string), (Throwable) e15);
            String name2 = e15.getClass().getName();
            StringBuilder sb6 = new StringBuilder(string.length() + 8 + name2.length() + 1);
            sb6.append("<");
            sb6.append(string);
            sb6.append(" threw ");
            sb6.append(name2);
            sb6.append(">");
            return sb6.toString();
        }
    }
}
