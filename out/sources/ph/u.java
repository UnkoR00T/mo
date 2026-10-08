package ph;

import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import n3.o1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.ColorScheme;
import p046f2.Typography;
import p046f2.g2;
import p046f2.wb;
import p076m2.b4;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4 f157618a = p076m2.d0.j(r.f157607a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b4 f157619b = p076m2.d0.j(s.f157610a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f157620c = 0;

    public static final b4 a() {
        return f157618a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0159 A[PHI: r0
      0x0159: PHI (r0v22 f2.e2) = (r0v12 f2.e2), (r0v23 f2.e2) binds: [B:44:0x0168, B:38:0x0157] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void b(boolean z15, boolean z16, final er.p pVar, p076m2.r rVar, final int i15, int i16) {
        final boolean z17;
        final boolean z18;
        boolean zA;
        boolean z19;
        ColorScheme colorSchemeB;
        int i17 = i15 & 6;
        p076m2.r rVarH = rVar.h(333377128);
        int i18 = (i17 == 0 ? i15 | 2 : i15) | 48;
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= true != rVarH.G(pVar) ? 128 : 256;
        }
        if (rVarH.r((i18 & 147) != 146, i18 & 1)) {
            int i19 = i18 & (-15);
            rVarH.I();
            if ((i15 & 1) == 0 || rVarH.Q()) {
                zA = w0.h0.a(rVarH, 0);
                z19 = true;
            } else {
                rVarH.O();
                zA = z15;
                z19 = z16;
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(333377128, i19, -1, "com.google.android.gms.oss.licenses.v2.OssLicensesTheme (OssLicensesTheme.kt:58)");
            }
            Context context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            final ColorScheme colorSchemeG = zA ? g2.g(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535, null) : g2.k(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535, null);
            if (zA && p.a() != null) {
                colorSchemeB = p.a();
                if (colorSchemeB != null) {
                    colorSchemeG = colorSchemeB;
                }
            } else if (zA || p.b() == null) {
                Color.Companion companion = Color.INSTANCE;
                if (!Color.m11equalsimpl0(c(context, "colorPrimary", companion.h()), companion.h())) {
                    colorSchemeG = ColorScheme.b(colorSchemeG, c(context, "colorPrimary", companion.h()), c(context, "colorOnPrimary", colorSchemeG.getOnPrimary()), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c(context, "colorBackground", colorSchemeG.getBackground()), c(context, "colorOnBackground", colorSchemeG.getOnBackground()), c(context, "colorSurface", colorSchemeG.getSurface()), c(context, "colorOnSurface", colorSchemeG.getOnSurface()), 0L, c(context, "colorOnSurfaceVariant", colorSchemeG.getOnSurfaceVariant()), 0L, 0L, 0L, c(context, "colorError", colorSchemeG.getError()), 0L, 0L, 0L, 0L, c(context, "colorOutlineVariant", colorSchemeG.getOutlineVariant()), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -138797060, 65535, null);
                } else if (z19 && Build.VERSION.SDK_INT >= 31) {
                    colorSchemeG = zA ? wb.a(context) : wb.d(context);
                }
            } else {
                colorSchemeB = p.b();
                if (colorSchemeB != null) {
                    colorSchemeG = colorSchemeB;
                }
            }
            final Typography typographyC = p.c();
            if (typographyC == null) {
                rVarH.X(-1747056622);
                typographyC = androidx.compose.material3.d.f9816a.e(rVarH, androidx.compose.material3.d.f9817b);
            } else {
                rVarH.X(-1747058203);
            }
            rVarH.R();
            p076m2.d0.d(new c4[]{f157618a.d(colorSchemeG), f157619b.d(typographyC)}, y2.m.d(1848582952, true, new er.p() { // from class: ph.t
                @Override // er.p
                public final /* synthetic */ Object B(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    int i25 = iIntValue & 1;
                    boolean z25 = (iIntValue & 3) != 2;
                    p076m2.r rVar2 = (p076m2.r) obj;
                    int i26 = u.f157620c;
                    if (rVar2.r(z25, i25)) {
                        if (p076m2.t.k()) {
                            p076m2.t.o(1848582952, iIntValue, -1, "com.google.android.gms.oss.licenses.v2.OssLicensesTheme.<anonymous> (OssLicensesTheme.kt:109)");
                        }
                        androidx.compose.material3.e.i(colorSchemeG, null, typographyC, pVar, rVar2, 0, 2);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                    } else {
                        rVar2.O();
                    }
                    return oq.i0.f148189a;
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            z17 = zA;
            z18 = z19;
        } else {
            rVarH.O();
            z17 = z15;
            z18 = z16;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            final int i25 = 3;
            d5VarM.a(new er.p(z17, z18, pVar, i15, i25) { // from class: ph.q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final /* synthetic */ boolean f157602a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final /* synthetic */ boolean f157603b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final /* synthetic */ er.p f157604c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private final /* synthetic */ int f157605d;

                @Override // er.p
                public final /* synthetic */ Object B(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    boolean z25 = this.f157602a;
                    boolean z26 = this.f157603b;
                    er.p pVar2 = this.f157604c;
                    p076m2.r rVar2 = (p076m2.r) obj;
                    int i26 = u.f157620c;
                    u.b(z25, z26, pVar2, rVar2, g4.a(this.f157605d | 1), 3);
                    return oq.i0.f148189a;
                }
            });
        }
    }

    private static final long c(Context context, String str, long j15) {
        int identifier = context.getResources().getIdentifier(str, "attr", context.getPackageName());
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(str, "attr", "android");
        }
        if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(identifier, typedValue, true)) {
                return o1.b(typedValue.data);
            }
        }
        return j15;
    }
}
