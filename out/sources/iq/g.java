package iq;

import androidx.p016lifecycle.i0;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CreationExtras f96176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i0 f96177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f96178c;

    public g(CreationExtras creationExtras) {
        this.f96178c = creationExtras != null;
        this.f96176a = creationExtras;
    }

    public void a() {
        this.f96176a = null;
    }

    public boolean b() {
        return this.f96177b == null && this.f96176a == null;
    }

    public void c(CreationExtras creationExtras) {
        lq.d.c(this.f96178c, "setExtras should only be called for an Activity that extends ComponentActivity", new Object[0]);
        if (this.f96177b != null) {
            return;
        }
        this.f96176a = creationExtras;
    }
}
