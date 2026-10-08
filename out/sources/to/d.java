package to;

import android.graphics.Path;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import oo.t;
import oo.u;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements c, mo.a, mo.b {
    int A;
    int B;
    boolean G;
    int H;
    private final byte[] O;
    private final byte[] P;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f191199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f191200d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f191203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f191204h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    float f191211q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f191212r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    float f191213s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    float f191214t;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    float f191219z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f191197a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    qo.b f191198b = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    List<Number> f191201e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    List<Number> f191202f = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f191205j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    String f191206k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    String f191207l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    String f191208m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f191209n = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    String f191210p = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    List<Number> f191215v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    List<Number> f191216w = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    List<Number> f191217x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    List<Number> f191218y = new ArrayList();
    List<Number> C = new ArrayList();
    List<Number> D = new ArrayList();
    List<Number> E = new ArrayList();
    List<Number> F = new ArrayList();
    final List<byte[]> I = new ArrayList();
    final Map<String, byte[]> K = new LinkedHashMap();
    private final Map<String, t> L = new ConcurrentHashMap();

    d(byte[] bArr, byte[] bArr2) {
        this.O = bArr;
        this.P = bArr2;
    }

    public static d d(InputStream inputStream) {
        ro.a aVar = new ro.a(inputStream);
        return new f().e(aVar.a(), aVar.b());
    }

    public static d e(byte[] bArr) {
        ro.a aVar = new ro.a(bArr);
        return new f().e(aVar.a(), aVar.b());
    }

    public static d f(byte[] bArr, byte[] bArr2) {
        return new f().e(bArr, bArr2);
    }

    @Override // to.c
    public t a(String str) {
        t tVar = this.L.get(str);
        if (tVar != null) {
            return tVar;
        }
        byte[] bArr = this.K.get(str);
        if (bArr == null) {
            bArr = this.K.get(".notdef");
        }
        t tVar2 = new t(this, this.f191197a, str, new u(this.f191197a, str).a(bArr, this.I));
        this.L.put(str, tVar2);
        return tVar2;
    }

    @Override // mo.b
    public List<Number> b() {
        return Collections.unmodifiableList(this.f191201e);
    }

    @Override // mo.a
    public qo.b c() {
        return this.f191198b;
    }

    public String g() {
        return this.f191209n;
    }

    @Override // mo.b
    public String getName() {
        return this.f191197a;
    }

    @Override // mo.b
    public uo.a h() {
        return new uo.a(this.f191202f);
    }

    public String i() {
        return this.f191210p;
    }

    @Override // mo.b
    public boolean m(String str) {
        return this.K.get(str) != null;
    }

    @Override // mo.b
    public float p(String str) {
        return a(str).e();
    }

    @Override // mo.b
    public Path r(String str) {
        return a(str).d();
    }

    public String toString() {
        return d.class.getName() + "[fontName=" + this.f191197a + ", fullName=" + this.f191208m + ", encoding=" + this.f191198b + ", charStringsDict=" + this.K + "]";
    }
}
