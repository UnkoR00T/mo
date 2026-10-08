package lp;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import so.n0;

/* JADX INFO: loaded from: classes4.dex */
final class i implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f119100e = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l f119101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, g> f119102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n0 f119103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, List<String>> f119104d = new HashMap();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final l f119105a = new d(i.f119100e);
    }

    private static class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        double f119106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g f119107b;

        b(g gVar) {
            this.f119107b = gVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Double.compare(bVar.f119106a, this.f119106a);
        }
    }

    i() {
        e("Courier", new ArrayList(Arrays.asList("CourierNew", "CourierNewPSMT", "LiberationMono", "NimbusMonL-Regu", "DroidSansMono")));
        e("Courier-Bold", new ArrayList(Arrays.asList("CourierNewPS-BoldMT", "CourierNew-Bold", "LiberationMono-Bold", "NimbusMonL-Bold", "DroidSansMono")));
        e("Courier-Oblique", new ArrayList(Arrays.asList("CourierNewPS-ItalicMT", "CourierNew-Italic", "LiberationMono-Italic", "NimbusMonL-ReguObli", "DroidSansMono")));
        e("Courier-BoldOblique", new ArrayList(Arrays.asList("CourierNewPS-BoldItalicMT", "CourierNew-BoldItalic", "LiberationMono-BoldItalic", "NimbusMonL-BoldObli", "DroidSansMono")));
        e("Helvetica", new ArrayList(Arrays.asList("ArialMT", "Arial", "LiberationSans", "NimbusSanL-Regu", "Roboto-Regular")));
        e("Helvetica-Bold", new ArrayList(Arrays.asList("Arial-BoldMT", "Arial-Bold", "LiberationSans-Bold", "NimbusSanL-Bold", "Roboto-Bold")));
        e("Helvetica-Oblique", new ArrayList(Arrays.asList("Arial-ItalicMT", "Arial-Italic", "Helvetica-Italic", "LiberationSans-Italic", "NimbusSanL-ReguItal", "Roboto-Italic")));
        e("Helvetica-BoldOblique", new ArrayList(Arrays.asList("Arial-BoldItalicMT", "Helvetica-BoldItalic", "LiberationSans-BoldItalic", "NimbusSanL-BoldItal", "Roboto-BoldItalic")));
        e("Times-Roman", new ArrayList(Arrays.asList("TimesNewRomanPSMT", "TimesNewRoman", "TimesNewRomanPS", "LiberationSerif", "NimbusRomNo9L-Regu", "Roboto-Regular")));
        e("Times-Bold", new ArrayList(Arrays.asList("TimesNewRomanPS-BoldMT", "TimesNewRomanPS-Bold", "TimesNewRoman-Bold", "LiberationSerif-Bold", "NimbusRomNo9L-Medi", "DroidSerif-Bold", "Roboto-Bold")));
        e("Times-Italic", new ArrayList(Arrays.asList("TimesNewRomanPS-ItalicMT", "TimesNewRomanPS-Italic", "TimesNewRoman-Italic", "LiberationSerif-Italic", "NimbusRomNo9L-ReguItal", "DroidSerif-Italic", "Roboto-Italic")));
        e("Times-BoldItalic", new ArrayList(Arrays.asList("TimesNewRomanPS-BoldItalicMT", "TimesNewRomanPS-BoldItalic", "TimesNewRoman-BoldItalic", "LiberationSerif-BoldItalic", "NimbusRomNo9L-MediItal", "DroidSerif-BoldItalic", "Roboto-BoldItalic")));
        e("Symbol", new ArrayList(Arrays.asList("Symbol", "SymbolMT", "StandardSymL")));
        e("ZapfDingbats", new ArrayList(Arrays.asList("ZapfDingbatsITCbyBT-Regular", "ZapfDingbatsITC", "Dingbats", "MS-Gothic")));
        for (String str : h0.d()) {
            if (o(str).isEmpty()) {
                e(str, f(h0.c(str).toLowerCase(Locale.ENGLISH)));
            }
        }
        try {
            InputStream inputStreamA = yo.b.c() ? yo.b.a("com/tom_roush/pdfbox/resources/ttf/LiberationSans-Regular.ttf") : h.class.getResourceAsStream("/com/tom_roush/pdfbox/resources/ttf/LiberationSans-Regular.ttf");
            if (inputStreamA == null) {
                throw new IOException("resource 'com/tom_roush/pdfbox/resources/ttf/LiberationSans-Regular.ttf' not found");
            }
            this.f119103c = new so.j0().d(new BufferedInputStream(inputStreamA));
        } catch (IOException e15) {
            throw new RuntimeException(e15);
        }
    }

    private void e(String str, List<String> list) {
        this.f119104d.put(str.toLowerCase(Locale.ENGLISH), list);
    }

    private List<String> f(String str) {
        return new ArrayList(this.f119104d.get(str));
    }

    private Map<String, g> g(List<? extends g> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (g gVar : list) {
            Iterator<String> it = m(gVar.j()).iterator();
            while (it.hasNext()) {
                linkedHashMap.put(it.next().toLowerCase(Locale.ENGLISH), gVar);
            }
        }
        return linkedHashMap;
    }

    private mo.b h(f fVar, String str) {
        if (str == null) {
            return null;
        }
        if (this.f119101a == null) {
            n();
        }
        g gVarK = k(fVar, str);
        if (gVarK != null) {
            return gVarK.f();
        }
        g gVarK2 = k(fVar, str.replace("-", ""));
        if (gVarK2 != null) {
            return gVarK2.f();
        }
        Iterator<String> it = o(str).iterator();
        while (it.hasNext()) {
            g gVarK3 = k(fVar, it.next());
            if (gVarK3 != null) {
                return gVarK3.f();
            }
        }
        g gVarK4 = k(fVar, str.replace(",", "-"));
        if (gVarK4 != null) {
            return gVarK4.f();
        }
        g gVarK5 = k(fVar, str + "-Regular");
        if (gVarK5 != null) {
            return gVarK5.f();
        }
        return null;
    }

    private mo.b i(String str) {
        to.d dVar = (to.d) h(f.PFB, str);
        if (dVar != null) {
            return dVar;
        }
        n0 n0Var = (n0) h(f.TTF, str);
        if (n0Var != null) {
            return n0Var;
        }
        so.c0 c0Var = (so.c0) h(f.OTF, str);
        if (c0Var != null) {
            return c0Var;
        }
        return null;
    }

    private String j(s sVar) {
        if (sVar == null) {
            return "Times-Roman";
        }
        boolean z15 = false;
        if (sVar.k() != null) {
            String lowerCase = sVar.k().toLowerCase();
            if (lowerCase.contains("bold") || lowerCase.contains("black") || lowerCase.contains("heavy")) {
                z15 = true;
            }
        }
        if (sVar.o()) {
            if (z15 && sVar.q()) {
                return "Courier-BoldOblique";
            }
            if (z15) {
                return "Courier-Bold";
            }
            if (!sVar.q()) {
                return "Courier";
            }
            return "Courier-Oblique";
        }
        if (!sVar.r()) {
            if (z15 && sVar.q()) {
                return "Helvetica-BoldOblique";
            }
            if (z15) {
                return "Helvetica-Bold";
            }
            if (!sVar.q()) {
                return "Helvetica";
            }
            return "Helvetica-Oblique";
        }
        if (z15 && sVar.q()) {
            return "Times-BoldItalic";
        }
        if (z15) {
            return "Times-Bold";
        }
        if (sVar.q()) {
            return "Times-Italic";
        }
        return "Times-Roman";
    }

    private g k(f fVar, String str) {
        if (str.contains("+")) {
            str = str.substring(str.indexOf(43) + 1);
        }
        g gVar = this.f119102b.get(str.toLowerCase(Locale.ENGLISH));
        if (gVar == null || gVar.g() != fVar) {
            return null;
        }
        if (yo.a.b()) {
            String.format("getFont('%s','%s') returns %s", fVar, str, gVar);
        }
        return gVar;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0113  */
    /* JADX WARN: Code duplicated, block: B:58:0x011a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0120  */
    private PriorityQueue<b> l(s sVar, q qVar) {
        double d15;
        int iJ;
        int iL;
        PriorityQueue<b> priorityQueue = new PriorityQueue<>(20);
        for (g gVar : this.f119102b.values()) {
            if (qVar == null || p(qVar, gVar)) {
                b bVar = new b(gVar);
                if (sVar.n() == null || gVar.i() == null) {
                    if (sVar.l() > 0.0f && gVar.k() > 0) {
                        bVar.f119106a += 1.0d - (((double) (Math.abs(sVar.l() - gVar.k()) / 100.0f)) * 0.5d);
                    }
                    priorityQueue.add(bVar);
                } else {
                    x xVarA = sVar.n().a();
                    if (xVarA.d() == gVar.i().d()) {
                        if (xVarA.d() != 0 || ((!gVar.j().toLowerCase().contains("barcode") && !gVar.j().startsWith(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.K)) || q(sVar))) {
                            if (xVarA.h() == gVar.i().h()) {
                                bVar.f119106a += 2.0d;
                            } else {
                                if (xVarA.h() < 2 || xVarA.h() > 5 || gVar.i().h() < 2 || gVar.i().h() > 5) {
                                    if (xVarA.h() >= 11) {
                                        d15 = 0.5d;
                                        if (xVarA.h() <= 13 && gVar.i().h() >= 11 && gVar.i().h() <= 13) {
                                            bVar.f119106a += 1.0d;
                                        }
                                    } else {
                                        d15 = 0.5d;
                                    }
                                    if (xVarA.h() != 0 && gVar.i().h() != 0) {
                                        bVar.f119106a -= 1.0d;
                                    }
                                } else {
                                    bVar.f119106a += 1.0d;
                                }
                                iJ = gVar.i().j();
                                iL = gVar.l();
                                if (Math.abs(iJ - iL) > 2) {
                                    iJ = iL;
                                }
                                if (xVarA.j() == iJ) {
                                    bVar.f119106a += 2.0d;
                                } else if (xVarA.j() > 1 && iJ > 1) {
                                    bVar.f119106a += 1.0d - (((double) Math.abs(xVarA.j() - iJ)) * d15);
                                }
                            }
                            d15 = 0.5d;
                            iJ = gVar.i().j();
                            iL = gVar.l();
                            if (Math.abs(iJ - iL) > 2) {
                                iJ = iL;
                            }
                            if (xVarA.j() == iJ) {
                                bVar.f119106a += 2.0d;
                            } else if (xVarA.j() > 1) {
                                bVar.f119106a += 1.0d - (((double) Math.abs(xVarA.j() - iJ)) * d15);
                            }
                        }
                    }
                    priorityQueue.add(bVar);
                }
            }
        }
        return priorityQueue;
    }

    private Set<String> m(String str) {
        HashSet hashSet = new HashSet(2);
        hashSet.add(str);
        hashSet.add(str.replace("-", ""));
        return hashSet;
    }

    private List<String> o(String str) {
        List<String> list = this.f119104d.get(str.replace(" ", "").toLowerCase(Locale.ENGLISH));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    private boolean p(q qVar, g gVar) {
        if (gVar.a() != null) {
            return gVar.a().b().equals(qVar.b()) && gVar.a().a().equals(qVar.a());
        }
        long jB = gVar.b();
        if ("MalgunGothic-Semilight".equals(gVar.j())) {
            jB &= -1441793;
        }
        if (qVar.a().equals("GB1") && (jB & 262144) == 262144) {
            return true;
        }
        if (qVar.a().equals("CNS1") && (jB & 1048576) == 1048576) {
            return true;
        }
        if (qVar.a().equals("Japan1") && (jB & 131072) == 131072) {
            return true;
        }
        return qVar.a().equals("Korea1") && ((jB & 524288) == 524288 || (jB & 2097152) == 2097152);
    }

    private boolean q(s sVar) {
        String strG = sVar.g();
        if (strG == null) {
            strG = "";
        }
        String strK = sVar.k();
        String str = strK != null ? strK : "";
        return strG.startsWith(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.K) || strG.toLowerCase().contains("barcode") || str.startsWith(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.K) || str.toLowerCase().contains("barcode");
    }

    @Override // lp.h
    public k<n0> a(String str, s sVar) {
        f fVar = f.TTF;
        n0 n0Var = (n0) h(fVar, str);
        if (n0Var != null) {
            return new k<>(n0Var, false);
        }
        n0 n0Var2 = (n0) h(fVar, j(sVar));
        if (n0Var2 == null) {
            n0Var2 = this.f119103c;
        }
        return new k<>(n0Var2, true);
    }

    @Override // lp.h
    public k<mo.b> b(String str, s sVar) {
        mo.b bVarI = i(str);
        if (bVarI != null) {
            return new k<>(bVarI, false);
        }
        mo.b bVarI2 = i(j(sVar));
        if (bVarI2 == null) {
            bVarI2 = this.f119103c;
        }
        return new k<>(bVarI2, true);
    }

    @Override // lp.h
    public lp.a c(String str, s sVar, q qVar) {
        b bVarPoll;
        so.c0 c0Var = (so.c0) h(f.OTF, str);
        if (c0Var != null) {
            return new lp.a(c0Var, null, false);
        }
        n0 n0Var = (n0) h(f.TTF, str);
        if (n0Var != null) {
            return new lp.a(null, n0Var, false);
        }
        if (qVar != null) {
            String str2 = qVar.b() + "-" + qVar.a();
            if ((str2.equals("Adobe-GB1") || str2.equals("Adobe-CNS1") || str2.equals("Adobe-Japan1") || str2.equals("Adobe-Korea1")) && (bVarPoll = l(sVar, qVar).poll()) != null) {
                if (yo.a.b()) {
                    Objects.toString(bVarPoll.f119107b);
                }
                mo.b bVarF = bVarPoll.f119107b.f();
                if (bVarF instanceof so.c0) {
                    return new lp.a((so.c0) bVarF, null, true);
                }
                if (bVarF != null) {
                    return new lp.a(null, bVarF, true);
                }
            }
        }
        return new lp.a(null, this.f119103c, true);
    }

    public synchronized l n() {
        try {
            if (this.f119101a == null) {
                r(a.f119105a);
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return this.f119101a;
    }

    public synchronized void r(l lVar) {
        this.f119102b = g(lVar.a());
        this.f119101a = lVar;
    }
}
