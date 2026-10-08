package p135y70;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Ly70/g4;", "", "<init>", "()V", "Ly70/f4;", "navigation", "Loq/i0;", "b", "(Ly70/f4;)V", "a", "()Ly70/f4;", "Ly70/f4;", "pending", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private f4 pending;

    public final f4 a() {
        f4 f4Var = this.pending;
        this.pending = null;
        return f4Var;
    }

    public final void b(f4 navigation) {
        this.pending = navigation;
    }
}
