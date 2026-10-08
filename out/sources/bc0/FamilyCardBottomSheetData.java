package bc0;

import android.graphics.Bitmap;
import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bc0.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lbc0/c;", "", "Landroid/graphics/Bitmap;", "qrCode", "Lmx/a;", "closeButton", "<init>", "(Landroid/graphics/Bitmap;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "b", "()Landroid/graphics/Bitmap;", "Lmx/a;", "()Lmx/a;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FamilyCardBottomSheetData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Bitmap qrCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label closeButton;

    public FamilyCardBottomSheetData(Bitmap bitmap, Label label) {
        this.qrCode = bitmap;
        this.closeButton = label;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getCloseButton() {
        return this.closeButton;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Bitmap getQrCode() {
        return this.qrCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyCardBottomSheetData)) {
            return false;
        }
        FamilyCardBottomSheetData familyCardBottomSheetData = (FamilyCardBottomSheetData) other;
        return t.c(this.qrCode, familyCardBottomSheetData.qrCode) && t.c(this.closeButton, familyCardBottomSheetData.closeButton);
    }

    public int hashCode() {
        return (this.qrCode.hashCode() * 31) + this.closeButton.hashCode();
    }

    public String toString() {
        return "FamilyCardBottomSheetData(qrCode=" + this.qrCode + ", closeButton=" + this.closeButton + ')';
    }
}
