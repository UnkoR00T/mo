package kc3;

import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import pq.v0;
import z93.Travel;

/* JADX INFO: renamed from: kc3.j, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R)\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lkc3/j;", "", "", "Lz93/r;", "", "Lz93/i;", "travels", "<init>", "(Ljava/util/Map;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Fetching implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<z93.r, List<Travel>> travels;

    /* JADX WARN: Multi-variable type inference failed */
    public Fetching() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Map<z93.r, List<Travel>> b() {
        return this.travels;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Fetching) && fr.t.c(this.travels, ((Fetching) other).travels);
    }

    public int hashCode() {
        return this.travels.hashCode();
    }

    public String toString() {
        return "Fetching(travels=" + this.travels + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Fetching(Map<z93.r, ? extends List<Travel>> map) {
        this.travels = map;
    }

    public /* synthetic */ Fetching(Map map, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? v0.i() : map);
    }
}
