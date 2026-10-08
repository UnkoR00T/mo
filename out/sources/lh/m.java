package lh;

import com.google.android.gms.maps.model.LatLng;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class m extends mh.v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ c.o f118227d;

    m(c cVar, c.o oVar) {
        this.f118227d = oVar;
        Objects.requireNonNull(cVar);
    }

    @Override // mh.w
    public final void l(LatLng latLng) {
        this.f118227d.a(latLng);
    }
}
