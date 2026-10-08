package fs3;

import cj0.ZusEVisitCollectiveDepartments;
import cj0.ZusEVisitDepartment;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lfs3/b;", "", "a", "b", "Lfs3/b$a;", "Lfs3/b$b;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfs3/b$a;", "Lfs3/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f66890a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 471373650;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: fs3.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ2\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lfs3/b$b;", "Lfs3/b;", "Lcj0/g;", "departments", "Lcj0/h;", "selectedDepartment", "Lhs3/a;", "selectedRadio", "<init>", "(Lcj0/g;Lcj0/h;Lhs3/a;)V", "a", "(Lcj0/g;Lcj0/h;Lhs3/a;)Lfs3/b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcj0/g;", "c", "()Lcj0/g;", "b", "Lcj0/h;", "d", "()Lcj0/h;", "Lhs3/a;", "e", "()Lhs3/a;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ZusEVisitCollectiveDepartments departments;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ZusEVisitDepartment selectedDepartment;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final hs3.a selectedRadio;

        public Initialized(ZusEVisitCollectiveDepartments zusEVisitCollectiveDepartments, ZusEVisitDepartment zusEVisitDepartment, hs3.a aVar) {
            this.departments = zusEVisitCollectiveDepartments;
            this.selectedDepartment = zusEVisitDepartment;
            this.selectedRadio = aVar;
        }

        public static /* synthetic */ Initialized b(Initialized initialized, ZusEVisitCollectiveDepartments zusEVisitCollectiveDepartments, ZusEVisitDepartment zusEVisitDepartment, hs3.a aVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                zusEVisitCollectiveDepartments = initialized.departments;
            }
            if ((i15 & 2) != 0) {
                zusEVisitDepartment = initialized.selectedDepartment;
            }
            if ((i15 & 4) != 0) {
                aVar = initialized.selectedRadio;
            }
            return initialized.a(zusEVisitCollectiveDepartments, zusEVisitDepartment, aVar);
        }

        public final Initialized a(ZusEVisitCollectiveDepartments departments, ZusEVisitDepartment selectedDepartment, hs3.a selectedRadio) {
            return new Initialized(departments, selectedDepartment, selectedRadio);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ZusEVisitCollectiveDepartments getDepartments() {
            return this.departments;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ZusEVisitDepartment getSelectedDepartment() {
            return this.selectedDepartment;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final hs3.a getSelectedRadio() {
            return this.selectedRadio;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return t.c(this.departments, initialized.departments) && t.c(this.selectedDepartment, initialized.selectedDepartment) && this.selectedRadio == initialized.selectedRadio;
        }

        public int hashCode() {
            int iHashCode = this.departments.hashCode() * 31;
            ZusEVisitDepartment zusEVisitDepartment = this.selectedDepartment;
            int iHashCode2 = (iHashCode + (zusEVisitDepartment == null ? 0 : zusEVisitDepartment.hashCode())) * 31;
            hs3.a aVar = this.selectedRadio;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }

        public String toString() {
            return "Initialized(departments=" + this.departments + ", selectedDepartment=" + this.selectedDepartment + ", selectedRadio=" + this.selectedRadio + ')';
        }

        public /* synthetic */ Initialized(ZusEVisitCollectiveDepartments zusEVisitCollectiveDepartments, ZusEVisitDepartment zusEVisitDepartment, hs3.a aVar, int i15, fr.k kVar) {
            this(zusEVisitCollectiveDepartments, (i15 & 2) != 0 ? null : zusEVisitDepartment, (i15 & 4) != 0 ? null : aVar);
        }
    }
}
