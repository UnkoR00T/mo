package pd;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import fd.a0;
import fd.g0;
import java.util.Collections;
import java.util.List;
import od.q;

/* JADX INFO: loaded from: classes3.dex */
public class g extends b {
    private final hd.d E;
    private final c F;
    private id.c G;

    g(a0 a0Var, e eVar, c cVar, fd.f fVar) {
        super(a0Var, eVar);
        this.F = cVar;
        hd.d dVar = new hd.d(a0Var, this, new q("__container", eVar.o(), false), fVar);
        this.E = dVar;
        List<hd.c> list = Collections.EMPTY_LIST;
        dVar.b(list, list);
        if (z() != null) {
            this.G = new id.c(this, this, z());
        }
    }

    @Override // pd.b
    protected void I(md.e eVar, int i15, List<md.e> list, md.e eVar2) {
        this.E.c(eVar, i15, list, eVar2);
    }

    @Override // pd.b, hd.e
    public void f(RectF rectF, Matrix matrix, boolean z15) {
        super.f(rectF, matrix, z15);
        this.E.f(rectF, this.f156922o, z15);
    }

    @Override // pd.b, md.f
    public <T> void g(T t15, ud.c<T> cVar) {
        id.c cVar2;
        id.c cVar3;
        id.c cVar4;
        id.c cVar5;
        id.c cVar6;
        super.g(t15, cVar);
        if (t15 == g0.f61248e && (cVar6 = this.G) != null) {
            cVar6.c(cVar);
            return;
        }
        if (t15 == g0.J && (cVar5 = this.G) != null) {
            cVar5.f(cVar);
            return;
        }
        if (t15 == g0.K && (cVar4 = this.G) != null) {
            cVar4.d(cVar);
            return;
        }
        if (t15 == g0.L && (cVar3 = this.G) != null) {
            cVar3.e(cVar);
        } else {
            if (t15 != g0.M || (cVar2 = this.G) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override // pd.b
    void u(Canvas canvas, Matrix matrix, int i15, td.b bVar) {
        id.c cVar = this.G;
        if (cVar != null) {
            bVar = cVar.b(matrix, i15);
        }
        this.E.d(canvas, matrix, i15, bVar);
    }

    @Override // pd.b
    public od.a x() {
        od.a aVarX = super.x();
        return aVarX != null ? aVarX : this.F.x();
    }
}
