package ge;

import com.bumptech.glide.load.data.j;
import fe.h;
import fe.n;
import fe.o;
import fe.p;
import fe.s;
import java.io.InputStream;
import zd.g;

/* JADX INFO: loaded from: classes3.dex */
public class a implements o<h, InputStream> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g<Integer> f72000b = g.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n<h, h> f72001a;

    /* JADX INFO: renamed from: ge.a$a, reason: collision with other inner class name */
    public static class C1652a implements p<h, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n<h, h> f72002a = new n<>(500);

        @Override // fe.p
        public o<h, InputStream> d(s sVar) {
            return new a(this.f72002a);
        }
    }

    public a(n<h, h> nVar) {
        this.f72001a = nVar;
    }

    @Override // fe.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> a(h hVar, int i15, int i16, zd.h hVar2) {
        n<h, h> nVar = this.f72001a;
        if (nVar != null) {
            h hVarA = nVar.a(hVar, 0, 0);
            if (hVarA == null) {
                this.f72001a.b(hVar, 0, 0, hVar);
            } else {
                hVar = hVarA;
            }
        }
        return new o.a<>(hVar, new j(hVar, ((Integer) hVar2.c(f72000b)).intValue()));
    }

    @Override // fe.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(h hVar) {
        return true;
    }
}
