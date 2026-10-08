package zg;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;

/* JADX INFO: loaded from: classes3.dex */
final class x extends n1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ vh.m f235121d;

    x(vh.m mVar) {
        this.f235121d = mVar;
    }

    @Override // zg.o1
    public final void Y(Status status, LocationAvailability locationAvailability) {
        ig.t.a(status, locationAvailability, this.f235121d);
    }
}
