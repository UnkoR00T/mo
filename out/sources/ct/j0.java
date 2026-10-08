package ct;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 {
    public static final String b(zs.d dVar) {
        return g(dVar.h());
    }

    public static final String c(zs.f fVar) {
        if (!i(fVar)) {
            return fVar.e();
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append('`' + fVar.e());
        sb5.append('`');
        return sb5.toString();
    }

    public static final String d(String str, String str2, er.a<String> aVar, er.a<String> aVar2, er.l<? super String, String> lVar) {
        String strA = aVar.a();
        String strH = h(str, strA + "Mutable", str2, strA, strA + "(Mutable)");
        if (strH != null) {
            return strH;
        }
        String strH2 = h(str, strA + "MutableMap.MutableEntry", str2, strA + "Map.Entry", strA + "(Mutable)Map.(Mutable)Entry");
        if (strH2 != null) {
            return strH2;
        }
        String strA2 = aVar2.a();
        String strH3 = h(str, strA2 + lVar.b("Array<"), str2, strA2 + lVar.b("Array<out "), strA2 + lVar.b("Array<(out) "));
        if (strH3 != null) {
            return strH3;
        }
        return null;
    }

    public static /* synthetic */ String e(String str, String str2, er.a aVar, er.a aVar2, er.l lVar, int i15, Object obj) {
        if ((i15 & 16) != 0) {
            lVar = i0.f37654a;
        }
        return d(str, str2, aVar, aVar2, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(String str) {
        return str;
    }

    public static final String g(List<zs.f> list) {
        StringBuilder sb5 = new StringBuilder();
        for (zs.f fVar : list) {
            if (sb5.length() > 0) {
                sb5.append(".");
            }
            sb5.append(c(fVar));
        }
        return sb5.toString();
    }

    public static final String h(String str, String str2, String str3, String str4, String str5) {
        if (fu.r.V(str, str2, false, 2, null) && fu.r.V(str3, str4, false, 2, null)) {
            String strSubstring = str.substring(str2.length());
            String strSubstring2 = str3.substring(str4.length());
            String str6 = str5 + strSubstring;
            if (fr.t.c(strSubstring, strSubstring2)) {
                return str6;
            }
            if (j(strSubstring, strSubstring2)) {
                return str6 + '!';
            }
        }
        return null;
    }

    private static final boolean i(zs.f fVar) {
        String strE = fVar.e();
        if (d0.f37629a.contains(strE)) {
            return true;
        }
        for (int i15 = 0; i15 < strE.length(); i15++) {
            char cCharAt = strE.charAt(i15);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                return true;
            }
        }
        return strE.length() == 0 || !Character.isJavaIdentifierStart(strE.codePointAt(0));
    }

    public static final boolean j(String str, String str2) {
        if (fr.t.c(str, fu.r.P(str2, "?", "", false, 4, null))) {
            return true;
        }
        if (fu.r.F(str2, "?", false, 2, null)) {
            if (fr.t.c(str + '?', str2)) {
                return true;
            }
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append('(');
        sb5.append(str);
        sb5.append(")?");
        return fr.t.c(sb5.toString(), str2);
    }
}
