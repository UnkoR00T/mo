package pl.gov.coi.common.network;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: pl.gov.coi.common.network.x, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lpl/gov/coi/common/network/x;", "", "Lgu/b;", "timeout", "Lay/j;", "jsonSerializer", "<init>", "(Lgu/b;Lay/j;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgu/b;", "b", "()Lgu/b;", "Lay/j;", "()Lay/j;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HttpServiceParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final gu.b timeout;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ay.j jsonSerializer;

    public /* synthetic */ HttpServiceParameters(gu.b bVar, ay.j jVar, fr.k kVar) {
        this(bVar, jVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ay.j getJsonSerializer() {
        return this.jsonSerializer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final gu.b getTimeout() {
        return this.timeout;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpServiceParameters)) {
            return false;
        }
        HttpServiceParameters httpServiceParameters = (HttpServiceParameters) other;
        return fr.t.c(this.timeout, httpServiceParameters.timeout) && fr.t.c(this.jsonSerializer, httpServiceParameters.jsonSerializer);
    }

    public int hashCode() {
        gu.b bVar = this.timeout;
        int iN = (bVar == null ? 0 : gu.b.N(bVar.getRawValue())) * 31;
        ay.j jVar = this.jsonSerializer;
        return iN + (jVar != null ? jVar.hashCode() : 0);
    }

    public String toString() {
        return "HttpServiceParameters(timeout=" + this.timeout + ", jsonSerializer=" + this.jsonSerializer + ')';
    }

    private HttpServiceParameters(gu.b bVar, ay.j jVar) {
        this.timeout = bVar;
        this.jsonSerializer = jVar;
    }

    public /* synthetic */ HttpServiceParameters(gu.b bVar, ay.j jVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : bVar, (i15 & 2) != 0 ? null : jVar, null);
    }
}
