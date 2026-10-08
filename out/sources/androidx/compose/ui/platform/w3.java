package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.WeakHashMap;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\f\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/g;", "container", "Lm2/a;", "a", "(Landroidx/compose/ui/node/g;)Lm2/a;", "Landroidx/compose/ui/platform/b;", "Landroidx/compose/ui/platform/e1;", "composeViewContext", "Lkotlin/Function0;", "Loq/i0;", "content", "Lm2/u;", "b", "(Landroidx/compose/ui/platform/b;Landroidx/compose/ui/platform/e1;Ler/p;)Lm2/u;", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "DefaultLayoutParams", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ViewGroup.LayoutParams f10861a = new ViewGroup.LayoutParams(-2, -2);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class a implements c2.a, fr.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p076m2.v f10862a;

        a(p076m2.v vVar) {
            this.f10862a = vVar;
        }

        @Override // androidx.compose.ui.platform.c2.a
        public final p076m2.g a(er.a<oq.i0> aVar) {
            return this.f10862a.w(aVar);
        }

        @Override // fr.n
        public final oq.e<?> b() {
            return new fr.q(1, this.f10862a, p076m2.v.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof c2.a) && (obj instanceof fr.n)) {
                return fr.t.c(b(), ((fr.n) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public static final p076m2.a<androidx.compose.ui.node.g> a(androidx.compose.ui.node.g gVar) {
        return new g4.s1(gVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    public static final p076m2.u b(b bVar, e1 e1Var, er.p<? super p076m2.r, ? super Integer, oq.i0> pVar) {
        AndroidComposeView androidComposeView;
        u3 u3Var;
        n1.f10678a.b();
        if (bVar.getChildCount() > 0) {
            View childAt = bVar.getChildAt(0);
            androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
            if (androidComposeView != null) {
                androidComposeView.setComposeViewContext(e1Var);
            }
            if (androidComposeView == null) {
                androidComposeView = new AndroidComposeView(bVar.getContext(), e1Var);
                bVar.addView(androidComposeView.getView(), f10861a);
            }
            androidComposeView.setComposeViewContext(e1Var);
            if (bVar.getComposeViewContext() != null) {
                e1Var.w();
                androidComposeView.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            if (t1.b() && androidComposeView.getTag(f3.p.M) == null) {
                androidComposeView.setTag(f3.p.M, Collections.newSetFromMap(new WeakHashMap()));
            }
            Object tag = androidComposeView.getTag(f3.p.N);
            u3Var = tag instanceof u3 ? (u3) tag : null;
            if (u3Var == null) {
                u3Var = new u3(androidComposeView, p076m2.y.a(new g4.s1(androidComposeView.getRoot()), e1Var.getCompositionContext()));
                androidComposeView.setTag(f3.p.N, u3Var);
            }
            u3Var.h(pVar);
            androidComposeView.setFrameEndScheduler$ui(new a(e1Var.getCompositionContext()));
            return u3Var;
        }
        bVar.removeAllViews();
        androidComposeView = null;
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(bVar.getContext(), e1Var);
            bVar.addView(androidComposeView.getView(), f10861a);
        }
        androidComposeView.setComposeViewContext(e1Var);
        if (bVar.getComposeViewContext() != null) {
            e1Var.w();
            androidComposeView.setComposeViewContextIncrementedDuringInit$ui(true);
        }
        if (t1.b()) {
            androidComposeView.setTag(f3.p.M, Collections.newSetFromMap(new WeakHashMap()));
        }
        Object tag2 = androidComposeView.getTag(f3.p.N);
        if (tag2 instanceof u3) {
        }
        if (u3Var == null) {
            u3Var = new u3(androidComposeView, p076m2.y.a(new g4.s1(androidComposeView.getRoot()), e1Var.getCompositionContext()));
            androidComposeView.setTag(f3.p.N, u3Var);
        }
        u3Var.h(pVar);
        androidComposeView.setFrameEndScheduler$ui(new a(e1Var.getCompositionContext()));
        return u3Var;
    }
}
