package g4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0003R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lg4/m1;", "Lf3/m$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "Loq/i0;", "W2", "X2", "", "r", "Z", "n3", "()Z", "setAttachHasBeenRun", "(Z)V", "attachHasBeenRun", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m1 extends f3.m.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean attachHasBeenRun;

    public m1() {
        c3(0);
    }

    @Override // f3.m.c
    public void W2() {
        this.attachHasBeenRun = true;
    }

    @Override // f3.m.c
    public void X2() {
        this.attachHasBeenRun = false;
    }

    /* JADX INFO: renamed from: n3, reason: from getter */
    public final boolean getAttachHasBeenRun() {
        return this.attachHasBeenRun;
    }

    public String toString() {
        return "<tail>";
    }
}
