# Paczka 087 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `CON/p.java (część 2/4)`

## CON/p.java (część 2/4)

```java
package CON;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.p016lifecycle.C6451z0;
import androidx.p016lifecycle.y0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p071kotlin.Metadata;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ì\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\
    public p() {
        this.contextAwareHelper = new p083nUl.z();
        this.menuHostHelper = new j6.p(new Runnable() { // from class: CON.c
            @Override // java.lang.Runnable
            public final void run() {
                p.j0(this.f144a);
            }
        });
        ua.i iVarB = ua.i.INSTANCE.b(this);
        this.savedStateRegistryController = iVarB;
        this.reportFullyDrawnExecutor = a0();
        this.fullyDrawnReporter = oq.l.a(new er.a() { // from class: CON.g
            @Override // er.a
            public final Object a() {
                return p.d0(this.f150a);
            }
        });
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new f();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput = oq.l.a(new er.a() { // from class: CON.h
            @Override // er.a
            public final Object a() {
                return p.n0(this.f152a);
            }
        });
        if (getLifecycleRegistry() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycleRegistry().a(new androidx.p016lifecycle.n() { // from class: CON.i
            @Override // androidx.p016lifecycle.n
            public final void m(androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
                p.R(this.f161a, qVar, aVar);
            }
        });
        getLifecycleRegistry().a(new androidx.p016lifecycle.n() { // from class: CON.j
            @Override // androidx.p016lifecycle.n
            public final void m(androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
                p.S(this.f162a, qVar, aVar);
            }
        });
        getLifecycleRegistry().a(new a());
        iVarB.c();
        androidx.p016lifecycle.l0.c(this);
        k().c("android:support:activity-result", new ua.g.b() { // from class: CON.k
            @Override // ua.g.b
            public final Bundle a() {
                return p.T(this.f163a);
            }
        });
        Y(new p083nUl.a0() { // from class: CON.l
            @Override // p083nUl.a0
            public final void a(Context context) {
                p.U(this.f164a, context);
            }
        });
        this.defaultViewModelProviderFactory = oq.l.a(new er.a() { // from class: CON.m
            @Override // er.a
            public final Object a() {
                return p.b0(this.f165a);
            }
        });
        this.onBackPressedDispatcher = oq.l.a(new er.a() { // from class: CON.n
            @Override // er.a
            public final Object a() {
                return p.k0(this.f171a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(p pVar, androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
        Window window;
        View viewPeekDecorView;
        if (aVar != androidx.lifecycle.j.a.ON_STOP || (window = pVar.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(p pVar, androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
        if (aVar == androidx.lifecycle.j.a.ON_DESTROY) {
            pVar.contextAwareHelper.b();
            if (!pVar.isChangingConfigurations()) {
                pVar.h().a();
            }
            pVar.reportFullyDrawnExecutor.H();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle T(p pVar) {
        Bundle bundle = new Bundle();
        pVar.activityResultRegistry.m(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(p pVar, Context context) {
        Bundle bundleA = pVar.k().a("android:support:activity-result");
        if (bundleA != null) {
            pVar.activityResultRegistry.l(bundleA);
        }
    }

    private final void W(final q0 dispatcher) {
        getLifecycleRegistry().a(new androidx.p016lifecycle.n() { // from class: CON.f
            @Override // androidx.p016lifecycle.n
            public final void m(androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
                p.X(dispatcher, this, qVar, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(q0 q0Var, p pVar, androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
        if (aVar == androidx.lifecycle.j.a.ON_CREATE) {
            q0Var.k(pVar.getOnBackInvokedDispatcher());
        }
    }

    private final d a0() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.p016lifecycle.p0 b0(p pVar) {
        return new androidx.p016lifecycle.p0(pVar.getApplication(), pVar, pVar.getIntent() != null ? pVar.getIntent().getExtras() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0() {
        if (this._viewModelStore == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this._viewModelStore = cVar.getViewModelStore();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new androidx.p016lifecycle.x0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 d0(final p pVar) {
        return new h0(pVar.reportFullyDrawnExecutor, new er.a() { // from class: CON.e
            @Override // er.a
            public final Object a() {
                return p.e0(this.f147a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e0(p pVar) {
        pVar.reportFullyDrawn();
        return oq.i0.f148189a;
    }

    private final ha.a g0() {
        return (ha.a) this.onBackPressedInput.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(p pVar) {
        pVar.i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q0 k0(final p pVar) {
        final q0 q0Var = new q0(new Runnable() { // from class: CON.o
            @Override // java.lang.Runnable
            public final void run() {
                p.l0(this.f174a);
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            if (!fr.t.c(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: CON.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.m0(this.f145a, q0Var);
                    }
                });
                return q0Var;
            }
            pVar.W(q0Var);
        }
        return q0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(p pVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e15) {
            if (!fr.t.c(e15.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e15;
            }
        } catch (NullPointerException e16) {
            if (!fr.t.c(e16.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e16;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(p pVar, q0 q0Var) {
        pVar.W(q0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ha.a n0(p pVar) {
        ha.a aVar = new ha.a();
        pVar.d().c(aVar);
        return aVar;
    }

    @Override // u5.c
    public final void A(i6.a<Integer> listener) {
        this.onTrimMemoryListeners.add(listener);
    }

    @Override // j6.o
    public void B(j6.r provider) {
        this.menuHostHelper.a(provider);
    }

    public final void Y(p083nUl.a0 listener) {
        this.contextAwareHelper.a(listener);
    }

    public final void Z(i6.a<Intent> listener) {
        this.onNewIntentListeners.add(listener);
    }

    @Override // s5.h, androidx.p016lifecycle.q
    /* JADX INFO: renamed from: a */
    public androidx.p016lifecycle.j getLifecycleRegistry() {
        return super.getLifecycleRegistry();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        h0();
        this.reportFullyDrawnExecutor.c0(getWindow().getDecorView());
        super.addContentView(view, params);
    }

    @Override // s5.q
```
