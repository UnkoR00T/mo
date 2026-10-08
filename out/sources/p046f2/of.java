package p046f2;

import androidx.compose.material3.d;
import androidx.compose.material3.f;
import l2.k0;
import oq.p;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import u0.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"T", "Landroidx/compose/material3/f;", "Ll2/k0;", "value", "Lu0/j0;", "a", "(Landroidx/compose/material3/f;Ll2/k0;)Lu0/j0;", "b", "(Ll2/k0;Lm2/r;I)Lu0/j0;", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class of {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57134a;

        static {
            int[] iArr = new int[k0.values().length];
            try {
                iArr[k0.DefaultSpatial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k0.FastSpatial.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k0.SlowSpatial.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k0.DefaultEffects.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k0.FastEffects.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[k0.SlowEffects.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f57134a = iArr;
        }
    }

    public static final <T> j0<T> a(f fVar, k0 k0Var) {
        switch (a.f57134a[k0Var.ordinal()]) {
            case 1:
                return fVar.f();
            case 2:
                return fVar.a();
            case 3:
                return fVar.c();
            case 4:
                return fVar.b();
            case 5:
                return fVar.e();
            case 6:
                return fVar.d();
            default:
                throw new p();
        }
    }

    public static final <T> j0<T> b(k0 k0Var, r rVar, int i15) {
        if (t.k()) {
            t.o(-19828261, i15, -1, "androidx.compose.material3.value (MotionScheme.kt:289)");
        }
        j0<T> j0VarA = a(d.f9816a.c(rVar, 6), k0Var);
        if (t.k()) {
            t.n();
        }
        return j0VarA;
    }
}
