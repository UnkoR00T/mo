package ni0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ni0.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lni0/f;", "", "", "rating", "", "review", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "getRating", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "getReview", "chatservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConversationRatingDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("rating")
    private final Integer rating;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("review")
    private final String review;

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationRatingDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationRatingDto)) {
            return false;
        }
        ConversationRatingDto conversationRatingDto = (ConversationRatingDto) other;
        return t.c(this.rating, conversationRatingDto.rating) && t.c(this.review, conversationRatingDto.review);
    }

    public int hashCode() {
        Integer num = this.rating;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.review;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ConversationRatingDto(rating=" + this.rating + ", review=" + this.review + ')';
    }

    public ConversationRatingDto(Integer num, String str) {
        this.rating = num;
        this.review = str;
    }

    public /* synthetic */ ConversationRatingDto(Integer num, String str, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : num, (i15 & 2) != 0 ? null : str);
    }
}
