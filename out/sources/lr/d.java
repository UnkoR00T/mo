package lr;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u001e¨\u0006\u001f"}, d2 = {"Llr/d;", "Llr/e;", "", "start", "endInclusive", "<init>", "(FF)V", "a", "b", "", "d", "(FF)Z", "value", "(F)Z", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "_start", "_endInclusive", "c", "()Ljava/lang/Float;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class d implements e<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float _start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float _endInclusive;

    public d(float f15, float f16) {
        this._start = f15;
        this._endInclusive = f16;
    }

    public boolean a(float value) {
        return value >= this._start && value <= this._endInclusive;
    }

    @Override // lr.f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float h() {
        return Float.valueOf(this._endInclusive);
    }

    @Override // lr.f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float e() {
        return Float.valueOf(this._start);
    }

    public boolean d(float a15, float b15) {
        return a15 <= b15;
    }

    public boolean equals(Object other) {
        if (!(other instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) other).isEmpty()) {
            return true;
        }
        d dVar = (d) other;
        return this._start == dVar._start && this._endInclusive == dVar._endInclusive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lr.e
    public /* bridge */ /* synthetic */ boolean f(Comparable comparable, Comparable comparable2) {
        return d(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lr.e
    public /* bridge */ /* synthetic */ boolean g(Comparable comparable) {
        return a(((Number) comparable).floatValue());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this._start) * 31) + Float.hashCode(this._endInclusive);
    }

    @Override // lr.e
    public boolean isEmpty() {
        return this._start > this._endInclusive;
    }

    public String toString() {
        return this._start + ".." + this._endInclusive;
    }
}
