package p9;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l9.e;
import l9.s;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import w7.c0;
import w7.l;
import w7.o0;
import w7.t;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f153528g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f153529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f153530b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, c> f153532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f153533e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f153534f = -3.4028235E38f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f153531c = new c0();

    public b(List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            this.f153529a = false;
            this.f153530b = null;
            return;
        }
        this.f153529a = true;
        String strG = o0.G(list.get(0));
        p.d(strG.startsWith("Format:"));
        this.f153530b = (a) p.q(a.a(strG));
        j(new c0(list.get(1)), StandardCharsets.UTF_8);
    }

    private static int d(long j15, List<Long> list, List<List<v7.a>> list2) {
        int i15;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i15 = 0;
                break;
            }
            if (list.get(size).longValue() == j15) {
                return size;
            }
            if (list.get(size).longValue() < j15) {
                i15 = size + 1;
                break;
            }
            size--;
        }
        list.add(i15, Long.valueOf(j15));
        list2.add(i15, i15 == 0 ? new ArrayList() : new ArrayList(list2.get(i15 - 1)));
        return i15;
    }

    private static float e(int i15) {
        if (i15 == 0) {
            return 0.05f;
        }
        if (i15 != 1) {
            return i15 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static v7.a f(String str, int i15, c cVar, c.b bVar, float f15, float f16) {
        SpannableString spannableString = new SpannableString(str);
        v7.a.b bVarT = new v7.a.b().o(spannableString).t(i15);
        if (cVar != null) {
            if (cVar.f153537c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f153537c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.f153544j == 3 && cVar.f153538d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.f153538d.intValue()), 0, spannableString.length(), 33);
            }
            float f17 = cVar.f153539e;
            if (f17 != -3.4028235E38f && f16 != -3.4028235E38f) {
                bVarT.q(f17 / f16, 1);
            }
            boolean z15 = cVar.f153540f;
            if (z15 && cVar.f153541g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z15) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f153541g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f153542h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f153543i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i16 = bVar.f153560a;
        if (i16 == -1) {
            i16 = cVar != null ? cVar.f153536b : -1;
        }
        bVarT.p(p(i16)).l(o(i16)).i(n(i16));
        PointF pointF = bVar.f153561b;
        if (pointF == null || f16 == -3.4028235E38f || f15 == -3.4028235E38f) {
            bVarT.k(e(bVarT.d()));
            bVarT.h(e(bVarT.c()), 0);
        } else {
            bVarT.k(pointF.x / f15);
            bVarT.h(bVar.f153561b.y / f16, 0);
        }
        return bVarT.a();
    }

    private Charset g(c0 c0Var) {
        Charset charsetA0 = c0Var.a0();
        return charsetA0 != null ? charsetA0 : StandardCharsets.UTF_8;
    }

    private void h(String str, a aVar, List<List<v7.a>> list, List<Long> list2) {
        int i15;
        int i16;
        p.d(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", aVar.f153527f);
        if (strArrSplit.length != aVar.f153527f) {
            t.h("SsaParser", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        int i17 = aVar.f153522a;
        if (i17 != -1) {
            try {
                i15 = Integer.parseInt(strArrSplit[i17].trim());
            } catch (RuntimeException unused) {
                t.h("SsaParser", "Fail to parse layer: " + strArrSplit[aVar.f153522a]);
                i15 = 0;
            }
        } else {
            i15 = 0;
        }
        int i18 = i15;
        long jM = m(strArrSplit[aVar.f153523b]);
        if (jM == -9223372036854775807L) {
            t.h("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        long jM2 = m(strArrSplit[aVar.f153524c]);
        if (jM2 == -9223372036854775807L || jM2 <= jM) {
            t.h("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        Map<String, c> map = this.f153532d;
        c cVar = (map == null || (i16 = aVar.f153525d) == -1) ? null : map.get(strArrSplit[i16].trim());
        String str2 = strArrSplit[aVar.f153526e];
        v7.a aVarF = f(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), i18, cVar, c.b.b(str2), this.f153533e, this.f153534f);
        int iD = d(jM2, list2, list);
        for (int iD2 = d(jM, list2, list); iD2 < iD; iD2++) {
            list.get(iD2).add(aVarF);
        }
    }

    private void i(c0 c0Var, List<List<v7.a>> list, List<Long> list2, Charset charset) {
        a aVarA = this.f153529a ? this.f153530b : null;
        while (true) {
            String strC = c0Var.C(charset);
            if (strC == null) {
                return;
            }
            if (strC.startsWith("Format:")) {
                aVarA = a.a(strC);
            } else if (strC.startsWith("Dialogue:")) {
                if (aVarA == null) {
                    t.h("SsaParser", "Skipping dialogue line before complete format: " + strC);
                } else {
                    h(strC, aVarA, list, list2);
                }
            }
        }
    }

    private void j(c0 c0Var, Charset charset) {
        while (true) {
            String strC = c0Var.C(charset);
            if (strC == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strC)) {
                k(c0Var, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strC)) {
                this.f153532d = l(c0Var, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(strC)) {
                t.f("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strC)) {
                return;
            }
        }
    }

    private void k(c0 c0Var, Charset charset) {
        while (true) {
            String strC = c0Var.C(charset);
            if (strC == null) {
                return;
            }
            if (c0Var.a() != 0 && c0Var.n(charset) == 91) {
                return;
            }
            String[] strArrSplit = strC.split(":");
            if (strArrSplit.length == 2) {
                String strF = zj.c.f(strArrSplit[0].trim());
                strF.getClass();
                if (strF.equals("playresx")) {
                    this.f153533e = Float.parseFloat(strArrSplit[1].trim());
                } else if (strF.equals("playresy")) {
                    try {
                        this.f153534f = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map<String, c> l(c0 c0Var, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVarA = null;
        while (true) {
            String strC = c0Var.C(charset);
            if (strC == null || (c0Var.a() != 0 && c0Var.n(charset) == 91)) {
                break;
            }
            if (strC.startsWith("Format:")) {
                aVarA = c.a.a(strC);
            } else if (strC.startsWith("Style:")) {
                if (aVarA == null) {
                    t.h("SsaParser", "Skipping 'Style:' line before 'Format:' line: " + strC);
                } else {
                    c cVarB = c.b(strC, aVarA);
                    if (cVarB != null) {
                        linkedHashMap.put(cVarB.f153535a, cVarB);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long m(String str) {
        Matcher matcher = f153528g.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) o0.h(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) o0.h(matcher.group(2))) * 60000000) + (Long.parseLong((String) o0.h(matcher.group(3))) * 1000000) + (Long.parseLong((String) o0.h(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    private static int n(int i15) {
        switch (i15) {
            case -1:
                return PKIFailureInfo.systemUnavail;
            case 0:
            default:
                t.h("SsaParser", "Unknown alignment: " + i15);
                return PKIFailureInfo.systemUnavail;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    private static int o(int i15) {
        switch (i15) {
            case -1:
                return PKIFailureInfo.systemUnavail;
            case 0:
            default:
                t.h("SsaParser", "Unknown alignment: " + i15);
                return PKIFailureInfo.systemUnavail;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    private static Layout.Alignment p(int i15) {
        switch (i15) {
            case -1:
                return null;
            case 0:
            default:
                t.h("SsaParser", "Unknown alignment: " + i15);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // l9.s
    public void b(byte[] bArr, int i15, int i16, s.b bVar, l<e> lVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f153531c.d0(bArr, i15 + i16);
        this.f153531c.f0(i15);
        Charset charsetG = g(this.f153531c);
        if (!this.f153529a) {
            j(this.f153531c, charsetG);
        }
        i(this.f153531c, arrayList, arrayList2, charsetG);
        ArrayList arrayList3 = (bVar.f117247a == -9223372036854775807L || !bVar.f117248b) ? null : new ArrayList();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            List<v7.a> list = arrayList.get(i17);
            if (!list.isEmpty() || i17 == 0) {
                if (i17 == arrayList.size() - 1) {
                    throw new IllegalStateException();
                }
                long jLongValue = arrayList2.get(i17).longValue();
                long jLongValue2 = arrayList2.get(i17 + 1).longValue();
                e eVar = new e(list, jLongValue, jLongValue2 - jLongValue);
                long j15 = bVar.f117247a;
                if (j15 == -9223372036854775807L || jLongValue2 >= j15) {
                    lVar.accept(eVar);
                } else if (arrayList3 != null) {
                    arrayList3.add(eVar);
                }
            }
        }
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
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
