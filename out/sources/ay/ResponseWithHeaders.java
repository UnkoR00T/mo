package ay;

import fr.t;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ay.m, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R)\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lay/m;", "T", "", "body", "", "", "", "headers", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ResponseWithHeaders<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final T body;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, List<String>> headers;

    /* JADX WARN: Multi-variable type inference failed */
    public ResponseWithHeaders(T t15, Map<String, ? extends List<String>> map) {
        this.body = t15;
        this.headers = map;
    }

    public final T a() {
        return this.body;
    }

    public final Map<String, List<String>> b() {
        return this.headers;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseWithHeaders)) {
            return false;
        }
        ResponseWithHeaders responseWithHeaders = (ResponseWithHeaders) other;
        return t.c(this.body, responseWithHeaders.body) && t.c(this.headers, responseWithHeaders.headers);
    }

    public int hashCode() {
        T t15 = this.body;
        return ((t15 == null ? 0 : t15.hashCode()) * 31) + this.headers.hashCode();
    }

    public String toString() {
        return "ResponseWithHeaders(body=" + this.body + ", headers=" + this.headers + ")";
    }
}
