package u0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00012\b\b\u0003\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0006*\u00020\u000b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lu0/c0;", "", "initialValue", "initialVelocity", "a", "(Lu0/c0;FF)F", "T", "frictionMultiplier", "absVelocityThreshold", "b", "(FF)Lu0/c0;", "Lu0/l0;", "d", "(Lu0/l0;)Lu0/c0;", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e0 {
    public static final float a(c0<Float> c0Var, float f15, float f16) {
        return ((p) c0Var.a(s3.P(fr.m.f66405a)).c(u.a(f15), u.a(f16))).getValue();
    }

    public static final <T> c0<T> b(float f15, float f16) {
        return d(new m0(f15, f16));
    }

    public static /* synthetic */ c0 c(float f15, float f16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = 1.0f;
        }
        if ((i15 & 2) != 0) {
            f16 = 0.1f;
        }
        return b(f15, f16);
    }

    public static final <T> c0<T> d(l0 l0Var) {
        return new d0(l0Var);
    }
}
