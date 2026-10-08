package mw2;

import al0.ApplicantDataModel;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lmw2/j;", "", "b", "a", "Lmw2/j$a;", "Lmw2/j$b;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j {

    /* JADX INFO: renamed from: mw2.j$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmw2/j$b;", "Lmw2/j;", "Lmw2/l;", "applicantDataRequester", "<init>", "(Lmw2/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmw2/l;", "()Lmw2/l;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Loading implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final l applicantDataRequester;

        public Loading(l lVar) {
            this.applicantDataRequester = lVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final l getApplicantDataRequester() {
            return this.applicantDataRequester;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && fr.t.c(this.applicantDataRequester, ((Loading) other).applicantDataRequester);
        }

        public int hashCode() {
            return this.applicantDataRequester.hashCode();
        }

        public String toString() {
            return "Loading(applicantDataRequester=" + this.applicantDataRequester + ')';
        }
    }

    /* JADX INFO: renamed from: mw2.j$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lmw2/j$a;", "Lmw2/j;", "Lmw2/l;", "applicantDataRequester", "", "age", "Lal0/e;", "applicantDataModel", "", "isAlertVisible", "<init>", "(Lmw2/l;ILal0/e;Z)V", "a", "(Lmw2/l;ILal0/e;Z)Lmw2/j$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmw2/l;", "e", "()Lmw2/l;", "b", "I", "c", "Lal0/e;", "d", "()Lal0/e;", "Z", "f", "()Z", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final l applicantDataRequester;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int age;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ApplicantDataModel applicantDataModel;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAlertVisible;

        public Initialized(l lVar, int i15, ApplicantDataModel applicantDataModel, boolean z15) {
            this.applicantDataRequester = lVar;
            this.age = i15;
            this.applicantDataModel = applicantDataModel;
            this.isAlertVisible = z15;
        }

        public static /* synthetic */ Initialized b(Initialized initialized, l lVar, int i15, ApplicantDataModel applicantDataModel, boolean z15, int i16, Object obj) {
            if ((i16 & 1) != 0) {
                lVar = initialized.applicantDataRequester;
            }
            if ((i16 & 2) != 0) {
                i15 = initialized.age;
            }
            if ((i16 & 4) != 0) {
                applicantDataModel = initialized.applicantDataModel;
            }
            if ((i16 & 8) != 0) {
                z15 = initialized.isAlertVisible;
            }
            return initialized.a(lVar, i15, applicantDataModel, z15);
        }

        public final Initialized a(l applicantDataRequester, int age, ApplicantDataModel applicantDataModel, boolean isAlertVisible) {
            return new Initialized(applicantDataRequester, age, applicantDataModel, isAlertVisible);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getAge() {
            return this.age;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ApplicantDataModel getApplicantDataModel() {
            return this.applicantDataModel;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final l getApplicantDataRequester() {
            return this.applicantDataRequester;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.applicantDataRequester, initialized.applicantDataRequester) && this.age == initialized.age && fr.t.c(this.applicantDataModel, initialized.applicantDataModel) && this.isAlertVisible == initialized.isAlertVisible;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsAlertVisible() {
            return this.isAlertVisible;
        }

        public int hashCode() {
            return (((((this.applicantDataRequester.hashCode() * 31) + Integer.hashCode(this.age)) * 31) + this.applicantDataModel.hashCode()) * 31) + Boolean.hashCode(this.isAlertVisible);
        }

        public String toString() {
            return "Initialized(applicantDataRequester=" + this.applicantDataRequester + ", age=" + this.age + ", applicantDataModel=" + this.applicantDataModel + ", isAlertVisible=" + this.isAlertVisible + ')';
        }

        public /* synthetic */ Initialized(l lVar, int i15, ApplicantDataModel applicantDataModel, boolean z15, int i16, fr.k kVar) {
            this(lVar, i15, applicantDataModel, (i16 & 8) != 0 ? true : z15);
        }
    }
}
