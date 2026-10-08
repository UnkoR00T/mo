package hd;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import fd.a0;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public class d implements e, m, id.a.b, md.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final td.k.b f83580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f83581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final td.k f83582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Matrix f83583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Path f83584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f83585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f83586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f83587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<c> f83588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a0 f83589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<m> f83590k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private id.s f83591l;

    public d(a0 a0Var, pd.b bVar, od.q qVar, fd.f fVar) {
        this(a0Var, bVar, qVar.c(), qVar.d(), h(a0Var, fVar, bVar, qVar.b()), j(qVar.b()));
    }

    private static List<c> h(a0 a0Var, fd.f fVar, pd.b bVar, List<od.c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i15 = 0; i15 < list.size(); i15++) {
            c cVarA = list.get(i15).a(a0Var, fVar, bVar);
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return arrayList;
    }

    static nd.n j(List<od.c> list) {
        for (int i15 = 0; i15 < list.size(); i15++) {
            od.c cVar = list.get(i15);
            if (cVar instanceof nd.n) {
                return (nd.n) cVar;
            }
        }
        return null;
    }

    private boolean n() {
        int i15 = 0;
        for (int i16 = 0; i16 < this.f83588i.size(); i16++) {
            if ((this.f83588i.get(i16) instanceof e) && (i15 = i15 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // hd.m
    public Path W() {
        this.f83583d.reset();
        id.s sVar = this.f83591l;
        if (sVar != null) {
            this.f83583d.set(sVar.i());
        }
        this.f83584e.reset();
        if (this.f83587h) {
            return this.f83584e;
        }
        for (int size = this.f83588i.size() - 1; size >= 0; size--) {
            c cVar = this.f83588i.get(size);
            if (cVar instanceof m) {
                this.f83584e.addPath(((m) cVar).W(), this.f83583d);
            }
        }
        return this.f83584e;
    }

    @Override // id.a.b
    public void a() {
        this.f83589j.invalidateSelf();
    }

    @Override // hd.c
    public void b(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f83588i.size());
        arrayList.addAll(list);
        for (int size = this.f83588i.size() - 1; size >= 0; size--) {
            c cVar = this.f83588i.get(size);
            cVar.b(arrayList, this.f83588i.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // md.f
    public void c(md.e eVar, int i15, List<md.e> list, md.e eVar2) {
        if (eVar.g(getName(), i15) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i15)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i15)) {
                int iE = i15 + eVar.e(getName(), i15);
                for (int i16 = 0; i16 < this.f83588i.size(); i16++) {
                    c cVar = this.f83588i.get(i16);
                    if (cVar instanceof md.f) {
                        ((md.f) cVar).c(eVar, iE, list, eVar2);
                    }
                }
            }
        }
    }

    @Override // hd.e
    public void d(Canvas canvas, Matrix matrix, int i15, td.b bVar) {
        if (this.f83587h) {
            return;
        }
        this.f83583d.set(matrix);
        id.s sVar = this.f83591l;
        if (sVar != null) {
            this.f83583d.preConcat(sVar.i());
            i15 = (int) (((((this.f83591l.k() == null ? 100 : this.f83591l.k().h().intValue()) / 100.0f) * i15) / 255.0f) * 255.0f);
        }
        boolean zQ = this.f83589j.Q();
        int i16 = GF2Field.MASK;
        boolean z15 = (zQ && n() && i15 != 255) || (bVar != null && this.f83589j.R() && n());
        if (!z15) {
            i16 = i15;
        }
        if (z15) {
            this.f83581b.set(0.0f, 0.0f, 0.0f, 0.0f);
            f(this.f83581b, matrix, true);
            td.k.b bVar2 = this.f83580a;
            bVar2.f189631a = i15;
            if (bVar != null) {
                bVar.b(bVar2);
                bVar = null;
            } else {
                bVar2.f189634d = null;
            }
            canvas = this.f83582c.j(canvas, this.f83581b, this.f83580a);
        } else if (bVar != null) {
            td.b bVar3 = new td.b(bVar);
            bVar3.i(i16);
            bVar = bVar3;
        }
        for (int size = this.f83588i.size() - 1; size >= 0; size--) {
            c cVar = this.f83588i.get(size);
            if (cVar instanceof e) {
                ((e) cVar).d(canvas, this.f83583d, i16, bVar);
            }
        }
        if (z15) {
            this.f83582c.e();
        }
    }

    @Override // hd.e
    public void f(RectF rectF, Matrix matrix, boolean z15) {
        this.f83583d.set(matrix);
        id.s sVar = this.f83591l;
        if (sVar != null) {
            this.f83583d.preConcat(sVar.i());
        }
        this.f83585f.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f83588i.size() - 1; size >= 0; size--) {
            c cVar = this.f83588i.get(size);
            if (cVar instanceof e) {
                ((e) cVar).f(this.f83585f, this.f83583d, z15);
                rectF.union(this.f83585f);
            }
        }
    }

    @Override // md.f
    public <T> void g(T t15, ud.c<T> cVar) {
        id.s sVar = this.f83591l;
        if (sVar != null) {
            sVar.f(t15, cVar);
        }
    }

    @Override // hd.c
    public String getName() {
        return this.f83586g;
    }

    public List<c> k() {
        return this.f83588i;
    }

    List<m> l() {
        if (this.f83590k == null) {
            this.f83590k = new ArrayList();
            for (int i15 = 0; i15 < this.f83588i.size(); i15++) {
                c cVar = this.f83588i.get(i15);
                if (cVar instanceof m) {
                    this.f83590k.add((m) cVar);
                }
            }
        }
        return this.f83590k;
    }

    Matrix m() {
        id.s sVar = this.f83591l;
        if (sVar != null) {
            return sVar.i();
        }
        this.f83583d.reset();
        return this.f83583d;
    }

    d(a0 a0Var, pd.b bVar, String str, boolean z15, List<c> list, nd.n nVar) {
        this.f83580a = new td.k.b();
        this.f83581b = new RectF();
        this.f83582c = new td.k();
        this.f83583d = new Matrix();
        this.f83584e = new Path();
        this.f83585f = new RectF();
        this.f83586g = str;
        this.f83589j = a0Var;
        this.f83587h = z15;
        this.f83588i = list;
        if (nVar != null) {
            id.s sVarB = nVar.b();
            this.f83591l = sVarB;
            sVarB.d(bVar);
            this.f83591l.e(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).h(list.listIterator(list.size()));
        }
    }
}
