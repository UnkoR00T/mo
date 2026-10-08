package l3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Ll3/j0;", "Ll3/h0;", "Lf3/m$c;", "Ll3/d0;", "focusRequester", "<init>", "(Ll3/d0;)V", "Loq/i0;", "W2", "()V", "X2", "r", "Ll3/d0;", "n3", "()Ll3/d0;", "o3", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class j0 extends f3.m.c implements h0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private d0 focusRequester;

    public j0(d0 d0Var) {
        this.focusRequester = d0Var;
    }

    @Override // f3.m.c
    public void W2() {
        super.W2();
        this.focusRequester.d().d(this);
    }

    @Override // f3.m.c
    public void X2() {
        this.focusRequester.d().t(this);
        super.X2();
    }

    /* JADX INFO: renamed from: n3, reason: from getter */
    public final d0 getFocusRequester() {
        return this.focusRequester;
    }

    public final void o3(d0 d0Var) {
        this.focusRequester = d0Var;
    }
}
