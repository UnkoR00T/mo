package or0;

import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: or0.x, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010!R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010!R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b)\u00106R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b,\u00106R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u00105\u001a\u0004\b0\u00106R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b2\u0010:R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b4\u0010=R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u00105\u001a\u0004\b7\u00106R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b8\u0010!R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b;\u00106R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010@\u001a\u0004\b>\u0010AR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010B\u001a\u0004\b?\u0010CR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bD\u0010FR\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u00105\u001a\u0004\bH\u00106¨\u0006I"}, d2 = {"Lor0/x;", "", "", "documentName", "Lor0/c1;", "picture", "schemaId", "schemaVersion", "", "Lor0/t;", "actionAttributes", "Lor0/u;", "additionalAttributes", "Lor0/c0;", "additionalAttributesName", "Lor0/j;", "barcode", "Lor0/m;", "bottomAnnotation", "commonAttributes", "documentPeselFieldReference", "Lor0/a0;", "forwardAttributes", "Lor0/b1;", "multiDocumentView", "Lor0/d1;", "qrCode", "Lor0/k0;", "topAnnotation", "translatedDocumentName", "<init>", "(Ljava/lang/String;Lor0/c1;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lor0/j;Lor0/m;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lor0/b1;Lor0/d1;Lor0/k0;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "Lor0/c1;", "k", "()Lor0/c1;", "c", "m", "d", "n", "e", "Ljava/util/List;", "()Ljava/util/List;", "f", "h", "Lor0/j;", "()Lor0/j;", "i", "Lor0/m;", "()Lor0/m;", "j", "l", "Lor0/b1;", "()Lor0/b1;", "Lor0/d1;", "()Lor0/d1;", "o", "Lor0/k0;", "()Lor0/k0;", "p", "getTranslatedDocumentName", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentSchemaDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentName")
    private final String documentName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("picture")
    private final PictureSchemaDtoDto picture;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("schemaId")
    private final String schemaId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("schemaVersion")
    private final String schemaVersion;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("actionAttributes")
    private final List<DocumentSchemaActionAttributeDtoDto> actionAttributes;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("additionalAttributes")
    private final List<DocumentSchemaAttributeDtoDto> additionalAttributes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("additionalAttributesName")
    private final List<DocumentSchemaLabelDtoDto> additionalAttributesName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("barcode")
    private final BarcodeSchemaDtoDto barcode;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("bottomAnnotation")
    private final DocumentBottomAnnotationDtoDto bottomAnnotation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("commonAttributes")
    private final List<DocumentSchemaAttributeDtoDto> commonAttributes;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentPeselFieldReference")
    private final String documentPeselFieldReference;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("forwardAttributes")
    private final List<DocumentSchemaForwardAttributeDtoDto> forwardAttributes;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("multiDocumentView")
    private final MultiDocumentViewDtoDto multiDocumentView;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("qrCode")
    private final QrCodeSchemaDtoDto qrCode;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("topAnnotation")
    private final DocumentTopAnnotationDtoDto topAnnotation;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("translatedDocumentName")
    private final List<DocumentSchemaLabelDtoDto> translatedDocumentName;

    public DocumentSchemaDtoDto(String str, PictureSchemaDtoDto c1Var, String str2, String str3, List<DocumentSchemaActionAttributeDtoDto> list, List<DocumentSchemaAttributeDtoDto> list2, List<DocumentSchemaLabelDtoDto> list3, BarcodeSchemaDtoDto barcodeSchemaDtoDto, DocumentBottomAnnotationDtoDto documentBottomAnnotationDtoDto, List<DocumentSchemaAttributeDtoDto> list4, String str4, List<DocumentSchemaForwardAttributeDtoDto> list5, MultiDocumentViewDtoDto b1Var, QrCodeSchemaDtoDto qrCodeSchemaDtoDto, DocumentTopAnnotationDtoDto k0Var, List<DocumentSchemaLabelDtoDto> list6) {
        this.documentName = str;
        this.picture = c1Var;
        this.schemaId = str2;
        this.schemaVersion = str3;
        this.actionAttributes = list;
        this.additionalAttributes = list2;
        this.additionalAttributesName = list3;
        this.barcode = barcodeSchemaDtoDto;
        this.bottomAnnotation = documentBottomAnnotationDtoDto;
        this.commonAttributes = list4;
        this.documentPeselFieldReference = str4;
        this.forwardAttributes = list5;
        this.multiDocumentView = b1Var;
        this.qrCode = qrCodeSchemaDtoDto;
        this.topAnnotation = k0Var;
        this.translatedDocumentName = list6;
    }

    public final List<DocumentSchemaActionAttributeDtoDto> a() {
        return this.actionAttributes;
    }

    public final List<DocumentSchemaAttributeDtoDto> b() {
        return this.additionalAttributes;
    }

    public final List<DocumentSchemaLabelDtoDto> c() {
        return this.additionalAttributesName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BarcodeSchemaDtoDto getBarcode() {
        return this.barcode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final DocumentBottomAnnotationDtoDto getBottomAnnotation() {
        return this.bottomAnnotation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentSchemaDtoDto)) {
            return false;
        }
        DocumentSchemaDtoDto documentSchemaDtoDto = (DocumentSchemaDtoDto) other;
        return fr.t.c(this.documentName, documentSchemaDtoDto.documentName) && fr.t.c(this.picture, documentSchemaDtoDto.picture) && fr.t.c(this.schemaId, documentSchemaDtoDto.schemaId) && fr.t.c(this.schemaVersion, documentSchemaDtoDto.schemaVersion) && fr.t.c(this.actionAttributes, documentSchemaDtoDto.actionAttributes) && fr.t.c(this.additionalAttributes, documentSchemaDtoDto.additionalAttributes) && fr.t.c(this.additionalAttributesName, documentSchemaDtoDto.additionalAttributesName) && fr.t.c(this.barcode, documentSchemaDtoDto.barcode) && fr.t.c(this.bottomAnnotation, documentSchemaDtoDto.bottomAnnotation) && fr.t.c(this.commonAttributes, documentSchemaDtoDto.commonAttributes) && fr.t.c(this.documentPeselFieldReference, documentSchemaDtoDto.documentPeselFieldReference) && fr.t.c(this.forwardAttributes, documentSchemaDtoDto.forwardAttributes) && fr.t.c(this.multiDocumentView, documentSchemaDtoDto.multiDocumentView) && fr.t.c(this.qrCode, documentSchemaDtoDto.qrCode) && fr.t.c(this.topAnnotation, documentSchemaDtoDto.topAnnotation) && fr.t.c(this.translatedDocumentName, documentSchemaDtoDto.translatedDocumentName);
    }

    public final List<DocumentSchemaAttributeDtoDto> f() {
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
        int iHashCode = ((((((this.documentName.hashCode() * 31) + this.picture.hashCode()) * 31) + this.schemaId.hashCode()) * 31) + this.schemaVersion.hashCode()) * 31;
        List<DocumentSchemaActionAttributeDtoDto> list = this.actionAttributes;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<DocumentSchemaAttributeDtoDto> list2 = this.additionalAttributes;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<DocumentSchemaLabelDtoDto> list3 = this.additionalAttributesName;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        BarcodeSchemaDtoDto barcodeSchemaDtoDto = this.barcode;
        int iHashCode5 = (iHashCode4 + (barcodeSchemaDtoDto == null ? 0 : barcodeSchemaDtoDto.hashCode())) * 31;
        DocumentBottomAnnotationDtoDto documentBottomAnnotationDtoDto = this.bottomAnnotation;
        int iHashCode6 = (iHashCode5 + (documentBottomAnnotationDtoDto == null ? 0 : documentBottomAnnotationDtoDto.hashCode())) * 31;
        List<DocumentSchemaAttributeDtoDto> list4 = this.commonAttributes;
        int iHashCode7 = (iHashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str = this.documentPeselFieldReference;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        List<DocumentSchemaForwardAttributeDtoDto> list5 = this.forwardAttributes;
        int iHashCode9 = (iHashCode8 + (list5 == null ? 0 : list5.hashCode())) * 31;
        MultiDocumentViewDtoDto b1Var = this.multiDocumentView;
        int iHashCode10 = (iHashCode9 + (b1Var == null ? 0 : b1Var.hashCode())) * 31;
        QrCodeSchemaDtoDto qrCodeSchemaDtoDto = this.qrCode;
        int iHashCode11 = (iHashCode10 + (qrCodeSchemaDtoDto == null ? 0 : qrCodeSchemaDtoDto.hashCode())) * 31;
        DocumentTopAnnotationDtoDto k0Var = this.topAnnotation;
        int iHashCode12 = (iHashCode11 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        List<DocumentSchemaLabelDtoDto> list6 = this.translatedDocumentName;
        return iHashCode12 + (list6 != null ? list6.hashCode() : 0);
    }

    public final List<DocumentSchemaForwardAttributeDtoDto> i() {
        return this.forwardAttributes;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final MultiDocumentViewDtoDto getMultiDocumentView() {
        return this.multiDocumentView;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final PictureSchemaDtoDto getPicture() {
        return this.picture;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final QrCodeSchemaDtoDto getQrCode() {
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
    public final DocumentTopAnnotationDtoDto getTopAnnotation() {
        return this.topAnnotation;
    }

    public String toString() {
        return "DocumentSchemaDtoDto(documentName=" + this.documentName + ", picture=" + this.picture + ", schemaId=" + this.schemaId + ", schemaVersion=" + this.schemaVersion + ", actionAttributes=" + this.actionAttributes + ", additionalAttributes=" + this.additionalAttributes + ", additionalAttributesName=" + this.additionalAttributesName + ", barcode=" + this.barcode + ", bottomAnnotation=" + this.bottomAnnotation + ", commonAttributes=" + this.commonAttributes + ", documentPeselFieldReference=" + this.documentPeselFieldReference + ", forwardAttributes=" + this.forwardAttributes + ", multiDocumentView=" + this.multiDocumentView + ", qrCode=" + this.qrCode + ", topAnnotation=" + this.topAnnotation + ", translatedDocumentName=" + this.translatedDocumentName + ')';
    }

    public /* synthetic */ DocumentSchemaDtoDto(String str, PictureSchemaDtoDto c1Var, String str2, String str3, List list, List list2, List list3, BarcodeSchemaDtoDto barcodeSchemaDtoDto, DocumentBottomAnnotationDtoDto documentBottomAnnotationDtoDto, List list4, String str4, List list5, MultiDocumentViewDtoDto b1Var, QrCodeSchemaDtoDto qrCodeSchemaDtoDto, DocumentTopAnnotationDtoDto k0Var, List list6, int i15, fr.k kVar) {
        this(str, c1Var, str2, str3, (i15 & 16) != 0 ? null : list, (i15 & 32) != 0 ? null : list2, (i15 & 64) != 0 ? null : list3, (i15 & 128) != 0 ? null : barcodeSchemaDtoDto, (i15 & 256) != 0 ? null : documentBottomAnnotationDtoDto, (i15 & 512) != 0 ? null : list4, (i15 & 1024) != 0 ? null : str4, (i15 & 2048) != 0 ? null : list5, (i15 & PKIFailureInfo.certConfirmed) != 0 ? null : b1Var, (i15 & PKIFailureInfo.certRevoked) != 0 ? null : qrCodeSchemaDtoDto, (i15 & 16384) != 0 ? null : k0Var, (i15 & 32768) != 0 ? null : list6);
    }
}
