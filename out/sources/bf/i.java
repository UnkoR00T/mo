package bf;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lf.a f19105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lf.a f19106c;

    i(Context context, lf.a aVar, lf.a aVar2) {
        this.f19104a = context;
        this.f19105b = aVar;
        this.f19106c = aVar2;
    }

    h a(String str) {
        return h.a(this.f19104a, this.f19105b, this.f19106c, str);
    }
}
