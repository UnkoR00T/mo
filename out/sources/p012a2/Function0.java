package p012a2;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.Color;
import b1.k;
import b1.l;
import c5.h;
import d1.a3;
import d1.d3;
import d1.i;
import d1.m3;
import d1.p3;
import d1.q3;
import er.a;
import er.p;
import er.q;
import f3.c;
import f3.j;
import f3.m;
import n3.y2;
import n4.f0;
import n4.v;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import w0.BorderStroke;

/* JADX INFO: renamed from: a2.z0, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0087\u0001\u0010\u0016\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0087\u0001\u0010\u0018\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u001b²\u0006\f\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "onClick", "Lf3/m;", "modifier", "", "enabled", "Lb1/l;", "interactionSource", "La2/t0;", "elevation", "Ln3/y2;", "shape", "Lw0/w;", "border", "La2/r0;", "colors", "Ld1/d3;", "contentPadding", "Lkotlin/Function1;", "Ld1/p3;", "content", "f", "(Ler/a;Lf3/m;ZLb1/l;La2/t0;Ln3/y2;Lw0/w;La2/r0;Ld1/d3;Ler/q;Lm2/r;II)V", "m", "Landroidx/compose/ui/graphics/Color;", "contentColor", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class Function0 {
    /* JADX WARN: Code duplicated, block: B:101:0x0113  */
    /* JADX WARN: Code duplicated, block: B:102:0x0116  */
    /* JADX WARN: Code duplicated, block: B:106:0x0127  */
    /* JADX WARN: Code duplicated, block: B:107:0x0129  */
    /* JADX WARN: Code duplicated, block: B:110:0x0132  */
    /* JADX WARN: Code duplicated, block: B:112:0x0143  */
    /* JADX WARN: Code duplicated, block: B:125:0x0171 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0173  */
    /* JADX WARN: Code duplicated, block: B:127:0x0176  */
    /* JADX WARN: Code duplicated, block: B:129:0x0179  */
    /* JADX WARN: Code duplicated, block: B:130:0x017c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0180  */
    /* JADX WARN: Code duplicated, block: B:133:0x0183  */
    /* JADX WARN: Code duplicated, block: B:136:0x0189  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:143:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:144:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:149:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:153:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:156:0x0209  */
    /* JADX WARN: Code duplicated, block: B:158:0x0214  */
    /* JADX WARN: Code duplicated, block: B:160:0x0226  */
    /* JADX WARN: Code duplicated, block: B:162:0x0233  */
    /* JADX WARN: Code duplicated, block: B:165:0x0257  */
    /* JADX WARN: Code duplicated, block: B:168:0x029a  */
    /* JADX WARN: Code duplicated, block: B:169:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:171:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:176:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:178:0x030d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0324  */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:94:0x0100  */
    /* JADX WARN: Code duplicated, block: B:95:0x0103  */
    /* JADX WARN: Code duplicated, block: B:99:0x010d  */
    public static final void f(final a<i0> aVar, m mVar, boolean z15, l lVar, t0 t0Var, y2 y2Var, BorderStroke borderStroke, r0 r0Var, d3 d3Var, final q<? super p3, ? super r, ? super Integer, i0> qVar, r rVar, final int i15, final int i16) {
        int i17;
        m mVar2;
        int i18;
        boolean z16;
        int i19;
        int i25;
        l lVar2;
        int i26;
        t0 t0VarB;
        int i27;
        int i28;
        int i29;
        int i35;
        int i36;
        boolean z17;
        r rVar2;
        final y2 y2Var2;
        final BorderStroke borderStroke2;
        final m mVar3;
        final boolean z18;
        final l lVar3;
        final t0 t0Var2;
        final r0 r0Var2;
        final d3 d3Var2;
        d5 d5VarM;
        m mVar4;
        boolean z19;
        l lVar4;
        y2 small;
        int i37;
        BorderStroke borderStroke3;
        r rVar3;
        r0 r0VarA;
        final d3 d3VarC;
        y2 y2Var3;
        BorderStroke borderStroke4;
        boolean z25;
        int i38;
        l lVar5;
        int i39;
        Object objE;
        f6<h> f6VarA;
        float fN;
        Object objE2;
        int i45;
        int i46;
        r rVarH = rVar.h(-1084573925);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i47 = i16 & 2;
        if (i47 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 8;
                if (i25 != 0) {
                    if ((i15 & 3072) == 0) {
                        lVar2 = lVar;
                        if (rVarH.W(lVar2)) {
                            i26 = 2048;
                        } else {
                            i26 = 1024;
                        }
                        i17 |= i26;
                    }
                    if ((i15 & 24576) == 0) {
                        if ((i16 & 16) == 0) {
                            t0VarB = t0Var;
                            if (rVarH.W(t0VarB)) {
                                i46 = 16384;
                            }
                            i17 |= i46;
                        } else {
                            t0VarB = t0Var;
                        }
                        i46 = PKIFailureInfo.certRevoked;
                        i17 |= i46;
                    } else {
                        t0VarB = t0Var;
                    }
                    if ((196608 & i15) != 0) {
                        i17 |= ((i16 & 32) == 0 || !rVarH.W(y2Var)) ? PKIFailureInfo.notAuthorized : PKIFailureInfo.unsupportedVersion;
                    }
                    i27 = i16 & 64;
                    if (i27 != 0) {
                        i17 |= 1572864;
                    } else if ((i15 & 1572864) == 0) {
                        if (rVarH.W(borderStroke)) {
                            i28 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i28 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i28;
                    }
                    if ((i15 & 12582912) != 0) {
                        i17 |= ((i16 & 128) == 0 || !rVarH.W(r0Var)) ? 4194304 : 8388608;
                    }
                    i29 = i16 & 256;
                    if (i29 != 0) {
                        if ((i15 & 100663296) == 0) {
                            if (rVarH.W(d3Var)) {
                                i35 = 67108864;
                            } else {
                                i35 = 33554432;
                            }
                            i17 |= i35;
                        }
                        if ((i15 & 805306368) == 0) {
                            if (rVarH.G(qVar)) {
                                i45 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i45 = 268435456;
                            }
                            i17 |= i45;
                        }
                        i36 = i17;
                        if ((i36 & 306783379) != 306783378) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i36 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0 || rVarH.Q()) {
                                if (i47 != 0) {
                                    mVar4 = m.INSTANCE;
                                } else {
                                    mVar4 = mVar2;
                                }
                                if (i18 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z16;
                                }
                                if (i25 != 0) {
                                    lVar4 = null;
                                } else {
                                    lVar4 = lVar2;
                                }
                                if ((i16 & 16) != 0) {
                                    i36 &= -57345;
                                    t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                                }
                                if ((i16 & 32) != 0) {
                                    small = m2.f1788a.b(rVarH, 6).getSmall();
                                    i36 &= -458753;
                                } else {
                                    small = y2Var;
                                }
                                i37 = i36;
                                if (i27 != 0) {
                                    borderStroke3 = null;
                                } else {
                                    borderStroke3 = borderStroke;
                                }
                                if ((i16 & 128) != 0) {
                                    r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                                    rVar3 = rVarH;
                                    i37 &= -29360129;
                                } else {
                                    rVar3 = rVarH;
                                    r0VarA = r0Var;
                                }
                                int i48 = i37;
                                if (i29 != 0) {
                                    d3VarC = s0.f1901a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                y2Var3 = small;
                                borderStroke4 = borderStroke3;
                                z25 = z19;
                                mVar2 = mVar4;
                                i38 = i48;
                            } else {
                                rVarH.O();
                                if ((i16 & 16) != 0) {
                                    i36 &= -57345;
                                }
                                if ((i16 & 32) != 0) {
                                    i36 &= -458753;
                                }
                                if ((i16 & 128) != 0) {
                                    i36 &= -29360129;
                                }
                                y2Var3 = y2Var;
                                borderStroke4 = borderStroke;
                                d3VarC = d3Var;
                                z25 = z16;
                                lVar4 = lVar2;
                                i38 = i36;
                                rVar3 = rVarH;
                                r0VarA = r0Var;
                            }
                            rVar3.y();
                            if (t.k()) {
                                t.o(-1084573925, i38, -1, "androidx.compose.material.Button (Button.kt:105)");
                            }
                            if (lVar4 == null) {
                                rVar3.X(497721888);
                                objE2 = rVar3.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = k.a();
                                    rVar3.v(objE2);
                                }
                                lVar5 = (l) objE2;
                                rVar3.R();
                            } else {
                                rVar3.X(1401528215);
                                rVar3.R();
                                lVar5 = lVar4;
                            }
                            i39 = i38 >> 6;
                            int i49 = (i39 & 14) | ((i38 >> 18) & 112);
                            final f6<Color> f6VarB = r0VarA.b(z25, rVar3, i49);
                            objE = rVar3.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.l() { // from class: a2.u0
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return Function0.h((n4.i0) obj);
                                    }
                                };
                                rVar3.v(objE);
                            }
                            m mVarD = v.d(mVar2, false, (er.l) objE, 1, null);
                            long jM20unboximpl = r0VarA.a(z25, rVar3, i49).getValue().m20unboximpl();
                            long jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(g(f6VarB), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                            if (t0VarB == null) {
                                rVar3.X(498128545);
                                rVar3.R();
                                f6VarA = null;
                            } else {
                                rVar3.X(1401541984);
                                f6VarA = t0VarB.a(z25, lVar5, rVar3, i39 & 910);
                                rVar3.R();
                            }
                            if (f6VarA != null) {
                                fN = f6VarA.getValue().getValue();
                            } else {
                                fN = h.n(0);
                            }
                            r rVar4 = rVar3;
                            f5.g(aVar, mVarD, z25, y2Var3, jM20unboximpl, jM9copywmQWz5c$default, borderStroke4, fN, lVar5, y2.m.d(-20345758, true, new p() { // from class: a2.v0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return Function0.i(f6VarB, d3VarC, qVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVar3, 54), rVar4, (i38 & 14) | 805306368 | (i38 & 896) | (i39 & 7168) | (i38 & 3670016), 0);
                            rVar2 = rVar4;
                            if (t.k()) {
                                t.n();
                            }
                            r0Var2 = r0VarA;
                            t0Var2 = t0VarB;
                            y2Var2 = y2Var3;
                            borderStroke2 = borderStroke4;
                            lVar3 = lVar4;
                            d3Var2 = d3VarC;
                            mVar3 = mVar2;
                            z18 = z25;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            y2Var2 = y2Var;
                            borderStroke2 = borderStroke;
                            mVar3 = mVar2;
                            z18 = z16;
                            lVar3 = lVar2;
                            t0Var2 = t0VarB;
                            r0Var2 = r0Var;
                            d3Var2 = d3Var;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: a2.w0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return Function0.l(aVar, mVar3, z18, lVar3, t0Var2, y2Var2, borderStroke2, r0Var2, d3Var2, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 100663296;
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.G(qVar)) {
                            i45 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i45 = 268435456;
                        }
                        i17 |= i45;
                    }
                    i36 = i17;
                    if ((i36 & 306783379) != 306783378) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i36 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i47 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                            } else {
                                z19 = z16;
                            }
                            if (i25 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar2;
                            }
                            if ((i16 & 16) != 0) {
                                i36 &= -57345;
                                t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                            }
                            if ((i16 & 32) != 0) {
                                small = m2.f1788a.b(rVarH, 6).getSmall();
                                i36 &= -458753;
                            } else {
                                small = y2Var;
                            }
                            i37 = i36;
                            if (i27 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if ((i16 & 128) != 0) {
                                r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                                rVar3 = rVarH;
                                i37 &= -29360129;
                            } else {
                                rVar3 = rVarH;
                                r0VarA = r0Var;
                            }
                            int i410 = i37;
                            if (i29 != 0) {
                                d3VarC = s0.f1901a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            y2Var3 = small;
                            borderStroke4 = borderStroke3;
                            z25 = z19;
                            mVar2 = mVar4;
                            i38 = i410;
                        } else {
                            if (i47 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                            } else {
                                z19 = z16;
                            }
                            if (i25 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar2;
                            }
                            if ((i16 & 16) != 0) {
                                i36 &= -57345;
                                t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                            }
                            if ((i16 & 32) != 0) {
                                small = m2.f1788a.b(rVarH, 6).getSmall();
                                i36 &= -458753;
                            } else {
                                small = y2Var;
                            }
                            i37 = i36;
                            if (i27 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if ((i16 & 128) != 0) {
                                r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                                rVar3 = rVarH;
                                i37 &= -29360129;
                            } else {
                                rVar3 = rVarH;
                                r0VarA = r0Var;
                            }
                            int i411 = i37;
                            if (i29 != 0) {
                                d3VarC = s0.f1901a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            y2Var3 = small;
                            borderStroke4 = borderStroke3;
                            z25 = z19;
                            mVar2 = mVar4;
                            i38 = i411;
                        }
                        rVar3.y();
                        if (t.k()) {
                            t.o(-1084573925, i38, -1, "androidx.compose.material.Button (Button.kt:105)");
                        }
                        if (lVar4 == null) {
                            rVar3.X(497721888);
                            objE2 = rVar3.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = k.a();
                                rVar3.v(objE2);
                            }
                            lVar5 = (l) objE2;
                            rVar3.R();
                        } else {
                            rVar3.X(1401528215);
                            rVar3.R();
                            lVar5 = lVar4;
                        }
                        i39 = i38 >> 6;
                        int i412 = (i39 & 14) | ((i38 >> 18) & 112);
                        final f6 f6VarB2 = r0VarA.b(z25, rVar3, i412);
                        objE = rVar3.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.l() { // from class: a2.u0
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return Function0.h((n4.i0) obj);
                                }
                            };
                            rVar3.v(objE);
                        }
                        m mVarD2 = v.d(mVar2, false, (er.l) objE, 1, null);
                        long jM20unboximpl2 = r0VarA.a(z25, rVar3, i412).getValue().m20unboximpl();
                        long jM9copywmQWz5c$default2 = Color.m9copywmQWz5c$default(g(f6VarB2), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        if (t0VarB == null) {
                            rVar3.X(498128545);
                            rVar3.R();
                            f6VarA = null;
                        } else {
                            rVar3.X(1401541984);
                            f6VarA = t0VarB.a(z25, lVar5, rVar3, i39 & 910);
                            rVar3.R();
                        }
                        if (f6VarA != null) {
                            fN = f6VarA.getValue().getValue();
                        } else {
                            fN = h.n(0);
                        }
                        r rVar5 = rVar3;
                        f5.g(aVar, mVarD2, z25, y2Var3, jM20unboximpl2, jM9copywmQWz5c$default2, borderStroke4, fN, lVar5, y2.m.d(-20345758, true, new p() { // from class: a2.v0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return Function0.i(f6VarB2, d3VarC, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVar3, 54), rVar5, (i38 & 14) | 805306368 | (i38 & 896) | (i39 & 7168) | (i38 & 3670016), 0);
                        rVar2 = rVar5;
                        if (t.k()) {
                            t.n();
                        }
                        r0Var2 = r0VarA;
                        t0Var2 = t0VarB;
                        y2Var2 = y2Var3;
                        borderStroke2 = borderStroke4;
                        lVar3 = lVar4;
                        d3Var2 = d3VarC;
                        mVar3 = mVar2;
                        z18 = z25;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        y2Var2 = y2Var;
                        borderStroke2 = borderStroke;
                        mVar3 = mVar2;
                        z18 = z16;
                        lVar3 = lVar2;
                        t0Var2 = t0VarB;
                        r0Var2 = r0Var;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.w0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return Function0.l(aVar, mVar3, z18, lVar3, t0Var2, y2Var2, borderStroke2, r0Var2, d3Var2, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 3072;
                lVar2 = lVar;
                if ((i15 & 24576) == 0) {
                    if ((i16 & 16) == 0) {
                        t0VarB = t0Var;
                        if (rVarH.W(t0VarB)) {
                            i46 = 16384;
                        }
                        i17 |= i46;
                    } else {
                        t0VarB = t0Var;
                    }
                    i46 = PKIFailureInfo.certRevoked;
                    i17 |= i46;
                } else {
                    t0VarB = t0Var;
                }
                if ((196608 & i15) != 0) {
                    i17 |= ((i16 & 32) == 0 || !rVarH.W(y2Var)) ? PKIFailureInfo.notAuthorized : PKIFailureInfo.unsupportedVersion;
                }
                i27 = i16 & 64;
                if (i27 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.W(borderStroke)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                }
                if ((i15 & 12582912) != 0) {
                    i17 |= ((i16 & 128) == 0 || !rVarH.W(r0Var)) ? 4194304 : 8388608;
                }
                i29 = i16 & 256;
                if (i29 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(d3Var)) {
                            i35 = 67108864;
                        } else {
                            i35 = 33554432;
                        }
                        i17 |= i35;
                    }
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.G(qVar)) {
                            i45 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i45 = 268435456;
                        }
                        i17 |= i45;
                    }
                    i36 = i17;
                    if ((i36 & 306783379) != 306783378) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i36 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i47 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                            } else {
                                z19 = z16;
                            }
                            if (i25 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar2;
                            }
                            if ((i16 & 16) != 0) {
                                i36 &= -57345;
                                t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                            }
                            if ((i16 & 32) != 0) {
                                small = m2.f1788a.b(rVarH, 6).getSmall();
                                i36 &= -458753;
                            } else {
                                small = y2Var;
                            }
                            i37 = i36;
                            if (i27 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if ((i16 & 128) != 0) {
                                r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                                rVar3 = rVarH;
                                i37 &= -29360129;
                            } else {
                                rVar3 = rVarH;
                                r0VarA = r0Var;
                            }
                            int i413 = i37;
                            if (i29 != 0) {
                                d3VarC = s0.f1901a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            y2Var3 = small;
                            borderStroke4 = borderStroke3;
                            z25 = z19;
                            mVar2 = mVar4;
                            i38 = i413;
                        } else {
                            if (i47 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                            } else {
                                z19 = z16;
                            }
                            if (i25 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar2;
                            }
                            if ((i16 & 16) != 0) {
                                i36 &= -57345;
                                t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                            }
                            if ((i16 & 32) != 0) {
                                small = m2.f1788a.b(rVarH, 6).getSmall();
                                i36 &= -458753;
                            } else {
                                small = y2Var;
                            }
                            i37 = i36;
                            if (i27 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if ((i16 & 128) != 0) {
                                r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                                rVar3 = rVarH;
                                i37 &= -29360129;
                            } else {
                                rVar3 = rVarH;
                                r0VarA = r0Var;
                            }
                            int i414 = i37;
                            if (i29 != 0) {
                                d3VarC = s0.f1901a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            y2Var3 = small;
                            borderStroke4 = borderStroke3;
                            z25 = z19;
                            mVar2 = mVar4;
                            i38 = i414;
                        }
                        rVar3.y();
                        if (t.k()) {
                            t.o(-1084573925, i38, -1, "androidx.compose.material.Button (Button.kt:105)");
                        }
                        if (lVar4 == null) {
                            rVar3.X(497721888);
                            objE2 = rVar3.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = k.a();
                                rVar3.v(objE2);
                            }
                            lVar5 = (l) objE2;
                            rVar3.R();
                        } else {
                            rVar3.X(1401528215);
                            rVar3.R();
                            lVar5 = lVar4;
                        }
                        i39 = i38 >> 6;
                        int i415 = (i39 & 14) | ((i38 >> 18) & 112);
                        final f6 f6VarB3 = r0VarA.b(z25, rVar3, i415);
                        objE = rVar3.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.l() { // from class: a2.u0
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return Function0.h((n4.i0) obj);
                                }
                            };
                            rVar3.v(objE);
                        }
                        m mVarD3 = v.d(mVar2, false, (er.l) objE, 1, null);
                        long jM20unboximpl3 = r0VarA.a(z25, rVar3, i415).getValue().m20unboximpl();
                        long jM9copywmQWz5c$default3 = Color.m9copywmQWz5c$default(g(f6VarB3), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        if (t0VarB == null) {
                            rVar3.X(498128545);
                            rVar3.R();
                            f6VarA = null;
                        } else {
                            rVar3.X(1401541984);
                            f6VarA = t0VarB.a(z25, lVar5, rVar3, i39 & 910);
                            rVar3.R();
                        }
                        if (f6VarA != null) {
                            fN = f6VarA.getValue().getValue();
                        } else {
                            fN = h.n(0);
                        }
                        r rVar6 = rVar3;
                        f5.g(aVar, mVarD3, z25, y2Var3, jM20unboximpl3, jM9copywmQWz5c$default3, borderStroke4, fN, lVar5, y2.m.d(-20345758, true, new p() { // from class: a2.v0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return Function0.i(f6VarB3, d3VarC, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVar3, 54), rVar6, (i38 & 14) | 805306368 | (i38 & 896) | (i39 & 7168) | (i38 & 3670016), 0);
                        rVar2 = rVar6;
                        if (t.k()) {
                            t.n();
                        }
                        r0Var2 = r0VarA;
                        t0Var2 = t0VarB;
                        y2Var2 = y2Var3;
                        borderStroke2 = borderStroke4;
                        lVar3 = lVar4;
                        d3Var2 = d3VarC;
                        mVar3 = mVar2;
                        z18 = z25;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        y2Var2 = y2Var;
                        borderStroke2 = borderStroke;
                        mVar3 = mVar2;
                        z18 = z16;
                        lVar3 = lVar2;
                        t0Var2 = t0VarB;
                        r0Var2 = r0Var;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.w0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return Function0.l(aVar, mVar3, z18, lVar3, t0Var2, y2Var2, borderStroke2, r0Var2, d3Var2, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 100663296;
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(qVar)) {
                        i45 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i45 = 268435456;
                    }
                    i17 |= i45;
                }
                i36 = i17;
                if ((i36 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i36 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i47 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                        } else {
                            z19 = z16;
                        }
                        if (i25 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar2;
                        }
                        if ((i16 & 16) != 0) {
                            i36 &= -57345;
                            t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                        }
                        if ((i16 & 32) != 0) {
                            small = m2.f1788a.b(rVarH, 6).getSmall();
                            i36 &= -458753;
                        } else {
                            small = y2Var;
                        }
                        i37 = i36;
                        if (i27 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if ((i16 & 128) != 0) {
                            r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                            rVar3 = rVarH;
                            i37 &= -29360129;
                        } else {
                            rVar3 = rVarH;
                            r0VarA = r0Var;
                        }
                        int i416 = i37;
                        if (i29 != 0) {
                            d3VarC = s0.f1901a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        y2Var3 = small;
                        borderStroke4 = borderStroke3;
                        z25 = z19;
                        mVar2 = mVar4;
                        i38 = i416;
                    } else {
                        if (i47 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                        } else {
                            z19 = z16;
                        }
                        if (i25 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar2;
                        }
                        if ((i16 & 16) != 0) {
                            i36 &= -57345;
                            t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                        }
                        if ((i16 & 32) != 0) {
                            small = m2.f1788a.b(rVarH, 6).getSmall();
                            i36 &= -458753;
                        } else {
                            small = y2Var;
                        }
                        i37 = i36;
                        if (i27 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if ((i16 & 128) != 0) {
                            r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                            rVar3 = rVarH;
                            i37 &= -29360129;
                        } else {
                            rVar3 = rVarH;
                            r0VarA = r0Var;
                        }
                        int i417 = i37;
                        if (i29 != 0) {
                            d3VarC = s0.f1901a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        y2Var3 = small;
                        borderStroke4 = borderStroke3;
                        z25 = z19;
                        mVar2 = mVar4;
                        i38 = i417;
                    }
                    rVar3.y();
                    if (t.k()) {
                        t.o(-1084573925, i38, -1, "androidx.compose.material.Button (Button.kt:105)");
                    }
                    if (lVar4 == null) {
                        rVar3.X(497721888);
                        objE2 = rVar3.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = k.a();
                            rVar3.v(objE2);
                        }
                        lVar5 = (l) objE2;
                        rVar3.R();
                    } else {
                        rVar3.X(1401528215);
                        rVar3.R();
                        lVar5 = lVar4;
                    }
                    i39 = i38 >> 6;
                    int i418 = (i39 & 14) | ((i38 >> 18) & 112);
                    final f6 f6VarB4 = r0VarA.b(z25, rVar3, i418);
                    objE = rVar3.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new er.l() { // from class: a2.u0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Function0.h((n4.i0) obj);
                            }
                        };
                        rVar3.v(objE);
                    }
                    m mVarD4 = v.d(mVar2, false, (er.l) objE, 1, null);
                    long jM20unboximpl4 = r0VarA.a(z25, rVar3, i418).getValue().m20unboximpl();
                    long jM9copywmQWz5c$default4 = Color.m9copywmQWz5c$default(g(f6VarB4), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    if (t0VarB == null) {
                        rVar3.X(498128545);
                        rVar3.R();
                        f6VarA = null;
                    } else {
                        rVar3.X(1401541984);
                        f6VarA = t0VarB.a(z25, lVar5, rVar3, i39 & 910);
                        rVar3.R();
                    }
                    if (f6VarA != null) {
                        fN = f6VarA.getValue().getValue();
                    } else {
                        fN = h.n(0);
                    }
                    r rVar7 = rVar3;
                    f5.g(aVar, mVarD4, z25, y2Var3, jM20unboximpl4, jM9copywmQWz5c$default4, borderStroke4, fN, lVar5, y2.m.d(-20345758, true, new p() { // from class: a2.v0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return Function0.i(f6VarB4, d3VarC, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVar3, 54), rVar7, (i38 & 14) | 805306368 | (i38 & 896) | (i39 & 7168) | (i38 & 3670016), 0);
                    rVar2 = rVar7;
                    if (t.k()) {
                        t.n();
                    }
                    r0Var2 = r0VarA;
                    t0Var2 = t0VarB;
                    y2Var2 = y2Var3;
                    borderStroke2 = borderStroke4;
                    lVar3 = lVar4;
                    d3Var2 = d3VarC;
                    mVar3 = mVar2;
                    z18 = z25;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    y2Var2 = y2Var;
                    borderStroke2 = borderStroke;
                    mVar3 = mVar2;
                    z18 = z16;
                    lVar3 = lVar2;
                    t0Var2 = t0VarB;
                    r0Var2 = r0Var;
                    d3Var2 = d3Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.w0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return Function0.l(aVar, mVar3, z18, lVar3, t0Var2, y2Var2, borderStroke2, r0Var2, d3Var2, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            z16 = z15;
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    lVar2 = lVar;
                    if (rVarH.W(lVar2)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                if ((i15 & 24576) == 0) {
                    if ((i16 & 16) == 0) {
                        t0VarB = t0Var;
                        if (rVarH.W(t0VarB)) {
                            i46 = 16384;
                        }
                        i17 |= i46;
                    } else {
                        t0VarB = t0Var;
                    }
                    i46 = PKIFailureInfo.certRevoked;
                    i17 |= i46;
                } else {
                    t0VarB = t0Var;
                }
                if ((196608 & i15) != 0) {
                    i17 |= ((i16 & 32) == 0 || !rVarH.W(y2Var)) ? PKIFailureInfo.notAuthorized : PKIFailureInfo.unsupportedVersion;
                }
                i27 = i16 & 64;
                if (i27 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.W(borderStroke)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                }
                if ((i15 & 12582912) != 0) {
                    i17 |= ((i16 & 128) == 0 || !rVarH.W(r0Var)) ? 4194304 : 8388608;
                }
                i29 = i16 & 256;
                if (i29 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(d3Var)) {
                            i35 = 67108864;
                        } else {
                            i35 = 33554432;
                        }
                        i17 |= i35;
                    }
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.G(qVar)) {
                            i45 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i45 = 268435456;
                        }
                        i17 |= i45;
                    }
                    i36 = i17;
                    if ((i36 & 306783379) != 306783378) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i36 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i47 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                            } else {
                                z19 = z16;
                            }
                            if (i25 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar2;
                            }
                            if ((i16 & 16) != 0) {
                                i36 &= -57345;
                                t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                            }
                            if ((i16 & 32) != 0) {
                                small = m2.f1788a.b(rVarH, 6).getSmall();
                                i36 &= -458753;
                            } else {
                                small = y2Var;
                            }
                            i37 = i36;
                            if (i27 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if ((i16 & 128) != 0) {
                                r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                                rVar3 = rVarH;
                                i37 &= -29360129;
                            } else {
                                rVar3 = rVarH;
                                r0VarA = r0Var;
                            }
                            int i419 = i37;
                            if (i29 != 0) {
                                d3VarC = s0.f1901a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            y2Var3 = small;
                            borderStroke4 = borderStroke3;
                            z25 = z19;
                            mVar2 = mVar4;
                            i38 = i419;
                        } else {
                            if (i47 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                            } else {
                                z19 = z16;
                            }
                            if (i25 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar2;
                            }
                            if ((i16 & 16) != 0) {
                                i36 &= -57345;
                                t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                            }
                            if ((i16 & 32) != 0) {
                                small = m2.f1788a.b(rVarH, 6).getSmall();
                                i36 &= -458753;
                            } else {
                                small = y2Var;
                            }
                            i37 = i36;
                            if (i27 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if ((i16 & 128) != 0) {
                                r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                                rVar3 = rVarH;
                                i37 &= -29360129;
                            } else {
                                rVar3 = rVarH;
                                r0VarA = r0Var;
                            }
                            int i4110 = i37;
                            if (i29 != 0) {
                                d3VarC = s0.f1901a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            y2Var3 = small;
                            borderStroke4 = borderStroke3;
                            z25 = z19;
                            mVar2 = mVar4;
                            i38 = i4110;
                        }
                        rVar3.y();
                        if (t.k()) {
                            t.o(-1084573925, i38, -1, "androidx.compose.material.Button (Button.kt:105)");
                        }
                        if (lVar4 == null) {
                            rVar3.X(497721888);
                            objE2 = rVar3.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = k.a();
                                rVar3.v(objE2);
                            }
                            lVar5 = (l) objE2;
                            rVar3.R();
                        } else {
                            rVar3.X(1401528215);
                            rVar3.R();
                            lVar5 = lVar4;
                        }
                        i39 = i38 >> 6;
                        int i4111 = (i39 & 14) | ((i38 >> 18) & 112);
                        final f6 f6VarB5 = r0VarA.b(z25, rVar3, i4111);
                        objE = rVar3.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.l() { // from class: a2.u0
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return Function0.h((n4.i0) obj);
                                }
                            };
                            rVar3.v(objE);
                        }
                        m mVarD5 = v.d(mVar2, false, (er.l) objE, 1, null);
                        long jM20unboximpl5 = r0VarA.a(z25, rVar3, i4111).getValue().m20unboximpl();
                        long jM9copywmQWz5c$default5 = Color.m9copywmQWz5c$default(g(f6VarB5), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        if (t0VarB == null) {
                            rVar3.X(498128545);
                            rVar3.R();
                            f6VarA = null;
                        } else {
                            rVar3.X(1401541984);
                            f6VarA = t0VarB.a(z25, lVar5, rVar3, i39 & 910);
                            rVar3.R();
                        }
                        if (f6VarA != null) {
                            fN = f6VarA.getValue().getValue();
                        } else {
                            fN = h.n(0);
                        }
                        r rVar8 = rVar3;
                        f5.g(aVar, mVarD5, z25, y2Var3, jM20unboximpl5, jM9copywmQWz5c$default5, borderStroke4, fN, lVar5, y2.m.d(-20345758, true, new p() { // from class: a2.v0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return Function0.i(f6VarB5, d3VarC, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVar3, 54), rVar8, (i38 & 14) | 805306368 | (i38 & 896) | (i39 & 7168) | (i38 & 3670016), 0);
                        rVar2 = rVar8;
                        if (t.k()) {
                            t.n();
                        }
                        r0Var2 = r0VarA;
                        t0Var2 = t0VarB;
                        y2Var2 = y2Var3;
                        borderStroke2 = borderStroke4;
                        lVar3 = lVar4;
                        d3Var2 = d3VarC;
                        mVar3 = mVar2;
                        z18 = z25;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        y2Var2 = y2Var;
                        borderStroke2 = borderStroke;
                        mVar3 = mVar2;
                        z18 = z16;
                        lVar3 = lVar2;
                        t0Var2 = t0VarB;
                        r0Var2 = r0Var;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.w0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return Function0.l(aVar, mVar3, z18, lVar3, t0Var2, y2Var2, borderStroke2, r0Var2, d3Var2, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 100663296;
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(qVar)) {
                        i45 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i45 = 268435456;
                    }
                    i17 |= i45;
                }
                i36 = i17;
                if ((i36 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i36 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i47 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                        } else {
                            z19 = z16;
                        }
                        if (i25 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar2;
                        }
                        if ((i16 & 16) != 0) {
                            i36 &= -57345;
                            t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                        }
                        if ((i16 & 32) != 0) {
                            small = m2.f1788a.b(rVarH, 6).getSmall();
                            i36 &= -458753;
                        } else {
                            small = y2Var;
                        }
                        i37 = i36;
                        if (i27 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if ((i16 & 128) != 0) {
                            r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                            rVar3 = rVarH;
                            i37 &= -29360129;
                        } else {
                            rVar3 = rVarH;
                            r0VarA = r0Var;
                        }
                        int i4112 = i37;
                        if (i29 != 0) {
                            d3VarC = s0.f1901a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        y2Var3 = small;
                        borderStroke4 = borderStroke3;
                        z25 = z19;
                        mVar2 = mVar4;
                        i38 = i4112;
                    } else {
                        if (i47 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                        } else {
                            z19 = z16;
                        }
                        if (i25 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar2;
                        }
                        if ((i16 & 16) != 0) {
                            i36 &= -57345;
                            t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                        }
                        if ((i16 & 32) != 0) {
                            small = m2.f1788a.b(rVarH, 6).getSmall();
                            i36 &= -458753;
                        } else {
                            small = y2Var;
                        }
                        i37 = i36;
                        if (i27 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if ((i16 & 128) != 0) {
                            r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                            rVar3 = rVarH;
                            i37 &= -29360129;
                        } else {
                            rVar3 = rVarH;
                            r0VarA = r0Var;
                        }
                        int i4113 = i37;
                        if (i29 != 0) {
                            d3VarC = s0.f1901a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        y2Var3 = small;
                        borderStroke4 = borderStroke3;
                        z25 = z19;
                        mVar2 = mVar4;
                        i38 = i4113;
                    }
                    rVar3.y();
                    if (t.k()) {
                        t.o(-1084573925, i38, -1, "androidx.compose.material.Button (Button.kt:105)");
                    }
                    if (lVar4 == null) {
                        rVar3.X(497721888);
                        objE2 = rVar3.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = k.a();
                            rVar3.v(objE2);
                        }
                        lVar5 = (l) objE2;
                        rVar3.R();
                    } else {
                        rVar3.X(1401528215);
                        rVar3.R();
                        lVar5 = lVar4;
                    }
                    i39 = i38 >> 6;
                    int i4114 = (i39 & 14) | ((i38 >> 18) & 112);
                    final f6 f6VarB6 = r0VarA.b(z25, rVar3, i4114);
                    objE = rVar3.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new er.l() { // from class: a2.u0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Function0.h((n4.i0) obj);
                            }
                        };
                        rVar3.v(objE);
                    }
                    m mVarD6 = v.d(mVar2, false, (er.l) objE, 1, null);
                    long jM20unboximpl6 = r0VarA.a(z25, rVar3, i4114).getValue().m20unboximpl();
                    long jM9copywmQWz5c$default6 = Color.m9copywmQWz5c$default(g(f6VarB6), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    if (t0VarB == null) {
                        rVar3.X(498128545);
                        rVar3.R();
                        f6VarA = null;
                    } else {
                        rVar3.X(1401541984);
                        f6VarA = t0VarB.a(z25, lVar5, rVar3, i39 & 910);
                        rVar3.R();
                    }
                    if (f6VarA != null) {
                        fN = f6VarA.getValue().getValue();
                    } else {
                        fN = h.n(0);
                    }
                    r rVar9 = rVar3;
                    f5.g(aVar, mVarD6, z25, y2Var3, jM20unboximpl6, jM9copywmQWz5c$default6, borderStroke4, fN, lVar5, y2.m.d(-20345758, true, new p() { // from class: a2.v0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return Function0.i(f6VarB6, d3VarC, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVar3, 54), rVar9, (i38 & 14) | 805306368 | (i38 & 896) | (i39 & 7168) | (i38 & 3670016), 0);
                    rVar2 = rVar9;
                    if (t.k()) {
                        t.n();
                    }
                    r0Var2 = r0VarA;
                    t0Var2 = t0VarB;
                    y2Var2 = y2Var3;
                    borderStroke2 = borderStroke4;
                    lVar3 = lVar4;
                    d3Var2 = d3VarC;
                    mVar3 = mVar2;
                    z18 = z25;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    y2Var2 = y2Var;
                    borderStroke2 = borderStroke;
                    mVar3 = mVar2;
                    z18 = z16;
                    lVar3 = lVar2;
                    t0Var2 = t0VarB;
                    r0Var2 = r0Var;
                    d3Var2 = d3Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.w0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return Function0.l(aVar, mVar3, z18, lVar3, t0Var2, y2Var2, borderStroke2, r0Var2, d3Var2, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            lVar2 = lVar;
            if ((i15 & 24576) == 0) {
                if ((i16 & 16) == 0) {
                    t0VarB = t0Var;
                    if (rVarH.W(t0VarB)) {
                        i46 = 16384;
                    }
                    i17 |= i46;
                } else {
                    t0VarB = t0Var;
                }
                i46 = PKIFailureInfo.certRevoked;
                i17 |= i46;
            } else {
                t0VarB = t0Var;
            }
            if ((196608 & i15) != 0) {
                i17 |= ((i16 & 32) == 0 || !rVarH.W(y2Var)) ? PKIFailureInfo.notAuthorized : PKIFailureInfo.unsupportedVersion;
            }
            i27 = i16 & 64;
            if (i27 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.W(borderStroke)) {
                    i28 = PKIFailureInfo.badCertTemplate;
                } else {
                    i28 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i28;
            }
            if ((i15 & 12582912) != 0) {
                i17 |= ((i16 & 128) == 0 || !rVarH.W(r0Var)) ? 4194304 : 8388608;
            }
            i29 = i16 & 256;
            if (i29 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.W(d3Var)) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i17 |= i35;
                }
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(qVar)) {
                        i45 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i45 = 268435456;
                    }
                    i17 |= i45;
                }
                i36 = i17;
                if ((i36 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i36 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i47 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                        } else {
                            z19 = z16;
                        }
                        if (i25 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar2;
                        }
                        if ((i16 & 16) != 0) {
                            i36 &= -57345;
                            t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                        }
                        if ((i16 & 32) != 0) {
                            small = m2.f1788a.b(rVarH, 6).getSmall();
                            i36 &= -458753;
                        } else {
                            small = y2Var;
                        }
                        i37 = i36;
                        if (i27 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if ((i16 & 128) != 0) {
                            r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                            rVar3 = rVarH;
                            i37 &= -29360129;
                        } else {
                            rVar3 = rVarH;
                            r0VarA = r0Var;
                        }
                        int i4115 = i37;
                        if (i29 != 0) {
                            d3VarC = s0.f1901a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        y2Var3 = small;
                        borderStroke4 = borderStroke3;
                        z25 = z19;
                        mVar2 = mVar4;
                        i38 = i4115;
                    } else {
                        if (i47 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                        } else {
                            z19 = z16;
                        }
                        if (i25 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar2;
                        }
                        if ((i16 & 16) != 0) {
                            i36 &= -57345;
                            t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                        }
                        if ((i16 & 32) != 0) {
                            small = m2.f1788a.b(rVarH, 6).getSmall();
                            i36 &= -458753;
                        } else {
                            small = y2Var;
                        }
                        i37 = i36;
                        if (i27 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if ((i16 & 128) != 0) {
                            r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                            rVar3 = rVarH;
                            i37 &= -29360129;
                        } else {
                            rVar3 = rVarH;
                            r0VarA = r0Var;
                        }
                        int i4116 = i37;
                        if (i29 != 0) {
                            d3VarC = s0.f1901a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        y2Var3 = small;
                        borderStroke4 = borderStroke3;
                        z25 = z19;
                        mVar2 = mVar4;
                        i38 = i4116;
                    }
                    rVar3.y();
                    if (t.k()) {
                        t.o(-1084573925, i38, -1, "androidx.compose.material.Button (Button.kt:105)");
                    }
                    if (lVar4 == null) {
                        rVar3.X(497721888);
                        objE2 = rVar3.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = k.a();
                            rVar3.v(objE2);
                        }
                        lVar5 = (l) objE2;
                        rVar3.R();
                    } else {
                        rVar3.X(1401528215);
                        rVar3.R();
                        lVar5 = lVar4;
                    }
                    i39 = i38 >> 6;
                    int i4117 = (i39 & 14) | ((i38 >> 18) & 112);
                    final f6 f6VarB7 = r0VarA.b(z25, rVar3, i4117);
                    objE = rVar3.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new er.l() { // from class: a2.u0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Function0.h((n4.i0) obj);
                            }
                        };
                        rVar3.v(objE);
                    }
                    m mVarD7 = v.d(mVar2, false, (er.l) objE, 1, null);
                    long jM20unboximpl7 = r0VarA.a(z25, rVar3, i4117).getValue().m20unboximpl();
                    long jM9copywmQWz5c$default7 = Color.m9copywmQWz5c$default(g(f6VarB7), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    if (t0VarB == null) {
                        rVar3.X(498128545);
                        rVar3.R();
                        f6VarA = null;
                    } else {
                        rVar3.X(1401541984);
                        f6VarA = t0VarB.a(z25, lVar5, rVar3, i39 & 910);
                        rVar3.R();
                    }
                    if (f6VarA != null) {
                        fN = f6VarA.getValue().getValue();
                    } else {
                        fN = h.n(0);
                    }
                    r rVar10 = rVar3;
                    f5.g(aVar, mVarD7, z25, y2Var3, jM20unboximpl7, jM9copywmQWz5c$default7, borderStroke4, fN, lVar5, y2.m.d(-20345758, true, new p() { // from class: a2.v0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return Function0.i(f6VarB7, d3VarC, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVar3, 54), rVar10, (i38 & 14) | 805306368 | (i38 & 896) | (i39 & 7168) | (i38 & 3670016), 0);
                    rVar2 = rVar10;
                    if (t.k()) {
                        t.n();
                    }
                    r0Var2 = r0VarA;
                    t0Var2 = t0VarB;
                    y2Var2 = y2Var3;
                    borderStroke2 = borderStroke4;
                    lVar3 = lVar4;
                    d3Var2 = d3VarC;
                    mVar3 = mVar2;
                    z18 = z25;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    y2Var2 = y2Var;
                    borderStroke2 = borderStroke;
                    mVar3 = mVar2;
                    z18 = z16;
                    lVar3 = lVar2;
                    t0Var2 = t0VarB;
                    r0Var2 = r0Var;
                    d3Var2 = d3Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.w0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return Function0.l(aVar, mVar3, z18, lVar3, t0Var2, y2Var2, borderStroke2, r0Var2, d3Var2, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 100663296;
            if ((i15 & 805306368) == 0) {
                if (rVarH.G(qVar)) {
                    i45 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i45 = 268435456;
                }
                i17 |= i45;
            }
            i36 = i17;
            if ((i36 & 306783379) != 306783378) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i36 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i47 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                    } else {
                        z19 = z16;
                    }
                    if (i25 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar2;
                    }
                    if ((i16 & 16) != 0) {
                        i36 &= -57345;
                        t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                    }
                    if ((i16 & 32) != 0) {
                        small = m2.f1788a.b(rVarH, 6).getSmall();
                        i36 &= -458753;
                    } else {
                        small = y2Var;
                    }
                    i37 = i36;
                    if (i27 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if ((i16 & 128) != 0) {
                        r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                        rVar3 = rVarH;
                        i37 &= -29360129;
                    } else {
                        rVar3 = rVarH;
                        r0VarA = r0Var;
                    }
                    int i4118 = i37;
                    if (i29 != 0) {
                        d3VarC = s0.f1901a.c();
                    } else {
                        d3VarC = d3Var;
                    }
                    y2Var3 = small;
                    borderStroke4 = borderStroke3;
                    z25 = z19;
                    mVar2 = mVar4;
                    i38 = i4118;
                } else {
                    if (i47 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                    } else {
                        z19 = z16;
                    }
                    if (i25 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar2;
                    }
                    if ((i16 & 16) != 0) {
                        i36 &= -57345;
                        t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                    }
                    if ((i16 & 32) != 0) {
                        small = m2.f1788a.b(rVarH, 6).getSmall();
                        i36 &= -458753;
                    } else {
                        small = y2Var;
                    }
                    i37 = i36;
                    if (i27 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if ((i16 & 128) != 0) {
                        r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                        rVar3 = rVarH;
                        i37 &= -29360129;
                    } else {
                        rVar3 = rVarH;
                        r0VarA = r0Var;
                    }
                    int i4119 = i37;
                    if (i29 != 0) {
                        d3VarC = s0.f1901a.c();
                    } else {
                        d3VarC = d3Var;
                    }
                    y2Var3 = small;
                    borderStroke4 = borderStroke3;
                    z25 = z19;
                    mVar2 = mVar4;
                    i38 = i4119;
                }
                rVar3.y();
                if (t.k()) {
                    t.o(-1084573925, i38, -1, "androidx.compose.material.Button (Button.kt:105)");
                }
                if (lVar4 == null) {
                    rVar3.X(497721888);
                    objE2 = rVar3.E();
                    if (objE2 == r.INSTANCE.a()) {
                        objE2 = k.a();
                        rVar3.v(objE2);
                    }
                    lVar5 = (l) objE2;
                    rVar3.R();
                } else {
                    rVar3.X(1401528215);
                    rVar3.R();
                    lVar5 = lVar4;
                }
                i39 = i38 >> 6;
                int i41110 = (i39 & 14) | ((i38 >> 18) & 112);
                final f6 f6VarB8 = r0VarA.b(z25, rVar3, i41110);
                objE = rVar3.E();
                if (objE == r.INSTANCE.a()) {
                    objE = new er.l() { // from class: a2.u0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return Function0.h((n4.i0) obj);
                        }
                    };
                    rVar3.v(objE);
                }
                m mVarD8 = v.d(mVar2, false, (er.l) objE, 1, null);
                long jM20unboximpl8 = r0VarA.a(z25, rVar3, i41110).getValue().m20unboximpl();
                long jM9copywmQWz5c$default8 = Color.m9copywmQWz5c$default(g(f6VarB8), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                if (t0VarB == null) {
                    rVar3.X(498128545);
                    rVar3.R();
                    f6VarA = null;
                } else {
                    rVar3.X(1401541984);
                    f6VarA = t0VarB.a(z25, lVar5, rVar3, i39 & 910);
                    rVar3.R();
                }
                if (f6VarA != null) {
                    fN = f6VarA.getValue().getValue();
                } else {
                    fN = h.n(0);
                }
                r rVar11 = rVar3;
                f5.g(aVar, mVarD8, z25, y2Var3, jM20unboximpl8, jM9copywmQWz5c$default8, borderStroke4, fN, lVar5, y2.m.d(-20345758, true, new p() { // from class: a2.v0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return Function0.i(f6VarB8, d3VarC, qVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar3, 54), rVar11, (i38 & 14) | 805306368 | (i38 & 896) | (i39 & 7168) | (i38 & 3670016), 0);
                rVar2 = rVar11;
                if (t.k()) {
                    t.n();
                }
                r0Var2 = r0VarA;
                t0Var2 = t0VarB;
                y2Var2 = y2Var3;
                borderStroke2 = borderStroke4;
                lVar3 = lVar4;
                d3Var2 = d3VarC;
                mVar3 = mVar2;
                z18 = z25;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                y2Var2 = y2Var;
                borderStroke2 = borderStroke;
                mVar3 = mVar2;
                z18 = z16;
                lVar3 = lVar2;
                t0Var2 = t0VarB;
                r0Var2 = r0Var;
                d3Var2 = d3Var;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.w0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return Function0.l(aVar, mVar3, z18, lVar3, t0Var2, y2Var2, borderStroke2, r0Var2, d3Var2, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        mVar2 = mVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                z16 = z15;
                if (rVarH.a(z16)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    lVar2 = lVar;
                    if (rVarH.W(lVar2)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                if ((i15 & 24576) == 0) {
                    if ((i16 & 16) == 0) {
                        t0VarB = t0Var;
                        if (rVarH.W(t0VarB)) {
                            i46 = 16384;
                        }
                        i17 |= i46;
                    } else {
                        t0VarB = t0Var;
                    }
                    i46 = PKIFailureInfo.certRevoked;
                    i17 |= i46;
                } else {
                    t0VarB = t0Var;
                }
                if ((196608 & i15) != 0) {
                    i17 |= ((i16 & 32) == 0 || !rVarH.W(y2Var)) ? PKIFailureInfo.notAuthorized : PKIFailureInfo.unsupportedVersion;
                }
                i27 = i16 & 64;
                if (i27 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.W(borderStroke)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                }
                if ((i15 & 12582912) != 0) {
                    i17 |= ((i16 & 128) == 0 || !rVarH.W(r0Var)) ? 4194304 : 8388608;
                }
                i29 = i16 & 256;
                if (i29 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(d3Var)) {
                            i35 = 67108864;
                        } else {
                            i35 = 33554432;
                        }
                        i17 |= i35;
                    }
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.G(qVar)) {
                            i45 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i45 = 268435456;
                        }
                        i17 |= i45;
                    }
                    i36 = i17;
                    if ((i36 & 306783379) != 306783378) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i36 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i47 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                            } else {
                                z19 = z16;
                            }
                            if (i25 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar2;
                            }
                            if ((i16 & 16) != 0) {
                                i36 &= -57345;
                                t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                            }
                            if ((i16 & 32) != 0) {
                                small = m2.f1788a.b(rVarH, 6).getSmall();
                                i36 &= -458753;
                            } else {
                                small = y2Var;
                            }
                            i37 = i36;
                            if (i27 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if ((i16 & 128) != 0) {
                                r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                                rVar3 = rVarH;
                                i37 &= -29360129;
                            } else {
                                rVar3 = rVarH;
                                r0VarA = r0Var;
                            }
                            int i41111 = i37;
                            if (i29 != 0) {
                                d3VarC = s0.f1901a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            y2Var3 = small;
                            borderStroke4 = borderStroke3;
                            z25 = z19;
                            mVar2 = mVar4;
                            i38 = i41111;
                        } else {
                            if (i47 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                            } else {
                                z19 = z16;
                            }
                            if (i25 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar2;
                            }
                            if ((i16 & 16) != 0) {
                                i36 &= -57345;
                                t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                            }
                            if ((i16 & 32) != 0) {
                                small = m2.f1788a.b(rVarH, 6).getSmall();
                                i36 &= -458753;
                            } else {
                                small = y2Var;
                            }
                            i37 = i36;
                            if (i27 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if ((i16 & 128) != 0) {
                                r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                                rVar3 = rVarH;
                                i37 &= -29360129;
                            } else {
                                rVar3 = rVarH;
                                r0VarA = r0Var;
                            }
                            int i41112 = i37;
                            if (i29 != 0) {
                                d3VarC = s0.f1901a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            y2Var3 = small;
                            borderStroke4 = borderStroke3;
                            z25 = z19;
                            mVar2 = mVar4;
                            i38 = i41112;
                        }
                        rVar3.y();
                        if (t.k()) {
                            t.o(-1084573925, i38, -1, "androidx.compose.material.Button (Button.kt:105)");
                        }
                        if (lVar4 == null) {
                            rVar3.X(497721888);
                            objE2 = rVar3.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = k.a();
                                rVar3.v(objE2);
                            }
                            lVar5 = (l) objE2;
                            rVar3.R();
                        } else {
                            rVar3.X(1401528215);
                            rVar3.R();
                            lVar5 = lVar4;
                        }
                        i39 = i38 >> 6;
                        int i41113 = (i39 & 14) | ((i38 >> 18) & 112);
                        final f6 f6VarB9 = r0VarA.b(z25, rVar3, i41113);
                        objE = rVar3.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.l() { // from class: a2.u0
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return Function0.h((n4.i0) obj);
                                }
                            };
                            rVar3.v(objE);
                        }
                        m mVarD9 = v.d(mVar2, false, (er.l) objE, 1, null);
                        long jM20unboximpl9 = r0VarA.a(z25, rVar3, i41113).getValue().m20unboximpl();
                        long jM9copywmQWz5c$default9 = Color.m9copywmQWz5c$default(g(f6VarB9), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        if (t0VarB == null) {
                            rVar3.X(498128545);
                            rVar3.R();
                            f6VarA = null;
                        } else {
                            rVar3.X(1401541984);
                            f6VarA = t0VarB.a(z25, lVar5, rVar3, i39 & 910);
                            rVar3.R();
                        }
                        if (f6VarA != null) {
                            fN = f6VarA.getValue().getValue();
                        } else {
                            fN = h.n(0);
                        }
                        r rVar12 = rVar3;
                        f5.g(aVar, mVarD9, z25, y2Var3, jM20unboximpl9, jM9copywmQWz5c$default9, borderStroke4, fN, lVar5, y2.m.d(-20345758, true, new p() { // from class: a2.v0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return Function0.i(f6VarB9, d3VarC, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVar3, 54), rVar12, (i38 & 14) | 805306368 | (i38 & 896) | (i39 & 7168) | (i38 & 3670016), 0);
                        rVar2 = rVar12;
                        if (t.k()) {
                            t.n();
                        }
                        r0Var2 = r0VarA;
                        t0Var2 = t0VarB;
                        y2Var2 = y2Var3;
                        borderStroke2 = borderStroke4;
                        lVar3 = lVar4;
                        d3Var2 = d3VarC;
                        mVar3 = mVar2;
                        z18 = z25;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        y2Var2 = y2Var;
                        borderStroke2 = borderStroke;
                        mVar3 = mVar2;
                        z18 = z16;
                        lVar3 = lVar2;
                        t0Var2 = t0VarB;
                        r0Var2 = r0Var;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.w0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return Function0.l(aVar, mVar3, z18, lVar3, t0Var2, y2Var2, borderStroke2, r0Var2, d3Var2, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 100663296;
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(qVar)) {
                        i45 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i45 = 268435456;
                    }
                    i17 |= i45;
                }
                i36 = i17;
                if ((i36 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i36 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i47 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                        } else {
                            z19 = z16;
                        }
                        if (i25 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar2;
                        }
                        if ((i16 & 16) != 0) {
                            i36 &= -57345;
                            t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                        }
                        if ((i16 & 32) != 0) {
                            small = m2.f1788a.b(rVarH, 6).getSmall();
                            i36 &= -458753;
                        } else {
                            small = y2Var;
                        }
                        i37 = i36;
                        if (i27 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if ((i16 & 128) != 0) {
                            r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                            rVar3 = rVarH;
                            i37 &= -29360129;
                        } else {
                            rVar3 = rVarH;
                            r0VarA = r0Var;
                        }
                        int i41114 = i37;
                        if (i29 != 0) {
                            d3VarC = s0.f1901a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        y2Var3 = small;
                        borderStroke4 = borderStroke3;
                        z25 = z19;
                        mVar2 = mVar4;
                        i38 = i41114;
                    } else {
                        if (i47 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                        } else {
                            z19 = z16;
                        }
                        if (i25 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar2;
                        }
                        if ((i16 & 16) != 0) {
                            i36 &= -57345;
                            t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                        }
                        if ((i16 & 32) != 0) {
                            small = m2.f1788a.b(rVarH, 6).getSmall();
                            i36 &= -458753;
                        } else {
                            small = y2Var;
                        }
                        i37 = i36;
                        if (i27 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if ((i16 & 128) != 0) {
                            r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                            rVar3 = rVarH;
                            i37 &= -29360129;
                        } else {
                            rVar3 = rVarH;
                            r0VarA = r0Var;
                        }
                        int i41115 = i37;
                        if (i29 != 0) {
                            d3VarC = s0.f1901a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        y2Var3 = small;
                        borderStroke4 = borderStroke3;
                        z25 = z19;
                        mVar2 = mVar4;
                        i38 = i41115;
                    }
                    rVar3.y();
                    if (t.k()) {
                        t.o(-1084573925, i38, -1, "androidx.compose.material.Button (Button.kt:105)");
                    }
                    if (lVar4 == null) {
                        rVar3.X(497721888);
                        objE2 = rVar3.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = k.a();
                            rVar3.v(objE2);
                        }
                        lVar5 = (l) objE2;
                        rVar3.R();
                    } else {
                        rVar3.X(1401528215);
                        rVar3.R();
                        lVar5 = lVar4;
                    }
                    i39 = i38 >> 6;
                    int i41116 = (i39 & 14) | ((i38 >> 18) & 112);
                    final f6 f6VarB10 = r0VarA.b(z25, rVar3, i41116);
                    objE = rVar3.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new er.l() { // from class: a2.u0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Function0.h((n4.i0) obj);
                            }
                        };
                        rVar3.v(objE);
                    }
                    m mVarD10 = v.d(mVar2, false, (er.l) objE, 1, null);
                    long jM20unboximpl10 = r0VarA.a(z25, rVar3, i41116).getValue().m20unboximpl();
                    long jM9copywmQWz5c$default10 = Color.m9copywmQWz5c$default(g(f6VarB10), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    if (t0VarB == null) {
                        rVar3.X(498128545);
                        rVar3.R();
                        f6VarA = null;
                    } else {
                        rVar3.X(1401541984);
                        f6VarA = t0VarB.a(z25, lVar5, rVar3, i39 & 910);
                        rVar3.R();
                    }
                    if (f6VarA != null) {
                        fN = f6VarA.getValue().getValue();
                    } else {
                        fN = h.n(0);
                    }
                    r rVar13 = rVar3;
                    f5.g(aVar, mVarD10, z25, y2Var3, jM20unboximpl10, jM9copywmQWz5c$default10, borderStroke4, fN, lVar5, y2.m.d(-20345758, true, new p() { // from class: a2.v0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return Function0.i(f6VarB10, d3VarC, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVar3, 54), rVar13, (i38 & 14) | 805306368 | (i38 & 896) | (i39 & 7168) | (i38 & 3670016), 0);
                    rVar2 = rVar13;
                    if (t.k()) {
                        t.n();
                    }
                    r0Var2 = r0VarA;
                    t0Var2 = t0VarB;
                    y2Var2 = y2Var3;
                    borderStroke2 = borderStroke4;
                    lVar3 = lVar4;
                    d3Var2 = d3VarC;
                    mVar3 = mVar2;
                    z18 = z25;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    y2Var2 = y2Var;
                    borderStroke2 = borderStroke;
                    mVar3 = mVar2;
                    z18 = z16;
                    lVar3 = lVar2;
                    t0Var2 = t0VarB;
                    r0Var2 = r0Var;
                    d3Var2 = d3Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.w0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return Function0.l(aVar, mVar3, z18, lVar3, t0Var2, y2Var2, borderStroke2, r0Var2, d3Var2, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            lVar2 = lVar;
            if ((i15 & 24576) == 0) {
                if ((i16 & 16) == 0) {
                    t0VarB = t0Var;
                    if (rVarH.W(t0VarB)) {
                        i46 = 16384;
                    }
                    i17 |= i46;
                } else {
                    t0VarB = t0Var;
                }
                i46 = PKIFailureInfo.certRevoked;
                i17 |= i46;
            } else {
                t0VarB = t0Var;
            }
            if ((196608 & i15) != 0) {
                i17 |= ((i16 & 32) == 0 || !rVarH.W(y2Var)) ? PKIFailureInfo.notAuthorized : PKIFailureInfo.unsupportedVersion;
            }
            i27 = i16 & 64;
            if (i27 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.W(borderStroke)) {
                    i28 = PKIFailureInfo.badCertTemplate;
                } else {
                    i28 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i28;
            }
            if ((i15 & 12582912) != 0) {
                i17 |= ((i16 & 128) == 0 || !rVarH.W(r0Var)) ? 4194304 : 8388608;
            }
            i29 = i16 & 256;
            if (i29 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.W(d3Var)) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i17 |= i35;
                }
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(qVar)) {
                        i45 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i45 = 268435456;
                    }
                    i17 |= i45;
                }
                i36 = i17;
                if ((i36 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i36 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i47 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                        } else {
                            z19 = z16;
                        }
                        if (i25 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar2;
                        }
                        if ((i16 & 16) != 0) {
                            i36 &= -57345;
                            t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                        }
                        if ((i16 & 32) != 0) {
                            small = m2.f1788a.b(rVarH, 6).getSmall();
                            i36 &= -458753;
                        } else {
                            small = y2Var;
                        }
                        i37 = i36;
                        if (i27 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if ((i16 & 128) != 0) {
                            r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                            rVar3 = rVarH;
                            i37 &= -29360129;
                        } else {
                            rVar3 = rVarH;
                            r0VarA = r0Var;
                        }
                        int i41117 = i37;
                        if (i29 != 0) {
                            d3VarC = s0.f1901a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        y2Var3 = small;
                        borderStroke4 = borderStroke3;
                        z25 = z19;
                        mVar2 = mVar4;
                        i38 = i41117;
                    } else {
                        if (i47 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                        } else {
                            z19 = z16;
                        }
                        if (i25 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar2;
                        }
                        if ((i16 & 16) != 0) {
                            i36 &= -57345;
                            t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                        }
                        if ((i16 & 32) != 0) {
                            small = m2.f1788a.b(rVarH, 6).getSmall();
                            i36 &= -458753;
                        } else {
                            small = y2Var;
                        }
                        i37 = i36;
                        if (i27 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if ((i16 & 128) != 0) {
                            r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                            rVar3 = rVarH;
                            i37 &= -29360129;
                        } else {
                            rVar3 = rVarH;
                            r0VarA = r0Var;
                        }
                        int i41118 = i37;
                        if (i29 != 0) {
                            d3VarC = s0.f1901a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        y2Var3 = small;
                        borderStroke4 = borderStroke3;
                        z25 = z19;
                        mVar2 = mVar4;
                        i38 = i41118;
                    }
                    rVar3.y();
                    if (t.k()) {
                        t.o(-1084573925, i38, -1, "androidx.compose.material.Button (Button.kt:105)");
                    }
                    if (lVar4 == null) {
                        rVar3.X(497721888);
                        objE2 = rVar3.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = k.a();
                            rVar3.v(objE2);
                        }
                        lVar5 = (l) objE2;
                        rVar3.R();
                    } else {
                        rVar3.X(1401528215);
                        rVar3.R();
                        lVar5 = lVar4;
                    }
                    i39 = i38 >> 6;
                    int i41119 = (i39 & 14) | ((i38 >> 18) & 112);
                    final f6 f6VarB11 = r0VarA.b(z25, rVar3, i41119);
                    objE = rVar3.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new er.l() { // from class: a2.u0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Function0.h((n4.i0) obj);
                            }
                        };
                        rVar3.v(objE);
                    }
                    m mVarD11 = v.d(mVar2, false, (er.l) objE, 1, null);
                    long jM20unboximpl11 = r0VarA.a(z25, rVar3, i41119).getValue().m20unboximpl();
                    long jM9copywmQWz5c$default11 = Color.m9copywmQWz5c$default(g(f6VarB11), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    if (t0VarB == null) {
                        rVar3.X(498128545);
                        rVar3.R();
                        f6VarA = null;
                    } else {
                        rVar3.X(1401541984);
                        f6VarA = t0VarB.a(z25, lVar5, rVar3, i39 & 910);
                        rVar3.R();
                    }
                    if (f6VarA != null) {
                        fN = f6VarA.getValue().getValue();
                    } else {
                        fN = h.n(0);
                    }
                    r rVar14 = rVar3;
                    f5.g(aVar, mVarD11, z25, y2Var3, jM20unboximpl11, jM9copywmQWz5c$default11, borderStroke4, fN, lVar5, y2.m.d(-20345758, true, new p() { // from class: a2.v0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return Function0.i(f6VarB11, d3VarC, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVar3, 54), rVar14, (i38 & 14) | 805306368 | (i38 & 896) | (i39 & 7168) | (i38 & 3670016), 0);
                    rVar2 = rVar14;
                    if (t.k()) {
                        t.n();
                    }
                    r0Var2 = r0VarA;
                    t0Var2 = t0VarB;
                    y2Var2 = y2Var3;
                    borderStroke2 = borderStroke4;
                    lVar3 = lVar4;
                    d3Var2 = d3VarC;
                    mVar3 = mVar2;
                    z18 = z25;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    y2Var2 = y2Var;
                    borderStroke2 = borderStroke;
                    mVar3 = mVar2;
                    z18 = z16;
                    lVar3 = lVar2;
                    t0Var2 = t0VarB;
                    r0Var2 = r0Var;
                    d3Var2 = d3Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.w0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return Function0.l(aVar, mVar3, z18, lVar3, t0Var2, y2Var2, borderStroke2, r0Var2, d3Var2, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 100663296;
            if ((i15 & 805306368) == 0) {
                if (rVarH.G(qVar)) {
                    i45 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i45 = 268435456;
                }
                i17 |= i45;
            }
            i36 = i17;
            if ((i36 & 306783379) != 306783378) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i36 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i47 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                    } else {
                        z19 = z16;
                    }
                    if (i25 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar2;
                    }
                    if ((i16 & 16) != 0) {
                        i36 &= -57345;
                        t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                    }
                    if ((i16 & 32) != 0) {
                        small = m2.f1788a.b(rVarH, 6).getSmall();
                        i36 &= -458753;
                    } else {
                        small = y2Var;
                    }
                    i37 = i36;
                    if (i27 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if ((i16 & 128) != 0) {
                        r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                        rVar3 = rVarH;
                        i37 &= -29360129;
                    } else {
                        rVar3 = rVarH;
                        r0VarA = r0Var;
                    }
                    int i411110 = i37;
                    if (i29 != 0) {
                        d3VarC = s0.f1901a.c();
                    } else {
                        d3VarC = d3Var;
                    }
                    y2Var3 = small;
                    borderStroke4 = borderStroke3;
                    z25 = z19;
                    mVar2 = mVar4;
                    i38 = i411110;
                } else {
                    if (i47 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                    } else {
                        z19 = z16;
                    }
                    if (i25 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar2;
                    }
                    if ((i16 & 16) != 0) {
                        i36 &= -57345;
                        t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                    }
                    if ((i16 & 32) != 0) {
                        small = m2.f1788a.b(rVarH, 6).getSmall();
                        i36 &= -458753;
                    } else {
                        small = y2Var;
                    }
                    i37 = i36;
                    if (i27 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if ((i16 & 128) != 0) {
                        r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                        rVar3 = rVarH;
                        i37 &= -29360129;
                    } else {
                        rVar3 = rVarH;
                        r0VarA = r0Var;
                    }
                    int i411111 = i37;
                    if (i29 != 0) {
                        d3VarC = s0.f1901a.c();
                    } else {
                        d3VarC = d3Var;
                    }
                    y2Var3 = small;
                    borderStroke4 = borderStroke3;
                    z25 = z19;
                    mVar2 = mVar4;
                    i38 = i411111;
                }
                rVar3.y();
                if (t.k()) {
                    t.o(-1084573925, i38, -1, "androidx.compose.material.Button (Button.kt:105)");
                }
                if (lVar4 == null) {
                    rVar3.X(497721888);
                    objE2 = rVar3.E();
                    if (objE2 == r.INSTANCE.a()) {
                        objE2 = k.a();
                        rVar3.v(objE2);
                    }
                    lVar5 = (l) objE2;
                    rVar3.R();
                } else {
                    rVar3.X(1401528215);
                    rVar3.R();
                    lVar5 = lVar4;
                }
                i39 = i38 >> 6;
                int i411112 = (i39 & 14) | ((i38 >> 18) & 112);
                final f6 f6VarB12 = r0VarA.b(z25, rVar3, i411112);
                objE = rVar3.E();
                if (objE == r.INSTANCE.a()) {
                    objE = new er.l() { // from class: a2.u0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return Function0.h((n4.i0) obj);
                        }
                    };
                    rVar3.v(objE);
                }
                m mVarD12 = v.d(mVar2, false, (er.l) objE, 1, null);
                long jM20unboximpl12 = r0VarA.a(z25, rVar3, i411112).getValue().m20unboximpl();
                long jM9copywmQWz5c$default12 = Color.m9copywmQWz5c$default(g(f6VarB12), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                if (t0VarB == null) {
                    rVar3.X(498128545);
                    rVar3.R();
                    f6VarA = null;
                } else {
                    rVar3.X(1401541984);
                    f6VarA = t0VarB.a(z25, lVar5, rVar3, i39 & 910);
                    rVar3.R();
                }
                if (f6VarA != null) {
                    fN = f6VarA.getValue().getValue();
                } else {
                    fN = h.n(0);
                }
                r rVar15 = rVar3;
                f5.g(aVar, mVarD12, z25, y2Var3, jM20unboximpl12, jM9copywmQWz5c$default12, borderStroke4, fN, lVar5, y2.m.d(-20345758, true, new p() { // from class: a2.v0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return Function0.i(f6VarB12, d3VarC, qVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar3, 54), rVar15, (i38 & 14) | 805306368 | (i38 & 896) | (i39 & 7168) | (i38 & 3670016), 0);
                rVar2 = rVar15;
                if (t.k()) {
                    t.n();
                }
                r0Var2 = r0VarA;
                t0Var2 = t0VarB;
                y2Var2 = y2Var3;
                borderStroke2 = borderStroke4;
                lVar3 = lVar4;
                d3Var2 = d3VarC;
                mVar3 = mVar2;
                z18 = z25;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                y2Var2 = y2Var;
                borderStroke2 = borderStroke;
                mVar3 = mVar2;
                z18 = z16;
                lVar3 = lVar2;
                t0Var2 = t0VarB;
                r0Var2 = r0Var;
                d3Var2 = d3Var;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.w0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return Function0.l(aVar, mVar3, z18, lVar3, t0Var2, y2Var2, borderStroke2, r0Var2, d3Var2, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        z16 = z15;
        i25 = i16 & 8;
        if (i25 != 0) {
            if ((i15 & 3072) == 0) {
                lVar2 = lVar;
                if (rVarH.W(lVar2)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i17 |= i26;
            }
            if ((i15 & 24576) == 0) {
                if ((i16 & 16) == 0) {
                    t0VarB = t0Var;
                    if (rVarH.W(t0VarB)) {
                        i46 = 16384;
                    }
                    i17 |= i46;
                } else {
                    t0VarB = t0Var;
                }
                i46 = PKIFailureInfo.certRevoked;
                i17 |= i46;
            } else {
                t0VarB = t0Var;
            }
            if ((196608 & i15) != 0) {
                i17 |= ((i16 & 32) == 0 || !rVarH.W(y2Var)) ? PKIFailureInfo.notAuthorized : PKIFailureInfo.unsupportedVersion;
            }
            i27 = i16 & 64;
            if (i27 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.W(borderStroke)) {
                    i28 = PKIFailureInfo.badCertTemplate;
                } else {
                    i28 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i28;
            }
            if ((i15 & 12582912) != 0) {
                i17 |= ((i16 & 128) == 0 || !rVarH.W(r0Var)) ? 4194304 : 8388608;
            }
            i29 = i16 & 256;
            if (i29 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.W(d3Var)) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i17 |= i35;
                }
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(qVar)) {
                        i45 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i45 = 268435456;
                    }
                    i17 |= i45;
                }
                i36 = i17;
                if ((i36 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i36 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i47 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                        } else {
                            z19 = z16;
                        }
                        if (i25 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar2;
                        }
                        if ((i16 & 16) != 0) {
                            i36 &= -57345;
                            t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                        }
                        if ((i16 & 32) != 0) {
                            small = m2.f1788a.b(rVarH, 6).getSmall();
                            i36 &= -458753;
                        } else {
                            small = y2Var;
                        }
                        i37 = i36;
                        if (i27 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if ((i16 & 128) != 0) {
                            r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                            rVar3 = rVarH;
                            i37 &= -29360129;
                        } else {
                            rVar3 = rVarH;
                            r0VarA = r0Var;
                        }
                        int i411113 = i37;
                        if (i29 != 0) {
                            d3VarC = s0.f1901a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        y2Var3 = small;
                        borderStroke4 = borderStroke3;
                        z25 = z19;
                        mVar2 = mVar4;
                        i38 = i411113;
                    } else {
                        if (i47 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                        } else {
                            z19 = z16;
                        }
                        if (i25 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar2;
                        }
                        if ((i16 & 16) != 0) {
                            i36 &= -57345;
                            t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                        }
                        if ((i16 & 32) != 0) {
                            small = m2.f1788a.b(rVarH, 6).getSmall();
                            i36 &= -458753;
                        } else {
                            small = y2Var;
                        }
                        i37 = i36;
                        if (i27 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if ((i16 & 128) != 0) {
                            r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                            rVar3 = rVarH;
                            i37 &= -29360129;
                        } else {
                            rVar3 = rVarH;
                            r0VarA = r0Var;
                        }
                        int i411114 = i37;
                        if (i29 != 0) {
                            d3VarC = s0.f1901a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        y2Var3 = small;
                        borderStroke4 = borderStroke3;
                        z25 = z19;
                        mVar2 = mVar4;
                        i38 = i411114;
                    }
                    rVar3.y();
                    if (t.k()) {
                        t.o(-1084573925, i38, -1, "androidx.compose.material.Button (Button.kt:105)");
                    }
                    if (lVar4 == null) {
                        rVar3.X(497721888);
                        objE2 = rVar3.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = k.a();
                            rVar3.v(objE2);
                        }
                        lVar5 = (l) objE2;
                        rVar3.R();
                    } else {
                        rVar3.X(1401528215);
                        rVar3.R();
                        lVar5 = lVar4;
                    }
                    i39 = i38 >> 6;
                    int i411115 = (i39 & 14) | ((i38 >> 18) & 112);
                    final f6 f6VarB13 = r0VarA.b(z25, rVar3, i411115);
                    objE = rVar3.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new er.l() { // from class: a2.u0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Function0.h((n4.i0) obj);
                            }
                        };
                        rVar3.v(objE);
                    }
                    m mVarD13 = v.d(mVar2, false, (er.l) objE, 1, null);
                    long jM20unboximpl13 = r0VarA.a(z25, rVar3, i411115).getValue().m20unboximpl();
                    long jM9copywmQWz5c$default13 = Color.m9copywmQWz5c$default(g(f6VarB13), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    if (t0VarB == null) {
                        rVar3.X(498128545);
                        rVar3.R();
                        f6VarA = null;
                    } else {
                        rVar3.X(1401541984);
                        f6VarA = t0VarB.a(z25, lVar5, rVar3, i39 & 910);
                        rVar3.R();
                    }
                    if (f6VarA != null) {
                        fN = f6VarA.getValue().getValue();
                    } else {
                        fN = h.n(0);
                    }
                    r rVar16 = rVar3;
                    f5.g(aVar, mVarD13, z25, y2Var3, jM20unboximpl13, jM9copywmQWz5c$default13, borderStroke4, fN, lVar5, y2.m.d(-20345758, true, new p() { // from class: a2.v0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return Function0.i(f6VarB13, d3VarC, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVar3, 54), rVar16, (i38 & 14) | 805306368 | (i38 & 896) | (i39 & 7168) | (i38 & 3670016), 0);
                    rVar2 = rVar16;
                    if (t.k()) {
                        t.n();
                    }
                    r0Var2 = r0VarA;
                    t0Var2 = t0VarB;
                    y2Var2 = y2Var3;
                    borderStroke2 = borderStroke4;
                    lVar3 = lVar4;
                    d3Var2 = d3VarC;
                    mVar3 = mVar2;
                    z18 = z25;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    y2Var2 = y2Var;
                    borderStroke2 = borderStroke;
                    mVar3 = mVar2;
                    z18 = z16;
                    lVar3 = lVar2;
                    t0Var2 = t0VarB;
                    r0Var2 = r0Var;
                    d3Var2 = d3Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.w0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return Function0.l(aVar, mVar3, z18, lVar3, t0Var2, y2Var2, borderStroke2, r0Var2, d3Var2, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 100663296;
            if ((i15 & 805306368) == 0) {
                if (rVarH.G(qVar)) {
                    i45 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i45 = 268435456;
                }
                i17 |= i45;
            }
            i36 = i17;
            if ((i36 & 306783379) != 306783378) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i36 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i47 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                    } else {
                        z19 = z16;
                    }
                    if (i25 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar2;
                    }
                    if ((i16 & 16) != 0) {
                        i36 &= -57345;
                        t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                    }
                    if ((i16 & 32) != 0) {
                        small = m2.f1788a.b(rVarH, 6).getSmall();
                        i36 &= -458753;
                    } else {
                        small = y2Var;
                    }
                    i37 = i36;
                    if (i27 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if ((i16 & 128) != 0) {
                        r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                        rVar3 = rVarH;
                        i37 &= -29360129;
                    } else {
                        rVar3 = rVarH;
                        r0VarA = r0Var;
                    }
                    int i411116 = i37;
                    if (i29 != 0) {
                        d3VarC = s0.f1901a.c();
                    } else {
                        d3VarC = d3Var;
                    }
                    y2Var3 = small;
                    borderStroke4 = borderStroke3;
                    z25 = z19;
                    mVar2 = mVar4;
                    i38 = i411116;
                } else {
                    if (i47 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                    } else {
                        z19 = z16;
                    }
                    if (i25 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar2;
                    }
                    if ((i16 & 16) != 0) {
                        i36 &= -57345;
                        t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                    }
                    if ((i16 & 32) != 0) {
                        small = m2.f1788a.b(rVarH, 6).getSmall();
                        i36 &= -458753;
                    } else {
                        small = y2Var;
                    }
                    i37 = i36;
                    if (i27 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if ((i16 & 128) != 0) {
                        r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                        rVar3 = rVarH;
                        i37 &= -29360129;
                    } else {
                        rVar3 = rVarH;
                        r0VarA = r0Var;
                    }
                    int i411117 = i37;
                    if (i29 != 0) {
                        d3VarC = s0.f1901a.c();
                    } else {
                        d3VarC = d3Var;
                    }
                    y2Var3 = small;
                    borderStroke4 = borderStroke3;
                    z25 = z19;
                    mVar2 = mVar4;
                    i38 = i411117;
                }
                rVar3.y();
                if (t.k()) {
                    t.o(-1084573925, i38, -1, "androidx.compose.material.Button (Button.kt:105)");
                }
                if (lVar4 == null) {
                    rVar3.X(497721888);
                    objE2 = rVar3.E();
                    if (objE2 == r.INSTANCE.a()) {
                        objE2 = k.a();
                        rVar3.v(objE2);
                    }
                    lVar5 = (l) objE2;
                    rVar3.R();
                } else {
                    rVar3.X(1401528215);
                    rVar3.R();
                    lVar5 = lVar4;
                }
                i39 = i38 >> 6;
                int i411118 = (i39 & 14) | ((i38 >> 18) & 112);
                final f6 f6VarB14 = r0VarA.b(z25, rVar3, i411118);
                objE = rVar3.E();
                if (objE == r.INSTANCE.a()) {
                    objE = new er.l() { // from class: a2.u0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return Function0.h((n4.i0) obj);
                        }
                    };
                    rVar3.v(objE);
                }
                m mVarD14 = v.d(mVar2, false, (er.l) objE, 1, null);
                long jM20unboximpl14 = r0VarA.a(z25, rVar3, i411118).getValue().m20unboximpl();
                long jM9copywmQWz5c$default14 = Color.m9copywmQWz5c$default(g(f6VarB14), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                if (t0VarB == null) {
                    rVar3.X(498128545);
                    rVar3.R();
                    f6VarA = null;
                } else {
                    rVar3.X(1401541984);
                    f6VarA = t0VarB.a(z25, lVar5, rVar3, i39 & 910);
                    rVar3.R();
                }
                if (f6VarA != null) {
                    fN = f6VarA.getValue().getValue();
                } else {
                    fN = h.n(0);
                }
                r rVar17 = rVar3;
                f5.g(aVar, mVarD14, z25, y2Var3, jM20unboximpl14, jM9copywmQWz5c$default14, borderStroke4, fN, lVar5, y2.m.d(-20345758, true, new p() { // from class: a2.v0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return Function0.i(f6VarB14, d3VarC, qVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar3, 54), rVar17, (i38 & 14) | 805306368 | (i38 & 896) | (i39 & 7168) | (i38 & 3670016), 0);
                rVar2 = rVar17;
                if (t.k()) {
                    t.n();
                }
                r0Var2 = r0VarA;
                t0Var2 = t0VarB;
                y2Var2 = y2Var3;
                borderStroke2 = borderStroke4;
                lVar3 = lVar4;
                d3Var2 = d3VarC;
                mVar3 = mVar2;
                z18 = z25;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                y2Var2 = y2Var;
                borderStroke2 = borderStroke;
                mVar3 = mVar2;
                z18 = z16;
                lVar3 = lVar2;
                t0Var2 = t0VarB;
                r0Var2 = r0Var;
                d3Var2 = d3Var;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.w0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return Function0.l(aVar, mVar3, z18, lVar3, t0Var2, y2Var2, borderStroke2, r0Var2, d3Var2, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        lVar2 = lVar;
        if ((i15 & 24576) == 0) {
            if ((i16 & 16) == 0) {
                t0VarB = t0Var;
                if (rVarH.W(t0VarB)) {
                    i46 = 16384;
                }
                i17 |= i46;
            } else {
                t0VarB = t0Var;
            }
            i46 = PKIFailureInfo.certRevoked;
            i17 |= i46;
        } else {
            t0VarB = t0Var;
        }
        if ((196608 & i15) != 0) {
            i17 |= ((i16 & 32) == 0 || !rVarH.W(y2Var)) ? PKIFailureInfo.notAuthorized : PKIFailureInfo.unsupportedVersion;
        }
        i27 = i16 & 64;
        if (i27 != 0) {
            i17 |= 1572864;
        } else if ((i15 & 1572864) == 0) {
            if (rVarH.W(borderStroke)) {
                i28 = PKIFailureInfo.badCertTemplate;
            } else {
                i28 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i28;
        }
        if ((i15 & 12582912) != 0) {
            i17 |= ((i16 & 128) == 0 || !rVarH.W(r0Var)) ? 4194304 : 8388608;
        }
        i29 = i16 & 256;
        if (i29 != 0) {
            if ((i15 & 100663296) == 0) {
                if (rVarH.W(d3Var)) {
                    i35 = 67108864;
                } else {
                    i35 = 33554432;
                }
                i17 |= i35;
            }
            if ((i15 & 805306368) == 0) {
                if (rVarH.G(qVar)) {
                    i45 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i45 = 268435456;
                }
                i17 |= i45;
            }
            i36 = i17;
            if ((i36 & 306783379) != 306783378) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i36 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i47 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                    } else {
                        z19 = z16;
                    }
                    if (i25 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar2;
                    }
                    if ((i16 & 16) != 0) {
                        i36 &= -57345;
                        t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                    }
                    if ((i16 & 32) != 0) {
                        small = m2.f1788a.b(rVarH, 6).getSmall();
                        i36 &= -458753;
                    } else {
                        small = y2Var;
                    }
                    i37 = i36;
                    if (i27 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if ((i16 & 128) != 0) {
                        r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                        rVar3 = rVarH;
                        i37 &= -29360129;
                    } else {
                        rVar3 = rVarH;
                        r0VarA = r0Var;
                    }
                    int i411119 = i37;
                    if (i29 != 0) {
                        d3VarC = s0.f1901a.c();
                    } else {
                        d3VarC = d3Var;
                    }
                    y2Var3 = small;
                    borderStroke4 = borderStroke3;
                    z25 = z19;
                    mVar2 = mVar4;
                    i38 = i411119;
                } else {
                    if (i47 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                    } else {
                        z19 = z16;
                    }
                    if (i25 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar2;
                    }
                    if ((i16 & 16) != 0) {
                        i36 &= -57345;
                        t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                    }
                    if ((i16 & 32) != 0) {
                        small = m2.f1788a.b(rVarH, 6).getSmall();
                        i36 &= -458753;
                    } else {
                        small = y2Var;
                    }
                    i37 = i36;
                    if (i27 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if ((i16 & 128) != 0) {
                        r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                        rVar3 = rVarH;
                        i37 &= -29360129;
                    } else {
                        rVar3 = rVarH;
                        r0VarA = r0Var;
                    }
                    int i4111110 = i37;
                    if (i29 != 0) {
                        d3VarC = s0.f1901a.c();
                    } else {
                        d3VarC = d3Var;
                    }
                    y2Var3 = small;
                    borderStroke4 = borderStroke3;
                    z25 = z19;
                    mVar2 = mVar4;
                    i38 = i4111110;
                }
                rVar3.y();
                if (t.k()) {
                    t.o(-1084573925, i38, -1, "androidx.compose.material.Button (Button.kt:105)");
                }
                if (lVar4 == null) {
                    rVar3.X(497721888);
                    objE2 = rVar3.E();
                    if (objE2 == r.INSTANCE.a()) {
                        objE2 = k.a();
                        rVar3.v(objE2);
                    }
                    lVar5 = (l) objE2;
                    rVar3.R();
                } else {
                    rVar3.X(1401528215);
                    rVar3.R();
                    lVar5 = lVar4;
                }
                i39 = i38 >> 6;
                int i4111111 = (i39 & 14) | ((i38 >> 18) & 112);
                final f6 f6VarB15 = r0VarA.b(z25, rVar3, i4111111);
                objE = rVar3.E();
                if (objE == r.INSTANCE.a()) {
                    objE = new er.l() { // from class: a2.u0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return Function0.h((n4.i0) obj);
                        }
                    };
                    rVar3.v(objE);
                }
                m mVarD15 = v.d(mVar2, false, (er.l) objE, 1, null);
                long jM20unboximpl15 = r0VarA.a(z25, rVar3, i4111111).getValue().m20unboximpl();
                long jM9copywmQWz5c$default15 = Color.m9copywmQWz5c$default(g(f6VarB15), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                if (t0VarB == null) {
                    rVar3.X(498128545);
                    rVar3.R();
                    f6VarA = null;
                } else {
                    rVar3.X(1401541984);
                    f6VarA = t0VarB.a(z25, lVar5, rVar3, i39 & 910);
                    rVar3.R();
                }
                if (f6VarA != null) {
                    fN = f6VarA.getValue().getValue();
                } else {
                    fN = h.n(0);
                }
                r rVar18 = rVar3;
                f5.g(aVar, mVarD15, z25, y2Var3, jM20unboximpl15, jM9copywmQWz5c$default15, borderStroke4, fN, lVar5, y2.m.d(-20345758, true, new p() { // from class: a2.v0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return Function0.i(f6VarB15, d3VarC, qVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar3, 54), rVar18, (i38 & 14) | 805306368 | (i38 & 896) | (i39 & 7168) | (i38 & 3670016), 0);
                rVar2 = rVar18;
                if (t.k()) {
                    t.n();
                }
                r0Var2 = r0VarA;
                t0Var2 = t0VarB;
                y2Var2 = y2Var3;
                borderStroke2 = borderStroke4;
                lVar3 = lVar4;
                d3Var2 = d3VarC;
                mVar3 = mVar2;
                z18 = z25;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                y2Var2 = y2Var;
                borderStroke2 = borderStroke;
                mVar3 = mVar2;
                z18 = z16;
                lVar3 = lVar2;
                t0Var2 = t0VarB;
                r0Var2 = r0Var;
                d3Var2 = d3Var;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.w0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return Function0.l(aVar, mVar3, z18, lVar3, t0Var2, y2Var2, borderStroke2, r0Var2, d3Var2, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 100663296;
        if ((i15 & 805306368) == 0) {
            if (rVarH.G(qVar)) {
                i45 = PKIFailureInfo.duplicateCertReq;
            } else {
                i45 = 268435456;
            }
            i17 |= i45;
        }
        i36 = i17;
        if ((i36 & 306783379) != 306783378) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i36 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i47 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    z19 = true;
                } else {
                    z19 = z16;
                }
                if (i25 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar2;
                }
                if ((i16 & 16) != 0) {
                    i36 &= -57345;
                    t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                }
                if ((i16 & 32) != 0) {
                    small = m2.f1788a.b(rVarH, 6).getSmall();
                    i36 &= -458753;
                } else {
                    small = y2Var;
                }
                i37 = i36;
                if (i27 != 0) {
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                }
                if ((i16 & 128) != 0) {
                    r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                    rVar3 = rVarH;
                    i37 &= -29360129;
                } else {
                    rVar3 = rVarH;
                    r0VarA = r0Var;
                }
                int i4111112 = i37;
                if (i29 != 0) {
                    d3VarC = s0.f1901a.c();
                } else {
                    d3VarC = d3Var;
                }
                y2Var3 = small;
                borderStroke4 = borderStroke3;
                z25 = z19;
                mVar2 = mVar4;
                i38 = i4111112;
            } else {
                if (i47 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    z19 = true;
                } else {
                    z19 = z16;
                }
                if (i25 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar2;
                }
                if ((i16 & 16) != 0) {
                    i36 &= -57345;
                    t0VarB = s0.f1901a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 196608, 31);
                }
                if ((i16 & 32) != 0) {
                    small = m2.f1788a.b(rVarH, 6).getSmall();
                    i36 &= -458753;
                } else {
                    small = y2Var;
                }
                i37 = i36;
                if (i27 != 0) {
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                }
                if ((i16 & 128) != 0) {
                    r0VarA = s0.f1901a.a(0L, 0L, 0L, 0L, rVarH, 24576, 15);
                    rVar3 = rVarH;
                    i37 &= -29360129;
                } else {
                    rVar3 = rVarH;
                    r0VarA = r0Var;
                }
                int i4111113 = i37;
                if (i29 != 0) {
                    d3VarC = s0.f1901a.c();
                } else {
                    d3VarC = d3Var;
                }
                y2Var3 = small;
                borderStroke4 = borderStroke3;
                z25 = z19;
                mVar2 = mVar4;
                i38 = i4111113;
            }
            rVar3.y();
            if (t.k()) {
                t.o(-1084573925, i38, -1, "androidx.compose.material.Button (Button.kt:105)");
            }
            if (lVar4 == null) {
                rVar3.X(497721888);
                objE2 = rVar3.E();
                if (objE2 == r.INSTANCE.a()) {
                    objE2 = k.a();
                    rVar3.v(objE2);
                }
                lVar5 = (l) objE2;
                rVar3.R();
            } else {
                rVar3.X(1401528215);
                rVar3.R();
                lVar5 = lVar4;
            }
            i39 = i38 >> 6;
            int i4111114 = (i39 & 14) | ((i38 >> 18) & 112);
            final f6 f6VarB16 = r0VarA.b(z25, rVar3, i4111114);
            objE = rVar3.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: a2.u0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.h((n4.i0) obj);
                    }
                };
                rVar3.v(objE);
            }
            m mVarD16 = v.d(mVar2, false, (er.l) objE, 1, null);
            long jM20unboximpl16 = r0VarA.a(z25, rVar3, i4111114).getValue().m20unboximpl();
            long jM9copywmQWz5c$default16 = Color.m9copywmQWz5c$default(g(f6VarB16), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
            if (t0VarB == null) {
                rVar3.X(498128545);
                rVar3.R();
                f6VarA = null;
            } else {
                rVar3.X(1401541984);
                f6VarA = t0VarB.a(z25, lVar5, rVar3, i39 & 910);
                rVar3.R();
            }
            if (f6VarA != null) {
                fN = f6VarA.getValue().getValue();
            } else {
                fN = h.n(0);
            }
            r rVar19 = rVar3;
            f5.g(aVar, mVarD16, z25, y2Var3, jM20unboximpl16, jM9copywmQWz5c$default16, borderStroke4, fN, lVar5, y2.m.d(-20345758, true, new p() { // from class: a2.v0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.i(f6VarB16, d3VarC, qVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar3, 54), rVar19, (i38 & 14) | 805306368 | (i38 & 896) | (i39 & 7168) | (i38 & 3670016), 0);
            rVar2 = rVar19;
            if (t.k()) {
                t.n();
            }
            r0Var2 = r0VarA;
            t0Var2 = t0VarB;
            y2Var2 = y2Var3;
            borderStroke2 = borderStroke4;
            lVar3 = lVar4;
            d3Var2 = d3VarC;
            mVar3 = mVar2;
            z18 = z25;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            y2Var2 = y2Var;
            borderStroke2 = borderStroke;
            mVar3 = mVar2;
            z18 = z16;
            lVar3 = lVar2;
            t0Var2 = t0VarB;
            r0Var2 = r0Var;
            d3Var2 = d3Var;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a2.w0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.l(aVar, mVar3, z18, lVar3, t0Var2, y2Var2, borderStroke2, r0Var2, d3Var2, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final long g(f6<Color> f6Var) {
        return f6Var.getValue().m20unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(n4.i0 i0Var) {
        f0.r0(i0Var, n4.l.INSTANCE.a());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(f6 f6Var, final d3 d3Var, final q qVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-20345758, i15, -1, "androidx.compose.material.Button.<anonymous> (Button.kt:120)");
            }
            d0.c(l1.c().d(Float.valueOf(Color.m12getAlphaimpl(g(f6Var)))), y2.m.d(-869936862, true, new p() { // from class: a2.x0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.j(d3Var, qVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, c4.f122821i | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(final d3 d3Var, final q qVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-869936862, i15, -1, "androidx.compose.material.Button.<anonymous>.<anonymous> (Button.kt:121)");
            }
            j5.e(m2.f1788a.c(rVar, 6).getButton(), y2.m.d(165539859, true, new p() { // from class: a2.y0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.k(d3Var, qVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(d3 d3Var, q qVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(165539859, i15, -1, "androidx.compose.material.Button.<anonymous>.<anonymous>.<anonymous> (Button.kt:122)");
            }
            m.Companion companion = m.INSTANCE;
            s0 s0Var = s0.f1901a;
            m mVarL = a3.l(d.a(companion, s0Var.e(), s0Var.d()), d3Var);
            w0 w0VarB = m3.b(i.f39152a.e(), c.INSTANCE.i(), rVar, 54);
            int iA = p076m2.m.a(rVar, 0);
            e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarL);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            p<androidx.compose.ui.node.c, Integer, i0> pVarC = companion2.c();
            if (rVarC.getInserting() || !fr.t.c(rVarC.E(), Integer.valueOf(iA))) {
                rVarC.v(Integer.valueOf(iA));
                rVarC.j(Integer.valueOf(iA), pVarC);
            }
            n6.i(rVarC, mVarE, companion2.e());
            qVar.w(q3.f39261a, rVar, 6);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(a aVar, m mVar, boolean z15, l lVar, t0 t0Var, y2 y2Var, BorderStroke borderStroke, r0 r0Var, d3 d3Var, q qVar, int i15, int i16, r rVar, int i17) {
        f(aVar, mVar, z15, lVar, t0Var, y2Var, borderStroke, r0Var, d3Var, qVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    public static final void m(a<i0> aVar, m mVar, boolean z15, l lVar, t0 t0Var, y2 y2Var, BorderStroke borderStroke, r0 r0Var, d3 d3Var, q<? super p3, ? super r, ? super Integer, i0> qVar, r rVar, int i15, int i16) {
        m mVar2 = (i16 & 2) != 0 ? m.INSTANCE : mVar;
        boolean z16 = (i16 & 4) != 0 ? true : z15;
        l lVar2 = (i16 & 8) != 0 ? null : lVar;
        t0 t0Var2 = (i16 & 16) != 0 ? null : t0Var;
        y2 small = (i16 & 32) != 0 ? m2.f1788a.b(rVar, 6).getSmall() : y2Var;
        BorderStroke borderStroke2 = (i16 & 64) == 0 ? borderStroke : null;
        r0 r0VarG = (i16 & 128) != 0 ? s0.f1901a.g(0L, 0L, 0L, rVar, 3072, 7) : r0Var;
        d3 d3VarF = (i16 & 256) != 0 ? s0.f1901a.f() : d3Var;
        if (t.k()) {
            t.o(724562088, i15, -1, "androidx.compose.material.TextButton (Button.kt:238)");
        }
        f(aVar, mVar2, z16, lVar2, t0Var2, small, borderStroke2, r0VarG, d3VarF, qVar, rVar, i15 & 2147483646, 0);
        if (t.k()) {
            t.n();
        }
    }
}
