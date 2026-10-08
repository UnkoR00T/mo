package vi3;

import java.util.List;
import p071kotlin.Metadata;
import sv0.InsuranceProviderData;
import xi3.InsuranceFieldsData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lvi3/b;", "", "a", "b", "Lvi3/b$a;", "Lvi3/b$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lvi3/b$a;", "Lvi3/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f207001a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 109322563;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: vi3.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJR\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lvi3/b$b;", "Lvi3/b;", "Lxi3/a;", "insuranceFieldsData", "", "Lsv0/s;", "insuranceProviders", "selectedInsuranceProvider", "Lxi3/b;", "mode", "Ld60/j;", "Lxi3/a$b;", "scrollInstance", "<init>", "(Lxi3/a;Ljava/util/List;Lsv0/s;Lxi3/b;Ld60/j;)V", "a", "(Lxi3/a;Ljava/util/List;Lsv0/s;Lxi3/b;Ld60/j;)Lvi3/b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lxi3/a;", "c", "()Lxi3/a;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lsv0/s;", "g", "()Lsv0/s;", "Lxi3/b;", "e", "()Lxi3/b;", "Ld60/j;", "f", "()Ld60/j;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final InsuranceFieldsData insuranceFieldsData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<InsuranceProviderData> insuranceProviders;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final InsuranceProviderData selectedInsuranceProvider;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final xi3.b mode;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final d60.j<InsuranceFieldsData.b> scrollInstance;

        public Initialized(InsuranceFieldsData insuranceFieldsData, List<InsuranceProviderData> list, InsuranceProviderData insuranceProviderData, xi3.b bVar, d60.j<InsuranceFieldsData.b> jVar) {
            this.insuranceFieldsData = insuranceFieldsData;
            this.insuranceProviders = list;
            this.selectedInsuranceProvider = insuranceProviderData;
            this.mode = bVar;
            this.scrollInstance = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, InsuranceFieldsData insuranceFieldsData, List list, InsuranceProviderData insuranceProviderData, xi3.b bVar, d60.j jVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                insuranceFieldsData = initialized.insuranceFieldsData;
            }
            if ((i15 & 2) != 0) {
                list = initialized.insuranceProviders;
            }
            if ((i15 & 4) != 0) {
                insuranceProviderData = initialized.selectedInsuranceProvider;
            }
            if ((i15 & 8) != 0) {
                bVar = initialized.mode;
            }
            if ((i15 & 16) != 0) {
                jVar = initialized.scrollInstance;
            }
            d60.j jVar2 = jVar;
            InsuranceProviderData insuranceProviderData2 = insuranceProviderData;
            return initialized.a(insuranceFieldsData, list, insuranceProviderData2, bVar, jVar2);
        }

        public final Initialized a(InsuranceFieldsData insuranceFieldsData, List<InsuranceProviderData> insuranceProviders, InsuranceProviderData selectedInsuranceProvider, xi3.b mode, d60.j<InsuranceFieldsData.b> scrollInstance) {
            return new Initialized(insuranceFieldsData, insuranceProviders, selectedInsuranceProvider, mode, scrollInstance);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InsuranceFieldsData getInsuranceFieldsData() {
            return this.insuranceFieldsData;
        }

        public final List<InsuranceProviderData> d() {
            return this.insuranceProviders;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final xi3.b getMode() {
            return this.mode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.insuranceFieldsData, initialized.insuranceFieldsData) && fr.t.c(this.insuranceProviders, initialized.insuranceProviders) && fr.t.c(this.selectedInsuranceProvider, initialized.selectedInsuranceProvider) && fr.t.c(this.mode, initialized.mode) && fr.t.c(this.scrollInstance, initialized.scrollInstance);
        }

        public final d60.j<InsuranceFieldsData.b> f() {
            return this.scrollInstance;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final InsuranceProviderData getSelectedInsuranceProvider() {
            return this.selectedInsuranceProvider;
        }

        public int hashCode() {
            int iHashCode = ((this.insuranceFieldsData.hashCode() * 31) + this.insuranceProviders.hashCode()) * 31;
            InsuranceProviderData insuranceProviderData = this.selectedInsuranceProvider;
            int iHashCode2 = (((iHashCode + (insuranceProviderData == null ? 0 : insuranceProviderData.hashCode())) * 31) + this.mode.hashCode()) * 31;
            d60.j<InsuranceFieldsData.b> jVar = this.scrollInstance;
            return iHashCode2 + (jVar != null ? jVar.hashCode() : 0);
        }

        public String toString() {
            return "Initialized(insuranceFieldsData=" + this.insuranceFieldsData + ", insuranceProviders=" + this.insuranceProviders + ", selectedInsuranceProvider=" + this.selectedInsuranceProvider + ", mode=" + this.mode + ", scrollInstance=" + this.scrollInstance + ')';
        }

        public /* synthetic */ Initialized(InsuranceFieldsData insuranceFieldsData, List list, InsuranceProviderData insuranceProviderData, xi3.b bVar, d60.j jVar, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? new InsuranceFieldsData(null, null, null, 7, null) : insuranceFieldsData, list, (i15 & 4) != 0 ? null : insuranceProviderData, bVar, (i15 & 16) != 0 ? null : jVar);
        }
    }
}
