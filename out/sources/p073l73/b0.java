package p073l73;

import androidx.compose.foundation.layout.d;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.i;
import er.a;
import er.q;
import f3.c;
import f3.j;
import i50.BaseScaffoldData;
import i50.s;
import m7.b;
import o20.BaseDocumentData;
import oq.i0;
import oq.p;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p088nul.q0;
import y2.m;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r²\u0006\f\u0010\n\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Ll73/k;", "viewModel", "Loq/i0;", "j", "(Ll73/k;Lm2/r;I)V", "Ll73/k$a;", "screenData", "e", "(Ll73/k$a;Lm2/r;I)V", "Ll73/k$a$b;", "data", "g", "(Ll73/k$a$b;Lm2/r;I)V", "studentcard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b0 {
    public static final void e(final k.a aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(871414036);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(871414036, i16, -1, "pl.gov.coi.mobywatel.feature.studentcard.presentation.main.StudentCardContent (StudentCardScreen.kt:31)");
            }
            if (fr.t.c(aVar, k.a.C2826a.f116889a)) {
                rVarH.X(1513340460);
                rVarH.R();
            } else {
                if (!(aVar instanceof k.a.Initialized)) {
                    rVarH.X(-89731650);
                    rVarH.R();
                    throw new p();
                }
                rVarH.X(-89728182);
                g((k.a.Initialized) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: l73.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b0.f(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(k.a aVar, int i15, r rVar, int i16) {
        e(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final k.a.Initialized initialized, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1547401919);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1547401919, i16, -1, "pl.gov.coi.mobywatel.feature.studentcard.presentation.main.StudentCardInitialized (StudentCardScreen.kt:43)");
            }
            s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, m.d(-1312622028, true, new q() { // from class: l73.y
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return b0.h(initialized, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            q0.g(false, initialized.a(), rVarH, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: l73.z
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b0.i(initialized, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(k.a.Initialized initialized, d3 d3Var, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(-1312622028, i15, -1, "pl.gov.coi.mobywatel.feature.studentcard.presentation.main.StudentCardInitialized.<anonymous> (StudentCardScreen.kt:45)");
            }
            f3.m mVarL = a3.l(d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var);
            w0 w0VarA = e0.a(i.f39152a.k(), c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = j.e(rVar, mVarL);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            o20.i.m(initialized.getScreenData(), rVar, BaseDocumentData.f140741h);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(k.a.Initialized initialized, int i15, r rVar, int i16) {
        g(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void j(final k kVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-262697757);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(kVar) : rVarH.G(kVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-262697757, i16, -1, "pl.gov.coi.mobywatel.feature.studentcard.presentation.main.StudentCardScreen (StudentCardScreen.kt:20)");
            }
            e(k(b.c(kVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: l73.a0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b0.l(kVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final k.a k(f6<? extends k.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(k kVar, int i15, r rVar, int i16) {
        j(kVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
