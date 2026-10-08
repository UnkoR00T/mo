package pa2;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q40.IconPageData;
import ra2.DataTransferModel;
import w0.f3;
import w0.u2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\b\u001a%\u0010\u0013\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, d2 = {"Lpa2/n;", "viewModel", "Loq/i0;", "j", "(Lpa2/n;Lm2/r;I)V", "Lra2/a;", "model", "n", "(Lra2/a;Lm2/r;I)V", "Lpa2/n$a$a;", "state", "q", "(Lpa2/n$a$a;Lm2/r;I)V", "t", "", "Ln50/k;", "listMessage", "Lmx/a;", "textHeader", "v", "(Ljava/util/List;Lmx/a;Lm2/r;I)V", "text", "x", "(Lmx/a;Lm2/r;I)V", "Lpa2/n$a;", "viewModelState", "history_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    public static final void j(final n nVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1833899839);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(nVar) : rVarH.G(nVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1833899839, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.dataTransfer.DataTransferScreen (DataTransferScreen.kt:35)");
            }
            n.a aVarK = k(m7.b.c(nVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarK instanceof n.a.Initialized) {
                rVarH.X(-1441147528);
                n(((n.a.Initialized) aVarK).getDataTransferModel(), rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarK instanceof n.a.Initial)) {
                    rVarH.X(-1441149708);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1441144690);
                q((n.a.Initial) aVarK, rVarH, 0);
                rVarH.R();
            }
            boolean z15 = (i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(nVar));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: pa2.h
                    @Override // er.a
                    public final Object a() {
                        return j.l(nVar);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: pa2.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.m(nVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final n.a k(f6<? extends n.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(n nVar) {
        nVar.d();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(n nVar, int i15, p076m2.r rVar, int i16) {
        j(nVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(final DataTransferModel dataTransferModel, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-430069504);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(dataTransferModel) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-430069504, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.dataTransfer.DataTransferScreenBase (DataTransferScreen.kt:51)");
            }
            rVar2 = rVarH;
            i50.s.r(dataTransferModel.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1621020371, true, new er.q() { // from class: pa2.c
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.o(dataTransferModel, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: pa2.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.p(dataTransferModel, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(DataTransferModel dataTransferModel, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1621020371, i15, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.dataTransfer.DataTransferScreenBase.<anonymous> (DataTransferScreen.kt:56)");
            }
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarL, aVar.b(rVar, i16).getSpacing200(), 0.0f, aVar.b(rVar, i16).getSpacing200(), 0.0f, 10, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            t(dataTransferModel, rVar, 0);
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
    public static final i0 p(DataTransferModel dataTransferModel, int i15, p076m2.r rVar, int i16) {
        n(dataTransferModel, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void q(final n.a.Initial initial, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-215030781);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initial) : rVarH.G(initial) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-215030781, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.dataTransfer.DataTransferScreenContextEmpty (DataTransferScreen.kt:71)");
            }
            rVar2 = rVarH;
            i50.s.r(initial.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1847553168, true, new er.q() { // from class: pa2.a
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.r(initial, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: pa2.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.s(initial, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(n.a.Initial initial, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1847553168, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.dataTransfer.DataTransferScreenContextEmpty.<anonymous> (DataTransferScreen.kt:76)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(w0.i.d(a3.q(mVarL, aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing100(), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200()), aVar.a(rVar, i17).getBase().a(), null, 2, null), 0.0f, 1, null);
            w0 w0VarA = e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.k(), rVar, 6);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarF);
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            q40.i.b(initial.a(), null, null, rVar, IconPageData.f164667h, 6);
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
    public static final i0 s(n.a.Initial initial, int i15, p076m2.r rVar, int i16) {
        q(initial, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void t(final DataTransferModel dataTransferModel, p076m2.r rVar, final int i15) {
        int i16;
        int i17;
        p076m2.r rVarH = rVar.h(854908194);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(dataTransferModel) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(854908194, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.dataTransfer.DataTransferScreenContextList (DataTransferScreen.kt:97)");
            }
            f3 f3VarB = u2.b(0, rVarH, 0, 1);
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), f3VarB, rVarH, 6, 0);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarS);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarH);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            if (dataTransferModel.h().isEmpty()) {
                i17 = 0;
                rVarH.X(1670392460);
            } else {
                rVarH.X(1673959227);
                Iterator<T> it = dataTransferModel.h().iterator();
                while (it.hasNext()) {
                    oq.r rVar2 = (oq.r) it.next();
                    x((Label) rVar2.c(), rVarH, 0);
                    m30.i.d(new CardListData((List) rVar2.d(), null, false, null, null, 30, null), null, null, rVarH, 0, 6);
                    r3.a(a3.r(f3.m.INSTANCE, 0.0f, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200(), 0.0f, 0.0f, 13, null), rVarH, 0);
                }
                i17 = 0;
            }
            rVarH.R();
            v(dataTransferModel.c(), dataTransferModel.getLastWeekTitle(), rVarH, i17);
            v(dataTransferModel.a(), dataTransferModel.getLastMonthTitle(), rVarH, i17);
            v(dataTransferModel.e(), dataTransferModel.getOverMonthTitle(), rVarH, i17);
            rVarH.x();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: pa2.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.u(dataTransferModel, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(DataTransferModel dataTransferModel, int i15, p076m2.r rVar, int i16) {
        t(dataTransferModel, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void v(final List<? extends n50.k> list, final Label label, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1027205452);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(list) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(label) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1027205452, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.dataTransfer.OneList (DataTransferScreen.kt:127)");
            }
            if (list.isEmpty()) {
                rVar2 = rVarH;
                rVar2.X(160221870);
            } else {
                rVarH.X(164469552);
                x(label, rVarH, (i16 >> 3) & 14);
                rVar2 = rVarH;
                m30.i.d(new CardListData(list, null, false, null, null, 30, null), null, null, rVar2, 0, 6);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, 0);
            }
            rVar2.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: pa2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.w(list, label, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(List list, Label label, int i15, p076m2.r rVar, int i16) {
        v(list, label, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void x(final Label label, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(709323153);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(label) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(709323153, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.dataTransfer.TextHeadLine (DataTransferScreen.kt:141)");
            }
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            j70.h.g(a3.r(f3.m.INSTANCE, 0.0f, aVar.b(rVarH, i17).getSpacing100(), 0.0f, aVar.b(rVarH, i17).getSpacing200(), 5, null), null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVar2, (i16 << 6) & 896, 0, 0, 33030138);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: pa2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.y(label, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(Label label, int i15, p076m2.r rVar, int i16) {
        x(label, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
