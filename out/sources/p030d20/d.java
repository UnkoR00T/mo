package p030d20;

import androidx.compose.foundation.b;
import b1.f;
import b1.k;
import d1.x;
import d60.c;
import er.a;
import er.l;
import er.p;
import er.q;
import f3.j;
import f3.m;
import l3.g;
import l3.l0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t70.i;
import t70.s;
import w0.r1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aU\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e²\u0006\u000e\u0010\r\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Ld60/c;", "focusHost", "Ll3/g;", "focusDirection", "previousFocusDirection", "", "showRectBorder", "Lkotlin/Function1;", "Ll3/l0;", "Loq/i0;", "content", "d", "(Ld60/c;IIZLer/q;Lm2/r;II)V", "isInputFocused", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    /* JADX WARN: Code duplicated, block: B:100:0x015c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0184  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01df  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:114:0x021d  */
    /* JADX WARN: Code duplicated, block: B:117:0x023d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0243  */
    /* JADX WARN: Code duplicated, block: B:122:0x024d  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x0127  */
    /* JADX WARN: Code duplicated, block: B:94:0x014d  */
    /* JADX WARN: Code duplicated, block: B:95:0x014f  */
    public static final void d(final c cVar, int i15, int i16, boolean z15, final q<? super l<? super l0, i0>, ? super r, ? super Integer, i0> qVar, r rVar, final int i17, final int i18) {
        int i19;
        int iA;
        int iH;
        boolean z16;
        boolean z17;
        final int i25;
        final boolean z18;
        d5 d5VarM;
        Object objE;
        r.Companion companion;
        f6<Boolean> f6VarA;
        Object objE2;
        final a3 a3Var;
        boolean z19;
        m mVar;
        boolean z25;
        Object objE3;
        a<androidx.compose.ui.node.c> aVarB;
        Object objE4;
        int i26;
        r rVarH = rVar.h(1656529718);
        if ((i17 & 6) == 0) {
            i19 = (rVarH.W(cVar) ? 4 : 2) | i17;
        } else {
            i19 = i17;
        }
        if ((i17 & 48) == 0) {
            if ((i18 & 2) == 0) {
                iA = i15;
                int i27 = rVarH.c(iA) ? 32 : 16;
                i19 |= i27;
            } else {
                iA = i15;
            }
            i19 |= i27;
        } else {
            iA = i15;
        }
        if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i18 & 4) == 0) {
                iH = i16;
                int i28 = rVarH.c(iH) ? 256 : 128;
                i19 |= i28;
            } else {
                iH = i16;
            }
            i19 |= i28;
        } else {
            iH = i16;
        }
        int i29 = i18 & 8;
        if (i29 == 0) {
            if ((i17 & 3072) == 0) {
                z16 = z15;
                i19 |= rVarH.a(z16) ? 2048 : 1024;
            }
            if ((i17 & 24576) == 0) {
                if (rVarH.G(qVar)) {
                    i26 = 16384;
                } else {
                    i26 = PKIFailureInfo.certRevoked;
                }
                i19 |= i26;
            }
            if ((i19 & 9363) != 9362) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i19 & 1)) {
                rVarH.I();
                if ((i17 & 1) != 0 || rVarH.Q()) {
                    if ((i18 & 2) != 0) {
                        iA = g.INSTANCE.a();
                        i19 &= -113;
                    }
                    if ((i18 & 4) != 0) {
                        iH = g.INSTANCE.h();
                        i19 &= -897;
                    }
                    if (i29 != 0) {
                        z16 = true;
                    }
                } else {
                    rVarH.O();
                    if ((i18 & 2) != 0) {
                        i19 &= -113;
                    }
                    if ((i18 & 4) != 0) {
                        i19 &= -897;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1656529718, i19, -1, "pl.gov.coi.common.ui.accessibility.TextFieldFocusWrapper (TextFieldFocusWrapper.kt:28)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = k.a();
                    rVarH.v(objE);
                }
                b1.l lVar = (b1.l) objE;
                f6VarA = f.a(lVar, rVarH, 6);
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = c6.e(Boolean.FALSE, null, 2, null);
                    rVarH.v(objE2);
                }
                a3Var = (a3) objE2;
                m.Companion companion2 = m.INSTANCE;
                if (z16 || !(f6VarA.getValue().booleanValue() || e(a3Var))) {
                    z19 = false;
                } else {
                    z19 = true;
                }
                m mVarX = s.x(companion2, z19, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing150(), 0.0f, 4, null);
                mVar = companion2;
                r1 r1VarE = s.E(0.0f, rVarH, 0, 1);
                if ((i19 & 14) == 4) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                objE3 = rVarH.E();
                if (z25 || objE3 == companion.a()) {
                    objE3 = new a() { // from class: d20.a
                        @Override // er.a
                        public final Object a() {
                            return d.g(cVar, a3Var);
                        }
                    };
                    rVarH.v(objE3);
                }
                m mVarL = b.l(mVarX, lVar, r1VarE, false, null, null, (a) objE3, 28, null);
                if (f6VarA.getValue().booleanValue()) {
                    rVarH.X(503499349);
                    m mVarE = i.E(i.F(mVar, iH, rVarH, ((i19 >> 3) & 112) | 6), iA, rVarH, i19 & 112);
                    rVarH.R();
                    mVar = mVarE;
                } else {
                    rVarH.X(503651342);
                    rVarH.R();
                }
                m mVarU = mVarL.u(mVar);
                w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT = rVarH.t();
                m mVarE2 = j.e(rVarH, mVarU);
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
                n6.i(rVarC, mVarE2, companion3.e());
                x xVar = x.f39368a;
                objE4 = rVarH.E();
                if (objE4 == companion.a()) {
                    objE4 = new l() { // from class: d20.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return d.h(a3Var, (l0) obj);
                        }
                    };
                    rVarH.v(objE4);
                }
                qVar.w((l) objE4, rVarH, Integer.valueOf(((i19 >> 9) & 112) | 6));
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
            } else {
                rVarH.O();
            }
            i25 = iH;
            z18 = z16;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final int i35 = iA;
                d5VarM.a(new p() { // from class: d20.c
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return d.i(cVar, i35, i25, z18, qVar, i17, i18, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= 3072;
        z16 = z15;
        if ((i17 & 24576) == 0) {
            if (rVarH.G(qVar)) {
                i26 = 16384;
            } else {
                i26 = PKIFailureInfo.certRevoked;
            }
            i19 |= i26;
        }
        if ((i19 & 9363) != 9362) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i19 & 1)) {
            rVarH.I();
            if ((i17 & 1) != 0) {
                if ((i18 & 2) != 0) {
                    iA = g.INSTANCE.a();
                    i19 &= -113;
                }
                if ((i18 & 4) != 0) {
                    iH = g.INSTANCE.h();
                    i19 &= -897;
                }
                if (i29 != 0) {
                    z16 = true;
                }
            } else {
                if ((i18 & 2) != 0) {
                    iA = g.INSTANCE.a();
                    i19 &= -113;
                }
                if ((i18 & 4) != 0) {
                    iH = g.INSTANCE.h();
                    i19 &= -897;
                }
                if (i29 != 0) {
                    z16 = true;
                }
            }
            rVarH.y();
            if (t.k()) {
                t.o(1656529718, i19, -1, "pl.gov.coi.common.ui.accessibility.TextFieldFocusWrapper (TextFieldFocusWrapper.kt:28)");
            }
            objE = rVarH.E();
            companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = k.a();
                rVarH.v(objE);
            }
            b1.l lVar2 = (b1.l) objE;
            f6VarA = f.a(lVar2, rVarH, 6);
            objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = c6.e(Boolean.FALSE, null, 2, null);
                rVarH.v(objE2);
            }
            a3Var = (a3) objE2;
            m.Companion companion4 = m.INSTANCE;
            if (z16) {
                z19 = false;
            } else {
                z19 = false;
            }
            m mVarX2 = s.x(companion4, z19, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing150(), 0.0f, 4, null);
            mVar = companion4;
            r1 r1VarE2 = s.E(0.0f, rVarH, 0, 1);
            if ((i19 & 14) == 4) {
                z25 = true;
            } else {
                z25 = false;
            }
            objE3 = rVarH.E();
            if (z25) {
                objE3 = new a() { // from class: d20.a
                    @Override // er.a
                    public final Object a() {
                        return d.g(cVar, a3Var);
                    }
                };
                rVarH.v(objE3);
            } else {
                objE3 = new a() { // from class: d20.a
                    @Override // er.a
                    public final Object a() {
                        return d.g(cVar, a3Var);
                    }
                };
                rVarH.v(objE3);
            }
            m mVarL2 = b.l(mVarX2, lVar2, r1VarE2, false, null, null, (a) objE3, 28, null);
            if (f6VarA.getValue().booleanValue()) {
                rVarH.X(503499349);
                m mVarE3 = i.E(i.F(mVar, iH, rVarH, ((i19 >> 3) & 112) | 6), iA, rVarH, i19 & 112);
                rVarH.R();
                mVar = mVarE3;
            } else {
                rVarH.X(503651342);
                rVarH.R();
            }
            m mVarU2 = mVarL2.u(mVar);
            w0 w0VarI2 = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            m mVarE4 = j.e(rVarH, mVarU2);
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
            n6.i(rVarC2, mVarE4, companion5.e());
            x xVar2 = x.f39368a;
            objE4 = rVarH.E();
            if (objE4 == companion.a()) {
                objE4 = new l() { // from class: d20.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return d.h(a3Var, (l0) obj);
                    }
                };
                rVarH.v(objE4);
            }
            qVar.w((l) objE4, rVarH, Integer.valueOf(((i19 >> 9) & 112) | 6));
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        i25 = iH;
        z18 = z16;
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            final int i36 = iA;
            d5VarM.a(new p() { // from class: d20.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.i(cVar, i36, i25, z18, qVar, i17, i18, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean e(a3<Boolean> a3Var) {
        return a3Var.getValue().booleanValue();
    }

    private static final void f(a3<Boolean> a3Var, boolean z15) {
        a3Var.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(c cVar, a3 a3Var) {
        f(a3Var, true);
        cVar.l();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(a3 a3Var, l0 l0Var) {
        if (!l0Var.b()) {
            f(a3Var, false);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(c cVar, int i15, int i16, boolean z15, q qVar, int i17, int i18, r rVar, int i19) {
        d(cVar, i15, i16, z15, qVar, rVar, g4.a(i17 | 1), i18);
        return i0.f148189a;
    }
}
