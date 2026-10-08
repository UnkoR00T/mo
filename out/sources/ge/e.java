package ge;

import fe.h;
import fe.o;
import fe.p;
import fe.s;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
public class e implements o<URL, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o<h, InputStream> f72024a;

    public static class a implements p<URL, InputStream> {
        @Override // fe.p
        public o<URL, InputStream> d(s sVar) {
            return new e(sVar.d(h.class, InputStream.class));
        }
    }

    public e(o<h, InputStream> oVar) {
        this.f72024a = oVar;
    }

    @Override // fe.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> a(URL url, int i15, int i16, zd.h hVar) {
        return this.f72024a.a(new h(url), i15, i16, hVar);
    }

    @Override // fe.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(URL url) {
        return true;
    }
}
