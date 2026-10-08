package p046f2;

import a4.k0;
import a4.w0;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import er.l;
import er.p;
import f3.m;
import m3.e;
import n4.f0;
import n4.v;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p143z0.b3;
import p3.f;
import uq.b;
import w0.z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aO\u0010\u000b\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "contentDescription", "Lf3/m;", "modifier", "Lkotlin/Function0;", "Loq/i0;", "onClick", "", "alpha", "Landroidx/compose/ui/graphics/Color;", "color", "g", "(Ljava/lang/String;Lf3/m;Ler/a;Ler/a;JLm2/r;II)V", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ni {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f57054a;

        a(er.a<i0> aVar) {
            this.f57054a = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 b(er.a aVar, e eVar) {
            aVar.a();
            return i0.f148189a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(k0 k0Var, tq.e<? super i0> eVar) {
            final er.a<i0> aVar = this.f57054a;
            Object objI = b3.i(k0Var, null, null, null, new l() { // from class: f2.mi
                @Override // er.l
                public final Object b(Object obj) {
                    return ni.a.b(aVar, (e) obj);
                }
            }, eVar, 7, null);
            return objI == b.e() ? objI : i0.f148189a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0138  */
    /* JADX WARN: Code duplicated, block: B:103:0x014b  */
    /* JADX WARN: Code duplicated, block: B:104:0x014d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0150  */
    /* JADX WARN: Code duplicated, block: B:107:0x0152  */
    /* JADX WARN: Code duplicated, block: B:110:0x015a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0162  */
    /* JADX WARN: Code duplicated, block: B:114:0x0174  */
    /* JADX WARN: Code duplicated, block: B:117:0x0193  */
    /* JADX WARN: Code duplicated, block: B:119:0x0199  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:139:0x01df  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x0107  */
    /* JADX WARN: Code duplicated, block: B:90:0x0113  */
    /* JADX WARN: Code duplicated, block: B:92:0x011b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0127  */
    /* JADX WARN: Code duplicated, block: B:95:0x0129  */
    /* JADX WARN: Code duplicated, block: B:98:0x0130  */
    public static final void g(final String str, m mVar, er.a<i0> aVar, er.a<Float> aVar2, long j15, r rVar, final int i15, final int i16) {
        int i17;
        m mVar2;
        int i18;
        final er.a<i0> aVar3;
        int i19;
        int i25;
        int i26;
        final long jA;
        boolean z15;
        final er.a<Float> aVar4;
        m mVar3;
        final er.a<i0> aVar5;
        d5 d5VarM;
        final er.a<Float> aVar6;
        Object objE;
        Object objE2;
        m mVarC;
        boolean z16;
        Object objE3;
        int i27;
        boolean z17;
        Object objE4;
        boolean z18;
        boolean z19;
        boolean z25;
        Object objE5;
        int i28;
        r rVarH = rVar.h(-2078815310);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(str) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i29 = i16 & 2;
        if (i29 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    aVar3 = aVar;
                    if (rVarH.G(aVar3)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 8;
                if (i25 != 0) {
                    if ((i15 & 3072) == 0) {
                        if (rVarH.G(aVar2)) {
                            i26 = 2048;
                        } else {
                            i26 = 1024;
                        }
                        i17 |= i26;
                    }
                    if ((i15 & 24576) == 0) {
                        jA = j15;
                        if ((i16 & 16) == 0 || !rVarH.d(jA)) {
                            i28 = PKIFailureInfo.certRevoked;
                        } else {
                            i28 = 16384;
                        }
                        i17 |= i28;
                    } else {
                        jA = j15;
                    }
                    if ((i17 & 9363) != 9362) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0 || rVarH.Q()) {
                            if (i29 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar2;
                            }
                            if (i18 != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = new er.a() { // from class: f2.hi
                                        @Override // er.a
                                        public final Object a() {
                                            return ni.h();
                                        }
                                    };
                                    rVarH.v(objE2);
                                }
                                aVar3 = (er.a) objE2;
                            }
                            if (i25 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.ii
                                        @Override // er.a
                                        public final Object a() {
                                            return Float.valueOf(ni.i());
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar6 = (er.a) objE;
                            } else {
                                aVar6 = aVar2;
                            }
                            if ((i16 & 16) != 0) {
                                i17 &= -57345;
                                jA = fi.f55853a.a(rVarH, 6);
                            }
                        } else {
                            rVarH.O();
                            if ((i16 & 16) != 0) {
                                i17 &= -57345;
                            }
                            mVar3 = mVar2;
                            aVar6 = aVar2;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-2078815310, i17, -1, "androidx.compose.material3.Scrim (Scrim.kt:55)");
                        }
                        if (jA != 16) {
                            rVarH.X(-853219337);
                            if (aVar3 != null) {
                                rVarH.X(-853120974);
                                m.Companion companion = m.INSTANCE;
                                i27 = i17 & 896;
                                if (i27 == 256) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                objE4 = rVarH.E();
                                if (z17 || objE4 == r.INSTANCE.a()) {
                                    objE4 = new a(aVar3);
                                    rVarH.v(objE4);
                                }
                                m mVarC2 = w0.c(companion, aVar3, (PointerInputEventHandler) objE4);
                                if ((i17 & 14) == 4) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                if (i27 == 256) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                z25 = z19 | z18;
                                objE5 = rVarH.E();
                                if (z25 || objE5 == r.INSTANCE.a()) {
                                    objE5 = new l() { // from class: f2.ji
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return ni.j(str, aVar3, (n4.i0) obj);
                                        }
                                    };
                                    rVarH.v(objE5);
                                }
                                mVarC = v.c(mVarC2, true, (l) objE5);
                                rVarH.R();
                            } else {
                                rVarH.X(-852623672);
                                rVarH.R();
                                mVarC = m.INSTANCE;
                            }
                            m mVarU = d.f(mVar3, 0.0f, 1, null).u(mVarC);
                            z16 = ((((57344 & i17) ^ 24576) <= 16384 && rVarH.d(jA)) || (i17 & 24576) == 16384) | ((i17 & 7168) == 2048);
                            objE3 = rVarH.E();
                            if (z16 || objE3 == r.INSTANCE.a()) {
                                objE3 = new l() { // from class: f2.ki
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return ni.l(jA, aVar6, (f) obj);
                                    }
                                };
                                rVarH.v(objE3);
                            }
                            z.b(mVarU, (l) objE3, rVarH, 0);
                            rVarH.R();
                        } else {
                            rVarH.X(-852426512);
                            rVarH.R();
                        }
                        if (t.k()) {
                            t.n();
                        }
                        aVar4 = aVar6;
                    } else {
                        rVarH.O();
                        aVar4 = aVar2;
                        mVar3 = mVar2;
                    }
                    aVar5 = aVar3;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        final m mVar4 = mVar3;
                        final long j16 = jA;
                        d5VarM.a(new p() { // from class: f2.li
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ni.m(str, mVar4, aVar5, aVar4, j16, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 3072;
                if ((i15 & 24576) == 0) {
                    jA = j15;
                    if ((i16 & 16) == 0) {
                        i28 = PKIFailureInfo.certRevoked;
                    } else {
                        i28 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i28;
                } else {
                    jA = j15;
                }
                if ((i17 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i29 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar2;
                        }
                        if (i18 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = new er.a() { // from class: f2.hi
                                    @Override // er.a
                                    public final Object a() {
                                        return ni.h();
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            aVar3 = (er.a) objE2;
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.ii
                                    @Override // er.a
                                    public final Object a() {
                                        return Float.valueOf(ni.i());
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar6 = (er.a) objE;
                        } else {
                            aVar6 = aVar2;
                        }
                        if ((i16 & 16) != 0) {
                            i17 &= -57345;
                            jA = fi.f55853a.a(rVarH, 6);
                        }
                    } else {
                        if (i29 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar2;
                        }
                        if (i18 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = new er.a() { // from class: f2.hi
                                    @Override // er.a
                                    public final Object a() {
                                        return ni.h();
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            aVar3 = (er.a) objE2;
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.ii
                                    @Override // er.a
                                    public final Object a() {
                                        return Float.valueOf(ni.i());
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar6 = (er.a) objE;
                        } else {
                            aVar6 = aVar2;
                        }
                        if ((i16 & 16) != 0) {
                            i17 &= -57345;
                            jA = fi.f55853a.a(rVarH, 6);
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-2078815310, i17, -1, "androidx.compose.material3.Scrim (Scrim.kt:55)");
                    }
                    if (jA != 16) {
                        rVarH.X(-853219337);
                        if (aVar3 != null) {
                            rVarH.X(-853120974);
                            m.Companion companion2 = m.INSTANCE;
                            i27 = i17 & 896;
                            if (i27 == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objE4 = rVarH.E();
                            if (z17) {
                                objE4 = new a(aVar3);
                                rVarH.v(objE4);
                            } else {
                                objE4 = new a(aVar3);
                                rVarH.v(objE4);
                            }
                            m mVarC3 = w0.c(companion2, aVar3, (PointerInputEventHandler) objE4);
                            if ((i17 & 14) == 4) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (i27 == 256) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            z25 = z19 | z18;
                            objE5 = rVarH.E();
                            if (z25) {
                                objE5 = new l() { // from class: f2.ji
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return ni.j(str, aVar3, (n4.i0) obj);
                                    }
                                };
                                rVarH.v(objE5);
                            } else {
                                objE5 = new l() { // from class: f2.ji
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return ni.j(str, aVar3, (n4.i0) obj);
                                    }
                                };
                                rVarH.v(objE5);
                            }
                            mVarC = v.c(mVarC3, true, (l) objE5);
                            rVarH.R();
                        } else {
                            rVarH.X(-852623672);
                            rVarH.R();
                            mVarC = m.INSTANCE;
                        }
                        m mVarU2 = d.f(mVar3, 0.0f, 1, null).u(mVarC);
                        z16 = ((((57344 & i17) ^ 24576) <= 16384 && rVarH.d(jA)) || (i17 & 24576) == 16384) | ((i17 & 7168) == 2048);
                        objE3 = rVarH.E();
                        if (z16) {
                            objE3 = new l() { // from class: f2.ki
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return ni.l(jA, aVar6, (f) obj);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new l() { // from class: f2.ki
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return ni.l(jA, aVar6, (f) obj);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        z.b(mVarU2, (l) objE3, rVarH, 0);
                        rVarH.R();
                    } else {
                        rVarH.X(-852426512);
                        rVarH.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    aVar4 = aVar6;
                } else {
                    rVarH.O();
                    aVar4 = aVar2;
                    mVar3 = mVar2;
                }
                aVar5 = aVar3;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final m mVar5 = mVar3;
                    final long j17 = jA;
                    d5VarM.a(new p() { // from class: f2.li
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ni.m(str, mVar5, aVar5, aVar4, j17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            aVar3 = aVar;
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    if (rVarH.G(aVar2)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                if ((i15 & 24576) == 0) {
                    jA = j15;
                    if ((i16 & 16) == 0) {
                        i28 = PKIFailureInfo.certRevoked;
                    } else {
                        i28 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i28;
                } else {
                    jA = j15;
                }
                if ((i17 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i29 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar2;
                        }
                        if (i18 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = new er.a() { // from class: f2.hi
                                    @Override // er.a
                                    public final Object a() {
                                        return ni.h();
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            aVar3 = (er.a) objE2;
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.ii
                                    @Override // er.a
                                    public final Object a() {
                                        return Float.valueOf(ni.i());
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar6 = (er.a) objE;
                        } else {
                            aVar6 = aVar2;
                        }
                        if ((i16 & 16) != 0) {
                            i17 &= -57345;
                            jA = fi.f55853a.a(rVarH, 6);
                        }
                    } else {
                        if (i29 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar2;
                        }
                        if (i18 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = new er.a() { // from class: f2.hi
                                    @Override // er.a
                                    public final Object a() {
                                        return ni.h();
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            aVar3 = (er.a) objE2;
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.ii
                                    @Override // er.a
                                    public final Object a() {
                                        return Float.valueOf(ni.i());
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar6 = (er.a) objE;
                        } else {
                            aVar6 = aVar2;
                        }
                        if ((i16 & 16) != 0) {
                            i17 &= -57345;
                            jA = fi.f55853a.a(rVarH, 6);
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-2078815310, i17, -1, "androidx.compose.material3.Scrim (Scrim.kt:55)");
                    }
                    if (jA != 16) {
                        rVarH.X(-853219337);
                        if (aVar3 != null) {
                            rVarH.X(-853120974);
                            m.Companion companion3 = m.INSTANCE;
                            i27 = i17 & 896;
                            if (i27 == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objE4 = rVarH.E();
                            if (z17) {
                                objE4 = new a(aVar3);
                                rVarH.v(objE4);
                            } else {
                                objE4 = new a(aVar3);
                                rVarH.v(objE4);
                            }
                            m mVarC4 = w0.c(companion3, aVar3, (PointerInputEventHandler) objE4);
                            if ((i17 & 14) == 4) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (i27 == 256) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            z25 = z19 | z18;
                            objE5 = rVarH.E();
                            if (z25) {
                                objE5 = new l() { // from class: f2.ji
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return ni.j(str, aVar3, (n4.i0) obj);
                                    }
                                };
                                rVarH.v(objE5);
                            } else {
                                objE5 = new l() { // from class: f2.ji
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return ni.j(str, aVar3, (n4.i0) obj);
                                    }
                                };
                                rVarH.v(objE5);
                            }
                            mVarC = v.c(mVarC4, true, (l) objE5);
                            rVarH.R();
                        } else {
                            rVarH.X(-852623672);
                            rVarH.R();
                            mVarC = m.INSTANCE;
                        }
                        m mVarU3 = d.f(mVar3, 0.0f, 1, null).u(mVarC);
                        z16 = ((((57344 & i17) ^ 24576) <= 16384 && rVarH.d(jA)) || (i17 & 24576) == 16384) | ((i17 & 7168) == 2048);
                        objE3 = rVarH.E();
                        if (z16) {
                            objE3 = new l() { // from class: f2.ki
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return ni.l(jA, aVar6, (f) obj);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new l() { // from class: f2.ki
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return ni.l(jA, aVar6, (f) obj);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        z.b(mVarU3, (l) objE3, rVarH, 0);
                        rVarH.R();
                    } else {
                        rVarH.X(-852426512);
                        rVarH.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    aVar4 = aVar6;
                } else {
                    rVarH.O();
                    aVar4 = aVar2;
                    mVar3 = mVar2;
                }
                aVar5 = aVar3;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final m mVar6 = mVar3;
                    final long j18 = jA;
                    d5VarM.a(new p() { // from class: f2.li
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ni.m(str, mVar6, aVar5, aVar4, j18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            if ((i15 & 24576) == 0) {
                jA = j15;
                if ((i16 & 16) == 0) {
                    i28 = PKIFailureInfo.certRevoked;
                } else {
                    i28 = PKIFailureInfo.certRevoked;
                }
                i17 |= i28;
            } else {
                jA = j15;
            }
            if ((i17 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i29 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (i18 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = new er.a() { // from class: f2.hi
                                @Override // er.a
                                public final Object a() {
                                    return ni.h();
                                }
                            };
                            rVarH.v(objE2);
                        }
                        aVar3 = (er.a) objE2;
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.ii
                                @Override // er.a
                                public final Object a() {
                                    return Float.valueOf(ni.i());
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar6 = (er.a) objE;
                    } else {
                        aVar6 = aVar2;
                    }
                    if ((i16 & 16) != 0) {
                        i17 &= -57345;
                        jA = fi.f55853a.a(rVarH, 6);
                    }
                } else {
                    if (i29 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (i18 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = new er.a() { // from class: f2.hi
                                @Override // er.a
                                public final Object a() {
                                    return ni.h();
                                }
                            };
                            rVarH.v(objE2);
                        }
                        aVar3 = (er.a) objE2;
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.ii
                                @Override // er.a
                                public final Object a() {
                                    return Float.valueOf(ni.i());
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar6 = (er.a) objE;
                    } else {
                        aVar6 = aVar2;
                    }
                    if ((i16 & 16) != 0) {
                        i17 &= -57345;
                        jA = fi.f55853a.a(rVarH, 6);
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-2078815310, i17, -1, "androidx.compose.material3.Scrim (Scrim.kt:55)");
                }
                if (jA != 16) {
                    rVarH.X(-853219337);
                    if (aVar3 != null) {
                        rVarH.X(-853120974);
                        m.Companion companion4 = m.INSTANCE;
                        i27 = i17 & 896;
                        if (i27 == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objE4 = rVarH.E();
                        if (z17) {
                            objE4 = new a(aVar3);
                            rVarH.v(objE4);
                        } else {
                            objE4 = new a(aVar3);
                            rVarH.v(objE4);
                        }
                        m mVarC5 = w0.c(companion4, aVar3, (PointerInputEventHandler) objE4);
                        if ((i17 & 14) == 4) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (i27 == 256) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z25 = z19 | z18;
                        objE5 = rVarH.E();
                        if (z25) {
                            objE5 = new l() { // from class: f2.ji
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return ni.j(str, aVar3, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE5);
                        } else {
                            objE5 = new l() { // from class: f2.ji
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return ni.j(str, aVar3, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        mVarC = v.c(mVarC5, true, (l) objE5);
                        rVarH.R();
                    } else {
                        rVarH.X(-852623672);
                        rVarH.R();
                        mVarC = m.INSTANCE;
                    }
                    m mVarU4 = d.f(mVar3, 0.0f, 1, null).u(mVarC);
                    z16 = ((((57344 & i17) ^ 24576) <= 16384 && rVarH.d(jA)) || (i17 & 24576) == 16384) | ((i17 & 7168) == 2048);
                    objE3 = rVarH.E();
                    if (z16) {
                        objE3 = new l() { // from class: f2.ki
                            @Override // er.l
                            public final Object b(Object obj) {
                                return ni.l(jA, aVar6, (f) obj);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new l() { // from class: f2.ki
                            @Override // er.l
                            public final Object b(Object obj) {
                                return ni.l(jA, aVar6, (f) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    z.b(mVarU4, (l) objE3, rVarH, 0);
                    rVarH.R();
                } else {
                    rVarH.X(-852426512);
                    rVarH.R();
                }
                if (t.k()) {
                    t.n();
                }
                aVar4 = aVar6;
            } else {
                rVarH.O();
                aVar4 = aVar2;
                mVar3 = mVar2;
            }
            aVar5 = aVar3;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final m mVar7 = mVar3;
                final long j19 = jA;
                d5VarM.a(new p() { // from class: f2.li
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ni.m(str, mVar7, aVar5, aVar4, j19, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        mVar2 = mVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                aVar3 = aVar;
                if (rVarH.G(aVar3)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    if (rVarH.G(aVar2)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                if ((i15 & 24576) == 0) {
                    jA = j15;
                    if ((i16 & 16) == 0) {
                        i28 = PKIFailureInfo.certRevoked;
                    } else {
                        i28 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i28;
                } else {
                    jA = j15;
                }
                if ((i17 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i29 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar2;
                        }
                        if (i18 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = new er.a() { // from class: f2.hi
                                    @Override // er.a
                                    public final Object a() {
                                        return ni.h();
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            aVar3 = (er.a) objE2;
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.ii
                                    @Override // er.a
                                    public final Object a() {
                                        return Float.valueOf(ni.i());
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar6 = (er.a) objE;
                        } else {
                            aVar6 = aVar2;
                        }
                        if ((i16 & 16) != 0) {
                            i17 &= -57345;
                            jA = fi.f55853a.a(rVarH, 6);
                        }
                    } else {
                        if (i29 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar2;
                        }
                        if (i18 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = new er.a() { // from class: f2.hi
                                    @Override // er.a
                                    public final Object a() {
                                        return ni.h();
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            aVar3 = (er.a) objE2;
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.ii
                                    @Override // er.a
                                    public final Object a() {
                                        return Float.valueOf(ni.i());
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar6 = (er.a) objE;
                        } else {
                            aVar6 = aVar2;
                        }
                        if ((i16 & 16) != 0) {
                            i17 &= -57345;
                            jA = fi.f55853a.a(rVarH, 6);
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-2078815310, i17, -1, "androidx.compose.material3.Scrim (Scrim.kt:55)");
                    }
                    if (jA != 16) {
                        rVarH.X(-853219337);
                        if (aVar3 != null) {
                            rVarH.X(-853120974);
                            m.Companion companion5 = m.INSTANCE;
                            i27 = i17 & 896;
                            if (i27 == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objE4 = rVarH.E();
                            if (z17) {
                                objE4 = new a(aVar3);
                                rVarH.v(objE4);
                            } else {
                                objE4 = new a(aVar3);
                                rVarH.v(objE4);
                            }
                            m mVarC6 = w0.c(companion5, aVar3, (PointerInputEventHandler) objE4);
                            if ((i17 & 14) == 4) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (i27 == 256) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            z25 = z19 | z18;
                            objE5 = rVarH.E();
                            if (z25) {
                                objE5 = new l() { // from class: f2.ji
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return ni.j(str, aVar3, (n4.i0) obj);
                                    }
                                };
                                rVarH.v(objE5);
                            } else {
                                objE5 = new l() { // from class: f2.ji
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return ni.j(str, aVar3, (n4.i0) obj);
                                    }
                                };
                                rVarH.v(objE5);
                            }
                            mVarC = v.c(mVarC6, true, (l) objE5);
                            rVarH.R();
                        } else {
                            rVarH.X(-852623672);
                            rVarH.R();
                            mVarC = m.INSTANCE;
                        }
                        m mVarU5 = d.f(mVar3, 0.0f, 1, null).u(mVarC);
                        z16 = ((((57344 & i17) ^ 24576) <= 16384 && rVarH.d(jA)) || (i17 & 24576) == 16384) | ((i17 & 7168) == 2048);
                        objE3 = rVarH.E();
                        if (z16) {
                            objE3 = new l() { // from class: f2.ki
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return ni.l(jA, aVar6, (f) obj);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new l() { // from class: f2.ki
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return ni.l(jA, aVar6, (f) obj);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        z.b(mVarU5, (l) objE3, rVarH, 0);
                        rVarH.R();
                    } else {
                        rVarH.X(-852426512);
                        rVarH.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    aVar4 = aVar6;
                } else {
                    rVarH.O();
                    aVar4 = aVar2;
                    mVar3 = mVar2;
                }
                aVar5 = aVar3;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final m mVar8 = mVar3;
                    final long j110 = jA;
                    d5VarM.a(new p() { // from class: f2.li
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ni.m(str, mVar8, aVar5, aVar4, j110, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            if ((i15 & 24576) == 0) {
                jA = j15;
                if ((i16 & 16) == 0) {
                    i28 = PKIFailureInfo.certRevoked;
                } else {
                    i28 = PKIFailureInfo.certRevoked;
                }
                i17 |= i28;
            } else {
                jA = j15;
            }
            if ((i17 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i29 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (i18 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = new er.a() { // from class: f2.hi
                                @Override // er.a
                                public final Object a() {
                                    return ni.h();
                                }
                            };
                            rVarH.v(objE2);
                        }
                        aVar3 = (er.a) objE2;
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.ii
                                @Override // er.a
                                public final Object a() {
                                    return Float.valueOf(ni.i());
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar6 = (er.a) objE;
                    } else {
                        aVar6 = aVar2;
                    }
                    if ((i16 & 16) != 0) {
                        i17 &= -57345;
                        jA = fi.f55853a.a(rVarH, 6);
                    }
                } else {
                    if (i29 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (i18 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = new er.a() { // from class: f2.hi
                                @Override // er.a
                                public final Object a() {
                                    return ni.h();
                                }
                            };
                            rVarH.v(objE2);
                        }
                        aVar3 = (er.a) objE2;
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.ii
                                @Override // er.a
                                public final Object a() {
                                    return Float.valueOf(ni.i());
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar6 = (er.a) objE;
                    } else {
                        aVar6 = aVar2;
                    }
                    if ((i16 & 16) != 0) {
                        i17 &= -57345;
                        jA = fi.f55853a.a(rVarH, 6);
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-2078815310, i17, -1, "androidx.compose.material3.Scrim (Scrim.kt:55)");
                }
                if (jA != 16) {
                    rVarH.X(-853219337);
                    if (aVar3 != null) {
                        rVarH.X(-853120974);
                        m.Companion companion6 = m.INSTANCE;
                        i27 = i17 & 896;
                        if (i27 == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objE4 = rVarH.E();
                        if (z17) {
                            objE4 = new a(aVar3);
                            rVarH.v(objE4);
                        } else {
                            objE4 = new a(aVar3);
                            rVarH.v(objE4);
                        }
                        m mVarC7 = w0.c(companion6, aVar3, (PointerInputEventHandler) objE4);
                        if ((i17 & 14) == 4) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (i27 == 256) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z25 = z19 | z18;
                        objE5 = rVarH.E();
                        if (z25) {
                            objE5 = new l() { // from class: f2.ji
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return ni.j(str, aVar3, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE5);
                        } else {
                            objE5 = new l() { // from class: f2.ji
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return ni.j(str, aVar3, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        mVarC = v.c(mVarC7, true, (l) objE5);
                        rVarH.R();
                    } else {
                        rVarH.X(-852623672);
                        rVarH.R();
                        mVarC = m.INSTANCE;
                    }
                    m mVarU6 = d.f(mVar3, 0.0f, 1, null).u(mVarC);
                    z16 = ((((57344 & i17) ^ 24576) <= 16384 && rVarH.d(jA)) || (i17 & 24576) == 16384) | ((i17 & 7168) == 2048);
                    objE3 = rVarH.E();
                    if (z16) {
                        objE3 = new l() { // from class: f2.ki
                            @Override // er.l
                            public final Object b(Object obj) {
                                return ni.l(jA, aVar6, (f) obj);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new l() { // from class: f2.ki
                            @Override // er.l
                            public final Object b(Object obj) {
                                return ni.l(jA, aVar6, (f) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    z.b(mVarU6, (l) objE3, rVarH, 0);
                    rVarH.R();
                } else {
                    rVarH.X(-852426512);
                    rVarH.R();
                }
                if (t.k()) {
                    t.n();
                }
                aVar4 = aVar6;
            } else {
                rVarH.O();
                aVar4 = aVar2;
                mVar3 = mVar2;
            }
            aVar5 = aVar3;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final m mVar9 = mVar3;
                final long j111 = jA;
                d5VarM.a(new p() { // from class: f2.li
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ni.m(str, mVar9, aVar5, aVar4, j111, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        aVar3 = aVar;
        i25 = i16 & 8;
        if (i25 != 0) {
            if ((i15 & 3072) == 0) {
                if (rVarH.G(aVar2)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i17 |= i26;
            }
            if ((i15 & 24576) == 0) {
                jA = j15;
                if ((i16 & 16) == 0) {
                    i28 = PKIFailureInfo.certRevoked;
                } else {
                    i28 = PKIFailureInfo.certRevoked;
                }
                i17 |= i28;
            } else {
                jA = j15;
            }
            if ((i17 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i29 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (i18 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = new er.a() { // from class: f2.hi
                                @Override // er.a
                                public final Object a() {
                                    return ni.h();
                                }
                            };
                            rVarH.v(objE2);
                        }
                        aVar3 = (er.a) objE2;
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.ii
                                @Override // er.a
                                public final Object a() {
                                    return Float.valueOf(ni.i());
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar6 = (er.a) objE;
                    } else {
                        aVar6 = aVar2;
                    }
                    if ((i16 & 16) != 0) {
                        i17 &= -57345;
                        jA = fi.f55853a.a(rVarH, 6);
                    }
                } else {
                    if (i29 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (i18 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = new er.a() { // from class: f2.hi
                                @Override // er.a
                                public final Object a() {
                                    return ni.h();
                                }
                            };
                            rVarH.v(objE2);
                        }
                        aVar3 = (er.a) objE2;
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.ii
                                @Override // er.a
                                public final Object a() {
                                    return Float.valueOf(ni.i());
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar6 = (er.a) objE;
                    } else {
                        aVar6 = aVar2;
                    }
                    if ((i16 & 16) != 0) {
                        i17 &= -57345;
                        jA = fi.f55853a.a(rVarH, 6);
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-2078815310, i17, -1, "androidx.compose.material3.Scrim (Scrim.kt:55)");
                }
                if (jA != 16) {
                    rVarH.X(-853219337);
                    if (aVar3 != null) {
                        rVarH.X(-853120974);
                        m.Companion companion7 = m.INSTANCE;
                        i27 = i17 & 896;
                        if (i27 == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objE4 = rVarH.E();
                        if (z17) {
                            objE4 = new a(aVar3);
                            rVarH.v(objE4);
                        } else {
                            objE4 = new a(aVar3);
                            rVarH.v(objE4);
                        }
                        m mVarC8 = w0.c(companion7, aVar3, (PointerInputEventHandler) objE4);
                        if ((i17 & 14) == 4) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (i27 == 256) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z25 = z19 | z18;
                        objE5 = rVarH.E();
                        if (z25) {
                            objE5 = new l() { // from class: f2.ji
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return ni.j(str, aVar3, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE5);
                        } else {
                            objE5 = new l() { // from class: f2.ji
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return ni.j(str, aVar3, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        mVarC = v.c(mVarC8, true, (l) objE5);
                        rVarH.R();
                    } else {
                        rVarH.X(-852623672);
                        rVarH.R();
                        mVarC = m.INSTANCE;
                    }
                    m mVarU7 = d.f(mVar3, 0.0f, 1, null).u(mVarC);
                    z16 = ((((57344 & i17) ^ 24576) <= 16384 && rVarH.d(jA)) || (i17 & 24576) == 16384) | ((i17 & 7168) == 2048);
                    objE3 = rVarH.E();
                    if (z16) {
                        objE3 = new l() { // from class: f2.ki
                            @Override // er.l
                            public final Object b(Object obj) {
                                return ni.l(jA, aVar6, (f) obj);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new l() { // from class: f2.ki
                            @Override // er.l
                            public final Object b(Object obj) {
                                return ni.l(jA, aVar6, (f) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    z.b(mVarU7, (l) objE3, rVarH, 0);
                    rVarH.R();
                } else {
                    rVarH.X(-852426512);
                    rVarH.R();
                }
                if (t.k()) {
                    t.n();
                }
                aVar4 = aVar6;
            } else {
                rVarH.O();
                aVar4 = aVar2;
                mVar3 = mVar2;
            }
            aVar5 = aVar3;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final m mVar10 = mVar3;
                final long j112 = jA;
                d5VarM.a(new p() { // from class: f2.li
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ni.m(str, mVar10, aVar5, aVar4, j112, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        if ((i15 & 24576) == 0) {
            jA = j15;
            if ((i16 & 16) == 0) {
                i28 = PKIFailureInfo.certRevoked;
            } else {
                i28 = PKIFailureInfo.certRevoked;
            }
            i17 |= i28;
        } else {
            jA = j15;
        }
        if ((i17 & 9363) != 9362) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i29 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (i18 != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == r.INSTANCE.a()) {
                        objE2 = new er.a() { // from class: f2.hi
                            @Override // er.a
                            public final Object a() {
                                return ni.h();
                            }
                        };
                        rVarH.v(objE2);
                    }
                    aVar3 = (er.a) objE2;
                }
                if (i25 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new er.a() { // from class: f2.ii
                            @Override // er.a
                            public final Object a() {
                                return Float.valueOf(ni.i());
                            }
                        };
                        rVarH.v(objE);
                    }
                    aVar6 = (er.a) objE;
                } else {
                    aVar6 = aVar2;
                }
                if ((i16 & 16) != 0) {
                    i17 &= -57345;
                    jA = fi.f55853a.a(rVarH, 6);
                }
            } else {
                if (i29 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (i18 != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == r.INSTANCE.a()) {
                        objE2 = new er.a() { // from class: f2.hi
                            @Override // er.a
                            public final Object a() {
                                return ni.h();
                            }
                        };
                        rVarH.v(objE2);
                    }
                    aVar3 = (er.a) objE2;
                }
                if (i25 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new er.a() { // from class: f2.ii
                            @Override // er.a
                            public final Object a() {
                                return Float.valueOf(ni.i());
                            }
                        };
                        rVarH.v(objE);
                    }
                    aVar6 = (er.a) objE;
                } else {
                    aVar6 = aVar2;
                }
                if ((i16 & 16) != 0) {
                    i17 &= -57345;
                    jA = fi.f55853a.a(rVarH, 6);
                }
            }
            rVarH.y();
            if (t.k()) {
                t.o(-2078815310, i17, -1, "androidx.compose.material3.Scrim (Scrim.kt:55)");
            }
            if (jA != 16) {
                rVarH.X(-853219337);
                if (aVar3 != null) {
                    rVarH.X(-853120974);
                    m.Companion companion8 = m.INSTANCE;
                    i27 = i17 & 896;
                    if (i27 == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objE4 = rVarH.E();
                    if (z17) {
                        objE4 = new a(aVar3);
                        rVarH.v(objE4);
                    } else {
                        objE4 = new a(aVar3);
                        rVarH.v(objE4);
                    }
                    m mVarC9 = w0.c(companion8, aVar3, (PointerInputEventHandler) objE4);
                    if ((i17 & 14) == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (i27 == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z25 = z19 | z18;
                    objE5 = rVarH.E();
                    if (z25) {
                        objE5 = new l() { // from class: f2.ji
                            @Override // er.l
                            public final Object b(Object obj) {
                                return ni.j(str, aVar3, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new l() { // from class: f2.ji
                            @Override // er.l
                            public final Object b(Object obj) {
                                return ni.j(str, aVar3, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    mVarC = v.c(mVarC9, true, (l) objE5);
                    rVarH.R();
                } else {
                    rVarH.X(-852623672);
                    rVarH.R();
                    mVarC = m.INSTANCE;
                }
                m mVarU8 = d.f(mVar3, 0.0f, 1, null).u(mVarC);
                z16 = ((((57344 & i17) ^ 24576) <= 16384 && rVarH.d(jA)) || (i17 & 24576) == 16384) | ((i17 & 7168) == 2048);
                objE3 = rVarH.E();
                if (z16) {
                    objE3 = new l() { // from class: f2.ki
                        @Override // er.l
                        public final Object b(Object obj) {
                            return ni.l(jA, aVar6, (f) obj);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new l() { // from class: f2.ki
                        @Override // er.l
                        public final Object b(Object obj) {
                            return ni.l(jA, aVar6, (f) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                z.b(mVarU8, (l) objE3, rVarH, 0);
                rVarH.R();
            } else {
                rVarH.X(-852426512);
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
            aVar4 = aVar6;
        } else {
            rVarH.O();
            aVar4 = aVar2;
            mVar3 = mVar2;
        }
        aVar5 = aVar3;
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            final m mVar11 = mVar3;
            final long j113 = jA;
            d5VarM.a(new p() { // from class: f2.li
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return ni.m(str, mVar11, aVar5, aVar4, j113, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float i() {
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(String str, final er.a aVar, n4.i0 i0Var) {
        f0.I0(i0Var, 1.0f);
        if (str != null) {
            f0.c0(i0Var, str);
        }
        f0.y(i0Var, null, new er.a() { // from class: f2.gi
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(ni.k(aVar));
            }
        }, 1, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(er.a aVar) {
        aVar.a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(long j15, er.a aVar, f fVar) {
        f.c2(fVar, j15, 0L, 0L, lr.m.m(((Number) aVar.a()).floatValue(), 0.0f, 1.0f), null, null, 0, 118, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(String str, m mVar, er.a aVar, er.a aVar2, long j15, int i15, int i16, r rVar, int i17) {
        g(str, mVar, aVar, aVar2, j15, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
