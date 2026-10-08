package f40;

import fr.k;
import fr.t;
import h30.ButtonData;
import mx.Label;
import n50.i;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: f40.c, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lf40/c;", "", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lh30/a;", "buttonData", "Ln50/i$b;", "qrCodeImage", "<init>", "(Lmx/a;Lh30/a;Ln50/i$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Lh30/a;", "()Lh30/a;", "c", "Ln50/i$b;", "()Ln50/i$b;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LabelButtonImageSingleCardData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonData buttonData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final i.Image qrCodeImage;

    public LabelButtonImageSingleCardData(Label label, ButtonData buttonData, i.Image image) {
        this.label = label;
        this.buttonData = buttonData;
        this.qrCodeImage = image;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ButtonData getButtonData() {
        return this.buttonData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i.Image getQrCodeImage() {
        return this.qrCodeImage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabelButtonImageSingleCardData)) {
            return false;
        }
        LabelButtonImageSingleCardData labelButtonImageSingleCardData = (LabelButtonImageSingleCardData) other;
        return t.c(this.label, labelButtonImageSingleCardData.label) && t.c(this.buttonData, labelButtonImageSingleCardData.buttonData) && t.c(this.qrCodeImage, labelButtonImageSingleCardData.qrCodeImage);
    }

    public int hashCode() {
        Label label = this.label;
        return ((((label == null ? 0 : label.hashCode()) * 31) + this.buttonData.hashCode()) * 31) + this.qrCodeImage.hashCode();
    }

    public String toString() {
        return "LabelButtonImageSingleCardData(label=" + this.label + ", buttonData=" + this.buttonData + ", qrCodeImage=" + this.qrCodeImage + ')';
    }

    public /* synthetic */ LabelButtonImageSingleCardData(Label label, ButtonData buttonData, i.Image image, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : label, buttonData, image);
    }
}
