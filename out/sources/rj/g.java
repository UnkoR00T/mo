package rj;

import android.content.Context;
import sj.c0;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static d f174579a;

    static synchronized d a(Context context) {
        try {
            if (f174579a == null) {
                f fVar = new f(null);
                fVar.b(new l(c0.a(context)));
                f174579a = fVar.a();
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return f174579a;
    }
}
