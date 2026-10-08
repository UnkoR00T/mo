package hg1;

import a50.RadioButtonData;
import h30.ButtonData;
import mx.Label;
import p071kotlin.Metadata;
import v40.InputDateTimeData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lhg1/n;", "Ll00/e;", "Lhg1/n$a;", "Li70/n;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface n extends l00.e<a>, i70.n {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lhg1/n$a;", "", "b", "d", "c", "a", "Lhg1/n$a$a;", "Lhg1/n$a$b;", "Lhg1/n$a$c;", "Lhg1/n$a$d;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: hg1.n$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lhg1/n$a$a;", "Lhg1/n$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(hb4.c cVar) {
                this.errorVMS = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.errorVMS, ((Error) other).errorVMS);
            }

            public int hashCode() {
                return this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(errorVMS=" + this.errorVMS + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhg1/n$a$b;", "Lhg1/n$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f84409a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -977276951;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: hg1.n$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lhg1/n$a$c;", "Lhg1/n$a;", "Lhg1/n$a$c$a;", "resumptionDate", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lh30/a;", "nextButton", "<init>", "(Lhg1/n$a$c$a;Ler/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhg1/n$a$c$a;", "c", "()Lhg1/n$a$c$a;", "b", "Ler/a;", "()Ler/a;", "Lh30/a;", "()Lh30/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InitializedResumption implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f84410d = InputDateTimeData.f203769m;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ResumptionDate resumptionDate;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackAction;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButton;

            /* JADX INFO: renamed from: hg1.n$a$c$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lhg1/n$a$c$a;", "", "Lmx/a;", "title", "Lv40/a;", "dateInputData", "<init>", "(Lmx/a;Lv40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Lv40/a;", "()Lv40/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class ResumptionDate {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final int f84414c = InputDateTimeData.f203769m;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label title;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final InputDateTimeData dateInputData;

                public ResumptionDate(Label label, InputDateTimeData inputDateTimeData) {
                    this.title = label;
                    this.dateInputData = inputDateTimeData;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final InputDateTimeData getDateInputData() {
                    return this.dateInputData;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final Label getTitle() {
                    return this.title;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ResumptionDate)) {
                        return false;
                    }
                    ResumptionDate resumptionDate = (ResumptionDate) other;
                    return fr.t.c(this.title, resumptionDate.title) && fr.t.c(this.dateInputData, resumptionDate.dateInputData);
                }

                public int hashCode() {
                    return (this.title.hashCode() * 31) + this.dateInputData.hashCode();
                }

                public String toString() {
                    return "ResumptionDate(title=" + this.title + ", dateInputData=" + this.dateInputData + ')';
                }
            }

            public InitializedResumption(ResumptionDate resumptionDate, er.a<oq.i0> aVar, ButtonData buttonData) {
                this.resumptionDate = resumptionDate;
                this.onBackAction = aVar;
                this.nextButton = buttonData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ButtonData getNextButton() {
                return this.nextButton;
            }

            public final er.a<oq.i0> b() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ResumptionDate getResumptionDate() {
                return this.resumptionDate;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InitializedResumption)) {
                    return false;
                }
                InitializedResumption initializedResumption = (InitializedResumption) other;
                return fr.t.c(this.resumptionDate, initializedResumption.resumptionDate) && fr.t.c(this.onBackAction, initializedResumption.onBackAction) && fr.t.c(this.nextButton, initializedResumption.nextButton);
            }

            public int hashCode() {
                return (((this.resumptionDate.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.nextButton.hashCode();
            }

            public String toString() {
                return "InitializedResumption(resumptionDate=" + this.resumptionDate + ", onBackAction=" + this.onBackAction + ", nextButton=" + this.nextButton + ')';
            }
        }

        /* JADX INFO: renamed from: hg1.n$a$d, reason: from toString */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0003!\u001e\u001aB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001a\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010'\u001a\u0004\b!\u0010(¨\u0006)"}, d2 = {"Lhg1/n$a$d;", "Lhg1/n$a;", "Lhg1/n$a$d$c;", "startSuspensionPeriod", "Lhg1/n$a$d$b;", "endSuspensionPeriod", "Lc30/b;", "alertData", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lh30/a;", "nextButton", "<init>", "(Lhg1/n$a$d$c;Lhg1/n$a$d$b;Lc30/b;Ler/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhg1/n$a$d$c;", "e", "()Lhg1/n$a$d$c;", "b", "Lhg1/n$a$d$b;", "()Lhg1/n$a$d$b;", "c", "Lc30/b;", "()Lc30/b;", "d", "Ler/a;", "()Ler/a;", "Lh30/a;", "()Lh30/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InitializedSuspension implements a {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f84417f = (c30.b.f22944i | RadioButtonData.f3462h) | InputDateTimeData.f203769m;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final StartSuspensionPeriod startSuspensionPeriod;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final EndSuspensionPeriod endSuspensionPeriod;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b alertData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackAction;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButton;

            /* JADX INFO: renamed from: hg1.n$a$d$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lhg1/n$a$d$a;", "", "a", "b", "Lhg1/n$a$d$a$a;", "Lhg1/n$a$d$a$b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public interface InterfaceC1954a {

                /* JADX INFO: renamed from: hg1.n$a$d$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhg1/n$a$d$a$a;", "Lhg1/n$a$d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class C1955a implements InterfaceC1954a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final C1955a f84423a = new C1955a();

                    private C1955a() {
                    }

                    public boolean equals(Object other) {
                        return this == other || (other instanceof C1955a);
                    }

                    public int hashCode() {
                        return -324648393;
                    }

                    public String toString() {
                        return "DateFrom";
                    }
                }

                /* JADX INFO: renamed from: hg1.n$a$d$a$b */
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhg1/n$a$d$a$b;", "Lhg1/n$a$d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class b implements InterfaceC1954a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final b f84424a = new b();

                    private b() {
                    }

                    public boolean equals(Object other) {
                        return this == other || (other instanceof b);
                    }

                    public int hashCode() {
                        return -1859553208;
                    }

                    public String toString() {
                        return "DateTo";
                    }
                }
            }

            /* JADX INFO: renamed from: hg1.n$a$d$b, reason: from toString */
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lhg1/n$a$d$b;", "", "Lmx/a;", "title", "description", "La50/a;", "radioButtonData", "<init>", "(Lmx/a;Lmx/a;La50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "La50/a;", "()La50/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class EndSuspensionPeriod {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public static final int f84425d = RadioButtonData.f3462h;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label title;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label description;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final RadioButtonData radioButtonData;

                public EndSuspensionPeriod(Label label, Label label2, RadioButtonData radioButtonData) {
                    this.title = label;
                    this.description = label2;
                    this.radioButtonData = radioButtonData;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final Label getDescription() {
                    return this.description;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final RadioButtonData getRadioButtonData() {
                    return this.radioButtonData;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final Label getTitle() {
                    return this.title;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof EndSuspensionPeriod)) {
                        return false;
                    }
                    EndSuspensionPeriod endSuspensionPeriod = (EndSuspensionPeriod) other;
                    return fr.t.c(this.title, endSuspensionPeriod.title) && fr.t.c(this.description, endSuspensionPeriod.description) && fr.t.c(this.radioButtonData, endSuspensionPeriod.radioButtonData);
                }

                public int hashCode() {
                    return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.radioButtonData.hashCode();
                }

                public String toString() {
                    return "EndSuspensionPeriod(title=" + this.title + ", description=" + this.description + ", radioButtonData=" + this.radioButtonData + ')';
                }
            }

            /* JADX INFO: renamed from: hg1.n$a$d$c, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lhg1/n$a$d$c;", "", "Lmx/a;", "title", "Lv40/a;", "dateInputData", "<init>", "(Lmx/a;Lv40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Lv40/a;", "()Lv40/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class StartSuspensionPeriod {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final int f84429c = InputDateTimeData.f203769m;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label title;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final InputDateTimeData dateInputData;

                public StartSuspensionPeriod(Label label, InputDateTimeData inputDateTimeData) {
                    this.title = label;
                    this.dateInputData = inputDateTimeData;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final InputDateTimeData getDateInputData() {
                    return this.dateInputData;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final Label getTitle() {
                    return this.title;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof StartSuspensionPeriod)) {
                        return false;
                    }
                    StartSuspensionPeriod startSuspensionPeriod = (StartSuspensionPeriod) other;
                    return fr.t.c(this.title, startSuspensionPeriod.title) && fr.t.c(this.dateInputData, startSuspensionPeriod.dateInputData);
                }

                public int hashCode() {
                    return (this.title.hashCode() * 31) + this.dateInputData.hashCode();
                }

                public String toString() {
                    return "StartSuspensionPeriod(title=" + this.title + ", dateInputData=" + this.dateInputData + ')';
                }
            }

            public InitializedSuspension(StartSuspensionPeriod startSuspensionPeriod, EndSuspensionPeriod endSuspensionPeriod, c30.b bVar, er.a<oq.i0> aVar, ButtonData buttonData) {
                this.startSuspensionPeriod = startSuspensionPeriod;
                this.endSuspensionPeriod = endSuspensionPeriod;
                this.alertData = bVar;
                this.onBackAction = aVar;
                this.nextButton = buttonData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final c30.b getAlertData() {
                return this.alertData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final EndSuspensionPeriod getEndSuspensionPeriod() {
                return this.endSuspensionPeriod;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ButtonData getNextButton() {
                return this.nextButton;
            }

            public final er.a<oq.i0> d() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final StartSuspensionPeriod getStartSuspensionPeriod() {
                return this.startSuspensionPeriod;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InitializedSuspension)) {
                    return false;
                }
                InitializedSuspension initializedSuspension = (InitializedSuspension) other;
                return fr.t.c(this.startSuspensionPeriod, initializedSuspension.startSuspensionPeriod) && fr.t.c(this.endSuspensionPeriod, initializedSuspension.endSuspensionPeriod) && fr.t.c(this.alertData, initializedSuspension.alertData) && fr.t.c(this.onBackAction, initializedSuspension.onBackAction) && fr.t.c(this.nextButton, initializedSuspension.nextButton);
            }

            public int hashCode() {
                return (((((((this.startSuspensionPeriod.hashCode() * 31) + this.endSuspensionPeriod.hashCode()) * 31) + this.alertData.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.nextButton.hashCode();
            }

            public String toString() {
                return "InitializedSuspension(startSuspensionPeriod=" + this.startSuspensionPeriod + ", endSuspensionPeriod=" + this.endSuspensionPeriod + ", alertData=" + this.alertData + ", onBackAction=" + this.onBackAction + ", nextButton=" + this.nextButton + ')';
            }
        }
    }
}
