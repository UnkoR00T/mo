package mh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static Context f126520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile v0 f126521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Queue f126522c = new ConcurrentLinkedQueue();

    public static v0 a(Context context, lh.g.a aVar) throws gg.f {
        jg.s.l(context);
        "preferredRenderer: ".concat(String.valueOf(aVar));
        if (f126521b == null) {
            int iF = gg.h.f(context, 13400000);
            if (iF != 0) {
                throw new gg.f(iF);
            }
            f126521b = e(context, aVar);
            try {
                int iC = f126521b.c();
                String packageName = context.getPackageName();
                if (iC == 2 && !packageName.equals("com.google.android.apps.photos")) {
                    try {
                        f126521b.F(rg.d.o3(d(context, aVar)));
                    } catch (RemoteException e15) {
                        throw new nh.o(e15);
                    } catch (UnsatisfiedLinkError unused) {
                        f126520a = null;
                        f126521b = e(context, lh.g.a.LEGACY);
                    }
                }
                try {
                    v0 v0Var = f126521b;
                    Context contextD = d(context, aVar);
                    Objects.requireNonNull(contextD);
                    v0Var.F0(rg.d.o3(contextD.getResources()), 20000000);
                    while (true) {
                        Queue queue = f126522c;
                        if (queue.isEmpty()) {
                            break;
                        }
                        try {
                            ((lh.r) jg.s.l((lh.r) queue.poll())).a(f126521b);
                        } catch (RemoteException e16) {
                            throw new nh.o(e16);
                        }
                    }
                } catch (RemoteException e17) {
                    throw new nh.o(e17);
                }
            } catch (RemoteException e18) {
                throw new nh.o(e18);
            }
        }
        return f126521b;
    }

    public static void b(lh.r rVar) {
        if (f126521b != null) {
            rVar.a(f126521b);
        } else {
            f126522c.add(rVar);
        }
    }

    private static Context c(Exception exc, Context context) {
        return gg.h.d(context);
    }

    private static Context d(Context context, lh.g.a aVar) {
        Context contextC;
        Context context2 = f126520a;
        if (context2 != null) {
            return context2;
        }
        String str = aVar == lh.g.a.LEGACY ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            contextC = DynamiteModule.e(context, DynamiteModule.f29074b, str).b();
        } catch (Exception e15) {
            if (str.equals("com.google.android.gms.maps_dynamite")) {
                contextC = c(e15, context);
            } else {
                try {
                    contextC = DynamiteModule.e(context, DynamiteModule.f29074b, "com.google.android.gms.maps_dynamite").b();
                } catch (Exception e16) {
                    contextC = c(e16, context);
                }
            }
        }
        f126520a = contextC;
        if (contextC != null) {
            return contextC;
        }
        throw new RuntimeException("Unable to load maps module, maps container context is null");
    }

    private static v0 e(Context context, lh.g.a aVar) {
        try {
            IBinder iBinder = (IBinder) f(((ClassLoader) jg.s.l(d(context, aVar).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                throw new RuntimeException("Unable to load maps module, IBinder for com.google.android.gms.maps.internal.CreatorImpl is null");
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return iInterfaceQueryLocalInterface instanceof v0 ? (v0) iInterfaceQueryLocalInterface : new u0(iBinder);
        } catch (ClassNotFoundException e15) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e15);
        }
    }

    private static Object f(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e15) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()), e15);
        } catch (InstantiationException e16) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()), e16);
        }
    }
}
