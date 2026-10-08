package lr;

import p071kotlin.Metadata;
import pq.s0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\b\u0016\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u0013¨\u0006!"}, d2 = {"Llr/g;", "", "", "start", "endInclusive", "step", "<init>", "(III)V", "Lpq/s0;", "n", "()Lpq/s0;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "i", "first", "b", "k", "last", "c", "l", "d", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class g implements Iterable<Integer>, gr.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int first;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int last;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int step;

    /* JADX INFO: renamed from: lr.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Llr/g$a;", "", "<init>", "()V", "", "rangeStart", "rangeEnd", "step", "Llr/g;", "a", "(III)Llr/g;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final g a(int rangeStart, int rangeEnd, int step) {
            return new g(rangeStart, rangeEnd, step);
        }

        private Companion() {
        }
    }

    public g(int i15, int i16, int i17) {
        if (i17 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i17 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = i15;
        this.last = xq.c.c(i15, i16, i17);
        this.step = i17;
    }

    public boolean equals(Object other) {
        if (!(other instanceof g)) {
            return false;
        }
        if (isEmpty() && ((g) other).isEmpty()) {
            return true;
        }
        g gVar = (g) other;
        return this.first == gVar.first && this.last == gVar.last && this.step == gVar.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.first * 31) + this.last) * 31) + this.step;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getFirst() {
        return this.first;
    }

    public boolean isEmpty() {
        if (this.step > 0) {
            return this.first > this.last;
        }
        return this.first < this.last;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getLast() {
        return this.last;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public s0 iterator() {
        return new h(this.first, this.last, this.step);
    }

    public String toString() {
        StringBuilder sb5;
        int i15;
        if (this.step > 0) {
            sb5 = new StringBuilder();
            sb5.append(this.first);
            sb5.append("..");
            sb5.append(this.last);
            sb5.append(" step ");
            i15 = this.step;
        } else {
            sb5 = new StringBuilder();
            sb5.append(this.first);
            sb5.append(" downTo ");
            sb5.append(this.last);
            sb5.append(" step ");
            i15 = -this.step;
        }
        sb5.append(i15);
        return sb5.toString();
    }
}
