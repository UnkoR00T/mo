package lh;

import android.location.Location;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class y extends mh.g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ c.s f118247d;

    y(c cVar, c.s sVar) {
        this.f118247d = sVar;
        Objects.requireNonNull(cVar);
    }

    @Override // mh.h0
    public final void q0(Location location) {
        this.f118247d.a(location);
    }
}
