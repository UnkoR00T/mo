package p046f2;

import androidx.compose.material3.d;
import androidx.compose.ui.graphics.Color;
import c5.h;
import l2.n;
import l2.o;
import l2.p;
import n3.o1;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.d0;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001aí\u0003\u00102\u001a\u0002012\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020\u00002\b\b\u0002\u0010&\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\u00002\b\b\u0002\u0010)\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020\u00002\b\b\u0002\u0010+\u001a\u00020\u00002\b\b\u0002\u0010,\u001a\u00020\u00002\b\b\u0002\u0010-\u001a\u00020\u00002\b\b\u0002\u0010.\u001a\u00020\u00002\b\b\u0002\u0010/\u001a\u00020\u00002\b\b\u0002\u00100\u001a\u00020\u0000¢\u0006\u0004\b2\u00103\u001aí\u0003\u00104\u001a\u0002012\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020\u00002\b\b\u0002\u0010&\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\u00002\b\b\u0002\u0010)\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020\u00002\b\b\u0002\u0010+\u001a\u00020\u00002\b\b\u0002\u0010,\u001a\u00020\u00002\b\b\u0002\u0010-\u001a\u00020\u00002\b\b\u0002\u0010.\u001a\u00020\u00002\b\b\u0002\u0010/\u001a\u00020\u00002\b\b\u0002\u00100\u001a\u00020\u0000¢\u0006\u0004\b4\u00103\u001a\u001b\u00106\u001a\u00020\u0000*\u0002012\u0006\u00105\u001a\u00020\u0000H\u0007¢\u0006\u0004\b6\u00107\u001a\u0017\u00108\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0000H\u0007¢\u0006\u0004\b8\u00109\u001a\u001b\u0010<\u001a\u00020\u0000*\u0002012\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\b<\u0010=\u001a\u001b\u0010@\u001a\u00020\u0000*\u0002012\u0006\u0010?\u001a\u00020>H\u0001¢\u0006\u0004\b@\u0010A\u001a#\u0010B\u001a\u00020\u0000*\u0002012\u0006\u00105\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\bB\u0010C\"\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020E0D8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0018\u0010?\u001a\u00020\u0000*\u00020>8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006M"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "surfaceDim", "primaryFixed", "primaryFixedDim", "onPrimaryFixed", "onPrimaryFixedVariant", "secondaryFixed", "secondaryFixedDim", "onSecondaryFixed", "onSecondaryFixedVariant", "tertiaryFixed", "tertiaryFixedDim", "onTertiaryFixed", "onTertiaryFixedVariant", "Lf2/e2;", "j", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Lf2/e2;", "f", "backgroundColor", "d", "(Lf2/e2;J)J", "e", "(JLm2/r;I)J", "Lc5/h;", "elevation", "l", "(Lf2/e2;F)J", "Ll2/p;", "value", "h", "(Lf2/e2;Ll2/p;)J", "c", "(Lf2/e2;JFLm2/r;I)J", "Lm2/b4;", "", "a", "Lm2/b4;", "getLocalTonalElevationEnabled", "()Lm2/b4;", "LocalTonalElevationEnabled", "i", "(Ll2/p;Lm2/r;I)J", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<Boolean> f55897a = d0.j(new er.a() { // from class: f2.f2
        @Override // er.a
        public final Object a() {
            return Boolean.valueOf(g2.b());
        }
    });

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55898a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[p.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[p.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[p.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[p.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[p.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[p.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[p.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[p.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[p.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[p.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[p.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[p.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[p.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[p.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[p.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[p.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[p.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[p.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[p.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[p.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[p.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[p.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[p.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[p.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[p.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[p.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[p.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[p.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[p.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[p.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[p.PrimaryFixed.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[p.PrimaryFixedDim.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[p.OnPrimaryFixed.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[p.OnPrimaryFixedVariant.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[p.SecondaryFixed.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[p.SecondaryFixedDim.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[p.OnSecondaryFixed.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[p.OnSecondaryFixedVariant.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[p.TertiaryFixed.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[p.TertiaryFixedDim.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[p.OnTertiaryFixed.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[p.OnTertiaryFixedVariant.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            f55898a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b() {
        return true;
    }

    public static final long c(ColorScheme colorScheme, long j15, float f15, r rVar, int i15) {
        if (t.k()) {
            t.o(-1610977682, i15, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:1553)");
        }
        boolean zBooleanValue = ((Boolean) rVar.N(f55897a)).booleanValue();
        if (Color.m11equalsimpl0(j15, colorScheme.getSurface()) && zBooleanValue) {
            j15 = l(colorScheme, f15);
        }
        if (t.k()) {
            t.n();
        }
        return j15;
    }

    public static final long d(ColorScheme colorScheme, long j15) {
        if (Color.m11equalsimpl0(j15, colorScheme.getPrimary())) {
            return colorScheme.getOnPrimary();
        }
        if (Color.m11equalsimpl0(j15, colorScheme.getSecondary())) {
            return colorScheme.getOnSecondary();
        }
        if (Color.m11equalsimpl0(j15, colorScheme.getTertiary())) {
            return colorScheme.getOnTertiary();
        }
        if (Color.m11equalsimpl0(j15, colorScheme.getBackground())) {
            return colorScheme.getOnBackground();
        }
        if (Color.m11equalsimpl0(j15, colorScheme.getError())) {
            return colorScheme.getOnError();
        }
        if (Color.m11equalsimpl0(j15, colorScheme.getPrimaryContainer())) {
            return colorScheme.getOnPrimaryFixed();
        }
        if (Color.m11equalsimpl0(j15, colorScheme.getSecondaryContainer())) {
            return colorScheme.getOnSecondaryContainer();
        }
        if (Color.m11equalsimpl0(j15, colorScheme.getTertiaryContainer())) {
            return colorScheme.getOnTertiaryContainer();
        }
        if (Color.m11equalsimpl0(j15, colorScheme.getErrorContainer())) {
            return colorScheme.getOnErrorContainer();
        }
        if (Color.m11equalsimpl0(j15, colorScheme.getInverseSurface())) {
            return colorScheme.getInverseOnSurface();
        }
        if (Color.m11equalsimpl0(j15, colorScheme.getSurface())) {
            return colorScheme.getOnSurface();
        }
        if (Color.m11equalsimpl0(j15, colorScheme.getSurfaceVariant())) {
            return colorScheme.getOnSurfaceVariant();
        }
        if (!Color.m11equalsimpl0(j15, colorScheme.getSurfaceBright()) && !Color.m11equalsimpl0(j15, colorScheme.getSurfaceContainer()) && !Color.m11equalsimpl0(j15, colorScheme.getSurfaceContainerHigh()) && !Color.m11equalsimpl0(j15, colorScheme.getSurfaceContainerHighest()) && !Color.m11equalsimpl0(j15, colorScheme.getSurfaceContainerLow()) && !Color.m11equalsimpl0(j15, colorScheme.getSurfaceContainerLowest()) && !Color.m11equalsimpl0(j15, colorScheme.getSurfaceDim())) {
            if (!Color.m11equalsimpl0(j15, colorScheme.getPrimaryFixed()) && !Color.m11equalsimpl0(j15, colorScheme.getPrimaryFixedDim())) {
                if (!Color.m11equalsimpl0(j15, colorScheme.getSecondaryFixed()) && !Color.m11equalsimpl0(j15, colorScheme.getSecondaryFixedDim())) {
                    if (!Color.m11equalsimpl0(j15, colorScheme.getTertiaryFixed()) && !Color.m11equalsimpl0(j15, colorScheme.getTertiaryFixedDim())) {
                        return Color.INSTANCE.h();
                    }
                    return colorScheme.getOnTertiaryFixed();
                }
                return colorScheme.getOnSecondaryFixed();
            }
            return colorScheme.getOnPrimaryFixed();
        }
        return colorScheme.getOnSurface();
    }

    public static final long e(long j15, r rVar, int i15) {
        if (t.k()) {
            t.o(509589638, i15, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:1131)");
        }
        rVar.X(89373914);
        long jD = d(d.f9816a.a(rVar, 6), j15);
        if (jD == 16) {
            jD = ((Color) rVar.N(h4.a())).m20unboximpl();
        }
        rVar.R();
        if (t.k()) {
            t.n();
        }
        return jD;
    }

    public static final ColorScheme f(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36, long j37, long j38, long j39, long j45, long j46, long j47, long j48, long j49, long j55, long j56, long j57, long j58, long j59, long j65, long j66, long j67, long j68, long j69, long j75, long j76, long j77, long j78, long j79, long j85, long j86, long j87, long j88, long j89, long j95, long j96, long j97, long j98, long j99, long j100, long j101, long j102) {
        return new ColorScheme(j15, j16, j17, j18, j19, j25, j26, j27, j28, j29, j35, j36, j37, j38, j39, j45, j46, j47, j48, j49, j55, j56, j57, j58, j59, j65, j66, j67, j68, j69, j85, j75, j76, j77, j78, j79, j86, j87, j88, j89, j95, j96, j97, j98, j99, j100, j101, j102, null);
    }

    public static /* synthetic */ ColorScheme g(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36, long j37, long j38, long j39, long j45, long j46, long j47, long j48, long j49, long j55, long j56, long j57, long j58, long j59, long j65, long j66, long j67, long j68, long j69, long j75, long j76, long j77, long j78, long j79, long j85, long j86, long j87, long j88, long j89, long j95, long j96, long j97, long j98, long j99, long j100, long j101, long j102, int i15, int i16, Object obj) {
        long jZ = (i15 & 1) != 0 ? n.f114950a.z() : j15;
        long j103 = (i15 & 2) != 0 ? n.f114950a.j() : j16;
        long jA = (i15 & 4) != 0 ? n.f114950a.A() : j17;
        long jK = (i15 & 8) != 0 ? n.f114950a.k() : j18;
        long jE = (i15 & 16) != 0 ? n.f114950a.e() : j19;
        long jE2 = (i15 & 32) != 0 ? n.f114950a.E() : j25;
        long jN = (i15 & 64) != 0 ? n.f114950a.n() : j26;
        long j104 = jZ;
        long jF = (i15 & 128) != 0 ? n.f114950a.F() : j27;
        long jO = (i15 & 256) != 0 ? n.f114950a.o() : j28;
        long jR = (i15 & 512) != 0 ? n.f114950a.R() : j29;
        long jT = (i15 & 1024) != 0 ? n.f114950a.t() : j35;
        long jS = (i15 & 2048) != 0 ? n.f114950a.S() : j36;
        long jU = (i15 & PKIFailureInfo.certConfirmed) != 0 ? n.f114950a.u() : j37;
        long jA2 = (i15 & PKIFailureInfo.certRevoked) != 0 ? n.f114950a.a() : j38;
        long jG = (i15 & 16384) != 0 ? n.f114950a.g() : j39;
        long jI = (i15 & 32768) != 0 ? n.f114950a.I() : j45;
        long jR2 = (i15 & PKIFailureInfo.notAuthorized) != 0 ? n.f114950a.r() : j46;
        long jQ = (i15 & PKIFailureInfo.unsupportedVersion) != 0 ? n.f114950a.Q() : j47;
        long jS2 = (i15 & PKIFailureInfo.transactionIdInUse) != 0 ? n.f114950a.s() : j48;
        long j105 = (i15 & PKIFailureInfo.signerNotTrusted) != 0 ? j104 : j49;
        long jF2 = (i15 & PKIFailureInfo.badCertTemplate) != 0 ? n.f114950a.f() : j55;
        long jD = (i15 & PKIFailureInfo.badSenderNonce) != 0 ? n.f114950a.d() : j56;
        long jB = (i15 & 4194304) != 0 ? n.f114950a.b() : j57;
        long jH = (i15 & 8388608) != 0 ? n.f114950a.h() : j58;
        long jC = (i15 & 16777216) != 0 ? n.f114950a.c() : j59;
        long jI2 = (i15 & 33554432) != 0 ? n.f114950a.i() : j65;
        long jX = (i15 & 67108864) != 0 ? n.f114950a.x() : j66;
        long jY = (i15 & 134217728) != 0 ? n.f114950a.y() : j67;
        long jD2 = (i15 & 268435456) != 0 ? n.f114950a.D() : j68;
        long J = (i15 & PKIFailureInfo.duplicateCertReq) != 0 ? n.f114950a.J() : j69;
        long jK2 = (i15 & 1073741824) != 0 ? n.f114950a.K() : j75;
        long jL = (i15 & PKIFailureInfo.systemUnavail) != 0 ? n.f114950a.L() : j76;
        long jM = (i16 & 1) != 0 ? n.f114950a.M() : j77;
        long jN2 = (i16 & 2) != 0 ? n.f114950a.N() : j78;
        long jO2 = (i16 & 4) != 0 ? n.f114950a.O() : j79;
        long jP = (i16 & 8) != 0 ? n.f114950a.P() : j85;
        long jB2 = (i16 & 16) != 0 ? n.f114950a.B() : j86;
        long jC2 = (i16 & 32) != 0 ? n.f114950a.C() : j87;
        long jL2 = (i16 & 64) != 0 ? n.f114950a.l() : j88;
        long jM2 = (i16 & 128) != 0 ? n.f114950a.m() : j89;
        long jG2 = (i16 & 256) != 0 ? n.f114950a.G() : j95;
        long jH2 = (i16 & 512) != 0 ? n.f114950a.H() : j96;
        long jP2 = (i16 & 1024) != 0 ? n.f114950a.p() : j97;
        long jQ2 = (i16 & 2048) != 0 ? n.f114950a.q() : j98;
        long jT2 = (i16 & PKIFailureInfo.certConfirmed) != 0 ? n.f114950a.T() : j99;
        long jU2 = (i16 & PKIFailureInfo.certRevoked) != 0 ? n.f114950a.U() : j100;
        long jV = (i16 & 16384) != 0 ? n.f114950a.v() : j101;
        if ((i16 & 32768) != 0) {
            j102 = n.f114950a.w();
        }
        return f(j104, j103, jA, jK, jE, jE2, jN, jF, jO, jR, jT, jS, jU, jA2, jG, jI, jR2, jQ, jS2, j105, jF2, jD, jB, jH, jC, jI2, jX, jY, jD2, J, jK2, jL, jM, jN2, jO2, jP, jB2, jC2, jL2, jM2, jG2, jH2, jP2, jQ2, jT2, jU2, jV, j102);
    }

    public static final long h(ColorScheme colorScheme, p pVar) {
        switch (a.f55898a[pVar.ordinal()]) {
            case 1:
                return colorScheme.getBackground();
            case 2:
                return colorScheme.getError();
            case 3:
                return colorScheme.getErrorContainer();
            case 4:
                return colorScheme.getInverseOnSurface();
            case 5:
                return colorScheme.getInversePrimary();
            case 6:
                return colorScheme.getInverseSurface();
            case 7:
                return colorScheme.getOnBackground();
            case 8:
                return colorScheme.getOnError();
            case 9:
                return colorScheme.getOnErrorContainer();
            case 10:
                return colorScheme.getOnPrimary();
            case 11:
                return colorScheme.getOnPrimaryFixed();
            case 12:
                return colorScheme.getOnSecondary();
            case 13:
                return colorScheme.getOnSecondaryContainer();
            case 14:
                return colorScheme.getOnSurface();
            case 15:
                return colorScheme.getOnSurfaceVariant();
            case 16:
                return colorScheme.getSurfaceTint();
            case 17:
                return colorScheme.getOnTertiary();
            case 18:
                return colorScheme.getOnTertiaryContainer();
            case 19:
                return colorScheme.getOutline();
            case 20:
                return colorScheme.getOutlineVariant();
            case 21:
                return colorScheme.getPrimary();
            case 22:
                return colorScheme.getPrimaryContainer();
            case 23:
                return colorScheme.getScrim();
            case 24:
                return colorScheme.getSecondary();
            case 25:
                return colorScheme.getSecondaryContainer();
            case 26:
                return colorScheme.getSurface();
            case 27:
                return colorScheme.getSurfaceVariant();
            case 28:
                return colorScheme.getSurfaceBright();
            case 29:
                return colorScheme.getSurfaceContainer();
            case 30:
                return colorScheme.getSurfaceContainerHigh();
            case BERTags.DATE /* 31 */:
                return colorScheme.getSurfaceContainerHighest();
            case 32:
                return colorScheme.getSurfaceContainerLow();
            case 33:
                return colorScheme.getSurfaceContainerLowest();
            case 34:
                return colorScheme.getSurfaceDim();
            case 35:
                return colorScheme.getTertiary();
            case 36:
                return colorScheme.getTertiaryContainer();
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                return colorScheme.getPrimaryFixed();
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                return colorScheme.getPrimaryFixedDim();
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                return colorScheme.getOnPrimaryFixed();
            case 40:
                return colorScheme.getOnPrimaryFixedVariant();
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return colorScheme.getSecondaryFixed();
            case EACTags.CURRENCY_CODE /* 42 */:
                return colorScheme.getSecondaryFixedDim();
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return colorScheme.getOnSecondaryFixed();
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                return colorScheme.getOnSecondaryFixedVariant();
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                return colorScheme.getTertiaryFixed();
            case 46:
                return colorScheme.getTertiaryFixedDim();
            case 47:
                return colorScheme.getOnTertiaryFixed();
            case 48:
                return colorScheme.getOnTertiaryFixedVariant();
            default:
                throw new oq.p();
        }
    }

    public static final long i(p pVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-810780884, i15, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1538)");
        }
        long jH = h(d.f9816a.a(rVar, 6), pVar);
        if (t.k()) {
            t.n();
        }
        return jH;
    }

    public static final ColorScheme j(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36, long j37, long j38, long j39, long j45, long j46, long j47, long j48, long j49, long j55, long j56, long j57, long j58, long j59, long j65, long j66, long j67, long j68, long j69, long j75, long j76, long j77, long j78, long j79, long j85, long j86, long j87, long j88, long j89, long j95, long j96, long j97, long j98, long j99, long j100, long j101, long j102) {
        return new ColorScheme(j15, j16, j17, j18, j19, j25, j26, j27, j28, j29, j35, j36, j37, j38, j39, j45, j46, j47, j48, j49, j55, j56, j57, j58, j59, j65, j66, j67, j68, j69, j85, j75, j76, j77, j78, j79, j86, j87, j88, j89, j95, j96, j97, j98, j99, j100, j101, j102, null);
    }

    public static /* synthetic */ ColorScheme k(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36, long j37, long j38, long j39, long j45, long j46, long j47, long j48, long j49, long j55, long j56, long j57, long j58, long j59, long j65, long j66, long j67, long j68, long j69, long j75, long j76, long j77, long j78, long j79, long j85, long j86, long j87, long j88, long j89, long j95, long j96, long j97, long j98, long j99, long j100, long j101, long j102, int i15, int i16, Object obj) {
        long jZ = (i15 & 1) != 0 ? o.f115024a.z() : j15;
        long j103 = (i15 & 2) != 0 ? o.f115024a.j() : j16;
        long jA = (i15 & 4) != 0 ? o.f115024a.A() : j17;
        long jK = (i15 & 8) != 0 ? o.f115024a.k() : j18;
        long jE = (i15 & 16) != 0 ? o.f115024a.e() : j19;
        long jE2 = (i15 & 32) != 0 ? o.f115024a.E() : j25;
        long jN = (i15 & 64) != 0 ? o.f115024a.n() : j26;
        long j104 = jZ;
        long jF = (i15 & 128) != 0 ? o.f115024a.F() : j27;
        long jO = (i15 & 256) != 0 ? o.f115024a.o() : j28;
        long jR = (i15 & 512) != 0 ? o.f115024a.R() : j29;
        long jT = (i15 & 1024) != 0 ? o.f115024a.t() : j35;
        long jS = (i15 & 2048) != 0 ? o.f115024a.S() : j36;
        long jU = (i15 & PKIFailureInfo.certConfirmed) != 0 ? o.f115024a.u() : j37;
        long jA2 = (i15 & PKIFailureInfo.certRevoked) != 0 ? o.f115024a.a() : j38;
        long jG = (i15 & 16384) != 0 ? o.f115024a.g() : j39;
        long jI = (i15 & 32768) != 0 ? o.f115024a.I() : j45;
        long jR2 = (i15 & PKIFailureInfo.notAuthorized) != 0 ? o.f115024a.r() : j46;
        long jQ = (i15 & PKIFailureInfo.unsupportedVersion) != 0 ? o.f115024a.Q() : j47;
        long jS2 = (i15 & PKIFailureInfo.transactionIdInUse) != 0 ? o.f115024a.s() : j48;
        long j105 = (i15 & PKIFailureInfo.signerNotTrusted) != 0 ? j104 : j49;
        long jF2 = (i15 & PKIFailureInfo.badCertTemplate) != 0 ? o.f115024a.f() : j55;
        long jD = (i15 & PKIFailureInfo.badSenderNonce) != 0 ? o.f115024a.d() : j56;
        long jB = (i15 & 4194304) != 0 ? o.f115024a.b() : j57;
        long jH = (i15 & 8388608) != 0 ? o.f115024a.h() : j58;
        long jC = (i15 & 16777216) != 0 ? o.f115024a.c() : j59;
        long jI2 = (i15 & 33554432) != 0 ? o.f115024a.i() : j65;
        long jX = (i15 & 67108864) != 0 ? o.f115024a.x() : j66;
        long jY = (i15 & 134217728) != 0 ? o.f115024a.y() : j67;
        long jD2 = (i15 & 268435456) != 0 ? o.f115024a.D() : j68;
        long J = (i15 & PKIFailureInfo.duplicateCertReq) != 0 ? o.f115024a.J() : j69;
        long jK2 = (i15 & 1073741824) != 0 ? o.f115024a.K() : j75;
        long jL = (i15 & PKIFailureInfo.systemUnavail) != 0 ? o.f115024a.L() : j76;
        long jM = (i16 & 1) != 0 ? o.f115024a.M() : j77;
        long jN2 = (i16 & 2) != 0 ? o.f115024a.N() : j78;
        long jO2 = (i16 & 4) != 0 ? o.f115024a.O() : j79;
        long jP = (i16 & 8) != 0 ? o.f115024a.P() : j85;
        long jB2 = (i16 & 16) != 0 ? o.f115024a.B() : j86;
        long jC2 = (i16 & 32) != 0 ? o.f115024a.C() : j87;
        long jL2 = (i16 & 64) != 0 ? o.f115024a.l() : j88;
        long jM2 = (i16 & 128) != 0 ? o.f115024a.m() : j89;
        long jG2 = (i16 & 256) != 0 ? o.f115024a.G() : j95;
        long jH2 = (i16 & 512) != 0 ? o.f115024a.H() : j96;
        long jP2 = (i16 & 1024) != 0 ? o.f115024a.p() : j97;
        long jQ2 = (i16 & 2048) != 0 ? o.f115024a.q() : j98;
        long jT2 = (i16 & PKIFailureInfo.certConfirmed) != 0 ? o.f115024a.T() : j99;
        long jU2 = (i16 & PKIFailureInfo.certRevoked) != 0 ? o.f115024a.U() : j100;
        long jV = (i16 & 16384) != 0 ? o.f115024a.v() : j101;
        if ((i16 & 32768) != 0) {
            j102 = o.f115024a.w();
        }
        return j(j104, j103, jA, jK, jE, jE2, jN, jF, jO, jR, jT, jS, jU, jA2, jG, jI, jR2, jQ, jS2, j105, jF2, jD, jB, jH, jC, jI2, jX, jY, jD2, J, jK2, jL, jM, jN2, jO2, jP, jB2, jC2, jL2, jM2, jG2, jH2, jP2, jQ2, jT2, jU2, jV, j102);
    }

    public static final long l(ColorScheme colorScheme, float f15) {
        if (h.p(f15, h.n(0))) {
            return colorScheme.getSurface();
        }
        return o1.g(Color.m9copywmQWz5c$default(colorScheme.getSurfaceTint(), ((((float) Math.log(f15 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface());
    }
}
