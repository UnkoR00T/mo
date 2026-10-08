package o30;

import d1.r3;
import er.q;
import f1.e;
import f1.q0;
import f3.m;
import n30.CardListData;
import n50.j0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln30/b;", "data", "Loq/i0;", "d", "(Ln30/b;Lm2/r;I)V", "Lf1/q0;", "f", "(Lf1/q0;Ln30/b;)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final void d(final CardListData cardListData, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1353247972);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(cardListData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1353247972, i16, -1, "pl.gov.coi.common.ui.ds.cardlist.validation.CardListValidationSection (CardListValidationSection.kt:14)");
            }
            j0 singleCardState = cardListData.getSingleCardState();
            if (singleCardState instanceof j0.Helper) {
                rVarH.X(-2047172942);
                r3.a(androidx.compose.foundation.layout.d.i(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100()), rVarH, 0);
                p40.b.b(null, ((j0.Helper) cardListData.getSingleCardState()).getLabel(), false, rVarH, 0, 5);
                rVarH.R();
            } else if (singleCardState instanceof j0.Error) {
                rVarH.X(-2046992491);
                r3.a(androidx.compose.foundation.layout.d.i(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100()), rVarH, 0);
                l40.d.d(null, ((j0.Error) cardListData.getSingleCardState()).getLabel(), false, rVarH, 0, 5);
                rVarH.R();
            } else {
                if (!fr.t.c(singleCardState, j0.a.f132074a)) {
                    rVarH.X(903791755);
                    rVarH.R();
                    throw new p();
                }
                rVarH.X(903804864);
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: o30.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.e(cardListData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(CardListData cardListData, int i15, r rVar, int i16) {
        d(cardListData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void f(q0 q0Var, final CardListData cardListData) {
        j0 singleCardState = cardListData.getSingleCardState();
        if (singleCardState instanceof j0.Helper) {
            q0.c(q0Var, null, null, y2.m.b(1994200713, true, new q() { // from class: o30.a
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d.g(cardListData, (e) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        } else if (singleCardState instanceof j0.Error) {
            q0.c(q0Var, null, null, y2.m.b(1644839922, true, new q() { // from class: o30.b
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d.h(cardListData, (e) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        } else if (!fr.t.c(singleCardState, j0.a.f132074a)) {
            throw new p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(CardListData cardListData, e eVar, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(1994200713, i15, -1, "pl.gov.coi.common.ui.ds.cardlist.validation.cardListValidationSection.<anonymous> (CardListValidationSection.kt:33)");
            }
            r3.a(androidx.compose.foundation.layout.d.i(m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
            p40.b.b(null, ((j0.Helper) cardListData.getSingleCardState()).getLabel(), false, rVar, 0, 5);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(CardListData cardListData, e eVar, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(1644839922, i15, -1, "pl.gov.coi.common.ui.ds.cardlist.validation.cardListValidationSection.<anonymous> (CardListValidationSection.kt:38)");
            }
            r3.a(androidx.compose.foundation.layout.d.i(m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
            l40.d.d(null, ((j0.Error) cardListData.getSingleCardState()).getLabel(), false, rVar, 0, 5);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }
}
