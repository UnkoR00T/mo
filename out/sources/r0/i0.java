package r0;

import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\tJ\u0017\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u000b2\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\rJ\"\u0010\u001c\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u0013¨\u0006\u001f"}, d2 = {"Lr0/i0;", "Lr0/o;", "", "initialCapacity", "<init>", "(I)V", "element", "", "k", "(I)Z", "index", "Loq/i0;", "j", "(II)V", "", "elements", "l", "(I[I)Z", "m", "()V", "capacity", "n", "o", "p", "(I)I", "start", "end", "q", "r", "(II)I", "s", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i0 extends o {
    public i0(int i15) {
        super(i15, null);
    }

    public final void j(int index, int element) {
        if (index < 0 || index > this._size) {
            s0.d.c("Index must be between 0 and size");
        }
        n(this._size + 1);
        int[] iArr = this.content;
        int i15 = this._size;
        if (index != i15) {
            pq.n.l(iArr, iArr, index + 1, index, i15);
        }
        iArr[index] = element;
        this._size++;
    }

    public final boolean k(int element) {
        n(this._size + 1);
        int[] iArr = this.content;
        int i15 = this._size;
        iArr[i15] = element;
        this._size = i15 + 1;
        return true;
    }

    public final boolean l(int index, int[] elements) {
        if (index < 0 || index > this._size) {
            s0.d.c("");
        }
        if (elements.length == 0) {
            return false;
        }
        n(this._size + elements.length);
        int[] iArr = this.content;
        int i15 = this._size;
        if (index != i15) {
            pq.n.l(iArr, iArr, elements.length + index, index, i15);
        }
        pq.n.q(elements, iArr, index, 0, 0, 12, null);
        this._size += elements.length;
        return true;
    }

    public final void m() {
        this._size = 0;
    }

    public final void n(int capacity) {
        int[] iArr = this.content;
        if (iArr.length < capacity) {
            this.content = Arrays.copyOf(iArr, Math.max(capacity, (iArr.length * 3) / 2));
        }
    }

    public final boolean o(int element) {
        int iF = f(element);
        if (iF < 0) {
            return false;
        }
        p(iF);
        return true;
    }

    public final int p(int index) {
        if (index < 0 || index >= this._size) {
            s0.d.c("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i15 = iArr[index];
        int i16 = this._size;
        if (index != i16 - 1) {
            pq.n.l(iArr, iArr, index, index + 1, i16);
        }
        this._size--;
        return i15;
    }

    public final void q(int start, int end) {
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
                int[] iArr = this.content;
                pq.n.l(iArr, iArr, start, end, i16);
            }
            this._size -= end - start;
        }
    }

    public final int r(int index, int element) {
        if (index < 0 || index >= this._size) {
            s0.d.c("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i15 = iArr[index];
        iArr[index] = element;
        return i15;
    }

    public final void s() {
        int i15 = this._size;
        if (i15 == 0) {
            return;
        }
        pq.n.Q(this.content, 0, i15);
    }

    public /* synthetic */ i0(int i15, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 16 : i15);
    }
}
