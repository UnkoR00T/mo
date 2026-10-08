package gp;

import bp.k;
import bp.l;
import io.sentry.android.core.c2;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lp.r;
import so.n0;
import tp.m;
import tp.o;
import vp.q;

/* JADX INFO: loaded from: classes4.dex */
public class c implements Closeable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f75779n = {0, 1000000000, 1000000000, 1000000000};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.e f75780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f75781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private jp.f f75782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f75783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f75784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final dp.g f75785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private jp.a f75786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set<r> f75787h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Set<n0> f75788j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private up.f f75789k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private j f75790l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f75791m;

    static {
        op.e.f148062c.f(new float[]{1.0f, 1.0f, 1.0f, 1.0f});
        try {
            k.A3(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1);
            k.A3("1");
        } catch (IOException unused) {
        }
    }

    public c() {
        this(dp.b.f());
    }

    private boolean C(Iterator<vp.j> it, q qVar) {
        while (it.hasNext()) {
            vp.j next = it.next();
            if ((next instanceof q) && next.D1().equals(qVar.D1())) {
                return true;
            }
        }
        return false;
    }

    private void C0(m mVar) {
        mVar.n(new hp.g());
        o oVar = new o();
        tp.q qVar = new tp.q(this);
        qVar.h(new hp.g());
        oVar.c(qVar);
        mVar.i(oVar);
    }

    private q E(Iterator<vp.j> it, up.c cVar) {
        q qVar;
        up.c cVarM;
        while (it.hasNext()) {
            vp.j next = it.next();
            if ((next instanceof q) && (cVarM = (qVar = (q) next).m()) != null && cVarM.D1().equals(cVar.D1())) {
                return qVar;
            }
        }
        return null;
    }

    private void H0(m mVar, vp.d dVar, bp.e eVar) {
        boolean z15 = true;
        boolean z16 = true;
        for (l lVar : eVar.i4()) {
            if (!z15 && !z16) {
                break;
            }
            bp.b bVarX3 = lVar.X3();
            if (bVarX3 instanceof bp.d) {
                bp.d dVar2 = (bp.d) bVarX3;
                bp.b bVarP4 = dVar2.p4(bp.i.f20732e9);
                if (z15 && bp.i.C.equals(bVarP4)) {
                    u(mVar, dVar2);
                    z15 = false;
                }
                bp.b bVarP5 = dVar2.p4(bp.i.V3);
                bp.b bVarP6 = dVar2.p4(bp.i.H);
                if (z16 && bp.i.U7.equals(bVarP5) && (bVarP6 instanceof bp.d)) {
                    r(mVar, (bp.d) bVarP6);
                    p(dVar, dVar2);
                    z16 = false;
                }
            }
        }
        if (z15 || z16) {
            throw new IllegalArgumentException("Template is missing required objects");
        }
    }

    public static c d0(byte[] bArr) {
        return n0(bArr, "");
    }

    public static c n0(byte[] bArr, String str) {
        return t0(bArr, str, null, null);
    }

    private void p(vp.d dVar, bp.d dVar2) {
        bp.i iVar = bp.i.O2;
        bp.b bVarP4 = dVar2.p4(iVar);
        if (bVarP4 instanceof bp.d) {
            bp.d dVar3 = (bp.d) bVarP4;
            h hVarB = dVar.b();
            if (hVarB == null) {
                dVar.D1().Y4(iVar, dVar3);
                dVar3.A2(true);
                dVar3.f5(true);
                return;
            }
            bp.d dVarD1 = hVarB.D1();
            bp.i iVar2 = bp.i.N9;
            bp.b bVarC4 = dVar3.C4(iVar2);
            bp.b bVarC5 = dVarD1.C4(iVar2);
            if ((bVarC4 instanceof bp.d) && (bVarC5 instanceof bp.d)) {
                ((bp.d) bVarC5).i3((bp.d) bVarC4);
                dVarD1.f5(true);
            }
        }
    }

    private void r(m mVar, bp.d dVar) {
        o oVar = new o(dVar);
        dVar.A2(true);
        mVar.i(oVar);
    }

    public static c t0(byte[] bArr, String str, InputStream inputStream, String str2) {
        return u0(bArr, str, inputStream, str2, dp.b.f());
    }

    private void u(m mVar, bp.d dVar) {
        hp.g gVarF = mVar.f();
        if (gVarF == null || gVarF.b().size() != 4) {
            mVar.n(new hp.g((bp.a) dVar.p4(bp.i.f20893u7)));
        }
    }

    public static c u0(byte[] bArr, String str, InputStream inputStream, String str2, dp.b bVar) {
        ep.f fVar = new ep.f(new dp.d(bArr), str, inputStream, str2, new dp.i(bVar));
        fVar.V0();
        return fVar.S0();
    }

    private boolean y(List<tp.b> list, m mVar) {
        Iterator<tp.b> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().D1().equals(mVar.D1())) {
                return true;
            }
        }
        return false;
    }

    public bp.e H() {
        return this.f75780a;
    }

    public d I() {
        if (this.f75781b == null) {
            bp.b bVarP4 = this.f75780a.k4().p4(bp.i.D7);
            if (bVarP4 instanceof bp.d) {
                this.f75781b = new d(this, (bp.d) bVarP4);
            } else {
                this.f75781b = new d(this);
            }
        }
        return this.f75781b;
    }

    public Long J() {
        return this.f75784e;
    }

    public jp.f K() {
        if (this.f75782c == null && c0()) {
            this.f75782c = new jp.f(this.f75780a.X3());
        }
        return this.f75782c;
    }

    Set<r> L() {
        return this.f75787h;
    }

    public e M(int i15) {
        return I().c().k(i15);
    }

    public g N() {
        return I().c();
    }

    public j O() {
        return this.f75790l;
    }

    public void O0(n0 n0Var) {
        this.f75788j.add(n0Var);
    }

    public void T0(OutputStream outputStream) throws IOException {
        if (this.f75780a.isClosed()) {
            throw new IOException("Cannot save a document which has been closed");
        }
        Iterator<r> it = this.f75787h.iterator();
        while (it.hasNext()) {
            it.next().v();
        }
        this.f75787h.clear();
        fp.b bVar = new fp.b(outputStream);
        try {
            bVar.s1(this);
        } finally {
            bVar.close();
        }
    }

    public List<up.c> V() {
        ArrayList arrayList = new ArrayList();
        Iterator<q> it = Z().iterator();
        while (it.hasNext()) {
            bp.b bVarP4 = it.next().D1().p4(bp.i.f20863r9);
            if (bVarP4 != null) {
                arrayList.add(new up.c((bp.d) bVarP4));
            }
        }
        return arrayList;
    }

    public up.b Y0(OutputStream outputStream) {
        if (this.f75785f == null) {
            throw new IllegalStateException("document was not loaded from a file or a stream");
        }
        Iterator<up.c> it = V().iterator();
        up.c next = null;
        while (it.hasNext()) {
            next = it.next();
            if (next.D1().O0()) {
                break;
            }
        }
        if (!Arrays.equals(next.a(), f75779n)) {
            throw new IllegalStateException("signature reserve byte range has been changed after addSignature(), please set the byte range that existed after addSignature()");
        }
        fp.b bVar = new fp.b(outputStream, this.f75785f);
        bVar.s1(this);
        up.f fVar = new up.f(bVar);
        this.f75789k = fVar;
        return fVar;
    }

    public List<q> Z() {
        ArrayList arrayList = new ArrayList();
        vp.d dVarA = I().a(null);
        if (dVarA != null) {
            for (vp.j jVar : dVarA.e()) {
                if (jVar instanceof q) {
                    arrayList.add((q) jVar);
                }
            }
        }
        return arrayList;
    }

    public float a0() {
        float f15;
        float fL4 = H().l4();
        if (fL4 < 1.4f) {
            return fL4;
        }
        String strD = I().d();
        if (strD != null) {
            try {
                f15 = Float.parseFloat(strD);
            } catch (NumberFormatException e15) {
                c2.f("PdfBox-Android", "Can't extract the version number of the document catalog.", e15);
                f15 = -1.0f;
            }
        } else {
            f15 = -1.0f;
        }
        return Math.max(f15, fL4);
    }

    public void b(e eVar) {
        N().i(eVar);
    }

    public boolean b0() {
        return this.f75783d;
    }

    public boolean c0() {
        return this.f75780a.n4();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f75780a.isClosed()) {
            return;
        }
        up.f fVar = this.f75789k;
        IOException iOExceptionA = dp.a.a(this.f75780a, "COSDocument", fVar != null ? dp.a.a(fVar, "SigningSupport", null) : null);
        dp.g gVar = this.f75785f;
        if (gVar != null) {
            iOExceptionA = dp.a.a(gVar, "RandomAccessRead pdfSource", iOExceptionA);
        }
        Iterator<n0> it = this.f75788j.iterator();
        while (it.hasNext()) {
            iOExceptionA = dp.a.a(it.next(), "TrueTypeFont", iOExceptionA);
        }
        if (iOExceptionA != null) {
            throw iOExceptionA;
        }
    }

    public void d1(jp.f fVar) {
        this.f75782c = fVar;
    }

    public void h(up.c cVar, up.d dVar, up.e eVar) {
        m mVar;
        if (this.f75791m) {
            throw new IllegalStateException("Only one signature may be added in a document");
        }
        this.f75791m = true;
        int iH = eVar.h();
        if (iH > 0) {
            cVar.d(new byte[iH]);
        } else {
            cVar.d(new byte[9472]);
        }
        cVar.c(f75779n);
        g gVarN = N();
        int iN = gVarN.n();
        if (iN == 0) {
            throw new IllegalStateException("Cannot sign an empty document");
        }
        e eVarK = gVarN.k(Math.min(Math.max(eVar.b(), 0), iN - 1));
        d dVarI = I();
        q qVar = null;
        vp.d dVarA = dVarI.a(null);
        dVarI.D1().f5(true);
        if (dVarA == null) {
            dVarA = new vp.d(this);
            dVarI.e(dVarA);
        } else {
            dVarA.D1().f5(true);
        }
        bp.d dVarA2 = dVarA.D1();
        bp.i iVar = bp.i.f20911w3;
        bp.b bVarP4 = dVarA2.p4(iVar);
        if (bVarP4 instanceof bp.a) {
            ((bp.a) bVarP4).r4(true);
            qVar = E(dVarA.d(), cVar);
        } else {
            dVarA.D1().Y4(iVar, new bp.a());
        }
        if (qVar == null) {
            qVar = new q(dVarA);
            qVar.o(cVar);
            m mVar2 = qVar.k().get(0);
            mVar2.l(eVarK);
            mVar = mVar2;
        } else {
            m mVar3 = qVar.k().get(0);
            cVar.D1().f5(true);
            mVar = mVar3;
        }
        mVar.m(true);
        List<vp.j> listF = dVarA.f();
        dVarA.D1().A2(true);
        dVarA.j(true);
        dVarA.i(true);
        boolean zC = C(dVarA.d(), qVar);
        if (zC) {
            qVar.D1().f5(true);
        } else {
            listF.add(qVar);
        }
        bp.e eVarM = eVar.m();
        if (eVarM == null) {
            C0(mVar);
            return;
        }
        H0(mVar, dVarA, eVarM);
        List<tp.b> listC = eVarK.c();
        eVarK.j(listC);
        if (!zC || !(listC instanceof hp.a) || !(listF instanceof hp.a) || !((hp.a) listC).j().equals(((hp.a) listF).j())) {
            if (y(listC, mVar)) {
                mVar.D1().f5(true);
            } else {
                listC.add(mVar);
            }
        }
        eVarK.D1().f5(true);
    }

    public void i1(float f15) {
        float fA0 = a0();
        if (f15 == fA0) {
            return;
        }
        if (f15 < fA0) {
            c2.e("PdfBox-Android", "It's not allowed to downgrade the version of a pdf.");
        } else if (H().l4() >= 1.4f) {
            I().f(Float.toString(f15));
        } else {
            H().w4(f15);
        }
    }

    public void m(up.c cVar, up.e eVar) {
        h(cVar, null, eVar);
    }

    public c(dp.b bVar) {
        dp.i iVar;
        this.f75787h = new HashSet();
        this.f75788j = new HashSet();
        this.f75790l = new a();
        this.f75791m = false;
        try {
            iVar = new dp.i(bVar);
        } catch (IOException e15) {
            c2.g("PdfBox-Android", "Error initializing scratch file: " + e15.getMessage() + ". Fall back to main memory usage only.");
            try {
                iVar = new dp.i(dp.b.f());
            } catch (IOException unused) {
                iVar = null;
            }
        }
        bp.e eVar = new bp.e(iVar);
        this.f75780a = eVar;
        this.f75785f = null;
        bp.d dVar = new bp.d();
        eVar.v4(dVar);
        bp.d dVar2 = new bp.d();
        dVar.Y4(bp.i.D7, dVar2);
        bp.i iVar2 = bp.i.f20732e9;
        dVar2.Y4(iVar2, bp.i.Z0);
        dVar2.Y4(bp.i.f20895u9, bp.i.J3("1.4"));
        bp.d dVar3 = new bp.d();
        bp.i iVar3 = bp.i.F6;
        dVar2.Y4(iVar3, dVar3);
        dVar3.Y4(iVar2, iVar3);
        dVar3.Y4(bp.i.Q4, new bp.a());
        dVar3.Y4(bp.i.P1, bp.h.f20678g);
    }

    public c(bp.e eVar, dp.g gVar, jp.a aVar) {
        this.f75787h = new HashSet();
        this.f75788j = new HashSet();
        this.f75790l = new a();
        this.f75791m = false;
        this.f75780a = eVar;
        this.f75785f = gVar;
        this.f75786g = aVar;
    }
}
