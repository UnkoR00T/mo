package nd1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import er.p;
import f00.d0;
import f00.f0;
import f00.s;
import fr.q0;
import ld1.SearchModel;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p136y9.d1;
import p136y9.w;
import sd1.z;
import ud1.v;
import wd1.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ai\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lod1/a;", "contract", "Lkotlin/Function0;", "Loq/i0;", "onResultAction", "onCloseAction", "onBackAction", "Lkotlin/Function1;", "Lld1/m;", "onSearchAction", "Ljb4/b;", "onErrorAction", "l", "(Lod1/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;Lm2/r;I)V", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class o {
    public static final void l(final od1.a aVar, final er.a<i0> aVar2, final er.a<i0> aVar3, final er.a<i0> aVar4, final er.l<? super SearchModel, i0> lVar, final er.l<? super jb4.b, i0> lVar2, r rVar, final int i15) {
        int i16;
        er.a<i0> aVar5;
        er.a<i0> aVar6;
        er.a<i0> aVar7;
        er.l<? super SearchModel, i0> lVar3;
        er.l<? super jb4.b, i0> lVar4;
        final s sVar;
        Object obj;
        r rVarH = rVar.h(-66228201);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            aVar5 = aVar2;
            i16 |= rVarH.G(aVar5) ? 32 : 16;
        } else {
            aVar5 = aVar2;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            aVar6 = aVar3;
            i16 |= rVarH.G(aVar6) ? 256 : 128;
        } else {
            aVar6 = aVar3;
        }
        if ((i15 & 3072) == 0) {
            aVar7 = aVar4;
            i16 |= rVarH.G(aVar7) ? 2048 : 1024;
        } else {
            aVar7 = aVar4;
        }
        if ((i15 & 24576) == 0) {
            lVar3 = lVar;
            i16 |= rVarH.G(lVar3) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            lVar3 = lVar;
        }
        if ((196608 & i15) == 0) {
            lVar4 = lVar2;
            i16 |= rVarH.G(lVar4) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        } else {
            lVar4 = lVar2;
        }
        if (rVarH.r((i16 & 74899) != 74898, i16 & 1)) {
            if (t.k()) {
                t.o(-66228201, i16, -1, "pl.gov.coi.mobywatel.feature.companycommon.edoraddress.EdorAddressGraph (EdorAddressGraph.kt:29)");
            }
            s sVarJ = f00.r.J(null, rVarH, 0, 1);
            c cVar = c.f134300a;
            boolean zG = ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(aVar))) | ((i16 & 7168) == 2048) | rVarH.G(sVarJ) | ((i16 & 896) == 256) | ((i16 & 112) == 32) | ((57344 & i16) == 16384) | ((i16 & 458752) == 131072);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                sVar = sVarJ;
                final er.a<i0> aVar8 = aVar5;
                final er.a<i0> aVar9 = aVar6;
                final er.a<i0> aVar10 = aVar7;
                final er.l<? super SearchModel, i0> lVar5 = lVar3;
                final er.l<? super jb4.b, i0> lVar6 = lVar4;
                obj = new er.l() { // from class: nd1.d
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return o.m(aVar, aVar10, sVar, aVar9, aVar8, lVar5, lVar6, (d1) obj2);
                    }
                };
                rVarH.v(obj);
            } else {
                sVar = sVarJ;
                obj = objE;
            }
            d0.j(sVar, cVar, (er.l) obj, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: nd1.f
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return o.w(aVar, aVar2, aVar3, aVar4, lVar, lVar2, i15, (r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(final od1.a aVar, final er.a aVar2, final s sVar, final er.a aVar3, final er.a aVar4, final er.l lVar, final er.l lVar2, d1 d1Var) {
        f00.r.u(d1Var, c.f134300a, null, y2.m.b(451539510, true, new er.r() { // from class: nd1.g
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return o.n(aVar, aVar2, sVar, aVar3, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.f134296a, null, y2.m.b(117575597, true, new er.r() { // from class: nd1.h
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return o.q(aVar, sVar, aVar4, aVar3, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, b.f134298a, null, y2.m.b(-883480274, true, new er.r() { // from class: nd1.i
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return o.t(aVar, sVar, aVar4, lVar, lVar2, aVar3, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(final od1.a aVar, final er.a aVar2, final s sVar, final er.a aVar3, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(451539510, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.edoraddress.EdorAddressGraph.<anonymous>.<anonymous>.<anonymous> (EdorAddressGraph.kt:36)");
        }
        boolean zG = rVar.G(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.l() { // from class: nd1.l
                @Override // er.l
                public final Object b(Object obj) {
                    return o.o(aVar, (x.a) obj);
                }
            };
            rVar.v(objE);
        }
        x xVar = (x) q7.d.c(q0.c(x.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<wd1.d> bVarY1 = xVar.Y1();
        boolean zW = rVar.W(aVar2) | rVar.G(sVar) | rVar.W(aVar3);
        Object objE2 = rVar.E();
        if (zW || objE2 == r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: nd1.m
                @Override // er.l
                public final Object b(Object obj) {
                    return o.p(aVar2, sVar, aVar3, (wd1.d) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        wd1.r.m(xVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x o(od1.a aVar, x.a aVar2) {
        return aVar2.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(er.a aVar, s sVar, er.a aVar2, wd1.d dVar) {
        if (fr.t.c(dVar, wd1.d.a.f212377a)) {
            aVar.a();
        } else if (fr.t.c(dVar, wd1.d.c.f212379a)) {
            s.i(sVar, a.f134296a, null, null, 6, null);
        } else if (fr.t.c(dVar, wd1.d.C5597d.f212380a)) {
            s.i(sVar, b.f134298a, null, null, 6, null);
        } else {
            if (!fr.t.c(dVar, wd1.d.b.f212378a)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(final od1.a aVar, final s sVar, final er.a aVar2, final er.a aVar3, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(117575597, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.edoraddress.EdorAddressGraph.<anonymous>.<anonymous>.<anonymous> (EdorAddressGraph.kt:62)");
        }
        boolean zG = rVar.G(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.l() { // from class: nd1.j
                @Override // er.l
                public final Object b(Object obj) {
                    return o.r(aVar, (z.a) obj);
                }
            };
            rVar.v(objE);
        }
        z zVar = (z) q7.d.c(q0.c(z.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<sd1.c> bVarY1 = zVar.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(aVar2) | rVar.W(aVar3);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: nd1.k
                @Override // er.l
                public final Object b(Object obj) {
                    return o.s(sVar, aVar2, aVar3, (sd1.c) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        sd1.r.k(zVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z r(od1.a aVar, z.a aVar2) {
        return aVar2.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(s sVar, er.a aVar, er.a aVar2, sd1.c cVar) {
        if (fr.t.c(cVar, sd1.c.a.f180286a)) {
            sVar.c();
        } else if (fr.t.c(cVar, sd1.c.C4644c.f180288a)) {
            aVar.a();
        } else {
            if (!fr.t.c(cVar, sd1.c.b.f180287a)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(final od1.a aVar, final s sVar, final er.a aVar2, final er.l lVar, final er.l lVar2, final er.a aVar3, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-883480274, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.edoraddress.EdorAddressGraph.<anonymous>.<anonymous>.<anonymous> (EdorAddressGraph.kt:81)");
        }
        boolean zG = rVar.G(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.l() { // from class: nd1.n
                @Override // er.l
                public final Object b(Object obj) {
                    return o.u(aVar, (v.a) obj);
                }
            };
            rVar.v(objE);
        }
        v vVar = (v) q7.d.c(q0.c(v.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<ud1.b.e> bVarY1 = vVar.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(aVar2) | rVar.W(lVar) | rVar.W(lVar2) | rVar.W(aVar3);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == r.INSTANCE.a()) {
            er.l lVar3 = new er.l() { // from class: nd1.e
                @Override // er.l
                public final Object b(Object obj) {
                    return o.v(sVar, aVar2, lVar, lVar2, aVar3, (ud1.b.e) obj);
                }
            };
            rVar.v(lVar3);
            objE2 = lVar3;
        }
        f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        ud1.n.k(vVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v u(od1.a aVar, v.a aVar2) {
        return aVar2.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(s sVar, er.a aVar, er.l lVar, er.l lVar2, er.a aVar2, ud1.b.e eVar) {
        if (fr.t.c(eVar, ud1.b.e.a.f197619a)) {
            sVar.c();
        } else if (fr.t.c(eVar, ud1.b.e.C5135e.f197623a)) {
            aVar.a();
        } else if (eVar instanceof ud1.b.e.GoToSearch) {
            lVar.b(((ud1.b.e.GoToSearch) eVar).getModel());
        } else if (eVar instanceof ud1.b.e.Error) {
            lVar2.b(((ud1.b.e.Error) eVar).getErrorData());
        } else {
            if (!fr.t.c(eVar, ud1.b.e.C5134b.f197620a)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(od1.a aVar, er.a aVar2, er.a aVar3, er.a aVar4, er.l lVar, er.l lVar2, int i15, r rVar, int i16) {
        l(aVar, aVar2, aVar3, aVar4, lVar, lVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
