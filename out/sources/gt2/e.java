package gt2;

import i50.BaseScaffoldData;
import ja.n0;
import k40.EmptyStateData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageData;
import v40.InputDateTimeData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bR(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lgt2/e;", "Ll00/e;", "Lgt2/e$a;", "Lmu/g;", "Lja/n0;", "Lit2/b;", "A8", "()Lmu/g;", "setChecksPagingDataFlow", "(Lmu/g;)V", "checksPagingDataFlow", "a", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lgt2/e$a;", "", "a", "b", "Lgt2/e$a$a;", "Lgt2/e$a$b;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: gt2.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgt2/e$a$a;", "Lgt2/e$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1736a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1736a f76792a = new C1736a();

            private C1736a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1736a);
            }

            public int hashCode() {
                return 1672590979;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: gt2.e$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010&R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b$\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b)\u0010/R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b-\u00101¨\u00062"}, d2 = {"Lgt2/e$a$b;", "Lgt2/e$a;", "Ly30/n$b;", "controllersData", "Lmx/a;", "functionalityExplanationText", "Lv40/a;", "dateInputData", "Lq40/g;", "Loq/i0;", "emptyStateIconPageData", "", "isFilterEnabled", "Lk40/a;", "noFilteredRecordsData", "Li50/a;", "scaffoldData", "<init>", "(Ly30/n$b;Lmx/a;Lv40/a;Lq40/g;ZLk40/a;Li50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ly30/n$b;", "()Ly30/n$b;", "b", "Lmx/a;", "d", "()Lmx/a;", "c", "Lv40/a;", "()Lv40/a;", "Lq40/g;", "()Lq40/g;", "e", "Z", "g", "()Z", "f", "Lk40/a;", "()Lk40/a;", "Li50/a;", "()Li50/a;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f76793h = (((BaseScaffoldData.f89350g | EmptyStateData.f108236d) | IconPageData.f164667h) | InputDateTimeData.f203769m) | y30.n.Switch.f223693f;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final y30.n.Switch controllersData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label functionalityExplanationText;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final InputDateTimeData dateInputData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final IconPageData<i0, i0> emptyStateIconPageData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isFilterEnabled;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final EmptyStateData noFilteredRecordsData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            public Initialized(y30.n.Switch r15, Label label, InputDateTimeData inputDateTimeData, IconPageData<i0, i0> iconPageData, boolean z15, EmptyStateData emptyStateData, BaseScaffoldData baseScaffoldData) {
                this.controllersData = r15;
                this.functionalityExplanationText = label;
                this.dateInputData = inputDateTimeData;
                this.emptyStateIconPageData = iconPageData;
                this.isFilterEnabled = z15;
                this.noFilteredRecordsData = emptyStateData;
                this.scaffoldData = baseScaffoldData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final y30.n.Switch getControllersData() {
                return this.controllersData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final InputDateTimeData getDateInputData() {
                return this.dateInputData;
            }

            public final IconPageData<i0, i0> c() {
                return this.emptyStateIconPageData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getFunctionalityExplanationText() {
                return this.functionalityExplanationText;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final EmptyStateData getNoFilteredRecordsData() {
                return this.noFilteredRecordsData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.controllersData, initialized.controllersData) && fr.t.c(this.functionalityExplanationText, initialized.functionalityExplanationText) && fr.t.c(this.dateInputData, initialized.dateInputData) && fr.t.c(this.emptyStateIconPageData, initialized.emptyStateIconPageData) && this.isFilterEnabled == initialized.isFilterEnabled && fr.t.c(this.noFilteredRecordsData, initialized.noFilteredRecordsData) && fr.t.c(this.scaffoldData, initialized.scaffoldData);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final boolean getIsFilterEnabled() {
                return this.isFilterEnabled;
            }

            public int hashCode() {
                return (((((((((((this.controllersData.hashCode() * 31) + this.functionalityExplanationText.hashCode()) * 31) + this.dateInputData.hashCode()) * 31) + this.emptyStateIconPageData.hashCode()) * 31) + Boolean.hashCode(this.isFilterEnabled)) * 31) + this.noFilteredRecordsData.hashCode()) * 31) + this.scaffoldData.hashCode();
            }

            public String toString() {
                return "Initialized(controllersData=" + this.controllersData + ", functionalityExplanationText=" + this.functionalityExplanationText + ", dateInputData=" + this.dateInputData + ", emptyStateIconPageData=" + this.emptyStateIconPageData + ", isFilterEnabled=" + this.isFilterEnabled + ", noFilteredRecordsData=" + this.noFilteredRecordsData + ", scaffoldData=" + this.scaffoldData + ')';
            }
        }
    }

    mu.g<n0<it2.b>> A8();
}
