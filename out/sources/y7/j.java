package y7;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f224865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f224866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f224867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f224868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, String> f224869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public final long f224870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f224871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f224872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f224873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f224874j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f224875k;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Uri f224876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f224877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f224878c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f224879d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<String, String> f224880e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f224881f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f224882g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f224883h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f224884i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Object f224885j;

        public j a() {
            zj.p.r(this.f224876a, "The uri must be set.");
            return new j(this.f224876a, this.f224877b, this.f224878c, this.f224879d, this.f224880e, this.f224881f, this.f224882g, this.f224883h, this.f224884i, this.f224885j);
        }

        public b b(int i15) {
            this.f224884i = i15;
            return this;
        }

        public b c(byte[] bArr) {
            this.f224879d = bArr;
            return this;
        }

        public b d(int i15) {
            this.f224878c = i15;
            return this;
        }

        public b e(Map<String, String> map) {
            this.f224880e = map;
            return this;
        }

        public b f(String str) {
            this.f224883h = str;
            return this;
        }

        public b g(long j15) {
            this.f224881f = j15;
            return this;
        }

        public b h(Uri uri) {
            this.f224876a = uri;
            return this;
        }

        public b i(String str) {
            this.f224876a = Uri.parse(str);
            return this;
        }

        public b() {
            this.f224878c = 1;
            this.f224880e = Collections.EMPTY_MAP;
            this.f224882g = -1L;
        }

        private b(j jVar) {
            this.f224876a = jVar.f224865a;
            this.f224877b = jVar.f224866b;
            this.f224878c = jVar.f224867c;
            this.f224879d = jVar.f224868d;
            this.f224880e = jVar.f224869e;
            this.f224881f = jVar.f224871g;
            this.f224882g = jVar.f224872h;
            this.f224883h = jVar.f224873i;
            this.f224884i = jVar.f224874j;
            this.f224885j = jVar.f224875k;
        }
    }

    static {
        t7.t.a("media3.datasource");
    }

    public static String c(int i15) {
        if (i15 == 1) {
            return "GET";
        }
        if (i15 == 2) {
            return "POST";
        }
        if (i15 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f224867c);
    }

    public boolean d(int i15) {
        return (this.f224874j & i15) == i15;
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f224865a + ", " + this.f224871g + ", " + this.f224872h + ", " + this.f224873i + ", " + this.f224874j + "]";
    }

    private j(Uri uri, long j15, int i15, byte[] bArr, Map<String, String> map, long j16, long j17, String str, int i16, Object obj) {
        byte[] bArr2 = bArr;
        long j18 = j15 + j16;
        zj.p.d(j18 >= 0);
        zj.p.d(j16 >= 0);
        zj.p.d(j17 > 0 || j17 == -1);
        this.f224865a = (Uri) zj.p.q(uri);
        this.f224866b = j15;
        this.f224867c = i15;
        this.f224868d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f224869e = Collections.unmodifiableMap(new HashMap(map));
        this.f224871g = j16;
        this.f224870f = j18;
        this.f224872h = j17;
        this.f224873i = str;
        this.f224874j = i16;
        this.f224875k = obj;
    }
}
