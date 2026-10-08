package lk2;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: lk2.e, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Llk2/e;", "", "Llk2/g;", "mobileIdCard", "Llk2/i;", "personalData", "Llk2/j;", "personalIdCard", "<init>", "(Llk2/g;Llk2/i;Llk2/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llk2/g;", "()Llk2/g;", "b", "Llk2/i;", "()Llk2/i;", "c", "Llk2/j;", "()Llk2/j;", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MidCardScopeDataContainer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f118680d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final MobileIdCardContainer mobileIdCard;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final PersonalDataContainer personalData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PersonalIdCardContainer personalIdCard;

    static {
        int i15 = fz.b.LocalDate.f68860b;
        int i16 = b0.f97726c;
        int i17 = i15 | i15 | i16 | i16 | i15 | i16 | i16 | i16 | i16 | i16 | i16 | i16 | i16 | i16 | i16 | i16 | i16 | i16 | i16 | i16 | i16 | i16;
        int i18 = fz.b.OffsetDateTime.f68865b;
        f118680d = i17 | i18 | i18;
    }

    public MidCardScopeDataContainer(MobileIdCardContainer mobileIdCardContainer, PersonalDataContainer personalDataContainer, PersonalIdCardContainer personalIdCardContainer) {
        this.mobileIdCard = mobileIdCardContainer;
        this.personalData = personalDataContainer;
        this.personalIdCard = personalIdCardContainer;
    }

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
        if (!(other instanceof MidCardScopeDataContainer)) {
            return false;
        }
        MidCardScopeDataContainer midCardScopeDataContainer = (MidCardScopeDataContainer) other;
        return t.c(this.mobileIdCard, midCardScopeDataContainer.mobileIdCard) && t.c(this.personalData, midCardScopeDataContainer.personalData) && t.c(this.personalIdCard, midCardScopeDataContainer.personalIdCard);
    }

    public int hashCode() {
        return (((this.mobileIdCard.hashCode() * 31) + this.personalData.hashCode()) * 31) + this.personalIdCard.hashCode();
    }

    public String toString() {
        return "MidCardScopeDataContainer(mobileIdCard=" + this.mobileIdCard + ", personalData=" + this.personalData + ", personalIdCard=" + this.personalIdCard + ')';
    }
}
