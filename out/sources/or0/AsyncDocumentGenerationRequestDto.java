package or0;

import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: or0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"Lor0/b;", "", "", "Lor0/m0;", "documentTypesToGenerate", "Lor0/n0;", "documentsToGenerate", "<init>", "(Ljava/util/Set;Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "getDocumentTypesToGenerate", "()Ljava/util/Set;", "getDocumentTypesToGenerate$annotations", "()V", "b", "getDocumentsToGenerate", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsyncDocumentGenerationRequestDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentTypesToGenerate")
    private final Set<m0> documentTypesToGenerate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentsToGenerate")
    private final Set<DocumentTypeWithSubtypeDtoDto> documentsToGenerate;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncDocumentGenerationRequestDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsyncDocumentGenerationRequestDto)) {
            return false;
        }
        AsyncDocumentGenerationRequestDto asyncDocumentGenerationRequestDto = (AsyncDocumentGenerationRequestDto) other;
        return fr.t.c(this.documentTypesToGenerate, asyncDocumentGenerationRequestDto.documentTypesToGenerate) && fr.t.c(this.documentsToGenerate, asyncDocumentGenerationRequestDto.documentsToGenerate);
    }

    public int hashCode() {
        Set<m0> set = this.documentTypesToGenerate;
        int iHashCode = (set == null ? 0 : set.hashCode()) * 31;
        Set<DocumentTypeWithSubtypeDtoDto> set2 = this.documentsToGenerate;
        return iHashCode + (set2 != null ? set2.hashCode() : 0);
    }

    public String toString() {
        return "AsyncDocumentGenerationRequestDto(documentTypesToGenerate=" + this.documentTypesToGenerate + ", documentsToGenerate=" + this.documentsToGenerate + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncDocumentGenerationRequestDto(Set<? extends m0> set, Set<DocumentTypeWithSubtypeDtoDto> set2) {
        this.documentTypesToGenerate = set;
        this.documentsToGenerate = set2;
    }

    public /* synthetic */ AsyncDocumentGenerationRequestDto(Set set, Set set2, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : set, (i15 & 2) != 0 ? null : set2);
    }
}
