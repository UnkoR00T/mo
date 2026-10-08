package q40;

import fr.k;
import fr.t;
import h30.ButtonData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: q40.f, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lq40/f;", "", "Lh30/a;", "primaryButtonData", "secondaryButtonData", "tertiaryButtonData", "<init>", "(Lh30/a;Lh30/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh30/a;", "()Lh30/a;", "b", "c", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IconPageBottomContentData {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f164663d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonData primaryButtonData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonData secondaryButtonData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonData tertiaryButtonData;

    public IconPageBottomContentData(ButtonData buttonData, ButtonData buttonData2, ButtonData buttonData3) {
        this.primaryButtonData = buttonData;
        this.secondaryButtonData = buttonData2;
        this.tertiaryButtonData = buttonData3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ButtonData getPrimaryButtonData() {
        return this.primaryButtonData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ButtonData getSecondaryButtonData() {
        return this.secondaryButtonData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ButtonData getTertiaryButtonData() {
        return this.tertiaryButtonData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconPageBottomContentData)) {
            return false;
        }
        IconPageBottomContentData iconPageBottomContentData = (IconPageBottomContentData) other;
        return t.c(this.primaryButtonData, iconPageBottomContentData.primaryButtonData) && t.c(this.secondaryButtonData, iconPageBottomContentData.secondaryButtonData) && t.c(this.tertiaryButtonData, iconPageBottomContentData.tertiaryButtonData);
    }

    public int hashCode() {
        int iHashCode = this.primaryButtonData.hashCode() * 31;
        ButtonData buttonData = this.secondaryButtonData;
        int iHashCode2 = (iHashCode + (buttonData == null ? 0 : buttonData.hashCode())) * 31;
        ButtonData buttonData2 = this.tertiaryButtonData;
        return iHashCode2 + (buttonData2 != null ? buttonData2.hashCode() : 0);
    }

    public String toString() {
        return "IconPageBottomContentData(primaryButtonData=" + this.primaryButtonData + ", secondaryButtonData=" + this.secondaryButtonData + ", tertiaryButtonData=" + this.tertiaryButtonData + ')';
    }

    public /* synthetic */ IconPageBottomContentData(ButtonData buttonData, ButtonData buttonData2, ButtonData buttonData3, int i15, k kVar) {
        this(buttonData, (i15 & 2) != 0 ? null : buttonData2, (i15 & 4) != 0 ? null : buttonData3);
    }
}
