package i70;

import d1.a3;
import d1.c4;
import d1.g4;
import d1.v4;
import d1.x;
import er.q;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.al;
import p046f2.nk;
import p046f2.zk;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf2/al;", "snackBarHostState", "Li70/p;", "snackBarState", "", "usesWindowInsets", "Loq/i0;", "d", "(Lf2/al;Li70/p;ZLm2/r;II)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x009a  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    /* JADX WARN: Code duplicated, block: B:54:0x00de  */
    /* JADX WARN: Code duplicated, block: B:57:0x0146  */
    /* JADX WARN: Code duplicated, block: B:59:0x014b  */
    /* JADX WARN: Code duplicated, block: B:61:0x015a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0164  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void d(final al alVar, final p pVar, boolean z15, r rVar, final int i15, final int i16) {
        al alVar2;
        int i17;
        boolean z16;
        boolean z17;
        final boolean z18;
        d5 d5VarM;
        boolean z19;
        f3.m.Companion companion;
        f3.m mVarC;
        er.a<androidx.compose.ui.node.c> aVarB;
        r rVarH = rVar.h(-645448945);
        if ((i15 & 6) == 0) {
            alVar2 = alVar;
            i17 = (rVarH.W(alVar2) ? 4 : 2) | i15;
        } else {
            alVar2 = alVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= (i15 & 64) == 0 ? rVarH.W(pVar) : rVarH.G(pVar) ? 32 : 16;
        }
        int i18 = i16 & 4;
        if (i18 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                z16 = z15;
                i17 |= rVarH.a(z16) ? 256 : 128;
            }
            if ((i17 & 147) != 146) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i18 != 0) {
                    z19 = true;
                } else {
                    z19 = z16;
                }
                if (t.k()) {
                    t.o(-645448945, i17, -1, "pl.gov.coi.common.ui.snackBar.DefaultSnackBarHost (DefaultSnackBarHost.kt:22)");
                }
                companion = f3.m.INSTANCE;
                f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
                if (z19) {
                    rVarH.X(-1801137851);
                    mVarC = g4.c(companion, v4.c(c4.INSTANCE, rVarH, 6));
                    rVarH.R();
                } else {
                    if (!z19) {
                        rVarH.X(-1801139340);
                        rVarH.R();
                        throw new oq.p();
                    }
                    rVarH.X(-1801135657);
                    rVarH.R();
                    mVarC = companion;
                }
                f3.m mVarU = mVarF.u(mVarC);
                f3.c.Companion companion2 = f3.c.INSTANCE;
                w0 w0VarI = d1.r.i(companion2.o(), false);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, mVarU);
                androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion3.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC = n6.c(rVarH);
                n6.i(rVarC, w0VarI, companion3.d());
                n6.i(rVarC, e0VarT, companion3.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
                n6.g(rVarC, companion3.a());
                n6.i(rVarC, mVarE, companion3.e());
                zk.r(alVar2, x.f39368a.d(a3.n(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), companion2.b()), y2.m.d(1418159772, true, new q() { // from class: i70.a
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return d.e(pVar, (nk) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, (i17 & 14) | MLKEMEngine.KyberPolyBytes, 0);
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                z18 = z19;
            } else {
                rVarH.O();
                z18 = z16;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: i70.b
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return d.g(alVar, pVar, z18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        z16 = z15;
        if ((i17 & 147) != 146) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            if (i18 != 0) {
                z19 = true;
            } else {
                z19 = z16;
            }
            if (t.k()) {
                t.o(-645448945, i17, -1, "pl.gov.coi.common.ui.snackBar.DefaultSnackBarHost (DefaultSnackBarHost.kt:22)");
            }
            companion = f3.m.INSTANCE;
            f3.m mVarF2 = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            if (z19) {
                rVarH.X(-1801137851);
                mVarC = g4.c(companion, v4.c(c4.INSTANCE, rVarH, 6));
                rVarH.R();
            } else {
                if (!z19) {
                    rVarH.X(-1801139340);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1801135657);
                rVarH.R();
                mVarC = companion;
            }
            f3.m mVarU2 = mVarF2.u(mVarC);
            f3.c.Companion companion4 = f3.c.INSTANCE;
            w0 w0VarI2 = d1.r.i(companion4.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarU2);
            androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion5.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarI2, companion5.d());
            n6.i(rVarC2, e0VarT2, companion5.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion5.c());
            n6.g(rVarC2, companion5.a());
            n6.i(rVarC2, mVarE2, companion5.e());
            zk.r(alVar2, x.f39368a.d(a3.n(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), companion4.b()), y2.m.d(1418159772, true, new q() { // from class: i70.a
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d.e(pVar, (nk) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, (i17 & 14) | MLKEMEngine.KyberPolyBytes, 0);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
            z18 = z19;
        } else {
            rVarH.O();
            z18 = z16;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: i70.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.g(alVar, pVar, z18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(p pVar, final nk nkVar, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(nkVar) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(1418159772, i15, -1, "pl.gov.coi.common.ui.snackBar.DefaultSnackBarHost.<anonymous>.<anonymous> (DefaultSnackBarHost.kt:36)");
            }
            if (pVar instanceof p.Visible) {
                rVar.X(-1195433384);
                final p50.a snackBarData = ((p.Visible) pVar).getSnackBarData();
                if (snackBarData instanceof p50.a.Default) {
                    rVar.X(1346913561);
                    p50.f.d(snackBarData, rVar, 0);
                    rVar.R();
                } else {
                    if (!(snackBarData instanceof p50.a.DefaultWithIcon)) {
                        rVar.X(1346910954);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(1346916121);
                    p50.a.DefaultWithIcon defaultWithIcon = (p50.a.DefaultWithIcon) snackBarData;
                    boolean zW = rVar.W(snackBarData) | ((i15 & 14) == 4);
                    Object objE = rVar.E();
                    if (zW || objE == r.INSTANCE.a()) {
                        objE = new er.a() { // from class: i70.c
                            @Override // er.a
                            public final Object a() {
                                return d.f(snackBarData, nkVar);
                            }
                        };
                        rVar.v(objE);
                    }
                    p50.f.d(p50.a.DefaultWithIcon.h(defaultWithIcon, null, false, null, (er.a) objE, 7, null), rVar, 0);
                    rVar.R();
                }
                rVar.R();
            } else {
                rVar.X(1346922784);
                rVar.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(p50.a aVar, nk nkVar) {
        ((p50.a.DefaultWithIcon) aVar).j().a();
        nkVar.dismiss();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(al alVar, p pVar, boolean z15, int i15, int i16, r rVar, int i17) {
        d(alVar, pVar, z15, rVar, p076m2.g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
