package ng;

import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class m extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ vh.m f135909d;

    m(x xVar, vh.m mVar) {
        this.f135909d = mVar;
        Objects.requireNonNull(xVar);
    }

    @Override // ng.b, ng.h
    public final void c2(Status status, mg.b bVar) {
        ig.t.c(status, bVar, this.f135909d);
    }
}
