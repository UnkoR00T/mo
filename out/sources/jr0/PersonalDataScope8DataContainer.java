package jr0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jr0.n, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Ljr0/n;", "", "Ljr0/g;", "mobileIdCard", "Ljr0/h;", "personalData", "<init>", "(Ljr0/g;Ljr0/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljr0/g;", "()Ljr0/g;", "b", "Ljr0/h;", "()Ljr0/h;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalDataScope8DataContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final MobileIdCardContainer mobileIdCard;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final MobileIdCardPersonalDataContainer personalData;

    public PersonalDataScope8DataContainer(MobileIdCardContainer mobileIdCardContainer, MobileIdCardPersonalDataContainer mobileIdCardPersonalDataContainer) {
        this.mobileIdCard = mobileIdCardContainer;
        this.personalData = mobileIdCardPersonalDataContainer;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final MobileIdCardContainer getMobileIdCard() {
        return this.mobileIdCard;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final MobileIdCardPersonalDataContainer getPersonalData() {
        return this.personalData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalDataScope8DataContainer)) {
            return false;
        }
        PersonalDataScope8DataContainer personalDataScope8DataContainer = (PersonalDataScope8DataContainer) other;
        return t.c(this.mobileIdCard, personalDataScope8DataContainer.mobileIdCard) && t.c(this.personalData, personalDataScope8DataContainer.personalData);
    }

    public int hashCode() {
        return (this.mobileIdCard.hashCode() * 31) + this.personalData.hashCode();
    }

    public String toString() {
        return "PersonalDataScope8DataContainer(mobileIdCard=" + this.mobileIdCard + ", personalData=" + this.personalData + ")";
    }
}
