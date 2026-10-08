package a70;

import android.graphics.Bitmap;
import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: a70.j, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b \u0010\u001bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001c\u0010\u001b¨\u0006!"}, d2 = {"La70/j;", "", "Landroid/graphics/Bitmap;", "qrCodeBitmap", "Lmx/a;", "codeLabel", "", "timerProgress", "qrcodeTimerLabel", "qrCodeTimeLeftLabel", "<init>", "(Landroid/graphics/Bitmap;Lmx/a;FLmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "b", "()Landroid/graphics/Bitmap;", "Lmx/a;", "()Lmx/a;", "c", "F", "e", "()F", "d", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShowQrcodeData {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f3994f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Bitmap qrCodeBitmap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label codeLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float timerProgress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label qrcodeTimerLabel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label qrCodeTimeLeftLabel;

    public ShowQrcodeData(Bitmap bitmap, Label label, float f15, Label label2, Label label3) {
        this.qrCodeBitmap = bitmap;
        this.codeLabel = label;
        this.timerProgress = f15;
        this.qrcodeTimerLabel = label2;
        this.qrCodeTimeLeftLabel = label3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getCodeLabel() {
        return this.codeLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Bitmap getQrCodeBitmap() {
        return this.qrCodeBitmap;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getQrCodeTimeLeftLabel() {
        return this.qrCodeTimeLeftLabel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getQrcodeTimerLabel() {
        return this.qrcodeTimerLabel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getTimerProgress() {
        return this.timerProgress;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShowQrcodeData)) {
            return false;
        }
        ShowQrcodeData showQrcodeData = (ShowQrcodeData) other;
        return t.c(this.qrCodeBitmap, showQrcodeData.qrCodeBitmap) && t.c(this.codeLabel, showQrcodeData.codeLabel) && Float.compare(this.timerProgress, showQrcodeData.timerProgress) == 0 && t.c(this.qrcodeTimerLabel, showQrcodeData.qrcodeTimerLabel) && t.c(this.qrCodeTimeLeftLabel, showQrcodeData.qrCodeTimeLeftLabel);
    }

    public int hashCode() {
        int iHashCode = this.qrCodeBitmap.hashCode() * 31;
        Label label = this.codeLabel;
        return ((((((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + Float.hashCode(this.timerProgress)) * 31) + this.qrcodeTimerLabel.hashCode()) * 31) + this.qrCodeTimeLeftLabel.hashCode();
    }

    public String toString() {
        return "ShowQrcodeData(qrCodeBitmap=" + this.qrCodeBitmap + ", codeLabel=" + this.codeLabel + ", timerProgress=" + this.timerProgress + ", qrcodeTimerLabel=" + this.qrcodeTimerLabel + ", qrCodeTimeLeftLabel=" + this.qrCodeTimeLeftLabel + ')';
    }
}
