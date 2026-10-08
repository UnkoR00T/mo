package ge;

import android.content.Context;
import android.net.Uri;
import fe.o;
import fe.p;
import fe.s;
import java.io.InputStream;
import zd.h;

/* JADX INFO: loaded from: classes3.dex */
public class b implements o<Uri, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f72003a;

    public static class a implements p<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f72004a;

        public a(Context context) {
            this.f72004a = context;
        }

        @Override // fe.p
        public o<Uri, InputStream> d(s sVar) {
            return new b(this.f72004a);
        }
    }

    public b(Context context) {
        this.f72003a = context.getApplicationContext();
    }

    @Override // fe.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> a(Uri uri, int i15, int i16, h hVar) {
        if (ae.b.e(i15, i16)) {
            return new o.a<>(new ue.d(uri), ae.c.f(this.f72003a, uri));
        }
        return null;
    }

    @Override // fe.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return ae.b.b(uri);
    }
}
