package gv1;

import hv1.MultiDocumentView;
import hv1.VerificationSelector;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gv1.i, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\"R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010+\u001a\u0004\b:\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b0\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b:\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b7\u0010E\u001a\u0004\b1\u0010FR\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bC\u00102\u001a\u0004\b9\u00104R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b?\u00102\u001a\u0004\b/\u00104R\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bG\u00102\u001a\u0004\b-\u00104R\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bH\u00102\u001a\u0004\b*\u00104R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b5\u0010KR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bA\u0010N¨\u0006O"}, d2 = {"Lgv1/i;", "", "", "schemaId", "schemaVersion", "documentName", "", "Lgv1/n;", "forwardAttributes", "Lgv1/v;", "picture", "documentPeselFieldReference", "Lhv1/d;", "multiDocumentSelectorForVerification", "Lgv1/q;", "topAnnotation", "Lgv1/w;", "qrCode", "Lgv1/b;", "barcode", "Lgv1/j;", "commonAttributes", "Lgv1/o;", "additionalAttributesName", "additionalAttributes", "Lgv1/c;", "actionAttributes", "Lgv1/d;", "bottomAnnotation", "Lhv1/c;", "multiDocumentView", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lgv1/v;Ljava/lang/String;Lhv1/d;Lgv1/q;Lgv1/w;Lgv1/b;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lgv1/d;Lhv1/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSchemaId", "b", "getSchemaVersion", "c", "g", "d", "Ljava/util/List;", "getForwardAttributes", "()Ljava/util/List;", "e", "Lgv1/v;", "j", "()Lgv1/v;", "f", "h", "Lhv1/d;", "getMultiDocumentSelectorForVerification", "()Lhv1/d;", "Lgv1/q;", "l", "()Lgv1/q;", "i", "Lgv1/w;", "k", "()Lgv1/w;", "Lgv1/b;", "()Lgv1/b;", "m", "n", "o", "Lgv1/d;", "()Lgv1/d;", "p", "Lhv1/c;", "()Lhv1/c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    public DocumentSchema(String str, String str2, String str3, List<DocumentSchemaForwardAttribute> list, PictureSchema vVar, String str4, VerificationSelector verificationSelector, DocumentTopAnnotation qVar, QrCodeSchema qrCodeSchema, BarcodeSchema barcodeSchema, List<DocumentSchemaAttribute> list2, List<DocumentSchemaLabel> list3, List<DocumentSchemaAttribute> list4, List<DocumentActionAttribute> list5, DocumentBottomAnnotation documentBottomAnnotation, MultiDocumentView cVar) {
        this.schemaId = str;
        this.schemaVersion = str2;
        this.documentName = str3;
        this.forwardAttributes = list;
        this.picture = vVar;
        this.documentPeselFieldReference = str4;
        this.multiDocumentSelectorForVerification = verificationSelector;
        this.topAnnotation = qVar;
        this.qrCode = qrCodeSchema;
        this.barcode = barcodeSchema;
        this.commonAttributes = list2;
        this.additionalAttributesName = list3;
        this.additionalAttributes = list4;
        this.actionAttributes = list5;
        this.bottomAnnotation = documentBottomAnnotation;
        this.multiDocumentView = cVar;
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
        DocumentTopAnnotation qVar = this.topAnnotation;
        int iHashCode5 = (iHashCode4 + (qVar == null ? 0 : qVar.hashCode())) * 31;
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
        MultiDocumentView cVar = this.multiDocumentView;
        return iHashCode12 + (cVar != null ? cVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final MultiDocumentView getMultiDocumentView() {
        return this.multiDocumentView;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final PictureSchema getPicture() {
        return this.picture;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final QrCodeSchema getQrCode() {
        return this.qrCode;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final DocumentTopAnnotation getTopAnnotation() {
        return this.topAnnotation;
    }

    public String toString() {
        return "DocumentSchema(schemaId=" + this.schemaId + ", schemaVersion=" + this.schemaVersion + ", documentName=" + this.documentName + ", forwardAttributes=" + this.forwardAttributes + ", picture=" + this.picture + ", documentPeselFieldReference=" + this.documentPeselFieldReference + ", multiDocumentSelectorForVerification=" + this.multiDocumentSelectorForVerification + ", topAnnotation=" + this.topAnnotation + ", qrCode=" + this.qrCode + ", barcode=" + this.barcode + ", commonAttributes=" + this.commonAttributes + ", additionalAttributesName=" + this.additionalAttributesName + ", additionalAttributes=" + this.additionalAttributes + ", actionAttributes=" + this.actionAttributes + ", bottomAnnotation=" + this.bottomAnnotation + ", multiDocumentView=" + this.multiDocumentView + ")";
    }
}
