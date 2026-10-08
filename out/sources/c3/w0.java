package c3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H&¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0006R$\u0010\u0019\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000b¨\u0006\u001a"}, d2 = {"Lc3/w0;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "<init>", "(J)V", "()V", "value", "Loq/i0;", "c", "(Lc3/w0;)V", "d", "()Lc3/w0;", "e", "(J)Lc3/w0;", "a", "J", "g", "()J", "i", "b", "Lc3/w0;", "f", "h", "next", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long snapshotId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private w0 next;

    public w0(long j15) {
        this.snapshotId = j15;
    }

    public abstract void c(w0 value);

    public abstract w0 d();

    public w0 e(long snapshotId) {
        w0 w0VarD = d();
        w0VarD.snapshotId = snapshotId;
        return w0VarD;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final w0 getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getSnapshotId() {
        return this.snapshotId;
    }

    public final void h(w0 w0Var) {
        this.next = w0Var;
    }

    public final void i(long j15) {
        this.snapshotId = j15;
    }

    public w0() {
        this(w.K().getSnapshotId());
    }
}
