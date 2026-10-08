package s20;

import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: s20.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Ls20/a;", "", "", "iconResId", "Lmx/a;", "iconContentDescription", "Ls20/d;", "statusIconData", "<init>", "(ILmx/a;Ls20/d;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lmx/a;", "()Lmx/a;", "c", "Ls20/d;", "()Ls20/d;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentIconWithStatusData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int iconResId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label iconContentDescription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final d statusIconData;

    public DocumentIconWithStatusData(int i15, Label label, d dVar) {
        this.iconResId = i15;
        this.iconContentDescription = label;
        this.statusIconData = dVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getIconContentDescription() {
        return this.iconContentDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getIconResId() {
        return this.iconResId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getStatusIconData() {
        return this.statusIconData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentIconWithStatusData)) {
            return false;
        }
        DocumentIconWithStatusData documentIconWithStatusData = (DocumentIconWithStatusData) other;
        return this.iconResId == documentIconWithStatusData.iconResId && t.c(this.iconContentDescription, documentIconWithStatusData.iconContentDescription) && t.c(this.statusIconData, documentIconWithStatusData.statusIconData);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.iconResId) * 31) + this.iconContentDescription.hashCode()) * 31;
        d dVar = this.statusIconData;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public String toString() {
        return "DocumentIconWithStatusData(iconResId=" + this.iconResId + ", iconContentDescription=" + this.iconContentDescription + ", statusIconData=" + this.statusIconData + ')';
    }
}
