package c3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u00020\u0000*\u00060\u0002j\u0002`\u00032\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\f\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u000b\u001a\u00020\u00002\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0000¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u000e\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u000b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00060\u0006j\u0002`\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011*\n\u0010\u0012\"\u00020\u00062\u00020\u0006*\n\u0010\u0013\"\u00020\u00022\u00020\u0002¨\u0006\u0014"}, d2 = {"", "capacity", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "b", "(I)[J", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "id", "a", "([JJ)I", "index", "d", "([JIJ)[J", "e", "([JI)[J", "c", "(I)J", "SnapshotId", "SnapshotIdArray", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {
    public static final int a(long[] jArr, long j15) {
        int length = jArr.length - 1;
        int i15 = 0;
        while (i15 <= length) {
            int i16 = (i15 + length) >>> 1;
            long j16 = jArr[i16];
            if (j15 > j16) {
                i15 = i16 + 1;
            } else {
                if (j15 >= j16) {
                    return i16;
                }
                length = i16 - 1;
            }
        }
        return -(i15 + 1);
    }

    public static final long[] b(int i15) {
        return new long[i15];
    }

    public static final long c(int i15) {
        return i15;
    }

    public static final long[] d(long[] jArr, int i15, long j15) {
        int length = jArr.length;
        long[] jArr2 = new long[length + 1];
        pq.n.m(jArr, jArr2, 0, 0, i15);
        pq.n.m(jArr, jArr2, i15 + 1, i15, length);
        jArr2[i15] = j15;
        return jArr2;
    }

    public static final long[] e(long[] jArr, int i15) {
        int length = jArr.length;
        int i16 = length - 1;
        if (i16 == 0) {
            return null;
        }
        long[] jArr2 = new long[i16];
        if (i15 > 0) {
            pq.n.m(jArr, jArr2, 0, 0, i15);
        }
        if (i15 < i16) {
            pq.n.m(jArr, jArr2, i15, i15 + 1, length);
        }
        return jArr2;
    }
}
