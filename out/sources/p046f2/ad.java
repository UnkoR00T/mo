package p046f2;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.a;
import androidx.compose.ui.graphics.vector.VectorPainter;
import er.l;
import er.p;
import f3.m;
import l2.a1;
import m3.k;
import n3.n1;
import n3.z1;
import n4.f0;
import n4.i0;
import n4.v;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import t3.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lt3/d;", "imageVector", "", "contentDescription", "Lf3/m;", "modifier", "Landroidx/compose/ui/graphics/Color;", "tint", "Loq/i0;", "e", "(Lt3/d;Ljava/lang/String;Lf3/m;JLm2/r;II)V", "Landroidx/compose/ui/graphics/painter/a;", "painter", "d", "(Landroidx/compose/ui/graphics/painter/a;Ljava/lang/String;Lf3/m;JLm2/r;II)V", "i", "(Lf3/m;Landroidx/compose/ui/graphics/painter/a;)Lf3/m;", "Lm3/k;", "", "j", "(J)Z", "a", "Lf3/m;", "DefaultIconSizeModifier", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m f55162a = d.t(m.INSTANCE, a1.f114275a.d());

    /* JADX WARN: Code duplicated, block: B:102:0x0179  */
    /* JADX WARN: Code duplicated, block: B:104:0x0180  */
    /* JADX WARN: Code duplicated, block: B:107:0x018b  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:84:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x0117  */
    /* JADX WARN: Code duplicated, block: B:90:0x0123  */
    /* JADX WARN: Code duplicated, block: B:91:0x0125  */
    /* JADX WARN: Code duplicated, block: B:96:0x0134  */
    /* JADX WARN: Code duplicated, block: B:99:0x0148  */
    public static final void d(final a aVar, final String str, m mVar, long j15, r rVar, final int i15, final int i16) {
        int i17;
        m mVar2;
        long j16;
        boolean z15;
        final m mVar3;
        final long j17;
        d5 d5VarM;
        m mVar4;
        long jM20unboximpl;
        m mVar5;
        boolean z16;
        Object objE;
        long j18;
        m mVarD;
        boolean z17;
        Object objE2;
        int i18;
        r rVarH = rVar.h(-2142239481);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(str) ? 32 : 16;
        }
        int i19 = i16 & 4;
        if (i19 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 256 : 128;
            }
            if ((i15 & 3072) == 0) {
                j16 = j15;
                if ((i16 & 8) == 0 || !rVarH.d(j16)) {
                    i18 = 1024;
                } else {
                    i18 = 2048;
                }
                i17 |= i18;
            } else {
                j16 = j15;
            }
            if ((i17 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0 || rVarH.Q()) {
                    if (i19 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i16 & 8) != 0) {
                        jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                        i17 &= -7169;
                    } else {
                        jM20unboximpl = j16;
                    }
                    mVar5 = mVar4;
                } else {
                    rVarH.O();
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                    }
                    long j19 = j16;
                    mVar5 = mVar2;
                    jM20unboximpl = j19;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-2142239481, i17, -1, "androidx.compose.material3.Icon (Icon.kt:142)");
                }
                z16 = (((i17 & 7168) ^ 3072) <= 2048 && rVarH.d(jM20unboximpl)) || (i17 & 3072) == 2048;
                objE = rVarH.E();
                if (!z16 || objE == r.INSTANCE.a()) {
                    if (Color.m11equalsimpl0(jM20unboximpl, Color.INSTANCE.h())) {
                        j18 = jM20unboximpl;
                        objE = null;
                    } else {
                        j18 = jM20unboximpl;
                        objE = n1.Companion.b(n1.INSTANCE, j18, 0, 2, null);
                    }
                    rVarH.v(objE);
                } else {
                    j18 = jM20unboximpl;
                }
                n1 n1Var = (n1) objE;
                if (str != null) {
                    rVarH.X(-537002883);
                    m.Companion companion = m.INSTANCE;
                    if ((i17 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objE2 = rVarH.E();
                    if (z17 || objE2 == r.INSTANCE.a()) {
                        objE2 = new l() { // from class: f2.yc
                            @Override // er.l
                            public final Object b(Object obj) {
                                return ad.g(str, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    mVarD = v.d(companion, false, (l) objE2, 1, null);
                    rVarH.R();
                } else {
                    rVarH.X(-536844101);
                    rVarH.R();
                    mVarD = m.INSTANCE;
                }
                d1.r.b(androidx.compose.ui.draw.a.b(i(z1.h(mVar5), aVar), aVar, false, null, p036e4.l.INSTANCE.e(), 0.0f, n1Var, 22, null).u(mVarD), rVarH, 0);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar5;
                j17 = j18;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                j17 = j16;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.zc
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ad.h(aVar, str, mVar3, j17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        if ((i15 & 3072) == 0) {
            j16 = j15;
            if ((i16 & 8) == 0) {
                i18 = 1024;
            } else {
                i18 = 1024;
            }
            i17 |= i18;
        } else {
            j16 = j15;
        }
        if ((i17 & 1171) != 1170) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i19 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i16 & 8) != 0) {
                    jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                    i17 &= -7169;
                } else {
                    jM20unboximpl = j16;
                }
                mVar5 = mVar4;
            } else {
                if (i19 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i16 & 8) != 0) {
                    jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                    i17 &= -7169;
                } else {
                    jM20unboximpl = j16;
                }
                mVar5 = mVar4;
            }
            rVarH.y();
            if (t.k()) {
                t.o(-2142239481, i17, -1, "androidx.compose.material3.Icon (Icon.kt:142)");
            }
            if (((i17 & 7168) ^ 3072) <= 2048) {
            }
            objE = rVarH.E();
            if (z16) {
                if (Color.m11equalsimpl0(jM20unboximpl, Color.INSTANCE.h())) {
                    j18 = jM20unboximpl;
                    objE = null;
                } else {
                    j18 = jM20unboximpl;
                    objE = n1.Companion.b(n1.INSTANCE, j18, 0, 2, null);
                }
                rVarH.v(objE);
            } else {
                if (Color.m11equalsimpl0(jM20unboximpl, Color.INSTANCE.h())) {
                    j18 = jM20unboximpl;
                    objE = null;
                } else {
                    j18 = jM20unboximpl;
                    objE = n1.Companion.b(n1.INSTANCE, j18, 0, 2, null);
                }
                rVarH.v(objE);
            }
            n1 n1Var2 = (n1) objE;
            if (str != null) {
                rVarH.X(-537002883);
                m.Companion companion2 = m.INSTANCE;
                if ((i17 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objE2 = rVarH.E();
                if (z17) {
                    objE2 = new l() { // from class: f2.yc
                        @Override // er.l
                        public final Object b(Object obj) {
                            return ad.g(str, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new l() { // from class: f2.yc
                        @Override // er.l
                        public final Object b(Object obj) {
                            return ad.g(str, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                mVarD = v.d(companion2, false, (l) objE2, 1, null);
                rVarH.R();
            } else {
                rVarH.X(-536844101);
                rVarH.R();
                mVarD = m.INSTANCE;
            }
            d1.r.b(androidx.compose.ui.draw.a.b(i(z1.h(mVar5), aVar), aVar, false, null, p036e4.l.INSTANCE.e(), 0.0f, n1Var2, 22, null).u(mVarD), rVarH, 0);
            if (t.k()) {
                t.n();
            }
            mVar3 = mVar5;
            j17 = j18;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            j17 = j16;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.zc
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return ad.h(aVar, str, mVar3, j17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:41:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0093  */
    /* JADX WARN: Code duplicated, block: B:60:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00de  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static final void e(final t3.d dVar, final String str, m mVar, long j15, r rVar, final int i15, final int i16) {
        int i17;
        final m mVar2;
        final long j16;
        boolean z15;
        d5 d5VarM;
        m mVar3;
        m mVar4;
        long jM20unboximpl;
        r rVarH = rVar.h(-126890956);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(dVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(str) ? 32 : 16;
        }
        int i18 = i16 & 4;
        if (i18 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 256 : 128;
            }
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    j16 = j15;
                    int i19 = rVarH.d(j16) ? 2048 : 1024;
                    i17 |= i19;
                } else {
                    j16 = j15;
                }
                i17 |= i19;
            } else {
                j16 = j15;
            }
            if ((i17 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0 || rVarH.Q()) {
                    if (i18 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        mVar4 = mVar3;
                        jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                    } else {
                        mVar4 = mVar3;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-126890956, i17, -1, "androidx.compose.material3.Icon (Icon.kt:69)");
                    }
                    d(q.g(dVar, rVarH, i17 & 14), str, mVar4, jM20unboximpl, rVarH, VectorPainter.f9984p | (i17 & 112) | (i17 & 896) | (i17 & 7168), 0);
                    if (t.k()) {
                        t.n();
                    }
                    mVar2 = mVar4;
                    j16 = jM20unboximpl;
                } else {
                    rVarH.O();
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                    }
                    mVar4 = mVar2;
                }
                jM20unboximpl = j16;
                rVarH.y();
                if (t.k()) {
                    t.o(-126890956, i17, -1, "androidx.compose.material3.Icon (Icon.kt:69)");
                }
                d(q.g(dVar, rVarH, i17 & 14), str, mVar4, jM20unboximpl, rVarH, VectorPainter.f9984p | (i17 & 112) | (i17 & 896) | (i17 & 7168), 0);
                if (t.k()) {
                    t.n();
                }
                mVar2 = mVar4;
                j16 = jM20unboximpl;
            } else {
                rVarH.O();
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.xc
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ad.f(dVar, str, mVar2, j16, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        if ((i15 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                j16 = j15;
                if (rVarH.d(j16)) {
                }
                i17 |= i19;
            } else {
                j16 = j15;
            }
            i17 |= i19;
        } else {
            j16 = j15;
        }
        if ((i17 & 1171) != 1170) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i18 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if ((i16 & 8) != 0) {
                    i17 &= -7169;
                    mVar4 = mVar3;
                    jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                } else {
                    mVar4 = mVar3;
                    jM20unboximpl = j16;
                }
            } else {
                if (i18 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if ((i16 & 8) != 0) {
                    i17 &= -7169;
                    mVar4 = mVar3;
                    jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                } else {
                    mVar4 = mVar3;
                    jM20unboximpl = j16;
                }
            }
            rVarH.y();
            if (t.k()) {
                t.o(-126890956, i17, -1, "androidx.compose.material3.Icon (Icon.kt:69)");
            }
            d(q.g(dVar, rVarH, i17 & 14), str, mVar4, jM20unboximpl, rVarH, VectorPainter.f9984p | (i17 & 112) | (i17 & 896) | (i17 & 7168), 0);
            if (t.k()) {
                t.n();
            }
            mVar2 = mVar4;
            j16 = jM20unboximpl;
        } else {
            rVarH.O();
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.xc
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return ad.f(dVar, str, mVar2, j16, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(t3.d dVar, String str, m mVar, long j15, int i15, int i16, r rVar, int i17) {
        e(dVar, str, mVar, j15, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(String str, i0 i0Var) {
        f0.c0(i0Var, str);
        f0.r0(i0Var, n4.l.INSTANCE.e());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(a aVar, String str, m mVar, long j15, int i15, int i16, r rVar, int i17) {
        d(aVar, str, mVar, j15, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final m i(m mVar, a aVar) {
        return mVar.u((k.f(aVar.getIntrinsicSize(), k.INSTANCE.a()) || j(aVar.getIntrinsicSize())) ? f55162a : m.INSTANCE);
    }

    private static final boolean j(long j15) {
        return Float.isInfinite(Float.intBitsToFloat((int) (j15 >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)));
    }
}
