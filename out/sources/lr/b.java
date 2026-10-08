package lr;

import fr.t;
import java.util.NoSuchElementException;
import p071kotlin.Metadata;
import pq.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e¨\u0006\u0017"}, d2 = {"Llr/b;", "Lpq/u;", "", "first", "last", "", "step", "<init>", "(CCI)V", "", "hasNext", "()Z", "a", "()C", "I", "getStep", "()I", "b", "finalElement", "c", "Z", "d", "next", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int step;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int finalElement;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hasNext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int next;

    public b(char c15, char c16, int i15) {
        this.step = i15;
        this.finalElement = c16;
        boolean z15 = false;
        if (i15 <= 0 ? t.d(c15, c16) >= 0 : t.d(c15, c16) <= 0) {
            z15 = true;
        }
        this.hasNext = z15;
        this.next = z15 ? c15 : c16;
    }

    @Override // pq.u
    public char a() {
        int i15 = this.next;
        if (i15 != this.finalElement) {
            this.next = this.step + i15;
        } else {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        }
        return (char) i15;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }
}
