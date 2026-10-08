package lh;

import java.util.Objects;
import mh.x0;

/* JADX INFO: loaded from: classes3.dex */
final class w extends x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ c.b f118245d;

    w(c cVar, c.b bVar) {
        this.f118245d = bVar;
        Objects.requireNonNull(cVar);
    }

    @Override // mh.y0
    public final rg.b b(ah.e eVar) {
        return rg.d.o3(this.f118245d.e(new nh.h(eVar)));
    }

    @Override // mh.y0
    public final rg.b u(ah.e eVar) {
        return rg.d.o3(this.f118245d.b(new nh.h(eVar)));
    }
}
