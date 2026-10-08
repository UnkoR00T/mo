package r33;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lr33/d;", "", "Lr33/c;", "a", "()Lr33/c;", "form", "b", "Lr33/d$a;", "Lr33/d$b;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: r33.d$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lr33/d$a;", "Lr33/d;", "Lr33/c;", "form", "Lcb4/i;", "dialogVMSAdapter", "<init>", "(Lr33/c;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lr33/c;", "()Lr33/c;", "b", "Lcb4/i;", "()Lcb4/i;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dialog implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Form form;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialogVMSAdapter;

        public Dialog(Form form, cb4.i iVar) {
            this.form = form;
            this.dialogVMSAdapter = iVar;
        }

        @Override // r33.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public Form getForm() {
            return this.form;
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
            return fr.t.c(this.form, dialog.form) && fr.t.c(this.dialogVMSAdapter, dialog.dialogVMSAdapter);
        }

        public int hashCode() {
            return (this.form.hashCode() * 31) + this.dialogVMSAdapter.hashCode();
        }

        public String toString() {
            return "Dialog(form=" + this.form + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    Form getForm();

    /* JADX INFO: renamed from: r33.d$b, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lr33/d$b;", "Lr33/d;", "Lr33/c;", "form", "Ld60/j;", "Lr33/b;", "scrollInstance", "<init>", "(Lr33/c;Ld60/j;)V", "b", "(Lr33/c;Ld60/j;)Lr33/d$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lr33/c;", "()Lr33/c;", "Ld60/j;", "d", "()Ld60/j;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Screen implements d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f171376c = hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Form form;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final d60.j<b> scrollInstance;

        public Screen(Form form, d60.j<b> jVar) {
            this.form = form;
            this.scrollInstance = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Screen c(Screen screen, Form form, d60.j jVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                form = screen.form;
            }
            if ((i15 & 2) != 0) {
                jVar = screen.scrollInstance;
            }
            return screen.b(form, jVar);
        }

        @Override // r33.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public Form getForm() {
            return this.form;
        }

        public final Screen b(Form form, d60.j<b> scrollInstance) {
            return new Screen(form, scrollInstance);
        }

        public final d60.j<b> d() {
            return this.scrollInstance;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) other;
            return fr.t.c(this.form, screen.form) && fr.t.c(this.scrollInstance, screen.scrollInstance);
        }

        public int hashCode() {
            int iHashCode = this.form.hashCode() * 31;
            d60.j<b> jVar = this.scrollInstance;
            return iHashCode + (jVar == null ? 0 : jVar.hashCode());
        }

        public String toString() {
            return "Screen(form=" + this.form + ", scrollInstance=" + this.scrollInstance + ')';
        }

        public /* synthetic */ Screen(Form form, d60.j jVar, int i15, fr.k kVar) {
            this(form, (i15 & 2) != 0 ? null : jVar);
        }
    }
}
