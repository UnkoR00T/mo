package nd;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e implements o<PointF, PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ud.a<PointF>> f134240a;

    public e(List<ud.a<PointF>> list) {
        this.f134240a = list;
    }

    @Override // nd.o
    public boolean k() {
        return this.f134240a.size() == 1 && this.f134240a.get(0).i();
    }

    @Override // nd.o
    public id.a<PointF, PointF> l() {
        return this.f134240a.get(0).i() ? new id.k(this.f134240a) : new id.j(this.f134240a);
    }

    @Override // nd.o
    public List<ud.a<PointF>> m() {
        return this.f134240a;
    }
}
