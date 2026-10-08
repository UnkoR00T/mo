package u0;

import p071kotlin.Metadata;
import u0.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ/\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J'\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0016\u0010\u001e\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a¨\u0006\u001f"}, d2 = {"Lu0/y3;", "Lu0/t;", "V", "Lu0/x3;", "Lu0/v;", "anims", "<init>", "(Lu0/v;)V", "Lu0/k0;", "anim", "(Lu0/k0;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "g", "(JLu0/t;Lu0/t;Lu0/t;)Lu0/t;", "f", "e", "(Lu0/t;Lu0/t;Lu0/t;)Lu0/t;", "c", "(Lu0/t;Lu0/t;Lu0/t;)J", "a", "Lu0/v;", "b", "Lu0/t;", "valueVector", "velocityVector", "d", "endVelocityVector", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y3<V extends t> implements x3<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v anims;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private V valueVector;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private V endVelocityVector;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"u0/y3$a", "Lu0/v;", "", "index", "Lu0/k0;", "get", "(I)Lu0/k0;", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0 f193979a;

        a(k0 k0Var) {
            this.f193979a = k0Var;
        }

        @Override // u0.v
        public k0 get(int index) {
            return this.f193979a;
        }
    }

    public y3(v vVar) {
        this.anims = vVar;
    }

    @Override // u0.t3
    public long c(V initialValue, V targetValue, V initialVelocity) {
        int size = initialValue.getSize();
        long jMax = 0;
        for (int i15 = 0; i15 < size; i15++) {
            jMax = Math.max(jMax, this.anims.get(i15).e(initialValue.a(i15), targetValue.a(i15), initialVelocity.a(i15)));
        }
        return jMax;
    }

    @Override // u0.t3
    public V e(V initialValue, V targetValue, V initialVelocity) {
        if (this.endVelocityVector == null) {
            this.endVelocityVector = (V) u.g(initialVelocity);
        }
        V v15 = this.endVelocityVector;
        if (v15 == null) {
            v15 = null;
        }
        int size = v15.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            V v16 = this.endVelocityVector;
            if (v16 == null) {
                v16 = null;
            }
            v16.e(i15, this.anims.get(i15).b(initialValue.a(i15), targetValue.a(i15), initialVelocity.a(i15)));
        }
        V v17 = this.endVelocityVector;
        if (v17 == null) {
            return null;
        }
        return v17;
    }

    @Override // u0.t3
    public V f(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) u.g(initialVelocity);
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
            v16.e(i15, this.anims.get(i15).d(playTimeNanos, initialValue.a(i15), targetValue.a(i15), initialVelocity.a(i15)));
        }
        V v17 = this.velocityVector;
        if (v17 == null) {
            return null;
        }
        return v17;
    }

    @Override // u0.t3
    public V g(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
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
            v16.e(i15, this.anims.get(i15).c(playTimeNanos, initialValue.a(i15), targetValue.a(i15), initialVelocity.a(i15)));
        }
        V v17 = this.valueVector;
        if (v17 == null) {
            return null;
        }
        return v17;
    }

    public y3(k0 k0Var) {
        this(new a(k0Var));
    }
}
