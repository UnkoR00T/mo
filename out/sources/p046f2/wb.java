package p046f2;

import android.R;
import android.content.Context;
import android.os.Build;
import i2.a;
import i2.b;
import n3.o1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\u0007\u001a\u001d\u0010\f\u001a\u00020\t*\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0011\u0010\u0007\u001a\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroid/content/Context;", "context", "Lf2/oq;", "g", "(Landroid/content/Context;)Lf2/oq;", "Lf2/e2;", "d", "(Landroid/content/Context;)Lf2/e2;", "a", "Landroidx/compose/ui/graphics/Color;", "", "newLuminance", "h", "(JF)J", "tonalPalette", "e", "(Lf2/oq;)Lf2/e2;", "f", "b", "c", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class wb {
    public static final ColorScheme a(Context context) {
        return Build.VERSION.SDK_INT >= 34 ? c(context) : b(g(context));
    }

    public static final ColorScheme b(oq oqVar) {
        long primary80 = oqVar.getPrimary80();
        long primary20 = oqVar.getPrimary20();
        long primary30 = oqVar.getPrimary30();
        long primary90 = oqVar.getPrimary90();
        long primary40 = oqVar.getPrimary40();
        long secondary80 = oqVar.getSecondary80();
        long secondary20 = oqVar.getSecondary20();
        long secondary30 = oqVar.getSecondary30();
        long secondary90 = oqVar.getSecondary90();
        long tertiary80 = oqVar.getTertiary80();
        long tertiary20 = oqVar.getTertiary20();
        long tertiary30 = oqVar.getTertiary30();
        long tertiary90 = oqVar.getTertiary90();
        long neutralVariant6 = oqVar.getNeutralVariant6();
        long neutralVariant90 = oqVar.getNeutralVariant90();
        long neutralVariant7 = oqVar.getNeutralVariant6();
        long neutralVariant91 = oqVar.getNeutralVariant90();
        long neutralVariant30 = oqVar.getNeutralVariant30();
        long neutralVariant80 = oqVar.getNeutralVariant80();
        long neutralVariant92 = oqVar.getNeutralVariant90();
        long neutralVariant20 = oqVar.getNeutralVariant20();
        long neutralVariant60 = oqVar.getNeutralVariant60();
        long neutralVariant31 = oqVar.getNeutralVariant30();
        long neutralVariant0 = oqVar.getNeutralVariant0();
        long neutralVariant24 = oqVar.getNeutralVariant24();
        long neutralVariant8 = oqVar.getNeutralVariant6();
        return g2.g(primary80, primary20, primary30, primary90, primary40, secondary80, secondary20, secondary30, secondary90, tertiary80, tertiary20, tertiary30, tertiary90, neutralVariant6, neutralVariant90, neutralVariant7, neutralVariant91, neutralVariant30, neutralVariant80, oqVar.getPrimary80(), neutralVariant92, neutralVariant20, 0L, 0L, 0L, 0L, neutralVariant60, neutralVariant31, neutralVariant0, neutralVariant24, oqVar.getNeutralVariant12(), oqVar.getNeutralVariant17(), oqVar.getNeutralVariant22(), oqVar.getNeutralVariant10(), oqVar.getNeutralVariant4(), neutralVariant8, oqVar.getPrimary90(), oqVar.getPrimary80(), oqVar.getPrimary10(), oqVar.getPrimary30(), oqVar.getSecondary90(), oqVar.getSecondary80(), oqVar.getSecondary10(), oqVar.getSecondary30(), oqVar.getTertiary90(), oqVar.getTertiary80(), oqVar.getTertiary10(), oqVar.getTertiary30(), 62914560, 0, null);
    }

    public static final ColorScheme c(Context context) {
        d2 d2Var = d2.f55560a;
        long jA = d2Var.a(context, R.color.system_primary_dark);
        long jA2 = d2Var.a(context, R.color.system_on_primary_dark);
        long jA3 = d2Var.a(context, R.color.system_primary_container_dark);
        long jA4 = d2Var.a(context, R.color.system_on_primary_container_dark);
        long jA5 = d2Var.a(context, R.color.system_primary_light);
        long jA6 = d2Var.a(context, R.color.system_secondary_dark);
        long jA7 = d2Var.a(context, R.color.system_on_secondary_dark);
        long jA8 = d2Var.a(context, R.color.system_secondary_container_dark);
        long jA9 = d2Var.a(context, R.color.system_on_secondary_container_dark);
        long jA10 = d2Var.a(context, R.color.system_tertiary_dark);
        long jA11 = d2Var.a(context, R.color.system_on_tertiary_dark);
        long jA12 = d2Var.a(context, R.color.system_tertiary_container_dark);
        long jA13 = d2Var.a(context, R.color.system_on_tertiary_container_dark);
        long jA14 = d2Var.a(context, R.color.system_background_dark);
        long jA15 = d2Var.a(context, R.color.system_on_background_dark);
        long jA16 = d2Var.a(context, R.color.system_surface_dark);
        long jA17 = d2Var.a(context, R.color.system_on_surface_dark);
        long jA18 = d2Var.a(context, R.color.system_surface_variant_dark);
        long jA19 = d2Var.a(context, R.color.system_on_surface_variant_dark);
        long jA20 = d2Var.a(context, R.color.system_surface_light);
        long jA21 = d2Var.a(context, R.color.system_on_surface_light);
        long jA22 = d2Var.a(context, R.color.system_outline_dark);
        long jA23 = d2Var.a(context, R.color.system_outline_variant_dark);
        long jA24 = d2Var.a(context, R.color.system_surface_bright_dark);
        long jA25 = d2Var.a(context, R.color.system_surface_dim_dark);
        return g2.g(jA, jA2, jA3, jA4, jA5, jA6, jA7, jA8, jA9, jA10, jA11, jA12, jA13, jA14, jA15, jA16, jA17, jA18, jA19, d2Var.a(context, R.color.system_primary_dark), jA20, jA21, 0L, 0L, 0L, 0L, jA22, jA23, 0L, jA24, d2Var.a(context, R.color.system_surface_container_dark), d2Var.a(context, R.color.system_surface_container_high_dark), d2Var.a(context, R.color.system_surface_container_highest_dark), d2Var.a(context, R.color.system_surface_container_low_dark), d2Var.a(context, R.color.system_surface_container_lowest_dark), jA25, d2Var.a(context, R.color.system_primary_fixed), d2Var.a(context, R.color.system_primary_fixed_dim), d2Var.a(context, R.color.system_on_primary_fixed), d2Var.a(context, R.color.system_on_primary_fixed_variant), d2Var.a(context, R.color.system_secondary_fixed), d2Var.a(context, R.color.system_secondary_fixed_dim), d2Var.a(context, R.color.system_on_secondary_fixed), d2Var.a(context, R.color.system_on_secondary_fixed_variant), d2Var.a(context, R.color.system_tertiary_fixed), d2Var.a(context, R.color.system_tertiary_fixed_dim), d2Var.a(context, R.color.system_on_tertiary_fixed), d2Var.a(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0, null);
    }

    public static final ColorScheme d(Context context) {
        return Build.VERSION.SDK_INT >= 34 ? f(context) : e(g(context));
    }

    public static final ColorScheme e(oq oqVar) {
        long primary40 = oqVar.getPrimary40();
        long primary100 = oqVar.getPrimary100();
        long primary90 = oqVar.getPrimary90();
        long primary10 = oqVar.getPrimary10();
        long primary80 = oqVar.getPrimary80();
        long secondary40 = oqVar.getSecondary40();
        long secondary100 = oqVar.getSecondary100();
        long secondary90 = oqVar.getSecondary90();
        long secondary10 = oqVar.getSecondary10();
        long tertiary40 = oqVar.getTertiary40();
        long tertiary100 = oqVar.getTertiary100();
        long tertiary90 = oqVar.getTertiary90();
        long tertiary10 = oqVar.getTertiary10();
        long neutralVariant98 = oqVar.getNeutralVariant98();
        long neutralVariant10 = oqVar.getNeutralVariant10();
        long neutralVariant99 = oqVar.getNeutralVariant98();
        long neutralVariant11 = oqVar.getNeutralVariant10();
        long neutralVariant90 = oqVar.getNeutralVariant90();
        long neutralVariant30 = oqVar.getNeutralVariant30();
        long neutralVariant20 = oqVar.getNeutralVariant20();
        long neutralVariant95 = oqVar.getNeutralVariant95();
        long neutralVariant50 = oqVar.getNeutralVariant50();
        long neutralVariant80 = oqVar.getNeutralVariant80();
        long neutralVariant0 = oqVar.getNeutralVariant0();
        long neutralVariant910 = oqVar.getNeutralVariant98();
        long neutralVariant87 = oqVar.getNeutralVariant87();
        return g2.k(primary40, primary100, primary90, primary10, primary80, secondary40, secondary100, secondary90, secondary10, tertiary40, tertiary100, tertiary90, tertiary10, neutralVariant98, neutralVariant10, neutralVariant99, neutralVariant11, neutralVariant90, neutralVariant30, oqVar.getPrimary40(), neutralVariant20, neutralVariant95, 0L, 0L, 0L, 0L, neutralVariant50, neutralVariant80, neutralVariant0, neutralVariant910, oqVar.getNeutralVariant94(), oqVar.getNeutralVariant92(), oqVar.getNeutralVariant90(), oqVar.getNeutralVariant96(), oqVar.getNeutralVariant100(), neutralVariant87, oqVar.getPrimary90(), oqVar.getPrimary80(), oqVar.getPrimary10(), oqVar.getPrimary30(), oqVar.getSecondary90(), oqVar.getSecondary80(), oqVar.getSecondary10(), oqVar.getSecondary30(), oqVar.getTertiary90(), oqVar.getTertiary80(), oqVar.getTertiary10(), oqVar.getTertiary30(), 62914560, 0, null);
    }

    public static final ColorScheme f(Context context) {
        d2 d2Var = d2.f55560a;
        long jA = d2Var.a(context, R.color.system_primary_light);
        long jA2 = d2Var.a(context, R.color.system_on_primary_light);
        long jA3 = d2Var.a(context, R.color.system_primary_container_light);
        long jA4 = d2Var.a(context, R.color.system_on_primary_container_light);
        long jA5 = d2Var.a(context, R.color.system_primary_dark);
        long jA6 = d2Var.a(context, R.color.system_secondary_light);
        long jA7 = d2Var.a(context, R.color.system_on_secondary_light);
        long jA8 = d2Var.a(context, R.color.system_secondary_container_light);
        long jA9 = d2Var.a(context, R.color.system_on_secondary_container_light);
        long jA10 = d2Var.a(context, R.color.system_tertiary_light);
        long jA11 = d2Var.a(context, R.color.system_on_tertiary_light);
        long jA12 = d2Var.a(context, R.color.system_tertiary_container_light);
        long jA13 = d2Var.a(context, R.color.system_on_tertiary_container_light);
        long jA14 = d2Var.a(context, R.color.system_background_light);
        long jA15 = d2Var.a(context, R.color.system_on_background_light);
        long jA16 = d2Var.a(context, R.color.system_surface_light);
        long jA17 = d2Var.a(context, R.color.system_on_surface_light);
        long jA18 = d2Var.a(context, R.color.system_surface_variant_light);
        long jA19 = d2Var.a(context, R.color.system_on_surface_variant_light);
        long jA20 = d2Var.a(context, R.color.system_surface_dark);
        long jA21 = d2Var.a(context, R.color.system_on_surface_dark);
        long jA22 = d2Var.a(context, R.color.system_outline_light);
        long jA23 = d2Var.a(context, R.color.system_outline_variant_light);
        long jA24 = d2Var.a(context, R.color.system_surface_bright_light);
        long jA25 = d2Var.a(context, R.color.system_surface_dim_light);
        return g2.k(jA, jA2, jA3, jA4, jA5, jA6, jA7, jA8, jA9, jA10, jA11, jA12, jA13, jA14, jA15, jA16, jA17, jA18, jA19, d2Var.a(context, R.color.system_primary_light), jA20, jA21, 0L, 0L, 0L, 0L, jA22, jA23, 0L, jA24, d2Var.a(context, R.color.system_surface_container_light), d2Var.a(context, R.color.system_surface_container_high_light), d2Var.a(context, R.color.system_surface_container_highest_light), d2Var.a(context, R.color.system_surface_container_low_light), d2Var.a(context, R.color.system_surface_container_lowest_light), jA25, d2Var.a(context, R.color.system_primary_fixed), d2Var.a(context, R.color.system_primary_fixed_dim), d2Var.a(context, R.color.system_on_primary_fixed), d2Var.a(context, R.color.system_on_primary_fixed_variant), d2Var.a(context, R.color.system_secondary_fixed), d2Var.a(context, R.color.system_secondary_fixed_dim), d2Var.a(context, R.color.system_on_secondary_fixed), d2Var.a(context, R.color.system_on_secondary_fixed_variant), d2Var.a(context, R.color.system_tertiary_fixed), d2Var.a(context, R.color.system_tertiary_fixed_dim), d2Var.a(context, R.color.system_on_tertiary_fixed), d2Var.a(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0, null);
    }

    public static final oq g(Context context) {
        d2 d2Var = d2.f55560a;
        return new oq(d2Var.a(context, R.color.system_neutral1_0), d2Var.a(context, R.color.system_neutral1_10), h(d2Var.a(context, R.color.system_neutral1_600), 98.0f), h(d2Var.a(context, R.color.system_neutral1_600), 96.0f), d2Var.a(context, R.color.system_neutral1_50), h(d2Var.a(context, R.color.system_neutral1_600), 94.0f), h(d2Var.a(context, R.color.system_neutral1_600), 92.0f), d2Var.a(context, R.color.system_neutral1_100), h(d2Var.a(context, R.color.system_neutral1_600), 87.0f), d2Var.a(context, R.color.system_neutral1_200), d2Var.a(context, R.color.system_neutral1_300), d2Var.a(context, R.color.system_neutral1_400), d2Var.a(context, R.color.system_neutral1_500), d2Var.a(context, R.color.system_neutral1_600), d2Var.a(context, R.color.system_neutral1_700), h(d2Var.a(context, R.color.system_neutral1_600), 24.0f), h(d2Var.a(context, R.color.system_neutral1_600), 22.0f), d2Var.a(context, R.color.system_neutral1_800), h(d2Var.a(context, R.color.system_neutral1_600), 17.0f), h(d2Var.a(context, R.color.system_neutral1_600), 12.0f), d2Var.a(context, R.color.system_neutral1_900), h(d2Var.a(context, R.color.system_neutral1_600), 6.0f), h(d2Var.a(context, R.color.system_neutral1_600), 4.0f), d2Var.a(context, R.color.system_neutral1_1000), d2Var.a(context, R.color.system_neutral2_0), d2Var.a(context, R.color.system_neutral2_10), h(d2Var.a(context, R.color.system_neutral2_600), 98.0f), h(d2Var.a(context, R.color.system_neutral2_600), 96.0f), d2Var.a(context, R.color.system_neutral2_50), h(d2Var.a(context, R.color.system_neutral2_600), 94.0f), h(d2Var.a(context, R.color.system_neutral2_600), 92.0f), d2Var.a(context, R.color.system_neutral2_100), h(d2Var.a(context, R.color.system_neutral2_600), 87.0f), d2Var.a(context, R.color.system_neutral2_200), d2Var.a(context, R.color.system_neutral2_300), d2Var.a(context, R.color.system_neutral2_400), d2Var.a(context, R.color.system_neutral2_500), d2Var.a(context, R.color.system_neutral2_600), d2Var.a(context, R.color.system_neutral2_700), h(d2Var.a(context, R.color.system_neutral2_600), 24.0f), h(d2Var.a(context, R.color.system_neutral2_600), 22.0f), d2Var.a(context, R.color.system_neutral2_800), h(d2Var.a(context, R.color.system_neutral2_600), 17.0f), h(d2Var.a(context, R.color.system_neutral2_600), 12.0f), d2Var.a(context, R.color.system_neutral2_900), h(d2Var.a(context, R.color.system_neutral2_600), 6.0f), h(d2Var.a(context, R.color.system_neutral2_600), 4.0f), d2Var.a(context, R.color.system_neutral2_1000), d2Var.a(context, R.color.system_accent1_0), d2Var.a(context, R.color.system_accent1_10), d2Var.a(context, R.color.system_accent1_50), d2Var.a(context, R.color.system_accent1_100), d2Var.a(context, R.color.system_accent1_200), d2Var.a(context, R.color.system_accent1_300), d2Var.a(context, R.color.system_accent1_400), d2Var.a(context, R.color.system_accent1_500), d2Var.a(context, R.color.system_accent1_600), d2Var.a(context, R.color.system_accent1_700), d2Var.a(context, R.color.system_accent1_800), d2Var.a(context, R.color.system_accent1_900), d2Var.a(context, R.color.system_accent1_1000), d2Var.a(context, R.color.system_accent2_0), d2Var.a(context, R.color.system_accent2_10), d2Var.a(context, R.color.system_accent2_50), d2Var.a(context, R.color.system_accent2_100), d2Var.a(context, R.color.system_accent2_200), d2Var.a(context, R.color.system_accent2_300), d2Var.a(context, R.color.system_accent2_400), d2Var.a(context, R.color.system_accent2_500), d2Var.a(context, R.color.system_accent2_600), d2Var.a(context, R.color.system_accent2_700), d2Var.a(context, R.color.system_accent2_800), d2Var.a(context, R.color.system_accent2_900), d2Var.a(context, R.color.system_accent2_1000), d2Var.a(context, R.color.system_accent3_0), d2Var.a(context, R.color.system_accent3_10), d2Var.a(context, R.color.system_accent3_50), d2Var.a(context, R.color.system_accent3_100), d2Var.a(context, R.color.system_accent3_200), d2Var.a(context, R.color.system_accent3_300), d2Var.a(context, R.color.system_accent3_400), d2Var.a(context, R.color.system_accent3_500), d2Var.a(context, R.color.system_accent3_600), d2Var.a(context, R.color.system_accent3_700), d2Var.a(context, R.color.system_accent3_800), d2Var.a(context, R.color.system_accent3_900), d2Var.a(context, R.color.system_accent3_1000), null);
    }

    public static final long h(long j15, float f15) {
        double d15 = f15;
        if ((d15 < 1.0E-4d) || (d15 > 99.9999d)) {
            return o1.b(b.f88366a.b(d15));
        }
        a.Companion companion = a.INSTANCE;
        a aVarB = companion.b(o1.j(j15));
        return o1.b(companion.f(aVarB.getHue(), aVarB.getChroma(), f15));
    }
}
