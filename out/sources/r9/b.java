package r9;

import ak.b2;
import ak.u0;
import ak.x0;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f172350d = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final u0<String> f172351e = u0.F("auto", "none");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final u0<String> f172352f = u0.G("dot", "sesame", "circle");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final u0<String> f172353g = u0.F("filled", "open");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final u0<String> f172354h = u0.G("after", "before", "outside");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f172355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f172356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f172357c;

    private b(int i15, int i16, int i17) {
        this.f172355a = i15;
        this.f172356b = i16;
        this.f172357c = i17;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String strF = zj.c.f(str.trim());
        if (strF.isEmpty()) {
            return null;
        }
        return b(u0.w(TextUtils.split(strF, f172350d)));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ee  */
    private static b b(u0<String> u0Var) {
        int i15;
        b2.e eVarE;
        int i16;
        b2.e eVarE2;
        b2.e eVarE3;
        String str;
        int iHashCode;
        int i17;
        String str2;
        int iHashCode2;
        String str3;
        int iHashCode3;
        String str4 = (String) x0.e(b2.e(f172354h, u0Var), "outside");
        int iHashCode4 = str4.hashCode();
        int i18 = 1;
        if (iHashCode4 != -1392885889) {
            if (iHashCode4 != -1106037339) {
                if (iHashCode4 == 92734940 && str4.equals("after")) {
                    i15 = 2;
                }
            } else if (str4.equals("outside")) {
                i15 = -2;
            }
            eVarE = b2.e(f172351e, u0Var);
            i16 = -1;
            if (!eVarE.isEmpty()) {
                str3 = (String) eVarE.iterator().next();
                iHashCode3 = str3.hashCode();
                if (iHashCode3 != 3005871) {
                    str3.equals("auto");
                } else if (iHashCode3 == 3387192 && str3.equals("none")) {
                    i16 = 0;
                }
                return new b(i16, 0, i15);
            }
            eVarE2 = b2.e(f172353g, u0Var);
            eVarE3 = b2.e(f172352f, u0Var);
            if (!eVarE2.isEmpty() && eVarE3.isEmpty()) {
                return new b(-1, 0, i15);
            }
            str = (String) x0.e(eVarE2, "filled");
            iHashCode = str.hashCode();
            if (iHashCode != -1274499742) {
                if (iHashCode == 3417674 && str.equals("open")) {
                    i17 = 2;
                }
                str2 = (String) x0.e(eVarE3, "circle");
                iHashCode2 = str2.hashCode();
                if (iHashCode2 != -1360216880) {
                    str2.equals("circle");
                } else if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str2.equals("dot")) {
                        i18 = 2;
                    }
                } else if (str2.equals("sesame")) {
                    i18 = 3;
                }
                return new b(i18, i17, i15);
            }
            str.equals("filled");
            i17 = 1;
            str2 = (String) x0.e(eVarE3, "circle");
            iHashCode2 = str2.hashCode();
            if (iHashCode2 != -1360216880) {
                str2.equals("circle");
            } else if (iHashCode2 != -905816648) {
                if (iHashCode2 == 99657) {
                    i18 = 2;
                }
            } else if (str2.equals("sesame")) {
                i18 = 3;
            }
            return new b(i18, i17, i15);
        }
        str4.equals("before");
        i15 = 1;
        eVarE = b2.e(f172351e, u0Var);
        i16 = -1;
        if (!eVarE.isEmpty()) {
            str3 = (String) eVarE.iterator().next();
            iHashCode3 = str3.hashCode();
            if (iHashCode3 != 3005871) {
                str3.equals("auto");
            } else if (iHashCode3 == 3387192) {
                i16 = 0;
            }
            return new b(i16, 0, i15);
        }
        eVarE2 = b2.e(f172353g, u0Var);
        eVarE3 = b2.e(f172352f, u0Var);
        if (!eVarE2.isEmpty()) {
        }
        str = (String) x0.e(eVarE2, "filled");
        iHashCode = str.hashCode();
        if (iHashCode != -1274499742) {
            if (iHashCode == 3417674) {
                i17 = 2;
            }
            str2 = (String) x0.e(eVarE3, "circle");
            iHashCode2 = str2.hashCode();
            if (iHashCode2 != -1360216880) {
                str2.equals("circle");
            } else if (iHashCode2 != -905816648) {
                if (iHashCode2 == 99657) {
                    i18 = 2;
                }
            } else if (str2.equals("sesame")) {
                i18 = 3;
            }
            return new b(i18, i17, i15);
        }
        str.equals("filled");
        i17 = 1;
        str2 = (String) x0.e(eVarE3, "circle");
        iHashCode2 = str2.hashCode();
        if (iHashCode2 != -1360216880) {
            str2.equals("circle");
        } else if (iHashCode2 != -905816648) {
            if (iHashCode2 == 99657) {
                i18 = 2;
            }
        } else if (str2.equals("sesame")) {
            i18 = 3;
        }
        return new b(i18, i17, i15);
    }
}
