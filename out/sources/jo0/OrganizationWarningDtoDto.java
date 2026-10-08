package jo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.g1, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Ljo0/g1;", "", "", "warningMessage", "Ljo0/b2;", "warningType", "<init>", "(Ljava/lang/String;Ljo0/b2;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljo0/b2;", "()Ljo0/b2;", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrganizationWarningDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("warningMessage")
    private final String warningMessage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("warningType")
    private final b2 warningType;

    /* JADX WARN: Multi-variable type inference failed */
    public OrganizationWarningDtoDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getWarningMessage() {
        return this.warningMessage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b2 getWarningType() {
        return this.warningType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrganizationWarningDtoDto)) {
            return false;
        }
        OrganizationWarningDtoDto organizationWarningDtoDto = (OrganizationWarningDtoDto) other;
        return fr.t.c(this.warningMessage, organizationWarningDtoDto.warningMessage) && this.warningType == organizationWarningDtoDto.warningType;
    }

    public int hashCode() {
        String str = this.warningMessage;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        b2 b2Var = this.warningType;
        return iHashCode + (b2Var != null ? b2Var.hashCode() : 0);
    }

    public String toString() {
        return "OrganizationWarningDtoDto(warningMessage=" + this.warningMessage + ", warningType=" + this.warningType + ')';
    }

    public OrganizationWarningDtoDto(String str, b2 b2Var) {
        this.warningMessage = str;
        this.warningType = b2Var;
    }

    public /* synthetic */ OrganizationWarningDtoDto(String str, b2 b2Var, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : b2Var);
    }
}
