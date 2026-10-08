package fu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u001b\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000f2\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "marginPrefix", "o", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "newIndent", "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "n", "(Ljava/lang/String;)Ljava/lang/String;", "l", "indent", "i", "", "h", "(Ljava/lang/String;)I", "Lkotlin/Function1;", "e", "(Ljava/lang/String;)Ler/l;", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class w extends s {
    private static final er.l<String, String> e(final String str) {
        return str.length() == 0 ? new er.l() { // from class: fu.t
            @Override // er.l
            public final Object b(Object obj) {
                return w.f((String) obj);
            }
        } : new er.l() { // from class: fu.u
            @Override // er.l
            public final Object b(Object obj) {
                return w.g(str, (String) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(String str, String str2) {
        return str + str2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN] */
    private static final int h(String str) {
        int length = str.length();
        int i15 = 0;
        while (i15 < length) {
            if (!b.c(str.charAt(i15))) {
                if (i15 == -1) {
                    return str.length();
                }
                return i15;
            }
            i15++;
        }
        i15 = -1;
        if (i15 == -1) {
            return str.length();
        }
        return i15;
    }

    public static final String i(String str, final String str2) {
        return eu.k.F(eu.k.H(g0.z0(str), new er.l() { // from class: fu.v
            @Override // er.l
            public final Object b(Object obj) {
                return w.k(str2, (String) obj);
            }
        }), "\n", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String j(String str, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str2 = "    ";
        }
        return i(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k(String str, String str2) {
        if (g0.t0(str2)) {
            return str2.length() < str.length() ? str : str2;
        }
        return str + str2;
    }

    public static final String l(String str, String str2) {
        String strB;
        List<String> listA0 = g0.A0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA0) {
            if (!g0.t0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(pq.v.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(h((String) it.next())));
        }
        Integer num = (Integer) pq.v.E0(arrayList2);
        int i15 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * listA0.size());
        er.l<String, String> lVarE = e(str2);
        int iP = pq.v.p(listA0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listA0) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            String str3 = (String) obj2;
            if ((i15 == 0 || i15 == iP) && g0.t0(str3)) {
                str3 = null;
            } else {
                String strA1 = j0.A1(str3, iIntValue);
                if (strA1 != null && (strB = lVarE.b(strA1)) != null) {
                    str3 = strB;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i15 = i16;
        }
        return ((StringBuilder) pq.g0.s0(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static final String m(String str, String str2, String str3) {
        String str4;
        String strB;
        if (g0.t0(str3)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List<String> listA0 = g0.A0(str);
        int length = str.length() + (str2.length() * listA0.size());
        er.l<String, String> lVarE = e(str2);
        int iP = pq.v.p(listA0);
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        for (Object obj : listA0) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            String str5 = (String) obj;
            String strSubstring = null;
            if ((i15 == 0 || i15 == iP) && g0.t0(str5)) {
                str4 = str3;
                str5 = null;
            } else {
                int length2 = str5.length();
                int i17 = 0;
                while (true) {
                    if (i17 >= length2) {
                        i17 = -1;
                        break;
                    }
                    if (!b.c(str5.charAt(i17))) {
                        break;
                    }
                    i17++;
                }
                if (i17 == -1) {
                    str4 = str3;
                } else {
                    int i18 = i17;
                    str4 = str3;
                    if (d0.U(str5, str4, i18, false, 4, null)) {
                        strSubstring = str5.substring(str4.length() + i18);
                    }
                }
                if (strSubstring != null && (strB = lVarE.b(strSubstring)) != null) {
                    str5 = strB;
                }
            }
            if (str5 != null) {
                arrayList.add(str5);
            }
            i15 = i16;
            str3 = str4;
        }
        return ((StringBuilder) pq.g0.s0(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static String n(String str) {
        return l(str, "");
    }

    public static final String o(String str, String str2) {
        return m(str, "", str2);
    }

    public static /* synthetic */ String p(String str, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str2 = "|";
        }
        return o(str, str2);
    }
}
