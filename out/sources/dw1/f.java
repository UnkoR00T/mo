package dw1;

import d1.d3;
import i50.BaseScaffoldData;
import o20.BaseDocumentData;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p088nul.q0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Ldw1/j;", "viewModel", "Loq/i0;", "l", "(Ldw1/j;Lm2/r;I)V", "Ldw1/j$a;", "data", "Li70/p;", "snackBarState", "f", "(Ldw1/j$a;Li70/p;Lm2/r;I)V", "Ldw1/j$a$a;", "h", "(Ldw1/j$a$a;Li70/p;Lm2/r;I)V", "dynamicdocument_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final void f(final j.a aVar, final i70.p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-802773314);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-802773314, i16, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.maindocument.DynamicDocumentContent (DynamicDocumentScreen.kt:39)");
            }
            if (aVar instanceof j.a.b) {
                rVarH.X(1628964335);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof j.a.DynamicDocumentData)) {
                    rVarH.X(1628962381);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1628967153);
                h((j.a.DynamicDocumentData) aVar, pVar, rVarH, i16 & 126);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: dw1.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.g(aVar, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(j.a aVar, i70.p pVar, int i15, p076m2.r rVar, int i16) {
        f(aVar, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void h(final j.a.DynamicDocumentData dynamicDocumentData, final i70.p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-2053476323);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dynamicDocumentData) : rVarH.G(dynamicDocumentData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2053476323, i16, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.maindocument.DynamicDocumentInitialized (DynamicDocumentScreen.kt:51)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar, dynamicDocumentData.a(), null, null, rVarH, (i16 & 112) | 6, 24);
            i50.s.r(new BaseScaffoldData(null, null, null, null, null, null, 63, null), null, y2.m.d(-1161366937, true, new er.p() { // from class: dw1.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.i(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(2036598096, true, new er.q() { // from class: dw1.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f.j(dynamicDocumentData, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            q0.g(false, dynamicDocumentData.b(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: dw1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.k(dynamicDocumentData, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1161366937, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.maindocument.DynamicDocumentInitialized.<anonymous> (DynamicDocumentScreen.kt:62)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(j.a.DynamicDocumentData dynamicDocumentData, d3 d3Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2036598096, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.maindocument.DynamicDocumentInitialized.<anonymous> (DynamicDocumentScreen.kt:65)");
            }
            o20.i.m(dynamicDocumentData.getScreenData(), rVar, BaseDocumentData.f140741h);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(j.a.DynamicDocumentData dynamicDocumentData, i70.p pVar, int i15, p076m2.r rVar, int i16) {
        h(dynamicDocumentData, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void l(final j jVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1172344813);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(jVar) : rVarH.G(jVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1172344813, i16, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.maindocument.DynamicDocumentScreen (DynamicDocumentScreen.kt:23)");
            }
            f6 f6VarC = m7.b.c(jVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(jVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            f(m(f6VarC), n(f6VarB), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: dw1.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.o(jVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final j.a m(f6<? extends j.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p n(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(j jVar, int i15, p076m2.r rVar, int i16) {
        l(jVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
