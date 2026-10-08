package o24;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: o24.h0, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lo24/h0;", "", "Lo24/u;", "leftTab", "rightTab", "Lo24/a1;", "verificationSelector", "<init>", "(Lo24/u;Lo24/u;Lo24/a1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo24/u;", "()Lo24/u;", "b", "c", "Lo24/a1;", "()Lo24/a1;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultiDocumentSchemaDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("leftTab")
    private final DocumentsGroupDto leftTab;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("rightTab")
    private final DocumentsGroupDto rightTab;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("verificationSelector")
    private final VerificationSelectorDto verificationSelector;

    public MultiDocumentSchemaDto() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DocumentsGroupDto getLeftTab() {
        return this.leftTab;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DocumentsGroupDto getRightTab() {
        return this.rightTab;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final VerificationSelectorDto getVerificationSelector() {
        return this.verificationSelector;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiDocumentSchemaDto)) {
            return false;
        }
        MultiDocumentSchemaDto multiDocumentSchemaDto = (MultiDocumentSchemaDto) other;
        return fr.t.c(this.leftTab, multiDocumentSchemaDto.leftTab) && fr.t.c(this.rightTab, multiDocumentSchemaDto.rightTab) && fr.t.c(this.verificationSelector, multiDocumentSchemaDto.verificationSelector);
    }

    public int hashCode() {
        DocumentsGroupDto documentsGroupDto = this.leftTab;
        int iHashCode = (documentsGroupDto == null ? 0 : documentsGroupDto.hashCode()) * 31;
        DocumentsGroupDto documentsGroupDto2 = this.rightTab;
        int iHashCode2 = (iHashCode + (documentsGroupDto2 == null ? 0 : documentsGroupDto2.hashCode())) * 31;
        VerificationSelectorDto verificationSelectorDto = this.verificationSelector;
        return iHashCode2 + (verificationSelectorDto != null ? verificationSelectorDto.hashCode() : 0);
    }

    public String toString() {
        return "MultiDocumentSchemaDto(leftTab=" + this.leftTab + ", rightTab=" + this.rightTab + ", verificationSelector=" + this.verificationSelector + ')';
    }

    public MultiDocumentSchemaDto(DocumentsGroupDto documentsGroupDto, DocumentsGroupDto documentsGroupDto2, VerificationSelectorDto verificationSelectorDto) {
        this.leftTab = documentsGroupDto;
        this.rightTab = documentsGroupDto2;
        this.verificationSelector = verificationSelectorDto;
    }

    public /* synthetic */ MultiDocumentSchemaDto(DocumentsGroupDto documentsGroupDto, DocumentsGroupDto documentsGroupDto2, VerificationSelectorDto verificationSelectorDto, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : documentsGroupDto, (i15 & 2) != 0 ? null : documentsGroupDto2, (i15 & 4) != 0 ? null : verificationSelectorDto);
    }
}
