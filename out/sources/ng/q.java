package ng;

import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class q extends ig.f.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ vh.m f135916d;

    q(x xVar, vh.m mVar) {
        this.f135916d = mVar;
        Objects.requireNonNull(xVar);
    }

    @Override // ig.f
    public final void d2(Status status) {
        ig.t.c(status, null, this.f135916d);
    }
}
