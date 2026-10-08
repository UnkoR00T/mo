package pl.gov.coi.common.network;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: pl.gov.coi.common.network.g, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lpl/gov/coi/common/network/g;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "hostname", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "ip", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomDns {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String hostname;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> ip;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getHostname() {
        return this.hostname;
    }

    public final List<String> b() {
        return this.ip;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomDns)) {
            return false;
        }
        CustomDns customDns = (CustomDns) other;
        return fr.t.c(this.hostname, customDns.hostname) && fr.t.c(this.ip, customDns.ip);
    }

    public int hashCode() {
        return (this.hostname.hashCode() * 31) + this.ip.hashCode();
    }

    public String toString() {
        return "CustomDns(hostname=" + this.hostname + ", ip=" + this.ip + ')';
    }
}
