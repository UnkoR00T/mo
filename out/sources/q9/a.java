package q9;

import ak.n0;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l9.e;
import l9.s;
import w7.c0;
import w7.l;
import w7.t;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f165366d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f165367e = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f165368a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f165369b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f165370c = new c0();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b6  */
    private v7.a d(Spanned spanned, String str) {
        v7.a.b bVarO = new v7.a.b().o(spanned);
        if (str == null) {
            return bVarO.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    bVarO.l(1);
                } else {
                    bVarO.l(0);
                }
                break;
            case -685620679:
                str.equals("{\\an2}");
                bVarO.l(1);
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    bVarO.l(1);
                } else {
                    bVarO.l(2);
                }
                break;
            case -685620617:
                if (!str.equals("{\\an4}")) {
                    bVarO.l(1);
                } else {
                    bVarO.l(0);
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                bVarO.l(1);
                break;
            case -685620555:
                if (!str.equals("{\\an6}")) {
                    bVarO.l(1);
                } else {
                    bVarO.l(2);
                }
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    bVarO.l(1);
                } else {
                    bVarO.l(0);
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                bVarO.l(1);
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    bVarO.l(1);
                } else {
                    bVarO.l(2);
                }
                break;
            default:
                bVarO.l(1);
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    bVarO.i(1);
                } else {
                    bVarO.i(2);
                }
                break;
            case -685620679:
                if (!str.equals("{\\an2}")) {
                    bVarO.i(1);
                } else {
                    bVarO.i(2);
                }
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    bVarO.i(1);
                } else {
                    bVarO.i(2);
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                bVarO.i(1);
                break;
            case -685620586:
                str.equals("{\\an5}");
                bVarO.i(1);
                break;
            case -685620555:
                str.equals("{\\an6}");
                bVarO.i(1);
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    bVarO.i(1);
                } else {
                    bVarO.i(0);
                }
                break;
            case -685620493:
                if (!str.equals("{\\an8}")) {
                    bVarO.i(1);
                } else {
                    bVarO.i(0);
                }
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    bVarO.i(1);
                } else {
                    bVarO.i(0);
                }
                break;
            default:
                bVarO.i(1);
                break;
        }
        return bVarO.k(f(bVarO.d())).h(f(bVarO.c()), 0).a();
    }

    private Charset e(c0 c0Var) {
        Charset charsetA0 = c0Var.a0();
        return charsetA0 != null ? charsetA0 : StandardCharsets.UTF_8;
    }

    public static float f(int i15) {
        if (i15 == 0) {
            return 0.08f;
        }
        if (i15 == 1) {
            return 0.5f;
        }
        if (i15 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long g(Matcher matcher, int i15) {
        String strGroup = matcher.group(i15 + 1);
        long j15 = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) p.q(matcher.group(i15 + 2))) * 60000) + (Long.parseLong((String) p.q(matcher.group(i15 + 3))) * 1000);
        String strGroup2 = matcher.group(i15 + 4);
        if (strGroup2 != null) {
            j15 += Long.parseLong(strGroup2);
        }
        return j15 * 1000;
    }

    private String h(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb5 = new StringBuilder(strTrim);
        Matcher matcher = f165367e.matcher(strTrim);
        int i15 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i15;
            int length = strGroup.length();
            sb5.replace(iStart, iStart + length, "");
            i15 += length;
        }
        return sb5.toString();
    }

    @Override // l9.s
    public void b(byte[] bArr, int i15, int i16, s.b bVar, l<e> lVar) {
        long j15;
        String str;
        this.f165370c.d0(bArr, i15 + i16);
        this.f165370c.f0(i15);
        Charset charsetE = e(this.f165370c);
        long j16 = -9223372036854775807L;
        ArrayList arrayList = (bVar.f117247a == -9223372036854775807L || !bVar.f117248b) ? null : new ArrayList();
        while (true) {
            String strC = this.f165370c.C(charsetE);
            if (strC == null) {
                break;
            }
            if (!strC.isEmpty()) {
                try {
                    Integer.parseInt(strC);
                    String strC2 = this.f165370c.C(charsetE);
                    if (strC2 == null) {
                        t.h("SubripParser", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f165366d.matcher(strC2);
                    if (matcher.matches()) {
                        long jG = g(matcher, 1);
                        long jG2 = g(matcher, 6);
                        int i17 = 0;
                        this.f165368a.setLength(0);
                        this.f165369b.clear();
                        String strC3 = this.f165370c.C(charsetE);
                        while (!TextUtils.isEmpty(strC3)) {
                            if (this.f165368a.length() > 0) {
                                this.f165368a.append("<br>");
                            }
                            this.f165368a.append(h(strC3, this.f165369b));
                            strC3 = this.f165370c.C(charsetE);
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.f165368a.toString());
                        while (true) {
                            if (i17 >= this.f165369b.size()) {
                                str = null;
                                break;
                            }
                            str = this.f165369b.get(i17);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                        j15 = j16;
                        long j17 = bVar.f117247a;
                        if (j17 == j15 || jG2 >= j17) {
                            lVar.accept(new e(n0.E(d(spannedFromHtml, str)), jG, jG2 - jG));
                        } else if (arrayList != null) {
                            arrayList.add(new e(n0.E(d(spannedFromHtml, str)), jG, jG2 - jG));
                        }
                    } else {
                        j15 = j16;
                        t.h("SubripParser", "Skipping invalid timing: " + strC2);
                    }
                    j16 = j15;
                } catch (NumberFormatException unused) {
                    j15 = j16;
                    t.h("SubripParser", "Skipping invalid index: " + strC);
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                lVar.accept((e) it.next());
            }
        }
    }

    @Override // l9.s
    public int c() {
        return 1;
    }
}
