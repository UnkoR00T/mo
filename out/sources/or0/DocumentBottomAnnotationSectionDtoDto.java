package or0;

import java.util.List;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: or0.n, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0019"}, d2 = {"Lor0/n;", "", "", "Lor0/b0;", AnnotatedPrivateKey.LABEL, "linkLabel", "", "linkUrl", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "c", "Ljava/lang/String;", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentBottomAnnotationSectionDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c(AnnotatedPrivateKey.LABEL)
    private final List<DocumentSchemaLabelDto> label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("linkLabel")
    private final List<DocumentSchemaLabelDto> linkLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("linkUrl")
    private final String linkUrl;

    public DocumentBottomAnnotationSectionDtoDto() {
        this(null, null, null, 7, null);
    }

    public final List<DocumentSchemaLabelDto> a() {
        return this.label;
    }

    public final List<DocumentSchemaLabelDto> b() {
        return this.linkLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentBottomAnnotationSectionDtoDto)) {
            return false;
        }
        DocumentBottomAnnotationSectionDtoDto documentBottomAnnotationSectionDtoDto = (DocumentBottomAnnotationSectionDtoDto) other;
        return fr.t.c(this.label, documentBottomAnnotationSectionDtoDto.label) && fr.t.c(this.linkLabel, documentBottomAnnotationSectionDtoDto.linkLabel) && fr.t.c(this.linkUrl, documentBottomAnnotationSectionDtoDto.linkUrl);
    }

    public int hashCode() {
        List<DocumentSchemaLabelDto> list = this.label;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<DocumentSchemaLabelDto> list2 = this.linkLabel;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.linkUrl;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "DocumentBottomAnnotationSectionDtoDto(label=" + this.label + ", linkLabel=" + this.linkLabel + ", linkUrl=" + this.linkUrl + ')';
    }

    public DocumentBottomAnnotationSectionDtoDto(List<DocumentSchemaLabelDto> list, List<DocumentSchemaLabelDto> list2, String str) {
        this.label = list;
        this.linkLabel = list2;
        this.linkUrl = str;
    }

    public /* synthetic */ DocumentBottomAnnotationSectionDtoDto(List list, List list2, String str, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : list, (i15 & 2) != 0 ? null : list2, (i15 & 4) != 0 ? null : str);
    }
}
