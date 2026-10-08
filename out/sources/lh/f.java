package lh;

import android.content.Context;
import android.os.RemoteException;
import io.sentry.android.core.c2;
import mh.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f118209a = "f";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f118210b = 0;

    public static void a(Context context, String str) {
        try {
            s0.b(new r(context, str));
        } catch (RemoteException e15) {
            c2.f(f118209a, "Failed to add internal usage attribution id.", e15);
        }
    }
}
