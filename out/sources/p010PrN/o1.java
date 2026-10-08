package p010PrN;

import android.os.CancellationSignal;
import e6.d;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes.dex */
class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f950a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CancellationSignal f951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f952c;

    class a implements c {
        a() {
        }

        @Override // PrN.o1.c
        public d a() {
            return new d();
        }

        @Override // PrN.o1.c
        public CancellationSignal b() {
            return b.b();
        }
    }

    private static class b {
        static void a(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    interface c {
        d a();

        CancellationSignal b();
    }

    o1() {
    }

    void a() {
        CancellationSignal cancellationSignal = this.f951b;
        if (cancellationSignal != null) {
            try {
                b.a(cancellationSignal);
            } catch (NullPointerException e15) {
                c2.f("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e15);
            }
            this.f951b = null;
        }
        d dVar = this.f952c;
        if (dVar != null) {
            try {
                dVar.a();
            } catch (NullPointerException e16) {
                c2.f("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e16);
            }
            this.f952c = null;
        }
    }

    CancellationSignal b() {
        if (this.f951b == null) {
            this.f951b = this.f950a.b();
        }
        return this.f951b;
    }

    d c() {
        if (this.f952c == null) {
            this.f952c = this.f950a.a();
        }
        return this.f952c;
    }
}
