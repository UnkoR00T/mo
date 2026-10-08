package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f36573c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static k1 f36574d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f36575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f36576b = new ma.b();

    public m(Context context) {
        this.f36575a = context;
    }

    public static /* synthetic */ vh.l a(Context context, Intent intent, boolean z15, vh.l lVar) {
        return (com.google.android.gms.common.util.j.d() && ((Integer) lVar.m()).intValue() == 402) ? e(context, intent, z15).h(new ma.b(), new vh.c() { // from class: com.google.firebase.messaging.k
            @Override // vh.c
            public final Object a(vh.l lVar2) {
                return m.d(lVar2);
            }
        }) : lVar;
    }

    public static /* synthetic */ Integer c(vh.l lVar) {
        return -1;
    }

    public static /* synthetic */ Integer d(vh.l lVar) {
        return 403;
    }

    private static vh.l<Integer> e(Context context, Intent intent, boolean z15) {
        k1 k1VarF = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z15) {
            return k1VarF.d(intent).h(new ma.b(), new vh.c() { // from class: com.google.firebase.messaging.l
                @Override // vh.c
                public final Object a(vh.l lVar) {
                    return m.c(lVar);
                }
            });
        }
        if (u0.b().e(context)) {
            f1.e(context, k1VarF, intent);
        } else {
            k1VarF.d(intent);
        }
        return vh.o.f(-1);
    }

    private static k1 f(Context context, String str) {
        k1 k1Var;
        synchronized (f36573c) {
            try {
                if (f36574d == null) {
                    f36574d = new k1(context, str);
                }
                k1Var = f36574d;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return k1Var;
    }

    public vh.l<Integer> g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return h(this.f36575a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public vh.l<Integer> h(final Context context, final Intent intent) {
        boolean z15 = com.google.android.gms.common.util.j.d() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z16 = (intent.getFlags() & 268435456) != 0;
        return (!z15 || z16) ? vh.o.c(this.f36576b, new Callable() { // from class: com.google.firebase.messaging.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(u0.b().g(context, intent));
            }
        }).j(this.f36576b, new vh.c() { // from class: com.google.firebase.messaging.j
            @Override // vh.c
            public final Object a(vh.l lVar) {
                return m.a(context, intent, z16, lVar);
            }
        }) : e(context, intent, z16);
    }
}
