package lh;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class l extends mh.z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ c.p f118225d;

    l(c cVar, c.p pVar) {
        this.f118225d = pVar;
        Objects.requireNonNull(cVar);
    }

    @Override // mh.a0
    public final boolean b(ah.e eVar) {
        return this.f118225d.d(new nh.h(eVar));
    }
}
