package p2;

import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lp2/b;", "", "<init>", "()V", "", "index", "", "a", "(I)Z", "value", "Loq/i0;", "d", "(IZ)V", "c", "(I)I", "", "toString", "()Ljava/lang/String;", "", "J", "first", "b", "second", "", "[J", "others", "()I", "size", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long first;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long second;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long[] others = n.f151716a;

    public final boolean a(int index) {
        int i15;
        if (index < 64) {
            return ((1 << index) & this.first) != 0;
        }
        if (index < 128) {
            return ((1 << (index - 64)) & this.second) != 0;
        }
        long[] jArr = this.others;
        int length = jArr.length;
        if (length != 0 && (i15 = (index / 64) - 2) < length) {
            return ((1 << (index % 64)) & jArr[i15]) != 0;
        }
        return false;
    }

    public final int b() {
        return (this.others.length + 2) * 64;
    }

    public final int c(int index) {
        int iNumberOfTrailingZeros;
        if (index < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros(((~this.first) >>> index) << index)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (index < 128) {
            int i15 = index - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(((~this.second) >>> i15) << i15);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(index, 128);
        int i16 = (iMax / 64) - 2;
        long[] jArr = this.others;
        int length = jArr.length;
        for (int i17 = i16; i17 < length; i17++) {
            long j15 = ~jArr[i17];
            if (i17 == i16) {
                int i18 = iMax % 64;
                j15 = (j15 >>> i18) << i18;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(j15);
            if (iNumberOfTrailingZeros3 < 64) {
                return (i17 * 64) + 128 + iNumberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final void d(int index, boolean value) {
        if (index < 64) {
            this.first = ((value ? 1L : 0L) << index) | ((~(1 << index)) & this.first);
            return;
        }
        if (index < 128) {
            this.second = ((value ? 1L : 0L) << index) | ((~(1 << (index - 64))) & this.second);
            return;
        }
        int i15 = index / 64;
        int i16 = i15 - 2;
        int i17 = index % 64;
        long j15 = 1 << i17;
        long[] jArrCopyOf = this.others;
        if (i16 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15 - 1);
            this.others = jArrCopyOf;
        }
        jArrCopyOf[i16] = ((value ? 1L : 0L) << i17) | ((~j15) & jArrCopyOf[i16]);
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("BitVector [");
        int iB = b();
        boolean z15 = true;
        for (int i15 = 0; i15 < iB; i15++) {
            if (a(i15)) {
                if (!z15) {
                    sb5.append(", ");
                }
                sb5.append(i15);
                z15 = false;
            }
        }
        sb5.append(']');
        return sb5.toString();
    }
}
