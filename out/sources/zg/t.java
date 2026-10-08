package zg;

import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes3.dex */
final class t extends kh.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ vh.m f235111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e0 f235112b;

    t(e0 e0Var, vh.m mVar) {
        this.f235111a = mVar;
        this.f235112b = e0Var;
    }

    @Override // kh.e
    public final void b(LocationResult locationResult) {
        this.f235111a.e(locationResult.h());
        try {
            this.f235112b.n0(ig.k.c(this, "GetCurrentLocation"), false, new vh.m());
        } catch (RemoteException unused) {
        }
    }
}
