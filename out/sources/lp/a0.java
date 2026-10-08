package lp;

import android.graphics.Path;
import io.sentry.android.core.c2;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import so.n0;

/* JADX INFO: loaded from: classes4.dex */
public class a0 extends r implements g0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m f119038j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private po.b f119039k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private po.b f119040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f119041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f119042n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private p f119043p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Set<Integer> f119044q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private n0 f119045r;

    public a0(bp.d dVar) throws Throwable {
        super(dVar);
        this.f119044q = new HashSet();
        bp.b bVarP4 = this.f119160a.p4(bp.i.f20785k2);
        if (!(bVarP4 instanceof bp.a)) {
            throw new IOException("Missing descendant font array");
        }
        bp.a aVar = (bp.a) bVarP4;
        if (aVar.size() == 0) {
            throw new IOException("Descendant font array is empty");
        }
        bp.b bVarK4 = aVar.k4(0);
        if (!(bVarK4 instanceof bp.d)) {
            throw new IOException("Missing descendant font dictionary");
        }
        bp.i iVar = bp.i.H3;
        bp.d dVar2 = (bp.d) bVarK4;
        if (!iVar.equals(dVar2.m4(bp.i.f20732e9, iVar))) {
            throw new IOException("Missing or wrong type in descendant font dictionary");
        }
        this.f119038j = t.a(dVar2, this);
        G();
        z();
    }

    public static a0 E(gp.c cVar, InputStream inputStream) {
        return F(cVar, inputStream, true);
    }

    public static a0 F(gp.c cVar, InputStream inputStream, boolean z15) {
        return new a0(cVar, new so.j0().d(inputStream), z15, true, false);
    }

    private void G() throws IOException {
        bp.b bVarP4 = this.f119160a.p4(bp.i.f20716d3);
        boolean z15 = true;
        if (bVarP4 instanceof bp.i) {
            this.f119039k = c.a(((bp.i) bVarP4).A3());
            this.f119041m = true;
        } else if (bVarP4 != null) {
            po.b bVarT = t(bVarP4);
            this.f119039k = bVarT;
            if (bVarT == null) {
                throw new IOException("Missing required CMap");
            }
            if (!bVarT.j()) {
                c2.g("PdfBox-Android", "Invalid Encoding CMap in font " + getName());
            }
        }
        q qVarJ = this.f119038j.j();
        if (qVarJ != null) {
            String strA = qVarJ.a();
            if (!"Adobe".equals(qVarJ.b()) || (!"GB1".equals(strA) && !"CNS1".equals(strA) && !"Japan1".equals(strA) && !"Korea1".equals(strA))) {
                z15 = false;
            }
            this.f119042n = z15;
        }
    }

    private void z() throws Throwable {
        bp.i iVarL4 = this.f119160a.l4(bp.i.f20716d3);
        if ((!this.f119041m || iVarL4 == bp.i.f20858r4 || iVarL4 == bp.i.f20869s4) && !this.f119042n) {
            return;
        }
        String strA3 = null;
        if (this.f119042n) {
            q qVarJ = this.f119038j.j();
            if (qVarJ != null) {
                strA3 = qVarJ.b() + "-" + qVarJ.a() + "-" + qVarJ.c();
            }
        } else if (iVarL4 != null) {
            strA3 = iVarL4.A3();
        }
        if (strA3 != null) {
            try {
                po.b bVarA = c.a(strA3);
                this.f119040l = c.a(bVarA.i() + "-" + bVarA.h() + "-UCS2");
            } catch (IOException e15) {
                c2.h("PdfBox-Android", "Could not get " + strA3 + " UC2 map for font " + getName(), e15);
            }
        }
    }

    public String A() {
        return this.f119160a.H4(bp.i.f20897v0);
    }

    public po.b B() {
        return this.f119039k;
    }

    public po.b C() {
        return this.f119040l;
    }

    public m D() {
        return this.f119038j;
    }

    @Override // lp.g0
    public Path a(int i15) {
        return this.f119038j.a(i15);
    }

    @Override // lp.r, lp.u
    public xp.d b() {
        return this.f119038j.b();
    }

    @Override // lp.u
    public uo.a c() {
        return this.f119038j.c();
    }

    @Override // lp.u
    public float d(int i15) {
        return this.f119038j.d(i15);
    }

    @Override // lp.u
    public boolean e() {
        return this.f119038j.e();
    }

    @Override // lp.r
    public void f(int i15) {
        if (!x()) {
            throw new IllegalStateException("This font was created with subsetting disabled");
        }
        this.f119043p.a(i15);
    }

    @Override // lp.r
    protected byte[] g(int i15) {
        return this.f119038j.h(i15);
    }

    @Override // lp.u
    public String getName() {
        return A();
    }

    @Override // lp.r
    public s j() {
        return this.f119038j.m();
    }

    @Override // lp.r
    protected float l(int i15) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override // lp.r
    public float o(int i15) {
        return this.f119038j.n(i15);
    }

    @Override // lp.r
    public boolean q() {
        return false;
    }

    @Override // lp.r
    public String toString() {
        return getClass().getSimpleName() + "/" + (D() != null ? D().getClass().getSimpleName() : null) + ", PostScript name: " + A();
    }

    @Override // lp.r
    public int u(InputStream inputStream) throws IOException {
        po.b bVar = this.f119039k;
        if (bVar != null) {
            return bVar.l(inputStream);
        }
        throw new IOException("required cmap is null");
    }

    @Override // lp.r
    public void v() throws IOException {
        if (!x()) {
            throw new IllegalStateException("This font was created with subsetting disabled");
        }
        this.f119043p.i();
        n0 n0Var = this.f119045r;
        if (n0Var != null) {
            n0Var.close();
            this.f119045r = null;
        }
    }

    @Override // lp.r
    public String w(int i15) {
        n0 n0VarU;
        String strW = super.w(i15);
        if (strW != null) {
            return strW;
        }
        if ((this.f119041m || this.f119042n) && this.f119040l != null) {
            return this.f119040l.v(y(i15));
        }
        m mVar = this.f119038j;
        if ((mVar instanceof o) && (n0VarU = ((o) mVar).u()) != null) {
            try {
                so.c cVarD1 = n0VarU.d1(false);
                if (cVarD1 != null) {
                    List<Integer> listA = cVarD1.a(this.f119038j.e() ? this.f119038j.g(i15) : this.f119038j.f(i15));
                    if (listA != null && !listA.isEmpty()) {
                        return Character.toString((char) listA.get(0).intValue());
                    }
                }
            } catch (IOException e15) {
                c2.h("PdfBox-Android", "get unicode from font cmap fail", e15);
            }
        }
        if (this.f119044q.contains(Integer.valueOf(i15))) {
            return null;
        }
        c2.g("PdfBox-Android", "No Unicode mapping for " + ("CID+" + y(i15)) + " (" + i15 + ") in font " + getName());
        this.f119044q.add(Integer.valueOf(i15));
        return null;
    }

    @Override // lp.r
    public boolean x() {
        p pVar = this.f119043p;
        return pVar != null && pVar.h();
    }

    public int y(int i15) {
        return this.f119038j.f(i15);
    }

    private a0(gp.c cVar, n0 n0Var, boolean z15, boolean z16, boolean z17) throws Throwable {
        this.f119044q = new HashSet();
        if (z17) {
            n0Var.C();
        }
        p pVar = new p(cVar, this.f119160a, n0Var, z15, this, z17);
        this.f119043p = pVar;
        this.f119038j = pVar.t();
        G();
        z();
        if (z16) {
            if (z15) {
                this.f119045r = n0Var;
                cVar.O0(n0Var);
            } else {
                n0Var.close();
            }
        }
    }
}
