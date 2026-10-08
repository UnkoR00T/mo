package yq0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yq0.w, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0019"}, d2 = {"Lyq0/w;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lyq0/x;", "a", "Ljava/util/List;", "()Ljava/util/List;", "entriesWithSubscription", "b", "entriesWithoutSubscription", "c", "I", "maxNumberOfDaysForSubscription", "d", "maxNumberOfSubscriptionPerPesel", "nationalcourtregistryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NationalCourtRegisterEntriesResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("entriesWithSubscription")
    private final List<NationalCourtRegisterEntryDto> entriesWithSubscription;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("entriesWithoutSubscription")
    private final List<NationalCourtRegisterEntryDto> entriesWithoutSubscription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("maxNumberOfDaysForSubscription")
    private final int maxNumberOfDaysForSubscription;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("maxNumberOfSubscriptionPerPesel")
    private final int maxNumberOfSubscriptionPerPesel;

    public final List<NationalCourtRegisterEntryDto> a() {
        return this.entriesWithSubscription;
    }

    public final List<NationalCourtRegisterEntryDto> b() {
        return this.entriesWithoutSubscription;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMaxNumberOfDaysForSubscription() {
        return this.maxNumberOfDaysForSubscription;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMaxNumberOfSubscriptionPerPesel() {
        return this.maxNumberOfSubscriptionPerPesel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NationalCourtRegisterEntriesResponse)) {
            return false;
        }
        NationalCourtRegisterEntriesResponse nationalCourtRegisterEntriesResponse = (NationalCourtRegisterEntriesResponse) other;
        return fr.t.c(this.entriesWithSubscription, nationalCourtRegisterEntriesResponse.entriesWithSubscription) && fr.t.c(this.entriesWithoutSubscription, nationalCourtRegisterEntriesResponse.entriesWithoutSubscription) && this.maxNumberOfDaysForSubscription == nationalCourtRegisterEntriesResponse.maxNumberOfDaysForSubscription && this.maxNumberOfSubscriptionPerPesel == nationalCourtRegisterEntriesResponse.maxNumberOfSubscriptionPerPesel;
    }

    public int hashCode() {
        return (((((this.entriesWithSubscription.hashCode() * 31) + this.entriesWithoutSubscription.hashCode()) * 31) + Integer.hashCode(this.maxNumberOfDaysForSubscription)) * 31) + Integer.hashCode(this.maxNumberOfSubscriptionPerPesel);
    }

    public String toString() {
        return "NationalCourtRegisterEntriesResponse(entriesWithSubscription=" + this.entriesWithSubscription + ", entriesWithoutSubscription=" + this.entriesWithoutSubscription + ", maxNumberOfDaysForSubscription=" + this.maxNumberOfDaysForSubscription + ", maxNumberOfSubscriptionPerPesel=" + this.maxNumberOfSubscriptionPerPesel + ')';
    }
}
