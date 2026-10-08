package gm0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.c0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lgm0/c0;", "", "Lgm0/e0;", "addressType", "Lgm0/d0;", "addressDetailsData", "Ljava/time/LocalDate;", "temporaryAddressDateEnd", "<init>", "(Lgm0/e0;Lgm0/d0;Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgm0/e0;", "getAddressType", "()Lgm0/e0;", "b", "Lgm0/d0;", "getAddressDetailsData", "()Lgm0/d0;", "c", "Ljava/time/LocalDate;", "getTemporaryAddressDateEnd", "()Ljava/time/LocalDate;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildBirthRegistrationGenerateXmlChildAddress {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("addressType")
    private final e0 addressType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("addressDetailsData")
    private final ChildBirthRegistrationGenerateXmlChildAddressDetailsData addressDetailsData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("temporaryAddressDateEnd")
    private final LocalDate temporaryAddressDateEnd;

    public ChildBirthRegistrationGenerateXmlChildAddress(e0 e0Var, ChildBirthRegistrationGenerateXmlChildAddressDetailsData childBirthRegistrationGenerateXmlChildAddressDetailsData, LocalDate localDate) {
        this.addressType = e0Var;
        this.addressDetailsData = childBirthRegistrationGenerateXmlChildAddressDetailsData;
        this.temporaryAddressDateEnd = localDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildBirthRegistrationGenerateXmlChildAddress)) {
            return false;
        }
        ChildBirthRegistrationGenerateXmlChildAddress childBirthRegistrationGenerateXmlChildAddress = (ChildBirthRegistrationGenerateXmlChildAddress) other;
        return this.addressType == childBirthRegistrationGenerateXmlChildAddress.addressType && fr.t.c(this.addressDetailsData, childBirthRegistrationGenerateXmlChildAddress.addressDetailsData) && fr.t.c(this.temporaryAddressDateEnd, childBirthRegistrationGenerateXmlChildAddress.temporaryAddressDateEnd);
    }

    public int hashCode() {
        int iHashCode = this.addressType.hashCode() * 31;
        ChildBirthRegistrationGenerateXmlChildAddressDetailsData childBirthRegistrationGenerateXmlChildAddressDetailsData = this.addressDetailsData;
        int iHashCode2 = (iHashCode + (childBirthRegistrationGenerateXmlChildAddressDetailsData == null ? 0 : childBirthRegistrationGenerateXmlChildAddressDetailsData.hashCode())) * 31;
        LocalDate localDate = this.temporaryAddressDateEnd;
        return iHashCode2 + (localDate != null ? localDate.hashCode() : 0);
    }

    public String toString() {
        return "ChildBirthRegistrationGenerateXmlChildAddress(addressType=" + this.addressType + ", addressDetailsData=" + this.addressDetailsData + ", temporaryAddressDateEnd=" + this.temporaryAddressDateEnd + ')';
    }

    public /* synthetic */ ChildBirthRegistrationGenerateXmlChildAddress(e0 e0Var, ChildBirthRegistrationGenerateXmlChildAddressDetailsData childBirthRegistrationGenerateXmlChildAddressDetailsData, LocalDate localDate, int i15, fr.k kVar) {
        this(e0Var, (i15 & 2) != 0 ? null : childBirthRegistrationGenerateXmlChildAddressDetailsData, (i15 & 4) != 0 ? null : localDate);
    }
}
