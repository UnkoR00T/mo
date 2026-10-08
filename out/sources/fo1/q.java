package fo1;

import d1.a3;
import d1.d3;
import i50.BaseScaffoldData;
import o20.BaseDocumentData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lfo1/j;", "viewModel", "Loq/i0;", "g", "(Lfo1/j;Lm2/r;I)V", "Lfo1/j$a$a;", "stateData", "n", "(Lfo1/j$a$a;Lm2/r;I)V", "Lfo1/j$a;", "screenState", "Li70/p;", "snackBarState", "deputycard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<oq.i0> {
        a(Object obj) {
            super(0, obj, j.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((j) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    public static final void g(final j jVar, p076m2.r rVar, final int i15) {
        int i16;
        f6 f6Var;
        al alVar;
        int i17;
        int i18;
        ?? r15;
        p076m2.r rVarH = rVar.h(1707538037);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(jVar) : rVarH.G(jVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1707538037, i16, -1, "pl.gov.coi.mobywatel.feature.deputy.presentation.screens.DeputyCardScreen (DeputyCardScreen.kt:24)");
            }
            f6 f6VarC = m7.b.c(jVar.getState(), null, null, null, rVarH, 0, 7);
            rVarH = rVarH;
            final f6 f6VarB = m7.b.b(jVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar2 = (al) objE;
            final j.a aVarH = h(f6VarC);
            if (fr.t.c(aVarH, j.a.b.f65717a)) {
                rVarH.X(266559129);
                rVarH.R();
                f6Var = f6VarB;
                alVar = alVar2;
                i17 = 4;
                i18 = i16;
                r15 = 0;
            } else if (aVarH instanceof j.a.Initialized) {
                rVarH.X(266561432);
                f6Var = f6VarB;
                alVar = alVar2;
                i18 = i16;
                i17 = 4;
                i50.s.r(((j.a.Initialized) aVarH).getScaffoldData(), null, y2.m.d(-55098036, true, new er.p() { // from class: fo1.m
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return q.j(alVar2, f6VarB, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1780765315, true, new er.q() { // from class: fo1.n
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return q.k(aVarH, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
                rVarH = rVarH;
                rVarH.R();
                r15 = 0;
            } else {
                f6Var = f6VarB;
                alVar = alVar2;
                i17 = 4;
                i18 = i16;
                r15 = 0;
                if (!(aVarH instanceof j.a.Error)) {
                    rVarH.X(266557387);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(266575859);
                n((j.a.Error) aVarH, rVarH, 0);
                rVarH.R();
            }
            i70.p pVarI = i(f6Var);
            int i19 = i18 & 14;
            ?? r16 = (i19 == i17 || ((i18 & 8) != 0 && rVarH.G(jVar))) ? 1 : r15;
            Object objE2 = rVarH.E();
            if (r16 != 0 || objE2 == companion.a()) {
                objE2 = new a(jVar);
                rVarH.v(objE2);
            }
            i70.m.d(alVar, pVarI, (er.a) ((mr.g) objE2), null, null, rVarH, 6, 24);
            ?? r17 = (i19 == i17 || ((i18 & 8) != 0 && rVarH.G(jVar))) ? 1 : r15;
            Object objE3 = rVarH.E();
            if (r17 != 0 || objE3 == companion.a()) {
                objE3 = new er.a() { // from class: fo1.o
                    @Override // er.a
                    public final Object a() {
                        return q.l(jVar);
                    }
                };
                rVarH.v(objE3);
            }
            q0.g(r15, (er.a) objE3, rVarH, r15, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fo1.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.m(jVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final j.a h(f6<? extends j.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p i(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(al alVar, f6 f6Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-55098036, i15, -1, "pl.gov.coi.mobywatel.feature.deputy.presentation.screens.DeputyCardScreen.<anonymous> (DeputyCardScreen.kt:38)");
            }
            i70.d.d(alVar, i(f6Var), false, rVar, 6, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(j.a aVar, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1780765315, i15, -1, "pl.gov.coi.mobywatel.feature.deputy.presentation.screens.DeputyCardScreen.<anonymous> (DeputyCardScreen.kt:41)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            o20.i.m(((j.a.Initialized) aVar).getScreenData(), rVar, BaseDocumentData.f140741h);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(j jVar) {
        jVar.d();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(j jVar, int i15, p076m2.r rVar, int i16) {
        g(jVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void n(final j.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2054602720);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2054602720, i16, -1, "pl.gov.coi.mobywatel.feature.deputy.presentation.screens.ErrorScreen (DeputyCardScreen.kt:67)");
            }
            error.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: fo1.k
                    @Override // er.a
                    public final Object a() {
                        return q.o();
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fo1.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.p(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(j.a.Error error, int i15, p076m2.r rVar, int i16) {
        n(error, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
