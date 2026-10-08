package qx0;

import iq0.AnonymousFeatureFlag;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: qx0.l, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lqx0/l;", "", "", "Liq0/d;", "anonymousFeatureFlags", "<init>", "(Ljava/util/List;)V", "a", "(Ljava/util/List;)Lqx0/l;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "b", "()Ljava/util/List;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AnonymousFeatureFlag> anonymousFeatureFlags;

    /* JADX WARN: Multi-variable type inference failed */
    public State() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final State a(List<AnonymousFeatureFlag> anonymousFeatureFlags) {
        return new State(anonymousFeatureFlags);
    }

    public final List<AnonymousFeatureFlag> b() {
        return this.anonymousFeatureFlags;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof State) && fr.t.c(this.anonymousFeatureFlags, ((State) other).anonymousFeatureFlags);
    }

    public int hashCode() {
        return this.anonymousFeatureFlags.hashCode();
    }

    public String toString() {
        return "State(anonymousFeatureFlags=" + this.anonymousFeatureFlags + ')';
    }

    public State(List<AnonymousFeatureFlag> list) {
        this.anonymousFeatureFlags = list;
    }

    public /* synthetic */ State(List list, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? pq.v.n() : list);
    }
}
