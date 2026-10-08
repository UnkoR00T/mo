package fv;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001eBC\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00152\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b\u001e\u0010*R*\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010+\u001a\u0004\b%\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010.R\u0011\u00103\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00105\u001a\u00020-8G¢\u0006\u0006\u001a\u0004\b\"\u00104¨\u00066"}, d2 = {"Lfv/b0;", "", "Lfv/v;", "url", "", "method", "Lfv/u;", "headers", "Lfv/c0;", "body", "", "Ljava/lang/Class;", "tags", "<init>", "(Lfv/v;Ljava/lang/String;Lfv/u;Lfv/c0;Ljava/util/Map;)V", "name", "d", "(Ljava/lang/String;)Ljava/lang/String;", "", "f", "(Ljava/lang/String;)Ljava/util/List;", "T", "type", "j", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lfv/b0$a;", "i", "()Lfv/b0$a;", "toString", "()Ljava/lang/String;", "a", "Lfv/v;", "k", "()Lfv/v;", "b", "Ljava/lang/String;", "h", "c", "Lfv/u;", "e", "()Lfv/u;", "Lfv/c0;", "()Lfv/c0;", "Ljava/util/Map;", "()Ljava/util/Map;", "Lfv/d;", "Lfv/d;", "lazyCacheControl", "", "g", "()Z", "isHttps", "()Lfv/d;", "cacheControl", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String method;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u headers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c0 body;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<Class<?>, Object> tags;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private d lazyCacheControl;

    public b0(v vVar, String str, u uVar, c0 c0Var, Map<Class<?>, ? extends Object> map) {
        this.url = vVar;
        this.method = str;
        this.headers = uVar;
        this.body = c0Var;
        this.tags = map;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c0 getBody() {
        return this.body;
    }

    public final d b() {
        d dVar = this.lazyCacheControl;
        if (dVar != null) {
            return dVar;
        }
        d dVarB = d.INSTANCE.b(this.headers);
        this.lazyCacheControl = dVarB;
        return dVarB;
    }

    public final Map<Class<?>, Object> c() {
        return this.tags;
    }

    public final String d(String name) {
        return this.headers.e(name);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final u getHeaders() {
        return this.headers;
    }

    public final List<String> f(String name) {
        return this.headers.l(name);
    }

    public final boolean g() {
        return this.url.getIsHttps();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    public final a i() {
        return new a(this);
    }

    public final <T> T j(Class<? extends T> type) {
        return type.cast(this.tags.get(type));
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final v getUrl() {
        return this.url;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Request{method=");
        sb5.append(this.method);
        sb5.append(", url=");
        sb5.append(this.url);
        if (this.headers.size() != 0) {
            sb5.append(", headers=[");
            int i15 = 0;
            for (oq.r<? extends String, ? extends String> rVar : this.headers) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    pq.v.x();
                }
                oq.r<? extends String, ? extends String> rVar2 = rVar;
                String strA = rVar2.a();
                String strB = rVar2.b();
                if (i15 > 0) {
                    sb5.append(", ");
                }
                sb5.append(strA);
                sb5.append(':');
                sb5.append(strB);
                i15 = i16;
            }
            sb5.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb5.append(", tags=");
            sb5.append(this.tags);
        }
        sb5.append('}');
        return sb5.toString();
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J/\u0010%\u001a\u00020\u0000\"\u0004\b\u0000\u0010!2\u000e\u0010#\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\"2\b\u0010$\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010(R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u001e\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\u0015\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R2\u0010D\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"\u0012\u0004\u0012\u00020\u00010>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lfv/b0$a;", "", "<init>", "()V", "Lfv/b0;", "request", "(Lfv/b0;)V", "Lfv/v;", "url", "j", "(Lfv/v;)Lfv/b0$a;", "", "k", "(Ljava/lang/String;)Lfv/b0$a;", "name", "value", "d", "(Ljava/lang/String;Ljava/lang/String;)Lfv/b0$a;", "a", "h", "Lfv/u;", "headers", "e", "(Lfv/u;)Lfv/b0$a;", "c", "()Lfv/b0$a;", "Lfv/c0;", "body", "g", "(Lfv/c0;)Lfv/b0$a;", "method", "f", "(Ljava/lang/String;Lfv/c0;)Lfv/b0$a;", "T", "Ljava/lang/Class;", "type", "tag", "i", "(Ljava/lang/Class;Ljava/lang/Object;)Lfv/b0$a;", "b", "()Lfv/b0;", "Lfv/v;", "getUrl$okhttp", "()Lfv/v;", "setUrl$okhttp", "(Lfv/v;)V", "Ljava/lang/String;", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "Lfv/u$a;", "Lfv/u$a;", "getHeaders$okhttp", "()Lfv/u$a;", "setHeaders$okhttp", "(Lfv/u$a;)V", "Lfv/c0;", "getBody$okhttp", "()Lfv/c0;", "setBody$okhttp", "(Lfv/c0;)V", "", "Ljava/util/Map;", "getTags$okhttp", "()Ljava/util/Map;", "setTags$okhttp", "(Ljava/util/Map;)V", "tags", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private v url;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String method;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private u.a headers;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private c0 body;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Map<Class<?>, Object> tags;

        public a() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new u.a();
        }

        public a a(String name, String value) {
            this.headers.a(name, value);
            return this;
        }

        public b0 b() {
            v vVar = this.url;
            if (vVar != null) {
                return new b0(vVar, this.method, this.headers.f(), this.body, gv.d.T(this.tags));
            }
            throw new IllegalStateException("url == null");
        }

        public a c() {
            return f("GET", null);
        }

        public a d(String name, String value) {
            this.headers.i(name, value);
            return this;
        }

        public a e(u headers) {
            this.headers = headers.g();
            return this;
        }

        public a f(String method, c0 body) {
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (body == null) {
                if (lv.f.d(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!lv.f.a(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.method = method;
            this.body = body;
            return this;
        }

        public a g(c0 body) {
            return f("POST", body);
        }

        public a h(String name) {
            this.headers.h(name);
            return this;
        }

        public <T> a i(Class<? super T> type, T tag) {
            if (tag == null) {
                this.tags.remove(type);
                return this;
            }
            if (this.tags.isEmpty()) {
                this.tags = new LinkedHashMap();
            }
            this.tags.put(type, type.cast(tag));
            return this;
        }

        public a j(v url) {
            this.url = url;
            return this;
        }

        public a k(String url) {
            if (fu.r.T(url, "ws:", true)) {
                url = "http:" + url.substring(3);
            } else if (fu.r.T(url, "wss:", true)) {
                url = "https:" + url.substring(4);
            }
            return j(v.INSTANCE.d(url));
        }

        public a(b0 b0Var) {
            Map<Class<?>, Object> mapW;
            this.tags = new LinkedHashMap();
            this.url = b0Var.getUrl();
            this.method = b0Var.getMethod();
            this.body = b0Var.getBody();
            if (b0Var.c().isEmpty()) {
                mapW = new LinkedHashMap<>();
            } else {
                mapW = v0.w(b0Var.c());
            }
            this.tags = mapW;
            this.headers = b0Var.getHeaders().g();
        }
    }
}
