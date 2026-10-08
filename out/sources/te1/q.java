package te1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\t\n\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lte1/q;", "", "Lte1/p;", "formData", "<init>", "(Lte1/p;)V", "a", "Lte1/p;", "()Lte1/p;", "b", "c", "Lte1/q$a;", "Lte1/q$b;", "Lte1/q$c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FormData formData;

    /* JADX INFO: renamed from: te1.q$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lte1/q$a;", "Lte1/q;", "Lcb4/i;", "dialogVMSAdapter", "Lte1/p;", "formData", "<init>", "(Lcb4/i;Lte1/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcb4/i;", "()Lcb4/i;", "c", "Lte1/p;", "a", "()Lte1/p;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dialog extends q {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialogVMSAdapter;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormData formData;

        public Dialog(cb4.i iVar, FormData formData) {
            super(formData, null);
            this.dialogVMSAdapter = iVar;
            this.formData = formData;
        }

        @Override // te1.q
        /* JADX INFO: renamed from: a, reason: from getter */
        public FormData getFormData() {
            return this.formData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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
            return fr.t.c(this.dialogVMSAdapter, dialog.dialogVMSAdapter) && fr.t.c(this.formData, dialog.formData);
        }

        public int hashCode() {
            return (this.dialogVMSAdapter.hashCode() * 31) + this.formData.hashCode();
        }

        public String toString() {
            return "Dialog(dialogVMSAdapter=" + this.dialogVMSAdapter + ", formData=" + this.formData + ')';
        }
    }

    /* JADX INFO: renamed from: te1.q$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lte1/q$b;", "Lte1/q;", "Lte1/p;", "formData", "<init>", "(Lte1/p;)V", "b", "(Lte1/p;)Lte1/q$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lte1/p;", "a", "()Lte1/p;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized extends q {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormData formData;

        public Initialized(FormData formData) {
            super(formData, null);
            this.formData = formData;
        }

        @Override // te1.q
        /* JADX INFO: renamed from: a, reason: from getter */
        public FormData getFormData() {
            return this.formData;
        }

        public final Initialized b(FormData formData) {
            return new Initialized(formData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initialized) && fr.t.c(this.formData, ((Initialized) other).formData);
        }

        public int hashCode() {
            return this.formData.hashCode();
        }

        public String toString() {
            return "Initialized(formData=" + this.formData + ')';
        }
    }

    /* JADX INFO: renamed from: te1.q$c, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lte1/q$c;", "Lte1/q;", "Lte1/p$a;", "selectedPkdCodeItem", "Lte1/p;", "formData", "<init>", "(Lte1/p$a;Lte1/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lte1/p$a;", "()Lte1/p$a;", "c", "Lte1/p;", "a", "()Lte1/p;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoreInfo extends q {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormData.PkdCodeItem selectedPkdCodeItem;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormData formData;

        public MoreInfo(FormData.PkdCodeItem pkdCodeItem, FormData formData) {
            super(formData, null);
            this.selectedPkdCodeItem = pkdCodeItem;
            this.formData = formData;
        }

        @Override // te1.q
        /* JADX INFO: renamed from: a, reason: from getter */
        public FormData getFormData() {
            return this.formData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final FormData.PkdCodeItem getSelectedPkdCodeItem() {
            return this.selectedPkdCodeItem;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MoreInfo)) {
                return false;
            }
            MoreInfo moreInfo = (MoreInfo) other;
            return fr.t.c(this.selectedPkdCodeItem, moreInfo.selectedPkdCodeItem) && fr.t.c(this.formData, moreInfo.formData);
        }

        public int hashCode() {
            return (this.selectedPkdCodeItem.hashCode() * 31) + this.formData.hashCode();
        }

        public String toString() {
            return "MoreInfo(selectedPkdCodeItem=" + this.selectedPkdCodeItem + ", formData=" + this.formData + ')';
        }
    }

    public /* synthetic */ q(FormData formData, fr.k kVar) {
        this(formData);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public FormData getFormData() {
        return this.formData;
    }

    private q(FormData formData) {
        this.formData = formData;
    }
}
