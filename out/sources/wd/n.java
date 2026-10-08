package wd;

import android.content.Context;
import java.io.File;
import vd.o;

/* JADX INFO: loaded from: classes3.dex */
public class n {

    class a implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private File f212223a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f212224b;

        a(Context context) {
            this.f212224b = context;
        }

        @Override // wd.d.c
        public File get() {
            if (this.f212223a == null) {
                this.f212223a = new File(this.f212224b.getCacheDir(), "volley");
            }
            return this.f212223a;
        }
    }

    public static o a(Context context) {
        return c(context, null);
    }

    private static o b(Context context, vd.h hVar) {
        o oVar = new o(new d(new a(context.getApplicationContext())), hVar);
        oVar.g();
        return oVar;
    }

    public static o c(Context context, wd.a aVar) {
        return b(context, aVar == null ? new b(new h()) : new b(aVar));
    }
}
