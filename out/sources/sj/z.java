package sj;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes4.dex */
final class z implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a0 f181998a;

    /* synthetic */ z(a0 a0Var, y yVar) {
        this.f181998a = a0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f181998a.f181959b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        a0 a0Var = this.f181998a;
        a0Var.c().post(new w(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f181998a.f181959b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        a0 a0Var = this.f181998a;
        a0Var.c().post(new x(this));
    }
}
