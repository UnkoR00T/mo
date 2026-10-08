package c3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\b\u0000\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010 \u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c¨\u0006!"}, d2 = {"Lc3/p0;", "T", "Lc3/w0;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Lt2/e;", "list", "<init>", "(JLt2/e;)V", "value", "Loq/i0;", "c", "(Lc3/w0;)V", "d", "()Lc3/w0;", "e", "(J)Lc3/w0;", "Lt2/e;", "j", "()Lt2/e;", "m", "(Lt2/e;)V", "", "I", "k", "()I", "n", "(I)V", "modification", "l", "o", "structuralChange", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p0<T> extends w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private t2.e<? extends T> list;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int modification;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int structuralChange;

    public p0(long j15, t2.e<? extends T> eVar) {
        super(j15);
        this.list = eVar;
    }

    @Override // c3.w0
    public void c(w0 value) {
        synchronized (g0.f22814a) {
            this.list = ((p0) value).list;
            this.modification = ((p0) value).modification;
            this.structuralChange = ((p0) value).structuralChange;
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    @Override // c3.w0
    public w0 d() {
        return e(w.K().getSnapshotId());
    }

    @Override // c3.w0
    public w0 e(long snapshotId) {
        return new p0(snapshotId, this.list);
    }

    public final t2.e<T> j() {
        return this.list;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getModification() {
        return this.modification;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getStructuralChange() {
        return this.structuralChange;
    }

    public final void m(t2.e<? extends T> eVar) {
        this.list = eVar;
    }

    public final void n(int i15) {
        this.modification = i15;
    }

    public final void o(int i15) {
        this.structuralChange = i15;
    }
}
