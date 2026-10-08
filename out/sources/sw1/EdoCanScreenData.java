package sw1;

import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: sw1.e, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001c"}, d2 = {"Lsw1/e;", "", "Lmx/a;", "topBarTitle", "", "firstScreenInFlow", "processInterruptDialogTitle", "<init>", "(Lmx/a;ZLmx/a;)V", "a", "(Lmx/a;ZLmx/a;)Lsw1/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lmx/a;", "e", "()Lmx/a;", "b", "Z", "c", "()Z", "d", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EdoCanScreenData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label topBarTitle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean firstScreenInFlow;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label processInterruptDialogTitle;

    public EdoCanScreenData(Label label, boolean z15, Label label2) {
        this.topBarTitle = label;
        this.firstScreenInFlow = z15;
        this.processInterruptDialogTitle = label2;
    }

    public static /* synthetic */ EdoCanScreenData b(EdoCanScreenData edoCanScreenData, Label label, boolean z15, Label label2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            label = edoCanScreenData.topBarTitle;
        }
        if ((i15 & 2) != 0) {
            z15 = edoCanScreenData.firstScreenInFlow;
        }
        if ((i15 & 4) != 0) {
            label2 = edoCanScreenData.processInterruptDialogTitle;
        }
        return edoCanScreenData.a(label, z15, label2);
    }

    public final EdoCanScreenData a(Label topBarTitle, boolean firstScreenInFlow, Label processInterruptDialogTitle) {
        return new EdoCanScreenData(topBarTitle, firstScreenInFlow, processInterruptDialogTitle);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getFirstScreenInFlow() {
        return this.firstScreenInFlow;
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
        if (!(other instanceof EdoCanScreenData)) {
            return false;
        }
        EdoCanScreenData edoCanScreenData = (EdoCanScreenData) other;
        return fr.t.c(this.topBarTitle, edoCanScreenData.topBarTitle) && this.firstScreenInFlow == edoCanScreenData.firstScreenInFlow && fr.t.c(this.processInterruptDialogTitle, edoCanScreenData.processInterruptDialogTitle);
    }

    public int hashCode() {
        return (((this.topBarTitle.hashCode() * 31) + Boolean.hashCode(this.firstScreenInFlow)) * 31) + this.processInterruptDialogTitle.hashCode();
    }

    public String toString() {
        return "EdoCanScreenData(topBarTitle=" + this.topBarTitle + ", firstScreenInFlow=" + this.firstScreenInFlow + ", processInterruptDialogTitle=" + this.processInterruptDialogTitle + ')';
    }

    public /* synthetic */ EdoCanScreenData(Label label, boolean z15, Label label2, int i15, fr.k kVar) {
        this(label, (i15 & 2) != 0 ? false : z15, (i15 & 4) != 0 ? Label.INSTANCE.c() : label2);
    }
}
