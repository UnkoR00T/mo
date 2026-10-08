package lp;

import android.graphics.Path;
import android.graphics.RectF;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import so.n0;

/* JADX INFO: loaded from: classes4.dex */
abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gp.c f119112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected n0 f119113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected s f119114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    protected final so.d f119115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final so.c f119116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<Integer> f119117f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f119118g;

    j0(gp.c cVar, bp.d dVar, n0 n0Var, boolean z15) throws IOException {
        this.f119112a = cVar;
        this.f119118g = z15;
        this.f119113b = n0Var;
        this.f119114c = d(n0Var);
        if (!f(n0Var)) {
            throw new IOException("This font does not permit embedding");
        }
        if (!z15) {
            InputStream inputStreamB0 = n0Var.b0();
            byte[] bArr = new byte[4];
            inputStreamB0.mark(4);
            if (inputStreamB0.read(bArr) == 4 && new String(bArr).equals("ttcf")) {
                inputStreamB0.close();
                throw new IOException("Full embedding of TrueType font collections not supported");
            }
            if (inputStreamB0.markSupported()) {
                inputStreamB0.reset();
            } else {
                inputStreamB0.close();
                inputStreamB0 = n0Var.b0();
            }
            hp.h hVar = new hp.h(cVar, inputStreamB0, bp.i.E3);
            hVar.D1().c5(bp.i.f20708c5, n0Var.c0());
            this.f119114c.E(hVar);
        }
        dVar.d5(bp.i.f20897v0, n0Var.getName());
        this.f119115d = n0Var.H0();
        this.f119116e = n0Var.Y0();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    private s d(n0 n0Var) throws IOException {
        String name = n0Var.getName();
        so.z zVarA0 = n0Var.a0();
        if (zVarA0 == null) {
            throw new IOException("os2 table is missing in font " + name);
        }
        so.e0 e0VarD0 = n0Var.d0();
        if (e0VarD0 == null) {
            throw new IOException("post table is missing in font " + name);
        }
        s sVar = new s();
        sVar.F(name);
        so.q qVarL = n0Var.L();
        sVar.z(e0VarD0.k() > 0 || qVarL.s() == 1);
        sVar.H((zVarA0.p() & 513) != 0);
        int iO = zVarA0.o();
        if (iO == 1 || iO == 7) {
            sVar.L(true);
        } else if (iO == 10) {
            sVar.K(true);
        } else if (iO == 3 || iO == 4 || iO == 5) {
            sVar.L(true);
        }
        sVar.G(zVarA0.H());
        sVar.N(true);
        sVar.J(false);
        sVar.I(e0VarD0.l());
        so.p pVarK = n0Var.K();
        hp.g gVar = new hp.g();
        float fT = 1000.0f / pVarK.t();
        gVar.i(pVarK.w() * fT);
        gVar.j(pVarK.y() * fT);
        gVar.k(pVarK.v() * fT);
        gVar.l(pVarK.x() * fT);
        sVar.C(gVar);
        sVar.t(qVarL.k() * fT);
        sVar.y(qVarL.n() * fT);
        if (zVarA0.G() >= 1.2d) {
            sVar.w(zVarA0.l() * fT);
            sVar.O(zVarA0.r() * fT);
        } else {
            Path pathR = n0Var.r(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n);
            if (pathR != null) {
                RectF rectF = new RectF();
                pathR.computeBounds(rectF, true);
                sVar.w(Math.round(rectF.bottom) * fT);
            } else {
                sVar.w((zVarA0.D() + zVarA0.E()) * fT);
            }
            Path pathR2 = n0Var.r("x");
            if (pathR2 != null) {
                RectF rectF2 = new RectF();
                pathR2.computeBounds(rectF2, true);
                sVar.O(Math.round(rectF2.bottom) * fT);
            } else {
                sVar.O((zVarA0.D() / 2.0f) * fT);
            }
        }
        sVar.M(sVar.f().h() * 0.13f);
        return sVar;
    }

    private boolean g(n0 n0Var) {
        return n0Var.a0() == null || (n0Var.a0().q() & 256) != 256;
    }

    public void a(int i15) {
        this.f119117f.add(Integer.valueOf(i15));
    }

    public void b(InputStream inputStream) throws Throwable {
        bp.g gVarA;
        hp.h hVar = new hp.h(this.f119112a, inputStream, bp.i.E3);
        try {
            gVarA = hVar.a();
            try {
                n0 n0VarF = new so.j0().f(gVarA);
                this.f119113b = n0VarF;
                if (!f(n0VarF)) {
                    throw new IOException("This font does not permit embedding");
                }
                if (this.f119114c == null) {
                    this.f119114c = d(this.f119113b);
                }
                dp.a.b(gVarA);
                hVar.D1().c5(bp.i.f20708c5, this.f119113b.c0());
                this.f119114c.E(hVar);
            } catch (Throwable th4) {
                th = th4;
                dp.a.b(gVarA);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            gVarA = null;
        }
    }

    protected abstract void c(InputStream inputStream, String str, Map<Integer, Integer> map);

    public String e(Map<Integer, Integer> map) {
        long jHashCode = map.hashCode();
        StringBuilder sb5 = new StringBuilder();
        while (true) {
            long j15 = jHashCode / 25;
            sb5.append("BCDEFGHIJKLMNOPQRSTUVWXYZ".charAt((int) (jHashCode % 25)));
            if (j15 == 0 || sb5.length() >= 6) {
                break;
            }
            jHashCode = j15;
        }
        while (sb5.length() < 6) {
            sb5.insert(0, 'A');
        }
        sb5.append('+');
        return sb5.toString();
    }

    boolean f(n0 n0Var) {
        if (n0Var.a0() == null) {
            return true;
        }
        short sQ = n0Var.a0().q();
        return ((sQ & 15) == 2 || (sQ & 512) == 512) ? false : true;
    }

    public boolean h() {
        return this.f119118g;
    }

    public void i() {
        if (!g(this.f119113b)) {
            throw new IOException("This font does not permit subsetting");
        }
        if (!this.f119118g) {
            throw new IllegalStateException("Subsetting is disabled");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("head");
        arrayList.add("hhea");
        arrayList.add("loca");
        arrayList.add("maxp");
        arrayList.add("cvt ");
        arrayList.add("prep");
        arrayList.add("glyf");
        arrayList.add("hmtx");
        arrayList.add("fpgm");
        arrayList.add("gasp");
        so.k0 k0Var = new so.k0(this.f119113b, arrayList);
        k0Var.b(this.f119117f);
        Map<Integer, Integer> mapO = k0Var.o();
        String strE = e(mapO);
        k0Var.r(strE);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        k0Var.B(byteArrayOutputStream);
        c(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), strE, mapO);
        this.f119113b.close();
    }
}
