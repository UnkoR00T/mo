package p088nul;

import CON.p;
import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.p016lifecycle.C6451z0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.v;
import ua.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\r"}, d2 = {"LCON/p;", "Lm2/v;", "parent", "Lkotlin/Function0;", "Loq/i0;", "content", "a", "(LCON/p;Lm2/v;Ler/p;)V", "c", "(LCON/p;)V", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "DefaultActivityContentLayoutParams", "activity-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ViewGroup.LayoutParams f138874a = new ViewGroup.LayoutParams(-2, -2);

    public static final void a(p pVar, v vVar, er.p<? super r, ? super Integer, i0> pVar2) {
        View childAt = ((ViewGroup) pVar.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(vVar);
            composeView.setContent(pVar2);
            return;
        }
        ComposeView composeView2 = new ComposeView(pVar, null, 0, 6, null);
        composeView2.setParentCompositionContext(vVar);
        composeView2.setContent(pVar2);
        c(pVar);
        pVar.setContentView(composeView2, f138874a);
    }

    public static /* synthetic */ void b(p pVar, v vVar, er.p pVar2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            vVar = null;
        }
        a(pVar, vVar, pVar2);
    }

    private static final void c(p pVar) {
        View decorView = pVar.getWindow().getDecorView();
        if (C6451z0.a(decorView) == null) {
            C6451z0.b(decorView, pVar);
        }
        if (androidx.p016lifecycle.View.a(decorView) == null) {
            androidx.p016lifecycle.View.b(decorView, pVar);
        }
        if (n.a(decorView) == null) {
            n.b(decorView, pVar);
        }
    }
}
