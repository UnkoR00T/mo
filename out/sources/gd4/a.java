package gd4;

import android.app.job.JobService;
import iq.h;
import lq.e;
import pl.gov.mc.fringers.mobywatel.manager.job.InactivityLogoutService;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends JobService implements lq.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile h f71997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f71998b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f71999c = false;

    public final h a() {
        if (this.f71997a == null) {
            synchronized (this.f71998b) {
                try {
                    if (this.f71997a == null) {
                        this.f71997a = b();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return this.f71997a;
    }

    protected h b() {
        return new h(this);
    }

    protected void c() {
        if (this.f71999c) {
            return;
        }
        this.f71999c = true;
        ((b) p()).a((InactivityLogoutService) e.a(this));
    }

    @Override // android.app.Service
    public void onCreate() {
        c();
        super.onCreate();
    }

    @Override // lq.b
    public final Object p() {
        return a().p();
    }
}
