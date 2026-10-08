package c3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u001f\u0010\u0016\u001a\u00060\u0013j\u0002`\u00142\f\b\u0002\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\n\u001a\u00020\u00042\n\u0010\u0018\u001a\u00060\u0013j\u0002`\u0014¢\u0006\u0004\b\n\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\bR$\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010R\u001a\u0010!\u001a\u00060\u001ej\u0002`\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0016\u0010\u0005\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001b¨\u0006&"}, d2 = {"Lc3/o;", "", "<init>", "()V", "", "index", "Loq/i0;", "h", "(I)V", "g", "a", "b", "i", "(II)V", "atLeast", "c", "()I", "handle", "d", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "default", "e", "(J)J", "value", "(J)I", "f", "I", "getSize", "size", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "[J", "values", "", "[I", "handles", "firstFreeHandle", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long[] values = r.b(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int[] index = new int[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int[] handles;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int firstFreeHandle;

    public o() {
        int[] iArr = new int[16];
        int i15 = 0;
        while (i15 < 16) {
            int i16 = i15 + 1;
            iArr[i15] = i16;
            i15 = i16;
        }
        this.handles = iArr;
    }

    private final int b() {
        int length = this.handles.length;
        if (this.firstFreeHandle >= length) {
            int i15 = length * 2;
            int[] iArr = new int[i15];
            int i16 = 0;
            while (i16 < i15) {
                int i17 = i16 + 1;
                iArr[i16] = i17;
                i16 = i17;
            }
            pq.n.q(this.handles, iArr, 0, 0, 0, 14, null);
            this.handles = iArr;
        }
        int i18 = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[i18];
        return i18;
    }

    private final void c(int atLeast) {
        int length = this.values.length;
        if (atLeast <= length) {
            return;
        }
        int i15 = length * 2;
        long[] jArrB = r.b(i15);
        int[] iArr = new int[i15];
        pq.n.r(this.values, jArrB, 0, 0, 0, 12, null);
        pq.n.q(this.index, iArr, 0, 0, 0, 14, null);
        this.values = jArrB;
        this.index = iArr;
    }

    private final void d(int handle) {
        this.handles[handle] = this.firstFreeHandle;
        this.firstFreeHandle = handle;
    }

    private final void g(int index) {
        long[] jArr = this.values;
        int i15 = this.size >> 1;
        while (index < i15) {
            int i16 = (index + 1) << 1;
            int i17 = i16 - 1;
            if (i16 >= this.size || fr.t.e(jArr[i16], jArr[i17]) >= 0) {
                if (fr.t.e(jArr[i17], jArr[index]) >= 0) {
                    return;
                }
                i(i17, index);
                index = i17;
            } else {
                if (fr.t.e(jArr[i16], jArr[index]) >= 0) {
                    return;
                }
                i(i16, index);
                index = i16;
            }
        }
    }

    private final void h(int index) {
        long[] jArr = this.values;
        long j15 = jArr[index];
        while (index > 0) {
            int i15 = ((index + 1) >> 1) - 1;
            if (fr.t.e(jArr[i15], j15) <= 0) {
                return;
            }
            i(i15, index);
            index = i15;
        }
    }

    private final void i(int a15, int b15) {
        long[] jArr = this.values;
        int[] iArr = this.index;
        int[] iArr2 = this.handles;
        long j15 = jArr[a15];
        jArr[a15] = jArr[b15];
        jArr[b15] = j15;
        int i15 = iArr[a15];
        int i16 = iArr[b15];
        iArr[a15] = i16;
        iArr[b15] = i15;
        iArr2[i16] = a15;
        iArr2[i15] = b15;
    }

    public final int a(long value) {
        c(this.size + 1);
        int i15 = this.size;
        this.size = i15 + 1;
        int iB = b();
        this.values[i15] = value;
        this.index[i15] = iB;
        this.handles[iB] = i15;
        h(i15);
        return iB;
    }

    public final long e(long j15) {
        return this.size > 0 ? this.values[0] : j15;
    }

    public final void f(int handle) {
        int i15 = this.handles[handle];
        i(i15, this.size - 1);
        this.size--;
        h(i15);
        g(i15);
        d(handle);
    }
}
