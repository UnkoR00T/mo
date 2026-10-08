package fe;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class h implements zd.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f61647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final URL f61648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f61649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f61650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private URL f61651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile byte[] f61652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f61653h;

    public h(URL url) {
        this(url, i.f61655b);
    }

    private byte[] d() {
        if (this.f61652g == null) {
            this.f61652g = c().getBytes(zd.f.f234355a);
        }
        return this.f61652g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f61650e)) {
            String string = this.f61649d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) ve.k.d(this.f61648c)).toString();
            }
            this.f61650e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f61650e;
    }

    private URL g() {
        if (this.f61651f == null) {
            this.f61651f = new URL(f());
        }
        return this.f61651f;
    }

    @Override // zd.f
    public void b(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f61649d;
        return str != null ? str : ((URL) ve.k.d(this.f61648c)).toString();
    }

    public Map<String, String> e() {
        return this.f61647b.a();
    }

    @Override // zd.f
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (c().equals(hVar.c()) && this.f61647b.equals(hVar.f61647b)) {
                return true;
            }
        }
        return false;
    }

    public URL h() {
        return g();
    }

    @Override // zd.f
    public int hashCode() {
        if (this.f61653h == 0) {
            int iHashCode = c().hashCode();
            this.f61653h = iHashCode;
            this.f61653h = (iHashCode * 31) + this.f61647b.hashCode();
        }
        return this.f61653h;
    }

    public String toString() {
        return c();
    }

    public h(String str) {
        this(str, i.f61655b);
    }

    public h(URL url, i iVar) {
        this.f61648c = (URL) ve.k.d(url);
        this.f61649d = null;
        this.f61647b = (i) ve.k.d(iVar);
    }

    public h(String str, i iVar) {
        this.f61648c = null;
        this.f61649d = ve.k.b(str);
        this.f61647b = (i) ve.k.d(iVar);
    }
}
