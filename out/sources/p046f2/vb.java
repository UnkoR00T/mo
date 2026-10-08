package p046f2;

import androidx.compose.ui.platform.g1;
import c5.d;
import c5.h;
import er.l;
import er.p;
import f3.m;
import m3.e;
import oq.a;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p3.f;
import w0.i;
import w0.z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lf3/m;", "modifier", "Lc5/h;", "thickness", "Landroidx/compose/ui/graphics/Color;", "color", "Loq/i0;", "h", "(Lf3/m;FJLm2/r;II)V", "k", "f", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class vb {
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00db  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ff  */
    @a
    public static final void f(m mVar, float f15, long j15, r rVar, final int i15, final int i16) {
        int i17;
        long j16;
        m mVar2;
        float fB;
        long jA;
        float fN;
        r rVarH = rVar.h(1562471785);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i19 = i16 & 2;
        if (i19 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= rVarH.b(f15) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i16 & 4) == 0) {
                j16 = j15;
                int i25 = rVarH.d(j16) ? 256 : 128;
                i17 |= i25;
            } else {
                j16 = j15;
            }
            i17 |= i25;
        } else {
            j16 = j15;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) == 0 || rVarH.Q()) {
                mVar2 = i18 != 0 ? m.INSTANCE : mVar;
                fB = i19 != 0 ? pb.f57269a.b() : f15;
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                    jA = pb.f57269a.a(rVarH, 6);
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1562471785, i17, -1, "androidx.compose.material3.Divider (Divider.kt:99)");
                }
                if (h.p(fB, h.INSTANCE.a())) {
                    rVarH.X(-1258401829);
                    fN = h.n(1.0f / ((d) rVarH.N(g1.f())).getDensity());
                    rVarH.R();
                } else {
                    rVarH.X(-1258335272);
                    rVarH.R();
                    fN = fB;
                }
                d1.r.b(i.d(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.h(mVar2, 0.0f, 1, null), fN), jA, null, 2, null), rVarH, 0);
                if (t.k()) {
                    t.n();
                }
            } else {
                rVarH.O();
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                }
                mVar2 = mVar;
                fB = f15;
            }
            jA = j16;
            rVarH.y();
            if (t.k()) {
                t.o(1562471785, i17, -1, "androidx.compose.material3.Divider (Divider.kt:99)");
            }
            if (h.p(fB, h.INSTANCE.a())) {
                rVarH.X(-1258401829);
                fN = h.n(1.0f / ((d) rVarH.N(g1.f())).getDensity());
                rVarH.R();
            } else {
                rVarH.X(-1258335272);
                rVarH.R();
                fN = fB;
            }
            d1.r.b(i.d(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.h(mVar2, 0.0f, 1, null), fN), jA, null, 2, null), rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            mVar2 = mVar;
            fB = f15;
            jA = j16;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            final m mVar3 = mVar2;
            final float f16 = fB;
            final long j17 = jA;
            d5VarM.a(new p() { // from class: f2.ub
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return vb.g(mVar3, f16, j17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(m mVar, float f15, long j15, int i15, int i16, r rVar, int i17) {
        f(mVar, f15, j15, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:81:0x0103  */
    /* JADX WARN: Code duplicated, block: B:84:0x010e  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final void h(m mVar, float f15, long j15, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        float f16;
        final long jA;
        boolean z15;
        boolean z16;
        m mVar3;
        final float fB;
        d5 d5VarM;
        boolean z17;
        boolean z18;
        Object objE;
        int i18;
        r rVarH = rVar.h(75144485);
        int i19 = i16 & 1;
        if (i19 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        int i25 = i16 & 2;
        if (i25 == 0) {
            if ((i15 & 48) == 0) {
                f16 = f15;
                i17 |= rVarH.b(f16) ? 32 : 16;
            }
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                jA = j15;
                if ((i16 & 4) == 0 || !rVarH.d(jA)) {
                    i18 = 128;
                } else {
                    i18 = 256;
                }
                i17 |= i18;
            } else {
                jA = j15;
            }
            z15 = true;
            if ((i17 & 147) != 146) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0 || rVarH.Q()) {
                    if (i19 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (i25 != 0) {
                        fB = pb.f57269a.b();
                    } else {
                        fB = f16;
                    }
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                        jA = pb.f57269a.a(rVarH, 6);
                    }
                } else {
                    rVarH.O();
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                    }
                    mVar3 = mVar2;
                    fB = f16;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(75144485, i17, -1, "androidx.compose.material3.HorizontalDivider (Divider.kt:53)");
                }
                m mVarI = androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.h(mVar3, 0.0f, 1, null), fB);
                if ((i17 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 || !rVarH.d(jA)) && (i17 & MLKEMEngine.KyberPolyBytes) != 256) {
                }
                z18 = z17 | z15;
                objE = rVarH.E();
                if (z18 || objE == r.INSTANCE.a()) {
                    objE = new l() { // from class: f2.qb
                        @Override // er.l
                        public final Object b(Object obj) {
                            return vb.i(fB, jA, (f) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                z.b(mVarI, (l) objE, rVarH, 0);
                if (t.k()) {
                    t.n();
                }
            } else {
                rVarH.O();
                mVar3 = mVar2;
                fB = f16;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final m mVar4 = mVar3;
                final float f17 = fB;
                final long j16 = jA;
                d5VarM.a(new p() { // from class: f2.rb
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return vb.j(mVar4, f17, j16, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        f16 = f15;
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            jA = j15;
            if ((i16 & 4) == 0) {
                i18 = 128;
            } else {
                i18 = 128;
            }
            i17 |= i18;
        } else {
            jA = j15;
        }
        z15 = true;
        if ((i17 & 147) != 146) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (rVarH.r(z16, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i19 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (i25 != 0) {
                    fB = pb.f57269a.b();
                } else {
                    fB = f16;
                }
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                    jA = pb.f57269a.a(rVarH, 6);
                }
            } else {
                if (i19 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (i25 != 0) {
                    fB = pb.f57269a.b();
                } else {
                    fB = f16;
                }
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                    jA = pb.f57269a.a(rVarH, 6);
                }
            }
            rVarH.y();
            if (t.k()) {
                t.o(75144485, i17, -1, "androidx.compose.material3.HorizontalDivider (Divider.kt:53)");
            }
            m mVarI2 = androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.h(mVar3, 0.0f, 1, null), fB);
            if ((i17 & 112) == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            z15 = ((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 ? false : false;
            z18 = z17 | z15;
            objE = rVarH.E();
            if (z18) {
                objE = new l() { // from class: f2.qb
                    @Override // er.l
                    public final Object b(Object obj) {
                        return vb.i(fB, jA, (f) obj);
                    }
                };
                rVarH.v(objE);
            } else {
                objE = new l() { // from class: f2.qb
                    @Override // er.l
                    public final Object b(Object obj) {
                        return vb.i(fB, jA, (f) obj);
                    }
                };
                rVarH.v(objE);
            }
            z.b(mVarI2, (l) objE, rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            mVar3 = mVar2;
            fB = f16;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            final m mVar5 = mVar3;
            final float f18 = fB;
            final long j17 = jA;
            d5VarM.a(new p() { // from class: f2.rb
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return vb.j(mVar5, f18, j17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(float f15, long j15, f fVar) {
        float fL2 = fVar.l2(f15);
        float f16 = 2;
        f.w1(fVar, j15, e.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fVar.l2(f15) / f16)) & BodyPartID.bodyIdMax)), e.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.a() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fVar.l2(f15) / f16)) & BodyPartID.bodyIdMax)), fL2, 0, null, 0.0f, null, 0, 496, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(m mVar, float f15, long j15, int i15, int i16, r rVar, int i17) {
        h(mVar, f15, j15, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:81:0x0103  */
    /* JADX WARN: Code duplicated, block: B:84:0x010e  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final void k(m mVar, float f15, long j15, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        float f16;
        final long jA;
        boolean z15;
        boolean z16;
        m mVar3;
        final float fB;
        d5 d5VarM;
        boolean z17;
        boolean z18;
        Object objE;
        int i18;
        r rVarH = rVar.h(-1534852205);
        int i19 = i16 & 1;
        if (i19 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        int i25 = i16 & 2;
        if (i25 == 0) {
            if ((i15 & 48) == 0) {
                f16 = f15;
                i17 |= rVarH.b(f16) ? 32 : 16;
            }
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                jA = j15;
                if ((i16 & 4) == 0 || !rVarH.d(jA)) {
                    i18 = 128;
                } else {
                    i18 = 256;
                }
                i17 |= i18;
            } else {
                jA = j15;
            }
            z15 = true;
            if ((i17 & 147) != 146) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0 || rVarH.Q()) {
                    if (i19 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (i25 != 0) {
                        fB = pb.f57269a.b();
                    } else {
                        fB = f16;
                    }
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                        jA = pb.f57269a.a(rVarH, 6);
                    }
                } else {
                    rVarH.O();
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                    }
                    mVar3 = mVar2;
                    fB = f16;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-1534852205, i17, -1, "androidx.compose.material3.VerticalDivider (Divider.kt:81)");
                }
                m mVarY = androidx.compose.foundation.layout.d.y(androidx.compose.foundation.layout.d.d(mVar3, 0.0f, 1, null), fB);
                if ((i17 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 || !rVarH.d(jA)) && (i17 & MLKEMEngine.KyberPolyBytes) != 256) {
                }
                z18 = z17 | z15;
                objE = rVarH.E();
                if (z18 || objE == r.INSTANCE.a()) {
                    objE = new l() { // from class: f2.sb
                        @Override // er.l
                        public final Object b(Object obj) {
                            return vb.l(fB, jA, (f) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                z.b(mVarY, (l) objE, rVarH, 0);
                if (t.k()) {
                    t.n();
                }
            } else {
                rVarH.O();
                mVar3 = mVar2;
                fB = f16;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final m mVar4 = mVar3;
                final float f17 = fB;
                final long j16 = jA;
                d5VarM.a(new p() { // from class: f2.tb
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return vb.m(mVar4, f17, j16, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        f16 = f15;
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            jA = j15;
            if ((i16 & 4) == 0) {
                i18 = 128;
            } else {
                i18 = 128;
            }
            i17 |= i18;
        } else {
            jA = j15;
        }
        z15 = true;
        if ((i17 & 147) != 146) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (rVarH.r(z16, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i19 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (i25 != 0) {
                    fB = pb.f57269a.b();
                } else {
                    fB = f16;
                }
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                    jA = pb.f57269a.a(rVarH, 6);
                }
            } else {
                if (i19 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (i25 != 0) {
                    fB = pb.f57269a.b();
                } else {
                    fB = f16;
                }
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                    jA = pb.f57269a.a(rVarH, 6);
                }
            }
            rVarH.y();
            if (t.k()) {
                t.o(-1534852205, i17, -1, "androidx.compose.material3.VerticalDivider (Divider.kt:81)");
            }
            m mVarY2 = androidx.compose.foundation.layout.d.y(androidx.compose.foundation.layout.d.d(mVar3, 0.0f, 1, null), fB);
            if ((i17 & 112) == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            z15 = ((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 ? false : false;
            z18 = z17 | z15;
            objE = rVarH.E();
            if (z18) {
                objE = new l() { // from class: f2.sb
                    @Override // er.l
                    public final Object b(Object obj) {
                        return vb.l(fB, jA, (f) obj);
                    }
                };
                rVarH.v(objE);
            } else {
                objE = new l() { // from class: f2.sb
                    @Override // er.l
                    public final Object b(Object obj) {
                        return vb.l(fB, jA, (f) obj);
                    }
                };
                rVarH.v(objE);
            }
            z.b(mVarY2, (l) objE, rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            mVar3 = mVar2;
            fB = f16;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            final m mVar5 = mVar3;
            final float f18 = fB;
            final long j17 = jA;
            d5VarM.a(new p() { // from class: f2.tb
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return vb.m(mVar5, f18, j17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(float f15, long j15, f fVar) {
        float fL2 = fVar.l2(f15);
        float f16 = 2;
        f.w1(fVar, j15, e.e((((long) Float.floatToRawIntBits(fVar.l2(f15) / f16)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax)), e.e((((long) Float.floatToRawIntBits(fVar.l2(f15) / f16)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.a() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax)), fL2, 0, null, 0.0f, null, 0, 496, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(m mVar, float f15, long j15, int i15, int i16, r rVar, int i17) {
        k(mVar, f15, j15, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
