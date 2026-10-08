package p9;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import ek.g;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.cmc.BodyPartID;
import w7.o0;
import w7.t;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f153536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f153537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f153538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f153539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f153540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f153541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f153542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f153543i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f153544j;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f153545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f153546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f153547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f153548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f153549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f153550f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f153551g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f153552h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f153553i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f153554j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f153555k;

        private a(int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27, int i28, int i29, int i35) {
            this.f153545a = i15;
            this.f153546b = i16;
            this.f153547c = i17;
            this.f153548d = i18;
            this.f153549e = i19;
            this.f153550f = i25;
            this.f153551g = i26;
            this.f153552h = i27;
            this.f153553i = i28;
            this.f153554j = i29;
            this.f153555k = i35;
        }

        public static a a(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), ",");
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i25 = -1;
            int i26 = -1;
            int i27 = -1;
            int i28 = -1;
            int i29 = -1;
            for (int i35 = 0; i35 < strArrSplit.length; i35++) {
                String strF = zj.c.f(strArrSplit[i35].trim());
                strF.getClass();
                switch (strF) {
                    case "italic":
                        i26 = i35;
                        break;
                    case "underline":
                        i27 = i35;
                        break;
                    case "strikeout":
                        i28 = i35;
                        break;
                    case "primarycolour":
                        i17 = i35;
                        break;
                    case "bold":
                        i25 = i35;
                        break;
                    case "name":
                        i15 = i35;
                        break;
                    case "fontsize":
                        i19 = i35;
                        break;
                    case "borderstyle":
                        i29 = i35;
                        break;
                    case "alignment":
                        i16 = i35;
                        break;
                    case "outlinecolour":
                        i18 = i35;
                        break;
                }
            }
            if (i15 != -1) {
                return new a(i15, i16, i17, i18, i19, i25, i26, i27, i28, i29, strArrSplit.length);
            }
            return null;
        }
    }

    static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Pattern f153556c = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Pattern f153557d = Pattern.compile(o0.F("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Pattern f153558e = Pattern.compile(o0.F("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Pattern f153559f = Pattern.compile("\\\\an(\\d+)");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f153560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PointF f153561b;

        private b(int i15, PointF pointF) {
            this.f153560a = i15;
            this.f153561b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f153559f.matcher(str);
            if (matcher.find()) {
                return c.e((String) p.q(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f153556c.matcher(str);
            PointF pointF = null;
            int i15 = -1;
            while (matcher.find()) {
                String str2 = (String) p.q(matcher.group(1));
                try {
                    PointF pointFC = c(str2);
                    if (pointFC != null) {
                        pointF = pointFC;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iA = a(str2);
                    if (iA != -1) {
                        i15 = iA;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i15, pointF);
        }

        private static PointF c(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f153557d.matcher(str);
            Matcher matcher2 = f153558e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    t.f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) p.q(strGroup)).trim()), Float.parseFloat(((String) p.q(strGroup2)).trim()));
        }

        public static String d(String str) {
            return f153556c.matcher(str).replaceAll("");
        }
    }

    private c(String str, int i15, Integer num, Integer num2, float f15, boolean z15, boolean z16, boolean z17, boolean z18, int i16) {
        this.f153535a = str;
        this.f153536b = i15;
        this.f153537c = num;
        this.f153538d = num2;
        this.f153539e = f15;
        this.f153540f = z15;
        this.f153541g = z16;
        this.f153542h = z17;
        this.f153543i = z18;
        this.f153544j = i16;
    }

    public static c b(String str, a aVar) {
        p.d(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i15 = aVar.f153555k;
        if (length != i15) {
            t.h("SsaStyle", o0.F("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i15), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[aVar.f153545a].trim();
            int i16 = aVar.f153546b;
            int iE = i16 != -1 ? e(strArrSplit[i16].trim()) : -1;
            int i17 = aVar.f153547c;
            Integer numH = i17 != -1 ? h(strArrSplit[i17].trim()) : null;
            int i18 = aVar.f153548d;
            Integer numH2 = i18 != -1 ? h(strArrSplit[i18].trim()) : null;
            int i19 = aVar.f153549e;
            float fI = i19 != -1 ? i(strArrSplit[i19].trim()) : -3.4028235E38f;
            int i25 = aVar.f153550f;
            boolean z15 = false;
            boolean z16 = true;
            if (i25 != -1 && f(strArrSplit[i25].trim())) {
                z15 = true;
            }
            int i26 = aVar.f153551g;
            if (i26 == -1 || !f(strArrSplit[i26].trim())) {
                z16 = false;
            }
            int i27 = aVar.f153552h;
            if (i27 == -1 || !f(strArrSplit[i27].trim())) {
                z16 = false;
            }
            int i28 = aVar.f153553i;
            boolean z17 = i28 != -1 && f(strArrSplit[i28].trim());
            int i29 = aVar.f153554j;
            return new c(strTrim, iE, numH, numH2, fI, z15, z16, z16, z17, i29 != -1 ? g(strArrSplit[i29].trim()) : -1);
        } catch (RuntimeException e15) {
            t.i("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e15);
            return null;
        }
    }

    private static boolean c(int i15) {
        switch (i15) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private static boolean d(int i15) {
        return i15 == 1 || i15 == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(String str) {
        try {
            int i15 = Integer.parseInt(str.trim());
            if (c(i15)) {
                return i15;
            }
        } catch (NumberFormatException unused) {
        }
        t.h("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static boolean f(String str) {
        try {
            int i15 = Integer.parseInt(str);
            return i15 == 1 || i15 == -1;
        } catch (NumberFormatException e15) {
            t.i("SsaStyle", "Failed to parse boolean value: '" + str + "'", e15);
            return false;
        }
    }

    private static int g(String str) {
        try {
            int i15 = Integer.parseInt(str.trim());
            if (d(i15)) {
                return i15;
            }
        } catch (NumberFormatException unused) {
        }
        t.h("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer h(String str) {
        try {
            long j15 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            p.d(j15 <= BodyPartID.bodyIdMax);
            return Integer.valueOf(Color.argb(g.e(((j15 >> 24) & 255) ^ 255), g.e(j15 & 255), g.e((j15 >> 8) & 255), g.e((j15 >> 16) & 255)));
        } catch (IllegalArgumentException e15) {
            t.i("SsaStyle", "Failed to parse color expression: '" + str + "'", e15);
            return null;
        }
    }

    private static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e15) {
            t.i("SsaStyle", "Failed to parse font size: '" + str + "'", e15);
            return -3.4028235E38f;
        }
    }
}
