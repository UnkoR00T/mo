package oy;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: oy.b, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0017"}, d2 = {"Loy/b;", "Header", "Payload", "", "header", "payload", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getHeader", "()Ljava/lang/Object;", "b", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ParsedJwt<Header, Payload> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Header header;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Payload payload;

    public ParsedJwt(Header header, Payload payload) {
        this.header = header;
        this.payload = payload;
    }

    public final Payload a() {
        return this.payload;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParsedJwt)) {
            return false;
        }
        ParsedJwt parsedJwt = (ParsedJwt) other;
        return t.c(this.header, parsedJwt.header) && t.c(this.payload, parsedJwt.payload);
    }

    public int hashCode() {
        Header header = this.header;
        int iHashCode = (header == null ? 0 : header.hashCode()) * 31;
        Payload payload = this.payload;
        return iHashCode + (payload != null ? payload.hashCode() : 0);
    }

    public String toString() {
        return "ParsedJwt(header=" + this.header + ", payload=" + this.payload + ")";
    }
}
