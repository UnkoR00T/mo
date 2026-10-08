package gt2;

import bt2.PeselRestrictionHistoryChecksDetailsDestinationParams;
import java.time.LocalDate;
import mt2.PeselRestrictionHistoryFilterNavParams;
import p071kotlin.Metadata;
import ts0.RestrictionCheck;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lgt2/c;", "", "f", "b", "a", "j", "h", "e", "k", "c", "d", "g", "i", "Lgt2/c$a;", "Lgt2/c$b;", "Lgt2/c$c;", "Lgt2/c$d;", "Lgt2/c$e;", "Lgt2/c$g;", "Lgt2/c$h;", "Lgt2/c$i;", "Lgt2/c$j;", "Lgt2/c$k;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgt2/c$a;", "Lgt2/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f76763a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -328771578;
        }

        public String toString() {
            return "Back";
        }
    }

    /* JADX INFO: renamed from: gt2.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgt2/c$b;", "Lgt2/c;", "Ldx/b;", "domainError", "<init>", "(Ldx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b;", "()Ldx/b;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.b domainError;

        public Error(dx.b bVar) {
            this.domainError = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final dx.b getDomainError() {
            return this.domainError;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && fr.t.c(this.domainError, ((Error) other).domainError);
        }

        public int hashCode() {
            return this.domainError.hashCode();
        }

        public String toString() {
            return "Error(domainError=" + this.domainError + ')';
        }
    }

    /* JADX INFO: renamed from: gt2.c$c, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lgt2/c$c;", "Lgt2/c;", "Ljava/time/LocalDate;", "filterDateFrom", "filterDateTo", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "b", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GetChecksAction implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate filterDateFrom;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate filterDateTo;

        /* JADX WARN: Multi-variable type inference failed */
        public GetChecksAction() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getFilterDateFrom() {
            return this.filterDateFrom;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getFilterDateTo() {
            return this.filterDateTo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetChecksAction)) {
                return false;
            }
            GetChecksAction getChecksAction = (GetChecksAction) other;
            return fr.t.c(this.filterDateFrom, getChecksAction.filterDateFrom) && fr.t.c(this.filterDateTo, getChecksAction.filterDateTo);
        }

        public int hashCode() {
            LocalDate localDate = this.filterDateFrom;
            int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
            LocalDate localDate2 = this.filterDateTo;
            return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
        }

        public String toString() {
            return "GetChecksAction(filterDateFrom=" + this.filterDateFrom + ", filterDateTo=" + this.filterDateTo + ')';
        }

        public GetChecksAction(LocalDate localDate, LocalDate localDate2) {
            this.filterDateFrom = localDate;
            this.filterDateTo = localDate2;
        }

        public /* synthetic */ GetChecksAction(LocalDate localDate, LocalDate localDate2, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : localDate, (i15 & 2) != 0 ? null : localDate2);
        }
    }

    /* JADX INFO: renamed from: gt2.c$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lgt2/c$d;", "Lgt2/c;", "Ljava/time/LocalDate;", "filterDateFrom", "filterDateTo", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "b", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GetStatusChangesAction implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate filterDateFrom;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate filterDateTo;

        /* JADX WARN: Multi-variable type inference failed */
        public GetStatusChangesAction() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getFilterDateFrom() {
            return this.filterDateFrom;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getFilterDateTo() {
            return this.filterDateTo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetStatusChangesAction)) {
                return false;
            }
            GetStatusChangesAction getStatusChangesAction = (GetStatusChangesAction) other;
            return fr.t.c(this.filterDateFrom, getStatusChangesAction.filterDateFrom) && fr.t.c(this.filterDateTo, getStatusChangesAction.filterDateTo);
        }

        public int hashCode() {
            LocalDate localDate = this.filterDateFrom;
            int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
            LocalDate localDate2 = this.filterDateTo;
            return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
        }

        public String toString() {
            return "GetStatusChangesAction(filterDateFrom=" + this.filterDateFrom + ", filterDateTo=" + this.filterDateTo + ')';
        }

        public GetStatusChangesAction(LocalDate localDate, LocalDate localDate2) {
            this.filterDateFrom = localDate;
            this.filterDateTo = localDate2;
        }

        public /* synthetic */ GetStatusChangesAction(LocalDate localDate, LocalDate localDate2, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : localDate, (i15 & 2) != 0 ? null : localDate2);
        }
    }

    /* JADX INFO: renamed from: gt2.c$e, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgt2/c$e;", "Lgt2/c;", "Lit2/a;", "peselRestrictionHistoryControllerState", "<init>", "(Lit2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lit2/a;", "()Lit2/a;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InitializeAction implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final it2.a peselRestrictionHistoryControllerState;

        public InitializeAction(it2.a aVar) {
            this.peselRestrictionHistoryControllerState = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final it2.a getPeselRestrictionHistoryControllerState() {
            return this.peselRestrictionHistoryControllerState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitializeAction) && this.peselRestrictionHistoryControllerState == ((InitializeAction) other).peselRestrictionHistoryControllerState;
        }

        public int hashCode() {
            return this.peselRestrictionHistoryControllerState.hashCode();
        }

        public String toString() {
            return "InitializeAction(peselRestrictionHistoryControllerState=" + this.peselRestrictionHistoryControllerState + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lgt2/c$f;", "", "a", "b", "c", "d", "Lgt2/c$f$a;", "Lgt2/c$f$b;", "Lgt2/c$f$c;", "Lgt2/c$f$d;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface f {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgt2/c$f$a;", "Lgt2/c$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f76770a = new a();

            private a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 890106513;
            }

            public String toString() {
                return "Back";
            }
        }

        /* JADX INFO: renamed from: gt2.c$f$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgt2/c$f$b;", "Lgt2/c$f;", "Ljb4/b;", "errorData", "<init>", "(Ljb4/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljb4/b;", "()Ljb4/b;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final jb4.b errorData;

            public Error(jb4.b bVar) {
                this.errorData = bVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final jb4.b getErrorData() {
                return this.errorData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.errorData, ((Error) other).errorData);
            }

            public int hashCode() {
                return this.errorData.hashCode();
            }

            public String toString() {
                return "Error(errorData=" + this.errorData + ')';
            }
        }

        /* JADX INFO: renamed from: gt2.c$f$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgt2/c$f$c;", "Lgt2/c$f;", "Lmt2/a;", "peselRestrictionHistoryFilterNavParams", "<init>", "(Lmt2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmt2/a;", "()Lmt2/a;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ToFilter implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final PeselRestrictionHistoryFilterNavParams peselRestrictionHistoryFilterNavParams;

            public ToFilter(PeselRestrictionHistoryFilterNavParams peselRestrictionHistoryFilterNavParams) {
                this.peselRestrictionHistoryFilterNavParams = peselRestrictionHistoryFilterNavParams;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final PeselRestrictionHistoryFilterNavParams getPeselRestrictionHistoryFilterNavParams() {
                return this.peselRestrictionHistoryFilterNavParams;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ToFilter) && fr.t.c(this.peselRestrictionHistoryFilterNavParams, ((ToFilter) other).peselRestrictionHistoryFilterNavParams);
            }

            public int hashCode() {
                return this.peselRestrictionHistoryFilterNavParams.hashCode();
            }

            public String toString() {
                return "ToFilter(peselRestrictionHistoryFilterNavParams=" + this.peselRestrictionHistoryFilterNavParams + ')';
            }
        }

        /* JADX INFO: renamed from: gt2.c$f$d, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgt2/c$f$d;", "Lgt2/c$f;", "Lbt2/a;", "peselRestrictionHistoryChecksDetailsDestinationParams", "<init>", "(Lbt2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbt2/a;", "()Lbt2/a;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ToRestrictionCheckDetails implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final PeselRestrictionHistoryChecksDetailsDestinationParams peselRestrictionHistoryChecksDetailsDestinationParams;

            public ToRestrictionCheckDetails(PeselRestrictionHistoryChecksDetailsDestinationParams peselRestrictionHistoryChecksDetailsDestinationParams) {
                this.peselRestrictionHistoryChecksDetailsDestinationParams = peselRestrictionHistoryChecksDetailsDestinationParams;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final PeselRestrictionHistoryChecksDetailsDestinationParams getPeselRestrictionHistoryChecksDetailsDestinationParams() {
                return this.peselRestrictionHistoryChecksDetailsDestinationParams;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ToRestrictionCheckDetails) && fr.t.c(this.peselRestrictionHistoryChecksDetailsDestinationParams, ((ToRestrictionCheckDetails) other).peselRestrictionHistoryChecksDetailsDestinationParams);
            }

            public int hashCode() {
                return this.peselRestrictionHistoryChecksDetailsDestinationParams.hashCode();
            }

            public String toString() {
                return "ToRestrictionCheckDetails(peselRestrictionHistoryChecksDetailsDestinationParams=" + this.peselRestrictionHistoryChecksDetailsDestinationParams + ')';
            }
        }
    }

    /* JADX INFO: renamed from: gt2.c$g, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgt2/c$g;", "Lgt2/c;", "Lit2/a;", "peselRestrictionHistoryControllerState", "<init>", "(Lit2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lit2/a;", "()Lit2/a;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OnRetryAction implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final it2.a peselRestrictionHistoryControllerState;

        /* JADX WARN: Multi-variable type inference failed */
        public OnRetryAction() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final it2.a getPeselRestrictionHistoryControllerState() {
            return this.peselRestrictionHistoryControllerState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnRetryAction) && this.peselRestrictionHistoryControllerState == ((OnRetryAction) other).peselRestrictionHistoryControllerState;
        }

        public int hashCode() {
            it2.a aVar = this.peselRestrictionHistoryControllerState;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            return "OnRetryAction(peselRestrictionHistoryControllerState=" + this.peselRestrictionHistoryControllerState + ')';
        }

        public OnRetryAction(it2.a aVar) {
            this.peselRestrictionHistoryControllerState = aVar;
        }

        public /* synthetic */ OnRetryAction(it2.a aVar, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : aVar);
        }
    }

    /* JADX INFO: renamed from: gt2.c$i, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgt2/c$i;", "Lgt2/c;", "Lmt2/b;", "peselRestrictionNavParams", "<init>", "(Lmt2/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmt2/b;", "()Lmt2/b;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Setup implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final mt2.b peselRestrictionNavParams;

        public Setup(mt2.b bVar) {
            this.peselRestrictionNavParams = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final mt2.b getPeselRestrictionNavParams() {
            return this.peselRestrictionNavParams;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Setup) && fr.t.c(this.peselRestrictionNavParams, ((Setup) other).peselRestrictionNavParams);
        }

        public int hashCode() {
            return this.peselRestrictionNavParams.hashCode();
        }

        public String toString() {
            return "Setup(peselRestrictionNavParams=" + this.peselRestrictionNavParams + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgt2/c$j;", "Lgt2/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class j implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f76779a = new j();

        private j() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof j);
        }

        public int hashCode() {
            return 322860616;
        }

        public String toString() {
            return "ToFilterAction";
        }
    }

    /* JADX INFO: renamed from: gt2.c$k, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgt2/c$k;", "Lgt2/c;", "Lts0/g;", "restrictionCheck", "<init>", "(Lts0/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lts0/g;", "()Lts0/g;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ToRestrictionCheckDetails implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final RestrictionCheck restrictionCheck;

        public ToRestrictionCheckDetails(RestrictionCheck restrictionCheck) {
            this.restrictionCheck = restrictionCheck;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final RestrictionCheck getRestrictionCheck() {
            return this.restrictionCheck;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ToRestrictionCheckDetails) && fr.t.c(this.restrictionCheck, ((ToRestrictionCheckDetails) other).restrictionCheck);
        }

        public int hashCode() {
            return this.restrictionCheck.hashCode();
        }

        public String toString() {
            return "ToRestrictionCheckDetails(restrictionCheck=" + this.restrictionCheck + ')';
        }
    }

    /* JADX INFO: renamed from: gt2.c$h, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lgt2/c$h;", "Lgt2/c;", "Lit2/a;", "peselRestrictionHistoryControllerState", "Ljava/time/LocalDate;", "filterDateFrom", "filterDateTo", "<init>", "(Lit2/a;Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lit2/a;", "c", "()Lit2/a;", "b", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetControllerStateAction implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final it2.a peselRestrictionHistoryControllerState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate filterDateFrom;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate filterDateTo;

        public SetControllerStateAction(it2.a aVar, LocalDate localDate, LocalDate localDate2) {
            this.peselRestrictionHistoryControllerState = aVar;
            this.filterDateFrom = localDate;
            this.filterDateTo = localDate2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getFilterDateFrom() {
            return this.filterDateFrom;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getFilterDateTo() {
            return this.filterDateTo;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final it2.a getPeselRestrictionHistoryControllerState() {
            return this.peselRestrictionHistoryControllerState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetControllerStateAction)) {
                return false;
            }
            SetControllerStateAction setControllerStateAction = (SetControllerStateAction) other;
            return this.peselRestrictionHistoryControllerState == setControllerStateAction.peselRestrictionHistoryControllerState && fr.t.c(this.filterDateFrom, setControllerStateAction.filterDateFrom) && fr.t.c(this.filterDateTo, setControllerStateAction.filterDateTo);
        }

        public int hashCode() {
            int iHashCode = this.peselRestrictionHistoryControllerState.hashCode() * 31;
            LocalDate localDate = this.filterDateFrom;
            int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
            LocalDate localDate2 = this.filterDateTo;
            return iHashCode2 + (localDate2 != null ? localDate2.hashCode() : 0);
        }

        public String toString() {
            return "SetControllerStateAction(peselRestrictionHistoryControllerState=" + this.peselRestrictionHistoryControllerState + ", filterDateFrom=" + this.filterDateFrom + ", filterDateTo=" + this.filterDateTo + ')';
        }

        public /* synthetic */ SetControllerStateAction(it2.a aVar, LocalDate localDate, LocalDate localDate2, int i15, fr.k kVar) {
            this(aVar, (i15 & 2) != 0 ? null : localDate, (i15 & 4) != 0 ? null : localDate2);
        }
    }
}
