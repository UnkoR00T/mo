package ww3;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import fx.Rectangle;
import i50.BaseScaffoldData;
import jw3.MaskDefinition;
import n3.l0;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p036e4.q1;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import w0.i1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lww3/h;", "viewModel", "Loq/i0;", "i", "(Lww3/h;Lm2/r;I)V", "Lww3/h$a;", "data", "e", "(Lww3/h$a;Lm2/r;I)V", "identityphoto_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    private static final void e(final h.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(293403953);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(293403953, i16, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.preview.PreviewContent (PreviewScreen.kt:42)");
            }
            rVar2 = rVarH;
            i50.s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(11454308, true, new er.q() { // from class: ww3.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.f(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: ww3.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.h(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(final h.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(11454308, i16, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.preview.PreviewContent.<anonymous> (PreviewScreen.kt:44)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(t70.i.S(companion, null, rVar, 6, 1), d3Var), rVar, 0);
            d1.i.n nVarK = d1.i.f39152a.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            c30.e.c(null, data.getAlertData(), rVar, c30.b.f22944i << 3, 1);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            f3.m mVarB = d1.k.b(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), 0.7777778f, false, 2, null);
            boolean zG = rVar.G(data);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: ww3.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m.g(data, (c5.r) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarA = q1.a(mVarB, (er.l) objE);
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarA);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarI, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.x xVar = d1.x.f39368a;
            h.Data.PictureData pictureData = data.getPictureData();
            if (pictureData == null) {
                rVar.X(-2075519192);
                rVar.R();
            } else {
                rVar.X(-2075519191);
                i1.g(l0.c(pictureData.getBitmap()), null, k3.f.a(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), l1.h.f(aVar.b(rVar, i17).getSpacing300())), null, pictureData.getScaleType(), 0.0f, null, 0, rVar, 48, 232);
                p076m2.r rVar2 = rVar;
                MaskDefinition maskDefinition = pictureData.getMaskDefinition();
                if (maskDefinition == null) {
                    rVar2.X(-1249006611);
                    rVar2.R();
                } else {
                    rVar2.X(-1249006610);
                    kw3.d.d(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), maskDefinition, 0L, 0.0f, 0.0f, 0.0f, 0.0f, 0L, 0.0f, rVar, 6, 508);
                    rVar2 = rVar;
                    i0 i0Var2 = i0.f148189a;
                    rVar2.R();
                }
                f3.m mVarN2 = a3.n(xVar.d(companion, companion2.c()), aVar.b(rVar2, i17).getSpacing250());
                w0 w0VarI2 = d1.r.i(companion2.o(), false);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, 0));
                p076m2.e0 e0VarT3 = rVar2.t();
                f3.m mVarE3 = f3.j.e(rVar2, mVarN2);
                er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
                if (rVar2.l() == null) {
                    p076m2.m.d();
                }
                rVar2.K();
                if (rVar2.getInserting()) {
                    rVar2.H(aVarB3);
                } else {
                    rVar2.u();
                }
                p076m2.r rVarC3 = n6.c(rVar2);
                n6.i(rVarC3, w0VarI2, companion3.d());
                n6.i(rVarC3, e0VarT3, companion3.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
                n6.g(rVarC3, companion3.a());
                n6.i(rVarC3, mVarE3, companion3.e());
                h30.q.p(pictureData.getToggleMaskButtonData(), false, null, rVar2, 0, 6);
                rVar.x();
                i0 i0Var3 = i0.f148189a;
                rVar.R();
            }
            rVar.x();
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
    public static final i0 g(h.Data data, c5.r rVar) {
        data.b().b(new Rectangle((int) (rVar.getPackedValue() >> 32), (int) (rVar.getPackedValue() & BodyPartID.bodyIdMax)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(h.Data data, int i15, p076m2.r rVar, int i16) {
        e(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final h hVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(149121474);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(hVar) : rVarH.G(hVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(149121474, i16, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.preview.PreviewScreen (PreviewScreen.kt:36)");
            }
            e(j(m7.b.c(hVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ww3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.k(hVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final h.Data j(f6<h.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(h hVar, int i15, p076m2.r rVar, int i16) {
        i(hVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
