package oe;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import ie.t;

/* JADX INFO: loaded from: classes3.dex */
public class o implements Handler.Callback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b f144996f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile com.bumptech.glide.l f144997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f144998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r0.a<View, androidx.fragment.app.o> f144999c = new r0.a<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f145000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m f145001e;

    class a implements b {
        a() {
        }

        @Override // oe.o.b
        public com.bumptech.glide.l a(com.bumptech.glide.b bVar, j jVar, p pVar, Context context) {
            return new com.bumptech.glide.l(bVar, jVar, pVar, context);
        }
    }

    public interface b {
        com.bumptech.glide.l a(com.bumptech.glide.b bVar, j jVar, p pVar, Context context);
    }

    public o(b bVar) {
        bVar = bVar == null ? f144996f : bVar;
        this.f144998b = bVar;
        this.f145001e = new m(bVar);
        this.f145000d = b();
    }

    @TargetApi(17)
    private static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static i b() {
        return (t.f91940f && t.f91939e) ? new h() : new f();
    }

    private static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private com.bumptech.glide.l f(Context context) {
        if (this.f144997a == null) {
            synchronized (this) {
                try {
                    if (this.f144997a == null) {
                        this.f144997a = this.f144998b.a(com.bumptech.glide.b.c(context.getApplicationContext()), new oe.a(), new g(), context.getApplicationContext());
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return this.f144997a;
    }

    private static boolean g(Context context) {
        Activity activityC = c(context);
        return activityC == null || !activityC.isFinishing();
    }

    public com.bumptech.glide.l d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (ve.l.r() && !(context instanceof Application)) {
            if (context instanceof androidx.fragment.app.p) {
                return e((androidx.fragment.app.p) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return d(contextWrapper.getBaseContext());
                }
            }
        }
        return f(context);
    }

    public com.bumptech.glide.l e(androidx.fragment.app.p pVar) {
        if (ve.l.q()) {
            return d(pVar.getApplicationContext());
        }
        a(pVar);
        this.f145000d.a(pVar);
        boolean zG = g(pVar);
        return this.f145001e.b(pVar, com.bumptech.glide.b.c(pVar.getApplicationContext()), pVar.getLifecycle(), pVar.w0(), zG);
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public boolean handleMessage(Message message) {
        return false;
    }
}
