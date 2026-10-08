package dx1;

import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: dx1.e, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJB\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006#"}, d2 = {"Ldx1/e;", "", "Lmx/a;", "topBarTitle", "Lyw1/a;", "certificateType", "", "firstScreenInFlow", "processInterruptDialogTitle", "resetPinAvailable", "<init>", "(Lmx/a;Lyw1/a;ZLmx/a;Z)V", "a", "(Lmx/a;Lyw1/a;ZLmx/a;Z)Ldx1/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lmx/a;", "g", "()Lmx/a;", "b", "Lyw1/a;", "c", "()Lyw1/a;", "Z", "d", "()Z", "e", "f", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EdoPinScreenData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label topBarTitle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final yw1.a certificateType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean firstScreenInFlow;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label processInterruptDialogTitle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean resetPinAvailable;

    public EdoPinScreenData(Label label, yw1.a aVar, boolean z15, Label label2, boolean z16) {
        this.topBarTitle = label;
        this.certificateType = aVar;
        this.firstScreenInFlow = z15;
        this.processInterruptDialogTitle = label2;
        this.resetPinAvailable = z16;
    }

    public static /* synthetic */ EdoPinScreenData b(EdoPinScreenData edoPinScreenData, Label label, yw1.a aVar, boolean z15, Label label2, boolean z16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            label = edoPinScreenData.topBarTitle;
        }
        if ((i15 & 2) != 0) {
            aVar = edoPinScreenData.certificateType;
        }
        if ((i15 & 4) != 0) {
            z15 = edoPinScreenData.firstScreenInFlow;
        }
        if ((i15 & 8) != 0) {
            label2 = edoPinScreenData.processInterruptDialogTitle;
        }
        if ((i15 & 16) != 0) {
            z16 = edoPinScreenData.resetPinAvailable;
        }
        boolean z17 = z16;
        boolean z18 = z15;
        return edoPinScreenData.a(label, aVar, z18, label2, z17);
    }

    public final EdoPinScreenData a(Label topBarTitle, yw1.a certificateType, boolean firstScreenInFlow, Label processInterruptDialogTitle, boolean resetPinAvailable) {
        return new EdoPinScreenData(topBarTitle, certificateType, firstScreenInFlow, processInterruptDialogTitle, resetPinAvailable);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final yw1.a getCertificateType() {
        return this.certificateType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getFirstScreenInFlow() {
        return this.firstScreenInFlow;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Label getProcessInterruptDialogTitle() {
        return this.processInterruptDialogTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EdoPinScreenData)) {
            return false;
        }
        EdoPinScreenData edoPinScreenData = (EdoPinScreenData) other;
        return fr.t.c(this.topBarTitle, edoPinScreenData.topBarTitle) && this.certificateType == edoPinScreenData.certificateType && this.firstScreenInFlow == edoPinScreenData.firstScreenInFlow && fr.t.c(this.processInterruptDialogTitle, edoPinScreenData.processInterruptDialogTitle) && this.resetPinAvailable == edoPinScreenData.resetPinAvailable;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getResetPinAvailable() {
        return this.resetPinAvailable;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Label getTopBarTitle() {
        return this.topBarTitle;
    }

    public int hashCode() {
        return (((((((this.topBarTitle.hashCode() * 31) + this.certificateType.hashCode()) * 31) + Boolean.hashCode(this.firstScreenInFlow)) * 31) + this.processInterruptDialogTitle.hashCode()) * 31) + Boolean.hashCode(this.resetPinAvailable);
    }

    public String toString() {
        return "EdoPinScreenData(topBarTitle=" + this.topBarTitle + ", certificateType=" + this.certificateType + ", firstScreenInFlow=" + this.firstScreenInFlow + ", processInterruptDialogTitle=" + this.processInterruptDialogTitle + ", resetPinAvailable=" + this.resetPinAvailable + ')';
    }

    public /* synthetic */ EdoPinScreenData(Label label, yw1.a aVar, boolean z15, Label label2, boolean z16, int i15, fr.k kVar) {
        this(label, aVar, (i15 & 4) != 0 ? false : z15, (i15 & 8) != 0 ? Label.INSTANCE.c() : label2, (i15 & 16) != 0 ? true : z16);
    }
}
