package e6;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f47628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f47629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f47630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f47631d;

    public interface a {
        void onCancel();
    }

    private void d() {
        while (this.f47631d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f47628a) {
                    return;
                }
                this.f47628a = true;
                this.f47631d = true;
                a aVar = this.f47629b;
                Object obj = this.f47630c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th4) {
                        synchronized (this) {
                            this.f47631d = false;
                            notifyAll();
                            throw th4;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f47631d = false;
                    notifyAll();
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public Object b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f47630c == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f47630c = cancellationSignal;
                    if (this.f47628a) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f47630c;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return obj;
    }

    public void c(a aVar) {
        synchronized (this) {
            try {
                d();
                if (this.f47629b == aVar) {
                    return;
                }
                this.f47629b = aVar;
                if (this.f47628a && aVar != null) {
                    aVar.onCancel();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
