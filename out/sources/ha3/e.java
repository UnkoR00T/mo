package ha3;

import fr.t;
import java.time.LocalDate;
import java.util.List;
import mx.Label;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u001a\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u001c\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u001e\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0013¨\u0006!²\u0006\f\u0010 \u001a\u00020\u001f8\nX\u008a\u0084\u0002"}, d2 = {"Lha3/e;", "Lgz/a;", "Lha3/e$a;", "Lhz/b;", "Lmx/c;", "labelProvider", "Lfa3/c;", "stagesConflictsCalculator", "<init>", "(Lmx/c;Lfa3/c;)V", "params", "i", "(Lha3/e$a;)Lhz/b;", "a", "Lmx/c;", "b", "Lfa3/c;", "Lmx/a;", "c", "()Lmx/a;", "missingDateLabel", "f", "tripTooLongLabel", "e", "tripTooLongForMinorLabel", "d", "stagesOverlapLabel", "h", "wrongStagesOrderLabel", "g", "wrongFinalDateLabel", "Lfa3/c$a;", "overlapResult", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements gz.a<Params, hz.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fa3.c stagesConflictsCalculator;

    /* JADX INFO: renamed from: ha3.e$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b\u001a\u0010\"¨\u0006$"}, d2 = {"Lha3/e$a;", "Lgz/b$a;", "", "Lfz/e$a;", "allRanges", "", "currentRangeIndex", "", "isTripTooLong", "Ljava/time/LocalDate;", "oldestChildDayBefore18", "currentDate", "<init>", "(Ljava/util/List;IZLjava/time/LocalDate;Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "I", "c", "Z", "f", "()Z", "d", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "e", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<fz.e.LocalDate> allRanges;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int currentRangeIndex;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isTripTooLong;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate oldestChildDayBefore18;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate currentDate;

        public Params(List<fz.e.LocalDate> list, int i15, boolean z15, LocalDate localDate, LocalDate localDate2) {
            this.allRanges = list;
            this.currentRangeIndex = i15;
            this.isTripTooLong = z15;
            this.oldestChildDayBefore18 = localDate;
            this.currentDate = localDate2;
        }

        public final List<fz.e.LocalDate> a() {
            return this.allRanges;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getCurrentDate() {
            return this.currentDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getCurrentRangeIndex() {
            return this.currentRangeIndex;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LocalDate getOldestChildDayBefore18() {
            return this.oldestChildDayBefore18;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.allRanges, params.allRanges) && this.currentRangeIndex == params.currentRangeIndex && this.isTripTooLong == params.isTripTooLong && t.c(this.oldestChildDayBefore18, params.oldestChildDayBefore18) && t.c(this.currentDate, params.currentDate);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsTripTooLong() {
            return this.isTripTooLong;
        }

        public int hashCode() {
            int iHashCode = ((((this.allRanges.hashCode() * 31) + Integer.hashCode(this.currentRangeIndex)) * 31) + Boolean.hashCode(this.isTripTooLong)) * 31;
            LocalDate localDate = this.oldestChildDayBefore18;
            return ((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31) + this.currentDate.hashCode();
        }

        public String toString() {
            return "Params(allRanges=" + this.allRanges + ", currentRangeIndex=" + this.currentRangeIndex + ", isTripTooLong=" + this.isTripTooLong + ", oldestChildDayBefore18=" + this.oldestChildDayBefore18 + ", currentDate=" + this.currentDate + ')';
        }
    }

    public e(mx.c cVar, fa3.c cVar2) {
        this.labelProvider = cVar;
        this.stagesConflictsCalculator = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fa3.c.a j(e eVar, fz.e.LocalDate localDate, fz.e.LocalDate localDate2, List list) {
        return eVar.stagesConflictsCalculator.a(localDate, localDate2, list);
    }

    private static final fa3.c.a k(k<? extends fa3.c.a> kVar) {
        return kVar.getValue();
    }

    public final Label c() {
        return this.labelProvider.c(r93.a.f172493l1);
    }

    public final Label d() {
        return this.labelProvider.c(r93.a.f172499n1);
    }

    public final Label e() {
        return this.labelProvider.c(r93.a.f172505p1);
    }

    public final Label f() {
        return this.labelProvider.c(r93.a.f172502o1);
    }

    public final Label g() {
        return this.labelProvider.c(r93.a.f172508q1);
    }

    public final Label h() {
        return this.labelProvider.c(r93.a.f172511r1);
    }

    public hz.b i(Params params) {
        final fz.e.LocalDate localDate = params.a().get(params.getCurrentRangeIndex());
        if (localDate == null) {
            return new hz.b.Invalid(c());
        }
        final fz.e.LocalDate localDate2 = (fz.e.LocalDate) v.o0(params.a(), params.getCurrentRangeIndex() - 1);
        boolean z15 = params.getCurrentRangeIndex() == v.p(params.a());
        final List listI1 = v.i1(params.a());
        listI1.remove(params.getCurrentRangeIndex());
        k kVarA = l.a(new er.a() { // from class: ha3.d
            @Override // er.a
            public final Object a() {
                return e.j(this.f82559a, localDate2, localDate, listI1);
            }
        });
        if (z15 && params.getIsTripTooLong()) {
            return new hz.b.Invalid(f());
        }
        if (params.getOldestChildDayBefore18() != null && localDate.getEnd().isAfter(params.getOldestChildDayBefore18())) {
            return new hz.b.Invalid(e());
        }
        if (t.c(k(kVarA), fa3.c.a.b.f60531a)) {
            return new hz.b.Invalid(d());
        }
        if (t.c(k(kVarA), fa3.c.a.C1368c.f60532a)) {
            return new hz.b.Invalid(h());
        }
        return (z15 && localDate.getEnd().isBefore(params.getCurrentDate())) ? new hz.b.Invalid(g()) : hz.b.d.f86848c;
    }
}
