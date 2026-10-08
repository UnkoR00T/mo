package lh;

import com.google.android.gms.maps.model.LatLng;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class m0 extends mh.r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ c.m f118228d;

    m0(c cVar, c.m mVar) {
        this.f118228d = mVar;
        Objects.requireNonNull(cVar);
    }

    @Override // mh.s
    public final void l(LatLng latLng) {
        this.f118228d.a(latLng);
    }
}
