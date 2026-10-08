package fv;

import java.io.Closeable;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001*B}\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b5\u00104\u001a\u0004\b6\u00107R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b.\u0010BR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010FR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010FR\u0017\u0010\u0014\u001a\u00020\u00138\u0007¢\u0006\f\n\u0004\bK\u0010E\u001a\u0004\bL\u0010MR\u0017\u0010\u0015\u001a\u00020\u00138\u0007¢\u0006\f\n\u0004\bH\u0010E\u001a\u0004\bN\u0010MR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0001X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0018\u0010U\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010TR\u0011\u0010W\u001a\u00020V8F¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0011\u0010Z\u001a\u00020S8G¢\u0006\u0006\u001a\u0004\bC\u0010Y¨\u0006["}, d2 = {"Lfv/d0;", "Ljava/io/Closeable;", "Lfv/b0;", "request", "Lfv/a0;", "protocol", "", "message", "", "code", "Lfv/t;", "handshake", "Lfv/u;", "headers", "Lfv/e0;", "body", "networkResponse", "cacheResponse", "priorResponse", "", "sentRequestAtMillis", "receivedResponseAtMillis", "Lkv/c;", "exchange", "<init>", "(Lfv/b0;Lfv/a0;Ljava/lang/String;ILfv/t;Lfv/u;Lfv/e0;Lfv/d0;Lfv/d0;Lfv/d0;JJLkv/c;)V", "name", "defaultValue", "C", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lfv/d0$a;", "K", "()Lfv/d0$a;", "", "Lfv/h;", "p", "()Ljava/util/List;", "Loq/i0;", "close", "()V", "toString", "()Ljava/lang/String;", "a", "Lfv/b0;", "O", "()Lfv/b0;", "b", "Lfv/a0;", "M", "()Lfv/a0;", "c", "Ljava/lang/String;", "I", "d", "r", "()I", "e", "Lfv/t;", "y", "()Lfv/t;", "f", "Lfv/u;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()Lfv/u;", "g", "Lfv/e0;", "()Lfv/e0;", "h", "Lfv/d0;", "J", "()Lfv/d0;", "j", "m", "k", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "l", "V", "()J", "N", "n", "Lkv/c;", "u", "()Lkv/c;", "Lfv/d;", "Lfv/d;", "lazyCacheControl", "", "isSuccessful", "()Z", "()Lfv/d;", "cacheControl", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 request;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a0 protocol;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int code;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t handshake;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final u headers;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final e0 body;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final d0 networkResponse;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final d0 cacheResponse;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final d0 priorResponse;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long sentRequestAtMillis;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long receivedResponseAtMillis;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final kv.c exchange;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private d lazyCacheControl;

    public d0(b0 b0Var, a0 a0Var, String str, int i15, t tVar, u uVar, e0 e0Var, d0 d0Var, d0 d0Var2, d0 d0Var3, long j15, long j16, kv.c cVar) {
        this.request = b0Var;
        this.protocol = a0Var;
        this.message = str;
        this.code = i15;
        this.handshake = tVar;
        this.headers = uVar;
        this.body = e0Var;
        this.networkResponse = d0Var;
        this.cacheResponse = d0Var2;
        this.priorResponse = d0Var3;
        this.sentRequestAtMillis = j15;
        this.receivedResponseAtMillis = j16;
        this.exchange = cVar;
    }

    public static /* synthetic */ String E(d0 d0Var, String str, String str2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            str2 = null;
        }
        return d0Var.C(str, str2);
    }

    public final String C(String name, String defaultValue) {
        String strE = this.headers.e(name);
        return strE == null ? defaultValue : strE;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final u getHeaders() {
        return this.headers;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final d0 getNetworkResponse() {
        return this.networkResponse;
    }

    public final a K() {
        return new a(this);
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final d0 getPriorResponse() {
        return this.priorResponse;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final a0 getProtocol() {
        return this.protocol;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final b0 getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e0 getBody() {
        return this.body;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e0 e0Var = this.body;
        if (e0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        e0Var.close();
    }

    public final d h() {
        d dVar = this.lazyCacheControl;
        if (dVar != null) {
            return dVar;
        }
        d dVarB = d.INSTANCE.b(this.headers);
        this.lazyCacheControl = dVarB;
        return dVarB;
    }

    public final boolean isSuccessful() {
        int i15 = this.code;
        return 200 <= i15 && i15 < 300;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final d0 getCacheResponse() {
        return this.cacheResponse;
    }

    public final List<h> p() {
        String str;
        u uVar = this.headers;
        int i15 = this.code;
        if (i15 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i15 != 407) {
                return pq.v.n();
            }
            str = "Proxy-Authenticate";
        }
        return lv.e.a(uVar, str);
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.getUrl() + '}';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final kv.c getExchange() {
        return this.exchange;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final t getHandshake() {
        return this.handshake;
    }

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J!\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\"J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b0\u0010.J\u0019\u00102\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b2\u0010.J\u0017\u00105\u001a\u00020\u00002\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00002\u0006\u00107\u001a\u000203H\u0016¢\u0006\u0004\b8\u00106J\u0017\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u0010>R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u0016\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010%\u001a\u00020X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010)\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010,\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010c\u001a\u0004\bd\u0010>\"\u0004\be\u0010\u0006R$\u0010/\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010c\u001a\u0004\bf\u0010>\"\u0004\bg\u0010\u0006R$\u00101\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010c\u001a\u0004\bh\u0010>\"\u0004\bi\u0010\u0006R\"\u00104\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u00107\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010j\u001a\u0004\bo\u0010l\"\u0004\bp\u0010nR$\u0010u\u001a\u0004\u0018\u0001098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010<¨\u0006v"}, d2 = {"Lfv/d0$a;", "", "<init>", "()V", "Lfv/d0;", "response", "(Lfv/d0;)V", "", "name", "Loq/i0;", "f", "(Ljava/lang/String;Lfv/d0;)V", "e", "Lfv/b0;", "request", "r", "(Lfv/b0;)Lfv/d0$a;", "Lfv/a0;", "protocol", "p", "(Lfv/a0;)Lfv/d0$a;", "", "code", "g", "(I)Lfv/d0$a;", "message", "m", "(Ljava/lang/String;)Lfv/d0$a;", "Lfv/t;", "handshake", "i", "(Lfv/t;)Lfv/d0$a;", "value", "j", "(Ljava/lang/String;Ljava/lang/String;)Lfv/d0$a;", "a", "Lfv/u;", "headers", "k", "(Lfv/u;)Lfv/d0$a;", "Lfv/e0;", "body", "b", "(Lfv/e0;)Lfv/d0$a;", "networkResponse", "n", "(Lfv/d0;)Lfv/d0$a;", "cacheResponse", "d", "priorResponse", "o", "", "sentRequestAtMillis", "s", "(J)Lfv/d0$a;", "receivedResponseAtMillis", "q", "Lkv/c;", "deferredTrailers", "l", "(Lkv/c;)V", "c", "()Lfv/d0;", "Lfv/b0;", "getRequest$okhttp", "()Lfv/b0;", "setRequest$okhttp", "(Lfv/b0;)V", "Lfv/a0;", "getProtocol$okhttp", "()Lfv/a0;", "setProtocol$okhttp", "(Lfv/a0;)V", "I", "h", "()I", "setCode$okhttp", "(I)V", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "Lfv/t;", "getHandshake$okhttp", "()Lfv/t;", "setHandshake$okhttp", "(Lfv/t;)V", "Lfv/u$a;", "Lfv/u$a;", "getHeaders$okhttp", "()Lfv/u$a;", "setHeaders$okhttp", "(Lfv/u$a;)V", "Lfv/e0;", "getBody$okhttp", "()Lfv/e0;", "setBody$okhttp", "(Lfv/e0;)V", "Lfv/d0;", "getNetworkResponse$okhttp", "setNetworkResponse$okhttp", "getCacheResponse$okhttp", "setCacheResponse$okhttp", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "J", "getSentRequestAtMillis$okhttp", "()J", "setSentRequestAtMillis$okhttp", "(J)V", "getReceivedResponseAtMillis$okhttp", "setReceivedResponseAtMillis$okhttp", "Lkv/c;", "getExchange$okhttp", "()Lkv/c;", "setExchange$okhttp", "exchange", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private b0 request;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private a0 protocol;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int code;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private String message;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private t handshake;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private u.a headers;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private e0 body;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private d0 networkResponse;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private d0 cacheResponse;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private d0 priorResponse;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private long sentRequestAtMillis;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private long receivedResponseAtMillis;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private kv.c exchange;

        public a() {
            this.code = -1;
            this.headers = new u.a();
        }

        private final void e(d0 response) {
            if (response != null && response.getBody() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private final void f(String name, d0 response) {
            if (response != null) {
                if (response.getBody() != null) {
                    throw new IllegalArgumentException((name + ".body != null").toString());
                }
                if (response.getNetworkResponse() != null) {
                    throw new IllegalArgumentException((name + ".networkResponse != null").toString());
                }
                if (response.getCacheResponse() != null) {
                    throw new IllegalArgumentException((name + ".cacheResponse != null").toString());
                }
                if (response.getPriorResponse() == null) {
                    return;
                }
                throw new IllegalArgumentException((name + ".priorResponse != null").toString());
            }
        }

        public a a(String name, String value) {
            this.headers.a(name, value);
            return this;
        }

        public a b(e0 body) {
            this.body = body;
            return this;
        }

        public d0 c() {
            int i15 = this.code;
            if (i15 < 0) {
                throw new IllegalStateException(("code < 0: " + this.code).toString());
            }
            b0 b0Var = this.request;
            if (b0Var == null) {
                throw new IllegalStateException("request == null");
            }
            a0 a0Var = this.protocol;
            if (a0Var == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.message;
            if (str != null) {
                return new d0(b0Var, a0Var, str, i15, this.handshake, this.headers.f(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
            }
            throw new IllegalStateException("message == null");
        }

        public a d(d0 cacheResponse) {
            f("cacheResponse", cacheResponse);
            this.cacheResponse = cacheResponse;
            return this;
        }

        public a g(int code) {
            this.code = code;
            return this;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        public a i(t handshake) {
            this.handshake = handshake;
            return this;
        }

        public a j(String name, String value) {
            this.headers.i(name, value);
            return this;
        }

        public a k(u headers) {
            this.headers = headers.g();
            return this;
        }

        public final void l(kv.c deferredTrailers) {
            this.exchange = deferredTrailers;
        }

        public a m(String message) {
            this.message = message;
            return this;
        }

        public a n(d0 networkResponse) {
            f("networkResponse", networkResponse);
            this.networkResponse = networkResponse;
            return this;
        }

        public a o(d0 priorResponse) {
            e(priorResponse);
            this.priorResponse = priorResponse;
            return this;
        }

        public a p(a0 protocol) {
            this.protocol = protocol;
            return this;
        }

        public a q(long receivedResponseAtMillis) {
            this.receivedResponseAtMillis = receivedResponseAtMillis;
            return this;
        }

        public a r(b0 request) {
            this.request = request;
            return this;
        }

        public a s(long sentRequestAtMillis) {
            this.sentRequestAtMillis = sentRequestAtMillis;
            return this;
        }

        public a(d0 d0Var) {
            this.code = -1;
            this.request = d0Var.getRequest();
            this.protocol = d0Var.getProtocol();
            this.code = d0Var.getCode();
            this.message = d0Var.getMessage();
            this.handshake = d0Var.getHandshake();
            this.headers = d0Var.getHeaders().g();
            this.body = d0Var.getBody();
            this.networkResponse = d0Var.getNetworkResponse();
            this.cacheResponse = d0Var.getCacheResponse();
            this.priorResponse = d0Var.getPriorResponse();
            this.sentRequestAtMillis = d0Var.getSentRequestAtMillis();
            this.receivedResponseAtMillis = d0Var.getReceivedResponseAtMillis();
            this.exchange = d0Var.getExchange();
        }
    }
}
