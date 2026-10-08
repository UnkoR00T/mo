package lh;

import android.content.Context;
import android.os.RemoteException;
import io.sentry.android.core.c2;
import mh.s0;
import mh.v0;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f118212a = "g";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f118213b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f118214c = a.LEGACY;

    public enum a {
        LEGACY,
        LATEST
    }

    private g() {
    }

    public static synchronized int a(Context context) {
        return b(context, null, null);
    }

    public static synchronized int b(Context context, a aVar, i iVar) {
        jg.s.m(context, "Context is null");
        "preferredRenderer: ".concat(String.valueOf(aVar));
        if (!f118213b) {
            try {
                v0 v0VarA = s0.a(context, aVar);
                try {
                    b.c(v0VarA.d());
                    nh.c.b(v0VarA.k());
                    int i15 = 1;
                    f118213b = true;
                    if (aVar != null) {
                        int iOrdinal = aVar.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                throw new RuntimeException(null, null);
                            }
                            i15 = 2;
                        }
                    } else {
                        i15 = 0;
                    }
                    try {
                        if (v0VarA.c() == 2) {
                            f118214c = a.LATEST;
                        }
                        v0VarA.p0(rg.d.o3(context), i15);
                    } catch (RemoteException e15) {
                        c2.f(f118212a, "Failed to retrieve renderer type or log initialization.", e15);
                    }
                    "loadedRenderer: ".concat(String.valueOf(f118214c));
                    if (iVar != null) {
                        iVar.a(f118214c);
                    }
                } catch (RemoteException e16) {
                    throw new nh.o(e16);
                }
            } catch (gg.f e17) {
                return e17.f72735a;
            }
        } else if (iVar != null) {
            iVar.a(f118214c);
        }
        return 0;
    }
}
