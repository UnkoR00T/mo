package ng2;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;
import tq0.BELandRegisterDocumentCumulatedSubtypeFee;
import tq0.LandRegisterSubDocument;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lng2/e;", "", "b", "c", "a", "Lng2/e$a;", "Lng2/e$b;", "Lng2/e$c;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {

    /* JADX INFO: renamed from: ng2.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJT\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b \u0010(¨\u0006)"}, d2 = {"Lng2/e$a;", "Lng2/e;", "", "Ltq0/e;", "cumulatedSubtypeFees", "Ltq0/s;", "data", "", "selected", "", "showError", "Ljava/math/BigDecimal;", "calculatedAmount", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/Set;ZLjava/math/BigDecimal;)V", "a", "(Ljava/util/List;Ljava/util/List;Ljava/util/Set;ZLjava/math/BigDecimal;)Lng2/e$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCumulatedSubtypeFees", "()Ljava/util/List;", "b", "d", "c", "Ljava/util/Set;", "e", "()Ljava/util/Set;", "Z", "f", "()Z", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BELandRegisterDocumentCumulatedSubtypeFee> cumulatedSubtypeFees;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<LandRegisterSubDocument> data;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<LandRegisterSubDocument> selected;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showError;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final BigDecimal calculatedAmount;

        public Initialized(List<BELandRegisterDocumentCumulatedSubtypeFee> list, List<LandRegisterSubDocument> list2, Set<LandRegisterSubDocument> set, boolean z15, BigDecimal bigDecimal) {
            this.cumulatedSubtypeFees = list;
            this.data = list2;
            this.selected = set;
            this.showError = z15;
            this.calculatedAmount = bigDecimal;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, List list, List list2, Set set, boolean z15, BigDecimal bigDecimal, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                list = initialized.cumulatedSubtypeFees;
            }
            if ((i15 & 2) != 0) {
                list2 = initialized.data;
            }
            if ((i15 & 4) != 0) {
                set = initialized.selected;
            }
            if ((i15 & 8) != 0) {
                z15 = initialized.showError;
            }
            if ((i15 & 16) != 0) {
                bigDecimal = initialized.calculatedAmount;
            }
            BigDecimal bigDecimal2 = bigDecimal;
            Set set2 = set;
            return initialized.a(list, list2, set2, z15, bigDecimal2);
        }

        public final Initialized a(List<BELandRegisterDocumentCumulatedSubtypeFee> cumulatedSubtypeFees, List<LandRegisterSubDocument> data, Set<LandRegisterSubDocument> selected, boolean showError, BigDecimal calculatedAmount) {
            return new Initialized(cumulatedSubtypeFees, data, selected, showError, calculatedAmount);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BigDecimal getCalculatedAmount() {
            return this.calculatedAmount;
        }

        public final List<LandRegisterSubDocument> d() {
            return this.data;
        }

        public final Set<LandRegisterSubDocument> e() {
            return this.selected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.cumulatedSubtypeFees, initialized.cumulatedSubtypeFees) && fr.t.c(this.data, initialized.data) && fr.t.c(this.selected, initialized.selected) && this.showError == initialized.showError && fr.t.c(this.calculatedAmount, initialized.calculatedAmount);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getShowError() {
            return this.showError;
        }

        public int hashCode() {
            return (((((((this.cumulatedSubtypeFees.hashCode() * 31) + this.data.hashCode()) * 31) + this.selected.hashCode()) * 31) + Boolean.hashCode(this.showError)) * 31) + this.calculatedAmount.hashCode();
        }

        public String toString() {
            return "Initialized(cumulatedSubtypeFees=" + this.cumulatedSubtypeFees + ", data=" + this.data + ", selected=" + this.selected + ", showError=" + this.showError + ", calculatedAmount=" + this.calculatedAmount + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lng2/e$b;", "Lng2/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f136171a = new b();

        private b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 909111002;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: renamed from: ng2.e$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lng2/e$c;", "Lng2/e;", "Lhb4/c;", "error", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoadingError implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c error;

        public LoadingError(hb4.c cVar) {
            this.error = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final hb4.c getError() {
            return this.error;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoadingError) && fr.t.c(this.error, ((LoadingError) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "LoadingError(error=" + this.error + ')';
        }
    }
}
