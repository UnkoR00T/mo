package oo0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: oo0.t, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, d2 = {"Loo0/t;", "", "", "id", "", "mobileName", "", "Loo0/s;", "promotedIdeas", "<init>", "(JLjava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getId", "()J", "b", "Ljava/lang/String;", "c", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RoundSummaryModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mobileName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PromotedIdea> promotedIdeas;

    public RoundSummaryModel(long j15, String str, List<PromotedIdea> list) {
        this.id = j15;
        this.mobileName = str;
        this.promotedIdeas = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMobileName() {
        return this.mobileName;
    }

    public final List<PromotedIdea> b() {
        return this.promotedIdeas;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundSummaryModel)) {
            return false;
        }
        RoundSummaryModel roundSummaryModel = (RoundSummaryModel) other;
        return this.id == roundSummaryModel.id && fr.t.c(this.mobileName, roundSummaryModel.mobileName) && fr.t.c(this.promotedIdeas, roundSummaryModel.promotedIdeas);
    }

    public int hashCode() {
        return (((Long.hashCode(this.id) * 31) + this.mobileName.hashCode()) * 31) + this.promotedIdeas.hashCode();
    }

    public String toString() {
        return "RoundSummaryModel(id=" + this.id + ", mobileName=" + this.mobileName + ", promotedIdeas=" + this.promotedIdeas + ")";
    }
}
