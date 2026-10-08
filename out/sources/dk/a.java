package dk;

import java.io.Serializable;
import zj.l;
import zj.p;
import zj.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f42913c;

    private a(String str, int i15, boolean z15) {
        this.f42911a = str;
        this.f42912b = i15;
        this.f42913c = z15;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    public static a a(String str) {
        boolean z15;
        String strSubstring;
        String str2;
        String strSubstring2;
        p.q(str);
        int i15 = -1;
        if (!str.startsWith("[")) {
            int iIndexOf = str.indexOf(58);
            if (iIndexOf >= 0) {
                int i16 = iIndexOf + 1;
                if (str.indexOf(58, i16) == -1) {
                    strSubstring2 = str.substring(0, iIndexOf);
                    strSubstring = str.substring(i16);
                }
                if (!v.b(strSubstring)) {
                    p.l(strSubstring.startsWith("+") && zj.d.f().o(strSubstring), "Unparseable port number: %s", str);
                    try {
                        i15 = Integer.parseInt(strSubstring);
                        p.l(e(i15), "Port number out of range: %s", str);
                    } catch (NumberFormatException unused) {
                        throw new IllegalArgumentException("Unparseable port number: " + str);
                    }
                }
                return new a(str2, i15, z15);
            }
            z15 = iIndexOf >= 0;
            strSubstring = null;
            str2 = str;
            if (!v.b(strSubstring)) {
                p.l(strSubstring.startsWith("+") && zj.d.f().o(strSubstring), "Unparseable port number: %s", str);
                i15 = Integer.parseInt(strSubstring);
                p.l(e(i15), "Port number out of range: %s", str);
            }
            return new a(str2, i15, z15);
        }
        String[] strArrC = c(str);
        strSubstring2 = strArrC[0];
        strSubstring = strArrC[1];
        str2 = strSubstring2;
        z15 = false;
        if (!v.b(strSubstring)) {
            p.l(strSubstring.startsWith("+") && zj.d.f().o(strSubstring), "Unparseable port number: %s", str);
            i15 = Integer.parseInt(strSubstring);
            p.l(e(i15), "Port number out of range: %s", str);
        }
        return new a(str2, i15, z15);
    }

    private static String[] c(String str) {
        p.l(str.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", str);
        int iIndexOf = str.indexOf(58);
        int iLastIndexOf = str.lastIndexOf(93);
        p.l(iIndexOf > -1 && iLastIndexOf > iIndexOf, "Invalid bracketed host/port: %s", str);
        String strSubstring = str.substring(1, iLastIndexOf);
        int i15 = iLastIndexOf + 1;
        if (i15 == str.length()) {
            return new String[]{strSubstring, ""};
        }
        p.l(str.charAt(i15) == ':', "Only a colon may follow a close bracket: %s", str);
        int i16 = iLastIndexOf + 2;
        for (int i17 = i16; i17 < str.length(); i17++) {
            p.l(Character.isDigit(str.charAt(i17)), "Port must be numeric: %s", str);
        }
        return new String[]{strSubstring, str.substring(i16)};
    }

    private static boolean e(int i15) {
        return i15 >= 0 && i15 <= 65535;
    }

    public String b() {
        return this.f42911a;
    }

    public boolean d() {
        return this.f42912b >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.a(this.f42911a, aVar.f42911a) && this.f42912b == aVar.f42912b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return l.b(this.f42911a, Integer.valueOf(this.f42912b));
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder(this.f42911a.length() + 8);
        if (this.f42911a.indexOf(58) >= 0) {
            sb5.append('[');
            sb5.append(this.f42911a);
            sb5.append(']');
        } else {
            sb5.append(this.f42911a);
        }
        if (d()) {
            sb5.append(':');
            sb5.append(this.f42912b);
        }
        return sb5.toString();
    }
}
