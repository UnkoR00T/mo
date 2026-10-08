package vc;

import org.bouncycastle.asn1.x509.DisplayText;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vc.s, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJM\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u001f\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lvc/s;", "", "", "code", "", "requestMillis", "responseMillis", "Lvc/p;", "headers", "Lvc/t;", "body", "delegate", "<init>", "(IJJLvc/p;Lvc/t;Ljava/lang/Object;)V", "a", "(IJJLvc/p;Lvc/t;Ljava/lang/Object;)Lvc/s;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "d", "b", "J", "f", "()J", "c", "g", "Lvc/p;", "e", "()Lvc/p;", "Lvc/t;", "()Lvc/t;", "Ljava/lang/Object;", "getDelegate", "()Ljava/lang/Object;", "coil-network-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long requestMillis;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long responseMillis;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final NetworkHeaders headers;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final t body;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Object delegate;

    public NetworkResponse() {
        this(0, 0L, 0L, null, null, null, 63, null);
    }

    public static /* synthetic */ NetworkResponse b(NetworkResponse networkResponse, int i15, long j15, long j16, NetworkHeaders networkHeaders, t tVar, Object obj, int i16, Object obj2) {
        if ((i16 & 1) != 0) {
            i15 = networkResponse.code;
        }
        if ((i16 & 2) != 0) {
            j15 = networkResponse.requestMillis;
        }
        if ((i16 & 4) != 0) {
            j16 = networkResponse.responseMillis;
        }
        if ((i16 & 8) != 0) {
            networkHeaders = networkResponse.headers;
        }
        if ((i16 & 16) != 0) {
            tVar = networkResponse.body;
        }
        if ((i16 & 32) != 0) {
            obj = networkResponse.delegate;
        }
        Object obj3 = obj;
        NetworkHeaders networkHeaders2 = networkHeaders;
        long j17 = j16;
        return networkResponse.a(i15, j15, j17, networkHeaders2, tVar, obj3);
    }

    public final NetworkResponse a(int code, long requestMillis, long responseMillis, NetworkHeaders headers, t body, Object delegate) {
        return new NetworkResponse(code, requestMillis, responseMillis, headers, body, delegate);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final t getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final NetworkHeaders getHeaders() {
        return this.headers;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkResponse)) {
            return false;
        }
        NetworkResponse networkResponse = (NetworkResponse) other;
        return this.code == networkResponse.code && this.requestMillis == networkResponse.requestMillis && this.responseMillis == networkResponse.responseMillis && fr.t.c(this.headers, networkResponse.headers) && fr.t.c(this.body, networkResponse.body) && fr.t.c(this.delegate, networkResponse.delegate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getRequestMillis() {
        return this.requestMillis;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getResponseMillis() {
        return this.responseMillis;
    }

    public int hashCode() {
        int iHashCode = ((((((this.code * 31) + Long.hashCode(this.requestMillis)) * 31) + Long.hashCode(this.responseMillis)) * 31) + this.headers.hashCode()) * 31;
        t tVar = this.body;
        int iHashCode2 = (iHashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Object obj = this.delegate;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "NetworkResponse(code=" + this.code + ", requestMillis=" + this.requestMillis + ", responseMillis=" + this.responseMillis + ", headers=" + this.headers + ", body=" + this.body + ", delegate=" + this.delegate + ")";
    }

    public NetworkResponse(int i15, long j15, long j16, NetworkHeaders networkHeaders, t tVar, Object obj) {
        this.code = i15;
        this.requestMillis = j15;
        this.responseMillis = j16;
        this.headers = networkHeaders;
        this.body = tVar;
        this.delegate = obj;
    }

    public /* synthetic */ NetworkResponse(int i15, long j15, long j16, NetworkHeaders networkHeaders, t tVar, Object obj, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE : i15, (i16 & 2) != 0 ? 0L : j15, (i16 & 4) != 0 ? 0L : j16, (i16 & 8) != 0 ? NetworkHeaders.f206014c : networkHeaders, (i16 & 16) != 0 ? null : tVar, (i16 & 32) != 0 ? null : obj);
    }
}
