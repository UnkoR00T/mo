package ct2;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lct2/b;", "", "a", "b", "Lct2/b$a;", "Lct2/b$b;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lct2/b$a;", "Lct2/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f37763a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -1800542464;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: ct2.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJZ\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b-\u0010)R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010+\u001a\u0004\b.\u0010,¨\u0006/"}, d2 = {"Lct2/b$b;", "Lct2/b;", "Lft2/b;", "id", "Lit2/a;", "peselRestrictionHistoryControllerState", "Lws2/e$d;", "datePickerResult", "Ljava/time/LocalDate;", "fromDate", "Lhz/b;", "fromDateValidationState", "toDate", "toDateValidationState", "<init>", "(Lft2/b;Lit2/a;Lws2/e$d;Ljava/time/LocalDate;Lhz/b;Ljava/time/LocalDate;Lhz/b;)V", "a", "(Lft2/b;Lit2/a;Lws2/e$d;Ljava/time/LocalDate;Lhz/b;Ljava/time/LocalDate;Lhz/b;)Lct2/b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lft2/b;", "f", "()Lft2/b;", "b", "Lit2/a;", "g", "()Lit2/a;", "c", "Lws2/e$d;", "()Lws2/e$d;", "d", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "e", "Lhz/b;", "()Lhz/b;", "h", "i", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ft2.b id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final it2.a peselRestrictionHistoryControllerState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ws2.e.Result datePickerResult;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate fromDate;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b fromDateValidationState;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate toDate;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b toDateValidationState;

        public Initialized(ft2.b bVar, it2.a aVar, ws2.e.Result result, LocalDate localDate, hz.b bVar2, LocalDate localDate2, hz.b bVar3) {
            this.id = bVar;
            this.peselRestrictionHistoryControllerState = aVar;
            this.datePickerResult = result;
            this.fromDate = localDate;
            this.fromDateValidationState = bVar2;
            this.toDate = localDate2;
            this.toDateValidationState = bVar3;
        }

        public static /* synthetic */ Initialized b(Initialized initialized, ft2.b bVar, it2.a aVar, ws2.e.Result result, LocalDate localDate, hz.b bVar2, LocalDate localDate2, hz.b bVar3, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                bVar = initialized.id;
            }
            if ((i15 & 2) != 0) {
                aVar = initialized.peselRestrictionHistoryControllerState;
            }
            if ((i15 & 4) != 0) {
                result = initialized.datePickerResult;
            }
            if ((i15 & 8) != 0) {
                localDate = initialized.fromDate;
            }
            if ((i15 & 16) != 0) {
                bVar2 = initialized.fromDateValidationState;
            }
            if ((i15 & 32) != 0) {
                localDate2 = initialized.toDate;
            }
            if ((i15 & 64) != 0) {
                bVar3 = initialized.toDateValidationState;
            }
            LocalDate localDate3 = localDate2;
            hz.b bVar4 = bVar3;
            hz.b bVar5 = bVar2;
            ws2.e.Result result2 = result;
            return initialized.a(bVar, aVar, result2, localDate, bVar5, localDate3, bVar4);
        }

        public final Initialized a(ft2.b id5, it2.a peselRestrictionHistoryControllerState, ws2.e.Result datePickerResult, LocalDate fromDate, hz.b fromDateValidationState, LocalDate toDate, hz.b toDateValidationState) {
            return new Initialized(id5, peselRestrictionHistoryControllerState, datePickerResult, fromDate, fromDateValidationState, toDate, toDateValidationState);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ws2.e.Result getDatePickerResult() {
            return this.datePickerResult;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LocalDate getFromDate() {
            return this.fromDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final hz.b getFromDateValidationState() {
            return this.fromDateValidationState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.id, initialized.id) && this.peselRestrictionHistoryControllerState == initialized.peselRestrictionHistoryControllerState && fr.t.c(this.datePickerResult, initialized.datePickerResult) && fr.t.c(this.fromDate, initialized.fromDate) && fr.t.c(this.fromDateValidationState, initialized.fromDateValidationState) && fr.t.c(this.toDate, initialized.toDate) && fr.t.c(this.toDateValidationState, initialized.toDateValidationState);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ft2.b getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final it2.a getPeselRestrictionHistoryControllerState() {
            return this.peselRestrictionHistoryControllerState;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final LocalDate getToDate() {
            return this.toDate;
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.peselRestrictionHistoryControllerState.hashCode()) * 31) + this.datePickerResult.hashCode()) * 31;
            LocalDate localDate = this.fromDate;
            int iHashCode2 = (((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31) + this.fromDateValidationState.hashCode()) * 31;
            LocalDate localDate2 = this.toDate;
            return ((iHashCode2 + (localDate2 != null ? localDate2.hashCode() : 0)) * 31) + this.toDateValidationState.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final hz.b getToDateValidationState() {
            return this.toDateValidationState;
        }

        public String toString() {
            return "Initialized(id=" + this.id + ", peselRestrictionHistoryControllerState=" + this.peselRestrictionHistoryControllerState + ", datePickerResult=" + this.datePickerResult + ", fromDate=" + this.fromDate + ", fromDateValidationState=" + this.fromDateValidationState + ", toDate=" + this.toDate + ", toDateValidationState=" + this.toDateValidationState + ')';
        }

        public /* synthetic */ Initialized(ft2.b bVar, it2.a aVar, ws2.e.Result result, LocalDate localDate, hz.b bVar2, LocalDate localDate2, hz.b bVar3, int i15, fr.k kVar) {
            this(bVar, aVar, result, (i15 & 8) != 0 ? null : localDate, (i15 & 16) != 0 ? hz.b.C2039b.f86846c : bVar2, (i15 & 32) != 0 ? null : localDate2, (i15 & 64) != 0 ? hz.b.C2039b.f86846c : bVar3);
        }
    }
}
