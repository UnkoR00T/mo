package v7;

import android.os.Bundle;
import w7.o0;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f204215c = o0.u0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f204216d = o0.u0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f204218b;

    public f(String str, int i15) {
        this.f204217a = str;
        this.f204218b = i15;
    }

    public static f a(Bundle bundle) {
        return new f((String) p.q(bundle.getString(f204215c)), bundle.getInt(f204216d));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f204215c, this.f204217a);
        bundle.putInt(f204216d, this.f204218b);
        return bundle;
    }
}
