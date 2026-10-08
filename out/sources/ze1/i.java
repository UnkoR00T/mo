package ze1;

import java.util.List;
import ld1.CompanyPkdCode;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lze1/i;", "", "a", "b", "Lze1/i$a;", "Lze1/i$b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lze1/i$a;", "Lze1/i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f234684a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -1892062393;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: ze1.i$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ6\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lze1/i$b;", "Lze1/i;", "", "Lld1/g;", "userPkdCodes", "selectedPkdCode", "Lhz/b;", "validationState", "<init>", "(Ljava/util/List;Lld1/g;Lhz/b;)V", "a", "(Ljava/util/List;Lld1/g;Lhz/b;)Lze1/i$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Lld1/g;", "c", "()Lld1/g;", "Lhz/b;", "e", "()Lhz/b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<CompanyPkdCode> userPkdCodes;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CompanyPkdCode selectedPkdCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        public Initialized(List<CompanyPkdCode> list, CompanyPkdCode companyPkdCode, hz.b bVar) {
            this.userPkdCodes = list;
            this.selectedPkdCode = companyPkdCode;
            this.validationState = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, List list, CompanyPkdCode companyPkdCode, hz.b bVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                list = initialized.userPkdCodes;
            }
            if ((i15 & 2) != 0) {
                companyPkdCode = initialized.selectedPkdCode;
            }
            if ((i15 & 4) != 0) {
                bVar = initialized.validationState;
            }
            return initialized.a(list, companyPkdCode, bVar);
        }

        public final Initialized a(List<CompanyPkdCode> userPkdCodes, CompanyPkdCode selectedPkdCode, hz.b validationState) {
            return new Initialized(userPkdCodes, selectedPkdCode, validationState);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final CompanyPkdCode getSelectedPkdCode() {
            return this.selectedPkdCode;
        }

        public final List<CompanyPkdCode> d() {
            return this.userPkdCodes;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final hz.b getValidationState() {
            return this.validationState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.userPkdCodes, initialized.userPkdCodes) && fr.t.c(this.selectedPkdCode, initialized.selectedPkdCode) && fr.t.c(this.validationState, initialized.validationState);
        }

        public int hashCode() {
            int iHashCode = this.userPkdCodes.hashCode() * 31;
            CompanyPkdCode companyPkdCode = this.selectedPkdCode;
            return ((iHashCode + (companyPkdCode == null ? 0 : companyPkdCode.hashCode())) * 31) + this.validationState.hashCode();
        }

        public String toString() {
            return "Initialized(userPkdCodes=" + this.userPkdCodes + ", selectedPkdCode=" + this.selectedPkdCode + ", validationState=" + this.validationState + ')';
        }

        public /* synthetic */ Initialized(List list, CompanyPkdCode companyPkdCode, hz.b bVar, int i15, fr.k kVar) {
            this(list, companyPkdCode, (i15 & 4) != 0 ? hz.b.C2039b.f86846c : bVar);
        }
    }
}
