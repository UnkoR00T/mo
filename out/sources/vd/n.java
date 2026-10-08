package vd;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n<T> implements Comparable<n<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v.a f206182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f206183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f206184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f206185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f206186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p.a f206187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f206188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private o f206189h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f206190j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f206191k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f206192l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f206193m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f206194n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private r f206195p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private vd.b.a f206196q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f206197r;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f206198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f206199b;

        a(String str, long j15) {
            this.f206198a = str;
            this.f206199b = j15;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.f206182a.a(this.f206198a, this.f206199b);
            n.this.f206182a.b(n.this.toString());
        }
    }

    interface b {
        void a(n<?> nVar, p<?> pVar);

        void b(n<?> nVar);
    }

    public enum c {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public n(int i15, String str, p.a aVar) {
        this.f206182a = v.a.f206226c ? new v.a() : null;
        this.f206186e = new Object();
        this.f206190j = true;
        this.f206191k = false;
        this.f206192l = false;
        this.f206193m = false;
        this.f206194n = false;
        this.f206196q = null;
        this.f206183b = i15;
        this.f206184c = str;
        this.f206187f = aVar;
        X(new e());
        this.f206185d = o(str);
    }

    private byte[] n(Map<String, String> map, String str) {
        StringBuilder sb5 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
                sb5.append(URLEncoder.encode(entry.getKey(), str));
                sb5.append('=');
                sb5.append(URLEncoder.encode(entry.getValue(), str));
                sb5.append('&');
            }
            return sb5.toString().getBytes(str);
        } catch (UnsupportedEncodingException e15) {
            throw new RuntimeException("Encoding not supported: " + str, e15);
        }
    }

    private static int o(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    @Deprecated
    protected Map<String, String> A() {
        return x();
    }

    @Deprecated
    protected String B() {
        return y();
    }

    public c D() {
        return c.NORMAL;
    }

    public r F() {
        return this.f206195p;
    }

    public final int G() {
        return F().c();
    }

    public int H() {
        return this.f206185d;
    }

    public String I() {
        return this.f206184c;
    }

    public boolean J() {
        boolean z15;
        synchronized (this.f206186e) {
            z15 = this.f206192l;
        }
        return z15;
    }

    public boolean K() {
        boolean z15;
        synchronized (this.f206186e) {
            z15 = this.f206191k;
        }
        return z15;
    }

    public void N() {
        synchronized (this.f206186e) {
            this.f206192l = true;
        }
    }

    void O() {
        b bVar;
        synchronized (this.f206186e) {
            bVar = this.f206197r;
        }
        if (bVar != null) {
            bVar.b(this);
        }
    }

    void P(p<?> pVar) {
        b bVar;
        synchronized (this.f206186e) {
            bVar = this.f206197r;
        }
        if (bVar != null) {
            bVar.a(this, pVar);
        }
    }

    protected u Q(u uVar) {
        return uVar;
    }

    protected abstract p<T> R(k kVar);

    void S(int i15) {
        o oVar = this.f206189h;
        if (oVar != null) {
            oVar.e(this, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n<?> T(vd.b.a aVar) {
        this.f206196q = aVar;
        return this;
    }

    void U(b bVar) {
        synchronized (this.f206186e) {
            this.f206197r = bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n<?> W(o oVar) {
        this.f206189h = oVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n<?> X(r rVar) {
        this.f206195p = rVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n<?> Y(int i15) {
        this.f206188g = Integer.valueOf(i15);
        return this;
    }

    public final boolean a0() {
        return this.f206190j;
    }

    public final boolean c0() {
        return this.f206194n;
    }

    public final boolean d0() {
        return this.f206193m;
    }

    public void e(String str) {
        if (v.a.f206226c) {
            this.f206182a.a(str, Thread.currentThread().getId());
        }
    }

    public void g() {
        synchronized (this.f206186e) {
            this.f206191k = true;
            this.f206187f = null;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(n<T> nVar) {
        c cVarD = D();
        c cVarD2 = nVar.D();
        return cVarD == cVarD2 ? this.f206188g.intValue() - nVar.f206188g.intValue() : cVarD2.ordinal() - cVarD.ordinal();
    }

    public void k(u uVar) {
        p.a aVar;
        synchronized (this.f206186e) {
            aVar = this.f206187f;
        }
        if (aVar != null) {
            aVar.a(uVar);
        }
    }

    protected abstract void l(T t15);

    void p(String str) {
        o oVar = this.f206189h;
        if (oVar != null) {
            oVar.c(this);
        }
        if (v.a.f206226c) {
            long id5 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new a(str, id5));
            } else {
                this.f206182a.a(str, id5);
                this.f206182a.b(toString());
            }
        }
    }

    public byte[] q() {
        Map<String, String> mapX = x();
        if (mapX == null || mapX.size() <= 0) {
            return null;
        }
        return n(mapX, y());
    }

    public String r() {
        return "application/x-www-form-urlencoded; charset=" + y();
    }

    public vd.b.a s() {
        return this.f206196q;
    }

    public String t() {
        String strI = I();
        int iW = w();
        if (iW == 0 || iW == -1) {
            return strI;
        }
        return Integer.toString(iW) + '-' + strI;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(H());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(K() ? "[X] " : "[ ] ");
        sb5.append(I());
        sb5.append(" ");
        sb5.append(str);
        sb5.append(" ");
        sb5.append(D());
        sb5.append(" ");
        sb5.append(this.f206188g);
        return sb5.toString();
    }

    public Map<String, String> v() {
        return Collections.EMPTY_MAP;
    }

    public int w() {
        return this.f206183b;
    }

    protected Map<String, String> x() {
        return null;
    }

    protected String y() {
        return "UTF-8";
    }

    @Deprecated
    public byte[] z() {
        Map<String, String> mapA = A();
        if (mapA == null || mapA.size() <= 0) {
            return null;
        }
        return n(mapA, B());
    }
}
