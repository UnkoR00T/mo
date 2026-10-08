package g24;

import h24.MultiDocumentView;
import h24.VerificationSelector;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: g24.h, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\"R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010+\u001a\u0004\b:\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b0\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b:\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b3\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b<\u0010D\u001a\u0004\b1\u0010ER\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bF\u00102\u001a\u0004\b9\u00104R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b/\u00104R\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bB\u00102\u001a\u0004\b-\u00104R\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\b*\u00104R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b.\u0010G\u001a\u0004\b5\u0010HR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b?\u0010I\u001a\u0004\bF\u0010J¨\u0006K"}, d2 = {"Lg24/h;", "", "", "schemaId", "schemaVersion", "documentName", "", "Lg24/m;", "forwardAttributes", "Lg24/t;", "picture", "documentPeselFieldReference", "Lh24/d;", "multiDocumentSelectorForVerification", "Lg24/p;", "topAnnotation", "Lg24/u;", "qrCode", "Lg24/b;", "barcode", "Lg24/i;", "commonAttributes", "Lg24/n;", "additionalAttributesName", "additionalAttributes", "Lg24/c;", "actionAttributes", "Lg24/d;", "bottomAnnotation", "Lh24/c;", "multiDocumentView", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lg24/t;Ljava/lang/String;Lh24/d;Lg24/p;Lg24/u;Lg24/b;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lg24/d;Lh24/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "n", "b", "o", "c", "g", "d", "Ljava/util/List;", "i", "()Ljava/util/List;", "e", "Lg24/t;", "l", "()Lg24/t;", "f", "h", "Lh24/d;", "j", "()Lh24/d;", "Lg24/p;", "p", "()Lg24/p;", "Lg24/u;", "m", "()Lg24/u;", "Lg24/b;", "()Lg24/b;", "k", "Lg24/d;", "()Lg24/d;", "Lh24/c;", "()Lh24/c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentSchema {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String schemaId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String schemaVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentSchemaForwardAttribute> forwardAttributes;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final PictureSchema picture;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentPeselFieldReference;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final VerificationSelector multiDocumentSelectorForVerification;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentTopAnnotation topAnnotation;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final QrCodeSchema qrCode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final BarcodeSchema barcode;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentSchemaAttribute> commonAttributes;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentSchemaLabel> additionalAttributesName;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentSchemaAttribute> additionalAttributes;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentActionAttribute> actionAttributes;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentBottomAnnotation bottomAnnotation;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final MultiDocumentView multiDocumentView;

    public DocumentSchema(String str, String str2, String str3, List<DocumentSchemaForwardAttribute> list, PictureSchema tVar, String str4, VerificationSelector verificationSelector, DocumentTopAnnotation documentTopAnnotation, QrCodeSchema qrCodeSchema, BarcodeSchema barcodeSchema, List<DocumentSchemaAttribute> list2, List<DocumentSchemaLabel> list3, List<DocumentSchemaAttribute> list4, List<DocumentActionAttribute> list5, DocumentBottomAnnotation documentBottomAnnotation, MultiDocumentView multiDocumentView) {
        this.schemaId = str;
        this.schemaVersion = str2;
        this.documentName = str3;
        this.forwardAttributes = list;
        this.picture = tVar;
        this.documentPeselFieldReference = str4;
        this.multiDocumentSelectorForVerification = verificationSelector;
        this.topAnnotation = documentTopAnnotation;
        this.qrCode = qrCodeSchema;
        this.barcode = barcodeSchema;
        this.commonAttributes = list2;
        this.additionalAttributesName = list3;
        this.additionalAttributes = list4;
        this.actionAttributes = list5;
        this.bottomAnnotation = documentBottomAnnotation;
        this.multiDocumentView = multiDocumentView;
    }

    public final List<DocumentActionAttribute> a() {
        return this.actionAttributes;
    }

    public final List<DocumentSchemaAttribute> b() {
        return this.additionalAttributes;
    }

    public final List<DocumentSchemaLabel> c() {
        return this.additionalAttributesName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BarcodeSchema getBarcode() {
        return this.barcode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final DocumentBottomAnnotation getBottomAnnotation() {
        return this.bottomAnnotation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentSchema)) {
            return false;
        }
        DocumentSchema documentSchema = (DocumentSchema) other;
        return fr.t.c(this.schemaId, documentSchema.schemaId) && fr.t.c(this.schemaVersion, documentSchema.schemaVersion) && fr.t.c(this.documentName, documentSchema.documentName) && fr.t.c(this.forwardAttributes, documentSchema.forwardAttributes) && fr.t.c(this.picture, documentSchema.picture) && fr.t.c(this.documentPeselFieldReference, documentSchema.documentPeselFieldReference) && fr.t.c(this.multiDocumentSelectorForVerification, documentSchema.multiDocumentSelectorForVerification) && fr.t.c(this.topAnnotation, documentSchema.topAnnotation) && fr.t.c(this.qrCode, documentSchema.qrCode) && fr.t.c(this.barcode, documentSchema.barcode) && fr.t.c(this.commonAttributes, documentSchema.commonAttributes) && fr.t.c(this.additionalAttributesName, documentSchema.additionalAttributesName) && fr.t.c(this.additionalAttributes, documentSchema.additionalAttributes) && fr.t.c(this.actionAttributes, documentSchema.actionAttributes) && fr.t.c(this.bottomAnnotation, documentSchema.bottomAnnotation) && fr.t.c(this.multiDocumentView, documentSchema.multiDocumentView);
    }

    public final List<DocumentSchemaAttribute> f() {
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
        int iHashCode = ((((this.schemaId.hashCode() * 31) + this.schemaVersion.hashCode()) * 31) + this.documentName.hashCode()) * 31;
        List<DocumentSchemaForwardAttribute> list = this.forwardAttributes;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.picture.hashCode()) * 31;
        String str = this.documentPeselFieldReference;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        VerificationSelector verificationSelector = this.multiDocumentSelectorForVerification;
        int iHashCode4 = (iHashCode3 + (verificationSelector == null ? 0 : verificationSelector.hashCode())) * 31;
        DocumentTopAnnotation documentTopAnnotation = this.topAnnotation;
        int iHashCode5 = (iHashCode4 + (documentTopAnnotation == null ? 0 : documentTopAnnotation.hashCode())) * 31;
        QrCodeSchema qrCodeSchema = this.qrCode;
        int iHashCode6 = (iHashCode5 + (qrCodeSchema == null ? 0 : qrCodeSchema.hashCode())) * 31;
        BarcodeSchema barcodeSchema = this.barcode;
        int iHashCode7 = (iHashCode6 + (barcodeSchema == null ? 0 : barcodeSchema.hashCode())) * 31;
        List<DocumentSchemaAttribute> list2 = this.commonAttributes;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<DocumentSchemaLabel> list3 = this.additionalAttributesName;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<DocumentSchemaAttribute> list4 = this.additionalAttributes;
        int iHashCode10 = (iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<DocumentActionAttribute> list5 = this.actionAttributes;
        int iHashCode11 = (iHashCode10 + (list5 == null ? 0 : list5.hashCode())) * 31;
        DocumentBottomAnnotation documentBottomAnnotation = this.bottomAnnotation;
        int iHashCode12 = (iHashCode11 + (documentBottomAnnotation == null ? 0 : documentBottomAnnotation.hashCode())) * 31;
        MultiDocumentView multiDocumentView = this.multiDocumentView;
        return iHashCode12 + (multiDocumentView != null ? multiDocumentView.hashCode() : 0);
    }

    public final List<DocumentSchemaForwardAttribute> i() {
        return this.forwardAttributes;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final VerificationSelector getMultiDocumentSelectorForVerification() {
        return this.multiDocumentSelectorForVerification;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final MultiDocumentView getMultiDocumentView() {
        return this.multiDocumentView;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final PictureSchema getPicture() {
        return this.picture;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final QrCodeSchema getQrCode() {
        return this.qrCode;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getSchemaId() {
        return this.schemaId;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getSchemaVersion() {
        return this.schemaVersion;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final DocumentTopAnnotation getTopAnnotation() {
        return this.topAnnotation;
    }

    public String toString() {
        return "DocumentSchema(schemaId=" + this.schemaId + ", schemaVersion=" + this.schemaVersion + ", documentName=" + this.documentName + ", forwardAttributes=" + this.forwardAttributes + ", picture=" + this.picture + ", documentPeselFieldReference=" + this.documentPeselFieldReference + ", multiDocumentSelectorForVerification=" + this.multiDocumentSelectorForVerification + ", topAnnotation=" + this.topAnnotation + ", qrCode=" + this.qrCode + ", barcode=" + this.barcode + ", commonAttributes=" + this.commonAttributes + ", additionalAttributesName=" + this.additionalAttributesName + ", additionalAttributes=" + this.additionalAttributes + ", actionAttributes=" + this.actionAttributes + ", bottomAnnotation=" + this.bottomAnnotation + ", multiDocumentView=" + this.multiDocumentView + ")";
    }

    public /* synthetic */ DocumentSchema(String str, String str2, String str3, List list, PictureSchema tVar, String str4, VerificationSelector verificationSelector, DocumentTopAnnotation documentTopAnnotation, QrCodeSchema qrCodeSchema, BarcodeSchema barcodeSchema, List list2, List list3, List list4, List list5, DocumentBottomAnnotation documentBottomAnnotation, MultiDocumentView multiDocumentView, int i15, fr.k kVar) {
        this(str, str2, str3, list, tVar, (i15 & 32) != 0 ? null : str4, (i15 & 64) != 0 ? null : verificationSelector, (i15 & 128) != 0 ? null : documentTopAnnotation, (i15 & 256) != 0 ? null : qrCodeSchema, (i15 & 512) != 0 ? null : barcodeSchema, (i15 & 1024) != 0 ? null : list2, (i15 & 2048) != 0 ? null : list3, (i15 & PKIFailureInfo.certConfirmed) != 0 ? null : list4, (i15 & PKIFailureInfo.certRevoked) != 0 ? null : list5, (i15 & 16384) != 0 ? null : documentBottomAnnotation, (i15 & 32768) != 0 ? null : multiDocumentView);
    }
}
