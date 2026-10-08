package mz;

import android.os.Bundle;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lmz/p;", "Lmz/d;", "<init>", "()V", "", "a", "()Ljava/lang/String;", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "intent_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements d {
    @Override // kx.g
    public String a() {
        return "android.settings.BIOMETRIC_ENROLL";
    }

    @Override // mz.d
    public Bundle getExtras() {
        return e6.c.a(oq.y.a("android.provider.extra.BIOMETRIC_AUTHENTICATORS_ALLOWED", 15));
    }
}
