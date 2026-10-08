package i43;

import f43.ChildStudent;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Li43/b;", "", "c", "a", "b", "Li43/b$a;", "Li43/b$b;", "Li43/b$c;", "schooldashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: i43.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Li43/b$a;", "Li43/b;", "Lf43/a;", "child", "", "isSchoolInfoFlagEnabled", "<init>", "(Lf43/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lf43/a;", "()Lf43/a;", "b", "Z", "()Z", "schooldashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DisplayingChildDashboard implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ChildStudent child;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSchoolInfoFlagEnabled;

        public DisplayingChildDashboard(ChildStudent childStudent, boolean z15) {
            this.child = childStudent;
            this.isSchoolInfoFlagEnabled = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ChildStudent getChild() {
            return this.child;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsSchoolInfoFlagEnabled() {
            return this.isSchoolInfoFlagEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisplayingChildDashboard)) {
                return false;
            }
            DisplayingChildDashboard displayingChildDashboard = (DisplayingChildDashboard) other;
            return fr.t.c(this.child, displayingChildDashboard.child) && this.isSchoolInfoFlagEnabled == displayingChildDashboard.isSchoolInfoFlagEnabled;
        }

        public int hashCode() {
            return (this.child.hashCode() * 31) + Boolean.hashCode(this.isSchoolInfoFlagEnabled);
        }

        public String toString() {
            return "DisplayingChildDashboard(child=" + this.child + ", isSchoolInfoFlagEnabled=" + this.isSchoolInfoFlagEnabled + ')';
        }
    }

    /* JADX INFO: renamed from: i43.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Li43/b$b;", "Li43/b;", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "schooldashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ErrorChildDashboard implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMSAdapter;

        public ErrorChildDashboard(hb4.c cVar) {
            this.errorVMSAdapter = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final hb4.c getErrorVMSAdapter() {
            return this.errorVMSAdapter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ErrorChildDashboard) && fr.t.c(this.errorVMSAdapter, ((ErrorChildDashboard) other).errorVMSAdapter);
        }

        public int hashCode() {
            return this.errorVMSAdapter.hashCode();
        }

        public String toString() {
            return "ErrorChildDashboard(errorVMSAdapter=" + this.errorVMSAdapter + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Li43/b$c;", "Li43/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "schooldashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f89224a = new c();

        private c() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return 1447662223;
        }

        public String toString() {
            return "LoadingChildDashboard";
        }
    }
}
