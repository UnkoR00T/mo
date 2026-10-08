# Paczka 088 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `CON/p.java (część 3/4)`

## CON/p.java (część 3/4)

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
    public final void c(i6.a<s5.t> listener) {
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // ha.d
    public ha.c d() {
        return o().h();
    }

    @Override // p006NUl.i
    /* JADX INFO: renamed from: f, reason: from getter */
    public final p006NUl.h getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    public h0 f0() {
        return (h0) this.fullyDrawnReporter.getValue();
    }

    @Override // androidx.p016lifecycle.y0
    public androidx.p016lifecycle.x0 h() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        c0();
        return this._viewModelStore;
    }

    public void h0() {
        C6451z0.b(getWindow().getDecorView(), this);
        androidx.p016lifecycle.View.b(getWindow().getDecorView(), this);
        ua.n.b(getWindow().getDecorView(), this);
        x0.b(getWindow().getDecorView(), this);
        w0.a(getWindow().getDecorView(), this);
        ha.r.b(getWindow().getDecorView(), this);
    }

    @Override // u5.b
    public final void i(i6.a<Configuration> listener) {
        this.onConfigurationChangedListeners.add(listener);
    }

    public void i0() {
        invalidateOptionsMenu();
    }

    @Override // u5.c
    public final void j(i6.a<Integer> listener) {
        this.onTrimMemoryListeners.remove(listener);
    }

    @Override // ua.j
    public final ua.g k() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // s5.q
    public final void m(i6.a<s5.t> listener) {
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // CON.s0
    public final q0 o() {
        return (q0) this.onBackPressedDispatcher.getValue();
    }

    @oq.a
    public Object o0() {
        return null;
    }

    @Override // android.app.Activity
    @oq.a
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (this.activityResultRegistry.f(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // android.app.Activity
    @oq.a
    public void onBackPressed() {
        g0().m();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Iterator<i6.a<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // s5.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        this.savedStateRegistryController.d(savedInstanceState);
        this.contextAwareHelper.c(this);
        super.onCreate(savedInstanceState);
        androidx.p016lifecycle.h0.INSTANCE.c(this);
        int i15 = this.contentLayoutId;
        if (i15 != 0) {
            setContentView(i15);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        if (featureId != 0) {
            return true;
        }
        super.onCreatePanelMenu(featureId, menu);
        this.menuHostHelper.b(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            return this.menuHostHelper.d(item);
        }
        return false;
    }

    @Override // android.app.Activity
    @oq.a
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<i6.a<s5.i>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new s5.i(isInMultiWindowMode));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<i6.a<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, Menu menu) {
        this.menuHostHelper.c(menu);
        super.onPanelClosed(featureId, menu);
    }

    @Override // android.app.Activity
    @oq.a
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<i6.a<s5.t>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new s5.t(isInPictureInPictureMode));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        if (featureId != 0) {
            return true;
        }
        super.onPreparePanel(featureId, view, menu);
        this.menuHostHelper.e(menu);
        return true;
    }

    @Override // android.app.Activity
    @oq.a
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        if (this.activityResultRegistry.f(requestCode, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object objO0 = o0();
        androidx.p016lifecycle.x0 viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            viewModelStore = cVar.getViewModelStore();
        }
        if (viewModelStore == null && objO0 == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.b(objO0);
        cVar2.c(viewModelStore);
        return cVar2;
    }

    @Override // s5.h, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        if (getLifecycleRegistry() instanceof androidx.p016lifecycle.s) {
            ((androidx.p016lifecycle.s) getLifecycleRegistry()).n(androidx.lifecycle.j.b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.e(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<i6.a<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(level));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public final <I, O> p006NUl.e<I> p0(p087nuL.b0<I, O> contract, p006NUl.d<O> callback) {
        return q0(contract, this.activityResultRegistry, callback);
    }

    @Override // s5.p
    public final void q(i6.a<s5.i> listener) {
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final <I, O> p006NUl.e<I> q0(p087nuL.b0<I, O> contract, p006NUl.h registry, p006NUl.d<O> callback) {
        return registry.n("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (eb.a.h()) {
                eb.a.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            f0().b();
        } finally {
            eb.a.f();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        h0();
        this.reportFullyDrawnExecutor.c0(getWindow().getDecorView());
        super.setContentView(layoutResID);
    }

    @Override // android.app.Activity
    @oq.a
    public void startActivityForResult(Intent intent, int requestCode) {
        super.startActivityForResult(intent, requestCode);
    }

    @Override // android.app.Activity
    @oq.a
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override // s5.p
    public final void t(i6.a<s5.i> listener) {
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    @Override // u5.b
    public final void u(i6.a<Configuration> listener) {
        this.onConfigurationChangedListeners.remove(listener);
    }

    @Override // androidx.p016lifecycle.h
```
