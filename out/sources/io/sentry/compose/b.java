package io.sentry.compose;

import c5.r;
import m3.e;
import m3.f;
import m3.g;
import p036e4.b0;
import p036e4.c0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a/\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\n\u001a#\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u000e\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u000f\u001a\u001b\u0010\u0007\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Le4/b0;", "rootCoordinates", "Lm3/g;", "a", "(Le4/b0;Le4/b0;)Lm3/g;", "", "b", "c", "d", "f", "(FFFF)F", "e", "minimumValue", "maximumValue", "(FFF)F", "(FF)F", "sentry-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {
    public static final g a(b0 b0Var, b0 b0Var2) {
        if (b0Var2 == null) {
            b0Var2 = c0.e(b0Var);
        }
        float fG = r.g(b0Var2.b());
        float f15 = r.f(b0Var2.b());
        g gVarZ0 = b0.z0(b0Var2, b0Var, false, 2, null);
        float fD = d(gVarZ0.getLeft(), 0.0f, fG);
        float fD2 = d(gVarZ0.getTop(), 0.0f, f15);
        float fD3 = d(gVarZ0.getRight(), 0.0f, fG);
        float fD4 = d(gVarZ0.getBottom(), 0.0f, f15);
        if (fD == fD3 || fD2 == fD4) {
            return g.INSTANCE.a();
        }
        long jW = b0Var2.W(f.a(fD, fD2));
        long jW2 = b0Var2.W(f.a(fD3, fD2));
        long jW3 = b0Var2.W(f.a(fD3, fD4));
        long jW4 = b0Var2.W(f.a(fD, fD4));
        float fM = e.m(jW);
        float fM2 = e.m(jW2);
        float fM3 = e.m(jW4);
        float fM4 = e.m(jW3);
        float f16 = f(fM, fM2, fM3, fM4);
        float fE = e(fM, fM2, fM3, fM4);
        float fN = e.n(jW);
        float fN2 = e.n(jW2);
        float fN3 = e.n(jW4);
        float fN4 = e.n(jW3);
        return new g(f16, f(fN, fN2, fN3, fN4), fE, e(fN, fN2, fN3, fN4));
    }

    private static final float b(float f15, float f16) {
        return f15 < f16 ? f16 : f15;
    }

    private static final float c(float f15, float f16) {
        return f15 > f16 ? f16 : f15;
    }

    private static final float d(float f15, float f16, float f17) {
        return c(b(f15, f16), f17);
    }

    private static final float e(float f15, float f16, float f17, float f18) {
        return Math.max(f15, Math.max(f16, Math.max(f17, f18)));
    }

    private static final float f(float f15, float f16, float f17, float f18) {
        return Math.min(f15, Math.min(f16, Math.min(f17, f18)));
    }
}
