package kc;

import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u001aS\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001aA\u0010\n\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\f\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u0016*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u0000*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u001a\u0010 \u001a\u00020\u001d*\u0004\u0018\u00010\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"", "scheme", "authority", "path", "query", "fragment", "separator", "Lkc/h0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkc/h0;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "i", "(Ljava/lang/String;Ljava/lang/String;)Lkc/h0;", "data", "original", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkc/h0;", "", "bytes", "h", "(Ljava/lang/String;[B)Ljava/lang/String;", "", "f", "(Lkc/h0;)Ljava/util/List;", "pathSegments", "d", "(Lkc/h0;)Ljava/lang/String;", "filePath", "", "e", "(Ljava/lang/String;)I", "length", "coil-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i0 {
    public static final h0 a(String str, String str2, String str3, String str4, String str5, String str6) {
        if (str == null && str2 == null && str3 == null && str4 == null && str5 == null) {
            throw new IllegalArgumentException("At least one of scheme, authority, path, query, or fragment must be non-null.");
        }
        return new h0(c(str, str2, str3, str4, str5), str6, str, str2, str3, str4, str5);
    }

    public static /* synthetic */ h0 b(String str, String str2, String str3, String str4, String str5, String str6, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = null;
        }
        if ((i15 & 2) != 0) {
            str2 = null;
        }
        if ((i15 & 4) != 0) {
            str3 = null;
        }
        if ((i15 & 8) != 0) {
            str4 = null;
        }
        if ((i15 & 16) != 0) {
            str5 = null;
        }
        if ((i15 & 32) != 0) {
            str6 = vv.b0.f208327c;
        }
        return a(str, str2, str3, str4, str5, str6);
    }

    private static final String c(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb5 = new StringBuilder();
        if (str != null) {
            sb5.append(str);
            sb5.append(':');
        }
        if (str2 != null) {
            sb5.append("//");
            sb5.append(str2);
        }
        if (str3 != null) {
            sb5.append(str3);
        }
        if (str4 != null) {
            sb5.append('?');
            sb5.append(str4);
        }
        if (str5 != null) {
            sb5.append('#');
            sb5.append(str5);
        }
        return sb5.toString();
    }

    public static final String d(h0 h0Var) {
        List<String> listF = f(h0Var);
        if (listF.isEmpty()) {
            return null;
        }
        return pq.v.v0(listF, h0Var.getSeparator(), fu.r.V(h0Var.getPath(), h0Var.getSeparator(), false, 2, null) ? h0Var.getSeparator() : "", null, 0, null, null, 60, null);
    }

    private static final int e(String str) {
        if (str != null) {
            return str.length();
        }
        return 0;
    }

    public static final List<String> f(h0 h0Var) {
        String path = h0Var.getPath();
        if (path == null) {
            return pq.v.n();
        }
        ArrayList arrayList = new ArrayList();
        int iQ0 = -1;
        while (iQ0 < path.length()) {
            int i15 = iQ0 + 1;
            iQ0 = fu.r.q0(path, '/', i15, false, 4, null);
            if (iQ0 == -1) {
                iQ0 = path.length();
            }
            String strSubstring = path.substring(i15, iQ0);
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
        }
        return arrayList;
    }

    private static final h0 g(String str, String str2, String str3) {
        String strSubstring;
        String strSubstring2;
        boolean z15 = true;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        int i25 = 0;
        while (i25 < str.length()) {
            char cCharAt = str.charAt(i25);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i17 == -1 && i15 == -1) {
                            i17 = i25 + 1;
                        }
                    } else if (z15 && i17 == -1 && i15 == -1) {
                        int i26 = i25 + 2;
                        if (i26 < str2.length() && str2.charAt(i25 + 1) == '/' && str2.charAt(i26) == '/') {
                            i18 = i25 + 3;
                            z15 = false;
                            i19 = i25;
                            i25 = i26;
                        } else if (fr.t.c(str, str2)) {
                            i16 = i25 + 1;
                            i19 = i25;
                            i25 = i16;
                            i18 = i25;
                        }
                    }
                } else if (i16 == -1 && i17 == -1 && i15 == -1) {
                    i16 = i18 == -1 ? 0 : i25;
                    z15 = false;
                }
            } else if (i15 == -1) {
                i15 = i25 + 1;
            }
            i25++;
        }
        int iMin = Math.min(i15 == -1 ? Integer.MAX_VALUE : i15 - 1, str.length());
        int iMin2 = Math.min(i17 == -1 ? Integer.MAX_VALUE : i17 - 1, iMin);
        if (i18 != -1) {
            strSubstring2 = str.substring(0, i19);
            strSubstring = str.substring(i18, Math.min(i16 != -1 ? i16 : Integer.MAX_VALUE, iMin2));
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        String strSubstring3 = i16 != -1 ? str.substring(i16, iMin2) : null;
        String strSubstring4 = i17 != -1 ? str.substring(i17, iMin) : null;
        String strSubstring5 = i15 != -1 ? str.substring(i15, str.length()) : null;
        byte[] bArr = new byte[Math.max(0, Math.max(e(strSubstring2), Math.max(e(strSubstring), Math.max(e(strSubstring3), Math.max(e(strSubstring4), e(strSubstring5))))) - 2)];
        return new h0(str, str3, strSubstring2 != null ? h(strSubstring2, bArr) : null, strSubstring != null ? h(strSubstring, bArr) : null, strSubstring3 != null ? h(strSubstring3, bArr) : null, strSubstring4 != null ? h(strSubstring4, bArr) : null, strSubstring5 != null ? h(strSubstring5, bArr) : null);
    }

    private static final String h(String str, byte[] bArr) {
        byte[] bArr2;
        int length = str.length();
        int i15 = 0;
        int iMax = Math.max(0, length - 2);
        int i16 = 0;
        while (true) {
            if (i15 < iMax) {
                bArr2 = bArr;
                if (str.charAt(i15) == '%') {
                    int i17 = i15 + 3;
                    try {
                        bArr2[i16] = (byte) Integer.parseInt(str.substring(i15 + 1, i17), fu.a.a(16));
                        i16++;
                        bArr = bArr2;
                        i15 = i17;
                    } catch (NumberFormatException unused) {
                        bArr2[i16] = (byte) str.charAt(i15);
                        i16++;
                        i15++;
                        bArr = bArr2;
                    }
                }
            } else {
                if (i15 == i16) {
                    return str;
                }
                if (i15 >= length) {
                    return fu.r.C(bArr, 0, i16, false, 5, null);
                }
                bArr2 = bArr;
            }
            bArr2[i16] = (byte) str.charAt(i15);
            i16++;
            i15++;
            bArr = bArr2;
        }
    }

    public static final h0 i(String str, String str2) {
        String str3;
        String str4;
        if (fr.t.c(str2, "/")) {
            str3 = str;
            str4 = str2;
        } else {
            str3 = str;
            str4 = str2;
            str = fu.r.P(str3, str4, "/", false, 4, null);
        }
        return g(str, str3, str4);
    }

    public static /* synthetic */ h0 j(String str, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str2 = vv.b0.f208327c;
        }
        return i(str, str2);
    }
}
