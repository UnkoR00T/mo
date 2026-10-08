package u9;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w7.c0;
import w7.o0;
import w7.t;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f196520c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f196521d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f196522a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuilder f196523b = new StringBuilder();

    private void a(c cVar, String str) {
        if (str.isEmpty()) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f196520c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                cVar.z((String) p.q(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrZ0 = o0.Z0(str, "\\.");
        String str2 = strArrZ0[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            cVar.y(str2.substring(0, iIndexOf2));
            cVar.x(str2.substring(iIndexOf2 + 1));
        } else {
            cVar.y(str2);
        }
        if (strArrZ0.length > 1) {
            cVar.w((String[]) o0.P0(strArrZ0, 1, strArrZ0.length));
        }
    }

    private static boolean b(c0 c0Var) {
        int iG = c0Var.g();
        int iJ = c0Var.j();
        byte[] bArrF = c0Var.f();
        if (iG + 2 > iJ) {
            return false;
        }
        int i15 = iG + 1;
        if (bArrF[iG] != 47) {
            return false;
        }
        int i16 = iG + 2;
        if (bArrF[i15] != 42) {
            return false;
        }
        while (true) {
            int i17 = i16 + 1;
            if (i17 >= iJ) {
                c0Var.g0(iJ - c0Var.g());
                return true;
            }
            if (((char) bArrF[i16]) == '*' && ((char) bArrF[i17]) == '/') {
                i16 += 2;
                iJ = i16;
            } else {
                i16 = i17;
            }
        }
    }

    private static boolean c(c0 c0Var) {
        char cK = k(c0Var, c0Var.g());
        if (cK != '\t' && cK != '\n' && cK != '\f' && cK != '\r' && cK != ' ') {
            return false;
        }
        c0Var.g0(1);
        return true;
    }

    private static void e(String str, c cVar) {
        Matcher matcher = f196521d.matcher(zj.c.f(str));
        if (!matcher.matches()) {
            t.h("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) p.q(matcher.group(2));
        str2.getClass();
        switch (str2) {
            case "%":
                cVar.t(3);
                break;
            case "em":
                cVar.t(2);
                break;
            case "px":
                cVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        cVar.s(Float.parseFloat((String) p.q(matcher.group(1))));
    }

    private static String f(c0 c0Var, StringBuilder sb5) {
        boolean z15 = false;
        sb5.setLength(0);
        int iG = c0Var.g();
        int iJ = c0Var.j();
        while (iG < iJ && !z15) {
            char c15 = (char) c0Var.f()[iG];
            if ((c15 < 'A' || c15 > 'Z') && ((c15 < 'a' || c15 > 'z') && !((c15 >= '0' && c15 <= '9') || c15 == '#' || c15 == '-' || c15 == '.' || c15 == '_'))) {
                z15 = true;
            } else {
                iG++;
                sb5.append(c15);
            }
        }
        c0Var.g0(iG - c0Var.g());
        return sb5.toString();
    }

    static String g(c0 c0Var, StringBuilder sb5) {
        n(c0Var);
        if (c0Var.a() == 0) {
            return null;
        }
        String strF = f(c0Var, sb5);
        if (!strF.isEmpty()) {
            return strF;
        }
        return "" + ((char) c0Var.Q());
    }

    private static String h(c0 c0Var, StringBuilder sb5) {
        StringBuilder sb6 = new StringBuilder();
        boolean z15 = false;
        while (!z15) {
            int iG = c0Var.g();
            String strG = g(c0Var, sb5);
            if (strG == null) {
                return null;
            }
            if ("}".equals(strG) || ";".equals(strG)) {
                c0Var.f0(iG);
                z15 = true;
            } else {
                sb6.append(strG);
            }
        }
        return sb6.toString();
    }

    private static String i(c0 c0Var, StringBuilder sb5) {
        n(c0Var);
        if (c0Var.a() < 5 || !"::cue".equals(c0Var.N(5))) {
            return null;
        }
        int iG = c0Var.g();
        String strG = g(c0Var, sb5);
        if (strG == null) {
            return null;
        }
        if ("{".equals(strG)) {
            c0Var.f0(iG);
            return "";
        }
        String strL = "(".equals(strG) ? l(c0Var) : null;
        if (")".equals(g(c0Var, sb5))) {
            return strL;
        }
        return null;
    }

    private static void j(c0 c0Var, c cVar, StringBuilder sb5) {
        n(c0Var);
        String strF = f(c0Var, sb5);
        if (!strF.isEmpty() && ":".equals(g(c0Var, sb5))) {
            n(c0Var);
            String strH = h(c0Var, sb5);
            if (strH == null || strH.isEmpty()) {
                return;
            }
            int iG = c0Var.g();
            String strG = g(c0Var, sb5);
            if (!";".equals(strG)) {
                if (!"}".equals(strG)) {
                    return;
                } else {
                    c0Var.f0(iG);
                }
            }
            if ("color".equals(strF)) {
                cVar.q(w7.j.b(strH));
                return;
            }
            if ("background-color".equals(strF)) {
                cVar.n(w7.j.b(strH));
                return;
            }
            boolean z15 = true;
            if ("ruby-position".equals(strF)) {
                if ("over".equals(strH)) {
                    cVar.v(1);
                    return;
                } else {
                    if ("under".equals(strH)) {
                        cVar.v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strF)) {
                if (!"all".equals(strH) && !strH.startsWith("digits")) {
                    z15 = false;
                }
                cVar.p(z15);
                return;
            }
            if ("text-decoration".equals(strF)) {
                if ("underline".equals(strH)) {
                    cVar.A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strF)) {
                cVar.r(strH);
                return;
            }
            if ("font-weight".equals(strF)) {
                if ("bold".equals(strH)) {
                    cVar.o(true);
                }
            } else if ("font-style".equals(strF)) {
                if ("italic".equals(strH)) {
                    cVar.u(true);
                }
            } else if ("font-size".equals(strF)) {
                e(strH, cVar);
            }
        }
    }

    private static char k(c0 c0Var, int i15) {
        return (char) c0Var.f()[i15];
    }

    private static String l(c0 c0Var) {
        int iG = c0Var.g();
        int iJ = c0Var.j();
        boolean z15 = false;
        while (iG < iJ && !z15) {
            int i15 = iG + 1;
            z15 = ((char) c0Var.f()[iG]) == ')';
            iG = i15;
        }
        return c0Var.N((iG - 1) - c0Var.g()).trim();
    }

    static void m(c0 c0Var) {
        while (!TextUtils.isEmpty(c0Var.B())) {
        }
    }

    static void n(c0 c0Var) {
        while (true) {
            for (boolean z15 = true; c0Var.a() > 0 && z15; z15 = false) {
                if (!c(c0Var) && !b(c0Var)) {
                }
            }
            return;
        }
    }

    public List<c> d(c0 c0Var) {
        this.f196523b.setLength(0);
        int iG = c0Var.g();
        m(c0Var);
        this.f196522a.d0(c0Var.f(), c0Var.g());
        this.f196522a.f0(iG);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strI = i(this.f196522a, this.f196523b);
            if (strI == null || !"{".equals(g(this.f196522a, this.f196523b))) {
                break;
            }
            c cVar = new c();
            a(cVar, strI);
            String str = null;
            boolean z15 = false;
            while (!z15) {
                int iG2 = this.f196522a.g();
                String strG = g(this.f196522a, this.f196523b);
                boolean z16 = strG == null || "}".equals(strG);
                if (!z16) {
                    this.f196522a.f0(iG2);
                    j(this.f196522a, cVar, this.f196523b);
                }
                str = strG;
                z15 = z16;
            }
            if ("}".equals(str)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }
}
