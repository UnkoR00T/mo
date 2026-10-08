package pz;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.p016lifecycle.DefaultLifecycleObserver;
import androidx.p016lifecycle.j;
import androidx.p016lifecycle.q;
import er.l;
import er.p;
import eu.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import ju.g1;
import ju.i;
import ju.p0;
import mu.b0;
import mu.r0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.a0;
import u0.m;
import vq.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0017\u0014B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020/0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010-R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00068²\u0006\f\u00107\u001a\u00020\u001b8\nX\u008a\u0084\u0002"}, d2 = {"Lpz/g;", "Lox/a;", "Lpz/c;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "", "<init>", "()V", "Loq/i0;", "u", "LCON/p;", "activity", "e", "(LCON/p;)V", "Landroidx/lifecycle/q;", "owner", "onDestroy", "(Landroidx/lifecycle/q;)V", "f", "(Ltq/e;)Ljava/lang/Object;", "d", "b", "(Lm2/r;I)V", "Ljava/util/concurrent/atomic/AtomicInteger;", "a", "Ljava/util/concurrent/atomic/AtomicInteger;", "loaderCounter", "Lmu/b0;", "", "Lmu/b0;", "loaderVisible", "c", "Landroidx/lifecycle/q;", "lifecycleOwner", "Landroid/view/Window;", "Landroid/view/Window;", "window", "Landroid/view/ViewGroup;", "Landroid/view/ViewGroup;", "appViewGroup", "Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/ui/platform/ComposeView;", "loaderView", "", "Landroid/view/View;", "g", "Ljava/util/List;", "viewsToIgnore", "Lpz/g$a;", "h", "viewsBlockedByLoader", "", "j", "Ljava/lang/Integer;", "appViewGroupSavedFocusability", "k", "visible", "loader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements ox.a, pz.c, DefaultLifecycleObserver, ty.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f163276l = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private q lifecycleOwner;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Window window;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ViewGroup appViewGroup;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private ComposeView loaderView;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Integer appViewGroupSavedFocusability;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger loaderCounter = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b0<Boolean> loaderVisible = r0.a(Boolean.FALSE);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<View> viewsToIgnore = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<a> viewsBlockedByLoader = new ArrayList();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lpz/g$a;", "", "Landroid/view/View;", "view", "", "originalImportanceForAccessibility", "<init>", "(Landroid/view/View;I)V", "Loq/i0;", "a", "()V", "Landroid/view/View;", "b", "I", "loader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final View view;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int originalImportanceForAccessibility;

        public a(View view, int i15) {
            this.view = view;
            this.originalImportanceForAccessibility = i15;
        }

        public final void a() {
            this.view.setImportantForAccessibility(this.originalImportanceForAccessibility);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163288e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f163288e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (g.this.loaderCounter.decrementAndGet() <= 0) {
                px.f.f163100a.b("Unblocking views and hiding loader", px.c.a(g.this));
                Iterator it = g.this.viewsBlockedByLoader.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a();
                }
                g.this.viewsBlockedByLoader.clear();
                Integer num = g.this.appViewGroupSavedFocusability;
                if (num != null) {
                    g gVar = g.this;
                    int iIntValue = num.intValue();
                    ViewGroup viewGroup = gVar.appViewGroup;
                    if (viewGroup != null) {
                        viewGroup.setDescendantFocusability(iIntValue);
                    }
                }
                g.this.loaderVisible.setValue(vq.b.a(false));
                ComposeView composeView = g.this.loaderView;
                if (composeView != null) {
                    composeView.setFocusable(false);
                }
                ComposeView composeView2 = g.this.loaderView;
                if (composeView2 != null) {
                    composeView2.setFocusableInTouchMode(false);
                }
                g.this.loaderCounter.set(0);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return g.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163290e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f163290e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (g.this.loaderCounter.getAndIncrement() == 0) {
                px.f.f163100a.b("Blocking views and showing loader in app:\n - window: " + g.this.window + "\n - appViewGroup: " + g.this.appViewGroup, px.c.a(g.this));
                g.this.u();
                g.this.loaderVisible.setValue(vq.b.a(true));
                ComposeView composeView = g.this.loaderView;
                if (composeView != null) {
                    composeView.setFocusable(true);
                }
                ComposeView composeView2 = g.this.loaderView;
                if (composeView2 != null) {
                    composeView2.setFocusableInTouchMode(true);
                }
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return g.this.new d(eVar);
        }
    }

    private static final boolean j(f6<Boolean> f6Var) {
        return f6Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(g gVar, int i15, r rVar, int i16) {
        gVar.b(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        h<View> hVarI;
        h<View> hVarA;
        ViewGroup viewGroup = this.appViewGroup;
        if (viewGroup == null || (hVarA = j6.r0.a(viewGroup)) == null || (hVarI = eu.k.y(hVarA, new l() { // from class: pz.d
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(g.v(this.f163271a, (View) obj));
            }
        })) == null) {
            hVarI = eu.k.i();
        }
        ViewGroup viewGroup2 = this.appViewGroup;
        this.appViewGroupSavedFocusability = viewGroup2 != null ? Integer.valueOf(viewGroup2.getDescendantFocusability()) : null;
        ViewGroup viewGroup3 = this.appViewGroup;
        if (viewGroup3 != null) {
            viewGroup3.setDescendantFocusability(393216);
        }
        for (View view : hVarI) {
            px.f.f163100a.b("Blocking view:\n - View: " + view + "\n - View.importantForAccessibility: " + view.getImportantForAccessibility(), px.c.a(this));
            this.viewsBlockedByLoader.add(new a(view, view.getImportantForAccessibility()));
            view.clearFocus();
            view.setImportantForAccessibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(g gVar, View view) {
        return gVar.viewsToIgnore.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(g gVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(666210063, i15, -1, "pl.gov.coi.common.loader.LoaderManagerImpl.connect.<anonymous>.<anonymous> (LoaderManagerImpl.kt:72)");
            }
            gVar.b(rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    @Override // ty.a
    public void b(r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1799661283);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1799661283, i16, -1, "pl.gov.coi.common.loader.LoaderManagerImpl.Render (LoaderManagerImpl.kt:159)");
            }
            p114t0.k.g(j(m7.b.b(this.loaderVisible, Boolean.FALSE, null, null, null, rVarH, 48, 14)), null, a0.o(m.l(500, 0, null, 6, null), 0.0f, 2, null), a0.q(m.l(500, 0, null, 6, null), 0.0f, 2, null), null, b.f163269a.b(), rVarH, 200064, 18);
            rVarH = rVarH;
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: pz.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.k(this.f163273a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // ox.a
    public Object d(tq.e<? super i0> eVar) {
        Object objG = i.g(g1.c(), new c(null), eVar);
        return objG == uq.b.e() ? objG : i0.f148189a;
    }

    @Override // oz.c
    public void e(CON.p activity) {
        View decorView;
        j lifecycleRegistry;
        q qVar = this.lifecycleOwner;
        if (qVar != null && (lifecycleRegistry = qVar.getLifecycleRegistry()) != null) {
            lifecycleRegistry.d(this);
        }
        this.lifecycleOwner = activity;
        activity.getLifecycleRegistry().a(this);
        Window window = activity.getWindow();
        this.window = window;
        ViewGroup viewGroup = (window == null || (decorView = window.getDecorView()) == null) ? null : (ViewGroup) decorView.findViewById(R.id.content);
        ViewGroup viewGroup2 = viewGroup != null ? viewGroup : null;
        this.appViewGroup = viewGroup2;
        if (viewGroup2 != null) {
            ComposeView composeView = new ComposeView(viewGroup2.getContext(), null, 0, 6, null);
            this.viewsToIgnore.add(composeView);
            viewGroup2.addView(composeView);
            composeView.setFocusable(false);
            composeView.setFocusableInTouchMode(false);
            composeView.setContent(y2.m.b(666210063, true, new p() { // from class: pz.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.w(this.f163272a, (r) obj, ((Integer) obj2).intValue());
                }
            }));
        }
        if (this.loaderCounter.get() > 0) {
            u();
        }
    }

    @Override // ox.a
    public Object f(tq.e<? super i0> eVar) {
        Object objG = i.g(g1.c(), new d(null), eVar);
        return objG == uq.b.e() ? objG : i0.f148189a;
    }

    @Override // androidx.p016lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onCreate(q qVar) {
        super.onCreate(qVar);
    }

    @Override // androidx.p016lifecycle.DefaultLifecycleObserver
    public void onDestroy(q owner) {
        super.onResume(owner);
        this.viewsBlockedByLoader.clear();
        this.viewsToIgnore.clear();
    }

    @Override // androidx.p016lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(q qVar) {
        super.onPause(qVar);
    }

    @Override // androidx.p016lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(q qVar) {
        super.onResume(qVar);
    }

    @Override // androidx.p016lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(q qVar) {
        super.onStart(qVar);
    }

    @Override // androidx.p016lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(q qVar) {
        super.onStop(qVar);
    }
}
