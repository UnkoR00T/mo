package so;

import io.sentry.android.core.c2;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class n extends l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private LinkedHashMap<String, o> f182691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private e[] f182692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private j[] f182693i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<Integer, Integer> f182694j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<Integer, Integer> f182695k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f182696l;

    class a implements Comparator<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f182697a;

        a(List list) {
            this.f182697a = list;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e eVar, e eVar2) {
            int iIndexOf = this.f182697a.indexOf(eVar.f182702a);
            int iIndexOf2 = this.f182697a.indexOf(eVar2.f182702a);
            if (iIndexOf < iIndexOf2) {
                return -1;
            }
            return iIndexOf == iIndexOf2 ? 0 : 1;
        }
    }

    static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f182699a;

        b() {
        }

        abstract int a(int i15);
    }

    static class c extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int[] f182700b;

        c() {
        }

        @Override // so.n.b
        int a(int i15) {
            return Arrays.binarySearch(this.f182700b, i15);
        }

        public String toString() {
            return String.format("CoverageTableFormat1[coverageFormat=%d,glyphArray=%s]", Integer.valueOf(this.f182699a), Arrays.toString(this.f182700b));
        }
    }

    static class d extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        m[] f182701b;

        d() {
        }

        @Override // so.n.b
        int a(int i15) {
            for (m mVar : this.f182701b) {
                int i16 = mVar.f182717a;
                if (i16 <= i15 && i15 <= mVar.f182718b) {
                    return (mVar.f182719c + i15) - i16;
                }
            }
            return -1;
        }

        public String toString() {
            return String.format("CoverageTableFormat2[coverageFormat=%d]", Integer.valueOf(this.f182699a));
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f182702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        f f182703b;

        e() {
        }

        public String toString() {
            return String.format("FeatureRecord[featureTag=%s]", this.f182702a);
        }
    }

    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int[] f182704a;

        f() {
        }

        public String toString() {
            return String.format("FeatureTable[lookupListIndiciesCount=%d]", Integer.valueOf(this.f182704a.length));
        }
    }

    static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f182705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        h f182706b;

        g() {
        }

        public String toString() {
            return String.format("LangSysRecord[langSysTag=%s]", this.f182705a);
        }
    }

    static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f182707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int[] f182708b;

        h() {
        }

        public String toString() {
            return String.format("LangSysTable[requiredFeatureIndex=%d]", Integer.valueOf(this.f182707a));
        }
    }

    static abstract class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f182709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        b f182710b;

        i() {
        }

        abstract int a(int i15, int i16);
    }

    static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f182711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f182712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f182713c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        i[] f182714d;

        j() {
        }

        public String toString() {
            return String.format("LookupTable[lookupType=%d,lookupFlag=%d,markFilteringSet=%d]", Integer.valueOf(this.f182711a), Integer.valueOf(this.f182712b), Integer.valueOf(this.f182713c));
        }
    }

    static class k extends i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        short f182715c;

        k() {
        }

        @Override // so.n.i
        int a(int i15, int i16) {
            return i16 < 0 ? i15 : i15 + this.f182715c;
        }

        public String toString() {
            return String.format("LookupTypeSingleSubstFormat1[substFormat=%d,deltaGlyphID=%d]", Integer.valueOf(this.f182709a), Short.valueOf(this.f182715c));
        }
    }

    static class l extends i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int[] f182716c;

        l() {
        }

        @Override // so.n.i
        int a(int i15, int i16) {
            return i16 < 0 ? i15 : this.f182716c[i16];
        }

        public String toString() {
            return String.format("LookupTypeSingleSubstFormat2[substFormat=%d,substituteGlyphIDs=%s]", Integer.valueOf(this.f182709a), Arrays.toString(this.f182716c));
        }
    }

    static class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f182717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f182718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f182719c;

        m() {
        }

        public String toString() {
            return String.format("RangeRecord[startGlyphID=%d,endGlyphID=%d,startCoverageIndex=%d]", Integer.valueOf(this.f182717a), Integer.valueOf(this.f182718b), Integer.valueOf(this.f182719c));
        }
    }

    /* JADX INFO: renamed from: so.n$n, reason: collision with other inner class name */
    static class C4707n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f182720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        o f182721b;

        C4707n() {
        }

        public String toString() {
            return String.format("ScriptRecord[scriptTag=%s]", this.f182720a);
        }
    }

    static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        h f182722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        LinkedHashMap<String, h> f182723b;

        o() {
        }

        public String toString() {
            return String.format("ScriptTable[hasDefault=%s,langSysRecordsCount=%d]", Boolean.valueOf(this.f182722a != null), Integer.valueOf(this.f182723b.size()));
        }
    }

    n(n0 n0Var) {
        super(n0Var);
        this.f182694j = new HashMap();
        this.f182695k = new HashMap();
    }

    private void A(List<e> list, String str) {
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().f182702a.equals(str)) {
                it.remove();
            }
        }
    }

    private String B(String[] strArr) {
        if (strArr.length == 1) {
            String str = strArr[0];
            if ("Inherited".equals(str) || ("DFLT".equals(str) && !this.f182691g.containsKey(str))) {
                if (this.f182696l == null) {
                    this.f182696l = this.f182691g.keySet().iterator().next();
                }
                return this.f182696l;
            }
        }
        for (String str2 : strArr) {
            if (this.f182691g.containsKey(str2)) {
                this.f182696l = str2;
                return str2;
            }
        }
        return strArr[0];
    }

    private int j(e eVar, int i15) {
        for (int i16 : eVar.f182703b.f182704a) {
            j jVar = this.f182693i[i16];
            if (jVar.f182711a == 1) {
                i15 = l(jVar, i15);
            }
        }
        return i15;
    }

    private boolean k(List<e> list, String str) {
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().f182702a.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int l(j jVar, int i15) {
        for (i iVar : jVar.f182714d) {
            int iA = iVar.f182710b.a(i15);
            if (iA >= 0) {
                return iVar.a(i15, iA);
            }
        }
        return i15;
    }

    private List<e> m(Collection<h> collection, List<String> list) {
        if (collection.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (h hVar : collection) {
            int i15 = hVar.f182707a;
            if (i15 != 65535) {
                e[] eVarArr = this.f182692h;
                if (i15 < eVarArr.length) {
                    arrayList.add(eVarArr[i15]);
                }
            }
            for (int i16 : hVar.f182708b) {
                e[] eVarArr2 = this.f182692h;
                if (i16 < eVarArr2.length && (list == null || list.contains(eVarArr2[i16].f182702a))) {
                    arrayList.add(this.f182692h[i16]);
                }
            }
        }
        if (k(arrayList, "vrt2")) {
            A(arrayList, "vert");
        }
        if (list != null && arrayList.size() > 1) {
            Collections.sort(arrayList, new a(list));
        }
        return arrayList;
    }

    private Collection<h> n(String str) {
        List list = Collections.EMPTY_LIST;
        o oVar = this.f182691g.get(str);
        if (oVar == null) {
            return list;
        }
        if (oVar.f182722a == null) {
            return oVar.f182723b.values();
        }
        ArrayList arrayList = new ArrayList(oVar.f182723b.values());
        arrayList.add(oVar.f182722a);
        return arrayList;
    }

    @Override // so.l0
    void e(n0 n0Var, i0 i0Var) throws EOFException {
        long jB = i0Var.b();
        i0Var.N();
        int iN = i0Var.N();
        int iN2 = i0Var.N();
        int iN3 = i0Var.N();
        int iN4 = i0Var.N();
        if (iN == 1) {
            i0Var.M();
        }
        this.f182691g = y(i0Var, ((long) iN2) + jB);
        this.f182692h = r(i0Var, ((long) iN3) + jB);
        this.f182693i = u(i0Var, jB + ((long) iN4));
    }

    public int o(int i15, String[] strArr, List<String> list) {
        if (i15 == -1) {
            return -1;
        }
        Integer num = this.f182694j.get(Integer.valueOf(i15));
        if (num != null) {
            return num.intValue();
        }
        Iterator<e> it = m(n(B(strArr)), list).iterator();
        int iJ = i15;
        while (it.hasNext()) {
            iJ = j(it.next(), iJ);
        }
        this.f182694j.put(Integer.valueOf(i15), Integer.valueOf(iJ));
        this.f182695k.put(Integer.valueOf(iJ), Integer.valueOf(i15));
        return iJ;
    }

    public int p(int i15) {
        Integer num = this.f182695k.get(Integer.valueOf(i15));
        if (num != null) {
            return num.intValue();
        }
        c2.g("PdfBox-Android", "Trying to un-substitute a never-before-seen gid: " + i15);
        return i15;
    }

    b q(i0 i0Var, long j15) throws IOException {
        i0Var.seek(j15);
        int iN = i0Var.N();
        int i15 = 0;
        if (iN == 1) {
            c cVar = new c();
            cVar.f182699a = iN;
            int iN2 = i0Var.N();
            cVar.f182700b = new int[iN2];
            while (i15 < iN2) {
                cVar.f182700b[i15] = i0Var.N();
                i15++;
            }
            return cVar;
        }
        if (iN != 2) {
            throw new IOException("Unknown coverage format: " + iN);
        }
        d dVar = new d();
        dVar.f182699a = iN;
        int iN3 = i0Var.N();
        dVar.f182701b = new m[iN3];
        while (i15 < iN3) {
            dVar.f182701b[i15] = x(i0Var);
            i15++;
        }
        return dVar;
    }

    e[] r(i0 i0Var, long j15) {
        i0Var.seek(j15);
        int iN = i0Var.N();
        e[] eVarArr = new e[iN];
        int[] iArr = new int[iN];
        String str = "";
        for (int i15 = 0; i15 < iN; i15++) {
            e eVar = new e();
            String strH = i0Var.H(4);
            eVar.f182702a = strH;
            if (i15 > 0 && strH.compareTo(str) < 0 && (!eVar.f182702a.matches("\\w{4}") || !str.matches("\\w{4}"))) {
                c2.g("PdfBox-Android", "FeatureRecord array not alphabetically sorted by FeatureTag: " + eVar.f182702a + " < " + str);
                return new e[0];
            }
            iArr[i15] = i0Var.N();
            eVarArr[i15] = eVar;
            str = eVar.f182702a;
        }
        for (int i16 = 0; i16 < iN; i16++) {
            eVarArr[i16].f182703b = s(i0Var, ((long) iArr[i16]) + j15);
        }
        return eVarArr;
    }

    f s(i0 i0Var, long j15) {
        i0Var.seek(j15);
        f fVar = new f();
        i0Var.N();
        int iN = i0Var.N();
        fVar.f182704a = new int[iN];
        for (int i15 = 0; i15 < iN; i15++) {
            fVar.f182704a[i15] = i0Var.N();
        }
        return fVar;
    }

    h t(i0 i0Var, long j15) {
        i0Var.seek(j15);
        h hVar = new h();
        i0Var.N();
        hVar.f182707a = i0Var.N();
        int iN = i0Var.N();
        hVar.f182708b = new int[iN];
        for (int i15 = 0; i15 < iN; i15++) {
            hVar.f182708b[i15] = i0Var.N();
        }
        return hVar;
    }

    j[] u(i0 i0Var, long j15) {
        i0Var.seek(j15);
        int iN = i0Var.N();
        int[] iArr = new int[iN];
        for (int i15 = 0; i15 < iN; i15++) {
            iArr[i15] = i0Var.N();
        }
        j[] jVarArr = new j[iN];
        for (int i16 = 0; i16 < iN; i16++) {
            jVarArr[i16] = w(i0Var, ((long) iArr[i16]) + j15);
        }
        return jVarArr;
    }

    i v(i0 i0Var, long j15) throws IOException {
        i0Var.seek(j15);
        int iN = i0Var.N();
        if (iN == 1) {
            k kVar = new k();
            kVar.f182709a = iN;
            int iN2 = i0Var.N();
            kVar.f182715c = i0Var.E();
            kVar.f182710b = q(i0Var, j15 + ((long) iN2));
            return kVar;
        }
        if (iN != 2) {
            throw new IOException("Unknown substFormat: " + iN);
        }
        l lVar = new l();
        lVar.f182709a = iN;
        int iN3 = i0Var.N();
        int iN4 = i0Var.N();
        lVar.f182716c = new int[iN4];
        for (int i15 = 0; i15 < iN4; i15++) {
            lVar.f182716c[i15] = i0Var.N();
        }
        lVar.f182710b = q(i0Var, j15 + ((long) iN3));
        return lVar;
    }

    j w(i0 i0Var, long j15) {
        i0Var.seek(j15);
        j jVar = new j();
        jVar.f182711a = i0Var.N();
        jVar.f182712b = i0Var.N();
        int iN = i0Var.N();
        int[] iArr = new int[iN];
        for (int i15 = 0; i15 < iN; i15++) {
            iArr[i15] = i0Var.N();
        }
        if ((jVar.f182712b & 16) != 0) {
            jVar.f182713c = i0Var.N();
        }
        jVar.f182714d = new i[iN];
        if (jVar.f182711a != 1) {
            return jVar;
        }
        for (int i16 = 0; i16 < iN; i16++) {
            jVar.f182714d[i16] = v(i0Var, ((long) iArr[i16]) + j15);
        }
        return jVar;
    }

    m x(i0 i0Var) {
        m mVar = new m();
        mVar.f182717a = i0Var.N();
        mVar.f182718b = i0Var.N();
        mVar.f182719c = i0Var.N();
        return mVar;
    }

    LinkedHashMap<String, o> y(i0 i0Var, long j15) {
        i0Var.seek(j15);
        int iN = i0Var.N();
        C4707n[] c4707nArr = new C4707n[iN];
        int[] iArr = new int[iN];
        for (int i15 = 0; i15 < iN; i15++) {
            C4707n c4707n = new C4707n();
            c4707n.f182720a = i0Var.H(4);
            iArr[i15] = i0Var.N();
            c4707nArr[i15] = c4707n;
        }
        for (int i16 = 0; i16 < iN; i16++) {
            c4707nArr[i16].f182721b = z(i0Var, ((long) iArr[i16]) + j15);
        }
        LinkedHashMap<String, o> linkedHashMap = new LinkedHashMap<>(iN);
        for (int i17 = 0; i17 < iN; i17++) {
            C4707n c4707n2 = c4707nArr[i17];
            linkedHashMap.put(c4707n2.f182720a, c4707n2.f182721b);
        }
        return linkedHashMap;
    }

    o z(i0 i0Var, long j15) throws IOException {
        i0Var.seek(j15);
        o oVar = new o();
        int iN = i0Var.N();
        int iN2 = i0Var.N();
        g[] gVarArr = new g[iN2];
        int[] iArr = new int[iN2];
        String str = "";
        for (int i15 = 0; i15 < iN2; i15++) {
            g gVar = new g();
            String strH = i0Var.H(4);
            gVar.f182705a = strH;
            if (i15 > 0 && strH.compareTo(str) <= 0) {
                throw new IOException("LangSysRecords not alphabetically sorted by LangSys tag: " + gVar.f182705a + " <= " + str);
            }
            iArr[i15] = i0Var.N();
            gVarArr[i15] = gVar;
            str = gVar.f182705a;
        }
        if (iN != 0) {
            oVar.f182722a = t(i0Var, ((long) iN) + j15);
        }
        for (int i16 = 0; i16 < iN2; i16++) {
            gVarArr[i16].f182706b = t(i0Var, ((long) iArr[i16]) + j15);
        }
        oVar.f182723b = new LinkedHashMap<>(iN2);
        for (int i17 = 0; i17 < iN2; i17++) {
            g gVar2 = gVarArr[i17];
            oVar.f182723b.put(gVar2.f182705a, gVar2.f182706b);
        }
        return oVar;
    }
}
