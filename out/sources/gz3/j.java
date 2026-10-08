package gz3;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lgz3/j;", "Ll00/e;", "Lgz3/j$a;", "Li70/n;", "a", "b", "webpreview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j extends l00.e<Data>, i70.n {

    /* JADX INFO: renamed from: gz3.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001e\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, d2 = {"Lgz3/j$a;", "", "Li50/a;", "baseScaffoldData", "Lw70/c;", "load", "Lh30/a;", "saveButtonData", "Lgz3/j$b;", "loadDataError", "Lcb4/i;", "vmsAdapter", "<init>", "(Li50/a;Lw70/c;Lh30/a;Lgz3/j$b;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lw70/c;", "()Lw70/c;", "c", "Lh30/a;", "d", "()Lh30/a;", "Lgz3/j$b;", "()Lgz3/j$b;", "e", "Lcb4/i;", "()Lcb4/i;", "webpreview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final w70.c load;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData saveButtonData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final LoadDataError loadDataError;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i vmsAdapter;

        public Data(BaseScaffoldData baseScaffoldData, w70.c cVar, ButtonData buttonData, LoadDataError loadDataError, cb4.i iVar) {
            this.baseScaffoldData = baseScaffoldData;
            this.load = cVar;
            this.saveButtonData = buttonData;
            this.loadDataError = loadDataError;
            this.vmsAdapter = iVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final w70.c getLoad() {
            return this.load;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LoadDataError getLoadDataError() {
            return this.loadDataError;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ButtonData getSaveButtonData() {
            return this.saveButtonData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final cb4.i getVmsAdapter() {
            return this.vmsAdapter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.load, data.load) && fr.t.c(this.saveButtonData, data.saveButtonData) && fr.t.c(this.loadDataError, data.loadDataError) && fr.t.c(this.vmsAdapter, data.vmsAdapter);
        }

        public int hashCode() {
            int iHashCode = ((this.baseScaffoldData.hashCode() * 31) + this.load.hashCode()) * 31;
            ButtonData buttonData = this.saveButtonData;
            int iHashCode2 = (iHashCode + (buttonData == null ? 0 : buttonData.hashCode())) * 31;
            LoadDataError loadDataError = this.loadDataError;
            int iHashCode3 = (iHashCode2 + (loadDataError == null ? 0 : loadDataError.hashCode())) * 31;
            cb4.i iVar = this.vmsAdapter;
            return iHashCode3 + (iVar != null ? iVar.hashCode() : 0);
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", load=" + this.load + ", saveButtonData=" + this.saveButtonData + ", loadDataError=" + this.loadDataError + ", vmsAdapter=" + this.vmsAdapter + ')';
        }
    }

    /* JADX INFO: renamed from: gz3.j$b, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"Lgz3/j$b;", "", "Lmx/a;", "errorTitle", "errorDescription", "Lh30/a;", "refreshButton", "errorActionButton", "<init>", "(Lmx/a;Lmx/a;Lh30/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Lh30/a;", "d", "()Lh30/a;", "webpreview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoadDataError {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label errorTitle;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label errorDescription;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData refreshButton;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData errorActionButton;

        public LoadDataError(Label label, Label label2, ButtonData buttonData, ButtonData buttonData2) {
            this.errorTitle = label;
            this.errorDescription = label2;
            this.refreshButton = buttonData;
            this.errorActionButton = buttonData2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonData getErrorActionButton() {
            return this.errorActionButton;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getErrorDescription() {
            return this.errorDescription;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getErrorTitle() {
            return this.errorTitle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ButtonData getRefreshButton() {
            return this.refreshButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadDataError)) {
                return false;
            }
            LoadDataError loadDataError = (LoadDataError) other;
            return fr.t.c(this.errorTitle, loadDataError.errorTitle) && fr.t.c(this.errorDescription, loadDataError.errorDescription) && fr.t.c(this.refreshButton, loadDataError.refreshButton) && fr.t.c(this.errorActionButton, loadDataError.errorActionButton);
        }

        public int hashCode() {
            return (((((this.errorTitle.hashCode() * 31) + this.errorDescription.hashCode()) * 31) + this.refreshButton.hashCode()) * 31) + this.errorActionButton.hashCode();
        }

        public String toString() {
            return "LoadDataError(errorTitle=" + this.errorTitle + ", errorDescription=" + this.errorDescription + ", refreshButton=" + this.refreshButton + ", errorActionButton=" + this.errorActionButton + ')';
        }
    }
}
