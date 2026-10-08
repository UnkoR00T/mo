package yf0;

import fr.t;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import zf0.MultiDocumentView;
import zf0.VerificationSelector;

/* JADX INFO: renamed from: yf0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b1\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b/\u00102\u001a\u0004\b3\u00104R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b(\u00109\u001a\u0004\b5\u0010:R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b7\u0010;\u001a\u0004\b+\u0010<R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b-\u0010?R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b@\u0010>\u001a\u0004\b)\u0010?R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\b&\u0010?R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lyf0/e;", "", "", "schemaId", "schemaVersion", "documentName", "Lyf0/p;", "picture", "documentPeselFieldReference", "Lzf0/e;", "multiDocumentSelectorForVerification", "Lyf0/l;", "topAnnotation", "Lyf0/q;", "qrCode", "Lyf0/a;", "barcode", "", "Lyf0/f;", "commonAttributes", "Lyf0/j;", "additionalAttributesName", "additionalAttributes", "Lyf0/b;", "bottomAnnotation", "Lzf0/d;", "multiDocumentView", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyf0/p;Ljava/lang/String;Lzf0/e;Lyf0/l;Lyf0/q;Lyf0/a;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lyf0/b;Lzf0/d;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "getSchemaVersion", "c", "e", "d", "Lyf0/p;", "f", "()Lyf0/p;", "getDocumentPeselFieldReference", "Lzf0/e;", "getMultiDocumentSelectorForVerification", "()Lzf0/e;", "g", "Lyf0/l;", "i", "()Lyf0/l;", "Lyf0/q;", "()Lyf0/q;", "Lyf0/a;", "()Lyf0/a;", "j", "Ljava/util/List;", "()Ljava/util/List;", "k", "l", "m", "Lyf0/b;", "getBottomAnnotation", "()Lyf0/b;", "n", "Lzf0/d;", "getMultiDocumentView", "()Lzf0/d;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentSchema {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String schemaId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String schemaVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final PictureSchema picture;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentPeselFieldReference;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final VerificationSelector multiDocumentSelectorForVerification;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentTopAnnotation topAnnotation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final QrCodeSchema qrCode;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final BarcodeSchema barcode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentSchemaAttribute> commonAttributes;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentSchemaLabel> additionalAttributesName;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentSchemaAttribute> additionalAttributes;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentBottomAnnotation bottomAnnotation;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final MultiDocumentView multiDocumentView;

    public DocumentSchema(String str, String str2, String str3, PictureSchema pictureSchema, String str4, VerificationSelector verificationSelector, DocumentTopAnnotation documentTopAnnotation, QrCodeSchema qrCodeSchema, BarcodeSchema barcodeSchema, List<DocumentSchemaAttribute> list, List<DocumentSchemaLabel> list2, List<DocumentSchemaAttribute> list3, DocumentBottomAnnotation documentBottomAnnotation, MultiDocumentView multiDocumentView) {
        this.schemaId = str;
        this.schemaVersion = str2;
        this.documentName = str3;
        this.picture = pictureSchema;
        this.documentPeselFieldReference = str4;
        this.multiDocumentSelectorForVerification = verificationSelector;
        this.topAnnotation = documentTopAnnotation;
        this.qrCode = qrCodeSchema;
        this.barcode = barcodeSchema;
        this.commonAttributes = list;
        this.additionalAttributesName = list2;
        this.additionalAttributes = list3;
        this.bottomAnnotation = documentBottomAnnotation;
        this.multiDocumentView = multiDocumentView;
    }

    public final List<DocumentSchemaAttribute> a() {
        return this.additionalAttributes;
    }

    public final List<DocumentSchemaLabel> b() {
        return this.additionalAttributesName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BarcodeSchema getBarcode() {
        return this.barcode;
    }

    public final List<DocumentSchemaAttribute> d() {
        return this.commonAttributes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDocumentName() {
        return this.documentName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentSchema)) {
            return false;
        }
        DocumentSchema documentSchema = (DocumentSchema) other;
        return t.c(this.schemaId, documentSchema.schemaId) && t.c(this.schemaVersion, documentSchema.schemaVersion) && t.c(this.documentName, documentSchema.documentName) && t.c(this.picture, documentSchema.picture) && t.c(this.documentPeselFieldReference, documentSchema.documentPeselFieldReference) && t.c(this.multiDocumentSelectorForVerification, documentSchema.multiDocumentSelectorForVerification) && t.c(this.topAnnotation, documentSchema.topAnnotation) && t.c(this.qrCode, documentSchema.qrCode) && t.c(this.barcode, documentSchema.barcode) && t.c(this.commonAttributes, documentSchema.commonAttributes) && t.c(this.additionalAttributesName, documentSchema.additionalAttributesName) && t.c(this.additionalAttributes, documentSchema.additionalAttributes) && t.c(this.bottomAnnotation, documentSchema.bottomAnnotation) && t.c(this.multiDocumentView, documentSchema.multiDocumentView);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final PictureSchema getPicture() {
        return this.picture;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final QrCodeSchema getQrCode() {
        return this.qrCode;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSchemaId() {
        return this.schemaId;
    }

    public int hashCode() {
        int iHashCode = ((((((this.schemaId.hashCode() * 31) + this.schemaVersion.hashCode()) * 31) + this.documentName.hashCode()) * 31) + this.picture.hashCode()) * 31;
        String str = this.documentPeselFieldReference;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        VerificationSelector verificationSelector = this.multiDocumentSelectorForVerification;
        int iHashCode3 = (iHashCode2 + (verificationSelector == null ? 0 : verificationSelector.hashCode())) * 31;
        DocumentTopAnnotation documentTopAnnotation = this.topAnnotation;
        int iHashCode4 = (iHashCode3 + (documentTopAnnotation == null ? 0 : documentTopAnnotation.hashCode())) * 31;
        QrCodeSchema qrCodeSchema = this.qrCode;
        int iHashCode5 = (iHashCode4 + (qrCodeSchema == null ? 0 : qrCodeSchema.hashCode())) * 31;
        BarcodeSchema barcodeSchema = this.barcode;
        int iHashCode6 = (iHashCode5 + (barcodeSchema == null ? 0 : barcodeSchema.hashCode())) * 31;
        List<DocumentSchemaAttribute> list = this.commonAttributes;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<DocumentSchemaLabel> list2 = this.additionalAttributesName;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<DocumentSchemaAttribute> list3 = this.additionalAttributes;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        DocumentBottomAnnotation documentBottomAnnotation = this.bottomAnnotation;
        int iHashCode10 = (iHashCode9 + (documentBottomAnnotation == null ? 0 : documentBottomAnnotation.hashCode())) * 31;
        MultiDocumentView multiDocumentView = this.multiDocumentView;
        return iHashCode10 + (multiDocumentView != null ? multiDocumentView.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final DocumentTopAnnotation getTopAnnotation() {
        return this.topAnnotation;
    }

    public String toString() {
        return "DocumentSchema(schemaId=" + this.schemaId + ", schemaVersion=" + this.schemaVersion + ", documentName=" + this.documentName + ", picture=" + this.picture + ", documentPeselFieldReference=" + this.documentPeselFieldReference + ", multiDocumentSelectorForVerification=" + this.multiDocumentSelectorForVerification + ", topAnnotation=" + this.topAnnotation + ", qrCode=" + this.qrCode + ", barcode=" + this.barcode + ", commonAttributes=" + this.commonAttributes + ", additionalAttributesName=" + this.additionalAttributesName + ", additionalAttributes=" + this.additionalAttributes + ", bottomAnnotation=" + this.bottomAnnotation + ", multiDocumentView=" + this.multiDocumentView + ")";
    }

    public /* synthetic */ DocumentSchema(String str, String str2, String str3, PictureSchema pictureSchema, String str4, VerificationSelector verificationSelector, DocumentTopAnnotation documentTopAnnotation, QrCodeSchema qrCodeSchema, BarcodeSchema barcodeSchema, List list, List list2, List list3, DocumentBottomAnnotation documentBottomAnnotation, MultiDocumentView multiDocumentView, int i15, fr.k kVar) {
        this(str, str2, str3, pictureSchema, (i15 & 16) != 0 ? null : str4, (i15 & 32) != 0 ? null : verificationSelector, (i15 & 64) != 0 ? null : documentTopAnnotation, (i15 & 128) != 0 ? null : qrCodeSchema, (i15 & 256) != 0 ? null : barcodeSchema, (i15 & 512) != 0 ? null : list, (i15 & 1024) != 0 ? null : list2, (i15 & 2048) != 0 ? null : list3, (i15 & PKIFailureInfo.certConfirmed) != 0 ? null : documentBottomAnnotation, (i15 & PKIFailureInfo.certRevoked) != 0 ? null : multiDocumentView);
    }
}
