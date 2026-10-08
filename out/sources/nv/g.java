package nv;

import fr.t;
import fv.a0;
import fv.b0;
import fv.d0;
import fv.u;
import fv.z;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p071kotlin.Metadata;
import vv.j0;
import vv.k0;
import vv.l0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0011B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010/R\u0016\u00102\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00101¨\u00063"}, d2 = {"Lnv/g;", "Llv/d;", "Lfv/z;", "client", "Lkv/f;", "connection", "Llv/g;", "chain", "Lnv/f;", "http2Connection", "<init>", "(Lfv/z;Lkv/f;Llv/g;Lnv/f;)V", "Lfv/b0;", "request", "", "contentLength", "Lvv/j0;", "a", "(Lfv/b0;J)Lvv/j0;", "Loq/i0;", "e", "(Lfv/b0;)V", "h", "()V", "c", "", "expectContinue", "Lfv/d0$a;", "g", "(Z)Lfv/d0$a;", "Lfv/d0;", "response", "f", "(Lfv/d0;)J", "Lvv/k0;", "b", "(Lfv/d0;)Lvv/k0;", "cancel", "Lkv/f;", "d", "()Lkv/f;", "Llv/g;", "Lnv/f;", "Lnv/i;", "Lnv/i;", "stream", "Lfv/a0;", "Lfv/a0;", "protocol", "Z", "canceled", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g implements lv.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List<String> f139019h = gv.d.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final List<String> f139020i = gv.d.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kv.f connection;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final lv.g chain;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f http2Connection;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private volatile i stream;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a0 protocol;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private volatile boolean canceled;

    /* JADX INFO: renamed from: nv.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013¨\u0006\u001e"}, d2 = {"Lnv/g$a;", "", "<init>", "()V", "Lfv/b0;", "request", "", "Lnv/c;", "a", "(Lfv/b0;)Ljava/util/List;", "Lfv/u;", "headerBlock", "Lfv/a0;", "protocol", "Lfv/d0$a;", "b", "(Lfv/u;Lfv/a0;)Lfv/d0$a;", "", "CONNECTION", "Ljava/lang/String;", "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final List<c> a(b0 request) {
            u headers = request.getHeaders();
            ArrayList arrayList = new ArrayList(headers.size() + 4);
            arrayList.add(new c(c.f138915g, request.getMethod()));
            arrayList.add(new c(c.f138916h, lv.i.f120567a.c(request.getUrl())));
            String strD = request.d("Host");
            if (strD != null) {
                arrayList.add(new c(c.f138918j, strD));
            }
            arrayList.add(new c(c.f138917i, request.getUrl().getScheme()));
            int size = headers.size();
            for (int i15 = 0; i15 < size; i15++) {
                String lowerCase = headers.f(i15).toLowerCase(Locale.US);
                if (!g.f139019h.contains(lowerCase) || (t.c(lowerCase, "te") && t.c(headers.k(i15), "trailers"))) {
                    arrayList.add(new c(lowerCase, headers.k(i15)));
                }
            }
            return arrayList;
        }

        public final d0.a b(u headerBlock, a0 protocol) throws ProtocolException {
            u.a aVar = new u.a();
            int size = headerBlock.size();
            lv.k kVarA = null;
            for (int i15 = 0; i15 < size; i15++) {
                String strF = headerBlock.f(i15);
                String strK = headerBlock.k(i15);
                if (t.c(strF, ":status")) {
                    kVarA = lv.k.INSTANCE.a("HTTP/1.1 " + strK);
                } else if (!g.f139020i.contains(strF)) {
                    aVar.d(strF, strK);
                }
            }
            if (kVarA != null) {
                return new d0.a().p(protocol).g(kVarA.code).m(kVarA.message).k(aVar.f());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private Companion() {
        }
    }

    public g(z zVar, kv.f fVar, lv.g gVar, f fVar2) {
        this.connection = fVar;
        this.chain = gVar;
        this.http2Connection = fVar2;
        List<a0> listJ = zVar.J();
        a0 a0Var = a0.H2_PRIOR_KNOWLEDGE;
        this.protocol = listJ.contains(a0Var) ? a0Var : a0.HTTP_2;
    }

    @Override // lv.d
    public j0 a(b0 request, long contentLength) {
        return this.stream.n();
    }

    @Override // lv.d
    public k0 b(d0 response) {
        return this.stream.getSource();
    }

    @Override // lv.d
    public void c() {
        this.stream.n().close();
    }

    @Override // lv.d
    public void cancel() {
        this.canceled = true;
        i iVar = this.stream;
        if (iVar != null) {
            iVar.f(b.CANCEL);
        }
    }

    @Override // lv.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public kv.f getConnection() {
        return this.connection;
    }

    @Override // lv.d
    public void e(b0 request) throws IOException {
        if (this.stream != null) {
            return;
        }
        this.stream = this.http2Connection.o1(INSTANCE.a(request), request.getBody() != null);
        if (this.canceled) {
            this.stream.f(b.CANCEL);
            throw new IOException("Canceled");
        }
        l0 l0VarV = this.stream.v();
        long readTimeoutMillis = this.chain.getReadTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        l0VarV.g(readTimeoutMillis, timeUnit);
        this.stream.E().g(this.chain.getWriteTimeoutMillis(), timeUnit);
    }

    @Override // lv.d
    public long f(d0 response) {
        if (lv.e.b(response)) {
            return gv.d.v(response);
        }
        return 0L;
    }

    @Override // lv.d
    public d0.a g(boolean expectContinue) throws IOException {
        i iVar = this.stream;
        if (iVar == null) {
            throw new IOException("stream wasn't created");
        }
        d0.a aVarB = INSTANCE.b(iVar.C(), this.protocol);
        if (expectContinue && aVarB.getCode() == 100) {
            return null;
        }
        return aVarB;
    }

    @Override // lv.d
    public void h() {
        this.http2Connection.flush();
    }
}
