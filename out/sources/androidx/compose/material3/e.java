package androidx.compose.material3;

import androidx.compose.material3.e;
import androidx.compose.ui.graphics.Color;
import er.p;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p046f2.C6462wg;
import p046f2.ColorScheme;
import p046f2.Shapes;
import p046f2.Typography;
import p046f2.oo;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import w0.n1;
import y2.m;
import z1.SelectionColors;
import z1.g3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\" \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\" \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00128\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u0012\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lf2/e2;", "colorScheme", "Lf2/si;", "shapes", "Lf2/bs;", "typography", "Lkotlin/Function0;", "Loq/i0;", "content", "i", "(Lf2/e2;Lf2/si;Lf2/bs;Ler/p;Lm2/r;II)V", "Landroidx/compose/material3/f;", "motionScheme", "h", "(Lf2/e2;Landroidx/compose/material3/f;Lf2/si;Lf2/bs;Ler/p;Lm2/r;II)V", "Lz1/e3;", "p", "(Lf2/e2;Lm2/r;I)Lz1/e3;", "Lm2/b4;", "", "a", "Lm2/b4;", "getLocalUsingExpressiveTheme", "()Lm2/b4;", "LocalUsingExpressiveTheme", "Landroidx/compose/material3/d$a;", "b", "get_localMaterialTheme$annotations", "()V", "_localMaterialTheme", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<Boolean> f9822a = d0.j(new er.a() { // from class: f2.td
        @Override // er.a
        public final Object a() {
            return Boolean.valueOf(e.g());
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b4<d.Values> f9823b = d0.j(new er.a() { // from class: f2.ud
        @Override // er.a
        public final Object a() {
            return e.n();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g() {
        return false;
    }

    public static final void h(ColorScheme colorScheme, f fVar, Shapes shapes, Typography typography, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15, final int i16) {
        ColorScheme colorSchemeA;
        int i17;
        f fVarC;
        Shapes shapesD;
        final Typography typographyE;
        r rVarH = rVar.h(904511636);
        if ((i15 & 6) == 0) {
            if ((i16 & 1) == 0) {
                colorSchemeA = colorScheme;
                int i18 = rVarH.W(colorSchemeA) ? 4 : 2;
                i17 = i18 | i15;
            } else {
                colorSchemeA = colorScheme;
            }
            i17 = i18 | i15;
        } else {
            colorSchemeA = colorScheme;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            if ((i16 & 2) == 0) {
                fVarC = fVar;
                int i19 = rVarH.W(fVarC) ? 32 : 16;
                i17 |= i19;
            } else {
                fVarC = fVar;
            }
            i17 |= i19;
        } else {
            fVarC = fVar;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i16 & 4) == 0) {
                shapesD = shapes;
                int i25 = rVarH.W(shapesD) ? 256 : 128;
                i17 |= i25;
            } else {
                shapesD = shapes;
            }
            i17 |= i25;
        } else {
            shapesD = shapes;
        }
        if ((i15 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                typographyE = typography;
                int i26 = rVarH.W(typographyE) ? 2048 : 1024;
                i17 |= i26;
            } else {
                typographyE = typography;
            }
            i17 |= i26;
        } else {
            typographyE = typography;
        }
        if ((i15 & 24576) == 0) {
            i17 |= rVarH.G(pVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (rVarH.r((i17 & 9363) != 9362, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) == 0 || rVarH.Q()) {
                if ((i16 & 1) != 0) {
                    colorSchemeA = d.f9816a.a(rVarH, 6);
                    i17 &= -15;
                }
                if ((i16 & 2) != 0) {
                    fVarC = d.f9816a.c(rVarH, 6);
                    i17 &= -113;
                }
                if ((i16 & 4) != 0) {
                    shapesD = d.f9816a.d(rVarH, 6);
                    i17 &= -897;
                }
                if ((i16 & 8) != 0) {
                    typographyE = d.f9816a.e(rVarH, 6);
                    i17 &= -7169;
                }
            } else {
                rVarH.O();
                if ((i16 & 1) != 0) {
                    i17 &= -15;
                }
                if ((i16 & 2) != 0) {
                    i17 &= -113;
                }
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                }
                if ((i16 & 8) != 0) {
                    i17 &= -7169;
                }
            }
            rVarH.y();
            if (t.k()) {
                t.o(904511636, i17, -1, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:97)");
            }
            d0.d(new c4[]{f9823b.d(new d.Values(colorSchemeA, typographyE, shapesD, fVarC)), n1.d().d(i.h(false, 0.0f, 0L, null, false, false, false, false, GF2Field.MASK, null)), g3.c().d(p(colorSchemeA, rVarH, i17 & 14))}, m.d(-1750539308, true, new p() { // from class: f2.vd
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.k(typographyE, pVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        final Shapes shapes2 = shapesD;
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            final ColorScheme colorScheme2 = colorSchemeA;
            final f fVar2 = fVarC;
            final Typography typography2 = typographyE;
            d5VarM.a(new p() { // from class: f2.wd
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.m(colorScheme2, fVar2, shapes2, typography2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void i(ColorScheme colorScheme, Shapes shapes, Typography typography, p<? super r, ? super Integer, i0> pVar, r rVar, final int i15, final int i16) {
        int i17;
        final p<? super r, ? super Integer, i0> pVar2;
        final Typography typography2;
        final Shapes shapes2;
        final ColorScheme colorScheme2;
        r rVarH = rVar.h(-449719819);
        if ((i15 & 6) == 0) {
            i17 = (((i16 & 1) == 0 && rVarH.W(colorScheme)) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= ((i16 & 2) == 0 && rVarH.W(shapes)) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= ((i16 & 4) == 0 && rVarH.W(typography)) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= rVarH.G(pVar) ? 2048 : 1024;
        }
        if (rVarH.r((i17 & 1171) != 1170, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) == 0 || rVarH.Q()) {
                if ((i16 & 1) != 0) {
                    colorScheme = d.f9816a.a(rVarH, 6);
                    i17 &= -15;
                }
                if ((i16 & 2) != 0) {
                    shapes = d.f9816a.d(rVarH, 6);
                    i17 &= -113;
                }
                if ((i16 & 4) != 0) {
                    typography = d.f9816a.e(rVarH, 6);
                    i17 &= -897;
                }
            } else {
                rVarH.O();
                if ((i16 & 1) != 0) {
                    i17 &= -15;
                }
                if ((i16 & 2) != 0) {
                    i17 &= -113;
                }
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                }
            }
            ColorScheme colorScheme3 = colorScheme;
            Shapes shapes3 = shapes;
            Typography typography3 = typography;
            rVarH.y();
            if (t.k()) {
                t.o(-449719819, i17, -1, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:61)");
            }
            int i18 = i17 << 3;
            h(colorScheme3, d.f9816a.c(rVarH, 6), shapes3, typography3, pVar, rVarH, (i17 & 14) | (i18 & 896) | (i18 & 7168) | (i18 & 57344), 0);
            pVar2 = pVar;
            if (t.k()) {
                t.n();
            }
            colorScheme2 = colorScheme3;
            shapes2 = shapes3;
            typography2 = typography3;
        } else {
            pVar2 = pVar;
            rVarH.O();
            typography2 = typography;
            shapes2 = shapes;
            colorScheme2 = colorScheme;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.sd
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.j(colorScheme2, shapes2, typography2, pVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(ColorScheme colorScheme, Shapes shapes, Typography typography, p pVar, int i15, int i16, r rVar, int i17) {
        i(colorScheme, shapes, typography, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(final Typography typography, final p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1750539308, i15, -1, "androidx.compose.material3.MaterialTheme.<anonymous> (MaterialTheme.kt:112)");
            }
            C6462wg.d(m.d(-241536773, true, new p() { // from class: f2.xd
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.l(typography, pVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, 6);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Typography typography, p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-241536773, i15, -1, "androidx.compose.material3.MaterialTheme.<anonymous>.<anonymous> (MaterialTheme.kt:113)");
            }
            oo.h(typography.getBodyLarge(), pVar, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(ColorScheme colorScheme, f fVar, Shapes shapes, Typography typography, p pVar, int i15, int i16, r rVar, int i17) {
        h(colorScheme, fVar, shapes, typography, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d.Values n() {
        return new d.Values(null, null, null, null, 15, null);
    }

    public static final SelectionColors p(ColorScheme colorScheme, r rVar, int i15) {
        if (t.k()) {
            t.o(1866455512, i15, -1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:292)");
        }
        long primary = colorScheme.getPrimary();
        boolean zD = rVar.d(primary);
        Object objE = rVar.E();
        if (zD || objE == r.INSTANCE.a()) {
            SelectionColors selectionColors = new SelectionColors(primary, Color.m9copywmQWz5c$default(primary, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
            rVar.v(selectionColors);
            objE = selectionColors;
        }
        SelectionColors selectionColors2 = (SelectionColors) objE;
        if (t.k()) {
            t.n();
        }
        return selectionColors2;
    }
}
