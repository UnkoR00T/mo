package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.node.Owner;
import fr.t;
import fr.w;
import g4.s0;
import l3.p0;
import l3.r0;
import l3.s;
import l3.v;
import l3.z;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0005R$\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R#\u0010*\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0$8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R#\u0010-\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0$8\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)¨\u0006."}, d2 = {"Landroidx/compose/ui/viewinterop/j;", "Lf3/m$c;", "Ll3/z;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "<init>", "()V", "Ll3/p0;", "n3", "()Ll3/p0;", "Ll3/v;", "focusProperties", "Loq/i0;", "I0", "(Ll3/v;)V", "Landroid/view/View;", "oldFocus", "newFocus", "onGlobalFocusChanged", "(Landroid/view/View;Landroid/view/View;)V", "W2", "X2", "r", "Landroid/view/View;", "o3", "()Landroid/view/View;", "setFocusedChild", "(Landroid/view/View;)V", "focusedChild", "Landroid/view/ViewTreeObserver;", "s", "Landroid/view/ViewTreeObserver;", "getAttachedViewTreeObserver", "()Landroid/view/ViewTreeObserver;", "setAttachedViewTreeObserver", "(Landroid/view/ViewTreeObserver;)V", "attachedViewTreeObserver", "Lkotlin/Function1;", "Ll3/h;", "t", "Ler/l;", "getOnEnter", "()Ler/l;", "onEnter", "v", "getOnExit", "onExit", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class j extends f3.m.c implements z, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private View focusedChild;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private ViewTreeObserver attachedViewTreeObserver;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final er.l<l3.h, i0> onEnter = new a();

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final er.l<l3.h, i0> onExit = new b();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll3/h;", "Loq/i0;", "c", "(Ll3/h;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements er.l<l3.h, i0> {
        a() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(l3.h hVar) {
            c(hVar);
            return i0.f148189a;
        }

        public final void c(l3.h hVar) {
            View viewG = h.g(j.this);
            if (viewG.isFocused() || viewG.hasFocus()) {
                return;
            }
            if (l3.l.b(viewG, l3.l.c(hVar.getRequestedFocusDirection()), h.f(g4.h.t(j.this).getFocusOwner(), g4.i.a(j.this), viewG))) {
                return;
            }
            hVar.a();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll3/h;", "Loq/i0;", "c", "(Ll3/h;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends w implements er.l<l3.h, i0> {
        b() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(l3.h hVar) {
            c(hVar);
            return i0.f148189a;
        }

        public final void c(l3.h hVar) {
            View viewG = h.g(j.this);
            if (f3.h.isViewFocusFixEnabled) {
                if (viewG.hasFocus() || viewG.isFocused()) {
                    viewG.clearFocus();
                    return;
                }
                return;
            }
            if (f3.h.isBypassUnfocusableComposeViewEnabled || !viewG.hasFocus()) {
                return;
            }
            s focusOwner = g4.h.t(j.this).getFocusOwner();
            View viewA = g4.i.a(j.this);
            if (!(viewG instanceof ViewGroup)) {
                if (!viewA.requestFocus()) {
                    throw new IllegalStateException("host view did not take focus");
                }
                return;
            }
            Rect rectF = h.f(focusOwner, viewA, viewG);
            Integer numC = l3.l.c(hVar.getRequestedFocusDirection());
            int iIntValue = numC != null ? numC.intValue() : 130;
            FocusFinder focusFinder = FocusFinder.getInstance();
            j jVar = j.this;
            View viewFindNextFocus = jVar.getFocusedChild() != null ? focusFinder.findNextFocus((ViewGroup) viewA, jVar.getFocusedChild(), iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) viewA, rectF, iIntValue);
            if (viewFindNextFocus == null || !h.d(viewG, viewFindNextFocus)) {
                if (!viewA.requestFocus()) {
                    throw new IllegalStateException("host view did not take focus");
                }
            } else {
                viewFindNextFocus.requestFocus(iIntValue, rectF);
                hVar.a();
            }
        }
    }

    private final p0 n3() {
        boolean z15;
        int iA = s0.a(1024);
        if (!getNode().getIsAttached()) {
            d4.a.c("visitLocalDescendants called on an unattached node");
        }
        f3.m.c node = getNode();
        if ((node.getAggregateChildKindSet() & iA) != 0) {
            boolean z16 = false;
            for (f3.m.c child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iA) != 0) {
                    f3.m.c cVarL = child;
                    n2.c cVar = null;
                    while (cVarL != null) {
                        if (cVarL instanceof p0) {
                            p0 p0Var = (p0) cVarL;
                            if (z16) {
                                return p0Var;
                            }
                            z15 = false;
                            z16 = true;
                        } else {
                            z15 = true;
                        }
                        if (z15 && (cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                            int i15 = 0;
                            for (f3.m.c delegate = ((g4.j) cVarL).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & iA) != 0) {
                                    i15++;
                                    if (i15 == 1) {
                                        cVarL = delegate;
                                    } else {
                                        if (cVar == null) {
                                            cVar = new n2.c(new f3.m.c[16], 0);
                                        }
                                        if (cVarL != null) {
                                            cVar.d(cVarL);
                                            cVarL = null;
                                        }
                                        cVar.d(delegate);
                                    }
                                }
                            }
                            if (i15 == 1) {
                            }
                        }
                        cVarL = g4.h.l(cVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // l3.z
    public void I0(v focusProperties) {
        focusProperties.j(false);
        focusProperties.k(this.onEnter);
        focusProperties.s(this.onExit);
    }

    @Override // f3.m.c
    public void W2() {
        super.W2();
        ViewTreeObserver viewTreeObserver = g4.i.a(this).getViewTreeObserver();
        this.attachedViewTreeObserver = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // f3.m.c
    public void X2() {
        ViewTreeObserver viewTreeObserver = this.attachedViewTreeObserver;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.attachedViewTreeObserver = null;
        g4.i.a(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.focusedChild = null;
        super.X2();
    }

    /* JADX INFO: renamed from: o3, reason: from getter */
    public final View getFocusedChild() {
        return this.focusedChild;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View oldFocus, View newFocus) {
        if (g4.h.s(this).getOwner() == null) {
            return;
        }
        View viewG = h.g(this);
        s focusOwner = g4.h.t(this).getFocusOwner();
        Owner ownerT = g4.h.t(this);
        boolean z15 = (oldFocus == null || t.c(oldFocus, ownerT) || !h.d(viewG, oldFocus)) ? false : true;
        boolean z16 = (newFocus == null || t.c(newFocus, ownerT) || !h.d(viewG, newFocus)) ? false : true;
        if (z15 && z16) {
            this.focusedChild = newFocus;
            return;
        }
        if (z16) {
            this.focusedChild = newFocus;
            p0 p0VarN3 = n3();
            if (p0VarN3.d0().e()) {
                return;
            }
            r0.i(p0VarN3);
            return;
        }
        if (!z15) {
            this.focusedChild = null;
            return;
        }
        this.focusedChild = null;
        if (n3().d0().b()) {
            focusOwner.v(false, true, false, l3.g.INSTANCE.c());
        }
    }
}
