package p046f2;

import androidx.compose.foundation.layout.d;
import androidx.compose.material3.i;
import androidx.compose.ui.graphics.Color;
import b1.j;
import b1.k;
import c5.h;
import d1.x;
import er.a;
import er.l;
import er.p;
import f3.c;
import f3.m;
import k1.g;
import l2.e1;
import l2.k0;
import n3.y2;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import u0.n1;
import w0.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001ai\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aO\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u001a\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001d\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0014\u0010\u001e\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017\"\u0014\u0010 \u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017\"\u0014\u0010!\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017\"\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"", "checked", "Lkotlin/Function1;", "Loq/i0;", "onCheckedChange", "Lf3/m;", "modifier", "Lkotlin/Function0;", "thumbContent", "enabled", "Lf2/dm;", "colors", "Lb1/l;", "interactionSource", "c", "(ZLer/l;Lf3/m;Ler/p;ZLf2/dm;Lb1/l;Lm2/r;II)V", "Lb1/j;", "Ln3/y2;", "thumbShape", "e", "(Lf3/m;ZZLf2/dm;Ler/p;Lb1/j;Ln3/y2;Lm2/r;I)V", "Lc5/h;", "a", "F", "k", "()F", "ThumbDiameter", "b", "l", "UncheckedThumbDiameter", "SwitchWidth", "d", "SwitchHeight", "ThumbPadding", "Lu0/n1;", "", "f", "Lu0/n1;", "SnapSpec", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class hm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f56118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f56119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f56120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f56121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f56122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final n1<Float> f56123f;

    static {
        e1 e1Var = e1.f114447a;
        float fP = e1Var.p();
        f56118a = fP;
        f56119b = e1Var.z();
        f56120c = e1Var.w();
        float fT = e1Var.t();
        f56121d = fT;
        f56122e = h.n(h.n(fT - fP) / 2);
        f56123f = new n1<>(0, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011c  */
    /* JADX WARN: Code duplicated, block: B:103:0x012b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0136  */
    /* JADX WARN: Code duplicated, block: B:107:0x0148  */
    /* JADX WARN: Code duplicated, block: B:109:0x0156  */
    /* JADX WARN: Code duplicated, block: B:111:0x0163  */
    /* JADX WARN: Code duplicated, block: B:112:0x0180  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0103  */
    /* JADX WARN: Code duplicated, block: B:96:0x0109  */
    /* JADX WARN: Code duplicated, block: B:98:0x0114  */
    public static final void c(final boolean z15, final l<? super Boolean, i0> lVar, m mVar, p<? super r, ? super Integer, i0> pVar, boolean z16, dm dmVar, b1.l lVar2, r rVar, final int i15, final int i16) {
        boolean z17;
        int i17;
        m mVar2;
        int i18;
        p<? super r, ? super Integer, i0> pVar2;
        int i19;
        int i25;
        boolean z18;
        int i26;
        dm dmVarA;
        int i27;
        b1.l lVar3;
        int i28;
        boolean z19;
        r rVar2;
        final m mVar3;
        final p<? super r, ? super Integer, i0> pVar3;
        final boolean z25;
        final dm dmVar2;
        final b1.l lVar4;
        d5 d5VarM;
        m mVar4;
        b1.l lVar5;
        p<? super r, ? super Integer, i0> pVar4;
        m mVar5;
        b1.l lVar6;
        boolean z26;
        boolean z27;
        m mVarA;
        Object objE;
        int i29;
        r rVarH = rVar.h(-263339167);
        if ((i15 & 6) == 0) {
            z17 = z15;
            i17 = (rVarH.a(z17) ? 4 : 2) | i15;
        } else {
            z17 = z15;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(lVar) ? 32 : 16;
        }
        int i35 = i16 & 4;
        if (i35 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 256 : 128;
            }
            i18 = i16 & 8;
            if (i18 != 0) {
                if ((i15 & 3072) == 0) {
                    pVar2 = pVar;
                    if (rVarH.G(pVar2)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 16;
                if (i25 != 0) {
                    if ((i15 & 24576) == 0) {
                        z18 = z16;
                        if (rVarH.a(z18)) {
                            i26 = 16384;
                        } else {
                            i26 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i26;
                    }
                    if ((196608 & i15) == 0) {
                        if ((i16 & 32) == 0) {
                            dmVarA = dmVar;
                            if (rVarH.W(dmVarA)) {
                                i29 = PKIFailureInfo.unsupportedVersion;
                            }
                            i17 |= i29;
                        } else {
                            dmVarA = dmVar;
                        }
                        i29 = PKIFailureInfo.notAuthorized;
                        i17 |= i29;
                    } else {
                        dmVarA = dmVar;
                    }
                    i27 = i16 & 64;
                    if (i27 != 0) {
                        if ((1572864 & i15) == 0) {
                            lVar3 = lVar2;
                            if (rVarH.W(lVar3)) {
                                i28 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i28 = PKIFailureInfo.signerNotTrusted;
                            }
                            i17 |= i28;
                        }
                        if ((i17 & 599187) != 599186) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (rVarH.r(z19, i17 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0 || rVarH.Q()) {
                                if (i35 != 0) {
                                    mVar4 = m.INSTANCE;
                                } else {
                                    mVar4 = mVar2;
                                }
                                if (i18 != 0) {
                                    pVar2 = null;
                                }
                                if (i25 != 0) {
                                    z18 = true;
                                }
                                if ((i16 & 32) != 0) {
                                    i17 &= -458753;
                                    dmVarA = em.f55799a.a(rVarH, 6);
                                }
                                if (i27 != 0) {
                                    lVar5 = null;
                                } else {
                                    lVar5 = lVar3;
                                }
                                pVar4 = pVar2;
                                mVar5 = mVar4;
                            } else {
                                rVarH.O();
                                if ((i16 & 32) != 0) {
                                    i17 &= -458753;
                                }
                                i17 = i17;
                                z18 = z18;
                                dmVarA = dmVarA;
                                lVar5 = lVar3;
                                pVar4 = pVar2;
                                mVar5 = mVar2;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(-263339167, i17, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                            }
                            if (lVar5 == null) {
                                rVarH.X(1768510810);
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = k.a();
                                    rVarH.v(objE);
                                }
                                rVarH.R();
                                lVar6 = (b1.l) objE;
                            } else {
                                rVarH.X(334142749);
                                rVarH.R();
                                lVar6 = lVar5;
                            }
                            if (lVar != null) {
                                z26 = z18;
                                z27 = false;
                                mVarA = g.a(hd.i(m.INSTANCE), z17, lVar6, null, z26, n4.l.j(n4.l.INSTANCE.g()), lVar);
                            } else {
                                z26 = z18;
                                z27 = false;
                                mVarA = m.INSTANCE;
                            }
                            int i36 = i17 << 3;
                            int i37 = i17 >> 6;
                            rVar2 = rVarH;
                            m mVar6 = mVar5;
                            e(d.p(d.E(mVar5.u(mVarA), c.INSTANCE.e(), z27, 2, null), f56120c, f56121d), z15, z26, dmVarA, pVar4, lVar6, ui.h(e1.f114447a.m(), rVarH, 6), rVar2, (i36 & 112) | (i37 & 896) | (i37 & 7168) | (i36 & 57344));
                            if (t.k()) {
                                t.n();
                            }
                            mVar3 = mVar6;
                            z25 = z26;
                            dmVar2 = dmVarA;
                            pVar3 = pVar4;
                            lVar4 = lVar5;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            mVar3 = mVar2;
                            pVar3 = pVar2;
                            z25 = z18;
                            dmVar2 = dmVarA;
                            lVar4 = lVar3;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.fm
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return hm.d(z15, lVar, mVar3, pVar3, z25, dmVar2, lVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 1572864;
                    lVar3 = lVar2;
                    if ((i17 & 599187) != 599186) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (rVarH.r(z19, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i35 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                pVar2 = null;
                            }
                            if (i25 != 0) {
                                z18 = true;
                            }
                            if ((i16 & 32) != 0) {
                                i17 &= -458753;
                                dmVarA = em.f55799a.a(rVarH, 6);
                            }
                            if (i27 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar3;
                            }
                            pVar4 = pVar2;
                            mVar5 = mVar4;
                        } else {
                            if (i35 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                pVar2 = null;
                            }
                            if (i25 != 0) {
                                z18 = true;
                            }
                            if ((i16 & 32) != 0) {
                                i17 &= -458753;
                                dmVarA = em.f55799a.a(rVarH, 6);
                            }
                            if (i27 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar3;
                            }
                            pVar4 = pVar2;
                            mVar5 = mVar4;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-263339167, i17, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                        }
                        if (lVar5 == null) {
                            rVarH.X(1768510810);
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = k.a();
                                rVarH.v(objE);
                            }
                            rVarH.R();
                            lVar6 = (b1.l) objE;
                        } else {
                            rVarH.X(334142749);
                            rVarH.R();
                            lVar6 = lVar5;
                        }
                        if (lVar != null) {
                            z26 = z18;
                            z27 = false;
                            mVarA = g.a(hd.i(m.INSTANCE), z17, lVar6, null, z26, n4.l.j(n4.l.INSTANCE.g()), lVar);
                        } else {
                            z26 = z18;
                            z27 = false;
                            mVarA = m.INSTANCE;
                        }
                        int i38 = i17 << 3;
                        int i39 = i17 >> 6;
                        rVar2 = rVarH;
                        m mVar7 = mVar5;
                        e(d.p(d.E(mVar5.u(mVarA), c.INSTANCE.e(), z27, 2, null), f56120c, f56121d), z15, z26, dmVarA, pVar4, lVar6, ui.h(e1.f114447a.m(), rVarH, 6), rVar2, (i38 & 112) | (i39 & 896) | (i39 & 7168) | (i38 & 57344));
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar7;
                        z25 = z26;
                        dmVar2 = dmVarA;
                        pVar3 = pVar4;
                        lVar4 = lVar5;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar3 = mVar2;
                        pVar3 = pVar2;
                        z25 = z18;
                        dmVar2 = dmVarA;
                        lVar4 = lVar3;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.fm
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return hm.d(z15, lVar, mVar3, pVar3, z25, dmVar2, lVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 24576;
                z18 = z16;
                if ((196608 & i15) == 0) {
                    if ((i16 & 32) == 0) {
                        dmVarA = dmVar;
                        if (rVarH.W(dmVarA)) {
                            i29 = PKIFailureInfo.unsupportedVersion;
                        }
                        i17 |= i29;
                    } else {
                        dmVarA = dmVar;
                    }
                    i29 = PKIFailureInfo.notAuthorized;
                    i17 |= i29;
                } else {
                    dmVarA = dmVar;
                }
                i27 = i16 & 64;
                if (i27 != 0) {
                    if ((1572864 & i15) == 0) {
                        lVar3 = lVar2;
                        if (rVarH.W(lVar3)) {
                            i28 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i28 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i28;
                    }
                    if ((i17 & 599187) != 599186) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (rVarH.r(z19, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i35 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                pVar2 = null;
                            }
                            if (i25 != 0) {
                                z18 = true;
                            }
                            if ((i16 & 32) != 0) {
                                i17 &= -458753;
                                dmVarA = em.f55799a.a(rVarH, 6);
                            }
                            if (i27 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar3;
                            }
                            pVar4 = pVar2;
                            mVar5 = mVar4;
                        } else {
                            if (i35 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                pVar2 = null;
                            }
                            if (i25 != 0) {
                                z18 = true;
                            }
                            if ((i16 & 32) != 0) {
                                i17 &= -458753;
                                dmVarA = em.f55799a.a(rVarH, 6);
                            }
                            if (i27 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar3;
                            }
                            pVar4 = pVar2;
                            mVar5 = mVar4;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-263339167, i17, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                        }
                        if (lVar5 == null) {
                            rVarH.X(1768510810);
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = k.a();
                                rVarH.v(objE);
                            }
                            rVarH.R();
                            lVar6 = (b1.l) objE;
                        } else {
                            rVarH.X(334142749);
                            rVarH.R();
                            lVar6 = lVar5;
                        }
                        if (lVar != null) {
                            z26 = z18;
                            z27 = false;
                            mVarA = g.a(hd.i(m.INSTANCE), z17, lVar6, null, z26, n4.l.j(n4.l.INSTANCE.g()), lVar);
                        } else {
                            z26 = z18;
                            z27 = false;
                            mVarA = m.INSTANCE;
                        }
                        int i310 = i17 << 3;
                        int i311 = i17 >> 6;
                        rVar2 = rVarH;
                        m mVar8 = mVar5;
                        e(d.p(d.E(mVar5.u(mVarA), c.INSTANCE.e(), z27, 2, null), f56120c, f56121d), z15, z26, dmVarA, pVar4, lVar6, ui.h(e1.f114447a.m(), rVarH, 6), rVar2, (i310 & 112) | (i311 & 896) | (i311 & 7168) | (i310 & 57344));
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar8;
                        z25 = z26;
                        dmVar2 = dmVarA;
                        pVar3 = pVar4;
                        lVar4 = lVar5;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar3 = mVar2;
                        pVar3 = pVar2;
                        z25 = z18;
                        dmVar2 = dmVarA;
                        lVar4 = lVar3;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.fm
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return hm.d(z15, lVar, mVar3, pVar3, z25, dmVar2, lVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 1572864;
                lVar3 = lVar2;
                if ((i17 & 599187) != 599186) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (rVarH.r(z19, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i35 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            pVar2 = null;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                            dmVarA = em.f55799a.a(rVarH, 6);
                        }
                        if (i27 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar3;
                        }
                        pVar4 = pVar2;
                        mVar5 = mVar4;
                    } else {
                        if (i35 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            pVar2 = null;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                            dmVarA = em.f55799a.a(rVarH, 6);
                        }
                        if (i27 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar3;
                        }
                        pVar4 = pVar2;
                        mVar5 = mVar4;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-263339167, i17, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                    }
                    if (lVar5 == null) {
                        rVarH.X(1768510810);
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = k.a();
                            rVarH.v(objE);
                        }
                        rVarH.R();
                        lVar6 = (b1.l) objE;
                    } else {
                        rVarH.X(334142749);
                        rVarH.R();
                        lVar6 = lVar5;
                    }
                    if (lVar != null) {
                        z26 = z18;
                        z27 = false;
                        mVarA = g.a(hd.i(m.INSTANCE), z17, lVar6, null, z26, n4.l.j(n4.l.INSTANCE.g()), lVar);
                    } else {
                        z26 = z18;
                        z27 = false;
                        mVarA = m.INSTANCE;
                    }
                    int i312 = i17 << 3;
                    int i313 = i17 >> 6;
                    rVar2 = rVarH;
                    m mVar9 = mVar5;
                    e(d.p(d.E(mVar5.u(mVarA), c.INSTANCE.e(), z27, 2, null), f56120c, f56121d), z15, z26, dmVarA, pVar4, lVar6, ui.h(e1.f114447a.m(), rVarH, 6), rVar2, (i312 & 112) | (i313 & 896) | (i313 & 7168) | (i312 & 57344));
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar9;
                    z25 = z26;
                    dmVar2 = dmVarA;
                    pVar3 = pVar4;
                    lVar4 = lVar5;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar3 = mVar2;
                    pVar3 = pVar2;
                    z25 = z18;
                    dmVar2 = dmVarA;
                    lVar4 = lVar3;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.fm
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return hm.d(z15, lVar, mVar3, pVar3, z25, dmVar2, lVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            pVar2 = pVar;
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    z18 = z16;
                    if (rVarH.a(z18)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                if ((196608 & i15) == 0) {
                    if ((i16 & 32) == 0) {
                        dmVarA = dmVar;
                        if (rVarH.W(dmVarA)) {
                            i29 = PKIFailureInfo.unsupportedVersion;
                        }
                        i17 |= i29;
                    } else {
                        dmVarA = dmVar;
                    }
                    i29 = PKIFailureInfo.notAuthorized;
                    i17 |= i29;
                } else {
                    dmVarA = dmVar;
                }
                i27 = i16 & 64;
                if (i27 != 0) {
                    if ((1572864 & i15) == 0) {
                        lVar3 = lVar2;
                        if (rVarH.W(lVar3)) {
                            i28 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i28 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i28;
                    }
                    if ((i17 & 599187) != 599186) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (rVarH.r(z19, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i35 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                pVar2 = null;
                            }
                            if (i25 != 0) {
                                z18 = true;
                            }
                            if ((i16 & 32) != 0) {
                                i17 &= -458753;
                                dmVarA = em.f55799a.a(rVarH, 6);
                            }
                            if (i27 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar3;
                            }
                            pVar4 = pVar2;
                            mVar5 = mVar4;
                        } else {
                            if (i35 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                pVar2 = null;
                            }
                            if (i25 != 0) {
                                z18 = true;
                            }
                            if ((i16 & 32) != 0) {
                                i17 &= -458753;
                                dmVarA = em.f55799a.a(rVarH, 6);
                            }
                            if (i27 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar3;
                            }
                            pVar4 = pVar2;
                            mVar5 = mVar4;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-263339167, i17, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                        }
                        if (lVar5 == null) {
                            rVarH.X(1768510810);
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = k.a();
                                rVarH.v(objE);
                            }
                            rVarH.R();
                            lVar6 = (b1.l) objE;
                        } else {
                            rVarH.X(334142749);
                            rVarH.R();
                            lVar6 = lVar5;
                        }
                        if (lVar != null) {
                            z26 = z18;
                            z27 = false;
                            mVarA = g.a(hd.i(m.INSTANCE), z17, lVar6, null, z26, n4.l.j(n4.l.INSTANCE.g()), lVar);
                        } else {
                            z26 = z18;
                            z27 = false;
                            mVarA = m.INSTANCE;
                        }
                        int i314 = i17 << 3;
                        int i315 = i17 >> 6;
                        rVar2 = rVarH;
                        m mVar10 = mVar5;
                        e(d.p(d.E(mVar5.u(mVarA), c.INSTANCE.e(), z27, 2, null), f56120c, f56121d), z15, z26, dmVarA, pVar4, lVar6, ui.h(e1.f114447a.m(), rVarH, 6), rVar2, (i314 & 112) | (i315 & 896) | (i315 & 7168) | (i314 & 57344));
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar10;
                        z25 = z26;
                        dmVar2 = dmVarA;
                        pVar3 = pVar4;
                        lVar4 = lVar5;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar3 = mVar2;
                        pVar3 = pVar2;
                        z25 = z18;
                        dmVar2 = dmVarA;
                        lVar4 = lVar3;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.fm
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return hm.d(z15, lVar, mVar3, pVar3, z25, dmVar2, lVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 1572864;
                lVar3 = lVar2;
                if ((i17 & 599187) != 599186) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (rVarH.r(z19, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i35 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            pVar2 = null;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                            dmVarA = em.f55799a.a(rVarH, 6);
                        }
                        if (i27 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar3;
                        }
                        pVar4 = pVar2;
                        mVar5 = mVar4;
                    } else {
                        if (i35 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            pVar2 = null;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                            dmVarA = em.f55799a.a(rVarH, 6);
                        }
                        if (i27 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar3;
                        }
                        pVar4 = pVar2;
                        mVar5 = mVar4;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-263339167, i17, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                    }
                    if (lVar5 == null) {
                        rVarH.X(1768510810);
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = k.a();
                            rVarH.v(objE);
                        }
                        rVarH.R();
                        lVar6 = (b1.l) objE;
                    } else {
                        rVarH.X(334142749);
                        rVarH.R();
                        lVar6 = lVar5;
                    }
                    if (lVar != null) {
                        z26 = z18;
                        z27 = false;
                        mVarA = g.a(hd.i(m.INSTANCE), z17, lVar6, null, z26, n4.l.j(n4.l.INSTANCE.g()), lVar);
                    } else {
                        z26 = z18;
                        z27 = false;
                        mVarA = m.INSTANCE;
                    }
                    int i316 = i17 << 3;
                    int i317 = i17 >> 6;
                    rVar2 = rVarH;
                    m mVar11 = mVar5;
                    e(d.p(d.E(mVar5.u(mVarA), c.INSTANCE.e(), z27, 2, null), f56120c, f56121d), z15, z26, dmVarA, pVar4, lVar6, ui.h(e1.f114447a.m(), rVarH, 6), rVar2, (i316 & 112) | (i317 & 896) | (i317 & 7168) | (i316 & 57344));
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar11;
                    z25 = z26;
                    dmVar2 = dmVarA;
                    pVar3 = pVar4;
                    lVar4 = lVar5;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar3 = mVar2;
                    pVar3 = pVar2;
                    z25 = z18;
                    dmVar2 = dmVarA;
                    lVar4 = lVar3;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.fm
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return hm.d(z15, lVar, mVar3, pVar3, z25, dmVar2, lVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            z18 = z16;
            if ((196608 & i15) == 0) {
                if ((i16 & 32) == 0) {
                    dmVarA = dmVar;
                    if (rVarH.W(dmVarA)) {
                        i29 = PKIFailureInfo.unsupportedVersion;
                    }
                    i17 |= i29;
                } else {
                    dmVarA = dmVar;
                }
                i29 = PKIFailureInfo.notAuthorized;
                i17 |= i29;
            } else {
                dmVarA = dmVar;
            }
            i27 = i16 & 64;
            if (i27 != 0) {
                if ((1572864 & i15) == 0) {
                    lVar3 = lVar2;
                    if (rVarH.W(lVar3)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                }
                if ((i17 & 599187) != 599186) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (rVarH.r(z19, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i35 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            pVar2 = null;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                            dmVarA = em.f55799a.a(rVarH, 6);
                        }
                        if (i27 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar3;
                        }
                        pVar4 = pVar2;
                        mVar5 = mVar4;
                    } else {
                        if (i35 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            pVar2 = null;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                            dmVarA = em.f55799a.a(rVarH, 6);
                        }
                        if (i27 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar3;
                        }
                        pVar4 = pVar2;
                        mVar5 = mVar4;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-263339167, i17, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                    }
                    if (lVar5 == null) {
                        rVarH.X(1768510810);
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = k.a();
                            rVarH.v(objE);
                        }
                        rVarH.R();
                        lVar6 = (b1.l) objE;
                    } else {
                        rVarH.X(334142749);
                        rVarH.R();
                        lVar6 = lVar5;
                    }
                    if (lVar != null) {
                        z26 = z18;
                        z27 = false;
                        mVarA = g.a(hd.i(m.INSTANCE), z17, lVar6, null, z26, n4.l.j(n4.l.INSTANCE.g()), lVar);
                    } else {
                        z26 = z18;
                        z27 = false;
                        mVarA = m.INSTANCE;
                    }
                    int i318 = i17 << 3;
                    int i319 = i17 >> 6;
                    rVar2 = rVarH;
                    m mVar12 = mVar5;
                    e(d.p(d.E(mVar5.u(mVarA), c.INSTANCE.e(), z27, 2, null), f56120c, f56121d), z15, z26, dmVarA, pVar4, lVar6, ui.h(e1.f114447a.m(), rVarH, 6), rVar2, (i318 & 112) | (i319 & 896) | (i319 & 7168) | (i318 & 57344));
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar12;
                    z25 = z26;
                    dmVar2 = dmVarA;
                    pVar3 = pVar4;
                    lVar4 = lVar5;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar3 = mVar2;
                    pVar3 = pVar2;
                    z25 = z18;
                    dmVar2 = dmVarA;
                    lVar4 = lVar3;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.fm
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return hm.d(z15, lVar, mVar3, pVar3, z25, dmVar2, lVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 1572864;
            lVar3 = lVar2;
            if ((i17 & 599187) != 599186) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (rVarH.r(z19, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i35 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        pVar2 = null;
                    }
                    if (i25 != 0) {
                        z18 = true;
                    }
                    if ((i16 & 32) != 0) {
                        i17 &= -458753;
                        dmVarA = em.f55799a.a(rVarH, 6);
                    }
                    if (i27 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar3;
                    }
                    pVar4 = pVar2;
                    mVar5 = mVar4;
                } else {
                    if (i35 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        pVar2 = null;
                    }
                    if (i25 != 0) {
                        z18 = true;
                    }
                    if ((i16 & 32) != 0) {
                        i17 &= -458753;
                        dmVarA = em.f55799a.a(rVarH, 6);
                    }
                    if (i27 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar3;
                    }
                    pVar4 = pVar2;
                    mVar5 = mVar4;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-263339167, i17, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                }
                if (lVar5 == null) {
                    rVarH.X(1768510810);
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = k.a();
                        rVarH.v(objE);
                    }
                    rVarH.R();
                    lVar6 = (b1.l) objE;
                } else {
                    rVarH.X(334142749);
                    rVarH.R();
                    lVar6 = lVar5;
                }
                if (lVar != null) {
                    z26 = z18;
                    z27 = false;
                    mVarA = g.a(hd.i(m.INSTANCE), z17, lVar6, null, z26, n4.l.j(n4.l.INSTANCE.g()), lVar);
                } else {
                    z26 = z18;
                    z27 = false;
                    mVarA = m.INSTANCE;
                }
                int i3110 = i17 << 3;
                int i3111 = i17 >> 6;
                rVar2 = rVarH;
                m mVar13 = mVar5;
                e(d.p(d.E(mVar5.u(mVarA), c.INSTANCE.e(), z27, 2, null), f56120c, f56121d), z15, z26, dmVarA, pVar4, lVar6, ui.h(e1.f114447a.m(), rVarH, 6), rVar2, (i3110 & 112) | (i3111 & 896) | (i3111 & 7168) | (i3110 & 57344));
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar13;
                z25 = z26;
                dmVar2 = dmVarA;
                pVar3 = pVar4;
                lVar4 = lVar5;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar3 = mVar2;
                pVar3 = pVar2;
                z25 = z18;
                dmVar2 = dmVarA;
                lVar4 = lVar3;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.fm
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return hm.d(z15, lVar, mVar3, pVar3, z25, dmVar2, lVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        i18 = i16 & 8;
        if (i18 != 0) {
            if ((i15 & 3072) == 0) {
                pVar2 = pVar;
                if (rVarH.G(pVar2)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    z18 = z16;
                    if (rVarH.a(z18)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                if ((196608 & i15) == 0) {
                    if ((i16 & 32) == 0) {
                        dmVarA = dmVar;
                        if (rVarH.W(dmVarA)) {
                            i29 = PKIFailureInfo.unsupportedVersion;
                        }
                        i17 |= i29;
                    } else {
                        dmVarA = dmVar;
                    }
                    i29 = PKIFailureInfo.notAuthorized;
                    i17 |= i29;
                } else {
                    dmVarA = dmVar;
                }
                i27 = i16 & 64;
                if (i27 != 0) {
                    if ((1572864 & i15) == 0) {
                        lVar3 = lVar2;
                        if (rVarH.W(lVar3)) {
                            i28 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i28 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i28;
                    }
                    if ((i17 & 599187) != 599186) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (rVarH.r(z19, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i35 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                pVar2 = null;
                            }
                            if (i25 != 0) {
                                z18 = true;
                            }
                            if ((i16 & 32) != 0) {
                                i17 &= -458753;
                                dmVarA = em.f55799a.a(rVarH, 6);
                            }
                            if (i27 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar3;
                            }
                            pVar4 = pVar2;
                            mVar5 = mVar4;
                        } else {
                            if (i35 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                pVar2 = null;
                            }
                            if (i25 != 0) {
                                z18 = true;
                            }
                            if ((i16 & 32) != 0) {
                                i17 &= -458753;
                                dmVarA = em.f55799a.a(rVarH, 6);
                            }
                            if (i27 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar3;
                            }
                            pVar4 = pVar2;
                            mVar5 = mVar4;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-263339167, i17, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                        }
                        if (lVar5 == null) {
                            rVarH.X(1768510810);
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = k.a();
                                rVarH.v(objE);
                            }
                            rVarH.R();
                            lVar6 = (b1.l) objE;
                        } else {
                            rVarH.X(334142749);
                            rVarH.R();
                            lVar6 = lVar5;
                        }
                        if (lVar != null) {
                            z26 = z18;
                            z27 = false;
                            mVarA = g.a(hd.i(m.INSTANCE), z17, lVar6, null, z26, n4.l.j(n4.l.INSTANCE.g()), lVar);
                        } else {
                            z26 = z18;
                            z27 = false;
                            mVarA = m.INSTANCE;
                        }
                        int i3112 = i17 << 3;
                        int i3113 = i17 >> 6;
                        rVar2 = rVarH;
                        m mVar14 = mVar5;
                        e(d.p(d.E(mVar5.u(mVarA), c.INSTANCE.e(), z27, 2, null), f56120c, f56121d), z15, z26, dmVarA, pVar4, lVar6, ui.h(e1.f114447a.m(), rVarH, 6), rVar2, (i3112 & 112) | (i3113 & 896) | (i3113 & 7168) | (i3112 & 57344));
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar14;
                        z25 = z26;
                        dmVar2 = dmVarA;
                        pVar3 = pVar4;
                        lVar4 = lVar5;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar3 = mVar2;
                        pVar3 = pVar2;
                        z25 = z18;
                        dmVar2 = dmVarA;
                        lVar4 = lVar3;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.fm
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return hm.d(z15, lVar, mVar3, pVar3, z25, dmVar2, lVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 1572864;
                lVar3 = lVar2;
                if ((i17 & 599187) != 599186) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (rVarH.r(z19, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i35 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            pVar2 = null;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                            dmVarA = em.f55799a.a(rVarH, 6);
                        }
                        if (i27 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar3;
                        }
                        pVar4 = pVar2;
                        mVar5 = mVar4;
                    } else {
                        if (i35 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            pVar2 = null;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                            dmVarA = em.f55799a.a(rVarH, 6);
                        }
                        if (i27 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar3;
                        }
                        pVar4 = pVar2;
                        mVar5 = mVar4;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-263339167, i17, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                    }
                    if (lVar5 == null) {
                        rVarH.X(1768510810);
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = k.a();
                            rVarH.v(objE);
                        }
                        rVarH.R();
                        lVar6 = (b1.l) objE;
                    } else {
                        rVarH.X(334142749);
                        rVarH.R();
                        lVar6 = lVar5;
                    }
                    if (lVar != null) {
                        z26 = z18;
                        z27 = false;
                        mVarA = g.a(hd.i(m.INSTANCE), z17, lVar6, null, z26, n4.l.j(n4.l.INSTANCE.g()), lVar);
                    } else {
                        z26 = z18;
                        z27 = false;
                        mVarA = m.INSTANCE;
                    }
                    int i3114 = i17 << 3;
                    int i3115 = i17 >> 6;
                    rVar2 = rVarH;
                    m mVar15 = mVar5;
                    e(d.p(d.E(mVar5.u(mVarA), c.INSTANCE.e(), z27, 2, null), f56120c, f56121d), z15, z26, dmVarA, pVar4, lVar6, ui.h(e1.f114447a.m(), rVarH, 6), rVar2, (i3114 & 112) | (i3115 & 896) | (i3115 & 7168) | (i3114 & 57344));
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar15;
                    z25 = z26;
                    dmVar2 = dmVarA;
                    pVar3 = pVar4;
                    lVar4 = lVar5;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar3 = mVar2;
                    pVar3 = pVar2;
                    z25 = z18;
                    dmVar2 = dmVarA;
                    lVar4 = lVar3;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.fm
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return hm.d(z15, lVar, mVar3, pVar3, z25, dmVar2, lVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            z18 = z16;
            if ((196608 & i15) == 0) {
                if ((i16 & 32) == 0) {
                    dmVarA = dmVar;
                    if (rVarH.W(dmVarA)) {
                        i29 = PKIFailureInfo.unsupportedVersion;
                    }
                    i17 |= i29;
                } else {
                    dmVarA = dmVar;
                }
                i29 = PKIFailureInfo.notAuthorized;
                i17 |= i29;
            } else {
                dmVarA = dmVar;
            }
            i27 = i16 & 64;
            if (i27 != 0) {
                if ((1572864 & i15) == 0) {
                    lVar3 = lVar2;
                    if (rVarH.W(lVar3)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                }
                if ((i17 & 599187) != 599186) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (rVarH.r(z19, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i35 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            pVar2 = null;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                            dmVarA = em.f55799a.a(rVarH, 6);
                        }
                        if (i27 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar3;
                        }
                        pVar4 = pVar2;
                        mVar5 = mVar4;
                    } else {
                        if (i35 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            pVar2 = null;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                            dmVarA = em.f55799a.a(rVarH, 6);
                        }
                        if (i27 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar3;
                        }
                        pVar4 = pVar2;
                        mVar5 = mVar4;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-263339167, i17, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                    }
                    if (lVar5 == null) {
                        rVarH.X(1768510810);
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = k.a();
                            rVarH.v(objE);
                        }
                        rVarH.R();
                        lVar6 = (b1.l) objE;
                    } else {
                        rVarH.X(334142749);
                        rVarH.R();
                        lVar6 = lVar5;
                    }
                    if (lVar != null) {
                        z26 = z18;
                        z27 = false;
                        mVarA = g.a(hd.i(m.INSTANCE), z17, lVar6, null, z26, n4.l.j(n4.l.INSTANCE.g()), lVar);
                    } else {
                        z26 = z18;
                        z27 = false;
                        mVarA = m.INSTANCE;
                    }
                    int i3116 = i17 << 3;
                    int i3117 = i17 >> 6;
                    rVar2 = rVarH;
                    m mVar16 = mVar5;
                    e(d.p(d.E(mVar5.u(mVarA), c.INSTANCE.e(), z27, 2, null), f56120c, f56121d), z15, z26, dmVarA, pVar4, lVar6, ui.h(e1.f114447a.m(), rVarH, 6), rVar2, (i3116 & 112) | (i3117 & 896) | (i3117 & 7168) | (i3116 & 57344));
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar16;
                    z25 = z26;
                    dmVar2 = dmVarA;
                    pVar3 = pVar4;
                    lVar4 = lVar5;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar3 = mVar2;
                    pVar3 = pVar2;
                    z25 = z18;
                    dmVar2 = dmVarA;
                    lVar4 = lVar3;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.fm
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return hm.d(z15, lVar, mVar3, pVar3, z25, dmVar2, lVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 1572864;
            lVar3 = lVar2;
            if ((i17 & 599187) != 599186) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (rVarH.r(z19, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i35 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        pVar2 = null;
                    }
                    if (i25 != 0) {
                        z18 = true;
                    }
                    if ((i16 & 32) != 0) {
                        i17 &= -458753;
                        dmVarA = em.f55799a.a(rVarH, 6);
                    }
                    if (i27 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar3;
                    }
                    pVar4 = pVar2;
                    mVar5 = mVar4;
                } else {
                    if (i35 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        pVar2 = null;
                    }
                    if (i25 != 0) {
                        z18 = true;
                    }
                    if ((i16 & 32) != 0) {
                        i17 &= -458753;
                        dmVarA = em.f55799a.a(rVarH, 6);
                    }
                    if (i27 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar3;
                    }
                    pVar4 = pVar2;
                    mVar5 = mVar4;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-263339167, i17, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                }
                if (lVar5 == null) {
                    rVarH.X(1768510810);
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = k.a();
                        rVarH.v(objE);
                    }
                    rVarH.R();
                    lVar6 = (b1.l) objE;
                } else {
                    rVarH.X(334142749);
                    rVarH.R();
                    lVar6 = lVar5;
                }
                if (lVar != null) {
                    z26 = z18;
                    z27 = false;
                    mVarA = g.a(hd.i(m.INSTANCE), z17, lVar6, null, z26, n4.l.j(n4.l.INSTANCE.g()), lVar);
                } else {
                    z26 = z18;
                    z27 = false;
                    mVarA = m.INSTANCE;
                }
                int i3118 = i17 << 3;
                int i3119 = i17 >> 6;
                rVar2 = rVarH;
                m mVar17 = mVar5;
                e(d.p(d.E(mVar5.u(mVarA), c.INSTANCE.e(), z27, 2, null), f56120c, f56121d), z15, z26, dmVarA, pVar4, lVar6, ui.h(e1.f114447a.m(), rVarH, 6), rVar2, (i3118 & 112) | (i3119 & 896) | (i3119 & 7168) | (i3118 & 57344));
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar17;
                z25 = z26;
                dmVar2 = dmVarA;
                pVar3 = pVar4;
                lVar4 = lVar5;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar3 = mVar2;
                pVar3 = pVar2;
                z25 = z18;
                dmVar2 = dmVarA;
                lVar4 = lVar3;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.fm
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return hm.d(z15, lVar, mVar3, pVar3, z25, dmVar2, lVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        pVar2 = pVar;
        i25 = i16 & 16;
        if (i25 != 0) {
            if ((i15 & 24576) == 0) {
                z18 = z16;
                if (rVarH.a(z18)) {
                    i26 = 16384;
                } else {
                    i26 = PKIFailureInfo.certRevoked;
                }
                i17 |= i26;
            }
            if ((196608 & i15) == 0) {
                if ((i16 & 32) == 0) {
                    dmVarA = dmVar;
                    if (rVarH.W(dmVarA)) {
                        i29 = PKIFailureInfo.unsupportedVersion;
                    }
                    i17 |= i29;
                } else {
                    dmVarA = dmVar;
                }
                i29 = PKIFailureInfo.notAuthorized;
                i17 |= i29;
            } else {
                dmVarA = dmVar;
            }
            i27 = i16 & 64;
            if (i27 != 0) {
                if ((1572864 & i15) == 0) {
                    lVar3 = lVar2;
                    if (rVarH.W(lVar3)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                }
                if ((i17 & 599187) != 599186) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (rVarH.r(z19, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i35 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            pVar2 = null;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                            dmVarA = em.f55799a.a(rVarH, 6);
                        }
                        if (i27 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar3;
                        }
                        pVar4 = pVar2;
                        mVar5 = mVar4;
                    } else {
                        if (i35 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            pVar2 = null;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                            dmVarA = em.f55799a.a(rVarH, 6);
                        }
                        if (i27 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar3;
                        }
                        pVar4 = pVar2;
                        mVar5 = mVar4;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-263339167, i17, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                    }
                    if (lVar5 == null) {
                        rVarH.X(1768510810);
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = k.a();
                            rVarH.v(objE);
                        }
                        rVarH.R();
                        lVar6 = (b1.l) objE;
                    } else {
                        rVarH.X(334142749);
                        rVarH.R();
                        lVar6 = lVar5;
                    }
                    if (lVar != null) {
                        z26 = z18;
                        z27 = false;
                        mVarA = g.a(hd.i(m.INSTANCE), z17, lVar6, null, z26, n4.l.j(n4.l.INSTANCE.g()), lVar);
                    } else {
                        z26 = z18;
                        z27 = false;
                        mVarA = m.INSTANCE;
                    }
                    int i31110 = i17 << 3;
                    int i31111 = i17 >> 6;
                    rVar2 = rVarH;
                    m mVar18 = mVar5;
                    e(d.p(d.E(mVar5.u(mVarA), c.INSTANCE.e(), z27, 2, null), f56120c, f56121d), z15, z26, dmVarA, pVar4, lVar6, ui.h(e1.f114447a.m(), rVarH, 6), rVar2, (i31110 & 112) | (i31111 & 896) | (i31111 & 7168) | (i31110 & 57344));
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar18;
                    z25 = z26;
                    dmVar2 = dmVarA;
                    pVar3 = pVar4;
                    lVar4 = lVar5;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar3 = mVar2;
                    pVar3 = pVar2;
                    z25 = z18;
                    dmVar2 = dmVarA;
                    lVar4 = lVar3;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.fm
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return hm.d(z15, lVar, mVar3, pVar3, z25, dmVar2, lVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 1572864;
            lVar3 = lVar2;
            if ((i17 & 599187) != 599186) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (rVarH.r(z19, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i35 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        pVar2 = null;
                    }
                    if (i25 != 0) {
                        z18 = true;
                    }
                    if ((i16 & 32) != 0) {
                        i17 &= -458753;
                        dmVarA = em.f55799a.a(rVarH, 6);
                    }
                    if (i27 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar3;
                    }
                    pVar4 = pVar2;
                    mVar5 = mVar4;
                } else {
                    if (i35 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        pVar2 = null;
                    }
                    if (i25 != 0) {
                        z18 = true;
                    }
                    if ((i16 & 32) != 0) {
                        i17 &= -458753;
                        dmVarA = em.f55799a.a(rVarH, 6);
                    }
                    if (i27 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar3;
                    }
                    pVar4 = pVar2;
                    mVar5 = mVar4;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-263339167, i17, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                }
                if (lVar5 == null) {
                    rVarH.X(1768510810);
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = k.a();
                        rVarH.v(objE);
                    }
                    rVarH.R();
                    lVar6 = (b1.l) objE;
                } else {
                    rVarH.X(334142749);
                    rVarH.R();
                    lVar6 = lVar5;
                }
                if (lVar != null) {
                    z26 = z18;
                    z27 = false;
                    mVarA = g.a(hd.i(m.INSTANCE), z17, lVar6, null, z26, n4.l.j(n4.l.INSTANCE.g()), lVar);
                } else {
                    z26 = z18;
                    z27 = false;
                    mVarA = m.INSTANCE;
                }
                int i31112 = i17 << 3;
                int i31113 = i17 >> 6;
                rVar2 = rVarH;
                m mVar19 = mVar5;
                e(d.p(d.E(mVar5.u(mVarA), c.INSTANCE.e(), z27, 2, null), f56120c, f56121d), z15, z26, dmVarA, pVar4, lVar6, ui.h(e1.f114447a.m(), rVarH, 6), rVar2, (i31112 & 112) | (i31113 & 896) | (i31113 & 7168) | (i31112 & 57344));
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar19;
                z25 = z26;
                dmVar2 = dmVarA;
                pVar3 = pVar4;
                lVar4 = lVar5;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar3 = mVar2;
                pVar3 = pVar2;
                z25 = z18;
                dmVar2 = dmVarA;
                lVar4 = lVar3;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.fm
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return hm.d(z15, lVar, mVar3, pVar3, z25, dmVar2, lVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        z18 = z16;
        if ((196608 & i15) == 0) {
            if ((i16 & 32) == 0) {
                dmVarA = dmVar;
                if (rVarH.W(dmVarA)) {
                    i29 = PKIFailureInfo.unsupportedVersion;
                }
                i17 |= i29;
            } else {
                dmVarA = dmVar;
            }
            i29 = PKIFailureInfo.notAuthorized;
            i17 |= i29;
        } else {
            dmVarA = dmVar;
        }
        i27 = i16 & 64;
        if (i27 != 0) {
            if ((1572864 & i15) == 0) {
                lVar3 = lVar2;
                if (rVarH.W(lVar3)) {
                    i28 = PKIFailureInfo.badCertTemplate;
                } else {
                    i28 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i28;
            }
            if ((i17 & 599187) != 599186) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (rVarH.r(z19, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i35 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        pVar2 = null;
                    }
                    if (i25 != 0) {
                        z18 = true;
                    }
                    if ((i16 & 32) != 0) {
                        i17 &= -458753;
                        dmVarA = em.f55799a.a(rVarH, 6);
                    }
                    if (i27 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar3;
                    }
                    pVar4 = pVar2;
                    mVar5 = mVar4;
                } else {
                    if (i35 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        pVar2 = null;
                    }
                    if (i25 != 0) {
                        z18 = true;
                    }
                    if ((i16 & 32) != 0) {
                        i17 &= -458753;
                        dmVarA = em.f55799a.a(rVarH, 6);
                    }
                    if (i27 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar3;
                    }
                    pVar4 = pVar2;
                    mVar5 = mVar4;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-263339167, i17, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                }
                if (lVar5 == null) {
                    rVarH.X(1768510810);
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = k.a();
                        rVarH.v(objE);
                    }
                    rVarH.R();
                    lVar6 = (b1.l) objE;
                } else {
                    rVarH.X(334142749);
                    rVarH.R();
                    lVar6 = lVar5;
                }
                if (lVar != null) {
                    z26 = z18;
                    z27 = false;
                    mVarA = g.a(hd.i(m.INSTANCE), z17, lVar6, null, z26, n4.l.j(n4.l.INSTANCE.g()), lVar);
                } else {
                    z26 = z18;
                    z27 = false;
                    mVarA = m.INSTANCE;
                }
                int i31114 = i17 << 3;
                int i31115 = i17 >> 6;
                rVar2 = rVarH;
                m mVar110 = mVar5;
                e(d.p(d.E(mVar5.u(mVarA), c.INSTANCE.e(), z27, 2, null), f56120c, f56121d), z15, z26, dmVarA, pVar4, lVar6, ui.h(e1.f114447a.m(), rVarH, 6), rVar2, (i31114 & 112) | (i31115 & 896) | (i31115 & 7168) | (i31114 & 57344));
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar110;
                z25 = z26;
                dmVar2 = dmVarA;
                pVar3 = pVar4;
                lVar4 = lVar5;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar3 = mVar2;
                pVar3 = pVar2;
                z25 = z18;
                dmVar2 = dmVarA;
                lVar4 = lVar3;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.fm
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return hm.d(z15, lVar, mVar3, pVar3, z25, dmVar2, lVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 1572864;
        lVar3 = lVar2;
        if ((i17 & 599187) != 599186) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (rVarH.r(z19, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i35 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    pVar2 = null;
                }
                if (i25 != 0) {
                    z18 = true;
                }
                if ((i16 & 32) != 0) {
                    i17 &= -458753;
                    dmVarA = em.f55799a.a(rVarH, 6);
                }
                if (i27 != 0) {
                    lVar5 = null;
                } else {
                    lVar5 = lVar3;
                }
                pVar4 = pVar2;
                mVar5 = mVar4;
            } else {
                if (i35 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    pVar2 = null;
                }
                if (i25 != 0) {
                    z18 = true;
                }
                if ((i16 & 32) != 0) {
                    i17 &= -458753;
                    dmVarA = em.f55799a.a(rVarH, 6);
                }
                if (i27 != 0) {
                    lVar5 = null;
                } else {
                    lVar5 = lVar3;
                }
                pVar4 = pVar2;
                mVar5 = mVar4;
            }
            rVarH.y();
            if (t.k()) {
                t.o(-263339167, i17, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
            }
            if (lVar5 == null) {
                rVarH.X(1768510810);
                objE = rVarH.E();
                if (objE == r.INSTANCE.a()) {
                    objE = k.a();
                    rVarH.v(objE);
                }
                rVarH.R();
                lVar6 = (b1.l) objE;
            } else {
                rVarH.X(334142749);
                rVarH.R();
                lVar6 = lVar5;
            }
            if (lVar != null) {
                z26 = z18;
                z27 = false;
                mVarA = g.a(hd.i(m.INSTANCE), z17, lVar6, null, z26, n4.l.j(n4.l.INSTANCE.g()), lVar);
            } else {
                z26 = z18;
                z27 = false;
                mVarA = m.INSTANCE;
            }
            int i31116 = i17 << 3;
            int i31117 = i17 >> 6;
            rVar2 = rVarH;
            m mVar111 = mVar5;
            e(d.p(d.E(mVar5.u(mVarA), c.INSTANCE.e(), z27, 2, null), f56120c, f56121d), z15, z26, dmVarA, pVar4, lVar6, ui.h(e1.f114447a.m(), rVarH, 6), rVar2, (i31116 & 112) | (i31117 & 896) | (i31117 & 7168) | (i31116 & 57344));
            if (t.k()) {
                t.n();
            }
            mVar3 = mVar111;
            z25 = z26;
            dmVar2 = dmVarA;
            pVar3 = pVar4;
            lVar4 = lVar5;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            mVar3 = mVar2;
            pVar3 = pVar2;
            z25 = z18;
            dmVar2 = dmVarA;
            lVar4 = lVar3;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.fm
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return hm.d(z15, lVar, mVar3, pVar3, z25, dmVar2, lVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(boolean z15, l lVar, m mVar, p pVar, boolean z16, dm dmVar, b1.l lVar2, int i15, int i16, r rVar, int i17) {
        c(z15, lVar, mVar, pVar, z16, dmVar, lVar2, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void e(final m mVar, final boolean z15, final boolean z16, final dm dmVar, final p<? super r, ? super Integer, i0> pVar, final j jVar, final y2 y2Var, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-670917213);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.a(z15) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.a(z16) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.W(dmVar) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.G(pVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.W(jVar) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            i16 |= rVarH.W(y2Var) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (rVarH.r((599187 & i16) != 599186, i16 & 1)) {
            if (t.k()) {
                t.o(-670917213, i16, -1, "androidx.compose.material3.SwitchImpl (Switch.kt:143)");
            }
            long jD = dmVar.d(z16, z15);
            long jC = dmVar.c(z16, z15);
            e1 e1Var = e1.f114447a;
            y2 y2VarH = ui.h(e1Var.v(), rVarH, 6);
            Object objN = rVarH.N(i.f());
            androidx.compose.material3.h hVar = androidx.compose.material3.h.f9838a;
            m mVarU = w0.i.c(o.h(mVar, e1Var.u(), dmVar.a(z16, z15), y2VarH), jD, y2VarH).u(fr.t.c(objN, hVar.a()) ? w0.n1.e(m.INSTANCE, jVar, i.h(false, 0.0f, 0L, y2VarH, false, true, false, false, 7, null)) : m.INSTANCE);
            c.Companion companion = c.INSTANCE;
            w0 w0VarI = d1.r.i(companion.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = f3.j.e(rVarH, mVarU);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            m mVarC = w0.i.c(w0.n1.e(x.f39368a.d(m.INSTANCE, companion.h()).u(new ThumbElement(jVar, z15, of.b(k0.FastSpatial, rVarH, 6))), jVar, i.h(false, h.n(e1Var.s() / 2), 0L, null, false, fr.t.c(rVarH.N(i.f()), hVar.b()), false, false, 220, null)), jC, y2Var);
            w0 w0VarI2 = d1.r.i(companion.e(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            m mVarE2 = f3.j.e(rVarH, mVarC);
            a<androidx.compose.ui.node.c> aVarB2 = companion2.b();
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
            n6.i(rVarC2, w0VarI2, companion2.d());
            n6.i(rVarC2, e0VarT2, companion2.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
            n6.g(rVarC2, companion2.a());
            n6.i(rVarC2, mVarE2, companion2.e());
            if (pVar != null) {
                rVarH.X(1235836927);
                d0.c(h4.a().d(Color.m0boximpl(dmVar.b(z16, z15))), pVar, rVarH, c4.f122821i | ((i16 >> 9) & 112));
                rVarH.R();
            } else {
                rVarH.X(1236071411);
                rVarH.R();
            }
            rVarH.x();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.gm
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return hm.f(mVar, z15, z16, dmVar, pVar, jVar, y2Var, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(m mVar, boolean z15, boolean z16, dm dmVar, p pVar, j jVar, y2 y2Var, int i15, r rVar, int i16) {
        e(mVar, z15, z16, dmVar, pVar, jVar, y2Var, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final float k() {
        return f56118a;
    }

    public static final float l() {
        return f56119b;
    }
}
