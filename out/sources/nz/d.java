package nz;

import CON.p;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.p016lifecycle.j;
import androidx.p016lifecycle.n;
import androidx.p016lifecycle.q;
import androidx.p016lifecycle.r;
import j6.f1;
import j6.l0;
import j6.y;
import mu.b0;
import mu.i;
import mu.p0;
import mu.r0;
import oq.i0;
import oq.k;
import oq.l;
import oq.u;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0005J\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u001e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010.\u001a\u0004\u0018\u00010+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lnz/d;", "Llx/a;", "Lnz/a;", "Landroidx/lifecycle/n;", "<init>", "()V", "Loq/i0;", "k", "LCON/p;", "activity", "e", "(LCON/p;)V", "c", "a", "Landroidx/lifecycle/q;", "source", "Landroidx/lifecycle/j$a;", "event", "m", "(Landroidx/lifecycle/q;Landroidx/lifecycle/j$a;)V", "LCON/p;", "Landroid/view/inputmethod/InputMethodManager;", "b", "Loq/k;", "h", "()Landroid/view/inputmethod/InputMethodManager;", "inputMethodManager", "", "Ljava/lang/Object;", "lock", "", "d", "Z", "shouldEmitImeVisibility", "Lmu/b0;", "Lmu/b0;", "_visible", "Lmu/p0;", "f", "Lmu/p0;", "j", "()Lmu/p0;", "visible", "Landroid/view/View;", "i", "()Landroid/view/View;", "view", "keyboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements lx.a, nz.a, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private p activity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k inputMethodManager = l.a(new er.a() { // from class: nz.c
        @Override // er.a
        public final Object a() {
            return d.n(this.f139705a);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean shouldEmitImeVisibility;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b0<Boolean> _visible;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<Boolean> visible;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f139712a;

        static {
            int[] iArr = new int[j.a.values().length];
            try {
                iArr[j.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f139712a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<ju.p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139713e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f139715g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z15, e<? super b> eVar) {
            super(2, eVar);
            this.f139715g = z15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f139713e;
            if (i15 == 0) {
                u.b(obj);
                b0 b0Var = d.this._visible;
                Boolean boolA = vq.b.a(this.f139715g);
                this.f139713e = 1;
                if (b0Var.F(boolA, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return d.this.new b(this.f139715g, eVar);
        }
    }

    public d() {
        b0<Boolean> b0VarA = r0.a(Boolean.FALSE);
        this._visible = b0VarA;
        this.visible = i.b(b0VarA);
    }

    private final InputMethodManager h() {
        return (InputMethodManager) this.inputMethodManager.getValue();
    }

    private final View i() {
        p pVar = this.activity;
        if (pVar == null) {
            pVar = null;
        }
        return pVar.getCurrentFocus();
    }

    private final void k() {
        View decorView;
        View rootView;
        synchronized (this.lock) {
            try {
                p pVar = this.activity;
                if (pVar == null) {
                    pVar = null;
                }
                Window window = pVar.getWindow();
                if (window != null && (decorView = window.getDecorView()) != null && (rootView = decorView.getRootView()) != null) {
                    l0.q0(rootView, new y() { // from class: nz.b
                        @Override // j6.y
                        public final f1 b(View view, f1 f1Var) {
                            return d.l(this.f139704a, view, f1Var);
                        }
                    });
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f1 l(d dVar, View view, f1 f1Var) {
        if (dVar.shouldEmitImeVisibility) {
            boolean zQ = f1Var.q(f1.p.d());
            p pVar = dVar.activity;
            if (pVar == null) {
                pVar = null;
            }
            ju.k.d(r.a(pVar), null, null, dVar.new b(zQ, null), 3, null);
        }
        return f1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputMethodManager n(d dVar) {
        p pVar = dVar.activity;
        if (pVar == null) {
            pVar = null;
        }
        return (InputMethodManager) pVar.getSystemService("input_method");
    }

    @Override // lx.a
    public void a() {
        InputMethodManager inputMethodManagerH = h();
        if (inputMethodManagerH != null) {
            inputMethodManagerH.showSoftInput(i(), 0);
        }
    }

    @Override // lx.a
    public void c() {
        InputMethodManager inputMethodManagerH = h();
        if (inputMethodManagerH != null) {
            View viewI = i();
            inputMethodManagerH.hideSoftInputFromWindow(viewI != null ? viewI.getWindowToken() : null, 0);
        }
    }

    @Override // oz.c
    public void e(p activity) {
        synchronized (this.lock) {
            j lifecycleRegistry = activity.getLifecycleRegistry();
            lifecycleRegistry.d(this);
            lifecycleRegistry.a(this);
            this.activity = activity;
            k();
            i0 i0Var = i0.f148189a;
        }
    }

    @Override // lx.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public p0<Boolean> b() {
        return this.visible;
    }

    @Override // androidx.p016lifecycle.n
    public void m(q source, j.a event) {
        int i15 = a.f139712a[event.ordinal()];
        if (i15 == 1) {
            this.shouldEmitImeVisibility = true;
        } else {
            if (i15 != 2) {
                return;
            }
            this.shouldEmitImeVisibility = false;
        }
    }
}
