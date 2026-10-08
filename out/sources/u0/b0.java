package u0;

import p071kotlin.Metadata;
import u0.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B9\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fB;\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\u000eJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u001a\u0010%\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u001a\u0010)\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001e\u0010(R\u001a\u0010.\u001a\u00020*8\u0016X\u0096D¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u0015\u0010-¨\u0006/"}, d2 = {"Lu0/b0;", "T", "Lu0/t;", "V", "Lu0/g;", "Lu0/v3;", "animationSpec", "Lu0/y2;", "typeConverter", "initialValue", "initialVelocityVector", "<init>", "(Lu0/v3;Lu0/y2;Ljava/lang/Object;Lu0/t;)V", "Lu0/c0;", "(Lu0/c0;Lu0/y2;Ljava/lang/Object;Lu0/t;)V", "", "playTimeNanos", "f", "(J)Ljava/lang/Object;", "b", "(J)Lu0/t;", "a", "Lu0/v3;", "Lu0/y2;", "e", "()Lu0/y2;", "c", "Ljava/lang/Object;", "getInitialValue", "()Ljava/lang/Object;", "d", "Lu0/t;", "initialValueVector", "getInitialVelocityVector", "()Lu0/t;", "endVelocity", "g", "targetValue", "h", "J", "()J", "durationNanos", "", "i", "Z", "()Z", "isInfinite", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0<T, V extends t> implements g<T, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v3<V> animationSpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y2<T, V> typeConverter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final T initialValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final V initialValueVector;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final V initialVelocityVector;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final V endVelocity;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final T targetValue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long durationNanos;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean isInfinite;

    public b0(v3<V> v3Var, y2<T, V> y2Var, T t15, V v15) {
        this.animationSpec = v3Var;
        this.typeConverter = y2Var;
        this.initialValue = t15;
        V vB = e().a().b(t15);
        this.initialValueVector = vB;
        this.initialVelocityVector = (V) u.e(v15);
        this.targetValue = (T) e().b().b(v3Var.c(vB, v15));
        this.durationNanos = v3Var.b(vB, v15);
        V v16 = (V) u.e(v3Var.e(getDurationNanos(), vB, v15));
        this.endVelocity = v16;
        int size = v16.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            V v17 = this.endVelocity;
            v17.e(i15, lr.m.m(v17.a(i15), -this.animationSpec.getAbsVelocityThreshold(), this.animationSpec.getAbsVelocityThreshold()));
        }
    }

    @Override // u0.g
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getIsInfinite() {
        return this.isInfinite;
    }

    @Override // u0.g
    public V b(long playTimeNanos) {
        return !c(playTimeNanos) ? (V) this.animationSpec.e(playTimeNanos, this.initialValueVector, this.initialVelocityVector) : this.endVelocity;
    }

    @Override // u0.g
    /* JADX INFO: renamed from: d, reason: from getter */
    public long getDurationNanos() {
        return this.durationNanos;
    }

    @Override // u0.g
    public y2<T, V> e() {
        return this.typeConverter;
    }

    @Override // u0.g
    public T f(long playTimeNanos) {
        return !c(playTimeNanos) ? (T) e().b().b(this.animationSpec.d(playTimeNanos, this.initialValueVector, this.initialVelocityVector)) : g();
    }

    @Override // u0.g
    public T g() {
        return this.targetValue;
    }

    public b0(c0<T> c0Var, y2<T, V> y2Var, T t15, V v15) {
        this(c0Var.a(y2Var), y2Var, t15, v15);
    }
}
