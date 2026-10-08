package nd;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class i implements o<PointF, PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f134241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f134242b;

    public i(b bVar, b bVar2) {
        this.f134241a = bVar;
        this.f134242b = bVar2;
    }

    @Override // nd.o
    public boolean k() {
        return this.f134241a.k() && this.f134242b.k();
    }

    @Override // nd.o
    public id.a<PointF, PointF> l() {
        return new id.n(this.f134241a.l(), this.f134242b.l());
    }

    @Override // nd.o
    public List<ud.a<PointF>> m() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
