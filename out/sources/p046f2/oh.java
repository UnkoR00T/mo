package p046f2;

import androidx.compose.material3.i;
import androidx.compose.ui.graphics.Color;
import b1.l;
import c5.h;
import d1.a3;
import er.a;
import er.p;
import f3.c;
import f3.m;
import k1.d;
import l2.k0;
import l2.s0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p3.Stroke;
import p3.j;
import u0.f;
import w0.z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aQ\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0015"}, d2 = {"", "selected", "Lkotlin/Function0;", "Loq/i0;", "onClick", "Lf3/m;", "modifier", "enabled", "Lf2/kh;", "colors", "Lb1/l;", "interactionSource", "c", "(ZLer/a;Lf3/m;ZLf2/kh;Lb1/l;Lm2/r;II)V", "Lc5/h;", "a", "F", "RadioButtonPadding", "b", "RadioButtonDotSize", "RadioStrokeWidth", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class oh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f57143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f57144b = h.n(12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f57145c;

    static {
        float f15 = 2;
        f57143a = h.n(f15);
        f57145c = h.n(f15);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018c  */
    /* JADX WARN: Code duplicated, block: B:101:0x0193  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:106:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x0104  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    /* JADX WARN: Code duplicated, block: B:97:0x0144  */
    /* JADX WARN: Code duplicated, block: B:98:0x0184  */
    public static final void c(final boolean z15, final a<i0> aVar, m mVar, boolean z16, kh khVar, l lVar, r rVar, final int i15, final int i16) {
        int i17;
        m mVar2;
        int i18;
        boolean z17;
        int i19;
        kh khVarA;
        int i25;
        int i26;
        boolean z18;
        final l lVar2;
        final m mVar3;
        final boolean z19;
        final kh khVar2;
        d5 d5VarM;
        m mVar4;
        int i27;
        boolean z25;
        kh khVar3;
        float fN;
        final f6<h> f6VarD;
        final f6<Color> f6VarB;
        Object obj;
        m mVar5;
        m mVarA;
        m mVarI;
        boolean zW;
        Object objE;
        int i28;
        r rVarH = rVar.h(408580840);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.a(z15) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(aVar) ? 32 : 16;
        }
        int i29 = i16 & 4;
        if (i29 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 256 : 128;
            }
            i18 = i16 & 8;
            if (i18 != 0) {
                if ((i15 & 3072) == 0) {
                    z17 = z16;
                    if (rVarH.a(z17)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i17 |= i19;
                }
                if ((i15 & 24576) == 0) {
                    if ((i16 & 16) == 0) {
                        khVarA = khVar;
                        if (rVarH.W(khVarA)) {
                            i28 = 16384;
                        }
                        i17 |= i28;
                    } else {
                        khVarA = khVar;
                    }
                    i28 = PKIFailureInfo.certRevoked;
                    i17 |= i28;
                } else {
                    khVarA = khVar;
                }
                i25 = i16 & 32;
                if (i25 != 0) {
                    if ((196608 & i15) == 0) {
                        if (rVarH.W(lVar)) {
                            i26 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i26 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i26;
                    }
                    if ((74899 & i17) != 74898) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (rVarH.r(z18, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0 || rVarH.Q()) {
                            if (i29 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                z17 = true;
                            }
                            if ((i16 & 16) != 0) {
                                i17 &= -57345;
                                khVarA = lh.f56740a.a(rVarH, 6);
                            }
                            if (i25 != 0) {
                                i27 = i17;
                                z25 = z17;
                                khVar3 = khVarA;
                                lVar = null;
                            } else {
                                i27 = i17;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(408580840, i27, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:81)");
                            }
                            if (z15) {
                                fN = h.n(f57144b / 2);
                            } else {
                                fN = h.n(0);
                            }
                            f6VarD = f.d(fN, of.b(k0.FastSpatial, rVarH, 6), null, null, rVarH, 0, 12);
                            f6VarB = khVar3.b(z25, z15, rVarH, ((i27 >> 6) & 896) | ((i27 >> 9) & 14) | ((i27 << 3) & 112));
                            if (aVar != null) {
                                m mVar6 = mVar4;
                                z19 = z25;
                                mVar5 = mVar6;
                                obj = null;
                                mVarA = d.a(m.INSTANCE, z15, lVar, i.h(false, h.n(s0.f115231a.e() / 2), 0L, l1.h.i(), false, false, false, false, 244, null), z19, n4.l.j(n4.l.INSTANCE.f()), aVar);
                            } else {
                                obj = null;
                                mVar5 = mVar4;
                                z19 = z25;
                                mVarA = m.INSTANCE;
                            }
                            if (aVar != null) {
                                mVarI = hd.i(m.INSTANCE);
                            } else {
                                mVarI = m.INSTANCE;
                            }
                            m mVarO = androidx.compose.foundation.layout.d.o(a3.n(androidx.compose.foundation.layout.d.E(mVar5.u(mVarI).u(mVarA), c.INSTANCE.e(), false, 2, obj), f57143a), s0.f115231a.c());
                            zW = rVarH.W(f6VarB) | rVarH.W(f6VarD);
                            objE = rVarH.E();
                            if (zW || objE == r.INSTANCE.a()) {
                                objE = new er.l() { // from class: f2.mh
                                    @Override // er.l
                                    public final Object b(Object obj2) {
                                        return oh.d(f6VarB, f6VarD, (p3.f) obj2);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            z.b(mVarO, (er.l) objE, rVarH, 0);
                            if (t.k()) {
                                t.n();
                            }
                            lVar2 = lVar;
                            khVar2 = khVar3;
                            mVar3 = mVar5;
                        } else {
                            rVarH.O();
                            if ((i16 & 16) != 0) {
                                i17 &= -57345;
                            }
                            i27 = i17;
                            mVar4 = mVar2;
                        }
                        z25 = z17;
                        khVar3 = khVarA;
                        rVarH.y();
                        if (t.k()) {
                            t.o(408580840, i27, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:81)");
                        }
                        if (z15) {
                            fN = h.n(f57144b / 2);
                        } else {
                            fN = h.n(0);
                        }
                        f6VarD = f.d(fN, of.b(k0.FastSpatial, rVarH, 6), null, null, rVarH, 0, 12);
                        f6VarB = khVar3.b(z25, z15, rVarH, ((i27 >> 6) & 896) | ((i27 >> 9) & 14) | ((i27 << 3) & 112));
                        if (aVar != null) {
                            m mVar7 = mVar4;
                            z19 = z25;
                            mVar5 = mVar7;
                            obj = null;
                            mVarA = d.a(m.INSTANCE, z15, lVar, i.h(false, h.n(s0.f115231a.e() / 2), 0L, l1.h.i(), false, false, false, false, 244, null), z19, n4.l.j(n4.l.INSTANCE.f()), aVar);
                        } else {
                            obj = null;
                            mVar5 = mVar4;
                            z19 = z25;
                            mVarA = m.INSTANCE;
                        }
                        if (aVar != null) {
                            mVarI = hd.i(m.INSTANCE);
                        } else {
                            mVarI = m.INSTANCE;
                        }
                        m mVarO2 = androidx.compose.foundation.layout.d.o(a3.n(androidx.compose.foundation.layout.d.E(mVar5.u(mVarI).u(mVarA), c.INSTANCE.e(), false, 2, obj), f57143a), s0.f115231a.c());
                        zW = rVarH.W(f6VarB) | rVarH.W(f6VarD);
                        objE = rVarH.E();
                        if (zW) {
                            objE = new er.l() { // from class: f2.mh
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return oh.d(f6VarB, f6VarD, (p3.f) obj2);
                                }
                            };
                            rVarH.v(objE);
                        } else {
                            objE = new er.l() { // from class: f2.mh
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return oh.d(f6VarB, f6VarD, (p3.f) obj2);
                                }
                            };
                            rVarH.v(objE);
                        }
                        z.b(mVarO2, (er.l) objE, rVarH, 0);
                        if (t.k()) {
                            t.n();
                        }
                        lVar2 = lVar;
                        khVar2 = khVar3;
                        mVar3 = mVar5;
                    } else {
                        rVarH.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        z19 = z17;
                        khVar2 = khVarA;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.nh
                            @Override // er.p
                            public final Object B(Object obj2, Object obj3) {
                                return oh.e(z15, aVar, mVar3, z19, khVar2, lVar2, i15, i16, (r) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                if ((74899 & i17) != 74898) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (rVarH.r(z18, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i29 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if ((i16 & 16) != 0) {
                            i17 &= -57345;
                            khVarA = lh.f56740a.a(rVarH, 6);
                        }
                        if (i25 != 0) {
                            i27 = i17;
                            z25 = z17;
                            khVar3 = khVarA;
                            lVar = null;
                        } else {
                            i27 = i17;
                            z25 = z17;
                            khVar3 = khVarA;
                        }
                    } else {
                        if (i29 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if ((i16 & 16) != 0) {
                            i17 &= -57345;
                            khVarA = lh.f56740a.a(rVarH, 6);
                        }
                        if (i25 != 0) {
                            i27 = i17;
                            z25 = z17;
                            khVar3 = khVarA;
                            lVar = null;
                        } else {
                            i27 = i17;
                            z25 = z17;
                            khVar3 = khVarA;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(408580840, i27, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:81)");
                    }
                    if (z15) {
                        fN = h.n(f57144b / 2);
                    } else {
                        fN = h.n(0);
                    }
                    f6VarD = f.d(fN, of.b(k0.FastSpatial, rVarH, 6), null, null, rVarH, 0, 12);
                    f6VarB = khVar3.b(z25, z15, rVarH, ((i27 >> 6) & 896) | ((i27 >> 9) & 14) | ((i27 << 3) & 112));
                    if (aVar != null) {
                        m mVar8 = mVar4;
                        z19 = z25;
                        mVar5 = mVar8;
                        obj = null;
                        mVarA = d.a(m.INSTANCE, z15, lVar, i.h(false, h.n(s0.f115231a.e() / 2), 0L, l1.h.i(), false, false, false, false, 244, null), z19, n4.l.j(n4.l.INSTANCE.f()), aVar);
                    } else {
                        obj = null;
                        mVar5 = mVar4;
                        z19 = z25;
                        mVarA = m.INSTANCE;
                    }
                    if (aVar != null) {
                        mVarI = hd.i(m.INSTANCE);
                    } else {
                        mVarI = m.INSTANCE;
                    }
                    m mVarO3 = androidx.compose.foundation.layout.d.o(a3.n(androidx.compose.foundation.layout.d.E(mVar5.u(mVarI).u(mVarA), c.INSTANCE.e(), false, 2, obj), f57143a), s0.f115231a.c());
                    zW = rVarH.W(f6VarB) | rVarH.W(f6VarD);
                    objE = rVarH.E();
                    if (zW) {
                        objE = new er.l() { // from class: f2.mh
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return oh.d(f6VarB, f6VarD, (p3.f) obj2);
                            }
                        };
                        rVarH.v(objE);
                    } else {
                        objE = new er.l() { // from class: f2.mh
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return oh.d(f6VarB, f6VarD, (p3.f) obj2);
                            }
                        };
                        rVarH.v(objE);
                    }
                    z.b(mVarO3, (er.l) objE, rVarH, 0);
                    if (t.k()) {
                        t.n();
                    }
                    lVar2 = lVar;
                    khVar2 = khVar3;
                    mVar3 = mVar5;
                } else {
                    rVarH.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    z19 = z17;
                    khVar2 = khVarA;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.nh
                        @Override // er.p
                        public final Object B(Object obj2, Object obj3) {
                            return oh.e(z15, aVar, mVar3, z19, khVar2, lVar2, i15, i16, (r) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            z17 = z16;
            if ((i15 & 24576) == 0) {
                if ((i16 & 16) == 0) {
                    khVarA = khVar;
                    if (rVarH.W(khVarA)) {
                        i28 = 16384;
                    }
                    i17 |= i28;
                } else {
                    khVarA = khVar;
                }
                i28 = PKIFailureInfo.certRevoked;
                i17 |= i28;
            } else {
                khVarA = khVar;
            }
            i25 = i16 & 32;
            if (i25 != 0) {
                if ((196608 & i15) == 0) {
                    if (rVarH.W(lVar)) {
                        i26 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i26 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i26;
                }
                if ((74899 & i17) != 74898) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (rVarH.r(z18, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i29 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if ((i16 & 16) != 0) {
                            i17 &= -57345;
                            khVarA = lh.f56740a.a(rVarH, 6);
                        }
                        if (i25 != 0) {
                            i27 = i17;
                            z25 = z17;
                            khVar3 = khVarA;
                            lVar = null;
                        } else {
                            i27 = i17;
                            z25 = z17;
                            khVar3 = khVarA;
                        }
                    } else {
                        if (i29 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if ((i16 & 16) != 0) {
                            i17 &= -57345;
                            khVarA = lh.f56740a.a(rVarH, 6);
                        }
                        if (i25 != 0) {
                            i27 = i17;
                            z25 = z17;
                            khVar3 = khVarA;
                            lVar = null;
                        } else {
                            i27 = i17;
                            z25 = z17;
                            khVar3 = khVarA;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(408580840, i27, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:81)");
                    }
                    if (z15) {
                        fN = h.n(f57144b / 2);
                    } else {
                        fN = h.n(0);
                    }
                    f6VarD = f.d(fN, of.b(k0.FastSpatial, rVarH, 6), null, null, rVarH, 0, 12);
                    f6VarB = khVar3.b(z25, z15, rVarH, ((i27 >> 6) & 896) | ((i27 >> 9) & 14) | ((i27 << 3) & 112));
                    if (aVar != null) {
                        m mVar9 = mVar4;
                        z19 = z25;
                        mVar5 = mVar9;
                        obj = null;
                        mVarA = d.a(m.INSTANCE, z15, lVar, i.h(false, h.n(s0.f115231a.e() / 2), 0L, l1.h.i(), false, false, false, false, 244, null), z19, n4.l.j(n4.l.INSTANCE.f()), aVar);
                    } else {
                        obj = null;
                        mVar5 = mVar4;
                        z19 = z25;
                        mVarA = m.INSTANCE;
                    }
                    if (aVar != null) {
                        mVarI = hd.i(m.INSTANCE);
                    } else {
                        mVarI = m.INSTANCE;
                    }
                    m mVarO4 = androidx.compose.foundation.layout.d.o(a3.n(androidx.compose.foundation.layout.d.E(mVar5.u(mVarI).u(mVarA), c.INSTANCE.e(), false, 2, obj), f57143a), s0.f115231a.c());
                    zW = rVarH.W(f6VarB) | rVarH.W(f6VarD);
                    objE = rVarH.E();
                    if (zW) {
                        objE = new er.l() { // from class: f2.mh
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return oh.d(f6VarB, f6VarD, (p3.f) obj2);
                            }
                        };
                        rVarH.v(objE);
                    } else {
                        objE = new er.l() { // from class: f2.mh
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return oh.d(f6VarB, f6VarD, (p3.f) obj2);
                            }
                        };
                        rVarH.v(objE);
                    }
                    z.b(mVarO4, (er.l) objE, rVarH, 0);
                    if (t.k()) {
                        t.n();
                    }
                    lVar2 = lVar;
                    khVar2 = khVar3;
                    mVar3 = mVar5;
                } else {
                    rVarH.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    z19 = z17;
                    khVar2 = khVarA;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.nh
                        @Override // er.p
                        public final Object B(Object obj2, Object obj3) {
                            return oh.e(z15, aVar, mVar3, z19, khVar2, lVar2, i15, i16, (r) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            if ((74899 & i17) != 74898) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (rVarH.r(z18, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i29 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    if ((i16 & 16) != 0) {
                        i17 &= -57345;
                        khVarA = lh.f56740a.a(rVarH, 6);
                    }
                    if (i25 != 0) {
                        i27 = i17;
                        z25 = z17;
                        khVar3 = khVarA;
                        lVar = null;
                    } else {
                        i27 = i17;
                        z25 = z17;
                        khVar3 = khVarA;
                    }
                } else {
                    if (i29 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    if ((i16 & 16) != 0) {
                        i17 &= -57345;
                        khVarA = lh.f56740a.a(rVarH, 6);
                    }
                    if (i25 != 0) {
                        i27 = i17;
                        z25 = z17;
                        khVar3 = khVarA;
                        lVar = null;
                    } else {
                        i27 = i17;
                        z25 = z17;
                        khVar3 = khVarA;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(408580840, i27, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:81)");
                }
                if (z15) {
                    fN = h.n(f57144b / 2);
                } else {
                    fN = h.n(0);
                }
                f6VarD = f.d(fN, of.b(k0.FastSpatial, rVarH, 6), null, null, rVarH, 0, 12);
                f6VarB = khVar3.b(z25, z15, rVarH, ((i27 >> 6) & 896) | ((i27 >> 9) & 14) | ((i27 << 3) & 112));
                if (aVar != null) {
                    m mVar10 = mVar4;
                    z19 = z25;
                    mVar5 = mVar10;
                    obj = null;
                    mVarA = d.a(m.INSTANCE, z15, lVar, i.h(false, h.n(s0.f115231a.e() / 2), 0L, l1.h.i(), false, false, false, false, 244, null), z19, n4.l.j(n4.l.INSTANCE.f()), aVar);
                } else {
                    obj = null;
                    mVar5 = mVar4;
                    z19 = z25;
                    mVarA = m.INSTANCE;
                }
                if (aVar != null) {
                    mVarI = hd.i(m.INSTANCE);
                } else {
                    mVarI = m.INSTANCE;
                }
                m mVarO5 = androidx.compose.foundation.layout.d.o(a3.n(androidx.compose.foundation.layout.d.E(mVar5.u(mVarI).u(mVarA), c.INSTANCE.e(), false, 2, obj), f57143a), s0.f115231a.c());
                zW = rVarH.W(f6VarB) | rVarH.W(f6VarD);
                objE = rVarH.E();
                if (zW) {
                    objE = new er.l() { // from class: f2.mh
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return oh.d(f6VarB, f6VarD, (p3.f) obj2);
                        }
                    };
                    rVarH.v(objE);
                } else {
                    objE = new er.l() { // from class: f2.mh
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return oh.d(f6VarB, f6VarD, (p3.f) obj2);
                        }
                    };
                    rVarH.v(objE);
                }
                z.b(mVarO5, (er.l) objE, rVarH, 0);
                if (t.k()) {
                    t.n();
                }
                lVar2 = lVar;
                khVar2 = khVar3;
                mVar3 = mVar5;
            } else {
                rVarH.O();
                lVar2 = lVar;
                mVar3 = mVar2;
                z19 = z17;
                khVar2 = khVarA;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.nh
                    @Override // er.p
                    public final Object B(Object obj2, Object obj3) {
                        return oh.e(z15, aVar, mVar3, z19, khVar2, lVar2, i15, i16, (r) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        i18 = i16 & 8;
        if (i18 != 0) {
            if ((i15 & 3072) == 0) {
                z17 = z16;
                if (rVarH.a(z17)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
            if ((i15 & 24576) == 0) {
                if ((i16 & 16) == 0) {
                    khVarA = khVar;
                    if (rVarH.W(khVarA)) {
                        i28 = 16384;
                    }
                    i17 |= i28;
                } else {
                    khVarA = khVar;
                }
                i28 = PKIFailureInfo.certRevoked;
                i17 |= i28;
            } else {
                khVarA = khVar;
            }
            i25 = i16 & 32;
            if (i25 != 0) {
                if ((196608 & i15) == 0) {
                    if (rVarH.W(lVar)) {
                        i26 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i26 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i26;
                }
                if ((74899 & i17) != 74898) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (rVarH.r(z18, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i29 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if ((i16 & 16) != 0) {
                            i17 &= -57345;
                            khVarA = lh.f56740a.a(rVarH, 6);
                        }
                        if (i25 != 0) {
                            i27 = i17;
                            z25 = z17;
                            khVar3 = khVarA;
                            lVar = null;
                        } else {
                            i27 = i17;
                            z25 = z17;
                            khVar3 = khVarA;
                        }
                    } else {
                        if (i29 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if ((i16 & 16) != 0) {
                            i17 &= -57345;
                            khVarA = lh.f56740a.a(rVarH, 6);
                        }
                        if (i25 != 0) {
                            i27 = i17;
                            z25 = z17;
                            khVar3 = khVarA;
                            lVar = null;
                        } else {
                            i27 = i17;
                            z25 = z17;
                            khVar3 = khVarA;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(408580840, i27, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:81)");
                    }
                    if (z15) {
                        fN = h.n(f57144b / 2);
                    } else {
                        fN = h.n(0);
                    }
                    f6VarD = f.d(fN, of.b(k0.FastSpatial, rVarH, 6), null, null, rVarH, 0, 12);
                    f6VarB = khVar3.b(z25, z15, rVarH, ((i27 >> 6) & 896) | ((i27 >> 9) & 14) | ((i27 << 3) & 112));
                    if (aVar != null) {
                        m mVar11 = mVar4;
                        z19 = z25;
                        mVar5 = mVar11;
                        obj = null;
                        mVarA = d.a(m.INSTANCE, z15, lVar, i.h(false, h.n(s0.f115231a.e() / 2), 0L, l1.h.i(), false, false, false, false, 244, null), z19, n4.l.j(n4.l.INSTANCE.f()), aVar);
                    } else {
                        obj = null;
                        mVar5 = mVar4;
                        z19 = z25;
                        mVarA = m.INSTANCE;
                    }
                    if (aVar != null) {
                        mVarI = hd.i(m.INSTANCE);
                    } else {
                        mVarI = m.INSTANCE;
                    }
                    m mVarO6 = androidx.compose.foundation.layout.d.o(a3.n(androidx.compose.foundation.layout.d.E(mVar5.u(mVarI).u(mVarA), c.INSTANCE.e(), false, 2, obj), f57143a), s0.f115231a.c());
                    zW = rVarH.W(f6VarB) | rVarH.W(f6VarD);
                    objE = rVarH.E();
                    if (zW) {
                        objE = new er.l() { // from class: f2.mh
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return oh.d(f6VarB, f6VarD, (p3.f) obj2);
                            }
                        };
                        rVarH.v(objE);
                    } else {
                        objE = new er.l() { // from class: f2.mh
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return oh.d(f6VarB, f6VarD, (p3.f) obj2);
                            }
                        };
                        rVarH.v(objE);
                    }
                    z.b(mVarO6, (er.l) objE, rVarH, 0);
                    if (t.k()) {
                        t.n();
                    }
                    lVar2 = lVar;
                    khVar2 = khVar3;
                    mVar3 = mVar5;
                } else {
                    rVarH.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    z19 = z17;
                    khVar2 = khVarA;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.nh
                        @Override // er.p
                        public final Object B(Object obj2, Object obj3) {
                            return oh.e(z15, aVar, mVar3, z19, khVar2, lVar2, i15, i16, (r) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            if ((74899 & i17) != 74898) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (rVarH.r(z18, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i29 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    if ((i16 & 16) != 0) {
                        i17 &= -57345;
                        khVarA = lh.f56740a.a(rVarH, 6);
                    }
                    if (i25 != 0) {
                        i27 = i17;
                        z25 = z17;
                        khVar3 = khVarA;
                        lVar = null;
                    } else {
                        i27 = i17;
                        z25 = z17;
                        khVar3 = khVarA;
                    }
                } else {
                    if (i29 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    if ((i16 & 16) != 0) {
                        i17 &= -57345;
                        khVarA = lh.f56740a.a(rVarH, 6);
                    }
                    if (i25 != 0) {
                        i27 = i17;
                        z25 = z17;
                        khVar3 = khVarA;
                        lVar = null;
                    } else {
                        i27 = i17;
                        z25 = z17;
                        khVar3 = khVarA;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(408580840, i27, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:81)");
                }
                if (z15) {
                    fN = h.n(f57144b / 2);
                } else {
                    fN = h.n(0);
                }
                f6VarD = f.d(fN, of.b(k0.FastSpatial, rVarH, 6), null, null, rVarH, 0, 12);
                f6VarB = khVar3.b(z25, z15, rVarH, ((i27 >> 6) & 896) | ((i27 >> 9) & 14) | ((i27 << 3) & 112));
                if (aVar != null) {
                    m mVar12 = mVar4;
                    z19 = z25;
                    mVar5 = mVar12;
                    obj = null;
                    mVarA = d.a(m.INSTANCE, z15, lVar, i.h(false, h.n(s0.f115231a.e() / 2), 0L, l1.h.i(), false, false, false, false, 244, null), z19, n4.l.j(n4.l.INSTANCE.f()), aVar);
                } else {
                    obj = null;
                    mVar5 = mVar4;
                    z19 = z25;
                    mVarA = m.INSTANCE;
                }
                if (aVar != null) {
                    mVarI = hd.i(m.INSTANCE);
                } else {
                    mVarI = m.INSTANCE;
                }
                m mVarO7 = androidx.compose.foundation.layout.d.o(a3.n(androidx.compose.foundation.layout.d.E(mVar5.u(mVarI).u(mVarA), c.INSTANCE.e(), false, 2, obj), f57143a), s0.f115231a.c());
                zW = rVarH.W(f6VarB) | rVarH.W(f6VarD);
                objE = rVarH.E();
                if (zW) {
                    objE = new er.l() { // from class: f2.mh
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return oh.d(f6VarB, f6VarD, (p3.f) obj2);
                        }
                    };
                    rVarH.v(objE);
                } else {
                    objE = new er.l() { // from class: f2.mh
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return oh.d(f6VarB, f6VarD, (p3.f) obj2);
                        }
                    };
                    rVarH.v(objE);
                }
                z.b(mVarO7, (er.l) objE, rVarH, 0);
                if (t.k()) {
                    t.n();
                }
                lVar2 = lVar;
                khVar2 = khVar3;
                mVar3 = mVar5;
            } else {
                rVarH.O();
                lVar2 = lVar;
                mVar3 = mVar2;
                z19 = z17;
                khVar2 = khVarA;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.nh
                    @Override // er.p
                    public final Object B(Object obj2, Object obj3) {
                        return oh.e(z15, aVar, mVar3, z19, khVar2, lVar2, i15, i16, (r) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        z17 = z16;
        if ((i15 & 24576) == 0) {
            if ((i16 & 16) == 0) {
                khVarA = khVar;
                if (rVarH.W(khVarA)) {
                    i28 = 16384;
                }
                i17 |= i28;
            } else {
                khVarA = khVar;
            }
            i28 = PKIFailureInfo.certRevoked;
            i17 |= i28;
        } else {
            khVarA = khVar;
        }
        i25 = i16 & 32;
        if (i25 != 0) {
            if ((196608 & i15) == 0) {
                if (rVarH.W(lVar)) {
                    i26 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i26 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i26;
            }
            if ((74899 & i17) != 74898) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (rVarH.r(z18, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i29 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    if ((i16 & 16) != 0) {
                        i17 &= -57345;
                        khVarA = lh.f56740a.a(rVarH, 6);
                    }
                    if (i25 != 0) {
                        i27 = i17;
                        z25 = z17;
                        khVar3 = khVarA;
                        lVar = null;
                    } else {
                        i27 = i17;
                        z25 = z17;
                        khVar3 = khVarA;
                    }
                } else {
                    if (i29 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    if ((i16 & 16) != 0) {
                        i17 &= -57345;
                        khVarA = lh.f56740a.a(rVarH, 6);
                    }
                    if (i25 != 0) {
                        i27 = i17;
                        z25 = z17;
                        khVar3 = khVarA;
                        lVar = null;
                    } else {
                        i27 = i17;
                        z25 = z17;
                        khVar3 = khVarA;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(408580840, i27, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:81)");
                }
                if (z15) {
                    fN = h.n(f57144b / 2);
                } else {
                    fN = h.n(0);
                }
                f6VarD = f.d(fN, of.b(k0.FastSpatial, rVarH, 6), null, null, rVarH, 0, 12);
                f6VarB = khVar3.b(z25, z15, rVarH, ((i27 >> 6) & 896) | ((i27 >> 9) & 14) | ((i27 << 3) & 112));
                if (aVar != null) {
                    m mVar13 = mVar4;
                    z19 = z25;
                    mVar5 = mVar13;
                    obj = null;
                    mVarA = d.a(m.INSTANCE, z15, lVar, i.h(false, h.n(s0.f115231a.e() / 2), 0L, l1.h.i(), false, false, false, false, 244, null), z19, n4.l.j(n4.l.INSTANCE.f()), aVar);
                } else {
                    obj = null;
                    mVar5 = mVar4;
                    z19 = z25;
                    mVarA = m.INSTANCE;
                }
                if (aVar != null) {
                    mVarI = hd.i(m.INSTANCE);
                } else {
                    mVarI = m.INSTANCE;
                }
                m mVarO8 = androidx.compose.foundation.layout.d.o(a3.n(androidx.compose.foundation.layout.d.E(mVar5.u(mVarI).u(mVarA), c.INSTANCE.e(), false, 2, obj), f57143a), s0.f115231a.c());
                zW = rVarH.W(f6VarB) | rVarH.W(f6VarD);
                objE = rVarH.E();
                if (zW) {
                    objE = new er.l() { // from class: f2.mh
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return oh.d(f6VarB, f6VarD, (p3.f) obj2);
                        }
                    };
                    rVarH.v(objE);
                } else {
                    objE = new er.l() { // from class: f2.mh
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return oh.d(f6VarB, f6VarD, (p3.f) obj2);
                        }
                    };
                    rVarH.v(objE);
                }
                z.b(mVarO8, (er.l) objE, rVarH, 0);
                if (t.k()) {
                    t.n();
                }
                lVar2 = lVar;
                khVar2 = khVar3;
                mVar3 = mVar5;
            } else {
                rVarH.O();
                lVar2 = lVar;
                mVar3 = mVar2;
                z19 = z17;
                khVar2 = khVarA;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.nh
                    @Override // er.p
                    public final Object B(Object obj2, Object obj3) {
                        return oh.e(z15, aVar, mVar3, z19, khVar2, lVar2, i15, i16, (r) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i17 |= 196608;
        if ((74899 & i17) != 74898) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (rVarH.r(z18, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i29 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    z17 = true;
                }
                if ((i16 & 16) != 0) {
                    i17 &= -57345;
                    khVarA = lh.f56740a.a(rVarH, 6);
                }
                if (i25 != 0) {
                    i27 = i17;
                    z25 = z17;
                    khVar3 = khVarA;
                    lVar = null;
                } else {
                    i27 = i17;
                    z25 = z17;
                    khVar3 = khVarA;
                }
            } else {
                if (i29 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    z17 = true;
                }
                if ((i16 & 16) != 0) {
                    i17 &= -57345;
                    khVarA = lh.f56740a.a(rVarH, 6);
                }
                if (i25 != 0) {
                    i27 = i17;
                    z25 = z17;
                    khVar3 = khVarA;
                    lVar = null;
                } else {
                    i27 = i17;
                    z25 = z17;
                    khVar3 = khVarA;
                }
            }
            rVarH.y();
            if (t.k()) {
                t.o(408580840, i27, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:81)");
            }
            if (z15) {
                fN = h.n(f57144b / 2);
            } else {
                fN = h.n(0);
            }
            f6VarD = f.d(fN, of.b(k0.FastSpatial, rVarH, 6), null, null, rVarH, 0, 12);
            f6VarB = khVar3.b(z25, z15, rVarH, ((i27 >> 6) & 896) | ((i27 >> 9) & 14) | ((i27 << 3) & 112));
            if (aVar != null) {
                m mVar14 = mVar4;
                z19 = z25;
                mVar5 = mVar14;
                obj = null;
                mVarA = d.a(m.INSTANCE, z15, lVar, i.h(false, h.n(s0.f115231a.e() / 2), 0L, l1.h.i(), false, false, false, false, 244, null), z19, n4.l.j(n4.l.INSTANCE.f()), aVar);
            } else {
                obj = null;
                mVar5 = mVar4;
                z19 = z25;
                mVarA = m.INSTANCE;
            }
            if (aVar != null) {
                mVarI = hd.i(m.INSTANCE);
            } else {
                mVarI = m.INSTANCE;
            }
            m mVarO9 = androidx.compose.foundation.layout.d.o(a3.n(androidx.compose.foundation.layout.d.E(mVar5.u(mVarI).u(mVarA), c.INSTANCE.e(), false, 2, obj), f57143a), s0.f115231a.c());
            zW = rVarH.W(f6VarB) | rVarH.W(f6VarD);
            objE = rVarH.E();
            if (zW) {
                objE = new er.l() { // from class: f2.mh
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return oh.d(f6VarB, f6VarD, (p3.f) obj2);
                    }
                };
                rVarH.v(objE);
            } else {
                objE = new er.l() { // from class: f2.mh
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return oh.d(f6VarB, f6VarD, (p3.f) obj2);
                    }
                };
                rVarH.v(objE);
            }
            z.b(mVarO9, (er.l) objE, rVarH, 0);
            if (t.k()) {
                t.n();
            }
            lVar2 = lVar;
            khVar2 = khVar3;
            mVar3 = mVar5;
        } else {
            rVarH.O();
            lVar2 = lVar;
            mVar3 = mVar2;
            z19 = z17;
            khVar2 = khVarA;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.nh
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return oh.e(z15, aVar, mVar3, z19, khVar2, lVar2, i15, i16, (r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(f6 f6Var, f6 f6Var2, p3.f fVar) {
        float fL2 = fVar.l2(f57145c);
        float f15 = 2;
        float f16 = fL2 / f15;
        p3.f.x2(fVar, ((Color) f6Var.getValue()).m20unboximpl(), fVar.l2(h.n(s0.f115231a.c() / f15)) - f16, 0L, 0.0f, new Stroke(fL2, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
        if (h.l(((h) f6Var2.getValue()).getValue(), h.n(0)) > 0) {
            p3.f.x2(fVar, ((Color) f6Var.getValue()).m20unboximpl(), fVar.l2(((h) f6Var2.getValue()).getValue()) - f16, 0L, 0.0f, j.f152592b, null, 0, 108, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(boolean z15, a aVar, m mVar, boolean z16, kh khVar, l lVar, int i15, int i16, r rVar, int i17) {
        c(z15, aVar, mVar, z16, khVar, lVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
