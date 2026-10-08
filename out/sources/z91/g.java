package z91;

import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p088nul.q0;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lz91/c;", "viewModel", "Loq/i0;", "f", "(Lz91/c;Lm2/r;I)V", "Lz91/c$a;", "screenData", "d", "(Lz91/c$a;Lm2/r;I)V", "childpassportapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    public static final void d(final c.Data data, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(349827798);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(349827798, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.takestoolong.ChildPassportApplicationTakesTooLongContent (ChildPassportApplicationTakesTooLongScreen.kt:30)");
            }
            IconPageData<InfoRowListData, IconPageBottomContentData> iconPageDataA = data.a();
            q qVar = q.f233681a;
            q40.i.b(iconPageDataA, qVar.d(), qVar.e(), rVarH, IconPageData.f164667h | InfoRowListData.f187643b | IconPageBottomContentData.f164663d | 432, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: z91.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.e(data, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(c.Data data, int i15, r rVar, int i16) {
        d(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void f(final c cVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-557408027);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-557408027, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.takestoolong.ChildPassportApplicationTakesTooLongScreen (ChildPassportApplicationTakesTooLongScreen.kt:21)");
            }
            final f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            d(g(f6VarC), rVarH, IconPageData.f164667h | InfoRowListData.f187643b | IconPageBottomContentData.f164663d);
            boolean zW = rVarH.W(f6VarC);
            Object objE = rVarH.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: z91.d
                    @Override // er.a
                    public final Object a() {
                        return g.h(f6VarC);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: z91.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.i(cVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.Data g(f6<c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(f6 f6Var) {
        g(f6Var).b().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(c cVar, int i15, r rVar, int i16) {
        f(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
