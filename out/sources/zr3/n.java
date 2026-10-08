package zr3;

import cj0.BookedZusEVisitSummary;
import cj0.ZusEVisitDepartment;
import cj0.ZusEVisitTopic;
import p071kotlin.Metadata;
import ss3.SummaryData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H&¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lzr3/n;", "Lzx/d;", "Lzr3/m;", "Lzr3/n$a;", "Lss3/b;", "summaryData", "Loq/i0;", "A7", "(Lss3/b;)V", "", "route", "P4", "(Ljava/lang/String;)V", "Lcj0/e;", "bookedData", "I8", "(Lcj0/e;)V", "f7", "()V", "Lxw/b;", "Lzr3/m$b;", "g", "()Lxw/b;", "nestedNavAction", "Lmu/g;", "c", "()Lmu/g;", "a", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface n extends zx.d<m, a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lzr3/n$a;", "", "Lss3/a;", "newVisitState", "<init>", "(Lss3/a;)V", "a", "Lss3/a;", "()Lss3/a;", "b", "Lzr3/n$a$a;", "Lzr3/n$a$b;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ss3.a newVisitState;

        /* JADX INFO: renamed from: zr3.n$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lzr3/n$a$a;", "Lzr3/n$a;", "Liy/b0;", "defaultPostcode", "<init>", "(Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Liy/b0;", "()Liy/b0;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NewVisit extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f236540c = iy.b0.f97726c;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 defaultPostcode;

            public NewVisit(iy.b0 b0Var) {
                super(ss3.a.NEW_VISIT, null);
                this.defaultPostcode = b0Var;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final iy.b0 getDefaultPostcode() {
                return this.defaultPostcode;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NewVisit) && fr.t.c(this.defaultPostcode, ((NewVisit) other).defaultPostcode);
            }

            public int hashCode() {
                iy.b0 b0Var = this.defaultPostcode;
                if (b0Var == null) {
                    return 0;
                }
                return b0Var.hashCode();
            }

            public String toString() {
                return "NewVisit(defaultPostcode=" + this.defaultPostcode + ')';
            }
        }

        /* JADX INFO: renamed from: zr3.n$a$b, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lzr3/n$a$b;", "Lzr3/n$a;", "Lcj0/n;", "redoVisitTopic", "Lcj0/h;", "redoVisitDepartment", "<init>", "(Lcj0/n;Lcj0/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcj0/n;", "c", "()Lcj0/n;", "Lcj0/h;", "()Lcj0/h;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RedoVisit extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ZusEVisitTopic redoVisitTopic;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final ZusEVisitDepartment redoVisitDepartment;

            public RedoVisit(ZusEVisitTopic zusEVisitTopic, ZusEVisitDepartment zusEVisitDepartment) {
                super(ss3.a.REDO_VISIT, null);
                this.redoVisitTopic = zusEVisitTopic;
                this.redoVisitDepartment = zusEVisitDepartment;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ZusEVisitDepartment getRedoVisitDepartment() {
                return this.redoVisitDepartment;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ZusEVisitTopic getRedoVisitTopic() {
                return this.redoVisitTopic;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RedoVisit)) {
                    return false;
                }
                RedoVisit redoVisit = (RedoVisit) other;
                return fr.t.c(this.redoVisitTopic, redoVisit.redoVisitTopic) && fr.t.c(this.redoVisitDepartment, redoVisit.redoVisitDepartment);
            }

            public int hashCode() {
                ZusEVisitTopic zusEVisitTopic = this.redoVisitTopic;
                int iHashCode = (zusEVisitTopic == null ? 0 : zusEVisitTopic.hashCode()) * 31;
                ZusEVisitDepartment zusEVisitDepartment = this.redoVisitDepartment;
                return iHashCode + (zusEVisitDepartment != null ? zusEVisitDepartment.hashCode() : 0);
            }

            public String toString() {
                return "RedoVisit(redoVisitTopic=" + this.redoVisitTopic + ", redoVisitDepartment=" + this.redoVisitDepartment + ')';
            }
        }

        public /* synthetic */ a(ss3.a aVar, fr.k kVar) {
            this(aVar);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ss3.a getNewVisitState() {
            return this.newVisitState;
        }

        private a(ss3.a aVar) {
            this.newVisitState = aVar;
        }
    }

    void A7(SummaryData summaryData);

    void I8(BookedZusEVisitSummary bookedData);

    void P4(String route);

    mu.g<SummaryData> c();

    void f7();

    xw.b<m.b> g();
}
