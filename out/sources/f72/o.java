package f72;

import d72.HydroWarning;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lf72/o;", "", "a", "b", "Lf72/o$a;", "Lf72/o$b;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface o {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lf72/o$a;", "Lf72/o;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f59816a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 1414067614;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: f72.o$b, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lf72/o$b;", "Lf72/o;", "", "selectedVoivodeship", "", "Ld72/b;", "hydroWarnings", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "a", "(Ljava/lang/String;Ljava/util/List;)Lf72/o$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String selectedVoivodeship;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<HydroWarning> hydroWarnings;

        public Initialized(String str, List<HydroWarning> list) {
            this.selectedVoivodeship = str;
            this.hydroWarnings = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, String str, List list, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                str = initialized.selectedVoivodeship;
            }
            if ((i15 & 2) != 0) {
                list = initialized.hydroWarnings;
            }
            return initialized.a(str, list);
        }

        public final Initialized a(String selectedVoivodeship, List<HydroWarning> hydroWarnings) {
            return new Initialized(selectedVoivodeship, hydroWarnings);
        }

        public final List<HydroWarning> c() {
            return this.hydroWarnings;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSelectedVoivodeship() {
            return this.selectedVoivodeship;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.selectedVoivodeship, initialized.selectedVoivodeship) && fr.t.c(this.hydroWarnings, initialized.hydroWarnings);
        }

        public int hashCode() {
            String str = this.selectedVoivodeship;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.hydroWarnings.hashCode();
        }

        public String toString() {
            return "Initialized(selectedVoivodeship=" + this.selectedVoivodeship + ", hydroWarnings=" + this.hydroWarnings + ')';
        }
    }
}
