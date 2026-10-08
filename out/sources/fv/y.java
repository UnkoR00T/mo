package fv;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0003\u0014\u0012\u001aB'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0005\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\b\u0010\u001eR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0016\u0010#\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0011\u0010'\u001a\u00020$8G¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lfv/y;", "Lfv/c0;", "Lvv/h;", "boundaryByteString", "Lfv/x;", "type", "", "Lfv/y$c;", "parts", "<init>", "(Lvv/h;Lfv/x;Ljava/util/List;)V", "Lvv/f;", "sink", "", "countBytes", "", "j", "(Lvv/f;Z)J", "b", "()Lfv/x;", "a", "()J", "Loq/i0;", "h", "(Lvv/f;)V", "Lvv/h;", "c", "Lfv/x;", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", CMSAttributeTableGenerator.CONTENT_TYPE, "f", "J", "contentLength", "", "i", "()Ljava/lang/String;", "boundary", "g", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y extends c0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x f67533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x f67534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x f67535j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x f67536k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final x f67537l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f67538m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[] f67539n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f67540o;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vv.h boundaryByteString;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<c> parts;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final x contentType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long contentLength = -1;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001b¨\u0006\u001d"}, d2 = {"Lfv/y$a;", "", "", "boundary", "<init>", "(Ljava/lang/String;)V", "Lfv/x;", "type", "d", "(Lfv/x;)Lfv/y$a;", "Lfv/u;", "headers", "Lfv/c0;", "body", "a", "(Lfv/u;Lfv/c0;)Lfv/y$a;", "Lfv/y$c;", "part", "b", "(Lfv/y$c;)Lfv/y$a;", "Lfv/y;", "c", "()Lfv/y;", "Lvv/h;", "Lvv/h;", "Lfv/x;", "", "Ljava/util/List;", "parts", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final vv.h boundary;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private x type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<c> parts;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final a a(u headers, c0 body) {
            b(c.INSTANCE.a(headers, body));
            return this;
        }

        public final a b(c part) {
            this.parts.add(part);
            return this;
        }

        public final y c() {
            if (this.parts.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new y(this.boundary, this.type, gv.d.S(this.parts));
        }

        public final a d(x type) {
            if (fr.t.c(type.getType(), "multipart")) {
                this.type = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        public a(String str) {
            this.boundary = vv.h.INSTANCE.d(str);
            this.type = y.f67533h;
            this.parts = new ArrayList();
        }

        public /* synthetic */ a(String str, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? UUID.randomUUID().toString() : str);
        }
    }

    /* JADX INFO: renamed from: fv.y$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lfv/y$b;", "", "<init>", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "key", "Loq/i0;", "a", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "Lfv/x;", "ALTERNATIVE", "Lfv/x;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final void a(StringBuilder sb5, String str) {
            sb5.append('\"');
            int length = str.length();
            for (int i15 = 0; i15 < length; i15++) {
                char cCharAt = str.charAt(i15);
                if (cCharAt == '\n') {
                    sb5.append("%0A");
                } else if (cCharAt == '\r') {
                    sb5.append("%0D");
                } else if (cCharAt == '\"') {
                    sb5.append("%22");
                } else {
                    sb5.append(cCharAt);
                }
            }
            sb5.append('\"');
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0001\bB\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"Lfv/y$c;", "", "Lfv/u;", "headers", "Lfv/c0;", "body", "<init>", "(Lfv/u;Lfv/c0;)V", "a", "Lfv/u;", "b", "()Lfv/u;", "Lfv/c0;", "()Lfv/c0;", "c", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final u headers;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final c0 body;

        /* JADX INFO: renamed from: fv.y$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lfv/y$c$a;", "", "<init>", "()V", "Lfv/u;", "headers", "Lfv/c0;", "body", "Lfv/y$c;", "a", "(Lfv/u;Lfv/c0;)Lfv/y$c;", "", "name", "filename", "b", "(Ljava/lang/String;Ljava/lang/String;Lfv/c0;)Lfv/y$c;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final c a(u headers, c0 body) {
                fr.k kVar = null;
                if ((headers != null ? headers.e("Content-Type") : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((headers != null ? headers.e("Content-Length") : null) == null) {
                    return new c(headers, body, kVar);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            public final c b(String name, String filename, c0 body) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("form-data; name=");
                Companion companion = y.INSTANCE;
                companion.a(sb5, name);
                if (filename != null) {
                    sb5.append("; filename=");
                    companion.a(sb5, filename);
                }
                return a(new u.a().e("Content-Disposition", sb5.toString()).f(), body);
            }

            private Companion() {
            }
        }

        public /* synthetic */ c(u uVar, c0 c0Var, fr.k kVar) {
            this(uVar, c0Var);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c0 getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final u getHeaders() {
            return this.headers;
        }

        private c(u uVar, c0 c0Var) {
            this.headers = uVar;
            this.body = c0Var;
        }
    }

    static {
        x.Companion companion = x.INSTANCE;
        f67533h = companion.a("multipart/mixed");
        f67534i = companion.a("multipart/alternative");
        f67535j = companion.a("multipart/digest");
        f67536k = companion.a("multipart/parallel");
        f67537l = companion.a("multipart/form-data");
        f67538m = new byte[]{58, 32};
        f67539n = new byte[]{13, 10};
        f67540o = new byte[]{45, 45};
    }

    public y(vv.h hVar, x xVar, List<c> list) {
        this.boundaryByteString = hVar;
        this.type = xVar;
        this.parts = list;
        this.contentType = x.INSTANCE.a(xVar + "; boundary=" + i());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long j(vv.f sink, boolean countBytes) throws EOFException {
        vv.e eVar;
        if (countBytes) {
            sink = new vv.e();
            eVar = sink;
        } else {
            eVar = 0;
        }
        int size = this.parts.size();
        long j15 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            c cVar = this.parts.get(i15);
            u headers = cVar.getHeaders();
            c0 body = cVar.getBody();
            sink.write(f67540o);
            sink.M0(this.boundaryByteString);
            sink.write(f67539n);
            if (headers != null) {
                int size2 = headers.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    sink.k1(headers.f(i16)).write(f67538m).k1(headers.k(i16)).write(f67539n);
                }
            }
            x contentType = body.getContentType();
            if (contentType != null) {
                sink.k1("Content-Type: ").k1(contentType.getMediaType()).write(f67539n);
            }
            long jA = body.a();
            if (jA != -1) {
                sink.k1("Content-Length: ").k2(jA).write(f67539n);
            } else if (countBytes) {
                eVar.b();
                return -1L;
            }
            byte[] bArr = f67539n;
            sink.write(bArr);
            if (countBytes) {
                j15 += jA;
            } else {
                body.h(sink);
            }
            sink.write(bArr);
        }
        byte[] bArr2 = f67540o;
        sink.write(bArr2);
        sink.M0(this.boundaryByteString);
        sink.write(bArr2);
        sink.write(f67539n);
        if (!countBytes) {
            return j15;
        }
        long size3 = j15 + eVar.getSize();
        eVar.b();
        return size3;
    }

    @Override // fv.c0
    public long a() throws EOFException {
        long j15 = this.contentLength;
        if (j15 != -1) {
            return j15;
        }
        long j16 = j(null, true);
        this.contentLength = j16;
        return j16;
    }

    @Override // fv.c0
    /* JADX INFO: renamed from: b, reason: from getter */
    public x getContentType() {
        return this.contentType;
    }

    @Override // fv.c0
    public void h(vv.f sink) throws EOFException {
        j(sink, false);
    }

    public final String i() {
        return this.boundaryByteString.Y();
    }
}
