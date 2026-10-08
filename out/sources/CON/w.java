package CON;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.p016lifecycle.C6451z0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u001b\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0015¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u0018\u0010\u001cJ!\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u0018\u0010\u001fJ!\u0010 \u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0010H\u0017¢\u0006\u0004\b!\u0010\u0014R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R!\u00105\u001a\u0002008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b1\u0010,\u0012\u0004\b4\u0010\u0014\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010>R\u0014\u0010B\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010A¨\u0006C"}, d2 = {"LCON/w;", "Landroid/app/Dialog;", "Landroidx/lifecycle/q;", "LCON/s0;", "Lha/d;", "Lua/j;", "Landroid/content/Context;", "context", "", "themeResId", "<init>", "(Landroid/content/Context;I)V", "Landroid/os/Bundle;", "onSaveInstanceState", "()Landroid/os/Bundle;", "savedInstanceState", "Loq/i0;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "onStop", "onBackPressed", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "h", "Landroidx/lifecycle/s;", "a", "Landroidx/lifecycle/s;", "_lifecycleRegistry", "Lua/i;", "b", "Lua/i;", "savedStateRegistryController", "Lha/a;", "c", "Loq/k;", "g", "()Lha/a;", "onBackPressedInput", "LCON/q0;", "d", "o", "()LCON/q0;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "f", "()Landroidx/lifecycle/s;", "lifecycleRegistry", "Lua/g;", "k", "()Lua/g;", "savedStateRegistry", "Landroidx/lifecycle/j;", "()Landroidx/lifecycle/j;", "lifecycle", "Lha/c;", "()Lha/c;", "navigationEventDispatcher", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class w extends Dialog implements androidx.p016lifecycle.q, s0, ha.d, ua.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private androidx.p016lifecycle.s _lifecycleRegistry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ua.i savedStateRegistryController;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k onBackPressedInput;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k onBackPressedDispatcher;

    public w(Context context, int i15) {
        super(context, i15);
        this.savedStateRegistryController = ua.i.INSTANCE.b(this);
        this.onBackPressedInput = oq.l.a(new er.a() { // from class: CON.t
            @Override // er.a
            public final Object a() {
                return w.l(this.f223a);
            }
        });
        this.onBackPressedDispatcher = oq.l.a(new er.a() { // from class: CON.u
            @Override // er.a
            public final Object a() {
                return w.i(this.f226a);
            }
        });
    }

    private final androidx.p016lifecycle.s f() {
        androidx.p016lifecycle.s sVar = this._lifecycleRegistry;
        if (sVar != null) {
            return sVar;
        }
        androidx.p016lifecycle.s sVar2 = new androidx.p016lifecycle.s(this);
        this._lifecycleRegistry = sVar2;
        return sVar2;
    }

    private final ha.a g() {
        return (ha.a) this.onBackPressedInput.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q0 i(final w wVar) {
        return new q0(new Runnable() { // from class: CON.v
            @Override // java.lang.Runnable
            public final void run() {
                w.j(this.f227a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(w wVar) {
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ha.a l(w wVar) {
        ha.a aVar = new ha.a();
        wVar.d().c(aVar);
        return aVar;
    }

    @Override // androidx.p016lifecycle.q
    /* JADX INFO: renamed from: a */
    public androidx.p016lifecycle.j getLifecycle() {
        return f();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        h();
        super.addContentView(view, params);
    }

    @Override // ha.d
    public ha.c d() {
        return o().h();
    }

    public void h() {
        C6451z0.b(getWindow().getDecorView(), this);
        x0.b(getWindow().getDecorView(), this);
        ua.n.b(getWindow().getDecorView(), this);
        ha.r.b(getWindow().getDecorView(), this);
    }

    @Override // ua.j
    public ua.g k() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // CON.s0
    public final q0 o() {
        return (q0) this.onBackPressedDispatcher.getValue();
    }

    @Override // android.app.Dialog
    @oq.a
    public void onBackPressed() {
        g().m();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 33) {
            o().k(getOnBackInvokedDispatcher());
        }
        this.savedStateRegistryController.d(savedInstanceState);
        f().i(androidx.lifecycle.j.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        this.savedStateRegistryController.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        f().i(androidx.lifecycle.j.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        f().i(androidx.lifecycle.j.a.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int layoutResID) {
        h();
        super.setContentView(layoutResID);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        h();
        super.setContentView(view);
    }

    public /* synthetic */ w(Context context, int i15, int i16, fr.k kVar) {
        this(context, (i16 & 2) != 0 ? 0 : i15);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        h();
        super.setContentView(view, params);
    }
}
