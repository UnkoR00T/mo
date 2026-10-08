package zj;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class v {
    public static String a(String str) {
        return o.a(str);
    }

    public static boolean b(String str) {
        return o.e(str);
    }

    public static String c(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i15 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i16 = 0; i16 < objArr.length; i16++) {
                objArr[i16] = d(objArr[i16]);
            }
        }
        StringBuilder sb5 = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i17 = 0;
        while (i15 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i17)) != -1) {
            sb5.append((CharSequence) strValueOf, i17, iIndexOf);
            sb5.append(objArr[i15]);
            i17 = iIndexOf + 2;
            i15++;
        }
        sb5.append((CharSequence) strValueOf, i17, strValueOf.length());
        if (i15 < objArr.length) {
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

    private static String d(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e15) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e15);
            return "<" + str + " threw " + e15.getClass().getName() + ">";
        }
    }

    public static String e(String str) {
        return o.d(str);
    }
}
