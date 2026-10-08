package kd4;

import com.google.firebase.messaging.FirebaseMessagingService;
import iq.h;
import lq.e;
import pl.gov.mc.fringers.mobywatel.pushNotification.FirebaseService;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends FirebaseMessagingService implements lq.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile h f110232h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f110233j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f110234k = false;

    @Override // android.app.Service
    public void onCreate() {
        x();
        super.onCreate();
    }

    @Override // lq.b
    public final Object p() {
        return v().p();
    }

    public final h v() {
        if (this.f110232h == null) {
            synchronized (this.f110233j) {
                try {
                    if (this.f110232h == null) {
                        this.f110232h = w();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return this.f110232h;
    }

    protected h w() {
        return new h(this);
    }

    protected void x() {
        if (this.f110234k) {
            return;
        }
        this.f110234k = true;
        ((a) p()).c((FirebaseService) e.a(this));
    }
}
