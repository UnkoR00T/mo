package gt2;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lgt2/d;", "", "a", "b", "Lgt2/d$a;", "Lgt2/d$b;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgt2/d$a;", "Lgt2/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f76784a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 1191239502;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: gt2.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\"\u0010!¨\u0006#"}, d2 = {"Lgt2/d$b;", "Lgt2/d;", "Lit2/a;", "peselRestrictionHistoryControllerState", "Liy/b0;", "userPesel", "Ljava/time/LocalDate;", "filterDateFrom", "filterDateTo", "<init>", "(Lit2/a;Liy/b0;Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "a", "(Lit2/a;Liy/b0;Ljava/time/LocalDate;Ljava/time/LocalDate;)Lgt2/d$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lit2/a;", "e", "()Lit2/a;", "b", "Liy/b0;", "f", "()Liy/b0;", "c", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "d", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final it2.a peselRestrictionHistoryControllerState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 userPesel;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate filterDateFrom;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate filterDateTo;

        public Initialized(it2.a aVar, iy.b0 b0Var, LocalDate localDate, LocalDate localDate2) {
            this.peselRestrictionHistoryControllerState = aVar;
            this.userPesel = b0Var;
            this.filterDateFrom = localDate;
            this.filterDateTo = localDate2;
        }

        public static /* synthetic */ Initialized b(Initialized initialized, it2.a aVar, iy.b0 b0Var, LocalDate localDate, LocalDate localDate2, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                aVar = initialized.peselRestrictionHistoryControllerState;
            }
            if ((i15 & 2) != 0) {
                b0Var = initialized.userPesel;
            }
            if ((i15 & 4) != 0) {
                localDate = initialized.filterDateFrom;
            }
            if ((i15 & 8) != 0) {
                localDate2 = initialized.filterDateTo;
            }
            return initialized.a(aVar, b0Var, localDate, localDate2);
        }

        public final Initialized a(it2.a peselRestrictionHistoryControllerState, iy.b0 userPesel, LocalDate filterDateFrom, LocalDate filterDateTo) {
            return new Initialized(peselRestrictionHistoryControllerState, userPesel, filterDateFrom, filterDateTo);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LocalDate getFilterDateFrom() {
            return this.filterDateFrom;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LocalDate getFilterDateTo() {
            return this.filterDateTo;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final it2.a getPeselRestrictionHistoryControllerState() {
            return this.peselRestrictionHistoryControllerState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return this.peselRestrictionHistoryControllerState == initialized.peselRestrictionHistoryControllerState && fr.t.c(this.userPesel, initialized.userPesel) && fr.t.c(this.filterDateFrom, initialized.filterDateFrom) && fr.t.c(this.filterDateTo, initialized.filterDateTo);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final iy.b0 getUserPesel() {
            return this.userPesel;
        }

        public int hashCode() {
            int iHashCode = ((this.peselRestrictionHistoryControllerState.hashCode() * 31) + this.userPesel.hashCode()) * 31;
            LocalDate localDate = this.filterDateFrom;
            int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
            LocalDate localDate2 = this.filterDateTo;
            return iHashCode2 + (localDate2 != null ? localDate2.hashCode() : 0);
        }

        public String toString() {
            return "Initialized(peselRestrictionHistoryControllerState=" + this.peselRestrictionHistoryControllerState + ", userPesel=" + this.userPesel + ", filterDateFrom=" + this.filterDateFrom + ", filterDateTo=" + this.filterDateTo + ')';
        }

        public /* synthetic */ Initialized(it2.a aVar, iy.b0 b0Var, LocalDate localDate, LocalDate localDate2, int i15, fr.k kVar) {
            this(aVar, b0Var, (i15 & 4) != 0 ? null : localDate, (i15 & 8) != 0 ? null : localDate2);
        }
    }
}
