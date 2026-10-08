package u0;

import p071kotlin.Metadata;
import u0.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B!\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\fJ0\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0013J(\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lu0/e4;", "Lu0/t;", "V", "Lu0/x3;", "", "dampingRatio", "stiffness", "Lu0/v;", "anims", "<init>", "(FFLu0/v;)V", "visibilityThreshold", "(FFLu0/t;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "g", "(JLu0/t;Lu0/t;Lu0/t;)Lu0/t;", "f", "c", "(Lu0/t;Lu0/t;Lu0/t;)J", "e", "(Lu0/t;Lu0/t;Lu0/t;)Lu0/t;", "b", "F", "getDampingRatio", "()F", "getStiffness", "", "a", "()Z", "isInfinite", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e4<V extends t> implements x3<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ y3<V> f193593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float dampingRatio;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float stiffness;

    private e4(float f15, float f16, v vVar) {
        this.f193593a = new y3<>(vVar);
        this.dampingRatio = f15;
        this.stiffness = f16;
    }

    @Override // u0.x3, u0.t3
    public boolean a() {
        return this.f193593a.a();
    }

    @Override // u0.t3
    public long c(V initialValue, V targetValue, V initialVelocity) {
        return this.f193593a.c(initialValue, targetValue, initialVelocity);
    }

    @Override // u0.t3
    public V e(V initialValue, V targetValue, V initialVelocity) {
        return (V) this.f193593a.e(initialValue, targetValue, initialVelocity);
    }

    @Override // u0.t3
    public V f(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return (V) this.f193593a.f(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @Override // u0.t3
    public V g(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return (V) this.f193593a.g(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    public e4(float f15, float f16, V v15) {
        this(f15, f16, u3.f(v15, f15, f16));
    }
}
