package p046f2;

import androidx.compose.ui.platform.g1;
import c5.d;
import c5.h;
import er.a;
import er.l;
import er.p;
import h2.o;
import l2.f0;
import l2.l0;
import l2.m;
import m3.e;
import m3.k;
import n3.a3;
import n4.ProgressBarRangeInfo;
import n4.v;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p3.Stroke;
import p3.f;
import u0.CubicBezierEasing;
import u0.q0;
import u0.s0;
import u0.x0;
import u0.z0;
import w0.q2;
import w0.z;

/* JADX INFO: renamed from: f2.hh, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u001ae\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a;\u0010\u0015\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aK\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001d\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a3\u0010\u001f\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010\u001e\"\u001a\u0010$\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u001a\u0010'\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#\"\u001a\u0010*\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#\"\u001a\u0010-\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#\"\u001a\u00103\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u001a\u00106\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00102\"\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0001078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u00109\"\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0001078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u00109\"\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0001078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u00109¨\u0006?"}, d2 = {"Lkotlin/Function0;", "", "progress", "Lf3/m;", "modifier", "Landroidx/compose/ui/graphics/Color;", "color", "trackColor", "Ln3/a3;", "strokeCap", "Lc5/h;", "gapSize", "Lkotlin/Function1;", "Lp3/f;", "Loq/i0;", "drawStopIndicator", "m", "(Ler/a;Lf3/m;JJIFLer/l;Lm2/r;II)V", "startFraction", "endFraction", "strokeWidth", "w", "(Lp3/f;FFJFI)V", "j", "(Lf3/m;JFJIFLm2/r;II)V", "startAngle", "sweep", "Lp3/k;", "stroke", "u", "(Lp3/f;FFJLp3/k;)V", "v", "a", "F", "getLinearIndicatorWidth", "()F", "LinearIndicatorWidth", "b", "getLinearIndicatorHeight", "LinearIndicatorHeight", "c", "A", "StopIndicatorTrailingSpace", "d", "getCircularIndicatorDiameter", "CircularIndicatorDiameter", "Lu0/a0;", "e", "Lu0/a0;", "getLinearIndeterminateProgressEasing", "()Lu0/a0;", "LinearIndeterminateProgressEasing", "f", "getCircularProgressEasing", "CircularProgressEasing", "Lu0/q0;", "x", "()Lu0/q0;", "circularIndeterminateGlobalRotationAnimationSpec", "z", "circularIndeterminateRotationAnimationSpec", "y", "circularIndeterminateProgressAnimationSpec", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class C6457hh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f56094a = h.n(240);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f56095b = f0.f114495a.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f56096c = h.n(6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f56097d = m.f114914a.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final CubicBezierEasing f56098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final CubicBezierEasing f56099f;

    static {
        l0 l0Var = l0.f114877a;
        f56098e = l0Var.a();
        f56099f = l0Var.c();
    }

    public static final float A() {
        return f56096c;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0139  */
    /* JADX WARN: Code duplicated, block: B:106:0x0200  */
    /* JADX WARN: Code duplicated, block: B:107:0x0202  */
    /* JADX WARN: Code duplicated, block: B:110:0x020b  */
    /* JADX WARN: Code duplicated, block: B:111:0x020d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0215  */
    /* JADX WARN: Code duplicated, block: B:115:0x0217  */
    /* JADX WARN: Code duplicated, block: B:118:0x022b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0231  */
    /* JADX WARN: Code duplicated, block: B:126:0x0246  */
    /* JADX WARN: Code duplicated, block: B:128:0x024c  */
    /* JADX WARN: Code duplicated, block: B:134:0x025d  */
    /* JADX WARN: Code duplicated, block: B:138:0x026d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0291  */
    /* JADX WARN: Code duplicated, block: B:143:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    /* JADX WARN: Code duplicated, block: B:96:0x0119  */
    /* JADX WARN: Code duplicated, block: B:98:0x0122  */
    public static final void j(f3.m mVar, long j15, float f15, long j16, int i15, float f16, r rVar, final int i16, final int i17) {
        f3.m mVar2;
        int i18;
        long jC;
        float fG;
        long j17;
        int i19;
        int iD;
        int i25;
        int i26;
        float f17;
        int i27;
        boolean z15;
        r rVar2;
        final f3.m mVar3;
        final long j18;
        final float f18;
        final float f19;
        final int i28;
        final long j19;
        d5 d5VarM;
        f3.m mVar4;
        long jE;
        final float f25;
        final int i29;
        final Stroke stroke;
        final f6<Float> f6VarC;
        final f6<Float> f6VarC2;
        final f6<Float> f6VarC3;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean zW;
        Object objE;
        final long j25;
        final long j26;
        final float f26;
        int i35;
        r rVarH = rVar.h(333154241);
        int i36 = i17 & 1;
        if (i36 != 0) {
            i18 = i16 | 6;
            mVar2 = mVar;
        } else if ((i16 & 6) == 0) {
            mVar2 = mVar;
            i18 = (rVarH.W(mVar2) ? 4 : 2) | i16;
        } else {
            mVar2 = mVar;
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            jC = j15;
            i18 |= ((i17 & 2) == 0 && rVarH.d(jC)) ? 32 : 16;
        } else {
            jC = j15;
        }
        int i37 = i17 & 4;
        if (i37 == 0) {
            if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                fG = f15;
                i18 |= rVarH.b(fG) ? 256 : 128;
            }
            if ((i16 & 3072) == 0) {
                j17 = j16;
                if ((i17 & 8) == 0 || !rVarH.d(j17)) {
                    i35 = 1024;
                } else {
                    i35 = 2048;
                }
                i18 |= i35;
            } else {
                j17 = j16;
            }
            i19 = i17 & 16;
            if (i19 != 0) {
                if ((i16 & 24576) == 0) {
                    iD = i15;
                    if (rVarH.c(iD)) {
                        i25 = 16384;
                    } else {
                        i25 = PKIFailureInfo.certRevoked;
                    }
                    i18 |= i25;
                }
                i26 = i17 & 32;
                if (i26 != 0) {
                    i18 |= 196608;
                    f17 = f16;
                } else {
                    f17 = f16;
                    if ((i16 & 196608) == 0) {
                        if (rVarH.b(f17)) {
                            i27 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i27 = PKIFailureInfo.notAuthorized;
                        }
                        i18 |= i27;
                    }
                }
                if ((i18 & 74899) != 74898) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i18 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0 || rVarH.Q()) {
                        if (i36 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 2) != 0) {
                            jC = xg.f58287a.c(rVarH, 6);
                            i18 &= -113;
                        }
                        if (i37 != 0) {
                            fG = xg.f58287a.g();
                        }
                        if ((i17 & 8) != 0) {
                            jE = xg.f58287a.e(rVarH, 6);
                            i18 &= -7169;
                        } else {
                            jE = j17;
                        }
                        if (i19 != 0) {
                            iD = xg.f58287a.d();
                        }
                        if (i26 != 0) {
                            f25 = xg.f58287a.f();
                        } else {
                            f25 = f17;
                        }
                        i29 = iD;
                    } else {
                        rVarH.O();
                        if ((i17 & 2) != 0) {
                            i18 &= -113;
                        }
                        if ((i17 & 8) != 0) {
                            i18 &= -7169;
                        }
                        mVar4 = mVar2;
                        f25 = f17;
                        i29 = iD;
                        jE = j17;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(333154241, i18, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:634)");
                    }
                    stroke = new Stroke(((d) rVarH.N(g1.f())).l2(fG), 0.0f, i29, 0, null, 26, null);
                    s0 s0VarG = x0.g(null, rVarH, 0, 1);
                    q0<Float> q0VarX = x();
                    int i38 = s0.f193856f;
                    int i39 = q0.f193832d;
                    f6VarC = x0.c(s0VarG, 0.0f, 1080.0f, q0VarX, null, rVarH, i38 | 432 | (i39 << 9), 8);
                    f6VarC2 = x0.c(s0VarG, 0.0f, 360.0f, z(), null, rVarH, i38 | 432 | (i39 << 9), 8);
                    f6VarC3 = x0.c(s0VarG, 0.1f, 0.87f, y(), null, rVarH, i38 | 432 | (i39 << 9), 8);
                    rVar2 = rVarH;
                    f3.m mVarT = androidx.compose.foundation.layout.d.t(q2.c(mVar4), f56097d);
                    boolean zW2 = rVar2.W(f6VarC3);
                    f3.m mVar5 = mVar4;
                    if ((57344 & i18) == 16384) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z19 = z16 | zW2;
                    if ((458752 & i18) == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z25 = z19 | z17;
                    if ((i18 & 896) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zW = z25 | z18 | rVar2.W(f6VarC) | rVar2.W(f6VarC2) | ((((i18 & 7168) ^ 3072) <= 2048 && rVar2.d(jE)) || (i18 & 3072) == 2048) | rVar2.G(stroke) | ((((i18 & 112) ^ 48) <= 32 && rVar2.d(jC)) || (i18 & 48) == 32);
                    objE = rVar2.E();
                    if (!zW || objE == r.INSTANCE.a()) {
                        j25 = jE;
                        j26 = jC;
                        f26 = fG;
                        objE = new l() { // from class: f2.yg
                            @Override // er.l
                            public final Object b(Object obj) {
                                return C6457hh.k(f6VarC3, i29, f25, f26, f6VarC, f6VarC2, j25, stroke, j26, (f) obj);
                            }
                        };
                        rVar2.v(objE);
                    } else {
                        j25 = jE;
                        j26 = jC;
                        f26 = fG;
                    }
                    z.b(mVarT, (l) objE, rVar2, 0);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar5;
                    i28 = i29;
                    f18 = f25;
                    f19 = f26;
                    j19 = j25;
                    j18 = j26;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar3 = mVar2;
                    j18 = jC;
                    f18 = f17;
                    f19 = fG;
                    i28 = iD;
                    j19 = j17;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.zg
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6457hh.l(mVar3, j18, f19, j19, i28, f18, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 24576;
            iD = i15;
            i26 = i17 & 32;
            if (i26 != 0) {
                i18 |= 196608;
                f17 = f16;
            } else {
                f17 = f16;
                if ((i16 & 196608) == 0) {
                    if (rVarH.b(f17)) {
                        i27 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i27 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i27;
                }
            }
            if ((i18 & 74899) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i18 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i36 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 2) != 0) {
                        jC = xg.f58287a.c(rVarH, 6);
                        i18 &= -113;
                    }
                    if (i37 != 0) {
                        fG = xg.f58287a.g();
                    }
                    if ((i17 & 8) != 0) {
                        jE = xg.f58287a.e(rVarH, 6);
                        i18 &= -7169;
                    } else {
                        jE = j17;
                    }
                    if (i19 != 0) {
                        iD = xg.f58287a.d();
                    }
                    if (i26 != 0) {
                        f25 = xg.f58287a.f();
                    } else {
                        f25 = f17;
                    }
                    i29 = iD;
                } else {
                    if (i36 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 2) != 0) {
                        jC = xg.f58287a.c(rVarH, 6);
                        i18 &= -113;
                    }
                    if (i37 != 0) {
                        fG = xg.f58287a.g();
                    }
                    if ((i17 & 8) != 0) {
                        jE = xg.f58287a.e(rVarH, 6);
                        i18 &= -7169;
                    } else {
                        jE = j17;
                    }
                    if (i19 != 0) {
                        iD = xg.f58287a.d();
                    }
                    if (i26 != 0) {
                        f25 = xg.f58287a.f();
                    } else {
                        f25 = f17;
                    }
                    i29 = iD;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(333154241, i18, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:634)");
                }
                stroke = new Stroke(((d) rVarH.N(g1.f())).l2(fG), 0.0f, i29, 0, null, 26, null);
                s0 s0VarG2 = x0.g(null, rVarH, 0, 1);
                q0<Float> q0VarX2 = x();
                int i310 = s0.f193856f;
                int i311 = q0.f193832d;
                f6VarC = x0.c(s0VarG2, 0.0f, 1080.0f, q0VarX2, null, rVarH, i310 | 432 | (i311 << 9), 8);
                f6VarC2 = x0.c(s0VarG2, 0.0f, 360.0f, z(), null, rVarH, i310 | 432 | (i311 << 9), 8);
                f6VarC3 = x0.c(s0VarG2, 0.1f, 0.87f, y(), null, rVarH, i310 | 432 | (i311 << 9), 8);
                rVar2 = rVarH;
                f3.m mVarT2 = androidx.compose.foundation.layout.d.t(q2.c(mVar4), f56097d);
                boolean zW3 = rVar2.W(f6VarC3);
                f3.m mVar6 = mVar4;
                if ((57344 & i18) == 16384) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z110 = z16 | zW3;
                if ((458752 & i18) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z26 = z110 | z17;
                if ((i18 & 896) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zW = z26 | z18 | rVar2.W(f6VarC) | rVar2.W(f6VarC2) | ((((i18 & 7168) ^ 3072) <= 2048 && rVar2.d(jE)) || (i18 & 3072) == 2048) | rVar2.G(stroke) | ((((i18 & 112) ^ 48) <= 32 && rVar2.d(jC)) || (i18 & 48) == 32);
                objE = rVar2.E();
                if (zW) {
                    j25 = jE;
                    j26 = jC;
                    f26 = fG;
                    objE = new l() { // from class: f2.yg
                        @Override // er.l
                        public final Object b(Object obj) {
                            return C6457hh.k(f6VarC3, i29, f25, f26, f6VarC, f6VarC2, j25, stroke, j26, (f) obj);
                        }
                    };
                    rVar2.v(objE);
                } else {
                    j25 = jE;
                    j26 = jC;
                    f26 = fG;
                    objE = new l() { // from class: f2.yg
                        @Override // er.l
                        public final Object b(Object obj) {
                            return C6457hh.k(f6VarC3, i29, f25, f26, f6VarC, f6VarC2, j25, stroke, j26, (f) obj);
                        }
                    };
                    rVar2.v(objE);
                }
                z.b(mVarT2, (l) objE, rVar2, 0);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar6;
                i28 = i29;
                f18 = f25;
                f19 = f26;
                j19 = j25;
                j18 = j26;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar3 = mVar2;
                j18 = jC;
                f18 = f17;
                f19 = fG;
                i28 = iD;
                j19 = j17;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.zg
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6457hh.l(mVar3, j18, f19, j19, i28, f18, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= MLKEMEngine.KyberPolyBytes;
        fG = f15;
        if ((i16 & 3072) == 0) {
            j17 = j16;
            if ((i17 & 8) == 0) {
                i35 = 1024;
            } else {
                i35 = 1024;
            }
            i18 |= i35;
        } else {
            j17 = j16;
        }
        i19 = i17 & 16;
        if (i19 != 0) {
            if ((i16 & 24576) == 0) {
                iD = i15;
                if (rVarH.c(iD)) {
                    i25 = 16384;
                } else {
                    i25 = PKIFailureInfo.certRevoked;
                }
                i18 |= i25;
            }
            i26 = i17 & 32;
            if (i26 != 0) {
                i18 |= 196608;
                f17 = f16;
            } else {
                f17 = f16;
                if ((i16 & 196608) == 0) {
                    if (rVarH.b(f17)) {
                        i27 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i27 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i27;
                }
            }
            if ((i18 & 74899) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i18 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i36 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 2) != 0) {
                        jC = xg.f58287a.c(rVarH, 6);
                        i18 &= -113;
                    }
                    if (i37 != 0) {
                        fG = xg.f58287a.g();
                    }
                    if ((i17 & 8) != 0) {
                        jE = xg.f58287a.e(rVarH, 6);
                        i18 &= -7169;
                    } else {
                        jE = j17;
                    }
                    if (i19 != 0) {
                        iD = xg.f58287a.d();
                    }
                    if (i26 != 0) {
                        f25 = xg.f58287a.f();
                    } else {
                        f25 = f17;
                    }
                    i29 = iD;
                } else {
                    if (i36 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 2) != 0) {
                        jC = xg.f58287a.c(rVarH, 6);
                        i18 &= -113;
                    }
                    if (i37 != 0) {
                        fG = xg.f58287a.g();
                    }
                    if ((i17 & 8) != 0) {
                        jE = xg.f58287a.e(rVarH, 6);
                        i18 &= -7169;
                    } else {
                        jE = j17;
                    }
                    if (i19 != 0) {
                        iD = xg.f58287a.d();
                    }
                    if (i26 != 0) {
                        f25 = xg.f58287a.f();
                    } else {
                        f25 = f17;
                    }
                    i29 = iD;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(333154241, i18, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:634)");
                }
                stroke = new Stroke(((d) rVarH.N(g1.f())).l2(fG), 0.0f, i29, 0, null, 26, null);
                s0 s0VarG3 = x0.g(null, rVarH, 0, 1);
                q0<Float> q0VarX3 = x();
                int i312 = s0.f193856f;
                int i313 = q0.f193832d;
                f6VarC = x0.c(s0VarG3, 0.0f, 1080.0f, q0VarX3, null, rVarH, i312 | 432 | (i313 << 9), 8);
                f6VarC2 = x0.c(s0VarG3, 0.0f, 360.0f, z(), null, rVarH, i312 | 432 | (i313 << 9), 8);
                f6VarC3 = x0.c(s0VarG3, 0.1f, 0.87f, y(), null, rVarH, i312 | 432 | (i313 << 9), 8);
                rVar2 = rVarH;
                f3.m mVarT3 = androidx.compose.foundation.layout.d.t(q2.c(mVar4), f56097d);
                boolean zW4 = rVar2.W(f6VarC3);
                f3.m mVar7 = mVar4;
                if ((57344 & i18) == 16384) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z111 = z16 | zW4;
                if ((458752 & i18) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z27 = z111 | z17;
                if ((i18 & 896) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zW = z27 | z18 | rVar2.W(f6VarC) | rVar2.W(f6VarC2) | ((((i18 & 7168) ^ 3072) <= 2048 && rVar2.d(jE)) || (i18 & 3072) == 2048) | rVar2.G(stroke) | ((((i18 & 112) ^ 48) <= 32 && rVar2.d(jC)) || (i18 & 48) == 32);
                objE = rVar2.E();
                if (zW) {
                    j25 = jE;
                    j26 = jC;
                    f26 = fG;
                    objE = new l() { // from class: f2.yg
                        @Override // er.l
                        public final Object b(Object obj) {
                            return C6457hh.k(f6VarC3, i29, f25, f26, f6VarC, f6VarC2, j25, stroke, j26, (f) obj);
                        }
                    };
                    rVar2.v(objE);
                } else {
                    j25 = jE;
                    j26 = jC;
                    f26 = fG;
                    objE = new l() { // from class: f2.yg
                        @Override // er.l
                        public final Object b(Object obj) {
                            return C6457hh.k(f6VarC3, i29, f25, f26, f6VarC, f6VarC2, j25, stroke, j26, (f) obj);
                        }
                    };
                    rVar2.v(objE);
                }
                z.b(mVarT3, (l) objE, rVar2, 0);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar7;
                i28 = i29;
                f18 = f25;
                f19 = f26;
                j19 = j25;
                j18 = j26;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar3 = mVar2;
                j18 = jC;
                f18 = f17;
                f19 = fG;
                i28 = iD;
                j19 = j17;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.zg
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6457hh.l(mVar3, j18, f19, j19, i28, f18, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 24576;
        iD = i15;
        i26 = i17 & 32;
        if (i26 != 0) {
            i18 |= 196608;
            f17 = f16;
        } else {
            f17 = f16;
            if ((i16 & 196608) == 0) {
                if (rVarH.b(f17)) {
                    i27 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i27 = PKIFailureInfo.notAuthorized;
                }
                i18 |= i27;
            }
        }
        if ((i18 & 74899) != 74898) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i18 & 1)) {
            rVarH.I();
            if ((i16 & 1) != 0) {
                if (i36 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i17 & 2) != 0) {
                    jC = xg.f58287a.c(rVarH, 6);
                    i18 &= -113;
                }
                if (i37 != 0) {
                    fG = xg.f58287a.g();
                }
                if ((i17 & 8) != 0) {
                    jE = xg.f58287a.e(rVarH, 6);
                    i18 &= -7169;
                } else {
                    jE = j17;
                }
                if (i19 != 0) {
                    iD = xg.f58287a.d();
                }
                if (i26 != 0) {
                    f25 = xg.f58287a.f();
                } else {
                    f25 = f17;
                }
                i29 = iD;
            } else {
                if (i36 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i17 & 2) != 0) {
                    jC = xg.f58287a.c(rVarH, 6);
                    i18 &= -113;
                }
                if (i37 != 0) {
                    fG = xg.f58287a.g();
                }
                if ((i17 & 8) != 0) {
                    jE = xg.f58287a.e(rVarH, 6);
                    i18 &= -7169;
                } else {
                    jE = j17;
                }
                if (i19 != 0) {
                    iD = xg.f58287a.d();
                }
                if (i26 != 0) {
                    f25 = xg.f58287a.f();
                } else {
                    f25 = f17;
                }
                i29 = iD;
            }
            rVarH.y();
            if (t.k()) {
                t.o(333154241, i18, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:634)");
            }
            stroke = new Stroke(((d) rVarH.N(g1.f())).l2(fG), 0.0f, i29, 0, null, 26, null);
            s0 s0VarG4 = x0.g(null, rVarH, 0, 1);
            q0<Float> q0VarX4 = x();
            int i314 = s0.f193856f;
            int i315 = q0.f193832d;
            f6VarC = x0.c(s0VarG4, 0.0f, 1080.0f, q0VarX4, null, rVarH, i314 | 432 | (i315 << 9), 8);
            f6VarC2 = x0.c(s0VarG4, 0.0f, 360.0f, z(), null, rVarH, i314 | 432 | (i315 << 9), 8);
            f6VarC3 = x0.c(s0VarG4, 0.1f, 0.87f, y(), null, rVarH, i314 | 432 | (i315 << 9), 8);
            rVar2 = rVarH;
            f3.m mVarT4 = androidx.compose.foundation.layout.d.t(q2.c(mVar4), f56097d);
            boolean zW5 = rVar2.W(f6VarC3);
            f3.m mVar8 = mVar4;
            if ((57344 & i18) == 16384) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z112 = z16 | zW5;
            if ((458752 & i18) == 131072) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z28 = z112 | z17;
            if ((i18 & 896) == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            zW = z28 | z18 | rVar2.W(f6VarC) | rVar2.W(f6VarC2) | ((((i18 & 7168) ^ 3072) <= 2048 && rVar2.d(jE)) || (i18 & 3072) == 2048) | rVar2.G(stroke) | ((((i18 & 112) ^ 48) <= 32 && rVar2.d(jC)) || (i18 & 48) == 32);
            objE = rVar2.E();
            if (zW) {
                j25 = jE;
                j26 = jC;
                f26 = fG;
                objE = new l() { // from class: f2.yg
                    @Override // er.l
                    public final Object b(Object obj) {
                        return C6457hh.k(f6VarC3, i29, f25, f26, f6VarC, f6VarC2, j25, stroke, j26, (f) obj);
                    }
                };
                rVar2.v(objE);
            } else {
                j25 = jE;
                j26 = jC;
                f26 = fG;
                objE = new l() { // from class: f2.yg
                    @Override // er.l
                    public final Object b(Object obj) {
                        return C6457hh.k(f6VarC3, i29, f25, f26, f6VarC, f6VarC2, j25, stroke, j26, (f) obj);
                    }
                };
                rVar2.v(objE);
            }
            z.b(mVarT4, (l) objE, rVar2, 0);
            if (t.k()) {
                t.n();
            }
            mVar3 = mVar8;
            i28 = i29;
            f18 = f25;
            f19 = f26;
            j19 = j25;
            j18 = j26;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            mVar3 = mVar2;
            j18 = jC;
            f18 = f17;
            f19 = fG;
            i28 = iD;
            j19 = j17;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.zg
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return C6457hh.l(mVar3, j18, f19, j19, i28, f18, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(f6 f6Var, int i15, float f15, float f16, f6 f6Var2, f6 f6Var3, long j15, Stroke stroke, long j16, f fVar) {
        float fFloatValue = ((Number) f6Var.getValue()).floatValue() * 360.0f;
        if (!a3.e(i15, a3.INSTANCE.a()) && Float.intBitsToFloat((int) (fVar.a() & BodyPartID.bodyIdMax)) <= Float.intBitsToFloat((int) (fVar.a() >> 32))) {
            f15 = h.n(f15 + f16);
        }
        float fD2 = (f15 / ((float) (((double) fVar.d2(Float.intBitsToFloat((int) (fVar.a() >> 32)))) * 3.141592653589793d))) * 360.0f;
        float fFloatValue2 = ((Number) f6Var2.getValue()).floatValue() + ((Number) f6Var3.getValue()).floatValue();
        long jY2 = fVar.y2();
        p3.d drawContext = fVar.getDrawContext();
        long jA = drawContext.a();
        drawContext.f().q();
        try {
            drawContext.getTransform().i(fFloatValue2, jY2);
            u(fVar, fFloatValue + Math.min(fFloatValue, fD2), (360.0f - fFloatValue) - (Math.min(fFloatValue, fD2) * 2), j15, stroke);
            v(fVar, 0.0f, fFloatValue, j16, stroke);
            return i0.f148189a;
        } finally {
            drawContext.f().j();
            drawContext.g(jA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(f3.m mVar, long j15, float f15, long j16, int i15, float f16, int i16, int i17, r rVar, int i18) {
        j(mVar, j15, f15, j16, i15, f16, rVar, g4.a(i16 | 1), i17);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0125  */
    /* JADX WARN: Code duplicated, block: B:104:0x012c  */
    /* JADX WARN: Code duplicated, block: B:106:0x012f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0139  */
    /* JADX WARN: Code duplicated, block: B:111:0x0141  */
    /* JADX WARN: Code duplicated, block: B:113:0x0147  */
    /* JADX WARN: Code duplicated, block: B:119:0x0156  */
    /* JADX WARN: Code duplicated, block: B:120:0x0158  */
    /* JADX WARN: Code duplicated, block: B:123:0x0160  */
    /* JADX WARN: Code duplicated, block: B:125:0x0168  */
    /* JADX WARN: Code duplicated, block: B:128:0x017c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0188  */
    /* JADX WARN: Code duplicated, block: B:134:0x0196  */
    /* JADX WARN: Code duplicated, block: B:135:0x0198  */
    /* JADX WARN: Code duplicated, block: B:138:0x019f  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:145:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:148:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:149:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:152:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:156:0x0204  */
    /* JADX WARN: Code duplicated, block: B:158:0x020a  */
    /* JADX WARN: Code duplicated, block: B:164:0x021a  */
    /* JADX WARN: Code duplicated, block: B:166:0x0220  */
    /* JADX WARN: Code duplicated, block: B:172:0x0231  */
    /* JADX WARN: Code duplicated, block: B:174:0x0237  */
    /* JADX WARN: Code duplicated, block: B:180:0x0244  */
    /* JADX WARN: Code duplicated, block: B:184:0x0254  */
    /* JADX WARN: Code duplicated, block: B:187:0x0272  */
    /* JADX WARN: Code duplicated, block: B:189:0x027e  */
    /* JADX WARN: Code duplicated, block: B:192:0x028f  */
    /* JADX WARN: Code duplicated, block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:93:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x0109  */
    /* JADX WARN: Code duplicated, block: B:98:0x010f  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void m(final a<Float> aVar, f3.m mVar, long j15, long j16, int i15, float f15, l<? super f, i0> lVar, r rVar, final int i16, final int i17) {
        int i18;
        f3.m mVar2;
        final long jH;
        long jK;
        int i19;
        int i25;
        int i26;
        int i27;
        float fI;
        int i28;
        boolean z15;
        boolean z16;
        final float f16;
        f3.m mVar3;
        final int i29;
        final long j17;
        final long j18;
        final l<? super f, i0> lVar2;
        d5 d5VarM;
        final int iJ;
        l<? super f, i0> lVar3;
        final float f17;
        final int i35;
        boolean z17;
        boolean z18;
        Object objE;
        boolean z19;
        Object objE2;
        final a aVar2;
        boolean zW;
        Object objE3;
        boolean z25;
        boolean z26;
        boolean z27;
        Object objE4;
        final l<? super f, i0> lVar4;
        final long j19;
        int i36;
        int i37;
        int i38;
        r rVarH = rVar.h(-339970038);
        if ((i16 & 6) == 0) {
            i18 = (rVarH.G(aVar) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        int i39 = i17 & 2;
        if (i39 == 0) {
            if ((i16 & 48) == 0) {
                mVar2 = mVar;
                i18 |= rVarH.W(mVar2) ? 32 : 16;
            }
            if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                jH = j15;
                if ((i17 & 4) == 0 || !rVarH.d(jH)) {
                    i38 = 128;
                } else {
                    i38 = 256;
                }
                i18 |= i38;
            } else {
                jH = j15;
            }
            if ((i16 & 3072) == 0) {
                jK = j16;
                if ((i17 & 8) == 0 || !rVarH.d(jK)) {
                    i37 = 1024;
                } else {
                    i37 = 2048;
                }
                i18 |= i37;
            } else {
                jK = j16;
            }
            i19 = i17 & 16;
            if (i19 != 0) {
                if ((i16 & 24576) == 0) {
                    i25 = i15;
                    if (rVarH.c(i25)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i18 |= i26;
                }
                i27 = i17 & 32;
                if (i27 != 0) {
                    i18 |= 196608;
                    fI = f15;
                } else {
                    fI = f15;
                    if ((i16 & 196608) == 0) {
                        if (rVarH.b(fI)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i18 |= i28;
                    }
                }
                if ((i16 & 1572864) != 0) {
                    if ((i17 & 64) == 0 || !rVarH.G(lVar)) {
                        i36 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i36 = PKIFailureInfo.badCertTemplate;
                    }
                    i18 |= i36;
                }
                z15 = true;
                if ((i18 & 599187) != 599186) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i18 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0 || rVarH.Q()) {
                        if (i39 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar2;
                        }
                        if ((i17 & 4) != 0) {
                            jH = xg.f58287a.h(rVarH, 6);
                            i18 &= -897;
                        }
                        if ((i17 & 8) != 0) {
                            jK = xg.f58287a.k(rVarH, 6);
                            i18 &= -7169;
                        }
                        if (i19 != 0) {
                            iJ = xg.f58287a.j();
                        } else {
                            iJ = i25;
                        }
                        if (i27 != 0) {
                            fI = xg.f58287a.i();
                        }
                        if ((i17 & 64) != 0) {
                            boolean z28 = (((i18 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVarH.d(jH)) || (i18 & MLKEMEngine.KyberPolyBytes) == 256;
                            if ((57344 & i18) == 16384) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z28 | z17;
                            objE = rVarH.E();
                            if (z18 || objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: f2.ah
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return C6457hh.n(jH, iJ, (f) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar3 = (l) objE;
                            i18 &= -3670017;
                        } else {
                            lVar3 = lVar;
                        }
                        f17 = fI;
                        i35 = iJ;
                    } else {
                        rVarH.O();
                        if ((i17 & 4) != 0) {
                            i18 &= -897;
                        }
                        if ((i17 & 8) != 0) {
                            i18 &= -7169;
                        }
                        if ((i17 & 64) != 0) {
                            i18 &= -3670017;
                        }
                        lVar3 = lVar;
                        f17 = fI;
                        mVar3 = mVar2;
                        i35 = i25;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-339970038, i18, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:155)");
                    }
                    if ((i18 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objE2 = rVarH.E();
                    if (z19 || objE2 == r.INSTANCE.a()) {
                        objE2 = new a() { // from class: f2.bh
                            @Override // er.a
                            public final Object a() {
                                return Float.valueOf(C6457hh.o(aVar));
                            }
                        };
                        rVarH.v(objE2);
                    }
                    aVar2 = (a) objE2;
                    f3.m mVarU = mVar3.u(o.n());
                    zW = rVarH.W(aVar2);
                    objE3 = rVarH.E();
                    if (zW || objE3 == r.INSTANCE.a()) {
                        objE3 = new l() { // from class: f2.ch
                            @Override // er.l
                            public final Object b(Object obj) {
                                return C6457hh.p(aVar2, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    f3.m mVarV = androidx.compose.foundation.layout.d.v(v.c(mVarU, true, (l) objE3), f56094a, f56095b);
                    if ((57344 & i18) == 16384) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if ((458752 & i18) == 131072) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean zW2 = z25 | z26 | rVarH.W(aVar2) | ((((i18 & 7168) ^ 3072) <= 2048 && rVarH.d(jK)) || (i18 & 3072) == 2048) | ((((i18 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVarH.d(jH)) || (i18 & MLKEMEngine.KyberPolyBytes) == 256);
                    if ((((3670016 & i18) ^ 1572864) > 1048576 || !rVarH.W(lVar3)) && (i18 & 1572864) != 1048576) {
                    }
                    z27 = z15 | zW2;
                    objE4 = rVarH.E();
                    if (!z27 || objE4 == r.INSTANCE.a()) {
                        lVar4 = lVar3;
                        j19 = jH;
                        j18 = jK;
                        objE4 = new l() { // from class: f2.dh
                            @Override // er.l
                            public final Object b(Object obj) {
                                return C6457hh.q(i35, f17, aVar2, j18, j19, lVar4, (f) obj);
                            }
                        };
                        rVarH.v(objE4);
                    } else {
                        lVar4 = lVar3;
                        j19 = jH;
                        j18 = jK;
                    }
                    z.b(mVarV, (l) objE4, rVarH, 0);
                    if (t.k()) {
                        t.n();
                    }
                    i29 = i35;
                    f16 = f17;
                    j17 = j19;
                    lVar2 = lVar4;
                } else {
                    rVarH.O();
                    f16 = fI;
                    mVar3 = mVar2;
                    i29 = i25;
                    j17 = jH;
                    j18 = jK;
                    lVar2 = lVar;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final f3.m mVar4 = mVar3;
                    final long j25 = j18;
                    d5VarM.a(new p() { // from class: f2.eh
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6457hh.r(aVar, mVar4, j17, j25, i29, f16, lVar2, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 24576;
            i25 = i15;
            i27 = i17 & 32;
            if (i27 != 0) {
                i18 |= 196608;
                fI = f15;
            } else {
                fI = f15;
                if ((i16 & 196608) == 0) {
                    if (rVarH.b(fI)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i28;
                }
            }
            if ((i16 & 1572864) != 0) {
                if ((i17 & 64) == 0) {
                    i36 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i36 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i36;
            }
            z15 = true;
            if ((i18 & 599187) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i18 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i39 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if ((i17 & 4) != 0) {
                        jH = xg.f58287a.h(rVarH, 6);
                        i18 &= -897;
                    }
                    if ((i17 & 8) != 0) {
                        jK = xg.f58287a.k(rVarH, 6);
                        i18 &= -7169;
                    }
                    if (i19 != 0) {
                        iJ = xg.f58287a.j();
                    } else {
                        iJ = i25;
                    }
                    if (i27 != 0) {
                        fI = xg.f58287a.i();
                    }
                    if ((i17 & 64) != 0) {
                        if (((i18 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256) {
                        }
                        if ((57344 & i18) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z28 | z17;
                        objE = rVarH.E();
                        if (z18) {
                            objE = new l() { // from class: f2.ah
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return C6457hh.n(jH, iJ, (f) obj);
                                }
                            };
                            rVarH.v(objE);
                        } else {
                            objE = new l() { // from class: f2.ah
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return C6457hh.n(jH, iJ, (f) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar3 = (l) objE;
                        i18 &= -3670017;
                    } else {
                        lVar3 = lVar;
                    }
                    f17 = fI;
                    i35 = iJ;
                } else {
                    if (i39 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if ((i17 & 4) != 0) {
                        jH = xg.f58287a.h(rVarH, 6);
                        i18 &= -897;
                    }
                    if ((i17 & 8) != 0) {
                        jK = xg.f58287a.k(rVarH, 6);
                        i18 &= -7169;
                    }
                    if (i19 != 0) {
                        iJ = xg.f58287a.j();
                    } else {
                        iJ = i25;
                    }
                    if (i27 != 0) {
                        fI = xg.f58287a.i();
                    }
                    if ((i17 & 64) != 0) {
                        if (((i18 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256) {
                        }
                        if ((57344 & i18) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z28 | z17;
                        objE = rVarH.E();
                        if (z18) {
                            objE = new l() { // from class: f2.ah
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return C6457hh.n(jH, iJ, (f) obj);
                                }
                            };
                            rVarH.v(objE);
                        } else {
                            objE = new l() { // from class: f2.ah
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return C6457hh.n(jH, iJ, (f) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar3 = (l) objE;
                        i18 &= -3670017;
                    } else {
                        lVar3 = lVar;
                    }
                    f17 = fI;
                    i35 = iJ;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-339970038, i18, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:155)");
                }
                if ((i18 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objE2 = rVarH.E();
                if (z19) {
                    objE2 = new a() { // from class: f2.bh
                        @Override // er.a
                        public final Object a() {
                            return Float.valueOf(C6457hh.o(aVar));
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new a() { // from class: f2.bh
                        @Override // er.a
                        public final Object a() {
                            return Float.valueOf(C6457hh.o(aVar));
                        }
                    };
                    rVarH.v(objE2);
                }
                aVar2 = (a) objE2;
                f3.m mVarU2 = mVar3.u(o.n());
                zW = rVarH.W(aVar2);
                objE3 = rVarH.E();
                if (zW) {
                    objE3 = new l() { // from class: f2.ch
                        @Override // er.l
                        public final Object b(Object obj) {
                            return C6457hh.p(aVar2, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new l() { // from class: f2.ch
                        @Override // er.l
                        public final Object b(Object obj) {
                            return C6457hh.p(aVar2, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                f3.m mVarV2 = androidx.compose.foundation.layout.d.v(v.c(mVarU2, true, (l) objE3), f56094a, f56095b);
                if ((57344 & i18) == 16384) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if ((458752 & i18) == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean zW3 = z25 | z26 | rVarH.W(aVar2) | ((((i18 & 7168) ^ 3072) <= 2048 && rVarH.d(jK)) || (i18 & 3072) == 2048) | ((((i18 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVarH.d(jH)) || (i18 & MLKEMEngine.KyberPolyBytes) == 256);
                z15 = ((3670016 & i18) ^ 1572864) > 1048576 ? false : false;
                z27 = z15 | zW3;
                objE4 = rVarH.E();
                if (z27) {
                    lVar4 = lVar3;
                    j19 = jH;
                    j18 = jK;
                    objE4 = new l() { // from class: f2.dh
                        @Override // er.l
                        public final Object b(Object obj) {
                            return C6457hh.q(i35, f17, aVar2, j18, j19, lVar4, (f) obj);
                        }
                    };
                    rVarH.v(objE4);
                } else {
                    lVar4 = lVar3;
                    j19 = jH;
                    j18 = jK;
                    objE4 = new l() { // from class: f2.dh
                        @Override // er.l
                        public final Object b(Object obj) {
                            return C6457hh.q(i35, f17, aVar2, j18, j19, lVar4, (f) obj);
                        }
                    };
                    rVarH.v(objE4);
                }
                z.b(mVarV2, (l) objE4, rVarH, 0);
                if (t.k()) {
                    t.n();
                }
                i29 = i35;
                f16 = f17;
                j17 = j19;
                lVar2 = lVar4;
            } else {
                rVarH.O();
                f16 = fI;
                mVar3 = mVar2;
                i29 = i25;
                j17 = jH;
                j18 = jK;
                lVar2 = lVar;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final f3.m mVar5 = mVar3;
                final long j26 = j18;
                d5VarM.a(new p() { // from class: f2.eh
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6457hh.r(aVar, mVar5, j17, j26, i29, f16, lVar2, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 48;
        mVar2 = mVar;
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            jH = j15;
            if ((i17 & 4) == 0) {
                i38 = 128;
            } else {
                i38 = 128;
            }
            i18 |= i38;
        } else {
            jH = j15;
        }
        if ((i16 & 3072) == 0) {
            jK = j16;
            if ((i17 & 8) == 0) {
                i37 = 1024;
            } else {
                i37 = 1024;
            }
            i18 |= i37;
        } else {
            jK = j16;
        }
        i19 = i17 & 16;
        if (i19 != 0) {
            if ((i16 & 24576) == 0) {
                i25 = i15;
                if (rVarH.c(i25)) {
                    i26 = 16384;
                } else {
                    i26 = PKIFailureInfo.certRevoked;
                }
                i18 |= i26;
            }
            i27 = i17 & 32;
            if (i27 != 0) {
                i18 |= 196608;
                fI = f15;
            } else {
                fI = f15;
                if ((i16 & 196608) == 0) {
                    if (rVarH.b(fI)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i28;
                }
            }
            if ((i16 & 1572864) != 0) {
                if ((i17 & 64) == 0) {
                    i36 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i36 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i36;
            }
            z15 = true;
            if ((i18 & 599187) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i18 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i39 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if ((i17 & 4) != 0) {
                        jH = xg.f58287a.h(rVarH, 6);
                        i18 &= -897;
                    }
                    if ((i17 & 8) != 0) {
                        jK = xg.f58287a.k(rVarH, 6);
                        i18 &= -7169;
                    }
                    if (i19 != 0) {
                        iJ = xg.f58287a.j();
                    } else {
                        iJ = i25;
                    }
                    if (i27 != 0) {
                        fI = xg.f58287a.i();
                    }
                    if ((i17 & 64) != 0) {
                        if (((i18 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256) {
                        }
                        if ((57344 & i18) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z28 | z17;
                        objE = rVarH.E();
                        if (z18) {
                            objE = new l() { // from class: f2.ah
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return C6457hh.n(jH, iJ, (f) obj);
                                }
                            };
                            rVarH.v(objE);
                        } else {
                            objE = new l() { // from class: f2.ah
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return C6457hh.n(jH, iJ, (f) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar3 = (l) objE;
                        i18 &= -3670017;
                    } else {
                        lVar3 = lVar;
                    }
                    f17 = fI;
                    i35 = iJ;
                } else {
                    if (i39 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if ((i17 & 4) != 0) {
                        jH = xg.f58287a.h(rVarH, 6);
                        i18 &= -897;
                    }
                    if ((i17 & 8) != 0) {
                        jK = xg.f58287a.k(rVarH, 6);
                        i18 &= -7169;
                    }
                    if (i19 != 0) {
                        iJ = xg.f58287a.j();
                    } else {
                        iJ = i25;
                    }
                    if (i27 != 0) {
                        fI = xg.f58287a.i();
                    }
                    if ((i17 & 64) != 0) {
                        if (((i18 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256) {
                        }
                        if ((57344 & i18) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z28 | z17;
                        objE = rVarH.E();
                        if (z18) {
                            objE = new l() { // from class: f2.ah
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return C6457hh.n(jH, iJ, (f) obj);
                                }
                            };
                            rVarH.v(objE);
                        } else {
                            objE = new l() { // from class: f2.ah
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return C6457hh.n(jH, iJ, (f) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar3 = (l) objE;
                        i18 &= -3670017;
                    } else {
                        lVar3 = lVar;
                    }
                    f17 = fI;
                    i35 = iJ;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-339970038, i18, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:155)");
                }
                if ((i18 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objE2 = rVarH.E();
                if (z19) {
                    objE2 = new a() { // from class: f2.bh
                        @Override // er.a
                        public final Object a() {
                            return Float.valueOf(C6457hh.o(aVar));
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new a() { // from class: f2.bh
                        @Override // er.a
                        public final Object a() {
                            return Float.valueOf(C6457hh.o(aVar));
                        }
                    };
                    rVarH.v(objE2);
                }
                aVar2 = (a) objE2;
                f3.m mVarU3 = mVar3.u(o.n());
                zW = rVarH.W(aVar2);
                objE3 = rVarH.E();
                if (zW) {
                    objE3 = new l() { // from class: f2.ch
                        @Override // er.l
                        public final Object b(Object obj) {
                            return C6457hh.p(aVar2, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new l() { // from class: f2.ch
                        @Override // er.l
                        public final Object b(Object obj) {
                            return C6457hh.p(aVar2, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                f3.m mVarV3 = androidx.compose.foundation.layout.d.v(v.c(mVarU3, true, (l) objE3), f56094a, f56095b);
                if ((57344 & i18) == 16384) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if ((458752 & i18) == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean zW4 = z25 | z26 | rVarH.W(aVar2) | ((((i18 & 7168) ^ 3072) <= 2048 && rVarH.d(jK)) || (i18 & 3072) == 2048) | ((((i18 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVarH.d(jH)) || (i18 & MLKEMEngine.KyberPolyBytes) == 256);
                if (((3670016 & i18) ^ 1572864) > 1048576) {
                }
                z27 = z15 | zW4;
                objE4 = rVarH.E();
                if (z27) {
                    lVar4 = lVar3;
                    j19 = jH;
                    j18 = jK;
                    objE4 = new l() { // from class: f2.dh
                        @Override // er.l
                        public final Object b(Object obj) {
                            return C6457hh.q(i35, f17, aVar2, j18, j19, lVar4, (f) obj);
                        }
                    };
                    rVarH.v(objE4);
                } else {
                    lVar4 = lVar3;
                    j19 = jH;
                    j18 = jK;
                    objE4 = new l() { // from class: f2.dh
                        @Override // er.l
                        public final Object b(Object obj) {
                            return C6457hh.q(i35, f17, aVar2, j18, j19, lVar4, (f) obj);
                        }
                    };
                    rVarH.v(objE4);
                }
                z.b(mVarV3, (l) objE4, rVarH, 0);
                if (t.k()) {
                    t.n();
                }
                i29 = i35;
                f16 = f17;
                j17 = j19;
                lVar2 = lVar4;
            } else {
                rVarH.O();
                f16 = fI;
                mVar3 = mVar2;
                i29 = i25;
                j17 = jH;
                j18 = jK;
                lVar2 = lVar;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final f3.m mVar6 = mVar3;
                final long j27 = j18;
                d5VarM.a(new p() { // from class: f2.eh
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6457hh.r(aVar, mVar6, j17, j27, i29, f16, lVar2, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 24576;
        i25 = i15;
        i27 = i17 & 32;
        if (i27 != 0) {
            i18 |= 196608;
            fI = f15;
        } else {
            fI = f15;
            if ((i16 & 196608) == 0) {
                if (rVarH.b(fI)) {
                    i28 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i28 = PKIFailureInfo.notAuthorized;
                }
                i18 |= i28;
            }
        }
        if ((i16 & 1572864) != 0) {
            if ((i17 & 64) == 0) {
                i36 = PKIFailureInfo.signerNotTrusted;
            } else {
                i36 = PKIFailureInfo.signerNotTrusted;
            }
            i18 |= i36;
        }
        z15 = true;
        if ((i18 & 599187) != 599186) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (rVarH.r(z16, i18 & 1)) {
            rVarH.I();
            if ((i16 & 1) != 0) {
                if (i39 != 0) {
                    mVar3 = f3.m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if ((i17 & 4) != 0) {
                    jH = xg.f58287a.h(rVarH, 6);
                    i18 &= -897;
                }
                if ((i17 & 8) != 0) {
                    jK = xg.f58287a.k(rVarH, 6);
                    i18 &= -7169;
                }
                if (i19 != 0) {
                    iJ = xg.f58287a.j();
                } else {
                    iJ = i25;
                }
                if (i27 != 0) {
                    fI = xg.f58287a.i();
                }
                if ((i17 & 64) != 0) {
                    if (((i18 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256) {
                    }
                    if ((57344 & i18) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z28 | z17;
                    objE = rVarH.E();
                    if (z18) {
                        objE = new l() { // from class: f2.ah
                            @Override // er.l
                            public final Object b(Object obj) {
                                return C6457hh.n(jH, iJ, (f) obj);
                            }
                        };
                        rVarH.v(objE);
                    } else {
                        objE = new l() { // from class: f2.ah
                            @Override // er.l
                            public final Object b(Object obj) {
                                return C6457hh.n(jH, iJ, (f) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    lVar3 = (l) objE;
                    i18 &= -3670017;
                } else {
                    lVar3 = lVar;
                }
                f17 = fI;
                i35 = iJ;
            } else {
                if (i39 != 0) {
                    mVar3 = f3.m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if ((i17 & 4) != 0) {
                    jH = xg.f58287a.h(rVarH, 6);
                    i18 &= -897;
                }
                if ((i17 & 8) != 0) {
                    jK = xg.f58287a.k(rVarH, 6);
                    i18 &= -7169;
                }
                if (i19 != 0) {
                    iJ = xg.f58287a.j();
                } else {
                    iJ = i25;
                }
                if (i27 != 0) {
                    fI = xg.f58287a.i();
                }
                if ((i17 & 64) != 0) {
                    if (((i18 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256) {
                    }
                    if ((57344 & i18) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z28 | z17;
                    objE = rVarH.E();
                    if (z18) {
                        objE = new l() { // from class: f2.ah
                            @Override // er.l
                            public final Object b(Object obj) {
                                return C6457hh.n(jH, iJ, (f) obj);
                            }
                        };
                        rVarH.v(objE);
                    } else {
                        objE = new l() { // from class: f2.ah
                            @Override // er.l
                            public final Object b(Object obj) {
                                return C6457hh.n(jH, iJ, (f) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    lVar3 = (l) objE;
                    i18 &= -3670017;
                } else {
                    lVar3 = lVar;
                }
                f17 = fI;
                i35 = iJ;
            }
            rVarH.y();
            if (t.k()) {
                t.o(-339970038, i18, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:155)");
            }
            if ((i18 & 14) == 4) {
                z19 = true;
            } else {
                z19 = false;
            }
            objE2 = rVarH.E();
            if (z19) {
                objE2 = new a() { // from class: f2.bh
                    @Override // er.a
                    public final Object a() {
                        return Float.valueOf(C6457hh.o(aVar));
                    }
                };
                rVarH.v(objE2);
            } else {
                objE2 = new a() { // from class: f2.bh
                    @Override // er.a
                    public final Object a() {
                        return Float.valueOf(C6457hh.o(aVar));
                    }
                };
                rVarH.v(objE2);
            }
            aVar2 = (a) objE2;
            f3.m mVarU4 = mVar3.u(o.n());
            zW = rVarH.W(aVar2);
            objE3 = rVarH.E();
            if (zW) {
                objE3 = new l() { // from class: f2.ch
                    @Override // er.l
                    public final Object b(Object obj) {
                        return C6457hh.p(aVar2, (n4.i0) obj);
                    }
                };
                rVarH.v(objE3);
            } else {
                objE3 = new l() { // from class: f2.ch
                    @Override // er.l
                    public final Object b(Object obj) {
                        return C6457hh.p(aVar2, (n4.i0) obj);
                    }
                };
                rVarH.v(objE3);
            }
            f3.m mVarV4 = androidx.compose.foundation.layout.d.v(v.c(mVarU4, true, (l) objE3), f56094a, f56095b);
            if ((57344 & i18) == 16384) {
                z25 = true;
            } else {
                z25 = false;
            }
            if ((458752 & i18) == 131072) {
                z26 = true;
            } else {
                z26 = false;
            }
            boolean zW5 = z25 | z26 | rVarH.W(aVar2) | ((((i18 & 7168) ^ 3072) <= 2048 && rVarH.d(jK)) || (i18 & 3072) == 2048) | ((((i18 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVarH.d(jH)) || (i18 & MLKEMEngine.KyberPolyBytes) == 256);
            if (((3670016 & i18) ^ 1572864) > 1048576) {
            }
            z27 = z15 | zW5;
            objE4 = rVarH.E();
            if (z27) {
                lVar4 = lVar3;
                j19 = jH;
                j18 = jK;
                objE4 = new l() { // from class: f2.dh
                    @Override // er.l
                    public final Object b(Object obj) {
                        return C6457hh.q(i35, f17, aVar2, j18, j19, lVar4, (f) obj);
                    }
                };
                rVarH.v(objE4);
            } else {
                lVar4 = lVar3;
                j19 = jH;
                j18 = jK;
                objE4 = new l() { // from class: f2.dh
                    @Override // er.l
                    public final Object b(Object obj) {
                        return C6457hh.q(i35, f17, aVar2, j18, j19, lVar4, (f) obj);
                    }
                };
                rVarH.v(objE4);
            }
            z.b(mVarV4, (l) objE4, rVarH, 0);
            if (t.k()) {
                t.n();
            }
            i29 = i35;
            f16 = f17;
            j17 = j19;
            lVar2 = lVar4;
        } else {
            rVarH.O();
            f16 = fI;
            mVar3 = mVar2;
            i29 = i25;
            j17 = jH;
            j18 = jK;
            lVar2 = lVar;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            final f3.m mVar7 = mVar3;
            final long j28 = j18;
            d5VarM.a(new p() { // from class: f2.eh
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return C6457hh.r(aVar, mVar7, j17, j28, i29, f16, lVar2, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(long j15, int i15, f fVar) {
        xg xgVar = xg.f58287a;
        xgVar.a(fVar, xgVar.l(), j15, i15);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float o(a aVar) {
        float fFloatValue = ((Number) aVar.a()).floatValue();
        if (fFloatValue < 0.0f) {
            fFloatValue = 0.0f;
        }
        if (fFloatValue > 1.0f) {
            return 1.0f;
        }
        return fFloatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(a aVar, n4.i0 i0Var) {
        Object objA = aVar.a();
        if (Float.isNaN(((Number) objA).floatValue())) {
            objA = null;
        }
        Float f15 = (Float) objA;
        n4.f0.q0(i0Var, new ProgressBarRangeInfo(f15 != null ? f15.floatValue() : 0.0f, lr.m.b(0.0f, 1.0f), 0, 4, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(int i15, float f15, a aVar, long j15, long j16, l lVar, f fVar) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.a() & BodyPartID.bodyIdMax));
        if (!a3.e(i15, a3.INSTANCE.a()) && Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & fVar.a())) <= Float.intBitsToFloat((int) (fVar.a() >> 32))) {
            f15 = h.n(f15 + fVar.d2(fIntBitsToFloat));
        }
        float fD2 = f15 / fVar.d2(Float.intBitsToFloat((int) (fVar.a() >> 32)));
        float fFloatValue = ((Number) aVar.a()).floatValue();
        float fMin = fFloatValue + Math.min(fFloatValue, fD2);
        if (fMin <= 1.0f) {
            w(fVar, fMin, 1.0f, j15, fIntBitsToFloat, i15);
        }
        w(fVar, 0.0f, fFloatValue, j16, fIntBitsToFloat, i15);
        lVar.b(fVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(a aVar, f3.m mVar, long j15, long j16, int i15, float f15, l lVar, int i16, int i17, r rVar, int i18) {
        m(aVar, mVar, j15, j16, i15, f15, lVar, rVar, g4.a(i16 | 1), i17);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(z0.b bVar) {
        bVar.d(6000);
        bVar.e(bVar.f(Float.valueOf(0.87f), 3000), f56099f);
        bVar.f(Float.valueOf(0.1f), 6000);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(z0.b bVar) {
        bVar.d(6000);
        Float fValueOf = Float.valueOf(90.0f);
        bVar.e(bVar.f(fValueOf, 300), l0.f114877a.b());
        bVar.f(fValueOf, 1500);
        Float fValueOf2 = Float.valueOf(180.0f);
        bVar.f(fValueOf2, 1800);
        bVar.f(fValueOf2, 3000);
        Float fValueOf3 = Float.valueOf(270.0f);
        bVar.f(fValueOf3, 3300);
        bVar.f(fValueOf3, 4500);
        Float fValueOf4 = Float.valueOf(360.0f);
        bVar.f(fValueOf4, 4800);
        bVar.f(fValueOf4, 6000);
        return i0.f148189a;
    }

    private static final void u(f fVar, float f15, float f16, long j15, Stroke stroke) {
        float f17 = 2;
        float width = stroke.getWidth() / f17;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.a() >> 32)) - (f17 * width);
        f.n0(fVar, j15, f15, f16, false, e.e((((long) Float.floatToRawIntBits(width)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(width) << 32)), k.d((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & BodyPartID.bodyIdMax)), 0.0f, stroke, null, 0, 832, null);
    }

    private static final void v(f fVar, float f15, float f16, long j15, Stroke stroke) {
        u(fVar, f15, f16, j15, stroke);
    }

    private static final void w(f fVar, float f15, float f16, long j15, float f17, int i15) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.a() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.a() & BodyPartID.bodyIdMax));
        float f18 = 2;
        float f19 = fIntBitsToFloat2 / f18;
        boolean z15 = fVar.getLayoutDirection() == c5.t.Ltr;
        float f25 = (z15 ? f15 : 1.0f - f16) * fIntBitsToFloat;
        float f26 = (z15 ? f16 : 1.0f - f15) * fIntBitsToFloat;
        if (a3.e(i15, a3.INSTANCE.a()) || fIntBitsToFloat2 > fIntBitsToFloat) {
            f.w1(fVar, j15, e.e((((long) Float.floatToRawIntBits(f25)) << 32) | (((long) Float.floatToRawIntBits(f19)) & BodyPartID.bodyIdMax)), e.e((((long) Float.floatToRawIntBits(f26)) << 32) | (((long) Float.floatToRawIntBits(f19)) & BodyPartID.bodyIdMax)), f17, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f27 = f17 / f18;
        float f28 = fIntBitsToFloat - f27;
        if (f25 < f27) {
            f25 = f27;
        }
        if (f25 > f28) {
            f25 = f28;
        }
        if (f26 < f27) {
            f26 = f27;
        }
        if (f26 <= f28) {
            f28 = f26;
        }
        if (Math.abs(f16 - f15) > 0.0f) {
            f.w1(fVar, j15, e.e((((long) Float.floatToRawIntBits(f25)) << 32) | (((long) Float.floatToRawIntBits(f19)) & BodyPartID.bodyIdMax)), e.e((((long) Float.floatToRawIntBits(f28)) << 32) | (((long) Float.floatToRawIntBits(f19)) & BodyPartID.bodyIdMax)), f17, i15, null, 0.0f, null, 0, 480, null);
        }
    }

    public static final q0<Float> x() {
        return u0.m.e(u0.m.l(6000, 0, u0.i0.e(), 2, null), null, 0L, 6, null);
    }

    public static final q0<Float> y() {
        return u0.m.e(u0.m.f(new l() { // from class: f2.fh
            @Override // er.l
            public final Object b(Object obj) {
                return C6457hh.s((z0.b) obj);
            }
        }), null, 0L, 6, null);
    }

    public static final q0<Float> z() {
        return u0.m.e(u0.m.f(new l() { // from class: f2.gh
            @Override // er.l
            public final Object b(Object obj) {
                return C6457hh.t((z0.b) obj);
            }
        }), null, 0L, 6, null);
    }
}
