package yq0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: yq0.x, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, d2 = {"Lyq0/x;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "idKrs", "b", "number", "Lyq0/y;", "c", "Lyq0/y;", "()Lyq0/y;", "subject", "Lyq0/c0;", "d", "Lyq0/c0;", "()Lyq0/c0;", "subscription", "nationalcourtregistryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NationalCourtRegisterEntryDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("idKrs")
    private final String idKrs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("number")
    private final String number;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("subject")
    private final NationalCourtRegisterSubjectDto subject;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("subscription")
    private final SubscriptionDto subscription;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIdKrs() {
        return this.idKrs;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final NationalCourtRegisterSubjectDto getSubject() {
        return this.subject;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final SubscriptionDto getSubscription() {
        return this.subscription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NationalCourtRegisterEntryDto)) {
            return false;
        }
        NationalCourtRegisterEntryDto nationalCourtRegisterEntryDto = (NationalCourtRegisterEntryDto) other;
        return fr.t.c(this.idKrs, nationalCourtRegisterEntryDto.idKrs) && fr.t.c(this.number, nationalCourtRegisterEntryDto.number) && fr.t.c(this.subject, nationalCourtRegisterEntryDto.subject) && fr.t.c(this.subscription, nationalCourtRegisterEntryDto.subscription);
    }

    public int hashCode() {
        int iHashCode = ((((this.idKrs.hashCode() * 31) + this.number.hashCode()) * 31) + this.subject.hashCode()) * 31;
        SubscriptionDto subscriptionDto = this.subscription;
        return iHashCode + (subscriptionDto == null ? 0 : subscriptionDto.hashCode());
    }

    public String toString() {
        return "NationalCourtRegisterEntryDto(idKrs=" + this.idKrs + ", number=" + this.number + ", subject=" + this.subject + ", subscription=" + this.subscription + ')';
    }
}
