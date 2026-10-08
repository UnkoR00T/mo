package nj0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: nj0.c0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lnj0/c0;", "", "", "caseContentDescription", "Lnj0/o;", "document", "statusDescription", "<init>", "(Ljava/lang/String;Lnj0/o;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lnj0/o;", "()Lnj0/o;", "c", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MyCaseAdditionalDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("caseContentDescription")
    private final String caseContentDescription;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("document")
    private final DocumentDto document;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("statusDescription")
    private final String statusDescription;

    public MyCaseAdditionalDataDto() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCaseContentDescription() {
        return this.caseContentDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DocumentDto getDocument() {
        return this.document;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getStatusDescription() {
        return this.statusDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyCaseAdditionalDataDto)) {
            return false;
        }
        MyCaseAdditionalDataDto myCaseAdditionalDataDto = (MyCaseAdditionalDataDto) other;
        return fr.t.c(this.caseContentDescription, myCaseAdditionalDataDto.caseContentDescription) && fr.t.c(this.document, myCaseAdditionalDataDto.document) && fr.t.c(this.statusDescription, myCaseAdditionalDataDto.statusDescription);
    }

    public int hashCode() {
        String str = this.caseContentDescription;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DocumentDto documentDto = this.document;
        int iHashCode2 = (iHashCode + (documentDto == null ? 0 : documentDto.hashCode())) * 31;
        String str2 = this.statusDescription;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "MyCaseAdditionalDataDto(caseContentDescription=" + this.caseContentDescription + ", document=" + this.document + ", statusDescription=" + this.statusDescription + ')';
    }

    public MyCaseAdditionalDataDto(String str, DocumentDto documentDto, String str2) {
        this.caseContentDescription = str;
        this.document = documentDto;
        this.statusDescription = str2;
    }

    public /* synthetic */ MyCaseAdditionalDataDto(String str, DocumentDto documentDto, String str2, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : documentDto, (i15 & 4) != 0 ? null : str2);
    }
}
