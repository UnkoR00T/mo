package my1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import cb4.DialogData;
import fr.q0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lmy1/w;", "sharedViewModel", "Lkotlin/Function2;", "Llw1/a;", "Lpy1/c;", "Loq/i0;", "goToEntryDestinationWithResult", "Lkotlin/Function1;", "Lcb4/d;", "showDialog", "Lkotlin/Function0;", "onClose", "o", "(Lmy1/w;Ler/p;Ler/l;Ler/a;Lm2/r;I)V", "eidservices_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class o {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ny1.x A(w wVar, ny1.x.a aVar) {
        return aVar.a(wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(er.a aVar, f00.s sVar, er.p pVar, w wVar, er.l lVar, ny1.c.f fVar) {
        if (fr.t.c(fVar, ny1.c.f.b.f139510a)) {
            aVar.a();
        } else if (fr.t.c(fVar, ny1.c.f.a.f139509a)) {
            sVar.c();
        } else if (fVar instanceof ny1.c.f.EndProcessWithResult) {
            pVar.B(wVar.j4().getEntryDestination(), ((ny1.c.f.EndProcessWithResult) fVar).getResult());
        } else if (fVar instanceof ny1.c.f.ShowDialog) {
            lVar.b(((ny1.c.f.ShowDialog) fVar).getDialogData());
        } else if (fr.t.c(fVar, ny1.c.f.d.f139512a)) {
            iy.b0.Companion companion = iy.b0.INSTANCE;
            wVar.Z(companion.a());
            wVar.F2(companion.a());
            wVar.t2(companion.a());
            lw1.a.j.C2949a c2949a = lw1.a.j.C2949a.f120647b;
            wVar.n4(c2949a);
            sVar.k(c2949a, lw1.a.j.c.f120649b);
        } else {
            if (!fr.t.c(fVar, ny1.c.f.e.f139513a)) {
                throw new oq.p();
            }
            iy.b0.Companion companion2 = iy.b0.INSTANCE;
            wVar.F2(companion2.a());
            wVar.t2(companion2.a());
            zx.c<oq.i0> cVar = lw1.a.j.c.f120649b;
            sVar.k(cVar, cVar);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(w wVar, er.p pVar, er.l lVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        o(wVar, pVar, lVar, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void o(final w wVar, final er.p<? super lw1.a, ? super py1.c, oq.i0> pVar, final er.l<? super DialogData, oq.i0> lVar, final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        er.p<? super lw1.a, ? super py1.c, oq.i0> pVar2;
        er.l<? super DialogData, oq.i0> lVar2;
        er.a<oq.i0> aVar2;
        final f00.s sVar;
        Object obj;
        p076m2.r rVarH = rVar.h(1021608514);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(wVar) : rVarH.G(wVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            pVar2 = pVar;
            i16 |= rVarH.G(pVar2) ? 32 : 16;
        } else {
            pVar2 = pVar;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            lVar2 = lVar;
            i16 |= rVarH.G(lVar2) ? 256 : 128;
        } else {
            lVar2 = lVar;
        }
        if ((i15 & 3072) == 0) {
            aVar2 = aVar;
            i16 |= rVarH.G(aVar2) ? 2048 : 1024;
        } else {
            aVar2 = aVar;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1021608514, i16, -1, "pl.gov.coi.mobywatel.feature.eidservices.resetpin.ResetPinSharedNavContent (ResetPinSharedNavContent.kt:32)");
            }
            f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            lw1.a firstScreenInFlow = wVar.j4().getFirstScreenInFlow();
            boolean zG = ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(wVar))) | ((i16 & 7168) == 2048) | rVarH.G(sVarJ) | ((i16 & 896) == 256) | ((i16 & 112) == 32);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                sVar = sVarJ;
                final er.p<? super lw1.a, ? super py1.c, oq.i0> pVar3 = pVar2;
                final er.l<? super DialogData, oq.i0> lVar3 = lVar2;
                final er.a<oq.i0> aVar3 = aVar2;
                obj = new er.l() { // from class: my1.a
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return o.p(wVar, aVar3, sVar, lVar3, pVar3, (d1) obj2);
                    }
                };
                rVarH.v(obj);
            } else {
                sVar = sVarJ;
                obj = objE;
            }
            f00.d0.j(sVar, firstScreenInFlow, (er.l) obj, rVarH, f00.s.f54562e);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: my1.f
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return o.C(wVar, pVar, lVar, aVar, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(final w wVar, final er.a aVar, final f00.s sVar, final er.l lVar, final er.p pVar, d1 d1Var) {
        f00.r.u(d1Var, lw1.a.j.c.f120649b, null, y2.m.b(313519747, true, new er.r() { // from class: my1.g
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return o.q(wVar, aVar, sVar, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, lw1.a.j.C2949a.f120647b, null, y2.m.b(1214877292, true, new er.r() { // from class: my1.h
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return o.t(wVar, aVar, sVar, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, lw1.a.j.b.f120648b, null, y2.m.b(1660414603, true, new er.r() { // from class: my1.i
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return o.w(wVar, sVar, aVar, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, lw1.a.j.d.f120650b, null, y2.m.b(2105951914, true, new er.r() { // from class: my1.j
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return o.z(wVar, aVar, sVar, pVar, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(final w wVar, final er.a aVar, final f00.s sVar, final er.l lVar, p114t0.f fVar, p136y9.w wVar2, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(313519747, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.resetpin.ResetPinSharedNavContent.<anonymous>.<anonymous>.<anonymous> (ResetPinSharedNavContent.kt:40)");
        }
        boolean zG = rVar.G(wVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: my1.d
                @Override // er.l
                public final Object b(Object obj) {
                    return o.r(wVar, (fx1.o.a) obj);
                }
            };
            rVar.v(objE);
        }
        fx1.o oVar = (fx1.o) q7.d.c(q0.c(fx1.o.class), wVar2, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar2.w()), kq.a.b(wVar2.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<fx1.a.c> bVarY1 = oVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar) | rVar.G(wVar) | rVar.W(lVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: my1.e
                @Override // er.l
                public final Object b(Object obj) {
                    return o.s(aVar, sVar, wVar, lVar, (fx1.a.c) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        fx1.k.f(oVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fx1.o r(w wVar, fx1.o.a aVar) {
        return aVar.a(wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(er.a aVar, f00.s sVar, w wVar, er.l lVar, fx1.a.c cVar) {
        if (fr.t.c(cVar, fx1.a.c.b.f68600a)) {
            aVar.a();
        } else if (fr.t.c(cVar, fx1.a.c.C1535a.f68599a)) {
            sVar.c();
        } else if (cVar instanceof fx1.a.c.Next) {
            wVar.F2(((fx1.a.c.Next) cVar).getPuk());
            f00.s.m(sVar, lw1.a.j.b.f120648b, null, 2, null);
        } else {
            if (!(cVar instanceof fx1.a.c.ShowDialog)) {
                throw new oq.p();
            }
            lVar.b(((fx1.a.c.ShowDialog) cVar).getDialogData());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(final w wVar, final er.a aVar, final f00.s sVar, final er.l lVar, p114t0.f fVar, p136y9.w wVar2, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1214877292, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.resetpin.ResetPinSharedNavContent.<anonymous>.<anonymous>.<anonymous> (ResetPinSharedNavContent.kt:64)");
        }
        boolean zG = rVar.G(wVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: my1.m
                @Override // er.l
                public final Object b(Object obj) {
                    return o.u(wVar, (sw1.o.a) obj);
                }
            };
            rVar.v(objE);
        }
        sw1.o oVar = (sw1.o) q7.d.c(q0.c(sw1.o.class), wVar2, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar2.w()), kq.a.b(wVar2.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<sw1.a.d> bVarY1 = oVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar) | rVar.G(wVar) | rVar.W(lVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: my1.n
                @Override // er.l
                public final Object b(Object obj) {
                    return o.v(aVar, sVar, wVar, lVar, (sw1.a.d) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        sw1.k.f(oVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sw1.o u(w wVar, sw1.o.a aVar) {
        return aVar.a(wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(er.a aVar, f00.s sVar, w wVar, er.l lVar, sw1.a.d dVar) {
        if (fr.t.c(dVar, sw1.a.d.b.f184880a)) {
            aVar.a();
        } else if (fr.t.c(dVar, sw1.a.d.C4776a.f184879a)) {
            sVar.c();
        } else if (dVar instanceof sw1.a.d.Next) {
            wVar.Z(((sw1.a.d.Next) dVar).getCan());
            f00.s.m(sVar, lw1.a.j.c.f120649b, null, 2, null);
        } else {
            if (!(dVar instanceof sw1.a.d.ShowDialog)) {
                throw new oq.p();
            }
            lVar.b(((sw1.a.d.ShowDialog) dVar).getDialogData());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(final w wVar, final f00.s sVar, final er.a aVar, final er.l lVar, p114t0.f fVar, p136y9.w wVar2, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1660414603, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.resetpin.ResetPinSharedNavContent.<anonymous>.<anonymous>.<anonymous> (ResetPinSharedNavContent.kt:88)");
        }
        boolean zG = rVar.G(wVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: my1.k
                @Override // er.l
                public final Object b(Object obj) {
                    return o.x(wVar, (zw1.r.a) obj);
                }
            };
            rVar.v(objE);
        }
        zw1.r rVar2 = (zw1.r) q7.d.c(q0.c(zw1.r.class), wVar2, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar2.w()), kq.a.b(wVar2.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<zw1.a.c> bVarY1 = rVar2.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(aVar) | rVar.G(wVar) | rVar.W(lVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: my1.l
                @Override // er.l
                public final Object b(Object obj) {
                    return o.y(sVar, aVar, wVar, lVar, (zw1.a.c) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        zw1.m.h(rVar2, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zw1.r x(w wVar, zw1.r.a aVar) {
        return aVar.a(wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(f00.s sVar, er.a aVar, w wVar, er.l lVar, zw1.a.c cVar) {
        if (fr.t.c(cVar, zw1.a.c.C6432a.f238113a)) {
            sVar.c();
        } else if (fr.t.c(cVar, zw1.a.c.b.f238114a)) {
            aVar.a();
        } else if (cVar instanceof zw1.a.c.Next) {
            wVar.t2(((zw1.a.c.Next) cVar).getNewPin());
            f00.s.m(sVar, lw1.a.j.d.f120650b, null, 2, null);
        } else {
            if (!(cVar instanceof zw1.a.c.ShowDialog)) {
                throw new oq.p();
            }
            lVar.b(((zw1.a.c.ShowDialog) cVar).getDialogData());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(final w wVar, final er.a aVar, final f00.s sVar, final er.p pVar, final er.l lVar, p114t0.f fVar, p136y9.w wVar2, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2105951914, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.resetpin.ResetPinSharedNavContent.<anonymous>.<anonymous>.<anonymous> (ResetPinSharedNavContent.kt:112)");
        }
        boolean zG = rVar.G(wVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: my1.b
                @Override // er.l
                public final Object b(Object obj) {
                    return o.A(wVar, (ny1.x.a) obj);
                }
            };
            rVar.v(objE);
        }
        ny1.x xVar = (ny1.x) q7.d.c(q0.c(ny1.x.class), wVar2, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar2.w()), kq.a.b(wVar2.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<ny1.c.f> bVarY1 = xVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar) | rVar.W(pVar) | rVar.G(wVar) | rVar.W(lVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            er.l lVar2 = new er.l() { // from class: my1.c
                @Override // er.l
                public final Object b(Object obj) {
                    return o.B(aVar, sVar, pVar, wVar, lVar, (ny1.c.f) obj);
                }
            };
            rVar.v(lVar2);
            objE2 = lVar2;
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        ny1.n.j(xVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }
}
