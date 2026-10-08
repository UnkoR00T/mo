package lr;

import p071kotlin.Metadata;
import pq.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Llr/a;", "", "", "start", "endInclusive", "", "step", "<init>", "(CCI)V", "Lpq/u;", "l", "()Lpq/u;", "a", "C", "i", "()C", "first", "b", "k", "last", "c", "I", "getStep", "()I", "d", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a implements Iterable<Character>, gr.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final char first;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final char last;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int step;

    public a(char c15, char c16, int i15) {
        if (i15 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i15 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = c15;
        this.last = (char) xq.c.c(c15, c16, i15);
        this.step = i15;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final char getFirst() {
        return this.first;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final char getLast() {
        return this.last;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public u iterator() {
        return new b(this.first, this.last, this.step);
    }
}
