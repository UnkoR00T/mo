package r0;

import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00102\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lr0/l0;", "Lr0/v;", "", "initialCapacity", "<init>", "(I)V", "", "element", "", "d", "(J)Z", "index", "", "elements", "e", "(I[J)Z", "Loq/i0;", "f", "()V", "capacity", "g", "h", "(I)J", "start", "end", "i", "(II)V", "j", "(IJ)J", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l0 extends v {
    public l0(int i15) {
        super(i15, null);
    }

    public final boolean d(long element) {
        g(this._size + 1);
        long[] jArr = this.content;
        int i15 = this._size;
        jArr[i15] = element;
        this._size = i15 + 1;
        return true;
    }

    public final boolean e(int index, long[] elements) {
        if (index < 0 || index > this._size) {
            s0.d.c("");
        }
        if (elements.length == 0) {
            return false;
        }
        g(this._size + elements.length);
        long[] jArr = this.content;
        int i15 = this._size;
        if (index != i15) {
            pq.n.m(jArr, jArr, elements.length + index, index, i15);
        }
        pq.n.r(elements, jArr, index, 0, 0, 12, null);
        this._size += elements.length;
        return true;
    }

    public final void f() {
        this._size = 0;
    }

    public final void g(int capacity) {
        long[] jArr = this.content;
        if (jArr.length < capacity) {
            this.content = Arrays.copyOf(jArr, Math.max(capacity, (jArr.length * 3) / 2));
        }
    }

    public final long h(int index) {
        if (index < 0 || index >= this._size) {
            s0.d.c("Index must be between 0 and size");
        }
        long[] jArr = this.content;
        long j15 = jArr[index];
        int i15 = this._size;
        if (index != i15 - 1) {
            pq.n.m(jArr, jArr, index, index + 1, i15);
        }
        this._size--;
        return j15;
    }

    public final void i(int start, int end) {
        int i15;
        if (start < 0 || start > (i15 = this._size) || end < 0 || end > i15) {
            s0.d.c("Index must be between 0 and size");
        }
        if (end < start) {
            s0.d.a("The end index must be < start index");
        }
        if (end != start) {
            int i16 = this._size;
            if (end < i16) {
                long[] jArr = this.content;
                pq.n.m(jArr, jArr, start, end, i16);
            }
            this._size -= end - start;
        }
    }

    public final long j(int index, long element) {
        if (index < 0 || index >= this._size) {
            s0.d.c("Index must be between 0 and size");
        }
        long[] jArr = this.content;
        long j15 = jArr[index];
        jArr[index] = element;
        return j15;
    }

    public /* synthetic */ l0(int i15, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 16 : i15);
    }
}
