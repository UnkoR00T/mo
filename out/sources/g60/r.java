package g60;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.u1;
import java.util.List;
import n3.l0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import w0.i1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u001a7\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000b\u001a\u000f\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000b\u001a\u000f\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u000b\u001a\u000f\u0010\u0010\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u000b\u001a\u000f\u0010\u0011\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u000b\u001a\u000f\u0010\u0012\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u000b\u001a\u000f\u0010\u0013\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u000b\u001a\u000f\u0010\u0014\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u000b\u001a\u000f\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u000b\u001a\u000f\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u000b\u001a\u000f\u0010\u0017\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u000b\u001a\u000f\u0010\u0018\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u000b\u001a\u000f\u0010\u0019\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0019\u0010\u000b\u001a\u000f\u0010\u001a\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lf3/m;", "modifier", "", "resBitmapBackground", "resBitmapDynamic", "Lm60/a;", "typeShader", "Loq/i0;", "X", "(Lf3/m;ILjava/lang/Integer;Lm60/a;Lm2/r;II)V", "r", "(Lm2/r;I)V", "t", "v", "x", "z", "B", ip.a.f96138c, "F", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "J", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "R", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "N", "T", "V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class r {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(int i15, p076m2.r rVar, int i16) {
        z(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void B(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(549949540);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(549949540, i15, -1, "pl.gov.coi.common.ui.hologram.HoloBackgroundDrivingII (HologramBackround.kt:118)");
            }
            X(null, c20.b.f22646a0, null, m60.a.HologramII, rVarH, 3072, 5);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g60.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.C(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(int i15, p076m2.r rVar, int i16) {
        B(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void D(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(1305380589);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1305380589, i15, -1, "pl.gov.coi.common.ui.hologram.HoloBackgroundFamily (HologramBackround.kt:126)");
            }
            int i16 = c20.b.f22682j0;
            X(null, i16, Integer.valueOf(i16), m60.a.Hologram, rVarH, 3072, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g60.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.E(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(int i15, p076m2.r rVar, int i16) {
        D(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void F(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-1015751283);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1015751283, i15, -1, "pl.gov.coi.common.ui.hologram.HoloBackgroundFamilyII (HologramBackround.kt:135)");
            }
            X(null, c20.b.f22682j0, null, m60.a.HologramII, rVarH, 3072, 5);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g60.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.G(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(int i15, p076m2.r rVar, int i16) {
        F(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void H(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-233112505);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-233112505, i15, -1, "pl.gov.coi.common.ui.hologram.HoloBackgroundIdentity (HologramBackround.kt:143)");
            }
            X(null, c20.b.f22722u0, Integer.valueOf(c20.b.f22725v0), m60.a.Hologram, rVarH, 3072, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g60.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.I(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(int i15, p076m2.r rVar, int i16) {
        H(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void J(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-2038864793);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2038864793, i15, -1, "pl.gov.coi.common.ui.hologram.HoloBackgroundIdentityII (HologramBackround.kt:152)");
            }
            X(null, c20.b.f22722u0, Integer.valueOf(c20.b.f22725v0), m60.a.HologramII, rVarH, 3072, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g60.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.K(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(int i15, p076m2.r rVar, int i16) {
        J(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void L(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(773169424);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(773169424, i15, -1, "pl.gov.coi.common.ui.hologram.HoloBackgroundPWZ (HologramBackround.kt:178)");
            }
            X(null, c20.b.C1, Integer.valueOf(c20.b.f22735y1), m60.a.Hologram, rVarH, 3072, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g60.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.M(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(int i15, p076m2.r rVar, int i16) {
        L(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void N(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-1369572624);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1369572624, i15, -1, "pl.gov.coi.common.ui.hologram.HoloBackgroundPWZII (HologramBackround.kt:187)");
            }
            X(null, c20.b.C1, null, m60.a.HologramII, rVarH, 3072, 5);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g60.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.O(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(int i15, p076m2.r rVar, int i16) {
        N(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void P(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-1313863496);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1313863496, i15, -1, "pl.gov.coi.common.ui.hologram.HoloBackgroundPensioner (HologramBackround.kt:161)");
            }
            X(null, c20.b.f22683j1, Integer.valueOf(c20.b.f22687k1), m60.a.Hologram, rVarH, 3072, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g60.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.Q(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(int i15, p076m2.r rVar, int i16) {
        P(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void R(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-1258481512);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1258481512, i15, -1, "pl.gov.coi.common.ui.hologram.HoloBackgroundPensionerII (HologramBackround.kt:170)");
            }
            X(null, c20.b.f22683j1, null, m60.a.HologramII, rVarH, 3072, 5);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g60.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.S(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(int i15, p076m2.r rVar, int i16) {
        R(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void T(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-981334526);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-981334526, i15, -1, "pl.gov.coi.common.ui.hologram.HoloBackgroundRefugee (HologramBackround.kt:195)");
            }
            X(null, c20.b.P1, Integer.valueOf(c20.b.Q1), m60.a.Hologram, rVarH, 3072, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g60.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.U(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(int i15, p076m2.r rVar, int i16) {
        T(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void V(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(474278754);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(474278754, i15, -1, "pl.gov.coi.common.ui.hologram.HoloBackgroundRefugeeII (HologramBackround.kt:204)");
            }
            X(null, c20.b.P1, null, m60.a.HologramII, rVarH, 3072, 5);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g60.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.W(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W(int i15, p076m2.r rVar, int i16) {
        V(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:63:0x0108  */
    /* JADX WARN: Code duplicated, block: B:64:0x010c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0164  */
    /* JADX WARN: Code duplicated, block: B:68:0x0179  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public static final void X(f3.m mVar, final int i15, Integer num, final m60.a aVar, p076m2.r rVar, final int i16, final int i17) {
        f3.m mVar2;
        int i18;
        Integer num2;
        boolean z15;
        final f3.m mVar3;
        final Integer num3;
        d5 d5VarM;
        f3.m mVar4;
        List listT;
        f3.m mVar5;
        Context context;
        Object objE;
        er.a<androidx.compose.ui.node.c> aVarB;
        int i19;
        p076m2.r rVarH = rVar.h(639027528);
        int i25 = i17 & 1;
        if (i25 != 0) {
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
            i18 |= rVarH.c(i15) ? 32 : 16;
        }
        int i26 = i17 & 4;
        if (i26 == 0) {
            if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                num2 = num;
                i18 |= rVarH.W(num2) ? 256 : 128;
            }
            if ((i16 & 3072) == 0) {
                if (rVarH.c(aVar.ordinal())) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i18 |= i19;
            }
            if ((i18 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i18 & 1)) {
                if (i25 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i26 != 0) {
                    num2 = null;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(639027528, i18, -1, "pl.gov.coi.common.ui.hologram.HologramBackground (HologramBackround.kt:39)");
                }
                if (((Boolean) rVarH.N(u1.a())).booleanValue()) {
                    rVarH.X(1974256148);
                    context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = y5.b.b(p082nUL.y.b(context, i15), 0, 0, null, 7, null);
                        rVarH.v(objE);
                    }
                    Bitmap bitmap = (Bitmap) objE;
                    f3.c cVarB = f3.c.INSTANCE.b();
                    f3.m.Companion companion = f3.m.INSTANCE;
                    w0 w0VarI = d1.r.i(cVarB, false);
                    int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT = rVarH.t();
                    f3.m mVarE = f3.j.e(rVarH, companion);
                    androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion2.b();
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
                    n6.i(rVarC, w0VarI, companion2.d());
                    n6.i(rVarC, e0VarT, companion2.f());
                    n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                    n6.g(rVarC, companion2.a());
                    n6.i(rVarC, mVarE, companion2.e());
                    d1.x xVar = d1.x.f39368a;
                    num3 = num2;
                    i1.g(l0.c(bitmap), "bitmap", androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), null, p036e4.l.INSTANCE.b(), 0.0f, null, 0, rVarH, 25008, 232);
                    rVarH = rVarH;
                    rVarH.x();
                    rVarH.R();
                    mVar5 = mVar4;
                } else {
                    num3 = num2;
                    rVarH.X(1974800229);
                    listT = pq.v.t(Integer.valueOf(i15));
                    if (num3 != null) {
                        listT.add(num3);
                    }
                    mVar5 = mVar4;
                    t60.g.g(mVar5, listT, aVar, ((Boolean) rVarH.N(u1.a())).booleanValue(), rVarH, (i18 & 14) | ((i18 >> 3) & 896), 0);
                    rVarH.R();
                }
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar3 = mVar5;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                num3 = num2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: g60.h
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return r.Y(mVar3, i15, num3, aVar, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= MLKEMEngine.KyberPolyBytes;
        num2 = num;
        if ((i16 & 3072) == 0) {
            if (rVarH.c(aVar.ordinal())) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i18 |= i19;
        }
        if ((i18 & 1171) != 1170) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i18 & 1)) {
            if (i25 != 0) {
                mVar4 = f3.m.INSTANCE;
            } else {
                mVar4 = mVar2;
            }
            if (i26 != 0) {
                num2 = null;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(639027528, i18, -1, "pl.gov.coi.common.ui.hologram.HologramBackground (HologramBackround.kt:39)");
            }
            if (((Boolean) rVarH.N(u1.a())).booleanValue()) {
                rVarH.X(1974256148);
                context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = y5.b.b(p082nUL.y.b(context, i15), 0, 0, null, 7, null);
                    rVarH.v(objE);
                }
                Bitmap bitmap2 = (Bitmap) objE;
                f3.c cVarB2 = f3.c.INSTANCE.b();
                f3.m.Companion companion3 = f3.m.INSTANCE;
                w0 w0VarI2 = d1.r.i(cVarB2, false);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, companion3);
                androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion4.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC2 = n6.c(rVarH);
                n6.i(rVarC2, w0VarI2, companion4.d());
                n6.i(rVarC2, e0VarT2, companion4.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
                n6.g(rVarC2, companion4.a());
                n6.i(rVarC2, mVarE2, companion4.e());
                d1.x xVar2 = d1.x.f39368a;
                num3 = num2;
                i1.g(l0.c(bitmap2), "bitmap", androidx.compose.foundation.layout.d.f(companion3, 0.0f, 1, null), null, p036e4.l.INSTANCE.b(), 0.0f, null, 0, rVarH, 25008, 232);
                rVarH = rVarH;
                rVarH.x();
                rVarH.R();
                mVar5 = mVar4;
            } else {
                num3 = num2;
                rVarH.X(1974800229);
                listT = pq.v.t(Integer.valueOf(i15));
                if (num3 != null) {
                    listT.add(num3);
                }
                mVar5 = mVar4;
                t60.g.g(mVar5, listT, aVar, ((Boolean) rVarH.N(u1.a())).booleanValue(), rVarH, (i18 & 14) | ((i18 >> 3) & 896), 0);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            mVar3 = mVar5;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            num3 = num2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g60.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.Y(mVar3, i15, num3, aVar, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y(f3.m mVar, int i15, Integer num, m60.a aVar, int i16, int i17, p076m2.r rVar, int i18) {
        X(mVar, i15, num, aVar, rVar, g4.a(i16 | 1), i17);
        return i0.f148189a;
    }

    public static final void r(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(740579252);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(740579252, i15, -1, "pl.gov.coi.common.ui.hologram.HoloBackgroundAdvocate (HologramBackround.kt:75)");
            }
            X(null, c20.b.f22645a, Integer.valueOf(c20.b.f22649b), m60.a.Hologram, rVarH, 3072, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g60.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.s(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(int i15, p076m2.r rVar, int i16) {
        r(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void t(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(1671010452);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1671010452, i15, -1, "pl.gov.coi.common.ui.hologram.HoloBackgroundAdvocateII (HologramBackround.kt:84)");
            }
            X(null, c20.b.f22645a, null, m60.a.HologramII, rVarH, 3072, 5);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g60.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.u(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(int i15, p076m2.r rVar, int i16) {
        t(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void v(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-1278498540);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1278498540, i15, -1, "pl.gov.coi.common.ui.hologram.HoloBackgroundDeputy (HologramBackround.kt:92)");
            }
            X(null, c20.b.P, Integer.valueOf(c20.b.Q), m60.a.Hologram, rVarH, 3072, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g60.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.w(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(int i15, p076m2.r rVar, int i16) {
        v(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void x(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-1632497164);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1632497164, i15, -1, "pl.gov.coi.common.ui.hologram.HoloBackgroundDeputyII (HologramBackround.kt:101)");
            }
            X(null, c20.b.P, null, m60.a.HologramII, rVarH, 3072, 5);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g60.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.y(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(int i15, p076m2.r rVar, int i16) {
        x(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void z(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(2098070404);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2098070404, i15, -1, "pl.gov.coi.common.ui.hologram.HoloBackgroundDriving (HologramBackround.kt:109)");
            }
            X(null, c20.b.f22646a0, Integer.valueOf(c20.b.f22650b0), m60.a.Hologram, rVarH, 3072, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g60.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.A(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
