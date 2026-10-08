package ng;

import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class n extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ vh.m f135910d;

    n(x xVar, vh.m mVar) {
        this.f135910d = mVar;
        Objects.requireNonNull(xVar);
    }

    @Override // ng.b, ng.h
    public final void s0(Status status, mg.g gVar) {
        ig.t.c(status, gVar, this.f135910d);
    }
}
