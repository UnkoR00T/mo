package fg;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f62257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final vh.m f62258b = new vh.m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f62259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Bundle f62260d;

    a0(int i15, int i16, Bundle bundle) {
        this.f62257a = i15;
        this.f62259c = i16;
        this.f62260d = bundle;
    }

    abstract void a(Bundle bundle);

    abstract boolean b();

    final void c(b0 b0Var) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            b0Var.toString();
        }
        this.f62258b.b(b0Var);
    }

    final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            String.valueOf(obj);
        }
        this.f62258b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f62259c + " id=" + this.f62257a + " oneWay=" + b() + "}";
    }
}
