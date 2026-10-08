package wd;

import java.io.UnsupportedEncodingException;
import vd.p;
import vd.v;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k<T> extends vd.n<T> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f212216w = String.format("application/json; charset=%s", "utf-8");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object f212217s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private p.b<T> f212218t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f212219v;

    public k(int i15, String str, String str2, p.b<T> bVar, p.a aVar) {
        super(i15, str, aVar);
        this.f212217s = new Object();
        this.f212218t = bVar;
        this.f212219v = str2;
    }

    @Override // vd.n
    public void g() {
        super.g();
        synchronized (this.f212217s) {
            this.f212218t = null;
        }
    }

    @Override // vd.n
    protected void l(T t15) {
        p.b<T> bVar;
        synchronized (this.f212217s) {
            bVar = this.f212218t;
        }
        if (bVar != null) {
            bVar.a(t15);
        }
    }

    @Override // vd.n
    public byte[] q() {
        try {
            String str = this.f212219v;
            if (str == null) {
                return null;
            }
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            v.f("Unsupported Encoding while trying to get the bytes of %s using %s", this.f212219v, "utf-8");
            return null;
        }
    }

    @Override // vd.n
    public String r() {
        return f212216w;
    }

    @Override // vd.n
    @Deprecated
    public byte[] z() {
        return q();
    }
}
