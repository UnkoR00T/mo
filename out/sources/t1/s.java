package t1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\u0003R$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0006\"\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lt1/s;", "", "<init>", "()V", "Lt1/q;", "c", "()Lt1/q;", "Loq/i0;", "f", "b", "a", "Lt1/q;", "d", "(Lt1/q;)V", "toolbarHandlerNode", "Lt1/r;", "Lt1/r;", "getToolbarHandlerState$foundation", "()Lt1/r;", "e", "(Lt1/r;)V", "toolbarHandlerState", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private q toolbarHandlerNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private r toolbarHandlerState = r.Uninitialized;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final q getToolbarHandlerNode() {
        return this.toolbarHandlerNode;
    }

    public abstract void b();

    public final q c() {
        if (!(this.toolbarHandlerState != r.Uninitialized)) {
            c1.e.c("ToolbarRequester is not initialized.");
        }
        return this.toolbarHandlerNode;
    }

    public final void d(q qVar) {
        this.toolbarHandlerNode = qVar;
    }

    public final void e(r rVar) {
        this.toolbarHandlerState = rVar;
    }

    public abstract void f();
}
