package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static b f35567e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f35568a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f35569b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f35570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f35571d;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b.this.d((c) message.obj);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.b$b, reason: collision with other inner class name */
    interface InterfaceC0753b {
        void a();

        void b(int i15);
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WeakReference<InterfaceC0753b> f35573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f35574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f35575c;

        boolean a(InterfaceC0753b interfaceC0753b) {
            return interfaceC0753b != null && this.f35573a.get() == interfaceC0753b;
        }
    }

    private b() {
    }

    private boolean a(c cVar, int i15) {
        InterfaceC0753b interfaceC0753b = cVar.f35573a.get();
        if (interfaceC0753b == null) {
            return false;
        }
        this.f35569b.removeCallbacksAndMessages(cVar);
        interfaceC0753b.b(i15);
        return true;
    }

    static b c() {
        if (f35567e == null) {
            f35567e = new b();
        }
        return f35567e;
    }

    private boolean f(InterfaceC0753b interfaceC0753b) {
        c cVar = this.f35570c;
        return cVar != null && cVar.a(interfaceC0753b);
    }

    private boolean g(InterfaceC0753b interfaceC0753b) {
        c cVar = this.f35571d;
        return cVar != null && cVar.a(interfaceC0753b);
    }

    private void l(c cVar) {
        int i15 = cVar.f35574b;
        if (i15 == -2) {
            return;
        }
        if (i15 <= 0) {
            i15 = i15 == -1 ? 1500 : 2750;
        }
        this.f35569b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f35569b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i15);
    }

    private void m() {
        c cVar = this.f35571d;
        if (cVar != null) {
            this.f35570c = cVar;
            this.f35571d = null;
            InterfaceC0753b interfaceC0753b = cVar.f35573a.get();
            if (interfaceC0753b != null) {
                interfaceC0753b.a();
            } else {
                this.f35570c = null;
            }
        }
    }

    public void b(InterfaceC0753b interfaceC0753b, int i15) {
        synchronized (this.f35568a) {
            try {
                if (f(interfaceC0753b)) {
                    a(this.f35570c, i15);
                } else if (g(interfaceC0753b)) {
                    a(this.f35571d, i15);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    void d(c cVar) {
        synchronized (this.f35568a) {
            try {
                if (this.f35570c == cVar || this.f35571d == cVar) {
                    a(cVar, 2);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public boolean e(InterfaceC0753b interfaceC0753b) {
        boolean z15;
        synchronized (this.f35568a) {
            try {
                z15 = f(interfaceC0753b) || g(interfaceC0753b);
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return z15;
    }

    public void h(InterfaceC0753b interfaceC0753b) {
        synchronized (this.f35568a) {
            try {
                if (f(interfaceC0753b)) {
                    this.f35570c = null;
                    if (this.f35571d != null) {
                        m();
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void i(InterfaceC0753b interfaceC0753b) {
        synchronized (this.f35568a) {
            try {
                if (f(interfaceC0753b)) {
                    l(this.f35570c);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void j(InterfaceC0753b interfaceC0753b) {
        synchronized (this.f35568a) {
            try {
                if (f(interfaceC0753b)) {
                    c cVar = this.f35570c;
                    if (!cVar.f35575c) {
                        cVar.f35575c = true;
                        this.f35569b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void k(InterfaceC0753b interfaceC0753b) {
        synchronized (this.f35568a) {
            try {
                if (f(interfaceC0753b)) {
                    c cVar = this.f35570c;
                    if (cVar.f35575c) {
                        cVar.f35575c = false;
                        l(cVar);
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
