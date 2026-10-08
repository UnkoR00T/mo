package p046f2;

import androidx.compose.material3.d;
import androidx.compose.ui.graphics.Color;
import c5.h;
import l2.e1;
import n3.o1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J¯\u0001\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001e\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u00020\u0004*\u00020\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lf2/em;", "", "<init>", "()V", "Lf2/dm;", "a", "(Lm2/r;I)Lf2/dm;", "Landroidx/compose/ui/graphics/Color;", "checkedThumbColor", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "b", "(JJJJJJJJJJJJJJJJLm2/r;III)Lf2/dm;", "Lc5/h;", "F", "getIconSize-D9Ej5fM", "()F", "IconSize", "Lf2/e2;", "c", "(Lf2/e2;)Lf2/dm;", "defaultSwitchColors", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class em {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final em f55799a = new em();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize = h.n(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f55801c = 0;

    private em() {
    }

    public final dm a(r rVar, int i15) {
        if (t.k()) {
            t.o(435552781, i15, -1, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:341)");
        }
        dm dmVarC = c(d.f9816a.a(rVar, 6));
        if (t.k()) {
            t.n();
        }
        return dmVarC;
    }

    public final dm b(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36, long j37, long j38, long j39, long j45, r rVar, int i15, int i16, int i17) {
        long jG;
        long jG2;
        long jG3;
        long jG4;
        long jG5;
        int i18;
        long jG6;
        long jG7;
        long jI = (i17 & 1) != 0 ? g2.i(e1.f114447a.o(), rVar, 6) : j15;
        long jI2 = (i17 & 2) != 0 ? g2.i(e1.f114447a.r(), rVar, 6) : j16;
        long jG8 = (i17 & 4) != 0 ? Color.INSTANCE.g() : j17;
        long jI3 = (i17 & 8) != 0 ? g2.i(e1.f114447a.q(), rVar, 6) : j18;
        long jI4 = (i17 & 16) != 0 ? g2.i(e1.f114447a.y(), rVar, 6) : j19;
        long jI5 = (i17 & 32) != 0 ? g2.i(e1.f114447a.B(), rVar, 6) : j25;
        long jI6 = (i17 & 64) != 0 ? g2.i(e1.f114447a.x(), rVar, 6) : j26;
        long jI7 = (i17 & 128) != 0 ? g2.i(e1.f114447a.A(), rVar, 6) : j27;
        if ((i17 & 256) != 0) {
            e1 e1Var = e1.f114447a;
            jG = o1.g(Color.m9copywmQWz5c$default(g2.i(e1Var.a(), rVar, 6), e1Var.b(), 0.0f, 0.0f, 0.0f, 14, null), d.f9816a.a(rVar, 6).getSurface());
        } else {
            jG = j28;
        }
        if ((i17 & 512) != 0) {
            e1 e1Var2 = e1.f114447a;
            jG2 = o1.g(Color.m9copywmQWz5c$default(g2.i(e1Var2.e(), rVar, 6), e1Var2.f(), 0.0f, 0.0f, 0.0f, 14, null), d.f9816a.a(rVar, 6).getSurface());
        } else {
            jG2 = j29;
        }
        long jG9 = (i17 & 1024) != 0 ? Color.INSTANCE.g() : j35;
        if ((i17 & 2048) != 0) {
            e1 e1Var3 = e1.f114447a;
            jG3 = o1.g(Color.m9copywmQWz5c$default(g2.i(e1Var3.c(), rVar, 6), e1Var3.d(), 0.0f, 0.0f, 0.0f, 14, null), d.f9816a.a(rVar, 6).getSurface());
        } else {
            jG3 = j36;
        }
        if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
            e1 e1Var4 = e1.f114447a;
            jG4 = o1.g(Color.m9copywmQWz5c$default(g2.i(e1Var4.g(), rVar, 6), e1Var4.h(), 0.0f, 0.0f, 0.0f, 14, null), d.f9816a.a(rVar, 6).getSurface());
        } else {
            jG4 = j37;
        }
        if ((i17 & PKIFailureInfo.certRevoked) != 0) {
            e1 e1Var5 = e1.f114447a;
            jG5 = o1.g(Color.m9copywmQWz5c$default(g2.i(e1Var5.k(), rVar, 6), e1Var5.f(), 0.0f, 0.0f, 0.0f, 14, null), d.f9816a.a(rVar, 6).getSurface());
        } else {
            jG5 = j38;
        }
        if ((i17 & 16384) != 0) {
            e1 e1Var6 = e1.f114447a;
            i18 = 6;
            jG6 = o1.g(Color.m9copywmQWz5c$default(g2.i(e1Var6.l(), rVar, 6), e1Var6.f(), 0.0f, 0.0f, 0.0f, 14, null), d.f9816a.a(rVar, 6).getSurface());
        } else {
            i18 = 6;
            jG6 = j39;
        }
        if ((i17 & 32768) != 0) {
            e1 e1Var7 = e1.f114447a;
            jG7 = o1.g(Color.m9copywmQWz5c$default(g2.i(e1Var7.i(), rVar, i18), e1Var7.j(), 0.0f, 0.0f, 0.0f, 14, null), d.f9816a.a(rVar, i18).getSurface());
        } else {
            jG7 = j45;
        }
        if (t.k()) {
            t.o(1937926421, i15, i16, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:404)");
        }
        long j46 = jI2;
        long j47 = jI;
        dm dmVar = new dm(j47, j46, jG8, jI3, jI4, jI5, jI6, jI7, jG, jG2, jG9, jG3, jG4, jG5, jG6, jG7, null);
        if (t.k()) {
            t.n();
        }
        return dmVar;
    }

    public final dm c(ColorScheme colorScheme) {
        dm defaultSwitchColorsCached = colorScheme.getDefaultSwitchColorsCached();
        if (defaultSwitchColorsCached != null) {
            return defaultSwitchColorsCached;
        }
        e1 e1Var = e1.f114447a;
        long jH = g2.h(colorScheme, e1Var.o());
        long jH2 = g2.h(colorScheme, e1Var.r());
        Color.Companion companion = Color.INSTANCE;
        dm dmVar = new dm(jH, jH2, companion.g(), g2.h(colorScheme, e1Var.q()), g2.h(colorScheme, e1Var.y()), g2.h(colorScheme, e1Var.B()), g2.h(colorScheme, e1Var.x()), g2.h(colorScheme, e1Var.A()), o1.g(Color.m9copywmQWz5c$default(g2.h(colorScheme, e1Var.a()), e1Var.b(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), o1.g(Color.m9copywmQWz5c$default(g2.h(colorScheme, e1Var.e()), e1Var.f(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), companion.g(), o1.g(Color.m9copywmQWz5c$default(g2.h(colorScheme, e1Var.c()), e1Var.d(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), o1.g(Color.m9copywmQWz5c$default(g2.h(colorScheme, e1Var.g()), e1Var.h(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), o1.g(Color.m9copywmQWz5c$default(g2.h(colorScheme, e1Var.k()), e1Var.f(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), o1.g(Color.m9copywmQWz5c$default(g2.h(colorScheme, e1Var.l()), e1Var.f(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), o1.g(Color.m9copywmQWz5c$default(g2.h(colorScheme, e1Var.i()), e1Var.j(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), null);
        colorScheme.t0(dmVar);
        return dmVar;
    }
}
