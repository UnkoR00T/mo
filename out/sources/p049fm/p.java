package p049fm;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import er.l;
import er.q;
import lh.c;
import lh.e;
import nh.h;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import y2.m;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0012"}, d2 = {"Lfm/p;", "Llh/c$b;", "Llh/e;", "mapView", "Lkotlin/Function1;", "Lnh/h;", "Lfm/s4;", "markerNodeFinder", "<init>", "(Llh/e;Ler/l;)V", "marker", "Landroid/view/View;", "e", "(Lnh/h;)Landroid/view/View;", "b", "a", "Llh/e;", "Ler/l;", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e mapView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<h, s4> markerNodeFinder;

    /* JADX WARN: Multi-variable type inference failed */
    public p(e eVar, l<? super h, s4> lVar) {
        this.mapView = eVar;
        this.markerNodeFinder = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(q qVar, h hVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1508359207, i15, -1, "com.google.maps.android.compose.ComposeInfoWindowAdapter.getInfoContents.<anonymous>.<anonymous> (ComposeInfoWindowAdapter.kt:49)");
            }
            qVar.w(hVar, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(q qVar, h hVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-742372995, i15, -1, "com.google.maps.android.compose.ComposeInfoWindowAdapter.getInfoWindow.<anonymous>.<anonymous> (ComposeInfoWindowAdapter.kt:62)");
            }
            qVar.w(hVar, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    @Override // lh.c.b
    public View b(final h marker) {
        final q<h, r, Integer, i0> qVarD;
        s4 s4VarB = this.markerNodeFinder.b(marker);
        if (s4VarB == null || (qVarD = s4VarB.d()) == null) {
            return null;
        }
        ComposeView composeView = new ComposeView(this.mapView.getContext(), null, 0, 6, null);
        composeView.setContent(m.b(-742372995, true, new er.p() { // from class: fm.o
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return p.f(qVarD, marker, (r) obj, ((Integer) obj2).intValue());
            }
        }));
        t1.d(this.mapView, composeView, null, s4VarB.getCompositionContext(), 2, null);
        return composeView;
    }

    @Override // lh.c.b
    public View e(final h marker) {
        final q<h, r, Integer, i0> qVarC;
        s4 s4VarB = this.markerNodeFinder.b(marker);
        if (s4VarB == null || (qVarC = s4VarB.c()) == null) {
            return null;
        }
        ComposeView composeView = new ComposeView(this.mapView.getContext(), null, 0, 6, null);
        composeView.setContent(m.b(1508359207, true, new er.p() { // from class: fm.n
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return p.d(qVarC, marker, (r) obj, ((Integer) obj2).intValue());
            }
        }));
        t1.d(this.mapView, composeView, null, s4VarB.getCompositionContext(), 2, null);
        return composeView;
    }
}
