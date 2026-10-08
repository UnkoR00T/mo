package c3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0016\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR0\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f0\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lc3/n0;", "", "T", "<init>", "()V", "value", "", "hash", "b", "(Ljava/lang/Object;I)I", "midIndex", "valueHash", "c", "(ILjava/lang/Object;I)I", "", "a", "(Ljava/lang/Object;)Z", "I", "e", "()I", "g", "(I)V", "size", "", "[I", "d", "()[I", "setHashes$runtime", "([I)V", "hashes", "", "Ly2/d0;", "[Ly2/d0;", "f", "()[Ly2/d0;", "setValues$runtime", "([Ly2/d0;)V", "values", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int[] hashes = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private y2.d0<T>[] values = new y2.d0[16];

    private final int b(T value, int hash) {
        int i15 = this.size - 1;
        int i16 = 0;
        while (i16 <= i15) {
            int i17 = (i16 + i15) >>> 1;
            int i18 = this.hashes[i17];
            if (i18 < hash) {
                i16 = i17 + 1;
            } else {
                if (i18 <= hash) {
                    y2.d0<T> d0Var = this.values[i17];
                    return value == (d0Var != null ? d0Var.get() : null) ? i17 : c(i17, value, hash);
                }
                i15 = i17 - 1;
            }
        }
        return -(i16 + 1);
    }

    private final int c(int midIndex, T value, int valueHash) {
        int i15 = midIndex - 1;
        while (true) {
            if (-1 >= i15 || this.hashes[i15] != valueHash) {
                break;
            }
            y2.d0<T> d0Var = this.values[i15];
            if ((d0Var != null ? d0Var.get() : null) == value) {
                return i15;
            }
            i15--;
        }
        int i16 = midIndex + 1;
        int i17 = this.size;
        while (i16 < i17) {
            if (this.hashes[i16] != valueHash) {
                return -(i16 + 1);
            }
            y2.d0<T> d0Var2 = this.values[i16];
            if ((d0Var2 != null ? d0Var2.get() : null) == value) {
                return i16;
            }
            i16++;
        }
        i16 = this.size;
        return -(i16 + 1);
    }

    public final boolean a(T value) {
        int iB;
        int i15 = this.size;
        int iA = y2.x.a(value);
        if (i15 > 0) {
            iB = b(value, iA);
            if (iB >= 0) {
                return false;
            }
        } else {
            iB = -1;
        }
        int i16 = -(iB + 1);
        y2.d0<T>[] d0VarArr = this.values;
        int length = d0VarArr.length;
        if (i15 == length) {
            int i17 = length * 2;
            y2.d0<T>[] d0VarArr2 = new y2.d0[i17];
            int[] iArr = new int[i17];
            int i18 = i16 + 1;
            System.arraycopy(d0VarArr, i16, d0VarArr2, i18, i15 - i16);
            System.arraycopy(this.values, 0, d0VarArr2, 0, i16);
            pq.n.l(this.hashes, iArr, i18, i16, i15);
            pq.n.q(this.hashes, iArr, 0, 0, i16, 6, null);
            this.values = d0VarArr2;
            this.hashes = iArr;
        } else {
            int i19 = i16 + 1;
            System.arraycopy(d0VarArr, i16, d0VarArr, i19, i15 - i16);
            int[] iArr2 = this.hashes;
            pq.n.l(iArr2, iArr2, i19, i16, i15);
        }
        this.values[i16] = new y2.d0<>(value);
        this.hashes[i16] = iA;
        this.size++;
        return true;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final y2.d0<T>[] f() {
        return this.values;
    }

    public final void g(int i15) {
        this.size = i15;
    }
}
