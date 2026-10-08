package me0;

import fr.k;
import fr.t;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: me0.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\"\u0010\u0013R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b\u001a\u0010(¨\u0006)"}, d2 = {"Lme0/f;", "", "", "documentId", "Lmx/a;", "documentTypeName", "", "documentTypeIcon", "scopeName", "Lme0/b;", "photoData", "", "Lme0/c;", "userData", "Lme0/a;", "additionalAccordionData", "<init>", "(Ljava/lang/String;Lmx/a;ILjava/lang/String;Lme0/b;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lmx/a;", "d", "()Lmx/a;", "c", "I", "f", "e", "Lme0/b;", "()Lme0/b;", "Ljava/util/List;", "g", "()Ljava/util/List;", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerificationUutCardData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label documentTypeName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int documentTypeIcon;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String scopeName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentPhotoData photoData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ItemData> userData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AdditionalSectionData> additionalAccordionData;

    public VerificationUutCardData(String str, Label label, int i15, String str2, DocumentPhotoData documentPhotoData, List<ItemData> list, List<AdditionalSectionData> list2) {
        this.documentId = str;
        this.documentTypeName = label;
        this.documentTypeIcon = i15;
        this.scopeName = str2;
        this.photoData = documentPhotoData;
        this.userData = list;
        this.additionalAccordionData = list2;
    }

    public final List<AdditionalSectionData> a() {
        return this.additionalAccordionData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getDocumentTypeIcon() {
        return this.documentTypeIcon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getDocumentTypeName() {
        return this.documentTypeName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final DocumentPhotoData getPhotoData() {
        return this.photoData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationUutCardData)) {
            return false;
        }
        VerificationUutCardData verificationUutCardData = (VerificationUutCardData) other;
        return t.c(this.documentId, verificationUutCardData.documentId) && t.c(this.documentTypeName, verificationUutCardData.documentTypeName) && this.documentTypeIcon == verificationUutCardData.documentTypeIcon && t.c(this.scopeName, verificationUutCardData.scopeName) && t.c(this.photoData, verificationUutCardData.photoData) && t.c(this.userData, verificationUutCardData.userData) && t.c(this.additionalAccordionData, verificationUutCardData.additionalAccordionData);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getScopeName() {
        return this.scopeName;
    }

    public final List<ItemData> g() {
        return this.userData;
    }

    public int hashCode() {
        int iHashCode = ((((((this.documentId.hashCode() * 31) + this.documentTypeName.hashCode()) * 31) + Integer.hashCode(this.documentTypeIcon)) * 31) + this.scopeName.hashCode()) * 31;
        DocumentPhotoData documentPhotoData = this.photoData;
        int iHashCode2 = (((iHashCode + (documentPhotoData == null ? 0 : documentPhotoData.hashCode())) * 31) + this.userData.hashCode()) * 31;
        List<AdditionalSectionData> list = this.additionalAccordionData;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "VerificationUutCardData(documentId=" + this.documentId + ", documentTypeName=" + this.documentTypeName + ", documentTypeIcon=" + this.documentTypeIcon + ", scopeName=" + this.scopeName + ", photoData=" + this.photoData + ", userData=" + this.userData + ", additionalAccordionData=" + this.additionalAccordionData + ')';
    }

    public /* synthetic */ VerificationUutCardData(String str, Label label, int i15, String str2, DocumentPhotoData documentPhotoData, List list, List list2, int i16, k kVar) {
        this(str, label, i15, str2, documentPhotoData, list, (i16 & 64) != 0 ? null : list2);
    }
}
