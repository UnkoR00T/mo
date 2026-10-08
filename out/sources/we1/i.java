package we1;

import java.util.List;
import ld1.CompanyPkdCode;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lwe1/i;", "", "a", "b", "Lwe1/i$a;", "Lwe1/i$b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwe1/i$a;", "Lwe1/i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f212711a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -966897673;
        }

        public String toString() {
            return "Initial";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0003\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lwe1/i$b;", "Lwe1/i;", "Lwe1/i$b$c;", "b", "()Lwe1/i$b$c;", "stateData", "a", "c", "Lwe1/i$b$a;", "Lwe1/i$b$b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends i {

        /* JADX INFO: renamed from: we1.i$b$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lwe1/i$b$a;", "Lwe1/i$b;", "Lwe1/i$b$c;", "stateData", "Lcb4/i;", "vmsAdapter", "<init>", "(Lwe1/i$b$c;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwe1/i$b$c;", "b", "()Lwe1/i$b$c;", "Lcb4/i;", "()Lcb4/i;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Dialog implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData stateData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i vmsAdapter;

            public Dialog(StateData stateData, cb4.i iVar) {
                this.stateData = stateData;
                this.vmsAdapter = iVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final cb4.i getVmsAdapter() {
                return this.vmsAdapter;
            }

            @Override // we1.i.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public StateData getStateData() {
                return this.stateData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Dialog)) {
                    return false;
                }
                Dialog dialog = (Dialog) other;
                return fr.t.c(this.stateData, dialog.stateData) && fr.t.c(this.vmsAdapter, dialog.vmsAdapter);
            }

            public int hashCode() {
                return (this.stateData.hashCode() * 31) + this.vmsAdapter.hashCode();
            }

            public String toString() {
                return "Dialog(stateData=" + this.stateData + ", vmsAdapter=" + this.vmsAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: we1.i$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lwe1/i$b$b;", "Lwe1/i$b;", "Lwe1/i$b$c;", "stateData", "<init>", "(Lwe1/i$b$c;)V", "a", "(Lwe1/i$b$c;)Lwe1/i$b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwe1/i$b$c;", "b", "()Lwe1/i$b$c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Displayed implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData stateData;

            public Displayed(StateData stateData) {
                this.stateData = stateData;
            }

            public final Displayed a(StateData stateData) {
                return new Displayed(stateData);
            }

            @Override // we1.i.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public StateData getStateData() {
                return this.stateData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Displayed) && fr.t.c(this.stateData, ((Displayed) other).stateData);
            }

            public int hashCode() {
                return this.stateData.hashCode();
            }

            public String toString() {
                return "Displayed(stateData=" + this.stateData + ')';
            }
        }

        /* JADX INFO: renamed from: b */
        StateData getStateData();

        /* JADX INFO: renamed from: we1.i$b$c, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJD\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"Lwe1/i$b$c;", "", "", "Lld1/g;", "userPkdCodes", "fetchedCompanyPkdCodes", "Lhz/b;", "validationState", "Lld1/l;", "processType", "<init>", "(Ljava/util/List;Ljava/util/List;Lhz/b;Lld1/l;)V", "a", "(Ljava/util/List;Ljava/util/List;Lhz/b;Lld1/l;)Lwe1/i$b$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "c", "Lhz/b;", "f", "()Lhz/b;", "d", "Lld1/l;", "()Lld1/l;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class StateData {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<CompanyPkdCode> userPkdCodes;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<CompanyPkdCode> fetchedCompanyPkdCodes;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b validationState;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ld1.l processType;

            public StateData(List<CompanyPkdCode> list, List<CompanyPkdCode> list2, hz.b bVar, ld1.l lVar) {
                this.userPkdCodes = list;
                this.fetchedCompanyPkdCodes = list2;
                this.validationState = bVar;
                this.processType = lVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ StateData b(StateData stateData, List list, List list2, hz.b bVar, ld1.l lVar, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    list = stateData.userPkdCodes;
                }
                if ((i15 & 2) != 0) {
                    list2 = stateData.fetchedCompanyPkdCodes;
                }
                if ((i15 & 4) != 0) {
                    bVar = stateData.validationState;
                }
                if ((i15 & 8) != 0) {
                    lVar = stateData.processType;
                }
                return stateData.a(list, list2, bVar, lVar);
            }

            public final StateData a(List<CompanyPkdCode> userPkdCodes, List<CompanyPkdCode> fetchedCompanyPkdCodes, hz.b validationState, ld1.l processType) {
                return new StateData(userPkdCodes, fetchedCompanyPkdCodes, validationState, processType);
            }

            public final List<CompanyPkdCode> c() {
                return this.fetchedCompanyPkdCodes;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final ld1.l getProcessType() {
                return this.processType;
            }

            public final List<CompanyPkdCode> e() {
                return this.userPkdCodes;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StateData)) {
                    return false;
                }
                StateData stateData = (StateData) other;
                return fr.t.c(this.userPkdCodes, stateData.userPkdCodes) && fr.t.c(this.fetchedCompanyPkdCodes, stateData.fetchedCompanyPkdCodes) && fr.t.c(this.validationState, stateData.validationState) && this.processType == stateData.processType;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final hz.b getValidationState() {
                return this.validationState;
            }

            public int hashCode() {
                return (((((this.userPkdCodes.hashCode() * 31) + this.fetchedCompanyPkdCodes.hashCode()) * 31) + this.validationState.hashCode()) * 31) + this.processType.hashCode();
            }

            public String toString() {
                return "StateData(userPkdCodes=" + this.userPkdCodes + ", fetchedCompanyPkdCodes=" + this.fetchedCompanyPkdCodes + ", validationState=" + this.validationState + ", processType=" + this.processType + ')';
            }

            public /* synthetic */ StateData(List list, List list2, hz.b bVar, ld1.l lVar, int i15, fr.k kVar) {
                this(list, list2, (i15 & 4) != 0 ? hz.b.C2039b.f86846c : bVar, lVar);
            }
        }
    }
}
