package lh;

import java.util.Objects;
import mh.z0;

/* JADX INFO: loaded from: classes3.dex */
final class h0 extends z0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ d f118219d;

    h0(c cVar, d dVar) {
        this.f118219d = dVar;
        Objects.requireNonNull(cVar);
    }

    @Override // mh.c
    public final void deactivate() {
        this.f118219d.deactivate();
    }

    @Override // mh.c
    public final void j2(mh.q qVar) {
        this.f118219d.a(new b0(this, qVar));
    }
}
