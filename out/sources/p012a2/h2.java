package p012a2;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.a;
import c5.h;
import er.l;
import er.p;
import f3.m;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/painter/a;", "painter", "", "contentDescription", "Lf3/m;", "modifier", "Landroidx/compose/ui/graphics/Color;", "tint", "Loq/i0;", "c", "(Landroidx/compose/ui/graphics/painter/a;Ljava/lang/String;Lf3/m;JLm2/r;II)V", "f", "(Lf3/m;Landroidx/compose/ui/graphics/painter/a;)Lf3/m;", "Lm3/k;", "", "g", "(J)Z", "a", "Lf3/m;", "DefaultIconSizeModifier", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m f1594a = d.t(m.INSTANCE, h.n(24));

    /* JADX WARN: Code duplicated, block: B:101:0x0193  */
    /* JADX WARN: Code duplicated, block: B:104:0x019e  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x0103  */
    /* JADX WARN: Code duplicated, block: B:80:0x010f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0113  */
    /* JADX WARN: Code duplicated, block: B:85:0x012a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0136  */
    /* JADX WARN: Code duplicated, block: B:88:0x0138  */
    /* JADX WARN: Code duplicated, block: B:93:0x0147  */
    /* JADX WARN: Code duplicated, block: B:96:0x015b  */
    /* JADX WARN: Code duplicated, block: B:99:0x018c  */
    public static final void c(final a aVar, final String str, m mVar, long j15, r rVar, final int i15, final int i16) {
        int i17;
        m mVar2;
        long j16;
        boolean z15;
        final m mVar3;
        final long j17;
        d5 d5VarM;
        m mVar4;
        long jM9copywmQWz5c$default;
        m mVar5;
        boolean z16;
        Object objE;
        long j18;
        m mVarD;
        boolean z17;
        Object objE2;
        int i18;
        r rVarH = rVar.h(-1142959010);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(aVar) ? 4 : 2) | i15;
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
                        jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(((Color) rVarH.N(m1.a())).m20unboximpl(), ((Number) rVarH.N(l1.c())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i17 &= -7169;
                    } else {
                        jM9copywmQWz5c$default = j16;
                    }
                    mVar5 = mVar4;
                } else {
                    rVarH.O();
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                    }
                    long j19 = j16;
                    mVar5 = mVar2;
                    jM9copywmQWz5c$default = j19;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-1142959010, i17, -1, "androidx.compose.material.Icon (Icon.kt:134)");
                }
                z16 = (((i17 & 7168) ^ 3072) <= 2048 && rVarH.d(jM9copywmQWz5c$default)) || (i17 & 3072) == 2048;
                objE = rVarH.E();
                if (!z16 || objE == r.INSTANCE.a()) {
                    if (Color.m11equalsimpl0(jM9copywmQWz5c$default, Color.INSTANCE.h())) {
                        j18 = jM9copywmQWz5c$default;
                        objE = null;
                    } else {
                        j18 = jM9copywmQWz5c$default;
                        objE = n1.Companion.b(n1.INSTANCE, j18, 0, 2, null);
                    }
                    rVarH.v(objE);
                } else {
                    j18 = jM9copywmQWz5c$default;
                }
                n1 n1Var = (n1) objE;
                if (str != null) {
                    rVarH.X(609219782);
                    m.Companion companion = m.INSTANCE;
                    if ((i17 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objE2 = rVarH.E();
                    if (z17 || objE2 == r.INSTANCE.a()) {
                        objE2 = new l() { // from class: a2.f2
                            @Override // er.l
                            public final Object b(Object obj) {
                                return h2.d(str, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    mVarD = v.d(companion, false, (l) objE2, 1, null);
                    rVarH.R();
                } else {
                    rVarH.X(609378564);
                    rVarH.R();
                    mVarD = m.INSTANCE;
                }
                d1.r.b(androidx.compose.ui.draw.a.b(f(z1.h(mVar5), aVar), aVar, false, null, p036e4.l.INSTANCE.e(), 0.0f, n1Var, 22, null).u(mVarD), rVarH, 0);
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
                d5VarM.a(new p() { // from class: a2.g2
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h2.e(aVar, str, mVar3, j17, i15, i16, (r) obj, ((Integer) obj2).intValue());
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
                    jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(((Color) rVarH.N(m1.a())).m20unboximpl(), ((Number) rVarH.N(l1.c())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                    i17 &= -7169;
                } else {
                    jM9copywmQWz5c$default = j16;
                }
                mVar5 = mVar4;
            } else {
                if (i19 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i16 & 8) != 0) {
                    jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(((Color) rVarH.N(m1.a())).m20unboximpl(), ((Number) rVarH.N(l1.c())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                    i17 &= -7169;
                } else {
                    jM9copywmQWz5c$default = j16;
                }
                mVar5 = mVar4;
            }
            rVarH.y();
            if (t.k()) {
                t.o(-1142959010, i17, -1, "androidx.compose.material.Icon (Icon.kt:134)");
            }
            if (((i17 & 7168) ^ 3072) <= 2048) {
            }
            objE = rVarH.E();
            if (z16) {
                if (Color.m11equalsimpl0(jM9copywmQWz5c$default, Color.INSTANCE.h())) {
                    j18 = jM9copywmQWz5c$default;
                    objE = null;
                } else {
                    j18 = jM9copywmQWz5c$default;
                    objE = n1.Companion.b(n1.INSTANCE, j18, 0, 2, null);
                }
                rVarH.v(objE);
            } else {
                if (Color.m11equalsimpl0(jM9copywmQWz5c$default, Color.INSTANCE.h())) {
                    j18 = jM9copywmQWz5c$default;
                    objE = null;
                } else {
                    j18 = jM9copywmQWz5c$default;
                    objE = n1.Companion.b(n1.INSTANCE, j18, 0, 2, null);
                }
                rVarH.v(objE);
            }
            n1 n1Var2 = (n1) objE;
            if (str != null) {
                rVarH.X(609219782);
                m.Companion companion2 = m.INSTANCE;
                if ((i17 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objE2 = rVarH.E();
                if (z17) {
                    objE2 = new l() { // from class: a2.f2
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h2.d(str, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new l() { // from class: a2.f2
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h2.d(str, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                mVarD = v.d(companion2, false, (l) objE2, 1, null);
                rVarH.R();
            } else {
                rVarH.X(609378564);
                rVarH.R();
                mVarD = m.INSTANCE;
            }
            d1.r.b(androidx.compose.ui.draw.a.b(f(z1.h(mVar5), aVar), aVar, false, null, p036e4.l.INSTANCE.e(), 0.0f, n1Var2, 22, null).u(mVarD), rVarH, 0);
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
            d5VarM.a(new p() { // from class: a2.g2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h2.e(aVar, str, mVar3, j17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(String str, i0 i0Var) {
        f0.c0(i0Var, str);
        f0.r0(i0Var, n4.l.INSTANCE.e());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(a aVar, String str, m mVar, long j15, int i15, int i16, r rVar, int i17) {
        c(aVar, str, mVar, j15, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final m f(m mVar, a aVar) {
        return mVar.u((k.f(aVar.getIntrinsicSize(), k.INSTANCE.a()) || g(aVar.getIntrinsicSize())) ? f1594a : m.INSTANCE);
    }

    private static final boolean g(long j15) {
        return Float.isInfinite(Float.intBitsToFloat((int) (j15 >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)));
    }
}
