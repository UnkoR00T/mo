package tw;

import androidx.p016lifecycle.y0;
import f00.f0;
import f00.r;
import f00.s;
import f00.t;
import fr.q0;
import mu.a0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.f6;
import p136y9.d1;
import p136y9.w;
import p7.CreationExtras;
import vw.NavigationDialogModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Ly9/d1;", "Lzx/a;", "destination", "Lf00/s;", "destinationNavigator", "Loq/i0;", "c", "(Ly9/d1;Lzx/a;Lf00/s;)V", "Ltw/g;", "screenModel", "dialog_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.l<NavigationDialogModel, i0> {
        a(Object obj) {
            super(1, obj, n.class, "setupViewModel", "setupViewModel(Lpl/gov/coi/common/dialog/model/NavigationDialogModel;)V", 0);
        }

        public final void E(NavigationDialogModel navigationDialogModel) {
            ((n) this.f66391b).i9(navigationDialogModel);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(NavigationDialogModel navigationDialogModel) {
            E(navigationDialogModel);
            return i0.f148189a;
        }
    }

    @oq.a
    public static final void c(d1 d1Var, final zx.a aVar, final s sVar) {
        r.B(d1Var, aVar, t.a.f54568b, y2.m.b(-37562874, true, new er.q() { // from class: tw.a
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return c.d(sVar, aVar, (w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(final s sVar, zx.a aVar, w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-37562874, i15, -1, "pl.gov.coi.common.dialog.addNavigationDialogDestination.<anonymous> (NavigationDialog.kt:26)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        n nVar = (n) q7.d.c(q0.c(n.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        boolean zG = rVar.G(nVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new a(nVar);
            rVar.v(objE);
        }
        sVar.f(aVar, (er.l) ((mr.g) objE));
        a0<d> a0VarH9 = nVar.h9();
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: tw.b
                @Override // er.l
                public final Object b(Object obj) {
                    return c.e(sVar, (d) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(a0VarH9, (er.l) objE2, rVar, 0);
        f.b(f(m7.b.c(nVar.getState(), null, null, null, rVar, 0, 7)), rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(s sVar, d dVar) {
        if (!fr.t.c(dVar, d.a.f192477a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    private static final g f(f6<? extends g> f6Var) {
        return f6Var.getValue();
    }
}
