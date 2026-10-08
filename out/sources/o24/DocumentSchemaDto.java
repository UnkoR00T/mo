package o24;

import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: o24.k, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010!R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010!R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010*\u001a\u0004\b9\u0010!R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00105\u001a\u0004\b:\u00107R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b0\u0010CR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00105\u001a\u0004\b8\u00107R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b.\u00107R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u00105\u001a\u0004\b,\u00107R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u00105\u001a\u0004\b)\u00107R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010D\u001a\u0004\b4\u0010ER\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bA\u0010H¨\u0006I"}, d2 = {"Lo24/k;", "", "", "schemaId", "schemaVersion", "documentName", "Lo24/v0;", "picture", "", "Lo24/p;", "translatedDocumentName", "documentPeselFieldReference", "Lo24/n;", "forwardAttributes", "Lo24/s;", "topAnnotation", "Lo24/w0;", "qrCode", "Lo24/b;", "barcode", "Lo24/h;", "commonAttributes", "additionalAttributesName", "additionalAttributes", "Lo24/g;", "actionAttributes", "Lo24/d;", "bottomAnnotation", "Lo24/j0;", "multiDocumentView", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo24/v0;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lo24/s;Lo24/w0;Lo24/b;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lo24/d;Lo24/j0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "m", "b", "n", "c", "g", "d", "Lo24/v0;", "k", "()Lo24/v0;", "e", "Ljava/util/List;", "getTranslatedDocumentName", "()Ljava/util/List;", "f", "h", "i", "Lo24/s;", "o", "()Lo24/s;", "Lo24/w0;", "l", "()Lo24/w0;", "j", "Lo24/b;", "()Lo24/b;", "Lo24/d;", "()Lo24/d;", "p", "Lo24/j0;", "()Lo24/j0;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentSchemaDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("schemaId")
    private final String schemaId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("schemaVersion")
    private final String schemaVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentName")
    private final String documentName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("picture")
    private final PictureSchemaDto picture;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("translatedDocumentName")
    private final List<DocumentSchemaLabelDto> translatedDocumentName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentPeselFieldReference")
    private final String documentPeselFieldReference;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("forwardAttributes")
    private final List<DocumentSchemaForwardAttributeDto> forwardAttributes;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("topAnnotation")
    private final DocumentTopAnnotationDto topAnnotation;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("qrCode")
    private final QrCodeSchemaDto qrCode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("barcode")
    private final BarcodeSchemaDto barcode;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("commonAttributes")
    private final List<DocumentSchemaAttributeDto> commonAttributes;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("additionalAttributesName")
    private final List<DocumentSchemaLabelDto> additionalAttributesName;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("additionalAttributes")
    private final List<DocumentSchemaAttributeDto> additionalAttributes;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("actionAttributes")
    private final List<DocumentSchemaActionAttributeDto> actionAttributes;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("bottomAnnotation")
    private final DocumentBottomAnnotationDto bottomAnnotation;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("multiDocumentView")
    private final MultiDocumentViewDto multiDocumentView;

    public DocumentSchemaDto(String str, String str2, String str3, PictureSchemaDto pictureSchemaDto, List<DocumentSchemaLabelDto> list, String str4, List<DocumentSchemaForwardAttributeDto> list2, DocumentTopAnnotationDto documentTopAnnotationDto, QrCodeSchemaDto qrCodeSchemaDto, BarcodeSchemaDto barcodeSchemaDto, List<DocumentSchemaAttributeDto> list3, List<DocumentSchemaLabelDto> list4, List<DocumentSchemaAttributeDto> list5, List<DocumentSchemaActionAttributeDto> list6, DocumentBottomAnnotationDto documentBottomAnnotationDto, MultiDocumentViewDto multiDocumentViewDto) {
        this.schemaId = str;
        this.schemaVersion = str2;
        this.documentName = str3;
        this.picture = pictureSchemaDto;
        this.translatedDocumentName = list;
        this.documentPeselFieldReference = str4;
        this.forwardAttributes = list2;
        this.topAnnotation = documentTopAnnotationDto;
        this.qrCode = qrCodeSchemaDto;
        this.barcode = barcodeSchemaDto;
        this.commonAttributes = list3;
        this.additionalAttributesName = list4;
        this.additionalAttributes = list5;
        this.actionAttributes = list6;
        this.bottomAnnotation = documentBottomAnnotationDto;
        this.multiDocumentView = multiDocumentViewDto;
    }

    public final List<DocumentSchemaActionAttributeDto> a() {
        return this.actionAttributes;
    }

    public final List<DocumentSchemaAttributeDto> b() {
        return this.additionalAttributes;
    }

    public final List<DocumentSchemaLabelDto> c() {
        return this.additionalAttributesName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BarcodeSchemaDto getBarcode() {
        return this.barcode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final DocumentBottomAnnotationDto getBottomAnnotation() {
        return this.bottomAnnotation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentSchemaDto)) {
            return false;
        }
        DocumentSchemaDto documentSchemaDto = (DocumentSchemaDto) other;
        return fr.t.c(this.schemaId, documentSchemaDto.schemaId) && fr.t.c(this.schemaVersion, documentSchemaDto.schemaVersion) && fr.t.c(this.documentName, documentSchemaDto.documentName) && fr.t.c(this.picture, documentSchemaDto.picture) && fr.t.c(this.translatedDocumentName, documentSchemaDto.translatedDocumentName) && fr.t.c(this.documentPeselFieldReference, documentSchemaDto.documentPeselFieldReference) && fr.t.c(this.forwardAttributes, documentSchemaDto.forwardAttributes) && fr.t.c(this.topAnnotation, documentSchemaDto.topAnnotation) && fr.t.c(this.qrCode, documentSchemaDto.qrCode) && fr.t.c(this.barcode, documentSchemaDto.barcode) && fr.t.c(this.commonAttributes, documentSchemaDto.commonAttributes) && fr.t.c(this.additionalAttributesName, documentSchemaDto.additionalAttributesName) && fr.t.c(this.additionalAttributes, documentSchemaDto.additionalAttributes) && fr.t.c(this.actionAttributes, documentSchemaDto.actionAttributes) && fr.t.c(this.bottomAnnotation, documentSchemaDto.bottomAnnotation) && fr.t.c(this.multiDocumentView, documentSchemaDto.multiDocumentView);
    }

    public final List<DocumentSchemaAttributeDto> f() {
        return this.commonAttributes;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDocumentName() {
        return this.documentName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getDocumentPeselFieldReference() {
        return this.documentPeselFieldReference;
    }

    public int hashCode() {
        int iHashCode = ((((((this.schemaId.hashCode() * 31) + this.schemaVersion.hashCode()) * 31) + this.documentName.hashCode()) * 31) + this.picture.hashCode()) * 31;
        List<DocumentSchemaLabelDto> list = this.translatedDocumentName;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.documentPeselFieldReference;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<DocumentSchemaForwardAttributeDto> list2 = this.forwardAttributes;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        DocumentTopAnnotationDto documentTopAnnotationDto = this.topAnnotation;
        int iHashCode5 = (iHashCode4 + (documentTopAnnotationDto == null ? 0 : documentTopAnnotationDto.hashCode())) * 31;
        QrCodeSchemaDto qrCodeSchemaDto = this.qrCode;
        int iHashCode6 = (iHashCode5 + (qrCodeSchemaDto == null ? 0 : qrCodeSchemaDto.hashCode())) * 31;
        BarcodeSchemaDto barcodeSchemaDto = this.barcode;
        int iHashCode7 = (iHashCode6 + (barcodeSchemaDto == null ? 0 : barcodeSchemaDto.hashCode())) * 31;
        List<DocumentSchemaAttributeDto> list3 = this.commonAttributes;
        int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<DocumentSchemaLabelDto> list4 = this.additionalAttributesName;
        int iHashCode9 = (iHashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<DocumentSchemaAttributeDto> list5 = this.additionalAttributes;
        int iHashCode10 = (iHashCode9 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<DocumentSchemaActionAttributeDto> list6 = this.actionAttributes;
        int iHashCode11 = (iHashCode10 + (list6 == null ? 0 : list6.hashCode())) * 31;
        DocumentBottomAnnotationDto documentBottomAnnotationDto = this.bottomAnnotation;
        int iHashCode12 = (iHashCode11 + (documentBottomAnnotationDto == null ? 0 : documentBottomAnnotationDto.hashCode())) * 31;
        MultiDocumentViewDto multiDocumentViewDto = this.multiDocumentView;
        return iHashCode12 + (multiDocumentViewDto != null ? multiDocumentViewDto.hashCode() : 0);
    }

    public final List<DocumentSchemaForwardAttributeDto> i() {
        return this.forwardAttributes;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final MultiDocumentViewDto getMultiDocumentView() {
        return this.multiDocumentView;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final PictureSchemaDto getPicture() {
        return this.picture;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final QrCodeSchemaDto getQrCode() {
        return this.qrCode;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getSchemaId() {
        return this.schemaId;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getSchemaVersion() {
        return this.schemaVersion;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final DocumentTopAnnotationDto getTopAnnotation() {
        return this.topAnnotation;
    }

    public String toString() {
        return "DocumentSchemaDto(schemaId=" + this.schemaId + ", schemaVersion=" + this.schemaVersion + ", documentName=" + this.documentName + ", picture=" + this.picture + ", translatedDocumentName=" + this.translatedDocumentName + ", documentPeselFieldReference=" + this.documentPeselFieldReference + ", forwardAttributes=" + this.forwardAttributes + ", topAnnotation=" + this.topAnnotation + ", qrCode=" + this.qrCode + ", barcode=" + this.barcode + ", commonAttributes=" + this.commonAttributes + ", additionalAttributesName=" + this.additionalAttributesName + ", additionalAttributes=" + this.additionalAttributes + ", actionAttributes=" + this.actionAttributes + ", bottomAnnotation=" + this.bottomAnnotation + ", multiDocumentView=" + this.multiDocumentView + ')';
    }

    public /* synthetic */ DocumentSchemaDto(String str, String str2, String str3, PictureSchemaDto pictureSchemaDto, List list, String str4, List list2, DocumentTopAnnotationDto documentTopAnnotationDto, QrCodeSchemaDto qrCodeSchemaDto, BarcodeSchemaDto barcodeSchemaDto, List list3, List list4, List list5, List list6, DocumentBottomAnnotationDto documentBottomAnnotationDto, MultiDocumentViewDto multiDocumentViewDto, int i15, fr.k kVar) {
        this(str, str2, str3, pictureSchemaDto, (i15 & 16) != 0 ? null : list, (i15 & 32) != 0 ? null : str4, (i15 & 64) != 0 ? null : list2, (i15 & 128) != 0 ? null : documentTopAnnotationDto, (i15 & 256) != 0 ? null : qrCodeSchemaDto, (i15 & 512) != 0 ? null : barcodeSchemaDto, (i15 & 1024) != 0 ? null : list3, (i15 & 2048) != 0 ? null : list4, (i15 & PKIFailureInfo.certConfirmed) != 0 ? null : list5, (i15 & PKIFailureInfo.certRevoked) != 0 ? null : list6, (i15 & 16384) != 0 ? null : documentBottomAnnotationDto, (i15 & 32768) != 0 ? null : multiDocumentViewDto);
    }
}
