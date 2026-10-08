package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.Owner;
import androidx.p016lifecycle.C6451z0;
import java.lang.ref.WeakReference;
import p071kotlin.Metadata;
import p076m2.p4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\fJ\u0017\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH'¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\n¢\u0006\u0004\b%\u0010\fJ\r\u0010&\u001a\u00020\n¢\u0006\u0004\b&\u0010\fJ\u000f\u0010'\u001a\u00020\nH\u0014¢\u0006\u0004\b'\u0010\fJ\u001f\u0010*\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0004¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0010¢\u0006\u0004\b,\u0010+J7\u00103\u001a\u00020\n2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0004¢\u0006\u0004\b3\u00104J7\u00105\u001a\u00020\n2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0010¢\u0006\u0004\b5\u00104J\u0017\u00107\u001a\u00020\n2\u0006\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020-H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\n2\u0006\u00109\u001a\u00020-H\u0016¢\u0006\u0004\b;\u0010<J\u0019\u0010>\u001a\u00020\n2\b\u0010=\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b>\u0010?J!\u0010>\u001a\u00020\n2\b\u0010=\u001a\u0004\u0018\u00010\u00162\u0006\u0010@\u001a\u00020\u0006H\u0016¢\u0006\u0004\b>\u0010AJ)\u0010>\u001a\u00020\n2\b\u0010=\u001a\u0004\u0018\u00010\u00162\u0006\u0010B\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u0006H\u0016¢\u0006\u0004\b>\u0010DJ#\u0010>\u001a\u00020\n2\b\u0010=\u001a\u0004\u0018\u00010\u00162\b\u0010F\u001a\u0004\u0018\u00010EH\u0016¢\u0006\u0004\b>\u0010GJ+\u0010>\u001a\u00020\n2\b\u0010=\u001a\u0004\u0018\u00010\u00162\u0006\u0010@\u001a\u00020\u00062\b\u0010F\u001a\u0004\u0018\u00010EH\u0016¢\u0006\u0004\b>\u0010HJ+\u0010I\u001a\u00020-2\b\u0010=\u001a\u0004\u0018\u00010\u00162\u0006\u0010@\u001a\u00020\u00062\b\u0010F\u001a\u0004\u0018\u00010EH\u0014¢\u0006\u0004\bI\u0010JJ3\u0010I\u001a\u00020-2\b\u0010=\u001a\u0004\u0018\u00010\u00162\u0006\u0010@\u001a\u00020\u00062\b\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010K\u001a\u00020-H\u0014¢\u0006\u0004\bI\u0010LJ\u000f\u0010M\u001a\u00020-H\u0016¢\u0006\u0004\bM\u0010:R\u001e\u0010Q\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR(\u0010X\u001a\u0004\u0018\u00010R2\b\u0010S\u001a\u0004\u0018\u00010R8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0018\u0010[\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010ZR(\u0010^\u001a\u0004\u0018\u00010\r2\b\u0010S\u001a\u0004\u0018\u00010\r8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001b\u0010\\\"\u0004\b]\u0010\u001eR4\u0010d\u001a\u0004\u0018\u00010\u00132\b\u0010S\u001a\u0004\u0018\u00010\u00138\u0000@@X\u0081\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010_\u0012\u0004\bc\u0010\f\u001a\u0004\b`\u0010\u0015\"\u0004\ba\u0010bR$\u0010h\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u000b\u0010f\u0012\u0004\bg\u0010\fR0\u0010m\u001a\u00020-2\u0006\u0010S\u001a\u00020-8\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b%\u0010i\u0012\u0004\bl\u0010\f\u001a\u0004\bj\u0010:\"\u0004\bk\u0010<R\u0016\u0010n\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010iR\u0016\u0010o\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010iR\u0018\u0010r\u001a\u00020-*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010t\u001a\u00020-8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bs\u0010:R$\u0010y\u001a\u00020u2\u0006\u0010S\u001a\u00020u8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bv\u0010w\"\u0004\bx\u00108R\u0011\u0010{\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bz\u0010:¨\u0006|"}, d2 = {"Landroidx/compose/ui/platform/b;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Loq/i0;", "f", "()V", "Lm2/v;", "e", "(Lm2/v;)Lm2/v;", "o", "()Lm2/v;", "i", "Landroidx/compose/ui/platform/e1;", "n", "()Landroidx/compose/ui/platform/e1;", "Landroid/view/View;", "contextView", "existingContext", "p", "(Landroid/view/View;Landroidx/compose/ui/platform/e1;)Landroidx/compose/ui/platform/e1;", "d", "parent", "setParentCompositionContext", "(Lm2/v;)V", "Landroidx/compose/ui/platform/b3;", "strategy", "setViewCompositionStrategy", "(Landroidx/compose/ui/platform/b3;)V", "c", "(Lm2/r;I)V", "g", "h", "onAttachedToWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "k", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "j", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "isTransitionGroup", "()Z", "setTransitionGroup", "(Z)V", "child", "addView", "(Landroid/view/View;)V", "index", "(Landroid/view/View;I)V", "width", "height", "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "addViewInLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z", "preventRequestLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z", "shouldDelayChildPressedState", "Ljava/lang/ref/WeakReference;", "a", "Ljava/lang/ref/WeakReference;", "cachedViewTreeCompositionContext", "Landroid/os/IBinder;", "value", "b", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "Lm2/u;", "Lm2/u;", "composition", "Lm2/v;", "setParentContext", "parentContext", "Landroidx/compose/ui/platform/e1;", "getComposeViewContext$ui", "setComposeViewContext$ui", "(Landroidx/compose/ui/platform/e1;)V", "getComposeViewContext$ui$annotations", "composeViewContext", "Lkotlin/Function0;", "Ler/a;", "getDisposeViewCompositionStrategy$annotations", "disposeViewCompositionStrategy", "Z", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", "creatingComposition", "isTransitionGroupSet", "l", "(Lm2/v;)Z", "isAlive", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "Landroidx/compose/ui/platform/v0;", "getAutoClearFocusBehavior-4UtRPd4", "()I", "setAutoClearFocusBehavior-17tfJxM", "autoClearFocusBehavior", "getHasComposition", "hasComposition", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private WeakReference<p076m2.v> cachedViewTreeCompositionContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private IBinder previousAttachedWindowToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private p076m2.u composition;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private p076m2.v parentContext;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private e1 composeViewContext;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private er.a<oq.i0> disposeViewCompositionStrategy;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean showLayoutBounds;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean creatingComposition;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isTransitionGroupSet;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "(Lm2/r;I)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.p<p076m2.r, Integer, oq.i0> {
        a() {
            super(2);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ oq.i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return oq.i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            if (!rVar.r((i15 & 3) != 2, i15 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1003123809, i15, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous>.<anonymous> (ComposeView.android.kt:340)");
            }
            b.this.c(rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final void d() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.composeViewContext == null) {
                AndroidComposeView androidComposeView = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof AndroidComposeView) {
                        androidComposeView = (AndroidComposeView) childAt;
                    }
                }
                if (androidComposeView != null) {
                    androidComposeView.setComposeViewContext(p(f1.d(this), androidComposeView.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                i();
            }
        }
    }

    private final p076m2.v e(p076m2.v vVar) {
        p076m2.v vVar2 = l(vVar) ? vVar : null;
        if (vVar2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(vVar2);
        }
        return vVar;
    }

    private final void f() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void i() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    e1 e1VarN = this.composeViewContext;
                    if (e1VarN == null) {
                        e1VarN = n();
                    }
                    this.composition = w3.b(this, e1VarN, y2.m.b(1003123809, true, new a()));
                    oq.i0 i0Var = oq.i0.f148189a;
                    Trace.endSection();
                    this.creatingComposition = false;
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            } catch (Throwable th5) {
                this.creatingComposition = false;
                throw th5;
            }
        }
    }

    private final boolean l(p076m2.v vVar) {
        return !(vVar instanceof p4) || ((p4) vVar).u0().getValue().compareTo(p4.d.ShuttingDown) > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(b bVar) {
        bVar.d();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    private final e1 n() {
        e1 composeViewContext;
        androidx.p016lifecycle.y0 viewModelStoreOwner;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
            if (androidComposeView != null) {
                composeViewContext = androidComposeView.getComposeViewContext();
            } else {
                composeViewContext = null;
            }
        }
        View viewD = f1.d(this);
        e1 e1VarF = f1.f(viewD);
        if (e1VarF != null) {
            return p(viewD, e1VarF);
        }
        p076m2.v vVarO = o();
        androidx.p016lifecycle.q qVarA = C6451z0.a(viewD);
        if (qVarA == null) {
            qVarA = composeViewContext != null ? composeViewContext.getLifecycleOwner() : null;
            if (qVarA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
        }
        androidx.p016lifecycle.q qVar = qVarA;
        ua.j jVarA = ua.n.a(viewD);
        if (jVarA == null) {
            jVarA = composeViewContext != null ? composeViewContext.getSavedStateRegistryOwner() : null;
            if (jVarA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
            }
        }
        ua.j jVar = jVarA;
        androidx.p016lifecycle.y0 y0VarA = androidx.p016lifecycle.View.a(viewD);
        if (y0VarA == null) {
            viewModelStoreOwner = composeViewContext != null ? composeViewContext.getViewModelStoreOwner() : null;
        } else {
            viewModelStoreOwner = y0VarA;
        }
        e1 e1Var = new e1(viewD, vVarO, qVar, jVar, viewModelStoreOwner);
        f1.g(viewD, e1Var);
        return e1Var;
    }

    private final p076m2.v o() {
        p076m2.v vVar;
        p076m2.v vVarE = this.parentContext;
        if (vVarE == null) {
            p076m2.v vVarE2 = s3.e(this);
            p076m2.v vVar2 = null;
            vVarE = vVarE2 != null ? e(vVarE2) : null;
            if (vVarE == null) {
                WeakReference<p076m2.v> weakReference = this.cachedViewTreeCompositionContext;
                if (weakReference != null && (vVar = weakReference.get()) != null && l(vVar)) {
                    vVar2 = vVar;
                }
                return vVar2 == null ? e(s3.i(this)) : vVar2;
            }
        }
        return vVarE;
    }

    private final e1 p(View contextView, e1 existingContext) {
        p076m2.v vVarO = o();
        androidx.p016lifecycle.q qVarA = C6451z0.a(contextView);
        androidx.p016lifecycle.y0 y0VarA = androidx.p016lifecycle.View.a(contextView);
        ua.j jVarA = ua.n.a(contextView);
        if (vVarO == existingContext.getCompositionContext() && qVarA == existingContext.getLifecycleOwner() && y0VarA == existingContext.getViewModelStoreOwner() && jVarA == existingContext.getSavedStateRegistryOwner()) {
            return existingContext;
        }
        if (vVarO.getEffectCoroutineContext() != existingContext.getCompositionContext().getEffectCoroutineContext()) {
            h();
        }
        if (qVarA == null) {
            qVarA = existingContext.getLifecycleOwner();
        }
        androidx.p016lifecycle.q qVar = qVarA;
        if (jVarA == null) {
            jVarA = existingContext.getSavedStateRegistryOwner();
        }
        e1 e1VarB = existingContext.b(contextView, vVarO, qVar, jVarA, y0VarA);
        f1.g(contextView, e1VarB);
        return e1VarB;
    }

    private final void setParentContext(p076m2.v vVar) {
        if (this.parentContext != vVar) {
            this.parentContext = vVar;
            if (vVar != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            p076m2.u uVar = this.composition;
            if (uVar != null) {
                uVar.j();
                this.composition = null;
                if (isAttachedToWindow()) {
                    i();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child) {
        f();
        super.addView(child);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params) {
        f();
        return super.addViewInLayout(child, index, params);
    }

    public abstract void c(p076m2.r rVar, int i15);

    public final void g() {
        e1 e1Var;
        View view;
        if (this.parentContext == null && !isAttachedToWindow() && ((e1Var = this.composeViewContext) == null || e1Var == null || (view = e1Var.getView()) == null || !view.isAttachedToWindow())) {
            throw new IllegalStateException("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
        i();
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m25getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(f3.p.I);
        v0 v0Var = tag instanceof v0 ? (v0) tag : null;
        return v0Var != null ? v0Var.getValue() : v0.INSTANCE.b();
    }

    /* JADX INFO: renamed from: getComposeViewContext$ui, reason: from getter */
    public final e1 getComposeViewContext() {
        return this.composeViewContext;
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public final void h() {
        View childAt = getChildAt(0);
        AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
        if (androidComposeView != null) {
            androidComposeView.i1();
        }
        p076m2.u uVar = this.composition;
        if (uVar != null) {
            uVar.j();
        }
        this.composition = null;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    public void j(boolean changed, int left, int top, int right, int bottom) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (right - left) - getPaddingRight(), (bottom - top) - getPaddingBottom());
        }
    }

    public void k(int widthMeasureSpec, int heightMeasureSpec) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(widthMeasureSpec)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(heightMeasureSpec) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(heightMeasureSpec)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (s3.h(this).getParent() == null) {
            getHandler().postAtFrontOfQueue(new Runnable() { // from class: androidx.compose.ui.platform.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.m(this.f10390a);
                }
            });
        } else {
            d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean changed, int left, int top, int right, int bottom) {
        j(changed, left, top, right, bottom);
    }

    @Override // android.view.View
    protected final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        i();
        k(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(layoutDirection);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m26setAutoClearFocusBehavior17tfJxM(int i15) {
        setTag(f3.p.I, v0.b(i15));
    }

    public final void setComposeViewContext$ui(e1 e1Var) {
        if (this.composeViewContext != e1Var) {
            if (e1Var == null) {
                h();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
                if (androidComposeView != null) {
                    if (androidComposeView.getCoroutineContext() != e1Var.getCompositionContext().getEffectCoroutineContext()) {
                        h();
                    }
                    androidComposeView.setComposeViewContext(e1Var);
                }
            }
            this.composeViewContext = e1Var;
        }
    }

    public final void setParentCompositionContext(p076m2.v parent) {
        setParentContext(parent);
    }

    public final void setShowLayoutBounds(boolean z15) {
        this.showLayoutBounds = z15;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z15);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean isTransitionGroup) {
        super.setTransitionGroup(isTransitionGroup);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(b3 strategy) {
        er.a<oq.i0> aVar = this.disposeViewCompositionStrategy;
        if (aVar != null) {
            aVar.a();
        }
        this.disposeViewCompositionStrategy = strategy.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public b(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.disposeViewCompositionStrategy = b3.INSTANCE.a().a(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        f();
        super.addView(child, index);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params, boolean preventRequestLayout) {
        f();
        return super.addViewInLayout(child, index, params, preventRequestLayout);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int width, int height) {
        f();
        super.addView(child, width, height);
    }

    public /* synthetic */ b(Context context, AttributeSet attributeSet, int i15, int i16, fr.k kVar) {
        this(context, (i16 & 2) != 0 ? null : attributeSet, (i16 & 4) != 0 ? 0 : i15);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        f();
        super.addView(child, params);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        f();
        super.addView(child, index, params);
    }
}
