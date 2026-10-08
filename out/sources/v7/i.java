package v7;

import android.os.Bundle;
import w7.o0;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f204225b = o0.u0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204226a;

    public i(String str) {
        this.f204226a = str;
    }

    public static i a(Bundle bundle) {
        return new i((String) p.q(bundle.getString(f204225b)));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f204225b, this.f204226a);
        return bundle;
    }
}
