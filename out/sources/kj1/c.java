package kj1;

import p071kotlin.Metadata;
import zp0.AvailableDefenceTrainings;
import zp0.DefenceTraining;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lkj1/c;", "", "c", "a", "b", "Lkj1/c$a;", "Lkj1/c$b;", "Lkj1/c$c;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: kj1.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b!\u0010&¨\u0006'"}, d2 = {"Lkj1/c$a;", "Lkj1/c;", "Lzp0/a;", "trainingPlace", "Lzp0/v;", "selectedDate", "Lhz/b;", "selectedDateValidationState", "Ld60/j;", "Lkj1/b;", "scrollInstance", "<init>", "(Lzp0/a;Lzp0/v;Lhz/b;Ld60/j;)V", "a", "(Lzp0/a;Lzp0/v;Lhz/b;Ld60/j;)Lkj1/c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzp0/a;", "f", "()Lzp0/a;", "b", "Lzp0/v;", "d", "()Lzp0/v;", "c", "Lhz/b;", "e", "()Lhz/b;", "Ld60/j;", "()Ld60/j;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Content implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AvailableDefenceTrainings trainingPlace;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final DefenceTraining selectedDate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b selectedDateValidationState;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final d60.j<b> scrollInstance;

        public Content(AvailableDefenceTrainings availableDefenceTrainings, DefenceTraining defenceTraining, hz.b bVar, d60.j<b> jVar) {
            this.trainingPlace = availableDefenceTrainings;
            this.selectedDate = defenceTraining;
            this.selectedDateValidationState = bVar;
            this.scrollInstance = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content b(Content content, AvailableDefenceTrainings availableDefenceTrainings, DefenceTraining defenceTraining, hz.b bVar, d60.j jVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                availableDefenceTrainings = content.trainingPlace;
            }
            if ((i15 & 2) != 0) {
                defenceTraining = content.selectedDate;
            }
            if ((i15 & 4) != 0) {
                bVar = content.selectedDateValidationState;
            }
            if ((i15 & 8) != 0) {
                jVar = content.scrollInstance;
            }
            return content.a(availableDefenceTrainings, defenceTraining, bVar, jVar);
        }

        public final Content a(AvailableDefenceTrainings trainingPlace, DefenceTraining selectedDate, hz.b selectedDateValidationState, d60.j<b> scrollInstance) {
            return new Content(trainingPlace, selectedDate, selectedDateValidationState, scrollInstance);
        }

        public final d60.j<b> c() {
            return this.scrollInstance;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final DefenceTraining getSelectedDate() {
            return this.selectedDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final hz.b getSelectedDateValidationState() {
            return this.selectedDateValidationState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return fr.t.c(this.trainingPlace, content.trainingPlace) && fr.t.c(this.selectedDate, content.selectedDate) && fr.t.c(this.selectedDateValidationState, content.selectedDateValidationState) && fr.t.c(this.scrollInstance, content.scrollInstance);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final AvailableDefenceTrainings getTrainingPlace() {
            return this.trainingPlace;
        }

        public int hashCode() {
            int iHashCode = this.trainingPlace.hashCode() * 31;
            DefenceTraining defenceTraining = this.selectedDate;
            int iHashCode2 = (((iHashCode + (defenceTraining == null ? 0 : defenceTraining.hashCode())) * 31) + this.selectedDateValidationState.hashCode()) * 31;
            d60.j<b> jVar = this.scrollInstance;
            return iHashCode2 + (jVar != null ? jVar.hashCode() : 0);
        }

        public String toString() {
            return "Content(trainingPlace=" + this.trainingPlace + ", selectedDate=" + this.selectedDate + ", selectedDateValidationState=" + this.selectedDateValidationState + ", scrollInstance=" + this.scrollInstance + ')';
        }
    }

    /* JADX INFO: renamed from: kj1.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkj1/c$b;", "Lkj1/c;", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMSAdapter;

        public Error(hb4.c cVar) {
            this.errorVMSAdapter = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final hb4.c getErrorVMSAdapter() {
            return this.errorVMSAdapter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && fr.t.c(this.errorVMSAdapter, ((Error) other).errorVMSAdapter);
        }

        public int hashCode() {
            return this.errorVMSAdapter.hashCode();
        }

        public String toString() {
            return "Error(errorVMSAdapter=" + this.errorVMSAdapter + ')';
        }
    }

    /* JADX INFO: renamed from: kj1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkj1/c$c;", "Lkj1/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C2675c implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2675c f111143a = new C2675c();

        private C2675c() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C2675c);
        }

        public int hashCode() {
            return -1073987487;
        }

        public String toString() {
            return "Init";
        }
    }
}
