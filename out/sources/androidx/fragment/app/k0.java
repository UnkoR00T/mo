package androidx.fragment.app;

import CON.BackEventCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0011\b \u0018\u0000 \u00132\u00020\u0001:\u0004=A25B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b'\u0010&J\u0015\u0010(\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b(\u0010&J\u0015\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u0017¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0012¢\u0006\u0004\b,\u0010\u001cJ\r\u0010-\u001a\u00020\u0017¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0012¢\u0006\u0004\b/\u0010\u001cJ\r\u00100\u001a\u00020\u0012¢\u0006\u0004\b0\u0010\u001cJ\u0017\u00102\u001a\u00020\u00122\u0006\u00101\u001a\u00020\bH\u0000¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u0012¢\u0006\u0004\b4\u0010\u001cJ%\u00105\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001d2\u0006\u0010)\u001a\u00020\u0017H&¢\u0006\u0004\b5\u00106J\u001d\u00107\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001dH\u0010¢\u0006\u0004\b7\u0010 J\u0015\u0010:\u001a\u00020\u00122\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0012¢\u0006\u0004\b<\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010BR\u0016\u0010F\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010ER\u0016\u0010G\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010ER\u0016\u0010H\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010E¨\u0006I"}, d2 = {"Landroidx/fragment/app/k0;", "", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "Landroidx/fragment/app/o;", "fragment", "Landroidx/fragment/app/k0$d;", "o", "(Landroidx/fragment/app/o;)Landroidx/fragment/app/k0$d;", "p", "Landroidx/fragment/app/k0$d$b;", "finalState", "Landroidx/fragment/app/k0$d$a;", "lifecycleImpact", "Landroidx/fragment/app/a0;", "fragmentStateManager", "Loq/i0;", "g", "(Landroidx/fragment/app/k0$d$b;Landroidx/fragment/app/k0$d$a;Landroidx/fragment/app/a0;)V", "", "newPendingOperations", "", "x", "(Ljava/util/List;)Z", "w", "C", "()V", "", "operations", "B", "(Ljava/util/List;)V", "s", "(Landroidx/fragment/app/a0;)Landroidx/fragment/app/k0$d$a;", "j", "(Landroidx/fragment/app/k0$d$b;Landroidx/fragment/app/a0;)V", "m", "(Landroidx/fragment/app/a0;)V", "k", "l", "isPop", ip.a.f96138c, "(Z)V", "z", "y", "()Z", "r", "n", "operation", "c", "(Landroidx/fragment/app/k0$d;)V", "q", "d", "(Ljava/util/List;Z)V", "e", "LCON/b;", "backEvent", "A", "(LCON/b;)V", "f", "a", "Landroid/view/ViewGroup;", "t", "()Landroid/view/ViewGroup;", "b", "Ljava/util/List;", "pendingOperations", "runningOperations", "Z", "runningNonSeekableTransition", "operationDirectionIsPop", "isContainerPostponed", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class k0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ViewGroup container;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<d> pendingOperations = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<d> runningOperations = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean runningNonSeekableTransition;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean operationDirectionIsPop;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isContainerPostponed;

    /* JADX INFO: renamed from: androidx.fragment.app.k0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/k0$a;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/fragment/app/k0;", "a", "(Landroid/view/ViewGroup;Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/k0;", "Landroidx/fragment/app/l0;", "factory", "b", "(Landroid/view/ViewGroup;Landroidx/fragment/app/l0;)Landroidx/fragment/app/k0;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final k0 a(ViewGroup container, FragmentManager fragmentManager) {
            return b(container, fragmentManager.D0());
        }

        public final k0 b(ViewGroup container, l0 factory) {
            Object tag = container.getTag(d7.b.f40109b);
            if (tag instanceof k0) {
                return (k0) tag;
            }
            k0 k0VarA = factory.a(container);
            container.setTag(d7.b.f40109b, k0VarA);
            return k0VarA;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0018"}, d2 = {"Landroidx/fragment/app/k0$b;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "Loq/i0;", "g", "(Landroid/view/ViewGroup;)V", "f", "LCON/b;", "backEvent", "e", "(LCON/b;Landroid/view/ViewGroup;)V", "d", "a", "c", "", "Z", "b", "()Z", "isSeekingSupported", "isStarted", "isCancelled", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean isSeekingSupported;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean isStarted;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean isCancelled;

        public final void a(ViewGroup container) {
            if (!this.isCancelled) {
                c(container);
            }
            this.isCancelled = true;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getIsSeekingSupported() {
            return this.isSeekingSupported;
        }

        public void c(ViewGroup container) {
        }

        public void d(ViewGroup container) {
        }

        public void e(BackEventCompat backEvent, ViewGroup container) {
        }

        public void f(ViewGroup container) {
        }

        public final void g(ViewGroup container) {
            if (!this.isStarted) {
                f(container);
            }
            this.isStarted = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/fragment/app/k0$c;", "Landroidx/fragment/app/k0$d;", "Landroidx/fragment/app/k0$d$b;", "finalState", "Landroidx/fragment/app/k0$d$a;", "lifecycleImpact", "Landroidx/fragment/app/a0;", "fragmentStateManager", "<init>", "(Landroidx/fragment/app/k0$d$b;Landroidx/fragment/app/k0$d$a;Landroidx/fragment/app/a0;)V", "Loq/i0;", "p", "()V", "d", "l", "Landroidx/fragment/app/a0;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class c extends d {

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final a0 fragmentStateManager;

        public c(d.b bVar, d.a aVar, a0 a0Var) {
            super(bVar, aVar, a0Var.k());
            this.fragmentStateManager = a0Var;
        }

        @Override // androidx.fragment.app.k0.d
        public void d() {
            super.d();
            getFragment().f12603p = false;
            this.fragmentStateManager.m();
        }

        @Override // androidx.fragment.app.k0.d
        public void p() {
            if (getIsStarted()) {
                return;
            }
            super.p();
            if (getLifecycleImpact() != d.a.ADDING) {
                if (getLifecycleImpact() == d.a.REMOVING) {
                    o oVarK = this.fragmentStateManager.k();
                    View viewA1 = oVarK.A1();
                    if (FragmentManager.L0(2)) {
                        Objects.toString(viewA1.findFocus());
                        viewA1.toString();
                        oVarK.toString();
                    }
                    viewA1.clearFocus();
                    return;
                }
                return;
            }
            o oVarK2 = this.fragmentStateManager.k();
            View viewFindFocus = oVarK2.R.findFocus();
            if (viewFindFocus != null) {
                oVarK2.G1(viewFindFocus);
                if (FragmentManager.L0(2)) {
                    viewFindFocus.toString();
                    oVarK2.toString();
                }
            }
            View viewA2 = getFragment().A1();
            if (viewA2.getParent() == null) {
                if (FragmentManager.L0(2)) {
                    oVarK2.toString();
                    viewA2.toString();
                }
                this.fragmentStateManager.b();
                viewA2.setAlpha(0.0f);
            }
            if (viewA2.getAlpha() == 0.0f && viewA2.getVisibility() == 0) {
                if (FragmentManager.L0(2)) {
                    viewA2.toString();
                }
                viewA2.setVisibility(4);
            }
            viewA2.setAlpha(oVarK2.R());
            if (FragmentManager.L0(2)) {
                oVarK2.R();
            }
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0002\u0016\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0011¢\u0006\u0004\b\u001f\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010.R$\u00105\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\b3\u00104R$\u00108\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00104R*\u0010<\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u0010;R$\u0010>\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b=\u00104R\"\u0010A\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u00102\u001a\u0004\b?\u00104\"\u0004\b@\u0010;R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00180-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010.R \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00180C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b6\u0010D¨\u0006F"}, d2 = {"Landroidx/fragment/app/k0$d;", "", "Landroidx/fragment/app/k0$d$b;", "finalState", "Landroidx/fragment/app/k0$d$a;", "lifecycleImpact", "Landroidx/fragment/app/o;", "fragment", "<init>", "(Landroidx/fragment/app/k0$d$b;Landroidx/fragment/app/k0$d$a;Landroidx/fragment/app/o;)V", "", "toString", "()Ljava/lang/String;", "Landroid/view/ViewGroup;", "container", "Loq/i0;", "c", "(Landroid/view/ViewGroup;)V", "o", "(Landroidx/fragment/app/k0$d$b;Landroidx/fragment/app/k0$d$a;)V", "Ljava/lang/Runnable;", "listener", "a", "(Ljava/lang/Runnable;)V", "Landroidx/fragment/app/k0$b;", "effect", "b", "(Landroidx/fragment/app/k0$b;)V", "e", "p", "()V", "d", "Landroidx/fragment/app/k0$d$b;", "g", "()Landroidx/fragment/app/k0$d$b;", "setFinalState", "(Landroidx/fragment/app/k0$d$b;)V", "Landroidx/fragment/app/k0$d$a;", "i", "()Landroidx/fragment/app/k0$d$a;", "setLifecycleImpact", "(Landroidx/fragment/app/k0$d$a;)V", "Landroidx/fragment/app/o;", "h", "()Landroidx/fragment/app/o;", "", "Ljava/util/List;", "completionListeners", "", "<set-?>", "Z", "k", "()Z", "isCanceled", "f", "l", "isComplete", "m", "r", "(Z)V", "isSeeking", "n", "isStarted", "j", "q", "isAwaitingContainerChanges", "_effects", "", "()Ljava/util/List;", "effects", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private b finalState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private a lifecycleImpact;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final o fragment;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean isCanceled;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean isComplete;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean isSeeking;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean isStarted;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final List<b> _effects;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final List<b> effects;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<Runnable> completionListeners = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean isAwaitingContainerChanges = true;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/fragment/app/k0$d$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\t¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/k0$d$b;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "container", "Loq/i0;", "e", "(Landroid/view/View;Landroid/view/ViewGroup;)V", "a", "b", "c", "d", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: androidx.fragment.app.k0$d$b$a, reason: from kotlin metadata */
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/fragment/app/k0$d$b$a;", "", "<init>", "()V", "Landroid/view/View;", "Landroidx/fragment/app/k0$d$b;", "a", "(Landroid/view/View;)Landroidx/fragment/app/k0$d$b;", "", "visibility", "b", "(I)Landroidx/fragment/app/k0$d$b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(fr.k kVar) {
                    this();
                }

                public final b a(View view) {
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int visibility) {
                    if (visibility == 0) {
                        return b.VISIBLE;
                    }
                    if (visibility == 4) {
                        return b.INVISIBLE;
                    }
                    if (visibility == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                }

                private Companion() {
                }
            }

            /* JADX INFO: renamed from: androidx.fragment.app.k0$d$b$b, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class C0264b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f12577a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f12577a = iArr;
                }
            }

            public static final b g(int i15) {
                return INSTANCE.b(i15);
            }

            public final void e(View view, ViewGroup container) {
                FragmentManager.L0(2);
                int i15 = C0264b.f12577a[ordinal()];
                if (i15 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.L0(2)) {
                            view.toString();
                            viewGroup.toString();
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i15 == 2) {
                    if (FragmentManager.L0(2)) {
                        Objects.toString(view);
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (FragmentManager.L0(2)) {
                            view.toString();
                            Objects.toString(container);
                        }
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i15 == 3) {
                    if (FragmentManager.L0(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(8);
                } else {
                    if (i15 != 4) {
                        return;
                    }
                    if (FragmentManager.L0(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(4);
                }
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f12578a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f12578a = iArr;
            }
        }

        public d(b bVar, a aVar, o oVar) {
            this.finalState = bVar;
            this.lifecycleImpact = aVar;
            this.fragment = oVar;
            ArrayList arrayList = new ArrayList();
            this._effects = arrayList;
            this.effects = arrayList;
        }

        public final void a(Runnable listener) {
            this.completionListeners.add(listener);
        }

        public final void b(b effect) {
            this._effects.add(effect);
        }

        public final void c(ViewGroup container) {
            this.isStarted = false;
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            if (this._effects.isEmpty()) {
                d();
                return;
            }
            Iterator it = pq.v.f1(this.effects).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(container);
            }
        }

        public void d() {
            this.isStarted = false;
            if (this.isComplete) {
                return;
            }
            if (FragmentManager.L0(2)) {
                toString();
            }
            this.isComplete = true;
            Iterator<T> it = this.completionListeners.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void e(b effect) {
            if (this._effects.remove(effect) && this._effects.isEmpty()) {
                d();
            }
        }

        public final List<b> f() {
            return this.effects;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final b getFinalState() {
            return this.finalState;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final o getFragment() {
            return this.fragment;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final a getLifecycleImpact() {
            return this.lifecycleImpact;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getIsAwaitingContainerChanges() {
            return this.isAwaitingContainerChanges;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getIsCanceled() {
            return this.isCanceled;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getIsSeeking() {
            return this.isSeeking;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final boolean getIsStarted() {
            return this.isStarted;
        }

        public final void o(b finalState, a lifecycleImpact) {
            int i15 = c.f12578a[lifecycleImpact.ordinal()];
            if (i15 == 1) {
                if (this.finalState == b.REMOVED) {
                    if (FragmentManager.L0(2)) {
                        Objects.toString(this.fragment);
                        Objects.toString(this.lifecycleImpact);
                    }
                    this.finalState = b.VISIBLE;
                    this.lifecycleImpact = a.ADDING;
                    this.isAwaitingContainerChanges = true;
                    return;
                }
                return;
            }
            if (i15 == 2) {
                if (FragmentManager.L0(2)) {
                    Objects.toString(this.fragment);
                    Objects.toString(this.finalState);
                    Objects.toString(this.lifecycleImpact);
                }
                this.finalState = b.REMOVED;
                this.lifecycleImpact = a.REMOVING;
                this.isAwaitingContainerChanges = true;
                return;
            }
            if (i15 == 3 && this.finalState != b.REMOVED) {
                if (FragmentManager.L0(2)) {
                    Objects.toString(this.fragment);
                    Objects.toString(this.finalState);
                    Objects.toString(finalState);
                }
                this.finalState = finalState;
            }
        }

        public void p() {
            this.isStarted = true;
        }

        public final void q(boolean z15) {
            this.isAwaitingContainerChanges = z15;
        }

        public final void r(boolean z15) {
            this.isSeeking = z15;
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.finalState + " lifecycleImpact = " + this.lifecycleImpact + " fragment = " + this.fragment + '}';
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12579a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f12579a = iArr;
        }
    }

    public k0(ViewGroup viewGroup) {
        this.container = viewGroup;
    }

    private final void B(List<d> operations) {
        int size = operations.size();
        for (int i15 = 0; i15 < size; i15++) {
            operations.get(i15).p();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = operations.iterator();
        while (it.hasNext()) {
            pq.v.D(arrayList, ((d) it.next()).f());
        }
        List listF1 = pq.v.f1(pq.v.k1(arrayList));
        int size2 = listF1.size();
        for (int i16 = 0; i16 < size2; i16++) {
            ((b) listF1.get(i16)).g(this.container);
        }
    }

    private final void C() {
        for (d dVar : this.pendingOperations) {
            if (dVar.getLifecycleImpact() == d.a.ADDING) {
                dVar.o(d.b.INSTANCE.b(dVar.getFragment().A1().getVisibility()), d.a.NONE);
            }
        }
    }

    private final void g(d.b finalState, d.a lifecycleImpact, a0 fragmentStateManager) {
        synchronized (this.pendingOperations) {
            try {
                d dVarO = o(fragmentStateManager.k());
                if (dVarO == null) {
                    dVarO = (fragmentStateManager.k().f12603p || fragmentStateManager.k().f12602n) ? p(fragmentStateManager.k()) : null;
                }
                if (dVarO != null) {
                    dVarO.o(finalState, lifecycleImpact);
                    return;
                }
                final c cVar = new c(finalState, lifecycleImpact, fragmentStateManager);
                this.pendingOperations.add(cVar);
                cVar.a(new Runnable() { // from class: androidx.fragment.app.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        k0.h(this.f12537a, cVar);
                    }
                });
                cVar.a(new Runnable() { // from class: androidx.fragment.app.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        k0.i(this.f12542a, cVar);
                    }
                });
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(k0 k0Var, c cVar) {
        if (k0Var.pendingOperations.contains(cVar)) {
            cVar.getFinalState().e(cVar.getFragment().R, k0Var.container);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(k0 k0Var, c cVar) {
        k0Var.pendingOperations.remove(cVar);
        k0Var.runningOperations.remove(cVar);
    }

    private final d o(o fragment) {
        Object next;
        Iterator<T> it = this.pendingOperations.iterator();
        while (it.hasNext()) {
            next = it.next();
            d dVar = (d) next;
            if (fr.t.c(dVar.getFragment(), fragment) && !dVar.getIsCanceled()) {
                return (d) next;
            }
        }
        next = null;
        return (d) next;
    }

    private final d p(o fragment) {
        Object next;
        Iterator<T> it = this.runningOperations.iterator();
        while (it.hasNext()) {
            next = it.next();
            d dVar = (d) next;
            if (fr.t.c(dVar.getFragment(), fragment) && !dVar.getIsCanceled()) {
                return (d) next;
            }
        }
        next = null;
        return (d) next;
    }

    public static final k0 u(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return INSTANCE.a(viewGroup, fragmentManager);
    }

    public static final k0 v(ViewGroup viewGroup, l0 l0Var) {
        return INSTANCE.b(viewGroup, l0Var);
    }

    private final boolean w(List<d> newPendingOperations) {
        boolean z15;
        List<d> list = newPendingOperations;
        Iterator<T> it = list.iterator();
        loop0: while (true) {
            z15 = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                d dVar = (d) it.next();
                if (!dVar.f().isEmpty()) {
                    List<b> listF = dVar.f();
                    if (!(listF instanceof Collection) || !listF.isEmpty()) {
                        Iterator<T> it4 = listF.iterator();
                        do {
                            if (!it4.hasNext()) {
                                break;
                            }
                        } while (((b) it4.next()).getIsSeekingSupported());
                    } else {
                        break;
                    }
                }
                z15 = false;
            }
        }
        if (z15) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it5 = list.iterator();
            while (it5.hasNext()) {
                pq.v.D(arrayList, ((d) it5.next()).f());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final boolean x(List<d> newPendingOperations) {
        Iterator<T> it = newPendingOperations.iterator();
        boolean z15 = true;
        while (it.hasNext()) {
            if (!((d) it.next()).getFragment().f12603p) {
                z15 = false;
            }
        }
        return z15;
    }

    public final void A(BackEventCompat backEvent) {
        if (FragmentManager.L0(2)) {
            backEvent.getProgress();
        }
        List<d> list = this.runningOperations;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            pq.v.D(arrayList, ((d) it.next()).f());
        }
        List listF1 = pq.v.f1(pq.v.k1(arrayList));
        int size = listF1.size();
        for (int i15 = 0; i15 < size; i15++) {
            ((b) listF1.get(i15)).e(backEvent, this.container);
        }
    }

    public final void D(boolean isPop) {
        this.operationDirectionIsPop = isPop;
    }

    public final void c(d operation) {
        if (operation.getIsAwaitingContainerChanges()) {
            operation.getFinalState().e(operation.getFragment().A1(), this.container);
            operation.q(false);
        }
    }

    public abstract void d(List<d> operations, boolean isPop);

    public void e(List<d> operations) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = operations.iterator();
        while (it.hasNext()) {
            pq.v.D(arrayList, ((d) it.next()).f());
        }
        List listF1 = pq.v.f1(pq.v.k1(arrayList));
        int size = listF1.size();
        for (int i15 = 0; i15 < size; i15++) {
            ((b) listF1.get(i15)).d(this.container);
        }
        int size2 = operations.size();
        for (int i16 = 0; i16 < size2; i16++) {
            c(operations.get(i16));
        }
        List listF2 = pq.v.f1(operations);
        int size3 = listF2.size();
        for (int i17 = 0; i17 < size3; i17++) {
            d dVar = (d) listF2.get(i17);
            if (dVar.f().isEmpty()) {
                dVar.d();
            }
        }
    }

    public final void f() {
        FragmentManager.L0(3);
        B(this.runningOperations);
        e(this.runningOperations);
    }

    public final void j(d.b finalState, a0 fragmentStateManager) {
        if (FragmentManager.L0(2)) {
            Objects.toString(fragmentStateManager.k());
        }
        g(finalState, d.a.ADDING, fragmentStateManager);
    }

    public final void k(a0 fragmentStateManager) {
        if (FragmentManager.L0(2)) {
            Objects.toString(fragmentStateManager.k());
        }
        g(d.b.GONE, d.a.NONE, fragmentStateManager);
    }

    public final void l(a0 fragmentStateManager) {
        if (FragmentManager.L0(2)) {
            Objects.toString(fragmentStateManager.k());
        }
        g(d.b.REMOVED, d.a.REMOVING, fragmentStateManager);
    }

    public final void m(a0 fragmentStateManager) {
        if (FragmentManager.L0(2)) {
            Objects.toString(fragmentStateManager.k());
        }
        g(d.b.VISIBLE, d.a.NONE, fragmentStateManager);
    }

    public final void n() {
        boolean z15;
        if (this.isContainerPostponed) {
            return;
        }
        if (!this.container.isAttachedToWindow()) {
            q();
            this.operationDirectionIsPop = false;
            return;
        }
        synchronized (this.pendingOperations) {
            try {
                List<d> listI1 = pq.v.i1(this.runningOperations);
                this.runningOperations.clear();
                Iterator it = listI1.iterator();
                while (true) {
                    z15 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    d dVar = (d) it.next();
                    if (this.pendingOperations.isEmpty() || !dVar.getFragment().f12603p) {
                        z15 = false;
                    }
                    dVar.r(z15);
                }
                for (d dVar2 : listI1) {
                    if (this.runningNonSeekableTransition) {
                        if (FragmentManager.L0(2)) {
                            Objects.toString(dVar2);
                        }
                        dVar2.d();
                    } else {
                        if (FragmentManager.L0(2)) {
                            Objects.toString(dVar2);
                        }
                        dVar2.c(this.container);
                    }
                    this.runningNonSeekableTransition = false;
                    if (!dVar2.getIsComplete()) {
                        this.runningOperations.add(dVar2);
                    }
                }
                if (!this.pendingOperations.isEmpty()) {
                    C();
                    List<d> listI2 = pq.v.i1(this.pendingOperations);
                    if (listI2.isEmpty()) {
                        return;
                    }
                    this.pendingOperations.clear();
                    this.runningOperations.addAll(listI2);
                    FragmentManager.L0(2);
                    d(listI2, this.operationDirectionIsPop);
                    boolean zW = w(listI2);
                    boolean zX = x(listI2);
                    if (!zX || zW) {
                        z15 = false;
                    }
                    this.runningNonSeekableTransition = z15;
                    FragmentManager.L0(2);
                    if (!zX) {
                        B(listI2);
                        e(listI2);
                    } else if (zW) {
                        B(listI2);
                        int size = listI2.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            c(listI2.get(i15));
                        }
                    }
                    this.operationDirectionIsPop = false;
                    FragmentManager.L0(2);
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void q() {
        FragmentManager.L0(2);
        boolean zIsAttachedToWindow = this.container.isAttachedToWindow();
        synchronized (this.pendingOperations) {
            try {
                C();
                B(this.pendingOperations);
                List<d> listI1 = pq.v.i1(this.runningOperations);
                Iterator it = listI1.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).r(false);
                }
                for (d dVar : listI1) {
                    if (FragmentManager.L0(2)) {
                        if (!zIsAttachedToWindow) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Container ");
                            sb5.append(this.container);
                            sb5.append(" is not attached to window. ");
                        }
                        Objects.toString(dVar);
                    }
                    dVar.c(this.container);
                }
                List<d> listI2 = pq.v.i1(this.pendingOperations);
                Iterator it4 = listI2.iterator();
                while (it4.hasNext()) {
                    ((d) it4.next()).r(false);
                }
                for (d dVar2 : listI2) {
                    if (FragmentManager.L0(2)) {
                        if (!zIsAttachedToWindow) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("Container ");
                            sb6.append(this.container);
                            sb6.append(" is not attached to window. ");
                        }
                        Objects.toString(dVar2);
                    }
                    dVar2.c(this.container);
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void r() {
        if (this.isContainerPostponed) {
            FragmentManager.L0(2);
            this.isContainerPostponed = false;
            n();
        }
    }

    public final d.a s(a0 fragmentStateManager) {
        o oVarK = fragmentStateManager.k();
        d dVarO = o(oVarK);
        d.a lifecycleImpact = dVarO != null ? dVarO.getLifecycleImpact() : null;
        d dVarP = p(oVarK);
        d.a lifecycleImpact2 = dVarP != null ? dVarP.getLifecycleImpact() : null;
        int i15 = lifecycleImpact == null ? -1 : e.f12579a[lifecycleImpact.ordinal()];
        return (i15 == -1 || i15 == 1) ? lifecycleImpact2 : lifecycleImpact;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final ViewGroup getContainer() {
        return this.container;
    }

    public final boolean y() {
        return !this.pendingOperations.isEmpty();
    }

    public final void z() {
        d dVarPrevious;
        synchronized (this.pendingOperations) {
            try {
                C();
                List<d> list = this.pendingOperations;
                ListIterator<d> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        dVarPrevious = null;
                        break;
                    }
                    dVarPrevious = listIterator.previous();
                    d dVar = dVarPrevious;
                    d.b bVarA = d.b.INSTANCE.a(dVar.getFragment().R);
                    d.b finalState = dVar.getFinalState();
                    d.b bVar = d.b.VISIBLE;
                    if (finalState == bVar && bVarA != bVar) {
                        break;
                    }
                }
                d dVar2 = dVarPrevious;
                o fragment = dVar2 != null ? dVar2.getFragment() : null;
                this.isContainerPostponed = fragment != null ? fragment.m0() : false;
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
