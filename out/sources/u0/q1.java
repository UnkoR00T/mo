package u0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0001\u0010\n*\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lu0/q1;", "T", "Lu0/j0;", "", "dampingRatio", "stiffness", "visibilityThreshold", "<init>", "(FFLjava/lang/Object;)V", "Lu0/t;", "V", "Lu0/y2;", "converter", "Lu0/e4;", "i", "(Lu0/y2;)Lu0/e4;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "f", "()F", "b", "g", "c", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q1<T> implements j0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float dampingRatio;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float stiffness;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final T visibilityThreshold;

    public q1() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public boolean equals(Object other) {
        if (other instanceof q1) {
            q1 q1Var = (q1) other;
            if (q1Var.dampingRatio == this.dampingRatio && q1Var.stiffness == this.stiffness && fr.t.c(q1Var.visibilityThreshold, this.visibilityThreshold)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getStiffness() {
        return this.stiffness;
    }

    public final T h() {
        return this.visibilityThreshold;
    }

    public int hashCode() {
        T t15 = this.visibilityThreshold;
        return ((((t15 != null ? t15.hashCode() : 0) * 31) + Float.hashCode(this.dampingRatio)) * 31) + Float.hashCode(this.stiffness);
    }

    @Override // u0.j0, u0.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public <V extends t> e4<V> a(y2<T, V> converter) {
        return new e4<>(this.dampingRatio, this.stiffness, m.b(converter, this.visibilityThreshold));
    }

    public q1(float f15, float f16, T t15) {
        this.dampingRatio = f15;
        this.stiffness = f16;
        this.visibilityThreshold = t15;
    }

    public /* synthetic */ q1(float f15, float f16, Object obj, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? 1.0f : f15, (i15 & 2) != 0 ? 1500.0f : f16, (i15 & 4) != 0 ? null : obj);
    }
}
