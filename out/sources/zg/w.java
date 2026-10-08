package zg;

import android.location.Location;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
final class w extends p1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ vh.m f235119d;

    w(vh.m mVar) {
        this.f235119d = mVar;
    }

    @Override // zg.q1
    public final void T(Status status, Location location) {
        ig.t.a(status, location, this.f235119d);
    }
}
