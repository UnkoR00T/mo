package ig;

import android.app.Activity;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f92194a;

    public g(Activity activity) {
        jg.s.m(activity, "Activity must not be null");
        this.f92194a = activity;
    }

    public final boolean a() {
        return this.f92194a instanceof androidx.fragment.app.p;
    }

    public final boolean b() {
        return this.f92194a instanceof Activity;
    }

    public final Activity c() {
        return (Activity) this.f92194a;
    }

    public final androidx.fragment.app.p d() {
        return (androidx.fragment.app.p) this.f92194a;
    }
}
