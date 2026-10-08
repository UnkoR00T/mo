package ge;

import android.content.Context;
import android.net.Uri;
import fe.o;
import fe.p;
import fe.s;
import ie.d0;
import java.io.InputStream;
import zd.h;

/* JADX INFO: loaded from: classes3.dex */
public class c implements o<Uri, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f72005a;

    public static class a implements p<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f72006a;

        public a(Context context) {
            this.f72006a = context;
        }

        @Override // fe.p
        public o<Uri, InputStream> d(s sVar) {
            return new c(this.f72006a);
        }
    }

    public c(Context context) {
        this.f72005a = context.getApplicationContext();
    }

    private boolean e(h hVar) {
        Long l15 = (Long) hVar.c(d0.f91885d);
        return l15 != null && l15.longValue() == -1;
    }

    @Override // fe.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> a(Uri uri, int i15, int i16, h hVar) {
        if (ae.b.e(i15, i16) && e(hVar)) {
            return new o.a<>(new ue.d(uri), ae.c.g(this.f72005a, uri));
        }
        return null;
    }

    @Override // fe.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return ae.b.d(uri);
    }
}
