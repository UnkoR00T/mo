package hg1;

import java.time.LocalDate;
import na1.CompanySuspensionOptions;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lhg1/m;", "", "d", "e", "c", "a", "b", "Lhg1/m$a;", "Lhg1/m$b;", "Lhg1/m$c;", "Lhg1/m$d;", "Lhg1/m$e;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface m {

    /* JADX INFO: renamed from: hg1.m$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lhg1/m$a;", "Lhg1/m;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "b", "()Lhb4/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ErrorInitial implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        public ErrorInitial(hb4.c cVar) {
            this.errorVMS = cVar;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ErrorInitial) && fr.t.c(this.errorVMS, ((ErrorInitial) other).errorVMS);
        }

        public int hashCode() {
            return this.errorVMS.hashCode();
        }

        public String toString() {
            return "ErrorInitial(errorVMS=" + this.errorVMS + ')';
        }
    }

    /* JADX INFO: renamed from: hg1.m$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lhg1/m$b;", "Lhg1/m;", "Lhg1/m$e;", "data", "Lhb4/c;", "errorVMS", "<init>", "(Lhg1/m$e;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhg1/m$e;", "b", "()Lhg1/m$e;", "Lhb4/c;", "c", "()Lhb4/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ErrorInitialized implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        public ErrorInitialized(e eVar, hb4.c cVar) {
            this.data = eVar;
            this.errorVMS = cVar;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final e getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorInitialized)) {
                return false;
            }
            ErrorInitialized errorInitialized = (ErrorInitialized) other;
            return fr.t.c(this.data, errorInitialized.data) && fr.t.c(this.errorVMS, errorInitialized.errorVMS);
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + this.errorVMS.hashCode();
        }

        public String toString() {
            return "ErrorInitialized(data=" + this.data + ", errorVMS=" + this.errorVMS + ')';
        }
    }

    /* JADX INFO: renamed from: hg1.m$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lhg1/m$c;", "Lhg1/m;", "Lhg1/m$e;", "data", "<init>", "(Lhg1/m$e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhg1/m$e;", "b", "()Lhg1/m$e;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GetCitizenData implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e data;

        public GetCitizenData(e eVar) {
            this.data = eVar;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final e getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetCitizenData) && fr.t.c(this.data, ((GetCitizenData) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "GetCitizenData(data=" + this.data + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhg1/m$d;", "Lhg1/m;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f84395a = new d();

        private d() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return 1935080159;
        }

        public String toString() {
            return "GetCompanyDetails";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lhg1/m$e;", "Lhg1/m;", "", "a", "()Z", "isPkdCodesUpdateRequired", "b", "Lhg1/m$e$a;", "Lhg1/m$e$b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface e extends m {
        /* JADX INFO: renamed from: a */
        boolean getIsPkdCodesUpdateRequired();

        /* JADX INFO: renamed from: hg1.m$e$a, reason: from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u0017\u0010!¨\u0006\""}, d2 = {"Lhg1/m$e$a;", "Lhg1/m$e;", "Ljava/time/LocalDate;", "minResumptionDate", "startResumptionDate", "Lna1/a;", "suspensionPeriodSelection", "", "isPkdCodesUpdateRequired", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Lna1/a;Z)V", "b", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Lna1/a;Z)Lhg1/m$e$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "d", "()Ljava/time/LocalDate;", "e", "c", "Lna1/a;", "getSuspensionPeriodSelection", "()Lna1/a;", "Z", "()Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Resumption implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final LocalDate minResumptionDate;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final LocalDate startResumptionDate;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final na1.a suspensionPeriodSelection;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isPkdCodesUpdateRequired;

            public Resumption(LocalDate localDate, LocalDate localDate2, na1.a aVar, boolean z15) {
                this.minResumptionDate = localDate;
                this.startResumptionDate = localDate2;
                this.suspensionPeriodSelection = aVar;
                this.isPkdCodesUpdateRequired = z15;
            }

            public static /* synthetic */ Resumption c(Resumption resumption, LocalDate localDate, LocalDate localDate2, na1.a aVar, boolean z15, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    localDate = resumption.minResumptionDate;
                }
                if ((i15 & 2) != 0) {
                    localDate2 = resumption.startResumptionDate;
                }
                if ((i15 & 4) != 0) {
                    aVar = resumption.suspensionPeriodSelection;
                }
                if ((i15 & 8) != 0) {
                    z15 = resumption.isPkdCodesUpdateRequired;
                }
                return resumption.b(localDate, localDate2, aVar, z15);
            }

            @Override // hg1.m.e
            /* JADX INFO: renamed from: a, reason: from getter */
            public boolean getIsPkdCodesUpdateRequired() {
                return this.isPkdCodesUpdateRequired;
            }

            public final Resumption b(LocalDate minResumptionDate, LocalDate startResumptionDate, na1.a suspensionPeriodSelection, boolean isPkdCodesUpdateRequired) {
                return new Resumption(minResumptionDate, startResumptionDate, suspensionPeriodSelection, isPkdCodesUpdateRequired);
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final LocalDate getMinResumptionDate() {
                return this.minResumptionDate;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final LocalDate getStartResumptionDate() {
                return this.startResumptionDate;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Resumption)) {
                    return false;
                }
                Resumption resumption = (Resumption) other;
                return fr.t.c(this.minResumptionDate, resumption.minResumptionDate) && fr.t.c(this.startResumptionDate, resumption.startResumptionDate) && this.suspensionPeriodSelection == resumption.suspensionPeriodSelection && this.isPkdCodesUpdateRequired == resumption.isPkdCodesUpdateRequired;
            }

            public int hashCode() {
                int iHashCode = ((this.minResumptionDate.hashCode() * 31) + this.startResumptionDate.hashCode()) * 31;
                na1.a aVar = this.suspensionPeriodSelection;
                return ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + Boolean.hashCode(this.isPkdCodesUpdateRequired);
            }

            public String toString() {
                return "Resumption(minResumptionDate=" + this.minResumptionDate + ", startResumptionDate=" + this.startResumptionDate + ", suspensionPeriodSelection=" + this.suspensionPeriodSelection + ", isPkdCodesUpdateRequired=" + this.isPkdCodesUpdateRequired + ')';
            }

            public /* synthetic */ Resumption(LocalDate localDate, LocalDate localDate2, na1.a aVar, boolean z15, int i15, fr.k kVar) {
                this(localDate, localDate2, (i15 & 4) != 0 ? null : aVar, z15);
            }
        }

        /* JADX INFO: renamed from: hg1.m$e$b, reason: from toString */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJZ\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010,\u001a\u0004\b\u001c\u0010-¨\u0006."}, d2 = {"Lhg1/m$e$b;", "Lhg1/m$e;", "Lna1/b;", "companySuspensionOptions", "Ljava/time/LocalDate;", "startSuspensionDate", "endSuspensionDate", "minStartSuspensionDate", "", "minSuspensionDays", "Lna1/a;", "suspensionPeriodSelection", "", "isPkdCodesUpdateRequired", "<init>", "(Lna1/b;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;JLna1/a;Z)V", "b", "(Lna1/b;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;JLna1/a;Z)Lhg1/m$e$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lna1/b;", "getCompanySuspensionOptions", "()Lna1/b;", "Ljava/time/LocalDate;", "g", "()Ljava/time/LocalDate;", "c", "d", "e", "J", "f", "()J", "Lna1/a;", "h", "()Lna1/a;", "Z", "()Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Suspension implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final CompanySuspensionOptions companySuspensionOptions;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final LocalDate startSuspensionDate;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final LocalDate endSuspensionDate;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final LocalDate minStartSuspensionDate;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final long minSuspensionDays;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final na1.a suspensionPeriodSelection;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isPkdCodesUpdateRequired;

            public Suspension(CompanySuspensionOptions companySuspensionOptions, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, long j15, na1.a aVar, boolean z15) {
                this.companySuspensionOptions = companySuspensionOptions;
                this.startSuspensionDate = localDate;
                this.endSuspensionDate = localDate2;
                this.minStartSuspensionDate = localDate3;
                this.minSuspensionDays = j15;
                this.suspensionPeriodSelection = aVar;
                this.isPkdCodesUpdateRequired = z15;
            }

            public static /* synthetic */ Suspension c(Suspension suspension, CompanySuspensionOptions companySuspensionOptions, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, long j15, na1.a aVar, boolean z15, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    companySuspensionOptions = suspension.companySuspensionOptions;
                }
                if ((i15 & 2) != 0) {
                    localDate = suspension.startSuspensionDate;
                }
                if ((i15 & 4) != 0) {
                    localDate2 = suspension.endSuspensionDate;
                }
                if ((i15 & 8) != 0) {
                    localDate3 = suspension.minStartSuspensionDate;
                }
                if ((i15 & 16) != 0) {
                    j15 = suspension.minSuspensionDays;
                }
                if ((i15 & 32) != 0) {
                    aVar = suspension.suspensionPeriodSelection;
                }
                if ((i15 & 64) != 0) {
                    z15 = suspension.isPkdCodesUpdateRequired;
                }
                long j16 = j15;
                LocalDate localDate4 = localDate2;
                LocalDate localDate5 = localDate3;
                return suspension.b(companySuspensionOptions, localDate, localDate4, localDate5, j16, aVar, z15);
            }

            @Override // hg1.m.e
            /* JADX INFO: renamed from: a, reason: from getter */
            public boolean getIsPkdCodesUpdateRequired() {
                return this.isPkdCodesUpdateRequired;
            }

            public final Suspension b(CompanySuspensionOptions companySuspensionOptions, LocalDate startSuspensionDate, LocalDate endSuspensionDate, LocalDate minStartSuspensionDate, long minSuspensionDays, na1.a suspensionPeriodSelection, boolean isPkdCodesUpdateRequired) {
                return new Suspension(companySuspensionOptions, startSuspensionDate, endSuspensionDate, minStartSuspensionDate, minSuspensionDays, suspensionPeriodSelection, isPkdCodesUpdateRequired);
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final LocalDate getEndSuspensionDate() {
                return this.endSuspensionDate;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final LocalDate getMinStartSuspensionDate() {
                return this.minStartSuspensionDate;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Suspension)) {
                    return false;
                }
                Suspension suspension = (Suspension) other;
                return fr.t.c(this.companySuspensionOptions, suspension.companySuspensionOptions) && fr.t.c(this.startSuspensionDate, suspension.startSuspensionDate) && fr.t.c(this.endSuspensionDate, suspension.endSuspensionDate) && fr.t.c(this.minStartSuspensionDate, suspension.minStartSuspensionDate) && this.minSuspensionDays == suspension.minSuspensionDays && this.suspensionPeriodSelection == suspension.suspensionPeriodSelection && this.isPkdCodesUpdateRequired == suspension.isPkdCodesUpdateRequired;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final long getMinSuspensionDays() {
                return this.minSuspensionDays;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final LocalDate getStartSuspensionDate() {
                return this.startSuspensionDate;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final na1.a getSuspensionPeriodSelection() {
                return this.suspensionPeriodSelection;
            }

            public int hashCode() {
                int iHashCode = ((this.companySuspensionOptions.hashCode() * 31) + this.startSuspensionDate.hashCode()) * 31;
                LocalDate localDate = this.endSuspensionDate;
                int iHashCode2 = (((((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31) + this.minStartSuspensionDate.hashCode()) * 31) + Long.hashCode(this.minSuspensionDays)) * 31;
                na1.a aVar = this.suspensionPeriodSelection;
                return ((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.isPkdCodesUpdateRequired);
            }

            public String toString() {
                return "Suspension(companySuspensionOptions=" + this.companySuspensionOptions + ", startSuspensionDate=" + this.startSuspensionDate + ", endSuspensionDate=" + this.endSuspensionDate + ", minStartSuspensionDate=" + this.minStartSuspensionDate + ", minSuspensionDays=" + this.minSuspensionDays + ", suspensionPeriodSelection=" + this.suspensionPeriodSelection + ", isPkdCodesUpdateRequired=" + this.isPkdCodesUpdateRequired + ')';
            }

            public /* synthetic */ Suspension(CompanySuspensionOptions companySuspensionOptions, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, long j15, na1.a aVar, boolean z15, int i15, fr.k kVar) {
                this(companySuspensionOptions, localDate, localDate2, localDate3, j15, (i15 & 32) != 0 ? null : aVar, z15);
            }
        }
    }
}
