package e74;

import g74.WKAuthData;
import g74.b;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Le74/a;", "Lg74/b;", "<init>", "()V", "Lg74/a;", "a", "()Lg74/a;", "data", "Loq/i0;", "b", "(Lg74/a;)V", "clear", "Lg74/a;", "wk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private WKAuthData data;

    @Override // g74.b
    public WKAuthData a() {
        WKAuthData wKAuthData = this.data;
        if (wKAuthData != null) {
            return wKAuthData;
        }
        throw new IllegalStateException("WKAuthData must be initialized first (use InitWKAuthUC)");
    }

    @Override // g74.b
    public void b(WKAuthData data) {
        this.data = data;
    }

    @Override // g74.b
    public void clear() {
        this.data = null;
    }
}
