package ha0;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import i50.BaseScaffoldData;
import java.util.Iterator;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lha0/f;", "viewModel", "Loq/i0;", "f", "(Lha0/f;Lm2/r;I)V", "Lha0/f$a$b;", "data", "i", "(Lha0/f$a$b;Lm2/r;I)V", "Lha0/f$a$a;", "l", "(Lha0/f$a$a;Lm2/r;I)V", "Lha0/f$a;", "state", "adddocument_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    public static final void f(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-2121700795);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2121700795, i16, -1, "pl.gov.coi.mjunior.feature.adddocument.presentation.screen.AddDocumentScreen (AddDocumentScreen.kt:27)");
            }
            f.a aVarG = g(m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarG instanceof f.a.Initialized) {
                rVarH.X(1155008103);
                i((f.a.Initialized) aVarG, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarG instanceof f.a.Error)) {
                    rVarH.X(1155005843);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1155010582);
                l((f.a.Error) aVarG, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: ha0.g
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

    public static final void i(final f.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1022333077);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1022333077, i16, -1, "pl.gov.coi.mjunior.feature.adddocument.presentation.screen.AddDocumentScreenInitialized (AddDocumentScreen.kt:39)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-573488312, true, new er.q() { // from class: ha0.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.j(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: ha0.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.k(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(f.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        char c15;
        int i17;
        Object obj;
        int i18;
        p076m2.r rVar2 = rVar;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar2.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-573488312, i16, -1, "pl.gov.coi.mjunior.feature.adddocument.presentation.screen.AddDocumentScreenInitialized.<anonymous> (AddDocumentScreen.kt:44)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(companion, d3Var);
            k70.a aVar = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(androidx.compose.foundation.layout.d.f(a3.r(mVarL, aVar.b(rVar2, i19).getSpacing200(), 0.0f, aVar.b(rVar2, i19).getSpacing200(), aVar.b(rVar2, i19).getSpacing200(), 2, null), 0.0f, 1, null), aVar.a(rVar2, i19).getBase().a(), null, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarD);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            f3.m mVarR = a3.r(t70.i.S(h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), null, rVar2, 0, 1), 0.0f, aVar.b(rVar2, i19).getSpacing100(), 0.0f, aVar.b(rVar2, i19).getSpacing200(), 5, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVar2, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT2 = rVar2.t();
            f3.m mVarE2 = f3.j.e(rVar2, mVarR);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB2);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC2 = n6.c(rVar2);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            if (initialized.c().isEmpty()) {
                c15 = 2;
                i17 = 0;
                obj = null;
                rVar2.X(-134472698);
            } else {
                rVar2.X(-132218998);
                j70.h.g(null, null, initialized.getDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i19).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                f3.m mVarI = androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i19).getSpacing200());
                i17 = 0;
                r3.a(mVarI, rVar2, 0);
                Iterator<T> it = initialized.c().iterator();
                while (it.hasNext()) {
                    n50.h0.v((n50.k) it.next(), null, rVar2, 0, 2);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing100()), rVar2, 0);
                }
                c15 = 2;
                obj = null;
            }
            rVar2.R();
            n50.k schoolCardToAdd = initialized.getSchoolCardToAdd();
            if (schoolCardToAdd == null) {
                rVar2.X(-131779140);
                rVar2.R();
                i18 = i17;
            } else {
                rVar2.X(-131779139);
                f3.m.Companion companion4 = f3.m.INSTANCE;
                k70.a aVar2 = k70.a.f108864a;
                int i25 = k70.a.f108865b;
                r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar2.b(rVar2, i25).getSpacing200()), rVar2, i17);
                j70.h.g(null, null, initialized.getSchoolCardDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i25).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar2.b(rVar2, i25).getSpacing200()), rVar2, 0);
                n50.h0.v(schoolCardToAdd, null, rVar2, 0, 2);
                rVar2.R();
            }
            rVar2.x();
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, i18);
            h30.q.p(initialized.getAddButton(), false, null, rVar2, 0, 6);
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
    public static final i0 k(f.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        i(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void l(final f.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-689747339);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-689747339, i16, -1, "pl.gov.coi.mjunior.feature.adddocument.presentation.screen.ErrorScreen (AddDocumentScreen.kt:97)");
            }
            error.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: ha0.h
                    @Override // er.a
                    public final Object a() {
                        return l.m();
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
            d5VarM.a(new er.p() { // from class: ha0.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.n(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(f.a.Error error, int i15, p076m2.r rVar, int i16) {
        l(error, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
