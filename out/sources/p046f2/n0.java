package p046f2;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.Color;
import c5.h;
import d1.a3;
import d1.c4;
import d1.f4;
import d1.u4;
import d1.v4;
import er.l;
import er.p;
import f3.m;
import h2.a2;
import h2.b2;
import l2.t0;
import l2.y0;
import n3.y2;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u001a\u0010\u001c\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\u001f\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\"\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\u0013R\u0011\u0010%\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010(\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010*\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0011\u0010.\u001a\u00020+8G¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u00100\u001a\u00020+8G¢\u0006\u0006\u001a\u0004\b/\u0010-¨\u00061"}, d2 = {"Lf2/n0;", "", "<init>", "()V", "Lf3/m;", "modifier", "Lc5/h;", "width", "height", "Ln3/y2;", "shape", "Landroidx/compose/ui/graphics/Color;", "color", "Loq/i0;", "d", "(Lf3/m;FFLn3/y2;JLm2/r;II)V", "b", "F", "j", "()F", "Elevation", "c", "getSheetPeekHeight-D9Ej5fM", "SheetPeekHeight", "o", "SheetMaxWidth", "e", "m", "PositionalThreshold", "f", "q", "VelocityThreshold", "g", "h", "BoundaryDampeningZone", "k", "(Lm2/r;I)Ln3/y2;", "ExpandedShape", "i", "(Lm2/r;I)J", "ContainerColor", "n", "ScrimColor", "Ld1/c4;", "p", "(Lm2/r;I)Ld1/c4;", "standardWindowInsets", "l", "modalWindowInsets", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float SheetPeekHeight;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float PositionalThreshold;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float VelocityThreshold;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float BoundaryDampeningZone;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f56958a = new n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float Elevation = y0.f115384a.f();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float SheetMaxWidth = h.n(640);

    static {
        float f15 = 56;
        SheetPeekHeight = h.n(f15);
        PositionalThreshold = h.n(f15);
        float f16 = 125;
        VelocityThreshold = h.n(f16);
        BoundaryDampeningZone = h.n(f16);
    }

    private n0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(String str, n4.i0 i0Var) {
        f0.c0(i0Var, str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(float f15, float f16, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1039573072, i15, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle.<anonymous> (SheetDefaults.kt:438)");
            }
            d1.r.b(d.v(m.INSTANCE, f15, f16), rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(n0 n0Var, m mVar, float f15, float f16, y2 y2Var, long j15, int i15, int i16, r rVar, int i17) {
        n0Var.d(mVar, f15, f16, y2Var, j15, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0181  */
    /* JADX WARN: Code duplicated, block: B:105:0x018f  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x010e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0135  */
    /* JADX WARN: Code duplicated, block: B:96:0x013d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0179  */
    public final void d(m mVar, float f15, float f16, y2 y2Var, long j15, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        final float fE;
        int i18;
        float fD;
        int i19;
        y2 extraLarge;
        long jI;
        boolean z15;
        r rVar2;
        final m mVar3;
        final float f17;
        final float f18;
        final y2 y2Var2;
        final long j16;
        d5 d5VarM;
        final String strB;
        boolean zW;
        Object objE;
        int i25;
        r rVarH = rVar.h(-1364277227);
        int i26 = i16 & 1;
        if (i26 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        int i27 = i16 & 2;
        if (i27 == 0) {
            if ((i15 & 48) == 0) {
                fE = f15;
                i17 |= rVarH.b(fE) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    fD = f16;
                    if (rVarH.b(fD)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                if ((i15 & 3072) == 0) {
                    if ((i16 & 8) == 0) {
                        extraLarge = y2Var;
                        int i28 = rVarH.W(extraLarge) ? 2048 : 1024;
                        i17 |= i28;
                    } else {
                        extraLarge = y2Var;
                    }
                    i17 |= i28;
                } else {
                    extraLarge = y2Var;
                }
                if ((i15 & 24576) == 0) {
                    if ((i16 & 16) == 0) {
                        jI = j15;
                        if (rVarH.d(jI)) {
                            i25 = 16384;
                        }
                        i17 |= i25;
                    } else {
                        jI = j15;
                    }
                    i25 = PKIFailureInfo.certRevoked;
                    i17 |= i25;
                } else {
                    jI = j15;
                }
                if ((i17 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0 || rVarH.Q()) {
                        if (i26 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar2;
                        }
                        if (i27 != 0) {
                            fE = y0.f115384a.e();
                        }
                        if (i18 != 0) {
                            fD = y0.f115384a.d();
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            extraLarge = androidx.compose.material3.d.f9816a.d(rVarH, 6).getExtraLarge();
                        }
                        if ((i16 & 16) != 0) {
                            jI = g2.i(y0.f115384a.c(), rVarH, 6);
                            i17 &= -57345;
                        }
                    } else {
                        rVarH.O();
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                        }
                        if ((i16 & 16) != 0) {
                            i17 &= -57345;
                        }
                        mVar3 = mVar2;
                    }
                    final float f19 = fD;
                    rVarH.y();
                    if (t.k()) {
                        t.o(-1364277227, i17, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:428)");
                    }
                    a2.Companion companion = a2.INSTANCE;
                    strB = b2.b(a2.a(ih.f56313c), rVarH, 0);
                    m mVarP = a3.p(mVar3, 0.0f, ej.f55779b, 1, null);
                    zW = rVarH.W(strB);
                    objE = rVarH.E();
                    if (zW || objE == r.INSTANCE.a()) {
                        objE = new l() { // from class: f2.k0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n0.e(strB, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    int i29 = i17 >> 6;
                    rVar2 = rVarH;
                    androidx.compose.material3.l.g(v.d(mVarP, false, (l) objE, 1, null), extraLarge, jI, 0L, 0.0f, 0.0f, null, y2.m.d(-1039573072, true, new p() { // from class: f2.l0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return n0.f(fE, f19, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVar2, (i29 & 112) | 12582912 | (i29 & 896), 120);
                    if (t.k()) {
                        t.n();
                    }
                    f17 = f19;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar3 = mVar2;
                    f17 = fD;
                }
                f18 = fE;
                y2Var2 = extraLarge;
                j16 = jI;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.m0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return n0.g(this.f56812a, mVar3, f18, f17, y2Var2, j16, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            fD = f16;
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    extraLarge = y2Var;
                    if (rVarH.W(extraLarge)) {
                    }
                    i17 |= i28;
                } else {
                    extraLarge = y2Var;
                }
                i17 |= i28;
            } else {
                extraLarge = y2Var;
            }
            if ((i15 & 24576) == 0) {
                if ((i16 & 16) == 0) {
                    jI = j15;
                    if (rVarH.d(jI)) {
                        i25 = 16384;
                    }
                    i17 |= i25;
                } else {
                    jI = j15;
                }
                i25 = PKIFailureInfo.certRevoked;
                i17 |= i25;
            } else {
                jI = j15;
            }
            if ((i17 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i26 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (i27 != 0) {
                        fE = y0.f115384a.e();
                    }
                    if (i18 != 0) {
                        fD = y0.f115384a.d();
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        extraLarge = androidx.compose.material3.d.f9816a.d(rVarH, 6).getExtraLarge();
                    }
                    if ((i16 & 16) != 0) {
                        jI = g2.i(y0.f115384a.c(), rVarH, 6);
                        i17 &= -57345;
                    }
                } else {
                    if (i26 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (i27 != 0) {
                        fE = y0.f115384a.e();
                    }
                    if (i18 != 0) {
                        fD = y0.f115384a.d();
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        extraLarge = androidx.compose.material3.d.f9816a.d(rVarH, 6).getExtraLarge();
                    }
                    if ((i16 & 16) != 0) {
                        jI = g2.i(y0.f115384a.c(), rVarH, 6);
                        i17 &= -57345;
                    }
                }
                final float f110 = fD;
                rVarH.y();
                if (t.k()) {
                    t.o(-1364277227, i17, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:428)");
                }
                a2.Companion companion2 = a2.INSTANCE;
                strB = b2.b(a2.a(ih.f56313c), rVarH, 0);
                m mVarP2 = a3.p(mVar3, 0.0f, ej.f55779b, 1, null);
                zW = rVarH.W(strB);
                objE = rVarH.E();
                if (zW) {
                    objE = new l() { // from class: f2.k0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return n0.e(strB, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE);
                } else {
                    objE = new l() { // from class: f2.k0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return n0.e(strB, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                int i210 = i17 >> 6;
                rVar2 = rVarH;
                androidx.compose.material3.l.g(v.d(mVarP2, false, (l) objE, 1, null), extraLarge, jI, 0L, 0.0f, 0.0f, null, y2.m.d(-1039573072, true, new p() { // from class: f2.l0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return n0.f(fE, f110, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVar2, (i210 & 112) | 12582912 | (i210 & 896), 120);
                if (t.k()) {
                    t.n();
                }
                f17 = f110;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar3 = mVar2;
                f17 = fD;
            }
            f18 = fE;
            y2Var2 = extraLarge;
            j16 = jI;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.m0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return n0.g(this.f56812a, mVar3, f18, f17, y2Var2, j16, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        fE = f15;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                fD = f16;
                if (rVarH.b(fD)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    extraLarge = y2Var;
                    if (rVarH.W(extraLarge)) {
                    }
                    i17 |= i28;
                } else {
                    extraLarge = y2Var;
                }
                i17 |= i28;
            } else {
                extraLarge = y2Var;
            }
            if ((i15 & 24576) == 0) {
                if ((i16 & 16) == 0) {
                    jI = j15;
                    if (rVarH.d(jI)) {
                        i25 = 16384;
                    }
                    i17 |= i25;
                } else {
                    jI = j15;
                }
                i25 = PKIFailureInfo.certRevoked;
                i17 |= i25;
            } else {
                jI = j15;
            }
            if ((i17 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i26 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (i27 != 0) {
                        fE = y0.f115384a.e();
                    }
                    if (i18 != 0) {
                        fD = y0.f115384a.d();
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        extraLarge = androidx.compose.material3.d.f9816a.d(rVarH, 6).getExtraLarge();
                    }
                    if ((i16 & 16) != 0) {
                        jI = g2.i(y0.f115384a.c(), rVarH, 6);
                        i17 &= -57345;
                    }
                } else {
                    if (i26 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (i27 != 0) {
                        fE = y0.f115384a.e();
                    }
                    if (i18 != 0) {
                        fD = y0.f115384a.d();
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        extraLarge = androidx.compose.material3.d.f9816a.d(rVarH, 6).getExtraLarge();
                    }
                    if ((i16 & 16) != 0) {
                        jI = g2.i(y0.f115384a.c(), rVarH, 6);
                        i17 &= -57345;
                    }
                }
                final float f111 = fD;
                rVarH.y();
                if (t.k()) {
                    t.o(-1364277227, i17, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:428)");
                }
                a2.Companion companion3 = a2.INSTANCE;
                strB = b2.b(a2.a(ih.f56313c), rVarH, 0);
                m mVarP3 = a3.p(mVar3, 0.0f, ej.f55779b, 1, null);
                zW = rVarH.W(strB);
                objE = rVarH.E();
                if (zW) {
                    objE = new l() { // from class: f2.k0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return n0.e(strB, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE);
                } else {
                    objE = new l() { // from class: f2.k0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return n0.e(strB, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                int i211 = i17 >> 6;
                rVar2 = rVarH;
                androidx.compose.material3.l.g(v.d(mVarP3, false, (l) objE, 1, null), extraLarge, jI, 0L, 0.0f, 0.0f, null, y2.m.d(-1039573072, true, new p() { // from class: f2.l0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return n0.f(fE, f111, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVar2, (i211 & 112) | 12582912 | (i211 & 896), 120);
                if (t.k()) {
                    t.n();
                }
                f17 = f111;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar3 = mVar2;
                f17 = fD;
            }
            f18 = fE;
            y2Var2 = extraLarge;
            j16 = jI;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.m0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return n0.g(this.f56812a, mVar3, f18, f17, y2Var2, j16, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        fD = f16;
        if ((i15 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                extraLarge = y2Var;
                if (rVarH.W(extraLarge)) {
                }
                i17 |= i28;
            } else {
                extraLarge = y2Var;
            }
            i17 |= i28;
        } else {
            extraLarge = y2Var;
        }
        if ((i15 & 24576) == 0) {
            if ((i16 & 16) == 0) {
                jI = j15;
                if (rVarH.d(jI)) {
                    i25 = 16384;
                }
                i17 |= i25;
            } else {
                jI = j15;
            }
            i25 = PKIFailureInfo.certRevoked;
            i17 |= i25;
        } else {
            jI = j15;
        }
        if ((i17 & 9363) != 9362) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i26 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (i27 != 0) {
                    fE = y0.f115384a.e();
                }
                if (i18 != 0) {
                    fD = y0.f115384a.d();
                }
                if ((i16 & 8) != 0) {
                    i17 &= -7169;
                    extraLarge = androidx.compose.material3.d.f9816a.d(rVarH, 6).getExtraLarge();
                }
                if ((i16 & 16) != 0) {
                    jI = g2.i(y0.f115384a.c(), rVarH, 6);
                    i17 &= -57345;
                }
            } else {
                if (i26 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (i27 != 0) {
                    fE = y0.f115384a.e();
                }
                if (i18 != 0) {
                    fD = y0.f115384a.d();
                }
                if ((i16 & 8) != 0) {
                    i17 &= -7169;
                    extraLarge = androidx.compose.material3.d.f9816a.d(rVarH, 6).getExtraLarge();
                }
                if ((i16 & 16) != 0) {
                    jI = g2.i(y0.f115384a.c(), rVarH, 6);
                    i17 &= -57345;
                }
            }
            final float f112 = fD;
            rVarH.y();
            if (t.k()) {
                t.o(-1364277227, i17, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:428)");
            }
            a2.Companion companion4 = a2.INSTANCE;
            strB = b2.b(a2.a(ih.f56313c), rVarH, 0);
            m mVarP4 = a3.p(mVar3, 0.0f, ej.f55779b, 1, null);
            zW = rVarH.W(strB);
            objE = rVarH.E();
            if (zW) {
                objE = new l() { // from class: f2.k0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n0.e(strB, (n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            } else {
                objE = new l() { // from class: f2.k0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n0.e(strB, (n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            int i212 = i17 >> 6;
            rVar2 = rVarH;
            androidx.compose.material3.l.g(v.d(mVarP4, false, (l) objE, 1, null), extraLarge, jI, 0L, 0.0f, 0.0f, null, y2.m.d(-1039573072, true, new p() { // from class: f2.l0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n0.f(fE, f112, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVar2, (i212 & 112) | 12582912 | (i212 & 896), 120);
            if (t.k()) {
                t.n();
            }
            f17 = f112;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            mVar3 = mVar2;
            f17 = fD;
        }
        f18 = fE;
        y2Var2 = extraLarge;
        j16 = jI;
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.m0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n0.g(this.f56812a, mVar3, f18, f17, y2Var2, j16, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final float h() {
        return BoundaryDampeningZone;
    }

    public final long i(r rVar, int i15) {
        if (t.k()) {
            t.o(433375448, i15, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ContainerColor> (SheetDefaults.kt:374)");
        }
        long jI = g2.i(y0.f115384a.a(), rVar, 6);
        if (t.k()) {
            t.n();
        }
        return jI;
    }

    public final float j() {
        return Elevation;
    }

    public final y2 k(r rVar, int i15) {
        if (t.k()) {
            t.o(1683783414, i15, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ExpandedShape> (SheetDefaults.kt:370)");
        }
        y2 y2VarH = ui.h(y0.f115384a.b(), rVar, 6);
        if (t.k()) {
            t.n();
        }
        return y2VarH;
    }

    public final c4 l(r rVar, int i15) {
        if (t.k()) {
            t.o(100588221, i15, -1, "androidx.compose.material3.BottomSheetDefaults.<get-modalWindowInsets> (SheetDefaults.kt:406)");
        }
        c4 c4VarC = v4.c(c4.INSTANCE, rVar, 6);
        u4.Companion companion = u4.INSTANCE;
        c4 c4VarH = f4.h(c4VarC, u4.l(companion.e(), companion.g()));
        if (t.k()) {
            t.n();
        }
        return c4VarH;
    }

    public final float m() {
        return PositionalThreshold;
    }

    public final long n(r rVar, int i15) {
        if (t.k()) {
            t.o(-2040719176, i15, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ScrimColor> (SheetDefaults.kt:381)");
        }
        long jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(g2.i(t0.f115251a.a(), rVar, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (t.k()) {
            t.n();
        }
        return jM9copywmQWz5c$default;
    }

    public final float o() {
        return SheetMaxWidth;
    }

    public final c4 p(r rVar, int i15) {
        if (t.k()) {
            t.o(-1434177499, i15, -1, "androidx.compose.material3.BottomSheetDefaults.<get-standardWindowInsets> (SheetDefaults.kt:401)");
        }
        c4 c4VarH = f4.h(v4.c(c4.INSTANCE, rVar, 6), u4.INSTANCE.e());
        if (t.k()) {
            t.n();
        }
        return c4VarH;
    }

    public final float q() {
        return VelocityThreshold;
    }
}
