package og;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.UserHandle;
import com.google.android.gms.common.util.j;
import io.sentry.android.core.c2;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import jg.j1;
import jg.s;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import qg.d;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f145329b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a f145330c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f145331a = new ConcurrentHashMap();

    private a() {
    }

    public static a b() {
        if (f145330c == null) {
            synchronized (f145329b) {
                try {
                    if (f145330c == null) {
                        f145330c = new a();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        a aVar = f145330c;
        s.l(aVar);
        return aVar;
    }

    private final boolean f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i15, boolean z15, Executor executor) {
        if (j(context, intent)) {
            c2.g("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        if (!g(serviceConnection)) {
            return i(context, intent, serviceConnection, i15, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f145331a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            c2.g("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zI = i(context, intent, serviceConnection, i15, executor);
            if (zI) {
                return zI;
            }
            this.f145331a.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th4) {
            this.f145331a.remove(serviceConnection, serviceConnection);
            throw th4;
        }
    }

    private static boolean g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof j1);
    }

    private static void h(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private static final boolean i(Context context, Intent intent, ServiceConnection serviceConnection, int i15, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!j.f() || executor == null) ? context.bindService(intent, serviceConnection, i15) : context.bindService(intent, i15, executor, serviceConnection);
    }

    private static final boolean j(Context context, Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            return false;
        }
        try {
            return (d.a(context).c(component.getPackageName(), 0).flags & PKIFailureInfo.badSenderNonce) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i15) {
        return f(context, context.getClass().getName(), intent, serviceConnection, i15, true, null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (g(serviceConnection)) {
            ConcurrentHashMap concurrentHashMap = this.f145331a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    h(context, (ServiceConnection) concurrentHashMap.get(serviceConnection));
                    return;
                } finally {
                    this.f145331a.remove(serviceConnection);
                }
            }
        }
        h(context, serviceConnection);
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i15, Executor executor) {
        return f(context, str, intent, serviceConnection, 4225, true, executor);
    }

    public final boolean e(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i15, UserHandle userHandle) {
        if (j(context, intent)) {
            c2.g("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        if (!g(serviceConnection)) {
            return context.bindServiceAsUser(intent, serviceConnection, 4225, userHandle);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f145331a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            c2.g("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zBindServiceAsUser = context.bindServiceAsUser(intent, serviceConnection, 4225, userHandle);
            if (zBindServiceAsUser) {
                return zBindServiceAsUser;
            }
            this.f145331a.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th4) {
            this.f145331a.remove(serviceConnection, serviceConnection);
            throw th4;
        }
    }
}
