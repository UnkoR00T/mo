package xz3;

import p071kotlin.Metadata;
import vz3.AutoCertificateRenewalData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u0003R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lxz3/a;", "Lb04/a;", "<init>", "()V", "Lvz3/a;", "w", "()Lvz3/a;", "data", "Loq/i0;", "e0", "(Lvz3/a;)V", "v", "clear", "a", "Lvz3/a;", "autoRenewalData", "authentication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements b04.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private AutoCertificateRenewalData autoRenewalData;

    @Override // wy.c
    public void clear() {
        v();
    }

    @Override // b04.a
    public void e0(AutoCertificateRenewalData data) {
        this.autoRenewalData = data;
    }

    @Override // b04.a
    public void v() {
        this.autoRenewalData = null;
    }

    @Override // b04.a
    /* JADX INFO: renamed from: w, reason: from getter */
    public AutoCertificateRenewalData getAutoRenewalData() {
        return this.autoRenewalData;
    }
}
