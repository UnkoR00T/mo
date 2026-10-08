package di;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import vh.m;
import yh.i;

/* JADX INFO: loaded from: classes3.dex */
final class h extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f42815d;

    public h(m mVar) {
        this.f42815d = mVar;
    }

    @Override // di.f, di.b
    public final void s2(Status status, i iVar, Bundle bundle) {
        yh.a.b(status, iVar, this.f42815d);
    }
}
