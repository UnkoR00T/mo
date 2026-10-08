package v7;

import android.os.Bundle;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f204219d = o0.u0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f204220e = o0.u0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f204221f = o0.u0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f204223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f204224c;

    public h(int i15, int i16, int i17) {
        this.f204222a = i15;
        this.f204223b = i16;
        this.f204224c = i17;
    }

    public static h a(Bundle bundle) {
        return new h(bundle.getInt(f204219d), bundle.getInt(f204220e), bundle.getInt(f204221f));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f204219d, this.f204222a);
        bundle.putInt(f204220e, this.f204223b);
        bundle.putInt(f204221f, this.f204224c);
        return bundle;
    }
}
