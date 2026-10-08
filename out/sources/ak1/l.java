package ak1;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import n50.h0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\f\u0010\u0006\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lak1/f;", "viewModel", "Loq/i0;", "f", "(Lak1/f;Lm2/r;I)V", "Lak1/f$a$a;", "data", "i", "(Lak1/f$a$a;Lm2/r;I)V", "Lak1/f$a$c;", "l", "(Lak1/f$a$c;Lm2/r;I)V", "Lak1/f$a;", "defencetraining_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    public static final void f(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(915107209);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(915107209, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.trainingdetails.TrainingDetailsScreen (TrainingDetailsScreen.kt:28)");
            }
            f.a aVarG = g(m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarG instanceof f.a.Content) {
                rVarH.X(-1050261063);
                i((f.a.Content) aVarG, rVarH, 0);
                rVarH.R();
            } else if (aVarG instanceof f.a.Error) {
                rVarH.X(-1050257455);
                ((f.a.Error) aVarG).getError().b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarG instanceof f.a.Success)) {
                    rVarH.X(-1050263405);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1050255566);
                l((f.a.Success) aVarG, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: ak1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.h(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.a g(f6<? extends f.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(f fVar, int i15, p076m2.r rVar, int i16) {
        f(fVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final f.a.Content content, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1288074759);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(content) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1288074759, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.trainingdetails.TrainingDetailsScreenContent (TrainingDetailsScreen.kt:42)");
            }
            q0.g(false, content.e(), rVarH, 0, 1);
            rVar2 = rVarH;
            i50.s.r(content.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-754407692, true, new er.q() { // from class: ak1.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.j(content, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ak1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.k(content, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(f.a.Content content, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-754407692, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.trainingdetails.TrainingDetailsScreenContent.<anonymous> (TrainingDetailsScreen.kt:47)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(t70.i.S(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), null, rVar, 6, 1), d3Var), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            if (content.getAlertData() == null) {
                rVar.X(397851461);
            } else {
                rVar.X(397851462);
                c30.e.c(null, content.getAlertData(), rVar, c30.b.f22944i << 3, 1);
            }
            rVar.R();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            m30.i.d(content.getCardList(), null, null, rVar, 0, 6);
            if (content.getGiveUpButton() == null) {
                rVar.X(398056185);
            } else {
                rVar.X(398056186);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing300()), rVar, 0);
                h0.v(content.getGiveUpButton(), null, rVar, 0, 2);
            }
            rVar.R();
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(f.a.Content content, int i15, p076m2.r rVar, int i16) {
        i(content, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void l(final f.a.Success success, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1384956787);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(success) : rVarH.G(success) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1384956787, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.trainingdetails.TrainingDetailsScreenSuccess (TrainingDetailsScreen.kt:76)");
            }
            rVar2 = rVarH;
            i50.s.r(success.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-657525664, true, new er.q() { // from class: ak1.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.m(success, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ak1.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.n(success, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(f.a.Success success, d3 d3Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-657525664, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.trainingdetails.TrainingDetailsScreenSuccess.<anonymous> (TrainingDetailsScreen.kt:80)");
            }
            q40.i.b(success.b(), null, b.f7042a.b(), rVar, IconPageData.f164667h | IconPageBottomContentData.f164663d | MLKEMEngine.KyberPolyBytes, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(f.a.Success success, int i15, p076m2.r rVar, int i16) {
        l(success, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
