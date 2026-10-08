package o24;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: o24.s0, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, d2 = {"Lo24/s0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lo24/f0;", "a", "Lo24/f0;", "()Lo24/f0;", "mobileIdCard", "Lo24/q0;", "b", "Lo24/q0;", "()Lo24/q0;", "personalData", "Lo24/t0;", "c", "Lo24/t0;", "()Lo24/t0;", "personalIdCard", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalDataScope9DataContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("mobileIdCard")
    private final MobileIdCardContainer mobileIdCard;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("personalData")
    private final PersonalDataContainer personalData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("personalIdCard")
    private final PersonalIdCardContainer personalIdCard;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final MobileIdCardContainer getMobileIdCard() {
        return this.mobileIdCard;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PersonalDataContainer getPersonalData() {
        return this.personalData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final PersonalIdCardContainer getPersonalIdCard() {
        return this.personalIdCard;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalDataScope9DataContainer)) {
            return false;
        }
        PersonalDataScope9DataContainer personalDataScope9DataContainer = (PersonalDataScope9DataContainer) other;
        return fr.t.c(this.mobileIdCard, personalDataScope9DataContainer.mobileIdCard) && fr.t.c(this.personalData, personalDataScope9DataContainer.personalData) && fr.t.c(this.personalIdCard, personalDataScope9DataContainer.personalIdCard);
    }

    public int hashCode() {
        return (((this.mobileIdCard.hashCode() * 31) + this.personalData.hashCode()) * 31) + this.personalIdCard.hashCode();
    }

    public String toString() {
        return "PersonalDataScope9DataContainer(mobileIdCard=" + this.mobileIdCard + ", personalData=" + this.personalData + ", personalIdCard=" + this.personalIdCard + ')';
    }
}
