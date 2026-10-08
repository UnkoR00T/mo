package CON;

import android.window.OnBackInvokedDispatcher;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0019B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001f\u0010%\u001a\u00060 R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"LCON/q0;", "", "Ljava/lang/Runnable;", "fallbackOnBackPressed", "Li6/a;", "", "onHasEnabledCallbacksChanged", "<init>", "(Ljava/lang/Runnable;Li6/a;)V", "(Ljava/lang/Runnable;)V", "Landroid/window/OnBackInvokedDispatcher;", "invoker", "Loq/i0;", "k", "(Landroid/window/OnBackInvokedDispatcher;)V", "LCON/m0;", "onBackPressedCallback", "e", "(LCON/m0;)V", "Landroidx/lifecycle/q;", "owner", "f", "(Landroidx/lifecycle/q;LCON/m0;)V", "j", "()V", "a", "Ljava/lang/Runnable;", "b", "Li6/a;", "c", "Z", "hasEnabledCallbacks", "LCON/q0$a;", "d", "Loq/k;", "i", "()LCON/q0$a;", "eventInput", "Lha/c;", "h", "()Lha/c;", "eventDispatcher", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Runnable fallbackOnBackPressed;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i6.a<Boolean> onHasEnabledCallbacksChanged;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hasEnabledCallbacks;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k eventInput;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LCON/q0$a;", "Lha/h;", "<init>", "(LCON/q0;)V", "", "hasEnabledHandlers", "Loq/i0;", "j", "(Z)V", "n", "()V", "Lha/c;", "c", "Lha/c;", "p", "()Lha/c;", "dispatcher", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class a extends ha.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final ha.c dispatcher;

        public a() {
            ha.c cVar = new ha.c(new ha.l() { // from class: CON.p0
                @Override // ha.l
                public final void a() {
                    q0.a.o(q0Var);
                }
            });
            cVar.c(this);
            this.dispatcher = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(q0 q0Var) {
            Runnable runnable = q0Var.fallbackOnBackPressed;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // ha.h
        protected void j(boolean hasEnabledHandlers) {
            q0.this.hasEnabledCallbacks = hasEnabledHandlers;
            i6.a aVar = q0.this.onHasEnabledCallbacksChanged;
            if (aVar != null) {
                aVar.accept(Boolean.valueOf(hasEnabledHandlers));
            }
        }

        public final void n() {
            b();
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final ha.c getDispatcher() {
            return this.dispatcher;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"CON/q0$b", "Landroidx/lifecycle/n;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Landroidx/lifecycle/q;", "source", "Landroidx/lifecycle/j$a;", "event", "Loq/i0;", "m", "(Landroidx/lifecycle/q;Landroidx/lifecycle/j$a;)V", "close", "()V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements androidx.p016lifecycle.n, AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0.a f213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q0 f214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.j f215c;

        b(m0.a aVar, q0 q0Var, androidx.p016lifecycle.j jVar) {
            this.f213a = aVar;
            this.f214b = q0Var;
            this.f215c = jVar;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            this.f215c.d(this);
        }

        @Override // androidx.p016lifecycle.n
        public void m(androidx.p016lifecycle.q source, androidx.lifecycle.j.a event) {
            if (CON.a.isOnBackPressedLifecycleOrderMaintained) {
                if (event == androidx.lifecycle.j.a.ON_START) {
                    this.f213a.D(true);
                } else if (event == androidx.lifecycle.j.a.ON_STOP) {
                    this.f213a.D(false);
                }
            } else if (event == androidx.lifecycle.j.a.ON_START) {
                ha.c.b(this.f214b.h(), this.f213a, 0, 2, null);
            } else if (event == androidx.lifecycle.j.a.ON_STOP) {
                this.f213a.x();
            }
            if (event == androidx.lifecycle.j.a.ON_DESTROY) {
                this.f213a.x();
                this.f215c.d(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a g(q0 q0Var) {
        return q0Var.new a();
    }

    private final a i() {
        return (a) this.eventInput.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(m0 onBackPressedCallback) {
        ha.c.b(h(), onBackPressedCallback.b(new OnBackPressedCallbackInfo(onBackPressedCallback, null, 2, 0 == true ? 1 : 0)), 0, 2, null);
    }

    public final void f(androidx.p016lifecycle.q owner, m0 onBackPressedCallback) {
        androidx.p016lifecycle.j jVarA = owner.getLifecycleRegistry();
        if (jVarA.getState() == androidx.lifecycle.j.b.DESTROYED) {
            return;
        }
        m0.a aVarB = onBackPressedCallback.b(new OnBackPressedCallbackInfo(onBackPressedCallback, owner));
        if (CON.a.isOnBackPressedLifecycleOrderMaintained) {
            aVarB.D(false);
            ha.c.b(h(), aVarB, 0, 2, null);
        }
        b bVar = new b(aVarB, this, jVarA);
        jVarA.a(bVar);
        onBackPressedCallback.a(bVar);
    }

    public final ha.c h() {
        return i().getDispatcher();
    }

    public final void j() {
        i().n();
    }

    public final void k(OnBackInvokedDispatcher invoker) {
        h().d(new ha.m(invoker), 1);
        h().d(new ha.p(invoker), 0);
    }

    public q0(Runnable runnable, i6.a<Boolean> aVar) {
        this.fallbackOnBackPressed = runnable;
        this.onHasEnabledCallbacksChanged = aVar;
        this.eventInput = oq.l.a(new er.a() { // from class: CON.o0
            @Override // er.a
            public final Object a() {
                return q0.g(this.f175a);
            }
        });
    }

    public q0(Runnable runnable) {
        this(runnable, null);
    }

    public /* synthetic */ q0(Runnable runnable, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : runnable);
    }
}
