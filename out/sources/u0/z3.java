package u0;

import p071kotlin.Metadata;
import u0.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0011\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0016\u0010\u0019\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0016\u0010\u001a\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u0013\u0010\u001d¨\u0006\u001f"}, d2 = {"Lu0/z3;", "Lu0/t;", "V", "Lu0/v3;", "Lu0/l0;", "floatDecaySpec", "<init>", "(Lu0/l0;)V", "", "playTimeNanos", "initialValue", "initialVelocity", "d", "(JLu0/t;Lu0/t;)Lu0/t;", "b", "(Lu0/t;Lu0/t;)J", "e", "c", "(Lu0/t;Lu0/t;)Lu0/t;", "a", "Lu0/l0;", "getFloatDecaySpec", "()Lu0/l0;", "Lu0/t;", "valueVector", "velocityVector", "targetVector", "", "F", "()F", "absVelocityThreshold", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class z3<V extends t> implements v3<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l0 floatDecaySpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private V valueVector;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private V targetVector;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float absVelocityThreshold;

    public z3(l0 l0Var) {
        this.floatDecaySpec = l0Var;
        this.absVelocityThreshold = l0Var.getAbsVelocityThreshold();
    }

    @Override // u0.v3
    /* JADX INFO: renamed from: a, reason: from getter */
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // u0.v3
    public long b(V initialValue, V initialVelocity) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) u.g(initialValue);
        }
        V v15 = this.velocityVector;
        if (v15 == null) {
            v15 = null;
        }
        int size = v15.getSize();
        long jMax = 0;
        for (int i15 = 0; i15 < size; i15++) {
            jMax = Math.max(jMax, this.floatDecaySpec.c(initialValue.a(i15), initialVelocity.a(i15)));
        }
        return jMax;
    }

    @Override // u0.v3
    public V c(V initialValue, V initialVelocity) {
        if (this.targetVector == null) {
            this.targetVector = (V) u.g(initialValue);
        }
        V v15 = this.targetVector;
        if (v15 == null) {
            v15 = null;
        }
        int size = v15.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            V v16 = this.targetVector;
            if (v16 == null) {
                v16 = null;
            }
            v16.e(i15, this.floatDecaySpec.d(initialValue.a(i15), initialVelocity.a(i15)));
        }
        V v17 = this.targetVector;
        if (v17 == null) {
            return null;
        }
        return v17;
    }

    @Override // u0.v3
    public V d(long playTimeNanos, V initialValue, V initialVelocity) {
        if (this.valueVector == null) {
            this.valueVector = (V) u.g(initialValue);
        }
        V v15 = this.valueVector;
        if (v15 == null) {
            v15 = null;
        }
        int size = v15.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            V v16 = this.valueVector;
            if (v16 == null) {
                v16 = null;
            }
            v16.e(i15, this.floatDecaySpec.e(playTimeNanos, initialValue.a(i15), initialVelocity.a(i15)));
        }
        V v17 = this.valueVector;
        if (v17 == null) {
            return null;
        }
        return v17;
    }

    @Override // u0.v3
    public V e(long playTimeNanos, V initialValue, V initialVelocity) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) u.g(initialValue);
        }
        V v15 = this.velocityVector;
        if (v15 == null) {
            v15 = null;
        }
        int size = v15.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            V v16 = this.velocityVector;
            if (v16 == null) {
                v16 = null;
            }
            v16.e(i15, this.floatDecaySpec.b(playTimeNanos, initialValue.a(i15), initialVelocity.a(i15)));
        }
        V v17 = this.velocityVector;
        if (v17 == null) {
            return null;
        }
        return v17;
    }
}
