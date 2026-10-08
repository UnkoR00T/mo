package p049fm;

import com.google.android.gms.maps.model.LatLngBounds;
import er.p;
import lh.c;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
public final class l2 implements p<f2, LatLngBounds, i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f65189a;

    public l2(c cVar) {
        this.f65189a = cVar;
    }

    @Override // er.p
    public /* bridge */ /* synthetic */ i0 B(f2 f2Var, LatLngBounds latLngBounds) {
        c(f2Var, latLngBounds);
        return i0.f148189a;
    }

    public final void c(f2 f2Var, LatLngBounds latLngBounds) {
        this.f65189a.n(latLngBounds);
    }
}
