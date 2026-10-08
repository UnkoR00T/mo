package wj;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes4.dex */
final class r implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f213735a;

    /* synthetic */ r(t tVar, s sVar) {
        this.f213735a = tVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f213735a.f213738b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f213735a.c().post(new p(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f213735a.f213738b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f213735a.c().post(new q(this));
    }
}
