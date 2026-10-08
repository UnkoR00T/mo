package pd;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import fd.a0;
import fd.g0;
import id.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import td.k;

/* JADX INFO: loaded from: classes3.dex */
public class c extends b {
    private id.a<Float, Float> E;
    private final List<b> F;
    private final RectF G;
    private final RectF H;
    private final RectF I;
    private final k J;
    private final k.b K;
    private float L;
    private boolean M;
    private id.c N;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f156936a;

        static {
            int[] iArr = new int[e.b.values().length];
            f156936a = iArr;
            try {
                iArr[e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f156936a[e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(a0 a0Var, e eVar, List<e> list, fd.f fVar) {
        int i15;
        b bVar;
        super(a0Var, eVar);
        this.F = new ArrayList();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new RectF();
        this.J = new k();
        this.K = new k.b();
        this.M = true;
        nd.b bVarV = eVar.v();
        if (bVarV != null) {
            id.d dVarL = bVarV.l();
            this.E = dVarL;
            j(dVarL);
            this.E.a(this);
        } else {
            this.E = null;
        }
        r0.a0 a0Var2 = new r0.a0(fVar.k().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar2 = list.get(size);
            b bVarV2 = b.v(this, eVar2, a0Var, fVar);
            if (bVarV2 != null) {
                a0Var2.m(bVarV2.A().e(), bVarV2);
                if (bVar2 != null) {
                    bVar2.J(bVarV2);
                    bVar2 = null;
                } else {
                    this.F.add(0, bVarV2);
                    int i16 = a.f156936a[eVar2.i().ordinal()];
                    if (i16 == 1 || i16 == 2) {
                        bVar2 = bVarV2;
                    }
                }
            }
            size--;
        }
        for (i15 = 0; i15 < a0Var2.q(); i15++) {
            b bVar3 = (b) a0Var2.g(a0Var2.l(i15));
            if (bVar3 != null && (bVar = (b) a0Var2.g(bVar3.A().k())) != null) {
                bVar3.L(bVar);
            }
        }
        if (z() != null) {
            this.N = new id.c(this, this, z());
        }
    }

    @Override // pd.b
    protected void I(md.e eVar, int i15, List<md.e> list, md.e eVar2) {
        for (int i16 = 0; i16 < this.F.size(); i16++) {
            this.F.get(i16).c(eVar, i15, list, eVar2);
        }
    }

    @Override // pd.b
    public void K(boolean z15) {
        super.K(z15);
        Iterator<b> it = this.F.iterator();
        while (it.hasNext()) {
            it.next().K(z15);
        }
    }

    @Override // pd.b
    public void M(float f15) {
        if (fd.e.h()) {
            fd.e.b("CompositionLayer#setProgress");
        }
        this.L = f15;
        super.M(f15);
        if (this.E != null) {
            f15 = ((this.E.h().floatValue() * this.f156924q.c().i()) - this.f156924q.c().p()) / (this.f156923p.A().e() + 0.01f);
        }
        if (this.E == null) {
            f15 -= this.f156924q.s();
        }
        if (this.f156924q.w() != 0.0f && !"__container".equals(this.f156924q.j())) {
            f15 /= this.f156924q.w();
        }
        for (int size = this.F.size() - 1; size >= 0; size--) {
            this.F.get(size).M(f15);
        }
        if (fd.e.h()) {
            fd.e.c("CompositionLayer#setProgress");
        }
    }

    public float P() {
        return this.L;
    }

    public void Q(boolean z15) {
        this.M = z15;
    }

    @Override // pd.b, hd.e
    public void f(RectF rectF, Matrix matrix, boolean z15) {
        super.f(rectF, matrix, z15);
        for (int size = this.F.size() - 1; size >= 0; size--) {
            this.G.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.F.get(size).f(this.G, this.f156922o, true);
            rectF.union(this.G);
        }
    }

    @Override // pd.b, md.f
    public <T> void g(T t15, ud.c<T> cVar) {
        id.c cVar2;
        id.c cVar3;
        id.c cVar4;
        id.c cVar5;
        id.c cVar6;
        super.g(t15, cVar);
        if (t15 == g0.H) {
            if (cVar == null) {
                id.a<Float, Float> aVar = this.E;
                if (aVar != null) {
                    aVar.o(null);
                    return;
                }
                return;
            }
            t tVar = new t(cVar);
            this.E = tVar;
            tVar.a(this);
            j(this.E);
            return;
        }
        if (t15 == g0.f61248e && (cVar6 = this.N) != null) {
            cVar6.c(cVar);
            return;
        }
        if (t15 == g0.J && (cVar5 = this.N) != null) {
            cVar5.f(cVar);
            return;
        }
        if (t15 == g0.K && (cVar4 = this.N) != null) {
            cVar4.d(cVar);
            return;
        }
        if (t15 == g0.L && (cVar3 = this.N) != null) {
            cVar3.e(cVar);
        } else {
            if (t15 != g0.M || (cVar2 = this.N) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override // pd.b
    void u(Canvas canvas, Matrix matrix, int i15, td.b bVar) {
        Canvas canvasJ;
        if (fd.e.h()) {
            fd.e.b("CompositionLayer#draw");
        }
        boolean z15 = false;
        boolean z16 = (bVar == null && this.N == null) ? false : true;
        boolean zQ = this.f156923p.Q();
        int i16 = GF2Field.MASK;
        if ((zQ && this.F.size() > 1 && i15 != 255) || (z16 && this.f156923p.R())) {
            z15 = true;
        }
        if (!z15) {
            i16 = i15;
        }
        id.c cVar = this.N;
        if (cVar != null) {
            bVar = cVar.b(matrix, i16);
        }
        if (this.M || !"__container".equals(this.f156924q.j())) {
            this.H.set(0.0f, 0.0f, this.f156924q.m(), this.f156924q.l());
            matrix.mapRect(this.H);
        } else {
            this.H.setEmpty();
            Iterator<b> it = this.F.iterator();
            while (it.hasNext()) {
                it.next().f(this.I, matrix, true);
                this.H.union(this.I);
            }
        }
        if (z15) {
            this.K.f();
            k.b bVar2 = this.K;
            bVar2.f189631a = i15;
            if (bVar != null) {
                bVar.b(bVar2);
                bVar = null;
            }
            canvasJ = this.J.j(canvas, this.H, this.K);
        } else {
            canvasJ = canvas;
        }
        canvas.save();
        if (canvas.clipRect(this.H)) {
            for (int size = this.F.size() - 1; size >= 0; size--) {
                this.F.get(size).d(canvasJ, matrix, i16, bVar);
            }
        }
        if (z15) {
            this.J.e();
        }
        canvas.restore();
        if (fd.e.h()) {
            fd.e.c("CompositionLayer#draw");
        }
    }
}
