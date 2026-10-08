package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.q, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lgm0/q;", "", "", "restrictionsCount", "<init>", "(Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BanksRestrictionDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("restrictionsCount")
    private final Integer restrictionsCount;

    /* JADX WARN: Multi-variable type inference failed */
    public BanksRestrictionDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getRestrictionsCount() {
        return this.restrictionsCount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BanksRestrictionDto) && fr.t.c(this.restrictionsCount, ((BanksRestrictionDto) other).restrictionsCount);
    }

    public int hashCode() {
        Integer num = this.restrictionsCount;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "BanksRestrictionDto(restrictionsCount=" + this.restrictionsCount + ')';
    }

    public BanksRestrictionDto(Integer num) {
        this.restrictionsCount = num;
    }

    public /* synthetic */ BanksRestrictionDto(Integer num, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : num);
    }
}
