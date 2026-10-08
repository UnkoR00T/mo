package ng;

import com.google.android.gms.common.api.Status;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class o extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AtomicReference f135911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ vh.m f135912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ mg.a f135913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ x f135914g;

    o(x xVar, AtomicReference atomicReference, vh.m mVar, mg.a aVar) {
        this.f135911d = atomicReference;
        this.f135912e = mVar;
        this.f135913f = aVar;
        Objects.requireNonNull(xVar);
        this.f135914g = xVar;
    }

    @Override // ng.b, ng.h
    public final void s0(Status status, mg.g gVar) {
        if (gVar != null) {
            this.f135911d.set(gVar);
        }
        ig.t.c(status, null, this.f135912e);
        if (!status.C() || (gVar != null && gVar.p())) {
            this.f135914g.r(ig.k.c(this.f135913f, mg.a.class.getSimpleName()), 27306);
        }
    }
}
