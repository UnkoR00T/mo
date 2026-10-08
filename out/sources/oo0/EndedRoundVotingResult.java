package oo0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: oo0.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, d2 = {"Loo0/f;", "", "", "Loo0/h;", "promotedIdeas", "Loo0/g;", "otherIdeas", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EndedRoundVotingResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<h> promotedIdeas;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<g> otherIdeas;

    public EndedRoundVotingResult(List<h> list, List<g> list2) {
        this.promotedIdeas = list;
        this.otherIdeas = list2;
    }

    public final List<g> a() {
        return this.otherIdeas;
    }

    public final List<h> b() {
        return this.promotedIdeas;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EndedRoundVotingResult)) {
            return false;
        }
        EndedRoundVotingResult endedRoundVotingResult = (EndedRoundVotingResult) other;
        return fr.t.c(this.promotedIdeas, endedRoundVotingResult.promotedIdeas) && fr.t.c(this.otherIdeas, endedRoundVotingResult.otherIdeas);
    }

    public int hashCode() {
        return (this.promotedIdeas.hashCode() * 31) + this.otherIdeas.hashCode();
    }

    public String toString() {
        return "EndedRoundVotingResult(promotedIdeas=" + this.promotedIdeas + ", otherIdeas=" + this.otherIdeas + ")";
    }
}
