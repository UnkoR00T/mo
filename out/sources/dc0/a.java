package dc0;

import android.app.job.JobService;
import iq.h;
import lq.e;
import pl.gov.coi.mjunior.feature.inactivitylogout.MJuniorInactivityLogoutService;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends JobService implements lq.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile h f40788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f40789b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40790c = false;

    public final h a() {
        if (this.f40788a == null) {
            synchronized (this.f40789b) {
                try {
                    if (this.f40788a == null) {
                        this.f40788a = b();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return this.f40788a;
    }

    protected h b() {
        return new h(this);
    }

    protected void c() {
        if (this.f40790c) {
            return;
        }
        this.f40790c = true;
        ((b) p()).b((MJuniorInactivityLogoutService) e.a(this));
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
