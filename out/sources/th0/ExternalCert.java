package th0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: th0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\n¨\u0006\u001b"}, d2 = {"Lth0/g;", "", "Lth0/g$a;", "type", "", "url", "cert", "<init>", "(Lth0/g$a;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lth0/g$a;", "getType", "()Lth0/g$a;", "b", "Ljava/lang/String;", "getUrl", "c", "getCert", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalCert {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cert;

    /* JADX INFO: renamed from: th0.g$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lth0/g$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        WK,
        PZ,
        UNKNOWN;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ wq.a f190225f = wq.b.a(b());
    }

    public ExternalCert(a aVar, String str, String str2) {
        this.type = aVar;
        this.url = str;
        this.cert = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalCert)) {
            return false;
        }
        ExternalCert externalCert = (ExternalCert) other;
        return this.type == externalCert.type && fr.t.c(this.url, externalCert.url) && fr.t.c(this.cert, externalCert.cert);
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.url.hashCode()) * 31) + this.cert.hashCode();
    }

    public String toString() {
        return "ExternalCert(type=" + this.type + ", url=" + this.url + ", cert=" + this.cert + ")";
    }
}
