package ha;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0011\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0001\u0002\u001c\u001d¨\u0006\u001e"}, d2 = {"Lha/o;", "Lha/h;", "Landroid/window/OnBackInvokedDispatcher;", "onBackInvokedDispatcher", "", "onBackInvokedCallbackPriority", "<init>", "(Landroid/window/OnBackInvokedDispatcher;I)V", "", "shouldBeRegistered", "Loq/i0;", "p", "(Z)V", "Landroid/window/OnBackInvokedCallback;", "n", "()Landroid/window/OnBackInvokedCallback;", "hasEnabledHandlers", "j", "c", "Landroid/window/OnBackInvokedDispatcher;", "d", "I", "e", "Landroid/window/OnBackInvokedCallback;", "onBackInvokedCallback", "f", "Z", "backInvokedCallbackRegistered", "Lha/m;", "Lha/p;", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class o extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final OnBackInvokedDispatcher onBackInvokedDispatcher;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int onBackInvokedCallbackPriority;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final OnBackInvokedCallback onBackInvokedCallback;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean backInvokedCallbackRegistered;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"ha/o$a", "Landroid/window/OnBackAnimationCallback;", "Landroid/window/BackEvent;", "backEvent", "Loq/i0;", "onBackStarted", "(Landroid/window/BackEvent;)V", "onBackProgressed", "onBackInvoked", "()V", "onBackCancelled", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements OnBackAnimationCallback {
        a() {
        }

        public void onBackCancelled() {
            o.this.a();
        }

        public void onBackInvoked() {
            o.this.b();
        }

        public void onBackProgressed(BackEvent backEvent) {
            o.this.c(k.a(backEvent));
        }

        public void onBackStarted(BackEvent backEvent) {
            o.this.d(k.a(backEvent));
        }
    }

    public /* synthetic */ o(OnBackInvokedDispatcher onBackInvokedDispatcher, int i15, fr.k kVar) {
        this(onBackInvokedDispatcher, i15);
    }

    private final OnBackInvokedCallback n() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(o oVar) {
        oVar.b();
    }

    private final void p(boolean shouldBeRegistered) {
        if (shouldBeRegistered && !this.backInvokedCallbackRegistered) {
            this.onBackInvokedDispatcher.registerOnBackInvokedCallback(this.onBackInvokedCallbackPriority, this.onBackInvokedCallback);
            this.backInvokedCallbackRegistered = true;
        } else {
            if (shouldBeRegistered || !this.backInvokedCallbackRegistered) {
                return;
            }
            this.onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.onBackInvokedCallback);
            this.backInvokedCallbackRegistered = false;
        }
    }

    @Override // ha.h
    protected void j(boolean hasEnabledHandlers) {
        p(hasEnabledHandlers);
    }

    private o(OnBackInvokedDispatcher onBackInvokedDispatcher, int i15) {
        this.onBackInvokedDispatcher = onBackInvokedDispatcher;
        this.onBackInvokedCallbackPriority = i15;
        this.onBackInvokedCallback = Build.VERSION.SDK_INT == 33 ? new OnBackInvokedCallback() { // from class: ha.n
            public final void onBackInvoked() {
                o.o(this.f82269a);
            }
        } : n();
    }
}
