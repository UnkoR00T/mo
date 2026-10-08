package or0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: or0.z0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lor0/z0;", "", "Lor0/o0;", "leftTab", "rightTab", "Lor0/g1;", "verificationSelector", "<init>", "(Lor0/o0;Lor0/o0;Lor0/g1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lor0/o0;", "()Lor0/o0;", "b", "c", "Lor0/g1;", "()Lor0/g1;", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultiDocumentSchemaDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("leftTab")
    private final DocumentsGroupDtoDto leftTab;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("rightTab")
    private final DocumentsGroupDtoDto rightTab;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("verificationSelector")
    private final VerificationSelectorDtoDto verificationSelector;

    public MultiDocumentSchemaDtoDto() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DocumentsGroupDtoDto getLeftTab() {
        return this.leftTab;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DocumentsGroupDtoDto getRightTab() {
        return this.rightTab;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final VerificationSelectorDtoDto getVerificationSelector() {
        return this.verificationSelector;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiDocumentSchemaDtoDto)) {
            return false;
        }
        MultiDocumentSchemaDtoDto multiDocumentSchemaDtoDto = (MultiDocumentSchemaDtoDto) other;
        return fr.t.c(this.leftTab, multiDocumentSchemaDtoDto.leftTab) && fr.t.c(this.rightTab, multiDocumentSchemaDtoDto.rightTab) && fr.t.c(this.verificationSelector, multiDocumentSchemaDtoDto.verificationSelector);
    }

    public int hashCode() {
        DocumentsGroupDtoDto documentsGroupDtoDto = this.leftTab;
        int iHashCode = (documentsGroupDtoDto == null ? 0 : documentsGroupDtoDto.hashCode()) * 31;
        DocumentsGroupDtoDto documentsGroupDtoDto2 = this.rightTab;
        int iHashCode2 = (iHashCode + (documentsGroupDtoDto2 == null ? 0 : documentsGroupDtoDto2.hashCode())) * 31;
        VerificationSelectorDtoDto verificationSelectorDtoDto = this.verificationSelector;
        return iHashCode2 + (verificationSelectorDtoDto != null ? verificationSelectorDtoDto.hashCode() : 0);
    }

    public String toString() {
        return "MultiDocumentSchemaDtoDto(leftTab=" + this.leftTab + ", rightTab=" + this.rightTab + ", verificationSelector=" + this.verificationSelector + ')';
    }

    public MultiDocumentSchemaDtoDto(DocumentsGroupDtoDto documentsGroupDtoDto, DocumentsGroupDtoDto documentsGroupDtoDto2, VerificationSelectorDtoDto verificationSelectorDtoDto) {
        this.leftTab = documentsGroupDtoDto;
        this.rightTab = documentsGroupDtoDto2;
        this.verificationSelector = verificationSelectorDtoDto;
    }

    public /* synthetic */ MultiDocumentSchemaDtoDto(DocumentsGroupDtoDto documentsGroupDtoDto, DocumentsGroupDtoDto documentsGroupDtoDto2, VerificationSelectorDtoDto verificationSelectorDtoDto, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : documentsGroupDtoDto, (i15 & 2) != 0 ? null : documentsGroupDtoDto2, (i15 & 4) != 0 ? null : verificationSelectorDtoDto);
    }
}
