package rh;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import gg.e;
import gg.f;
import gg.g;
import gg.i;
import io.sentry.android.core.c2;
import java.lang.reflect.Method;
import jg.s;
import xg.q;
import xg.r;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e f173816a = e.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f173817b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f173818c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f173819d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f173820e = 0;

    /* JADX INFO: renamed from: rh.a$a, reason: collision with other inner class name */
    public interface InterfaceC4440a {
        void a();

        void b(int i15, Intent intent);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0052 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0014, B:7:0x001b, B:14:0x0040, B:15:0x0045, B:12:0x002c, B:17:0x0047, B:28:0x0091, B:29:0x0096, B:31:0x0098, B:32:0x00a6, B:20:0x0052, B:22:0x0057, B:25:0x0081), top: B:39:0x0014, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0091 A[Catch: all -> 0x0028, TryCatch #2 {, blocks: (B:4:0x0014, B:7:0x001b, B:14:0x0040, B:15:0x0045, B:12:0x002c, B:17:0x0047, B:28:0x0091, B:29:0x0096, B:31:0x0098, B:32:0x00a6, B:20:0x0052, B:22:0x0057, B:25:0x0081), top: B:39:0x0014, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0098 A[Catch: all -> 0x0028, TryCatch #2 {, blocks: (B:4:0x0014, B:7:0x001b, B:14:0x0040, B:15:0x0045, B:12:0x002c, B:17:0x0047, B:28:0x0091, B:29:0x0096, B:31:0x0098, B:32:0x00a6, B:20:0x0052, B:22:0x0057, B:25:0x0081), top: B:39:0x0014, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void a(Context context) throws f, g {
        boolean z15;
        Context contextD;
        Context contextB;
        s.m(context, "Context must not be null");
        f173816a.k(context, 11925000);
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (f173817b) {
            Context context2 = null;
            if (f173819d) {
                z15 = f173819d;
                contextD = i.d(context);
                if (contextD == null) {
                    f173819d = true;
                    if (!z15) {
                        xg.s.b("com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats2", contextD.getClassLoader(), r.a(Context.class, context), q.d(jUptimeMillis), q.d(SystemClock.uptimeMillis()));
                    }
                    context2 = contextD;
                }
                if (context2 != null) {
                    d(context2, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                } else {
                    c2.e("ProviderInstaller", "Failed to get remote context");
                    throw new f(8);
                }
            }
            try {
                contextB = DynamiteModule.e(context, DynamiteModule.f29078f, "com.google.android.gms.providerinstaller.dynamite").b();
            } catch (DynamiteModule.a e15) {
                c2.g("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e15.getMessage())));
                contextB = null;
            }
            if (contextB != null) {
                d(contextB, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            z15 = f173819d;
            contextD = i.d(context);
            if (contextD == null) {
                f173819d = true;
                if (!z15) {
                    try {
                        xg.s.b("com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats2", contextD.getClassLoader(), r.a(Context.class, context), q.d(jUptimeMillis), q.d(SystemClock.uptimeMillis()));
                    } catch (Exception e16) {
                        c2.g("ProviderInstaller", "Failed to report request stats: ".concat(e16.toString()));
                    }
                }
                context2 = contextD;
            }
            if (context2 != null) {
                d(context2, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                return;
            } else {
                c2.e("ProviderInstaller", "Failed to get remote context");
                throw new f(8);
            }
            throw th;
        }
    }

    public static void b(Context context, InterfaceC4440a interfaceC4440a) {
        s.m(context, "Context must not be null");
        s.m(interfaceC4440a, "Listener must not be null");
        s.e("Must be called on the UI thread");
        new b(context, interfaceC4440a).execute(new Void[0]);
    }

    private static void d(Context context, Context context2, String str) throws f {
        try {
            if (f173818c == null) {
                f173818c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f173818c.invoke(null, context);
        } catch (Exception e15) {
            Throwable cause = e15.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                c2.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e15.toString() : cause.toString())));
            }
            throw new f(8);
        }
    }
}
