package c3;

import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, d2 = {"Lc3/p;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "array", "<init>", "([J)V", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "id", "Loq/i0;", "a", "(J)V", "b", "()[J", "Lr0/l0;", "Lr0/l0;", "list", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r0.l0 list;

    public p(long[] jArr) {
        r0.l0 l0Var;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            l0Var = new r0.l0(jArrCopyOf.length);
            l0Var.e(l0Var._size, jArrCopyOf);
        } else {
            l0Var = new r0.l0(0, 1, null);
        }
        this.list = l0Var;
    }

    public final void a(long id5) {
        this.list.d(id5);
    }

    public final long[] b() {
        r0.l0 l0Var = this.list;
        int i15 = l0Var._size;
        if (i15 == 0) {
            return null;
        }
        long[] jArr = new long[i15];
        long[] jArr2 = l0Var.content;
        for (int i16 = 0; i16 < i15; i16++) {
            jArr[i16] = jArr2[i16];
        }
        return jArr;
    }
}
