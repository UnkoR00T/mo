package yt3;

import d1.a3;
import d1.d3;
import d1.h0;
import d1.r3;
import d1.x;
import i50.BaseScaffoldData;
import n4.v;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import w0.f3;
import w0.u2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lyt3/c;", "viewModel", "Loq/i0;", "g", "(Lyt3/c;Lm2/r;I)V", "Lyt3/c$a;", "data", "k", "(Lyt3/c$a;Lm2/r;I)V", "addressform_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static final void g(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        ?? r15;
        i0 i0Var;
        p076m2.r rVarH = rVar.h(-1402004092);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1402004092, i16, -1, "pl.gov.coi.mobywatel.segment.addressform.presentation.AddressFormScreen (AddressFormScreen.kt:31)");
            }
            final f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            BaseScaffoldData scaffoldData = h(f6VarC).getScaffoldData();
            if (scaffoldData == null) {
                rVarH.X(1453198311);
                rVarH.R();
                i0Var = null;
                r15 = 0;
            } else {
                rVarH.X(1453198312);
                r15 = 0;
                i50.s.r(scaffoldData, null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1379916336, true, new er.q() { // from class: yt3.e
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return k.i(f6VarC, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
                rVarH.R();
                i0Var = i0.f148189a;
            }
            if (i0Var == null) {
                rVarH = rVarH;
                rVarH.X(1293810153);
                k(h(f6VarC), rVarH, r15);
                rVarH.R();
            } else {
                rVarH = rVarH;
                rVarH.X(1293802806);
                rVarH.R();
            }
            q0.g(r15, h(f6VarC).d(), rVarH, r15, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: yt3.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.j(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.Data h(f6<c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(f6 f6Var, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1379916336, i15, -1, "pl.gov.coi.mobywatel.segment.addressform.presentation.AddressFormScreen.<anonymous>.<anonymous> (AddressFormScreen.kt:35)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
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
            x xVar = x.f39368a;
            k(h(f6Var), rVar, 0);
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
    public static final i0 j(c cVar, int i15, p076m2.r rVar, int i16) {
        g(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void k(c.Data data, p076m2.r rVar, final int i15) {
        int i16;
        final c.Data data2;
        k70.a aVar;
        f3.m.Companion companion;
        Object obj;
        p076m2.r rVarH = rVar.h(1451559591);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(data) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1451559591, i16, -1, "pl.gov.coi.mobywatel.segment.addressform.presentation.AddressFormScreenContent (AddressFormScreen.kt:47)");
            }
            f3 f3VarB = u2.b(0, rVarH, 0, 1);
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(mVarF, aVar2.a(rVarH, i17).getBase().a(), null, 2, null);
            Object objE = rVarH.E();
            p076m2.r.Companion companion3 = p076m2.r.INSTANCE;
            if (objE == companion3.a()) {
                objE = new er.l() { // from class: yt3.g
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return k.l((n4.i0) obj2);
                    }
                };
                rVarH.v(objE);
            }
            f3.m mVarD2 = v.d(mVarD, false, (er.l) objE, 1, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion4 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion4.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD2);
            androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion5.b();
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
            n6.i(rVarC, w0VarA, companion5.d());
            n6.i(rVarC, e0VarT, companion5.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion5.c());
            n6.g(rVarC, companion5.a());
            n6.i(rVarC, mVarE, companion5.e());
            f3.m mVarS = t70.i.S(a3.r(h0.b(d1.i0.f39176a, companion2, 1.0f, false, 2, null), aVar2.b(rVarH, i17).getSpacing200(), aVar2.b(rVarH, i17).getSpacing100(), aVar2.b(rVarH, i17).getSpacing200(), 0.0f, 8, null), f3VarB, rVarH, 0, 0);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion4.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarS);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion5.b();
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
            n6.i(rVarC2, w0VarA2, companion5.d());
            n6.i(rVarC2, e0VarT2, companion5.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion5.c());
            n6.g(rVarC2, companion5.a());
            n6.i(rVarC2, mVarE2, companion5.e());
            if (data.getTitle() == null) {
                rVarH.X(-1843732143);
                rVarH.R();
                aVar = aVar2;
                companion = companion2;
            } else {
                rVarH.X(-1843732142);
                aVar = aVar2;
                companion = companion2;
                j70.h.g(null, null, data.getTitle(), null, null, aVar2.a(rVarH, i17).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
                rVarH = rVarH;
                i0 i0Var = i0.f148189a;
                rVarH.R();
            }
            if (data.getSubtitle() == null) {
                rVarH.X(-1843527977);
            } else {
                rVarH.X(-1843527976);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
                p076m2.r rVar2 = rVarH;
                j70.h.g(null, null, data.getSubtitle(), null, null, aVar.a(rVarH, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
                rVarH = rVar2;
                i0 i0Var2 = i0.f148189a;
            }
            rVarH.R();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            data2 = data;
            x30.c.c(null, 0.0f, y2.m.d(-1636319878, true, new er.p() { // from class: yt3.h
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return k.m(data2, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            c30.b alertData = data2.getAlertData();
            if (alertData == null) {
                rVarH.X(-1843094132);
                rVarH.R();
                obj = null;
            } else {
                rVarH.X(-1843094131);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
                obj = null;
                c30.e.c(null, alertData, rVarH, c30.b.f22944i << 3, 1);
                i0 i0Var3 = i0.f148189a;
                rVarH.R();
            }
            rVarH.x();
            f3.m mVarN = a3.n(companion, aVar.b(rVarH, i17).getSpacing200());
            Object objE2 = rVarH.E();
            if (objE2 == companion3.a()) {
                objE2 = new er.l() { // from class: yt3.i
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return k.n((n4.i0) obj2);
                    }
                };
                rVarH.v(objE2);
            }
            f3.m mVarD3 = v.d(mVarN, false, (er.l) objE2, 1, obj);
            w0 w0VarA3 = d1.e0.a(iVar.k(), companion4.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarD3);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion5.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarA3, companion5.d());
            n6.i(rVarC3, e0VarT3, companion5.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion5.c());
            n6.g(rVarC3, companion5.a());
            n6.i(rVarC3, mVarE3, companion5.e());
            h30.q.p(data2.getButtonData(), false, null, rVarH, 0, 6);
            rVarH.x();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            data2 = data;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: yt3.j
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return k.o(data2, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(c.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1636319878, i15, -1, "pl.gov.coi.mobywatel.segment.addressform.presentation.AddressFormScreenContent.<anonymous>.<anonymous>.<anonymous> (AddressFormScreen.kt:84)");
            }
            data.getAddressFormVMS().b(rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(c.Data data, int i15, p076m2.r rVar, int i16) {
        k(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
