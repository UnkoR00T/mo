package y7;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f224886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<x> f224887b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f224888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f224889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f224890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f f224891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f224892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f f224893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private f f224894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private f f224895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f f224896k;

    public static final class a implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f224897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f.a f224898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private x f224899c;

        public a(Context context) {
            this(context, new l.b());
        }

        @Override // y7.f.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k a() {
            k kVar = new k(this.f224897a, this.f224898b.a());
            x xVar = this.f224899c;
            if (xVar != null) {
                kVar.m(xVar);
            }
            return kVar;
        }

        public a(Context context, f.a aVar) {
            this.f224897a = context.getApplicationContext();
            this.f224898b = (f.a) zj.p.q(aVar);
        }
    }

    public k(Context context, f fVar) {
        this.f224886a = context.getApplicationContext();
        this.f224888c = (f) zj.p.q(fVar);
    }

    private void q(f fVar) {
        for (int i15 = 0; i15 < this.f224887b.size(); i15++) {
            fVar.m(this.f224887b.get(i15));
        }
    }

    private f r() {
        if (this.f224890e == null) {
            y7.a aVar = new y7.a(this.f224886a);
            this.f224890e = aVar;
            q(aVar);
        }
        return this.f224890e;
    }

    private f s() {
        if (this.f224891f == null) {
            d dVar = new d(this.f224886a);
            this.f224891f = dVar;
            q(dVar);
        }
        return this.f224891f;
    }

    private f t() {
        if (this.f224894i == null) {
            e eVar = new e();
            this.f224894i = eVar;
            q(eVar);
        }
        return this.f224894i;
    }

    private f u() {
        if (this.f224889d == null) {
            o oVar = new o();
            this.f224889d = oVar;
            q(oVar);
        }
        return this.f224889d;
    }

    private f v() {
        if (this.f224895j == null) {
            v vVar = new v(this.f224886a);
            this.f224895j = vVar;
            q(vVar);
        }
        return this.f224895j;
    }

    private f w() {
        if (this.f224892g == null) {
            try {
                f fVar = (f) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f224892g = fVar;
                q(fVar);
            } catch (ClassNotFoundException unused) {
                w7.t.h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e15) {
                throw new RuntimeException("Error instantiating RTMP extension", e15);
            }
            if (this.f224892g == null) {
                this.f224892g = this.f224888c;
            }
        }
        return this.f224892g;
    }

    private f x() {
        if (this.f224893h == null) {
            y yVar = new y();
            this.f224893h = yVar;
            q(yVar);
        }
        return this.f224893h;
    }

    private void y(f fVar, x xVar) {
        if (fVar != null) {
            fVar.m(xVar);
        }
    }

    @Override // y7.f
    public Uri c() {
        f fVar = this.f224896k;
        if (fVar == null) {
            return null;
        }
        return fVar.c();
    }

    @Override // y7.f
    public void close() {
        f fVar = this.f224896k;
        if (fVar != null) {
            try {
                fVar.close();
            } finally {
                this.f224896k = null;
            }
        }
    }

    @Override // y7.f
    public Map<String, List<String>> f() {
        f fVar = this.f224896k;
        return fVar == null ? Collections.EMPTY_MAP : fVar.f();
    }

    @Override // y7.f
    public long i(j jVar) {
        zj.p.w(this.f224896k == null);
        String scheme = jVar.f224865a.getScheme();
        if (o0.B0(jVar.f224865a)) {
            String path = jVar.f224865a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f224896k = u();
            } else {
                this.f224896k = r();
            }
        } else if ("asset".equals(scheme)) {
            this.f224896k = r();
        } else if ("content".equals(scheme)) {
            this.f224896k = s();
        } else if ("rtmp".equals(scheme)) {
            this.f224896k = w();
        } else if ("udp".equals(scheme)) {
            this.f224896k = x();
        } else if ("data".equals(scheme)) {
            this.f224896k = t();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f224896k = v();
        } else {
            this.f224896k = this.f224888c;
        }
        return this.f224896k.i(jVar);
    }

    @Override // y7.f
    public void m(x xVar) {
        zj.p.q(xVar);
        this.f224888c.m(xVar);
        this.f224887b.add(xVar);
        y(this.f224889d, xVar);
        y(this.f224890e, xVar);
        y(this.f224891f, xVar);
        y(this.f224892g, xVar);
        y(this.f224893h, xVar);
        y(this.f224894i, xVar);
        y(this.f224895j, xVar);
    }

    @Override // t7.h
    public int read(byte[] bArr, int i15, int i16) {
        return ((f) zj.p.q(this.f224896k)).read(bArr, i15, i16);
    }
}
