package kc3;

import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import z93.Travel;

/* JADX INFO: renamed from: kc3.i, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lkc3/i;", "", "Lkc3/f$b;", "Lhb4/c;", "vmsAdapter", "", "Lz93/r;", "", "Lz93/i;", "travels", "<init>", "(Lhb4/c;Ljava/util/Map;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Error implements f, f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final hb4.c vmsAdapter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<z93.r, List<Travel>> travels;

    /* JADX WARN: Multi-variable type inference failed */
    public Error(hb4.c cVar, Map<z93.r, ? extends List<Travel>> map) {
        this.vmsAdapter = cVar;
        this.travels = map;
    }

    @Override // kc3.f.b
    /* JADX INFO: renamed from: a, reason: from getter */
    public hb4.c getVmsAdapter() {
        return this.vmsAdapter;
    }

    public final Map<z93.r, List<Travel>> b() {
        return this.travels;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        Error error = (Error) other;
        return fr.t.c(this.vmsAdapter, error.vmsAdapter) && fr.t.c(this.travels, error.travels);
    }

    public int hashCode() {
        return (this.vmsAdapter.hashCode() * 31) + this.travels.hashCode();
    }

    public String toString() {
        return "Error(vmsAdapter=" + this.vmsAdapter + ", travels=" + this.travels + ')';
    }
}
