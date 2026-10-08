package hd;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import fd.a0;
import fd.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public class p implements e, m, j, id.a.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matrix f83679a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f83680b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f83681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final pd.b f83682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f83683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f83684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final id.a<Float, Float> f83685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final id.a<Float, Float> f83686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final id.s f83687i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f83688j;

    public p(a0 a0Var, pd.b bVar, od.m mVar) {
        this.f83681c = a0Var;
        this.f83682d = bVar;
        this.f83683e = mVar.c();
        this.f83684f = mVar.f();
        id.d dVarL = mVar.b().l();
        this.f83685g = dVarL;
        bVar.j(dVarL);
        dVarL.a(this);
        id.d dVarL2 = mVar.d().l();
        this.f83686h = dVarL2;
        bVar.j(dVarL2);
        dVarL2.a(this);
        id.s sVarB = mVar.e().b();
        this.f83687i = sVarB;
        sVarB.d(bVar);
        sVarB.e(this);
    }

    @Override // hd.m
    public Path W() {
        Path pathW = this.f83688j.W();
        this.f83680b.reset();
        float fFloatValue = this.f83685g.h().floatValue();
        float fFloatValue2 = this.f83686h.h().floatValue();
        for (int i15 = ((int) fFloatValue) - 1; i15 >= 0; i15--) {
            this.f83679a.set(this.f83687i.j(i15 + fFloatValue2));
            this.f83680b.addPath(pathW, this.f83679a);
        }
        return this.f83680b;
    }

    @Override // id.a.b
    public void a() {
        this.f83681c.invalidateSelf();
    }

    @Override // hd.c
    public void b(List<c> list, List<c> list2) {
        this.f83688j.b(list, list2);
    }

    @Override // md.f
    public void c(md.e eVar, int i15, List<md.e> list, md.e eVar2) {
        td.j.k(eVar, i15, list, eVar2, this);
        for (int i16 = 0; i16 < this.f83688j.k().size(); i16++) {
            c cVar = this.f83688j.k().get(i16);
            if (cVar instanceof k) {
                td.j.k(eVar, i15, list, eVar2, (k) cVar);
            }
        }
    }

    @Override // hd.e
    public void d(Canvas canvas, Matrix matrix, int i15, td.b bVar) {
        float fFloatValue = this.f83685g.h().floatValue();
        float fFloatValue2 = this.f83686h.h().floatValue();
        float fFloatValue3 = this.f83687i.l().h().floatValue() / 100.0f;
        float fFloatValue4 = this.f83687i.h().h().floatValue() / 100.0f;
        for (int i16 = ((int) fFloatValue) - 1; i16 >= 0; i16--) {
            this.f83679a.set(matrix);
            float f15 = i16;
            this.f83679a.preConcat(this.f83687i.j(f15 + fFloatValue2));
            this.f83688j.d(canvas, this.f83679a, (int) (i15 * td.j.i(fFloatValue3, fFloatValue4, f15 / fFloatValue)), bVar);
        }
    }

    @Override // hd.e
    public void f(RectF rectF, Matrix matrix, boolean z15) {
        this.f83688j.f(rectF, matrix, z15);
    }

    @Override // md.f
    public <T> void g(T t15, ud.c<T> cVar) {
        if (this.f83687i.f(t15, cVar)) {
            return;
        }
        if (t15 == g0.f61267x) {
            this.f83685g.o(cVar);
        } else if (t15 == g0.f61268y) {
            this.f83686h.o(cVar);
        }
    }

    @Override // hd.c
    public String getName() {
        return this.f83683e;
    }

    @Override // hd.j
    public void h(ListIterator<c> listIterator) {
        if (this.f83688j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f83688j = new d(this.f83681c, this.f83682d, "Repeater", this.f83684f, arrayList, null);
    }
}
