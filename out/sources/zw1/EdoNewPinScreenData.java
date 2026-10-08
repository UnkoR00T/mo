package zw1;

import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zw1.e, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017¨\u0006\u001d"}, d2 = {"Lzw1/e;", "", "Lmx/a;", "topBarTitle", "Lyw1/a;", "certificateType", "processInterruptDialogTitle", "<init>", "(Lmx/a;Lyw1/a;Lmx/a;)V", "a", "(Lmx/a;Lyw1/a;Lmx/a;)Lzw1/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmx/a;", "e", "()Lmx/a;", "b", "Lyw1/a;", "c", "()Lyw1/a;", "d", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EdoNewPinScreenData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label topBarTitle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final yw1.a certificateType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label processInterruptDialogTitle;

    public EdoNewPinScreenData(Label label, yw1.a aVar, Label label2) {
        this.topBarTitle = label;
        this.certificateType = aVar;
        this.processInterruptDialogTitle = label2;
    }

    public static /* synthetic */ EdoNewPinScreenData b(EdoNewPinScreenData edoNewPinScreenData, Label label, yw1.a aVar, Label label2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            label = edoNewPinScreenData.topBarTitle;
        }
        if ((i15 & 2) != 0) {
            aVar = edoNewPinScreenData.certificateType;
        }
        if ((i15 & 4) != 0) {
            label2 = edoNewPinScreenData.processInterruptDialogTitle;
        }
        return edoNewPinScreenData.a(label, aVar, label2);
    }

    public final EdoNewPinScreenData a(Label topBarTitle, yw1.a certificateType, Label processInterruptDialogTitle) {
        return new EdoNewPinScreenData(topBarTitle, certificateType, processInterruptDialogTitle);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final yw1.a getCertificateType() {
        return this.certificateType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getProcessInterruptDialogTitle() {
        return this.processInterruptDialogTitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Label getTopBarTitle() {
        return this.topBarTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EdoNewPinScreenData)) {
            return false;
        }
        EdoNewPinScreenData edoNewPinScreenData = (EdoNewPinScreenData) other;
        return fr.t.c(this.topBarTitle, edoNewPinScreenData.topBarTitle) && this.certificateType == edoNewPinScreenData.certificateType && fr.t.c(this.processInterruptDialogTitle, edoNewPinScreenData.processInterruptDialogTitle);
    }

    public int hashCode() {
        return (((this.topBarTitle.hashCode() * 31) + this.certificateType.hashCode()) * 31) + this.processInterruptDialogTitle.hashCode();
    }

    public String toString() {
        return "EdoNewPinScreenData(topBarTitle=" + this.topBarTitle + ", certificateType=" + this.certificateType + ", processInterruptDialogTitle=" + this.processInterruptDialogTitle + ')';
    }
}
