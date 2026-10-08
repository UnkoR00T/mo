package jg;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import io.sentry.android.core.c2;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class h1 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ i1 f102497a;

    /* synthetic */ h1(i1 i1Var, byte[] bArr) {
        Objects.requireNonNull(i1Var);
        this.f102497a = i1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i15 = message.what;
        if (i15 == 0) {
            i1 i1Var = this.f102497a;
            synchronized (i1Var.f()) {
                try {
                    f1 f1Var = (f1) message.obj;
                    g1 g1Var = (g1) i1Var.f().get(f1Var);
                    if (g1Var != null && g1Var.g()) {
                        if (g1Var.d()) {
                            g1Var.a("GmsClientSupervisor");
                        }
                        i1Var.f().remove(f1Var);
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            return true;
        }
        if (i15 != 1) {
            return false;
        }
        i1 i1Var2 = this.f102497a;
        synchronized (i1Var2.f()) {
            try {
                f1 f1Var2 = (f1) message.obj;
                g1 g1Var2 = (g1) i1Var2.f().get(f1Var2);
                if (g1Var2 != null && g1Var2.e() == 3) {
                    String strValueOf = String.valueOf(f1Var2);
                    StringBuilder sb5 = new StringBuilder(strValueOf.length() + 47);
                    sb5.append("Timeout waiting for ServiceConnection callback ");
                    sb5.append(strValueOf);
                    c2.f("GmsClientSupervisor", sb5.toString(), new Exception());
                    ComponentName componentNameI = g1Var2.i();
                    if (componentNameI == null) {
                        componentNameI = f1Var2.c();
                    }
                    if (componentNameI == null) {
                        String strB = f1Var2.b();
                        s.l(strB);
                        componentNameI = new ComponentName(strB, "unknown");
                    }
                    g1Var2.onServiceDisconnected(componentNameI);
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return true;
    }
}
