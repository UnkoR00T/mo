package id;

import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class n extends a<PointF, PointF> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final PointF f90996i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final PointF f90997j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a<Float, Float> f90998k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a<Float, Float> f90999l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected ud.c<Float> f91000m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected ud.c<Float> f91001n;

    public n(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.EMPTY_LIST);
        this.f90996i = new PointF();
        this.f90997j = new PointF();
        this.f90998k = aVar;
        this.f90999l = aVar2;
        n(f());
    }

    @Override // id.a
    public void n(float f15) {
        this.f90998k.n(f15);
        this.f90999l.n(f15);
        this.f90996i.set(this.f90998k.h().floatValue(), this.f90999l.h().floatValue());
        for (int i15 = 0; i15 < this.f90954a.size(); i15++) {
            this.f90954a.get(i15).a();
        }
    }

    @Override // id.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // id.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public PointF i(ud.a<PointF> aVar, float f15) {
        Float fB;
        ud.a<Float> aVarB;
        ud.a<Float> aVarB2;
        Float fB2 = null;
        if (this.f91000m == null || (aVarB2 = this.f90998k.b()) == null) {
            fB = null;
        } else {
            Float f16 = aVarB2.f197582h;
            ud.c<Float> cVar = this.f91000m;
            float f17 = aVarB2.f197581g;
            fB = cVar.b(f17, f16 == null ? f17 : f16.floatValue(), aVarB2.f197576b, aVarB2.f197577c, this.f90998k.d(), this.f90998k.e(), this.f90998k.f());
        }
        if (this.f91001n != null && (aVarB = this.f90999l.b()) != null) {
            Float f18 = aVarB.f197582h;
            ud.c<Float> cVar2 = this.f91001n;
            float f19 = aVarB.f197581g;
            fB2 = cVar2.b(f19, f18 == null ? f19 : f18.floatValue(), aVarB.f197576b, aVarB.f197577c, this.f90999l.d(), this.f90999l.e(), this.f90999l.f());
        }
        if (fB == null) {
            this.f90997j.set(this.f90996i.x, 0.0f);
        } else {
            this.f90997j.set(fB.floatValue(), 0.0f);
        }
        if (fB2 == null) {
            PointF pointF = this.f90997j;
            pointF.set(pointF.x, this.f90996i.y);
        } else {
            PointF pointF2 = this.f90997j;
            pointF2.set(pointF2.x, fB2.floatValue());
        }
        return this.f90997j;
    }

    public void t(ud.c<Float> cVar) {
        ud.c<Float> cVar2 = this.f91000m;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f91000m = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public void u(ud.c<Float> cVar) {
        ud.c<Float> cVar2 = this.f91001n;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f91001n = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
