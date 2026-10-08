package ap;

import bp.d;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap<String, a> f13963d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f13965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f13966c;

    private a(String str) {
        this.f13964a = str;
        if (str.startsWith("/")) {
            throw new IllegalArgumentException("Operators are not allowed to start with / '" + str + "'");
        }
    }

    public static a d(String str) {
        if (str.equals("ID") || "BI".equals(str)) {
            return new a(str);
        }
        ConcurrentMap<String, a> concurrentMap = f13963d;
        a aVarPutIfAbsent = concurrentMap.get(str);
        return (aVarPutIfAbsent == null && (aVarPutIfAbsent = concurrentMap.putIfAbsent(str, new a(str))) == null) ? concurrentMap.get(str) : aVarPutIfAbsent;
    }

    public byte[] a() {
        return this.f13965b;
    }

    public d b() {
        return this.f13966c;
    }

    public String c() {
        return this.f13964a;
    }

    public void e(byte[] bArr) {
        this.f13965b = bArr;
    }

    public void f(d dVar) {
        this.f13966c = dVar;
    }

    public String toString() {
        return "PDFOperator{" + this.f13964a + "}";
    }
}
