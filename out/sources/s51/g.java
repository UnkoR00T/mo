package s51;

import bl0.BEChildBirthRegistration;
import n31.RegistrationChildrenResult;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ls51/g;", "", "b", "a", "Ls51/g$a;", "Ls51/g$b;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0007\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Ls51/g$a;", "Ls51/g;", "Lbl0/h;", "b", "()Lbl0/h;", "sentRegistration", "Ln31/b;", "a", "()Ln31/b;", "result", "Ls51/g$a$a;", "Ls51/g$a$b;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends g {

        /* JADX INFO: renamed from: s51.g$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Ls51/g$a$a;", "Ls51/g$a;", "Lbl0/h;", "sentRegistration", "Ln31/b;", "result", "<init>", "(Lbl0/h;Ln31/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbl0/h;", "b", "()Lbl0/h;", "Ln31/b;", "()Ln31/b;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Content implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BEChildBirthRegistration sentRegistration;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final RegistrationChildrenResult result;

            public Content(BEChildBirthRegistration bEChildBirthRegistration, RegistrationChildrenResult registrationChildrenResult) {
                this.sentRegistration = bEChildBirthRegistration;
                this.result = registrationChildrenResult;
            }

            @Override // s51.g.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public RegistrationChildrenResult getResult() {
                return this.result;
            }

            @Override // s51.g.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public BEChildBirthRegistration getSentRegistration() {
                return this.sentRegistration;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Content)) {
                    return false;
                }
                Content content = (Content) other;
                return fr.t.c(this.sentRegistration, content.sentRegistration) && fr.t.c(this.result, content.result);
            }

            public int hashCode() {
                return (this.sentRegistration.hashCode() * 31) + this.result.hashCode();
            }

            public String toString() {
                return "Content(sentRegistration=" + this.sentRegistration + ", result=" + this.result + ')';
            }
        }

        /* JADX INFO: renamed from: s51.g$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Ls51/g$a$b;", "Ls51/g$a;", "Lbl0/h;", "sentRegistration", "Ln31/b;", "result", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Lbl0/h;Ln31/b;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbl0/h;", "b", "()Lbl0/h;", "Ln31/b;", "()Ln31/b;", "c", "Lhb4/c;", "d", "()Lhb4/c;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BEChildBirthRegistration sentRegistration;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final RegistrationChildrenResult result;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMSAdapter;

            public Error(BEChildBirthRegistration bEChildBirthRegistration, RegistrationChildrenResult registrationChildrenResult, hb4.c cVar) {
                this.sentRegistration = bEChildBirthRegistration;
                this.result = registrationChildrenResult;
                this.errorVMSAdapter = cVar;
            }

            @Override // s51.g.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public RegistrationChildrenResult getResult() {
                return this.result;
            }

            @Override // s51.g.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public BEChildBirthRegistration getSentRegistration() {
                return this.sentRegistration;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final hb4.c getErrorVMSAdapter() {
                return this.errorVMSAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return fr.t.c(this.sentRegistration, error.sentRegistration) && fr.t.c(this.result, error.result) && fr.t.c(this.errorVMSAdapter, error.errorVMSAdapter);
            }

            public int hashCode() {
                return (((this.sentRegistration.hashCode() * 31) + this.result.hashCode()) * 31) + this.errorVMSAdapter.hashCode();
            }

            public String toString() {
                return "Error(sentRegistration=" + this.sentRegistration + ", result=" + this.result + ", errorVMSAdapter=" + this.errorVMSAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: a */
        RegistrationChildrenResult getResult();

        /* JADX INFO: renamed from: b */
        BEChildBirthRegistration getSentRegistration();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Ls51/g$b;", "Ls51/g;", "Lu51/a$a;", "c", "()Lu51/a$a;", "summaryData", "a", "b", "Ls51/g$b$a;", "Ls51/g$b$b;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends g {

        /* JADX INFO: renamed from: s51.g$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ls51/g$b$a;", "Ls51/g$b;", "Lu51/a$a;", "summaryData", "<init>", "(Lu51/a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lu51/a$a;", "c", "()Lu51/a$a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Content implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final u51.a.Data summaryData;

            public Content(u51.a.Data data) {
                this.summaryData = data;
            }

            @Override // s51.g.b
            /* JADX INFO: renamed from: c, reason: from getter */
            public u51.a.Data getSummaryData() {
                return this.summaryData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Content) && fr.t.c(this.summaryData, ((Content) other).summaryData);
            }

            public int hashCode() {
                return this.summaryData.hashCode();
            }

            public String toString() {
                return "Content(summaryData=" + this.summaryData + ')';
            }
        }

        /* JADX INFO: renamed from: s51.g$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ls51/g$b$b;", "Ls51/g$b;", "Lu51/a$a;", "summaryData", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Lu51/a$a;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lu51/a$a;", "c", "()Lu51/a$a;", "b", "Lhb4/c;", "d", "()Lhb4/c;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final u51.a.Data summaryData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMSAdapter;

            public Error(u51.a.Data data, hb4.c cVar) {
                this.summaryData = data;
                this.errorVMSAdapter = cVar;
            }

            @Override // s51.g.b
            /* JADX INFO: renamed from: c, reason: from getter */
            public u51.a.Data getSummaryData() {
                return this.summaryData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final hb4.c getErrorVMSAdapter() {
                return this.errorVMSAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return fr.t.c(this.summaryData, error.summaryData) && fr.t.c(this.errorVMSAdapter, error.errorVMSAdapter);
            }

            public int hashCode() {
                return (this.summaryData.hashCode() * 31) + this.errorVMSAdapter.hashCode();
            }

            public String toString() {
                return "Error(summaryData=" + this.summaryData + ", errorVMSAdapter=" + this.errorVMSAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: c */
        u51.a.Data getSummaryData();
    }
}
