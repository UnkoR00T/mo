package di;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import ig.t;
import vh.m;

/* JADX INFO: loaded from: classes3.dex */
final class g extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f42814d;

    g(m mVar) {
        this.f42814d = mVar;
    }

    @Override // di.f, di.b
    public final void V0(int i15, boolean z15, Bundle bundle) {
        t.a(new Status(i15), Boolean.valueOf(z15), this.f42814d);
    }

    @Override // di.f, di.b
    public final void u0(Status status, boolean z15, Bundle bundle) {
        t.a(status, Boolean.valueOf(z15), this.f42814d);
    }
}
