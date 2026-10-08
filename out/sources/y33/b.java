package y33;

import p071kotlin.Metadata;
import tt0.BEReportCategory;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Ly33/b;", "", "Ltt0/g;", "h0", "()Ltt0/g;", "selectedCategory", "b", "a", "Ly33/b$a;", "Ly33/b$b;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: y33.b$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Ly33/b$a;", "Ly33/b;", "Ltt0/g;", "selectedCategory", "Lcb4/i;", "dialogVMSAdapter", "<init>", "(Ltt0/g;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltt0/g;", "h0", "()Ltt0/g;", "b", "Lcb4/i;", "()Lcb4/i;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dialog implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEReportCategory selectedCategory;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialogVMSAdapter;

        public Dialog(BEReportCategory bEReportCategory, cb4.i iVar) {
            this.selectedCategory = bEReportCategory;
            this.dialogVMSAdapter = iVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final cb4.i getDialogVMSAdapter() {
            return this.dialogVMSAdapter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) other;
            return fr.t.c(this.selectedCategory, dialog.selectedCategory) && fr.t.c(this.dialogVMSAdapter, dialog.dialogVMSAdapter);
        }

        @Override // y33.b
        /* JADX INFO: renamed from: h0, reason: from getter */
        public BEReportCategory getSelectedCategory() {
            return this.selectedCategory;
        }

        public int hashCode() {
            return (this.selectedCategory.hashCode() * 31) + this.dialogVMSAdapter.hashCode();
        }

        public String toString() {
            return "Dialog(selectedCategory=" + this.selectedCategory + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ')';
        }
    }

    /* JADX INFO: renamed from: y33.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ly33/b$b;", "Ly33/b;", "Ltt0/g;", "selectedCategory", "<init>", "(Ltt0/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltt0/g;", "h0", "()Ltt0/g;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Screen implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEReportCategory selectedCategory;

        public Screen(BEReportCategory bEReportCategory) {
            this.selectedCategory = bEReportCategory;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Screen) && fr.t.c(this.selectedCategory, ((Screen) other).selectedCategory);
        }

        @Override // y33.b
        /* JADX INFO: renamed from: h0, reason: from getter */
        public BEReportCategory getSelectedCategory() {
            return this.selectedCategory;
        }

        public int hashCode() {
            return this.selectedCategory.hashCode();
        }

        public String toString() {
            return "Screen(selectedCategory=" + this.selectedCategory + ')';
        }
    }

    /* JADX INFO: renamed from: h0 */
    BEReportCategory getSelectedCategory();
}
