package m30;

import d1.e0;
import d1.i0;
import java.util.Iterator;
import l3.d0;
import n30.CardListData;
import n4.v;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln30/b;", "data", "Ll3/d0;", "focusRequester", "", "focusRequesterIndex", "Loq/i0;", "d", "(Ln30/b;Ll3/d0;Ljava/lang/Integer;Lm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:51:0x00be  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:55:0x0105  */
    /* JADX WARN: Code duplicated, block: B:58:0x0112  */
    /* JADX WARN: Code duplicated, block: B:61:0x014c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0158  */
    /* JADX WARN: Code duplicated, block: B:65:0x015c  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void d(final CardListData cardListData, d0 d0Var, Integer num, r rVar, final int i15, final int i16) {
        int i17;
        final d0 d0Var2;
        int i18;
        final Integer num2;
        int i19;
        boolean z15;
        final Integer num3;
        d5 d5VarM;
        f3.m.Companion companion;
        er.a<androidx.compose.ui.node.c> aVarB;
        f3.m mVarB;
        Object objE;
        er.a<androidx.compose.ui.node.c> aVarB2;
        r rVarH = rVar.h(-1111905450);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(cardListData) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i25 = i16 & 2;
        if (i25 == 0) {
            if ((i15 & 48) == 0) {
                d0Var2 = d0Var;
                i17 |= rVarH.W(d0Var2) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    num2 = num;
                    if (rVarH.W(num2)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                if ((i17 & 147) != 146) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i25 != 0) {
                        d0Var2 = null;
                    }
                    if (i18 != 0) {
                        num2 = null;
                    }
                    if (t.k()) {
                        t.o(-1111905450, i17, -1, "pl.gov.coi.common.ui.ds.cardlist.ColumnCardList (ColumnCardList.kt:28)");
                    }
                    companion = f3.m.INSTANCE;
                    f3.m mVarE = d60.m.e(companion, cardListData.getFieldIndex(), rVarH, 6);
                    d1.i iVar = d1.i.f39152a;
                    d1.i.n nVarK = iVar.k();
                    f3.c.Companion companion2 = f3.c.INSTANCE;
                    w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
                    int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT = rVarH.t();
                    f3.m mVarE2 = f3.j.e(rVarH, mVarE);
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
                    n6.i(rVarC, w0VarA, companion3.d());
                    n6.i(rVarC, e0VarT, companion3.f());
                    n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
                    n6.g(rVarC, companion3.a());
                    n6.i(rVarC, mVarE2, companion3.e());
                    i0 i0Var = i0.f39176a;
                    if (cardListData.getAnimateSizeChange()) {
                        mVarB = p114t0.n.b(companion, u0.m.l(300, 0, u0.i0.f(), 2, null), null, 2, null);
                    } else {
                        mVarB = companion;
                    }
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new er.l() { // from class: m30.f
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.e((n4.i0) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    f3.m mVarU = mVarB.u(v.d(companion, false, (er.l) objE, 1, null));
                    w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVarH, 0);
                    int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT2 = rVarH.t();
                    f3.m mVarE3 = f3.j.e(rVarH, mVarU);
                    aVarB2 = companion3.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB2);
                    } else {
                        rVarH.u();
                    }
                    r rVarC2 = n6.c(rVarH);
                    n6.i(rVarC2, w0VarA2, companion3.d());
                    n6.i(rVarC2, e0VarT2, companion3.f());
                    n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                    n6.g(rVarC2, companion3.a());
                    n6.i(rVarC2, mVarE3, companion3.e());
                    c.c(cardListData.getCardListAccessibilityData(), y2.m.d(346272457, true, new er.p() { // from class: m30.g
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i.f(cardListData, d0Var2, num2, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, 48, 0);
                    rVarH.x();
                    o30.d.d(cardListData, rVarH, i17 & 14);
                    rVarH.x();
                    if (t.k()) {
                        t.n();
                    }
                } else {
                    rVarH.O();
                }
                num3 = num2;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final d0 d0Var3 = d0Var2;
                    d5VarM.a(new er.p() { // from class: m30.h
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i.g(cardListData, d0Var3, num3, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            num2 = num;
            if ((i17 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i25 != 0) {
                    d0Var2 = null;
                }
                if (i18 != 0) {
                    num2 = null;
                }
                if (t.k()) {
                    t.o(-1111905450, i17, -1, "pl.gov.coi.common.ui.ds.cardlist.ColumnCardList (ColumnCardList.kt:28)");
                }
                companion = f3.m.INSTANCE;
                f3.m mVarE4 = d60.m.e(companion, cardListData.getFieldIndex(), rVarH, 6);
                d1.i iVar2 = d1.i.f39152a;
                d1.i.n nVarK2 = iVar2.k();
                f3.c.Companion companion4 = f3.c.INSTANCE;
                w0 w0VarA3 = e0.a(nVarK2, companion4.k(), rVarH, 0);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT3 = rVarH.t();
                f3.m mVarE5 = f3.j.e(rVarH, mVarE4);
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
                r rVarC3 = n6.c(rVarH);
                n6.i(rVarC3, w0VarA3, companion5.d());
                n6.i(rVarC3, e0VarT3, companion5.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion5.c());
                n6.g(rVarC3, companion5.a());
                n6.i(rVarC3, mVarE5, companion5.e());
                i0 i0Var2 = i0.f39176a;
                if (cardListData.getAnimateSizeChange()) {
                    mVarB = p114t0.n.b(companion, u0.m.l(300, 0, u0.i0.f(), 2, null), null, 2, null);
                } else {
                    mVarB = companion;
                }
                objE = rVarH.E();
                if (objE == r.INSTANCE.a()) {
                    objE = new er.l() { // from class: m30.f
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.e((n4.i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                f3.m mVarU2 = mVarB.u(v.d(companion, false, (er.l) objE, 1, null));
                w0 w0VarA4 = e0.a(iVar2.k(), companion4.k(), rVarH, 0);
                int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT4 = rVarH.t();
                f3.m mVarE6 = f3.j.e(rVarH, mVarU2);
                aVarB2 = companion5.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                r rVarC4 = n6.c(rVarH);
                n6.i(rVarC4, w0VarA4, companion5.d());
                n6.i(rVarC4, e0VarT4, companion5.f());
                n6.i(rVarC4, Integer.valueOf(iHashCode4), companion5.c());
                n6.g(rVarC4, companion5.a());
                n6.i(rVarC4, mVarE6, companion5.e());
                c.c(cardListData.getCardListAccessibilityData(), y2.m.d(346272457, true, new er.p() { // from class: m30.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i.f(cardListData, d0Var2, num2, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, 48, 0);
                rVarH.x();
                o30.d.d(cardListData, rVarH, i17 & 14);
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
            } else {
                rVarH.O();
            }
            num3 = num2;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final d0 d0Var4 = d0Var2;
                d5VarM.a(new er.p() { // from class: m30.h
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i.g(cardListData, d0Var4, num3, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        d0Var2 = d0Var;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                num2 = num;
                if (rVarH.W(num2)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            if ((i17 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i25 != 0) {
                    d0Var2 = null;
                }
                if (i18 != 0) {
                    num2 = null;
                }
                if (t.k()) {
                    t.o(-1111905450, i17, -1, "pl.gov.coi.common.ui.ds.cardlist.ColumnCardList (ColumnCardList.kt:28)");
                }
                companion = f3.m.INSTANCE;
                f3.m mVarE7 = d60.m.e(companion, cardListData.getFieldIndex(), rVarH, 6);
                d1.i iVar3 = d1.i.f39152a;
                d1.i.n nVarK3 = iVar3.k();
                f3.c.Companion companion6 = f3.c.INSTANCE;
                w0 w0VarA5 = e0.a(nVarK3, companion6.k(), rVarH, 0);
                int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT5 = rVarH.t();
                f3.m mVarE8 = f3.j.e(rVarH, mVarE7);
                androidx.compose.ui.node.c.Companion companion7 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion7.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC5 = n6.c(rVarH);
                n6.i(rVarC5, w0VarA5, companion7.d());
                n6.i(rVarC5, e0VarT5, companion7.f());
                n6.i(rVarC5, Integer.valueOf(iHashCode5), companion7.c());
                n6.g(rVarC5, companion7.a());
                n6.i(rVarC5, mVarE8, companion7.e());
                i0 i0Var3 = i0.f39176a;
                if (cardListData.getAnimateSizeChange()) {
                    mVarB = p114t0.n.b(companion, u0.m.l(300, 0, u0.i0.f(), 2, null), null, 2, null);
                } else {
                    mVarB = companion;
                }
                objE = rVarH.E();
                if (objE == r.INSTANCE.a()) {
                    objE = new er.l() { // from class: m30.f
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.e((n4.i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                f3.m mVarU3 = mVarB.u(v.d(companion, false, (er.l) objE, 1, null));
                w0 w0VarA6 = e0.a(iVar3.k(), companion6.k(), rVarH, 0);
                int iHashCode6 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT6 = rVarH.t();
                f3.m mVarE9 = f3.j.e(rVarH, mVarU3);
                aVarB2 = companion7.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                r rVarC6 = n6.c(rVarH);
                n6.i(rVarC6, w0VarA6, companion7.d());
                n6.i(rVarC6, e0VarT6, companion7.f());
                n6.i(rVarC6, Integer.valueOf(iHashCode6), companion7.c());
                n6.g(rVarC6, companion7.a());
                n6.i(rVarC6, mVarE9, companion7.e());
                c.c(cardListData.getCardListAccessibilityData(), y2.m.d(346272457, true, new er.p() { // from class: m30.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i.f(cardListData, d0Var2, num2, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, 48, 0);
                rVarH.x();
                o30.d.d(cardListData, rVarH, i17 & 14);
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
            } else {
                rVarH.O();
            }
            num3 = num2;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final d0 d0Var5 = d0Var2;
                d5VarM.a(new er.p() { // from class: m30.h
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i.g(cardListData, d0Var5, num3, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        num2 = num;
        if ((i17 & 147) != 146) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i25 != 0) {
                d0Var2 = null;
            }
            if (i18 != 0) {
                num2 = null;
            }
            if (t.k()) {
                t.o(-1111905450, i17, -1, "pl.gov.coi.common.ui.ds.cardlist.ColumnCardList (ColumnCardList.kt:28)");
            }
            companion = f3.m.INSTANCE;
            f3.m mVarE10 = d60.m.e(companion, cardListData.getFieldIndex(), rVarH, 6);
            d1.i iVar4 = d1.i.f39152a;
            d1.i.n nVarK4 = iVar4.k();
            f3.c.Companion companion8 = f3.c.INSTANCE;
            w0 w0VarA7 = e0.a(nVarK4, companion8.k(), rVarH, 0);
            int iHashCode7 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT7 = rVarH.t();
            f3.m mVarE11 = f3.j.e(rVarH, mVarE10);
            androidx.compose.ui.node.c.Companion companion9 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion9.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC7 = n6.c(rVarH);
            n6.i(rVarC7, w0VarA7, companion9.d());
            n6.i(rVarC7, e0VarT7, companion9.f());
            n6.i(rVarC7, Integer.valueOf(iHashCode7), companion9.c());
            n6.g(rVarC7, companion9.a());
            n6.i(rVarC7, mVarE11, companion9.e());
            i0 i0Var4 = i0.f39176a;
            if (cardListData.getAnimateSizeChange()) {
                mVarB = p114t0.n.b(companion, u0.m.l(300, 0, u0.i0.f(), 2, null), null, 2, null);
            } else {
                mVarB = companion;
            }
            objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: m30.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.e((n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f3.m mVarU4 = mVarB.u(v.d(companion, false, (er.l) objE, 1, null));
            w0 w0VarA8 = e0.a(iVar4.k(), companion8.k(), rVarH, 0);
            int iHashCode8 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT8 = rVarH.t();
            f3.m mVarE12 = f3.j.e(rVarH, mVarU4);
            aVarB2 = companion9.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC8 = n6.c(rVarH);
            n6.i(rVarC8, w0VarA8, companion9.d());
            n6.i(rVarC8, e0VarT8, companion9.f());
            n6.i(rVarC8, Integer.valueOf(iHashCode8), companion9.c());
            n6.g(rVarC8, companion9.a());
            n6.i(rVarC8, mVarE12, companion9.e());
            c.c(cardListData.getCardListAccessibilityData(), y2.m.d(346272457, true, new er.p() { // from class: m30.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.f(cardListData, d0Var2, num2, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 48, 0);
            rVarH.x();
            o30.d.d(cardListData, rVarH, i17 & 14);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        num3 = num2;
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            final d0 d0Var6 = d0Var2;
            d5VarM.a(new er.p() { // from class: m30.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.g(cardListData, d0Var6, num3, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(CardListData cardListData, d0 d0Var, Integer num, r rVar, int i15) {
        int i16 = 0;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(346272457, i15, -1, "pl.gov.coi.common.ui.ds.cardlist.ColumnCardList.<anonymous>.<anonymous>.<anonymous> (ColumnCardList.kt:51)");
            }
            Iterator<T> it = cardListData.d().iterator();
            while (true) {
                int i17 = i16;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                i16 = i17 + 1;
                if (i17 < 0) {
                    pq.v.x();
                }
                e.b(i17, (n50.k) next, cardListData, (num != null && i17 == num.intValue()) ? d0Var : null, rVar, 0, 0);
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(CardListData cardListData, d0 d0Var, Integer num, int i15, int i16, r rVar, int i17) {
        d(cardListData, d0Var, num, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
