package zg;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes3.dex */
final class d0 extends kh.t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z f235059d;

    d0(z zVar) {
        this.f235059d = zVar;
    }

    @Override // kh.u
    public final void O1(LocationResult locationResult) {
        this.f235059d.zza().c(new a0(this, locationResult));
    }

    @Override // kh.u
    public final void f() {
        this.f235059d.zza().c(new c0(this));
    }

    final d0 n3(ig.j jVar) {
        this.f235059d.b(jVar);
        return this;
    }

    @Override // kh.u
    public final void o0(LocationAvailability locationAvailability) {
        this.f235059d.zza().c(new b0(this, locationAvailability));
    }

    final void o3() {
        this.f235059d.zza().a();
    }

    final /* synthetic */ z p3() {
        return this.f235059d;
    }
}
