package t11;

import androidx.p016lifecycle.y0;
import f00.f0;
import fr.q0;
import oq.i0;
import p071kotlin.Metadata;
import p136y9.d1;
import p136y9.w;
import p7.CreationExtras;
import v11.ConfirmationScreenModel;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly9/d1;", "Lf00/a;", "destination", "Lf00/s;", "destinationNavigator", "Loq/i0;", "c", "(Ly9/d1;Lf00/a;Lf00/s;)V", "certificates_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.l<ConfirmationScreenModel, i0> {
        a(Object obj) {
            super(1, obj, q.class, "setupViewModel", "setupViewModel(Lpl/gov/coi/mobywatel/feature/certificates/presentation/screens/confirmation/model/ConfirmationScreenModel;)V", 0);
        }

        public final void E(ConfirmationScreenModel confirmationScreenModel) {
            ((q) this.f66391b).q9(confirmationScreenModel);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(ConfirmationScreenModel confirmationScreenModel) {
            E(confirmationScreenModel);
            return i0.f148189a;
        }
    }

    public static final void c(d1 d1Var, f00.a aVar, final f00.s sVar) {
        f00.r.u(d1Var, aVar, null, y2.m.b(2100433679, true, new er.r() { // from class: t11.a
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return c.d(sVar, (p114t0.f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(final f00.s sVar, p114t0.f fVar, w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2100433679, i15, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.screens.confirmation.addConfirmationDestination.<anonymous> (ConfirmationDestination.kt:15)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        q qVar = (q) q7.d.c(q0.c(q.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<d> bVarY1 = qVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: t11.b
                @Override // er.l
                public final Object b(Object obj) {
                    return c.e(sVar, (d) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        p11.a.c cVar = p11.a.c.f151498a;
        boolean zG2 = rVar.G(qVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new a(qVar);
            rVar.v(objE2);
        }
        sVar.f(cVar, (er.l) ((mr.g) objE2));
        k.d(qVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(f00.s sVar, d dVar) {
        if (!fr.t.c(dVar, d.a.f186958a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }
}
