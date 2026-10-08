package ld3;

import android.graphics.Bitmap;
import fr.t;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ld3.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lld3/a;", "", "Landroid/graphics/Bitmap;", "bitmap", "Lmx/a;", "buttonText", "Lkotlin/Function0;", "Loq/i0;", "onCloseButtonClick", "<init>", "(Landroid/graphics/Bitmap;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "b", "Lmx/a;", "()Lmx/a;", "c", "Ler/a;", "()Ler/a;", "uut_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UutCardBottomSheetData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Bitmap bitmap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label buttonText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onCloseButtonClick;

    public UutCardBottomSheetData(Bitmap bitmap, Label label, er.a<i0> aVar) {
        this.bitmap = bitmap;
        this.buttonText = label;
        this.onCloseButtonClick = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getButtonText() {
        return this.buttonText;
    }

    public final er.a<i0> c() {
        return this.onCloseButtonClick;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UutCardBottomSheetData)) {
            return false;
        }
        UutCardBottomSheetData uutCardBottomSheetData = (UutCardBottomSheetData) other;
        return t.c(this.bitmap, uutCardBottomSheetData.bitmap) && t.c(this.buttonText, uutCardBottomSheetData.buttonText) && t.c(this.onCloseButtonClick, uutCardBottomSheetData.onCloseButtonClick);
    }

    public int hashCode() {
        Bitmap bitmap = this.bitmap;
        return ((((bitmap == null ? 0 : bitmap.hashCode()) * 31) + this.buttonText.hashCode()) * 31) + this.onCloseButtonClick.hashCode();
    }

    public String toString() {
        return "UutCardBottomSheetData(bitmap=" + this.bitmap + ", buttonText=" + this.buttonText + ", onCloseButtonClick=" + this.onCloseButtonClick + ')';
    }
}
