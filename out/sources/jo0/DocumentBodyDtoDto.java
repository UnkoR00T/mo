package jo0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.i0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Ljo0/i0;", "", "Ljo0/m;", "applicationType", "", "title", "Ljo0/a;", "additionalInformation", "", "Ljo0/p0;", "attachments", "text", "<init>", "(Ljo0/m;Ljava/lang/String;Ljo0/a;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljo0/m;", "getApplicationType", "()Ljo0/m;", "b", "Ljava/lang/String;", "getTitle", "c", "Ljo0/a;", "getAdditionalInformation", "()Ljo0/a;", "d", "Ljava/util/List;", "getAttachments", "()Ljava/util/List;", "e", "getText", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentBodyDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("applicationType")
    private final ApplicationTypeDtoDto applicationType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("title")
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("additionalInformation")
    private final AdditionalInformationDtoDto additionalInformation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("attachments")
    private final List<EpuapAttachmentDtoDto> attachments;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("text")
    private final String text;

    public DocumentBodyDtoDto(ApplicationTypeDtoDto applicationTypeDtoDto, String str, AdditionalInformationDtoDto additionalInformationDtoDto, List<EpuapAttachmentDtoDto> list, String str2) {
        this.applicationType = applicationTypeDtoDto;
        this.title = str;
        this.additionalInformation = additionalInformationDtoDto;
        this.attachments = list;
        this.text = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentBodyDtoDto)) {
            return false;
        }
        DocumentBodyDtoDto documentBodyDtoDto = (DocumentBodyDtoDto) other;
        return fr.t.c(this.applicationType, documentBodyDtoDto.applicationType) && fr.t.c(this.title, documentBodyDtoDto.title) && fr.t.c(this.additionalInformation, documentBodyDtoDto.additionalInformation) && fr.t.c(this.attachments, documentBodyDtoDto.attachments) && fr.t.c(this.text, documentBodyDtoDto.text);
    }

    public int hashCode() {
        int iHashCode = ((this.applicationType.hashCode() * 31) + this.title.hashCode()) * 31;
        AdditionalInformationDtoDto additionalInformationDtoDto = this.additionalInformation;
        int iHashCode2 = (iHashCode + (additionalInformationDtoDto == null ? 0 : additionalInformationDtoDto.hashCode())) * 31;
        List<EpuapAttachmentDtoDto> list = this.attachments;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.text;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "DocumentBodyDtoDto(applicationType=" + this.applicationType + ", title=" + this.title + ", additionalInformation=" + this.additionalInformation + ", attachments=" + this.attachments + ", text=" + this.text + ')';
    }
}
