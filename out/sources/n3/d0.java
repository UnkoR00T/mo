package n3;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln3/a1;", "Landroid/graphics/PorterDuff$Mode;", "b", "(I)Landroid/graphics/PorterDuff$Mode;", "Landroid/graphics/BlendMode;", "a", "(I)Landroid/graphics/BlendMode;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d0 {
    public static final BlendMode a(int i15) {
        a1.Companion companion = a1.INSTANCE;
        if (a1.E(i15, companion.a())) {
            return BlendMode.CLEAR;
        }
        if (a1.E(i15, companion.x())) {
            return BlendMode.SRC;
        }
        if (a1.E(i15, companion.g())) {
            return BlendMode.DST;
        }
        if (a1.E(i15, companion.B())) {
            return BlendMode.SRC_OVER;
        }
        if (a1.E(i15, companion.k())) {
            return BlendMode.DST_OVER;
        }
        if (a1.E(i15, companion.z())) {
            return BlendMode.SRC_IN;
        }
        if (a1.E(i15, companion.i())) {
            return BlendMode.DST_IN;
        }
        if (a1.E(i15, companion.A())) {
            return BlendMode.SRC_OUT;
        }
        if (a1.E(i15, companion.j())) {
            return BlendMode.DST_OUT;
        }
        if (a1.E(i15, companion.y())) {
            return BlendMode.SRC_ATOP;
        }
        if (a1.E(i15, companion.h())) {
            return BlendMode.DST_ATOP;
        }
        if (a1.E(i15, companion.C())) {
            return BlendMode.XOR;
        }
        if (a1.E(i15, companion.t())) {
            return BlendMode.PLUS;
        }
        if (a1.E(i15, companion.q())) {
            return BlendMode.MODULATE;
        }
        if (a1.E(i15, companion.v())) {
            return BlendMode.SCREEN;
        }
        if (a1.E(i15, companion.s())) {
            return BlendMode.OVERLAY;
        }
        if (a1.E(i15, companion.e())) {
            return BlendMode.DARKEN;
        }
        if (a1.E(i15, companion.o())) {
            return BlendMode.LIGHTEN;
        }
        if (a1.E(i15, companion.d())) {
            return BlendMode.COLOR_DODGE;
        }
        if (a1.E(i15, companion.c())) {
            return BlendMode.COLOR_BURN;
        }
        if (a1.E(i15, companion.m())) {
            return BlendMode.HARD_LIGHT;
        }
        if (a1.E(i15, companion.w())) {
            return BlendMode.SOFT_LIGHT;
        }
        if (a1.E(i15, companion.f())) {
            return BlendMode.DIFFERENCE;
        }
        if (a1.E(i15, companion.l())) {
            return BlendMode.EXCLUSION;
        }
        if (a1.E(i15, companion.r())) {
            return BlendMode.MULTIPLY;
        }
        if (a1.E(i15, companion.n())) {
            return BlendMode.HUE;
        }
        if (a1.E(i15, companion.u())) {
            return BlendMode.SATURATION;
        }
        if (a1.E(i15, companion.b())) {
            return BlendMode.COLOR;
        }
        return a1.E(i15, companion.p()) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode b(int i15) {
        a1.Companion companion = a1.INSTANCE;
        if (a1.E(i15, companion.a())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (a1.E(i15, companion.x())) {
            return PorterDuff.Mode.SRC;
        }
        if (a1.E(i15, companion.g())) {
            return PorterDuff.Mode.DST;
        }
        if (a1.E(i15, companion.B())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (a1.E(i15, companion.k())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (a1.E(i15, companion.z())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (a1.E(i15, companion.i())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (a1.E(i15, companion.A())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (a1.E(i15, companion.j())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (a1.E(i15, companion.y())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (a1.E(i15, companion.h())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (a1.E(i15, companion.C())) {
            return PorterDuff.Mode.XOR;
        }
        if (a1.E(i15, companion.t())) {
            return PorterDuff.Mode.ADD;
        }
        if (a1.E(i15, companion.v())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (a1.E(i15, companion.s())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (a1.E(i15, companion.e())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (a1.E(i15, companion.o())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return a1.E(i15, companion.q()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
