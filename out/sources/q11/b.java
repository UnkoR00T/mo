package q11;

import java.util.List;
import p071kotlin.Metadata;
import s11.CertificateInfoData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lq11/b;", "", "b", "d", "c", "a", "e", "Lq11/b$a;", "Lq11/b$b;", "Lq11/b$c;", "Lq11/b$d;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lq11/b$a;", "Lq11/b;", "Lhb4/c;", "a", "()Lhb4/c;", "errorVMS", "b", "Lq11/b$a$a;", "Lq11/b$a$b;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends b {

        /* JADX INFO: renamed from: q11.b$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lq11/b$a$a;", "Lq11/b$a;", "Lq11/b$e;", "data", "Lhb4/c;", "errorVMS", "<init>", "(Lq11/b$e;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq11/b$e;", "getData", "()Lq11/b$e;", "b", "Lhb4/c;", "()Lhb4/c;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class GeneralError implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public GeneralError(StateData stateData, hb4.c cVar) {
                this.data = stateData;
                this.errorVMS = cVar;
            }

            @Override // q11.b.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GeneralError)) {
                    return false;
                }
                GeneralError generalError = (GeneralError) other;
                return fr.t.c(this.data, generalError.data) && fr.t.c(this.errorVMS, generalError.errorVMS);
            }

            public final StateData getData() {
                return this.data;
            }

            public int hashCode() {
                return (this.data.hashCode() * 31) + this.errorVMS.hashCode();
            }

            public String toString() {
                return "GeneralError(data=" + this.data + ", errorVMS=" + this.errorVMS + ')';
            }
        }

        /* JADX INFO: renamed from: q11.b$a$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lq11/b$a$b;", "Lq11/b$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LoadCertificatesError implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public LoadCertificatesError(hb4.c cVar) {
                this.errorVMS = cVar;
            }

            @Override // q11.b.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LoadCertificatesError) && fr.t.c(this.errorVMS, ((LoadCertificatesError) other).errorVMS);
            }

            public int hashCode() {
                return this.errorVMS.hashCode();
            }

            public String toString() {
                return "LoadCertificatesError(errorVMS=" + this.errorVMS + ')';
            }
        }

        /* JADX INFO: renamed from: a */
        hb4.c getErrorVMS();
    }

    /* JADX INFO: renamed from: q11.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lq11/b$b;", "Lq11/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C4062b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4062b f163589a = new C4062b();

        private C4062b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C4062b);
        }

        public int hashCode() {
            return -1965539123;
        }

        public String toString() {
            return "Initial";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lq11/b$c;", "Lq11/b;", "Lq11/b$e;", "getData", "()Lq11/b$e;", "data", "a", "b", "Lq11/b$c$a;", "Lq11/b$c$b;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c extends b {

        /* JADX INFO: renamed from: q11.b$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lq11/b$c$a;", "Lq11/b$c;", "Lq11/b$e;", "data", "<init>", "(Lq11/b$e;)V", "b", "(Lq11/b$e;)Lq11/b$c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq11/b$e;", "getData", "()Lq11/b$e;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Displaying implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            public Displaying(StateData stateData) {
                this.data = stateData;
            }

            public final Displaying b(StateData data) {
                return new Displaying(data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Displaying) && fr.t.c(this.data, ((Displaying) other).data);
            }

            @Override // q11.b.c
            public StateData getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "Displaying(data=" + this.data + ')';
            }
        }

        /* JADX INFO: renamed from: q11.b$c$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lq11/b$c$b;", "Lq11/b$c;", "Lq11/b$e;", "data", "<init>", "(Lq11/b$e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq11/b$e;", "getData", "()Lq11/b$e;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class GettingNewCertificate implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            public GettingNewCertificate(StateData stateData) {
                this.data = stateData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GettingNewCertificate) && fr.t.c(this.data, ((GettingNewCertificate) other).data);
            }

            @Override // q11.b.c
            public StateData getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "GettingNewCertificate(data=" + this.data + ')';
            }
        }

        StateData getData();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lq11/b$d;", "Lq11/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f163592a = new d();

        private d() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return 1250438480;
        }

        public String toString() {
            return "LoadingCertificateList";
        }
    }

    /* JADX INFO: renamed from: q11.b$e, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJH\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b#\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lq11/b$e;", "", "Ly30/n$b$b;", "selectedType", "", "Ls11/a;", "certificates", "", "bottomSheetVisible", "certTopAlertVisible", "", "mainActiveCertDaysLeft", "<init>", "(Ly30/n$b$b;Ljava/util/List;ZZJ)V", "a", "(Ly30/n$b$b;Ljava/util/List;ZZJ)Lq11/b$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ly30/n$b$b;", "g", "()Ly30/n$b$b;", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", "Z", "()Z", "d", "J", "f", "()J", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StateData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final y30.n.Switch.EnumC5973b selectedType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<CertificateInfoData> certificates;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean bottomSheetVisible;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean certTopAlertVisible;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final long mainActiveCertDaysLeft;

        public StateData(y30.n.Switch.EnumC5973b enumC5973b, List<CertificateInfoData> list, boolean z15, boolean z16, long j15) {
            this.selectedType = enumC5973b;
            this.certificates = list;
            this.bottomSheetVisible = z15;
            this.certTopAlertVisible = z16;
            this.mainActiveCertDaysLeft = j15;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateData b(StateData stateData, y30.n.Switch.EnumC5973b enumC5973b, List list, boolean z15, boolean z16, long j15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                enumC5973b = stateData.selectedType;
            }
            if ((i15 & 2) != 0) {
                list = stateData.certificates;
            }
            if ((i15 & 4) != 0) {
                z15 = stateData.bottomSheetVisible;
            }
            if ((i15 & 8) != 0) {
                z16 = stateData.certTopAlertVisible;
            }
            if ((i15 & 16) != 0) {
                j15 = stateData.mainActiveCertDaysLeft;
            }
            long j16 = j15;
            return stateData.a(enumC5973b, list, z15, z16, j16);
        }

        public final StateData a(y30.n.Switch.EnumC5973b selectedType, List<CertificateInfoData> certificates, boolean bottomSheetVisible, boolean certTopAlertVisible, long mainActiveCertDaysLeft) {
            return new StateData(selectedType, certificates, bottomSheetVisible, certTopAlertVisible, mainActiveCertDaysLeft);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getBottomSheetVisible() {
            return this.bottomSheetVisible;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getCertTopAlertVisible() {
            return this.certTopAlertVisible;
        }

        public final List<CertificateInfoData> e() {
            return this.certificates;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateData)) {
                return false;
            }
            StateData stateData = (StateData) other;
            return this.selectedType == stateData.selectedType && fr.t.c(this.certificates, stateData.certificates) && this.bottomSheetVisible == stateData.bottomSheetVisible && this.certTopAlertVisible == stateData.certTopAlertVisible && this.mainActiveCertDaysLeft == stateData.mainActiveCertDaysLeft;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final long getMainActiveCertDaysLeft() {
            return this.mainActiveCertDaysLeft;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final y30.n.Switch.EnumC5973b getSelectedType() {
            return this.selectedType;
        }

        public int hashCode() {
            return (((((((this.selectedType.hashCode() * 31) + this.certificates.hashCode()) * 31) + Boolean.hashCode(this.bottomSheetVisible)) * 31) + Boolean.hashCode(this.certTopAlertVisible)) * 31) + Long.hashCode(this.mainActiveCertDaysLeft);
        }

        public String toString() {
            return "StateData(selectedType=" + this.selectedType + ", certificates=" + this.certificates + ", bottomSheetVisible=" + this.bottomSheetVisible + ", certTopAlertVisible=" + this.certTopAlertVisible + ", mainActiveCertDaysLeft=" + this.mainActiveCertDaysLeft + ')';
        }

        public /* synthetic */ StateData(y30.n.Switch.EnumC5973b enumC5973b, List list, boolean z15, boolean z16, long j15, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? y30.n.Switch.EnumC5973b.LEFT : enumC5973b, list, (i15 & 4) != 0 ? false : z15, z16, (i15 & 16) != 0 ? 0L : j15);
        }
    }
}
