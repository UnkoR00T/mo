package sv1;

import android.graphics.Bitmap;
import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: sv1.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lsv1/c;", "", "Lmx/a;", "titleLabel", "descriptionLabel", "Lr50/a;", "statusBadge", "Landroid/graphics/Bitmap;", "photo", "<init>", "(Lmx/a;Lmx/a;Lr50/a;Landroid/graphics/Bitmap;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "d", "()Lmx/a;", "b", "c", "Lr50/a;", "()Lr50/a;", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DynamicDocumentsListCustomContentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label titleLabel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label descriptionLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final r50.a statusBadge;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Bitmap photo;

    public DynamicDocumentsListCustomContentData(Label label, Label label2, r50.a aVar, Bitmap bitmap) {
        this.titleLabel = label;
        this.descriptionLabel = label2;
        this.statusBadge = aVar;
        this.photo = bitmap;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getDescriptionLabel() {
        return this.descriptionLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Bitmap getPhoto() {
        return this.photo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final r50.a getStatusBadge() {
        return this.statusBadge;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getTitleLabel() {
        return this.titleLabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicDocumentsListCustomContentData)) {
            return false;
        }
        DynamicDocumentsListCustomContentData dynamicDocumentsListCustomContentData = (DynamicDocumentsListCustomContentData) other;
        return t.c(this.titleLabel, dynamicDocumentsListCustomContentData.titleLabel) && t.c(this.descriptionLabel, dynamicDocumentsListCustomContentData.descriptionLabel) && t.c(this.statusBadge, dynamicDocumentsListCustomContentData.statusBadge) && t.c(this.photo, dynamicDocumentsListCustomContentData.photo);
    }

    public int hashCode() {
        int iHashCode = this.titleLabel.hashCode() * 31;
        Label label = this.descriptionLabel;
        int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
        r50.a aVar = this.statusBadge;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Bitmap bitmap = this.photo;
        return iHashCode3 + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public String toString() {
        return "DynamicDocumentsListCustomContentData(titleLabel=" + this.titleLabel + ", descriptionLabel=" + this.descriptionLabel + ", statusBadge=" + this.statusBadge + ", photo=" + this.photo + ')';
    }
}
