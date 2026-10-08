package od;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<md.a> f144764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PointF f144765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f144766c;

    public o(PointF pointF, boolean z15, List<md.a> list) {
        this.f144765b = pointF;
        this.f144766c = z15;
        this.f144764a = new ArrayList(list);
    }

    public List<md.a> a() {
        return this.f144764a;
    }

    public PointF b() {
        return this.f144765b;
    }

    public void c(o oVar, o oVar2, float f15) {
        if (this.f144765b == null) {
            this.f144765b = new PointF();
        }
        this.f144766c = oVar.d() || oVar2.d();
        if (oVar.a().size() != oVar2.a().size()) {
            td.e.c("Curves must have the same number of control points. Shape 1: " + oVar.a().size() + "\tShape 2: " + oVar2.a().size());
        }
        int iMin = Math.min(oVar.a().size(), oVar2.a().size());
        if (this.f144764a.size() < iMin) {
            for (int size = this.f144764a.size(); size < iMin; size++) {
                this.f144764a.add(new md.a());
            }
        } else if (this.f144764a.size() > iMin) {
            for (int size2 = this.f144764a.size() - 1; size2 >= iMin; size2--) {
                List<md.a> list = this.f144764a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFB = oVar.b();
        PointF pointFB2 = oVar2.b();
        f(td.j.i(pointFB.x, pointFB2.x, f15), td.j.i(pointFB.y, pointFB2.y, f15));
        for (int size3 = this.f144764a.size() - 1; size3 >= 0; size3--) {
            md.a aVar = oVar.a().get(size3);
            md.a aVar2 = oVar2.a().get(size3);
            PointF pointFA = aVar.a();
            PointF pointFB3 = aVar.b();
            PointF pointFC = aVar.c();
            PointF pointFA2 = aVar2.a();
            PointF pointFB4 = aVar2.b();
            PointF pointFC2 = aVar2.c();
            this.f144764a.get(size3).d(td.j.i(pointFA.x, pointFA2.x, f15), td.j.i(pointFA.y, pointFA2.y, f15));
            this.f144764a.get(size3).e(td.j.i(pointFB3.x, pointFB4.x, f15), td.j.i(pointFB3.y, pointFB4.y, f15));
            this.f144764a.get(size3).f(td.j.i(pointFC.x, pointFC2.x, f15), td.j.i(pointFC.y, pointFC2.y, f15));
        }
    }

    public boolean d() {
        return this.f144766c;
    }

    public void e(boolean z15) {
        this.f144766c = z15;
    }

    public void f(float f15, float f16) {
        if (this.f144765b == null) {
            this.f144765b = new PointF();
        }
        this.f144765b.set(f15, f16);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f144764a.size() + "closed=" + this.f144766c + '}';
    }

    public o() {
        this.f144764a = new ArrayList();
    }
}
