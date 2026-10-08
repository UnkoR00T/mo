package y00;

import android.view.Window;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Ly00/b0;", "Ly00/a0;", "Liy/y;", "", "secureWindowEnabled", "<init>", "(Z)V", "LCON/p;", "activity", "Loq/i0;", "e", "(LCON/p;)V", "a", "()V", "c", "Z", "Landroid/view/Window;", "b", "Landroid/view/Window;", "window", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 implements a0, iy.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean secureWindowEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Window window;

    public b0(boolean z15) {
        this.secureWindowEnabled = z15;
    }

    @Override // iy.y
    public void a() {
        Window window = this.window;
        if (window != null) {
            window.addFlags(PKIFailureInfo.certRevoked);
        }
    }

    @Override // iy.y
    public void c() {
        Window window = this.window;
        if (window != null) {
            window.clearFlags(PKIFailureInfo.certRevoked);
        }
    }

    @Override // oz.c
    public void e(CON.p activity) {
        this.window = activity.getWindow();
        if (this.secureWindowEnabled) {
            a();
        } else {
            c();
        }
    }
}
