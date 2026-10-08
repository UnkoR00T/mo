package g60;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.o2;
import java.util.List;
import n4.f0;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import w0.i1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"Lf3/m;", "modifier", "Lg60/a0;", "hologramEmblemSize", "Lmu/g;", "", "rotation", "", "enabledAnimation", "Loq/i0;", "q", "(Lf3/m;Lg60/a0;Lmu/g;ZLm2/r;II)V", "h", "(Lm2/r;I)V", "j", "(FLm2/r;I)V", "Lc5/h;", "height", "l", "(FFLm2/r;I)V", "o", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class z {
    private static final void h(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-687732396);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-687732396, i15, -1, "pl.gov.coi.common.ui.hologram.EmblemBackground (HologramEmblem.kt:67)");
            }
            i1.c(l4.c.c(c20.b.f22713r0, rVarH, 0), null, k3.a.a(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), 1.0f), null, p036e4.l.INSTANCE.c(), 0.0f, null, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 25008, 104);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g60.w
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.i(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(int i15, p076m2.r rVar, int i16) {
        h(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void j(final float f15, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-109901543);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.b(f15) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-109901543, i16, -1, "pl.gov.coi.common.ui.hologram.EmblemEdgesLayer (HologramEmblem.kt:79)");
            }
            i1.c(l4.c.c(c20.b.f22710q0, rVarH, 0), null, k3.a.a(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), f15 / 20), null, p036e4.l.INSTANCE.c(), 0.0f, null, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 24624, 104);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g60.u
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.k(f15, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(float f15, int i15, p076m2.r rVar, int i16) {
        j(f15, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void l(final float f15, final float f16, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-815495379);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.b(f15) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.b(f16) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-815495379, i16, -1, "pl.gov.coi.common.ui.hologram.EmblemGradientLayer (HologramEmblem.kt:91)");
            }
            double d15 = ((double) (f16 * f15)) / 3.5d;
            Color.Companion companion = Color.INSTANCE;
            List<Color> listQ = pq.v.q(Color.m0boximpl(companion.g()), Color.m0boximpl(companion.d()), Color.m0boximpl(companion.g()), Color.m0boximpl(companion.c()), Color.m0boximpl(companion.g()), Color.m0boximpl(companion.j()), Color.m0boximpl(companion.g()), Color.m0boximpl(companion.f()), Color.m0boximpl(companion.g()));
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarA = k3.f.a(a3.r(androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, c5.h.n(f15 / 15), 7, null), l1.h.e(0, 0, 20, 20, 3, null));
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion3.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarA);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.x xVar = d1.x.f39368a;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(k3.r.a(k3.q.a(companion2, f16), 2.0f), 0.0f, 1, null);
            w0 w0VarI2 = d1.r.i(companion3.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarF);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarI2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            f3.m mVarA2 = k3.r.a(w0.i.b(companion2, androidx.compose.ui.graphics.c.INSTANCE.f(listQ, (float) d15, (float) (d15 + ((double) (4 * f15))), androidx.compose.ui.graphics.k.INSTANCE.c()), null, 0.3f, 2, null), 2.0f);
            boolean z15 = (i16 & 112) == 32;
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: g60.x
                    @Override // er.l
                    public final Object b(Object obj) {
                        return z.m(f16, (c5.d) obj);
                    }
                };
                rVarH.v(objE);
            }
            d1.r.b(androidx.compose.foundation.layout.d.f(o2.c(mVarA2, (er.l) objE), 0.0f, 1, null), rVarH, 0);
            rVarH.x();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g60.y
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.n(f15, f16, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5.n m(float f15, c5.d dVar) {
        int iX0 = dVar.X0(c5.h.n(f15));
        return c5.n.c(c5.n.d((((long) dVar.X0(c5.h.n(f15))) & BodyPartID.bodyIdMax) | (((long) iX0) << 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(float f15, float f16, int i15, p076m2.r rVar, int i16) {
        l(f15, f16, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void o(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-2096696890);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2096696890, i15, -1, "pl.gov.coi.common.ui.hologram.EmblemTopLayer (HologramEmblem.kt:147)");
            }
            i1.c(l4.c.c(c20.b.f22716s0, rVarH, 0), null, androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), null, p036e4.l.INSTANCE.c(), 0.0f, null, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 25008, 104);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g60.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.p(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(int i15, p076m2.r rVar, int i16) {
        o(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x0111  */
    /* JADX WARN: Code duplicated, block: B:70:0x011d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0121  */
    /* JADX WARN: Code duplicated, block: B:74:0x0165  */
    /* JADX WARN: Code duplicated, block: B:77:0x019b  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x0205  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void q(f3.m mVar, final a0 a0Var, final mu.g<Float> gVar, boolean z15, p076m2.r rVar, final int i15, final int i16) {
        f3.m mVar2;
        int i17;
        boolean z16;
        boolean z17;
        final f3.m mVar3;
        final boolean z18;
        d5 d5VarM;
        f3.m mVar4;
        boolean z19;
        f6 f6VarB;
        Float f15;
        er.a<androidx.compose.ui.node.c> aVarB;
        Object objE;
        er.a<androidx.compose.ui.node.c> aVarB2;
        p076m2.r rVarH = rVar.h(-230218682);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.c(a0Var.ordinal()) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(gVar) ? 256 : 128;
        }
        int i19 = i16 & 8;
        if (i19 == 0) {
            if ((i15 & 3072) == 0) {
                z16 = z15;
                i17 |= rVarH.a(z16) ? 2048 : 1024;
            }
            if ((i17 & 1171) != 1170) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i18 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i19 != 0) {
                    z19 = true;
                } else {
                    z19 = z16;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-230218682, i17, -1, "pl.gov.coi.common.ui.hologram.HologramEmblem (HologramEmblem.kt:41)");
                }
                if (gVar == null) {
                    rVarH.X(618209133);
                    rVarH.R();
                    f6VarB = null;
                } else {
                    rVarH.X(2098152212);
                    f6VarB = m7.b.b(gVar, Float.valueOf(0.0f), null, null, null, rVarH, ((i17 >> 6) & 14) | 48, 14);
                    rVarH.R();
                }
                if (f6VarB != null) {
                    f15 = (Float) f6VarB.getValue();
                } else {
                    f15 = null;
                }
                if (!z19) {
                    f15 = null;
                }
                float fFloatValue = f15 != null ? f15.floatValue() : 0.0f;
                float fJ = c5.k.j(a0Var.getDpSize());
                float fI = c5.k.i(a0Var.getDpSize());
                f3.m.Companion companion = f3.m.INSTANCE;
                d1.i.n nVarK = d1.i.f39152a.k();
                f3.c.Companion companion2 = f3.c.INSTANCE;
                w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, companion);
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
                p076m2.r rVarC = n6.c(rVarH);
                n6.i(rVarC, w0VarA, companion3.d());
                n6.i(rVarC, e0VarT, companion3.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
                n6.g(rVarC, companion3.a());
                n6.i(rVarC, mVarE, companion3.e());
                d1.i0 i0Var = d1.i0.f39176a;
                f3.m mVarI = androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.y(mVar4, fJ), fI);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.l() { // from class: g60.s
                        @Override // er.l
                        public final Object b(Object obj) {
                            return z.r((n4.i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                f3.m mVarB = k3.f.b(n4.v.d(mVarI, false, (er.l) objE, 1, null));
                w0 w0VarI = d1.r.i(companion2.o(), false);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, mVarB);
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
                p076m2.r rVarC2 = n6.c(rVarH);
                n6.i(rVarC2, w0VarI, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                d1.x xVar = d1.x.f39368a;
                h(rVarH, 0);
                j(fFloatValue, rVarH, 0);
                l(fI, fFloatValue, rVarH, 0);
                o(rVarH, 0);
                rVarH.x();
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar3 = mVar4;
                z18 = z19;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                z18 = z16;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: g60.t
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return z.s(mVar3, a0Var, gVar, z18, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        z16 = z15;
        if ((i17 & 1171) != 1170) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            if (i18 != 0) {
                mVar4 = f3.m.INSTANCE;
            } else {
                mVar4 = mVar2;
            }
            if (i19 != 0) {
                z19 = true;
            } else {
                z19 = z16;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-230218682, i17, -1, "pl.gov.coi.common.ui.hologram.HologramEmblem (HologramEmblem.kt:41)");
            }
            if (gVar == null) {
                rVarH.X(618209133);
                rVarH.R();
                f6VarB = null;
            } else {
                rVarH.X(2098152212);
                f6VarB = m7.b.b(gVar, Float.valueOf(0.0f), null, null, null, rVarH, ((i17 >> 6) & 14) | 48, 14);
                rVarH.R();
            }
            if (f6VarB != null) {
                f15 = (Float) f6VarB.getValue();
            } else {
                f15 = null;
            }
            if (!z19) {
                f15 = null;
            }
            if (f15 != null) {
            }
            float fJ2 = c5.k.j(a0Var.getDpSize());
            float fI2 = c5.k.i(a0Var.getDpSize());
            f3.m.Companion companion4 = f3.m.INSTANCE;
            d1.i.n nVarK2 = d1.i.f39152a.k();
            f3.c.Companion companion5 = f3.c.INSTANCE;
            w0 w0VarA2 = d1.e0.a(nVarK2, companion5.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, companion4);
            androidx.compose.ui.node.c.Companion companion6 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion6.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarA2, companion6.d());
            n6.i(rVarC3, e0VarT3, companion6.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion6.c());
            n6.g(rVarC3, companion6.a());
            n6.i(rVarC3, mVarE3, companion6.e());
            d1.i0 i0Var2 = d1.i0.f39176a;
            f3.m mVarI2 = androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.y(mVar4, fJ2), fI2);
            objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: g60.s
                    @Override // er.l
                    public final Object b(Object obj) {
                        return z.r((n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f3.m mVarB2 = k3.f.b(n4.v.d(mVarI2, false, (er.l) objE, 1, null));
            w0 w0VarI2 = d1.r.i(companion5.o(), false);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT4 = rVarH.t();
            f3.m mVarE4 = f3.j.e(rVarH, mVarB2);
            aVarB2 = companion6.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC4 = n6.c(rVarH);
            n6.i(rVarC4, w0VarI2, companion6.d());
            n6.i(rVarC4, e0VarT4, companion6.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion6.c());
            n6.g(rVarC4, companion6.a());
            n6.i(rVarC4, mVarE4, companion6.e());
            d1.x xVar2 = d1.x.f39368a;
            h(rVarH, 0);
            j(fFloatValue, rVarH, 0);
            l(fI2, fFloatValue, rVarH, 0);
            o(rVarH, 0);
            rVarH.x();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            mVar3 = mVar4;
            z18 = z19;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            z18 = z16;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g60.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.s(mVar3, a0Var, gVar, z18, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(n4.i0 i0Var) {
        f0.c0(i0Var, c70.a.f23835a.a().X().getText());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(f3.m mVar, a0 a0Var, mu.g gVar, boolean z15, int i15, int i16, p076m2.r rVar, int i17) {
        q(mVar, a0Var, gVar, z15, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
