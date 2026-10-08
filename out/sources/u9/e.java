package u9;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import w7.c0;
import w7.o0;
import w7.t;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f196544a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f196545b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Integer> f196546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, Integer> f196547d;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator<b> f196548c = new Comparator() { // from class: u9.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((e.b) obj).f196549a.f196552b, ((e.b) obj2).f196549a.f196552b);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f196549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f196550b;

        private b(c cVar, int i15) {
            this.f196549a = cVar;
            this.f196550b = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f196551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f196552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f196553c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set<String> f196554d;

        private c(String str, int i15, String str2, Set<String> set) {
            this.f196552b = i15;
            this.f196551a = str;
            this.f196553c = str2;
            this.f196554d = set;
        }

        public static c a(String str, int i15) {
            String str2;
            String strTrim = str.trim();
            p.d(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrZ0 = o0.Z0(strTrim, "\\.");
            String str3 = strArrZ0[0];
            HashSet hashSet = new HashSet();
            for (int i16 = 1; i16 < strArrZ0.length; i16++) {
                hashSet.add(strArrZ0[i16]);
            }
            return new c(str3, i15, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.EMPTY_SET);
        }
    }

    private static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f196555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u9.c f196556b;

        public d(int i15, u9.c cVar) {
            this.f196555a = i15;
            this.f196556b = cVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f196555a, dVar.f196555a);
        }
    }

    /* JADX INFO: renamed from: u9.e$e, reason: collision with other inner class name */
    private static final class C5110e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f196559c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f196557a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f196558b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f196560d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f196561e = -3.4028235E38f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f196562f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f196563g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f196564h = -3.4028235E38f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f196565i = PKIFailureInfo.systemUnavail;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f196566j = 1.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f196567k = PKIFailureInfo.systemUnavail;

        private static float b(float f15, int i15) {
            if (f15 != -3.4028235E38f && i15 == 0 && (f15 < 0.0f || f15 > 1.0f)) {
                return 1.0f;
            }
            if (f15 != -3.4028235E38f) {
                return f15;
            }
            return i15 == 0 ? 1.0f : -3.4028235E38f;
        }

        private static Layout.Alignment c(int i15) {
            if (i15 != 1) {
                if (i15 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i15 != 3) {
                    if (i15 != 4) {
                        if (i15 != 5) {
                            t.h("WebvttCueParser", "Unknown textAlignment: " + i15);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float d(int i15, float f15) {
            if (i15 == 0) {
                return 1.0f - f15;
            }
            if (i15 == 1) {
                return f15 <= 0.5f ? f15 * 2.0f : (1.0f - f15) * 2.0f;
            }
            if (i15 == 2) {
                return f15;
            }
            throw new IllegalStateException(String.valueOf(i15));
        }

        private static float e(int i15) {
            if (i15 != 4) {
                return i15 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int f(int i15) {
            if (i15 == 1) {
                return 0;
            }
            if (i15 == 3) {
                return 2;
            }
            if (i15 != 4) {
                return i15 != 5 ? 1 : 2;
            }
            return 0;
        }

        public u9.d a() {
            return new u9.d(g().a(), this.f196557a, this.f196558b);
        }

        public v7.a.b g() {
            float fE = this.f196564h;
            if (fE == -3.4028235E38f) {
                fE = e(this.f196560d);
            }
            int iF = this.f196565i;
            if (iF == Integer.MIN_VALUE) {
                iF = f(this.f196560d);
            }
            v7.a.b bVarR = new v7.a.b().p(c(this.f196560d)).h(b(this.f196561e, this.f196562f), this.f196562f).i(this.f196563g).k(fE).l(iF).n(Math.min(this.f196566j, d(iF, fE))).r(this.f196567k);
            CharSequence charSequence = this.f196559c;
            if (charSequence != null) {
                bVarR.o(charSequence);
            }
            return bVarR;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(GF2Field.MASK, GF2Field.MASK, GF2Field.MASK)));
        map.put("lime", Integer.valueOf(Color.rgb(0, GF2Field.MASK, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, GF2Field.MASK, GF2Field.MASK)));
        map.put("red", Integer.valueOf(Color.rgb(GF2Field.MASK, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(GF2Field.MASK, GF2Field.MASK, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(GF2Field.MASK, 0, GF2Field.MASK)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, GF2Field.MASK)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f196546c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(GF2Field.MASK, GF2Field.MASK, GF2Field.MASK)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, GF2Field.MASK, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, GF2Field.MASK, GF2Field.MASK)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(GF2Field.MASK, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(GF2Field.MASK, GF2Field.MASK, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(GF2Field.MASK, 0, GF2Field.MASK)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, GF2Field.MASK)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f196547d = Collections.unmodifiableMap(map2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i15, int i16) {
        for (String str : set) {
            Map<String, Integer> map = f196546c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i15, i16, 33);
            } else {
                Map<String, Integer> map2 = f196547d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i15, i16, 33);
                }
            }
        }
    }

    private static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                t.h("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List<b> list, List<u9.c> list2) {
        int iJ = j(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f196548c);
        int i15 = cVar.f196552b;
        int length = 0;
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            if ("rt".equals(((b) arrayList.get(i16)).f196549a.f196551a)) {
                b bVar = (b) arrayList.get(i16);
                int iH = h(j(list2, str, bVar.f196549a), iJ, 1);
                int i17 = bVar.f196549a.f196552b - length;
                int i18 = bVar.f196550b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i17, i18);
                spannableStringBuilder.delete(i17, i18);
                spannableStringBuilder.setSpan(new v7.f(charSequenceSubSequence.toString(), iH), i15, i17, 33);
                length += charSequenceSubSequence.length();
                i15 = i17;
            }
        }
    }

    private static void d(String str, c cVar, List<b> list, SpannableStringBuilder spannableStringBuilder, List<u9.c> list2) {
        int i15 = cVar.f196552b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f196551a;
        str2.getClass();
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i15, length, 33);
                break;
            case "c":
                a(spannableStringBuilder, cVar.f196554d, i15, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i15, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i15, length, 33);
                break;
            case "v":
                f(spannableStringBuilder, cVar.f196553c, i15, length);
                break;
            case "ruby":
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List<d> listI = i(list2, str, cVar);
        for (int i16 = 0; i16 < listI.size(); i16++) {
            e(spannableStringBuilder, listI.get(i16).f196556b, i15, length);
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, u9.c cVar, int i15, int i16) {
        if (cVar == null) {
            return;
        }
        if (cVar.i() != -1) {
            v7.g.b(spannableStringBuilder, new StyleSpan(cVar.i()), i15, i16, 33);
        }
        if (cVar.l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i15, i16, 33);
        }
        if (cVar.m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i15, i16, 33);
        }
        if (cVar.k()) {
            v7.g.b(spannableStringBuilder, new ForegroundColorSpan(cVar.c()), i15, i16, 33);
        }
        if (cVar.j()) {
            v7.g.b(spannableStringBuilder, new BackgroundColorSpan(cVar.a()), i15, i16, 33);
        }
        if (cVar.d() != null) {
            v7.g.b(spannableStringBuilder, new TypefaceSpan(cVar.d()), i15, i16, 33);
        }
        int iF = cVar.f();
        if (iF == 1) {
            v7.g.b(spannableStringBuilder, new AbsoluteSizeSpan((int) cVar.e(), true), i15, i16, 33);
        } else if (iF == 2) {
            v7.g.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e()), i15, i16, 33);
        } else if (iF == 3) {
            v7.g.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e() / 100.0f), i15, i16, 33);
        }
        if (cVar.b()) {
            spannableStringBuilder.setSpan(new v7.e(), i15, i16, 33);
        }
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, String str, int i15, int i16) {
        spannableStringBuilder.setSpan(new v7.i(str), i15, i16, 33);
    }

    private static int g(String str, int i15) {
        int iIndexOf = str.indexOf(62, i15);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static int h(int i15, int i16, int i17) {
        if (i15 != -1) {
            return i15;
        }
        if (i16 != -1) {
            return i16;
        }
        if (i17 != -1) {
            return i17;
        }
        throw new IllegalArgumentException();
    }

    private static List<d> i(List<u9.c> list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < list.size(); i15++) {
            u9.c cVar2 = list.get(i15);
            int iH = cVar2.h(str, cVar.f196551a, cVar.f196554d, cVar.f196553c);
            if (iH > 0) {
                arrayList.add(new d(iH, cVar2));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int j(List<u9.c> list, String str, c cVar) {
        List<d> listI = i(list, str, cVar);
        for (int i15 = 0; i15 < listI.size(); i15++) {
            u9.c cVar2 = listI.get(i15).f196556b;
            if (cVar2.g() != -1) {
                return cVar2.g();
            }
        }
        return -1;
    }

    private static String k(String str) {
        String strTrim = str.trim();
        p.d(!strTrim.isEmpty());
        return o0.a1(strTrim, "[ \\.]")[0];
    }

    private static boolean l(String str) {
        str.getClass();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    public static v7.a m(CharSequence charSequence) {
        C5110e c5110e = new C5110e();
        c5110e.f196559c = charSequence;
        return c5110e.g().a();
    }

    private static u9.d n(String str, Matcher matcher, c0 c0Var, List<u9.c> list) {
        C5110e c5110e = new C5110e();
        try {
            c5110e.f196557a = h.c((String) p.q(matcher.group(1)));
            c5110e.f196558b = h.c((String) p.q(matcher.group(2)));
            q((String) p.q(matcher.group(3)), c5110e);
            StringBuilder sb5 = new StringBuilder();
            String strB = c0Var.B();
            while (!TextUtils.isEmpty(strB)) {
                if (sb5.length() > 0) {
                    sb5.append("\n");
                }
                sb5.append(strB.trim());
                strB = c0Var.B();
            }
            c5110e.f196559c = r(str, sb5.toString(), list);
            return c5110e.a();
        } catch (IllegalArgumentException unused) {
            t.h("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static u9.d o(c0 c0Var, List<u9.c> list) {
        String strB = c0Var.B();
        if (strB == null) {
            return null;
        }
        Pattern pattern = f196544a;
        Matcher matcher = pattern.matcher(strB);
        if (matcher.matches()) {
            return n(null, matcher, c0Var, list);
        }
        String strB2 = c0Var.B();
        if (strB2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strB2);
        if (matcher2.matches()) {
            return n(strB.trim(), matcher2, c0Var, list);
        }
        return null;
    }

    static v7.a.b p(String str) {
        C5110e c5110e = new C5110e();
        q(str, c5110e);
        return c5110e.g();
    }

    private static void q(String str, C5110e c5110e) {
        Matcher matcher = f196545b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) p.q(matcher.group(1));
            String str3 = (String) p.q(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    t(str3, c5110e);
                } else if ("align".equals(str2)) {
                    c5110e.f196560d = w(str3);
                } else if ("position".equals(str2)) {
                    v(str3, c5110e);
                } else if ("size".equals(str2)) {
                    c5110e.f196566j = h.b(str3);
                } else if ("vertical".equals(str2)) {
                    c5110e.f196567k = x(str3);
                } else {
                    t.h("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                t.h("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    static SpannedString r(String str, String str2, List<u9.c> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        while (i15 < str2.length()) {
            char cCharAt = str2.charAt(i15);
            if (cCharAt == '&') {
                i15++;
                int iIndexOf = str2.indexOf(59, i15);
                int iIndexOf2 = str2.indexOf(32, i15);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    b(str2.substring(i15, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i15 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i15++;
            } else {
                int iG = i15 + 1;
                if (iG < str2.length()) {
                    boolean z15 = str2.charAt(iG) == '/';
                    iG = g(str2, iG);
                    int i16 = iG - 2;
                    boolean z16 = str2.charAt(i16) == '/';
                    int i17 = i15 + (z15 ? 2 : 1);
                    if (!z16) {
                        i16 = iG - 1;
                    }
                    String strSubstring = str2.substring(i17, i16);
                    if (!strSubstring.trim().isEmpty()) {
                        String strK = k(strSubstring);
                        if (l(strK)) {
                            if (z15) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    }
                                    if (cVar.f196551a.equals(strK)) {
                                        break;
                                    }
                                }
                            } else if (!z16) {
                                arrayDeque.push(c.a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i15 = iG;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static int s(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                t.h("WebvttCueParser", "Invalid anchor value: " + str);
                return PKIFailureInfo.systemUnavail;
        }
    }

    private static void t(String str, C5110e c5110e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c5110e.f196563g = s(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c5110e.f196561e = h.b(str);
            c5110e.f196562f = 0;
        } else {
            c5110e.f196561e = Integer.parseInt(str);
            c5110e.f196562f = 1;
        }
    }

    private static int u(String str) {
        str.getClass();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                t.h("WebvttCueParser", "Invalid anchor value: " + str);
                return PKIFailureInfo.systemUnavail;
        }
    }

    private static void v(String str, C5110e c5110e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c5110e.f196565i = u(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        c5110e.f196564h = h.b(str);
    }

    private static int w(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                t.h("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int x(String str) {
        str.getClass();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        t.h("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return PKIFailureInfo.systemUnavail;
    }
}
