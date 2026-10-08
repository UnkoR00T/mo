package ri0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ri0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Lri0/e;", "", "Lri0/g;", "rating", "", "review", "<init>", "(Lri0/g;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lri0/g;", "()Lri0/g;", "b", "Ljava/lang/String;", "chatservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BERateConversationModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final g rating;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String review;

    public BERateConversationModel(g gVar, String str) {
        this.rating = gVar;
        this.review = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getReview() {
        return this.review;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BERateConversationModel)) {
            return false;
        }
        BERateConversationModel bERateConversationModel = (BERateConversationModel) other;
        return t.c(this.rating, bERateConversationModel.rating) && t.c(this.review, bERateConversationModel.review);
    }

    public int hashCode() {
        return (this.rating.hashCode() * 31) + this.review.hashCode();
    }

    public String toString() {
        return "BERateConversationModel(rating=" + this.rating + ", review=" + this.review + ')';
    }
}
