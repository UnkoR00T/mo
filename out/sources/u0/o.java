package u0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001am\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a[\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0003*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0002\u0010\u0004\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011\u001aI\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015\u001ak\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019\u001a5\u0010\u001a\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"T", "Lu0/t;", "V", "Lu0/n;", "value", "velocityVector", "", "lastFrameTimeNanos", "finishedTimeNanos", "", "isRunning", "f", "(Lu0/n;Ljava/lang/Object;Lu0/t;JJZ)Lu0/n;", "", "Lu0/p;", "velocity", "e", "(Lu0/n;FFJJZ)Lu0/n;", "initialValue", "initialVelocity", "a", "(FFJJZ)Lu0/n;", "Lu0/y2;", "typeConverter", "b", "(Lu0/y2;Ljava/lang/Object;Ljava/lang/Object;JJZ)Lu0/n;", "i", "(Lu0/y2;Ljava/lang/Object;)Lu0/t;", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {
    public static final AnimationState<Float, p> a(float f15, float f16, long j15, long j16, boolean z15) {
        return new AnimationState<>(s3.P(fr.m.f66405a), Float.valueOf(f15), u.a(f16), j15, j16, z15);
    }

    public static final <T, V extends t> AnimationState<T, V> b(y2<T, V> y2Var, T t15, T t16, long j15, long j16, boolean z15) {
        return new AnimationState<>(y2Var, t15, y2Var.a().b(t16), j15, j16, z15);
    }

    public static /* synthetic */ AnimationState c(float f15, float f16, long j15, long j16, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            f16 = 0.0f;
        }
        if ((i15 & 4) != 0) {
            j15 = Long.MIN_VALUE;
        }
        if ((i15 & 8) != 0) {
            j16 = Long.MIN_VALUE;
        }
        if ((i15 & 16) != 0) {
            z15 = false;
        }
        return a(f15, f16, j15, j16, z15);
    }

    public static /* synthetic */ AnimationState d(y2 y2Var, Object obj, Object obj2, long j15, long j16, boolean z15, int i15, Object obj3) {
        if ((i15 & 8) != 0) {
            j15 = Long.MIN_VALUE;
        }
        if ((i15 & 16) != 0) {
            j16 = Long.MIN_VALUE;
        }
        if ((i15 & 32) != 0) {
            z15 = false;
        }
        return b(y2Var, obj, obj2, j15, j16, z15);
    }

    public static final AnimationState<Float, p> e(AnimationState<Float, p> nVar, float f15, float f16, long j15, long j16, boolean z15) {
        return new AnimationState<>(nVar.t(), Float.valueOf(f15), u.a(f16), j15, j16, z15);
    }

    public static final <T, V extends t> AnimationState<T, V> f(AnimationState<T, V> nVar, T t15, V v15, long j15, long j16, boolean z15) {
        return new AnimationState<>(nVar.t(), t15, v15, j15, j16, z15);
    }

    public static /* synthetic */ AnimationState g(AnimationState nVar, float f15, float f16, long j15, long j16, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = ((Number) nVar.getValue()).floatValue();
        }
        if ((i15 & 2) != 0) {
            f16 = ((p) nVar.z()).getValue();
        }
        if ((i15 & 4) != 0) {
            j15 = nVar.getLastFrameTimeNanos();
        }
        if ((i15 & 8) != 0) {
            j16 = nVar.getFinishedTimeNanos();
        }
        if ((i15 & 16) != 0) {
            z15 = nVar.getIsRunning();
        }
        boolean z16 = z15;
        long j17 = j16;
        return e(nVar, f15, f16, j15, j17, z16);
    }

    public static /* synthetic */ AnimationState h(AnimationState nVar, Object obj, t tVar, long j15, long j16, boolean z15, int i15, Object obj2) {
        if ((i15 & 1) != 0) {
            obj = nVar.getValue();
        }
        if ((i15 & 2) != 0) {
            tVar = u.e(nVar.z());
        }
        if ((i15 & 4) != 0) {
            j15 = nVar.getLastFrameTimeNanos();
        }
        if ((i15 & 8) != 0) {
            j16 = nVar.getFinishedTimeNanos();
        }
        if ((i15 & 16) != 0) {
            z15 = nVar.getIsRunning();
        }
        boolean z16 = z15;
        long j17 = j16;
        return f(nVar, obj, tVar, j15, j17, z16);
    }

    public static final <T, V extends t> V i(y2<T, V> y2Var, T t15) {
        V vB = y2Var.a().b(t15);
        vB.d();
        return vB;
    }
}
