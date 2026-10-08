package qg;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f166356b = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f166357a = null;

    public static c a(Context context) {
        return f166356b.b(context);
    }

    public final synchronized c b(Context context) {
        try {
            if (this.f166357a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f166357a = new c(context);
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return this.f166357a;
    }
}
