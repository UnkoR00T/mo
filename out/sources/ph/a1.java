package ph;

import androidx.compose.ui.platform.t2;
import d1.a3;
import d1.d3;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.C6457hh;
import p046f2.C6461wc;
import p046f2.Function0;
import p046f2.di;
import p046f2.oo;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.x5;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 {
    public static final void a(final e0 e0Var, final String str, final er.a aVar, final er.l lVar, final boolean z15, p076m2.r rVar, final int i15, int i16) {
        e0 e0Var2;
        int i17;
        p076m2.r rVar2;
        int i18 = i15 & 6;
        p076m2.r rVarH = rVar.h(1046837766);
        if (i18 == 0) {
            e0Var2 = e0Var;
            i17 = (true != rVarH.G(e0Var2) ? 2 : 4) | i15;
        } else {
            e0Var2 = e0Var;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= true != rVarH.W(str) ? 16 : 32;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= true != rVarH.G(aVar) ? 128 : 256;
        }
        if ((i15 & 3072) == 0) {
            i17 |= true != rVarH.G(lVar) ? 1024 : 2048;
        }
        if ((i15 & 24576) == 0) {
            i17 |= true != rVarH.a(z15) ? PKIFailureInfo.certRevoked : 16384;
        }
        if (rVarH.r((i17 & 9363) != 9362, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0 && !rVarH.Q()) {
                rVarH.O();
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(1046837766, i17, -1, "com.google.android.gms.oss.licenses.v2.LicenseListScreen (LicenseListScreen.kt:55)");
            }
            final f6 f6VarB = x5.b(e0Var2.a9(), null, rVarH, 0, 1);
            rVar2 = rVarH;
            di.l(null, y2.m.d(911352778, true, new er.p() { // from class: ph.z0
                @Override // er.p
                public final /* synthetic */ Object B(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    p076m2.r rVar3 = (p076m2.r) obj;
                    if (rVar3.r((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (p076m2.t.k()) {
                            p076m2.t.o(911352778, iIntValue, -1, "com.google.android.gms.oss.licenses.v2.LicenseListScreen.<anonymous> (LicenseListScreen.kt:60)");
                        }
                        final String str2 = str;
                        final er.a aVar2 = aVar;
                        Function0.y(y2.m.d(1620876422, true, new er.p() { // from class: ph.w0
                            @Override // er.p
                            public final /* synthetic */ Object B(Object obj3, Object obj4) {
                                int iIntValue2 = ((Integer) obj4).intValue();
                                p076m2.r rVar4 = (p076m2.r) obj3;
                                if (rVar4.r((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                    if (p076m2.t.k()) {
                                        p076m2.t.o(1620876422, iIntValue2, -1, "com.google.android.gms.oss.licenses.v2.LicenseListScreen.<anonymous>.<anonymous> (LicenseListScreen.kt:61)");
                                    }
                                    String strA = str2;
                                    if (strA == null) {
                                        rVar4.X(-1410886352);
                                        strA = l4.f.a(oh.d.f145735e, rVar4, 0);
                                    } else {
                                        rVar4.X(-1410886631);
                                    }
                                    rVar4.R();
                                    oo.j(strA, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar4, 0, 0, 262142);
                                    if (p076m2.t.k()) {
                                        p076m2.t.n();
                                    }
                                } else {
                                    rVar4.O();
                                }
                                return oq.i0.f148189a;
                            }
                        }, rVar3, 54), null, y2.m.d(-453144380, true, new er.p() { // from class: ph.x0
                            @Override // er.p
                            public final /* synthetic */ Object B(Object obj3, Object obj4) {
                                int iIntValue2 = ((Integer) obj4).intValue();
                                p076m2.r rVar4 = (p076m2.r) obj3;
                                if (rVar4.r((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                    if (p076m2.t.k()) {
                                        p076m2.t.o(-453144380, iIntValue2, -1, "com.google.android.gms.oss.licenses.v2.LicenseListScreen.<anonymous>.<anonymous> (LicenseListScreen.kt:63)");
                                    }
                                    C6461wc.c(aVar2, t2.a(f3.m.INSTANCE, "LicenseListNavigationIcon"), false, null, null, null, g0.a(), rVar4, 1572912, 60);
                                    if (p076m2.t.k()) {
                                        p076m2.t.n();
                                    }
                                } else {
                                    rVar4.O();
                                }
                                return oq.i0.f148189a;
                            }
                        }, rVar3, 54), null, 0.0f, null, null, null, null, rVar3, 390, 506);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                    } else {
                        rVar3.O();
                    }
                    return oq.i0.f148189a;
                }
            }, rVarH, 54), null, null, null, 0, 0L, 0L, null, y2.m.d(-1349056427, true, new er.q() { // from class: ph.u0
                @Override // er.q
                public final /* synthetic */ Object w(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    p076m2.r rVar3 = (p076m2.r) obj2;
                    d3 d3Var = (d3) obj;
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != rVar3.W(d3Var) ? 2 : 4;
                    }
                    if (rVar3.r((iIntValue & 19) != 18, iIntValue & 1)) {
                        if (p076m2.t.k()) {
                            p076m2.t.o(-1349056427, iIntValue, -1, "com.google.android.gms.oss.licenses.v2.LicenseListScreen.<anonymous> (LicenseListScreen.kt:76)");
                        }
                        f3.m.Companion companion = f3.m.INSTANCE;
                        f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null);
                        f3.c.Companion companion2 = f3.c.INSTANCE;
                        p036e4.w0 w0VarI = d1.r.i(companion2.o(), false);
                        int iHashCode = Long.hashCode(p076m2.m.b(rVar3, 0));
                        p076m2.e0 e0VarT = rVar3.t();
                        f3.m mVarE = f3.j.e(rVar3, mVarF);
                        androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
                        er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
                        if (rVar3.l() == null) {
                            p076m2.m.d();
                        }
                        rVar3.K();
                        if (rVar3.getInserting()) {
                            rVar3.H(aVarB);
                        } else {
                            rVar3.u();
                        }
                        boolean z16 = z15;
                        p076m2.r rVarC = n6.c(rVar3);
                        n6.i(rVarC, w0VarI, companion3.d());
                        n6.i(rVarC, e0VarT, companion3.f());
                        n6.e(rVarC, Integer.valueOf(iHashCode), companion3.c());
                        n6.g(rVarC, companion3.a());
                        n6.i(rVarC, mVarE, companion3.e());
                        d1.x xVar = d1.x.f39368a;
                        if (z16) {
                            f6 f6Var = f6VarB;
                            rVar3.X(1047958438);
                            final z zVar = (z) f6Var.getValue();
                            if (zVar instanceof y) {
                                rVar3.X(1047999699);
                                C6457hh.j(xVar.d(companion, companion2.e()), 0L, 0.0f, 0L, 0, 0.0f, rVar3, 0, 62);
                                rVar3 = rVar3;
                                rVar3.R();
                            } else if (zVar instanceof v) {
                                rVar3.X(1048152746);
                                oo.j(((v) zVar).a(), xVar.d(companion, companion2.e()), androidx.compose.material3.d.f9816a.a(rVar3, androidx.compose.material3.d.f9817b).getError(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar3, 0, 0, 262136);
                                rVar3 = rVar3;
                                rVar3.R();
                            } else {
                                if (!(zVar instanceof w)) {
                                    rVar3.X(1280731100);
                                    rVar3.R();
                                    throw new oq.p();
                                }
                                final er.l lVar2 = lVar;
                                rVar3.X(1048388656);
                                f3.m mVarF2 = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
                                boolean zG = rVar3.G(zVar) | rVar3.W(lVar2);
                                Object objE = rVar3.E();
                                if (zG || objE == p076m2.r.INSTANCE.a()) {
                                    objE = new er.l() { // from class: ph.y0
                                        @Override // er.l
                                        public final /* synthetic */ Object b(Object obj4) {
                                            z zVar2 = zVar;
                                            List listA = ((w) zVar2).a();
                                            ((f1.q0) obj4).j(listA.size(), null, new s0(listA), y2.m.b(2039820996, true, new t0(listA, lVar2, zVar2)));
                                            return oq.i0.f148189a;
                                        }
                                    };
                                    rVar3.v(objE);
                                }
                                f1.d.c(mVarF2, null, null, false, null, null, null, false, null, (er.l) objE, rVar3, 6, 510);
                                rVar3.R();
                            }
                            rVar3.R();
                        } else {
                            rVar3.X(1047762394);
                            oo.j(l4.f.a(oh.d.f145734d, rVar3, 0), xVar.d(companion, companion2.e()), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar3, 0, 0, 262140);
                            rVar3 = rVar3;
                            rVar3.R();
                        }
                        rVar3.x();
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                    } else {
                        rVar3.O();
                    }
                    return oq.i0.f148189a;
                }
            }, rVarH, 54), rVar2, 805306416, 509);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            final int i19 = 0;
            d5VarM.a(new er.p(str, aVar, lVar, z15, i15, i19) { // from class: ph.v0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final /* synthetic */ String f157626b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final /* synthetic */ er.a f157627c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private final /* synthetic */ er.l f157628d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private final /* synthetic */ boolean f157629e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private final /* synthetic */ int f157630f;

                @Override // er.p
                public final /* synthetic */ Object B(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a1.a(this.f157625a, this.f157626b, this.f157627c, this.f157628d, this.f157629e, (p076m2.r) obj, g4.a(this.f157630f | 1), 0);
                    return oq.i0.f148189a;
                }
            });
        }
    }
}
