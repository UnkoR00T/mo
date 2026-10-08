package w11;

import l60.KeyValueData;
import p071kotlin.Metadata;
import s11.CertificateRevokeConfirmationData;
import th0.UserCertificateMobileApi;
import v11.ConfirmationScreenModel;
import vw.NavigationDialogModel;
import z11.CertificateData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lw11/a;", "", "e", "a", "h", "g", "f", "i", "b", "c", "d", "Lw11/a$a;", "Lw11/a$b;", "Lw11/a$c;", "Lw11/a$d;", "Lw11/a$f;", "Lw11/a$g;", "Lw11/a$h;", "Lw11/a$i;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: w11.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lw11/a$a;", "Lw11/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C5500a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C5500a f209171a = new C5500a();

        private C5500a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C5500a);
        }

        public int hashCode() {
            return -654064094;
        }

        public String toString() {
            return "Back";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lw11/a$b;", "Lw11/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f209172a = new b();

        private b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 2102219022;
        }

        public String toString() {
            return "GoBackAndRefresh";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lw11/a$c;", "Lw11/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f209173a = new c();

        private c() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return 649501055;
        }

        public String toString() {
            return "GoToMoreScreen";
        }
    }

    /* JADX INFO: renamed from: w11.a$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lw11/a$d;", "Lw11/a;", "Ls11/c;", "certificateRevokeConfirmationData", "actionEvent", "<init>", "(Ls11/c;Lw11/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ls11/c;", "b", "()Ls11/c;", "Lw11/a;", "()Lw11/a;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GoToRevokeConfirmation implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CertificateRevokeConfirmationData certificateRevokeConfirmationData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final a actionEvent;

        public GoToRevokeConfirmation(CertificateRevokeConfirmationData certificateRevokeConfirmationData, a aVar) {
            this.certificateRevokeConfirmationData = certificateRevokeConfirmationData;
            this.actionEvent = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getActionEvent() {
            return this.actionEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CertificateRevokeConfirmationData getCertificateRevokeConfirmationData() {
            return this.certificateRevokeConfirmationData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GoToRevokeConfirmation)) {
                return false;
            }
            GoToRevokeConfirmation goToRevokeConfirmation = (GoToRevokeConfirmation) other;
            return fr.t.c(this.certificateRevokeConfirmationData, goToRevokeConfirmation.certificateRevokeConfirmationData) && fr.t.c(this.actionEvent, goToRevokeConfirmation.actionEvent);
        }

        public int hashCode() {
            return (this.certificateRevokeConfirmationData.hashCode() * 31) + this.actionEvent.hashCode();
        }

        public String toString() {
            return "GoToRevokeConfirmation(certificateRevokeConfirmationData=" + this.certificateRevokeConfirmationData + ", actionEvent=" + this.actionEvent + ')';
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lw11/a$e;", "", "a", "c", "b", "e", "d", "Lw11/a$e$a;", "Lw11/a$e$b;", "Lw11/a$e$c;", "Lw11/a$e$d;", "Lw11/a$e$e;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface e {

        /* JADX INFO: renamed from: w11.a$e$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lw11/a$e$a;", "Lw11/a$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C5501a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C5501a f209176a = new C5501a();

            private C5501a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C5501a);
            }

            public int hashCode() {
                return -2092043603;
            }

            public String toString() {
                return "Back";
            }
        }

        /* JADX INFO: renamed from: w11.a$e$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lw11/a$e$b;", "Lw11/a$e;", "Ls11/d;", "result", "<init>", "(Ls11/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ls11/d;", "()Ls11/d;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class GoBackAndRefresh implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final s11.d result;

            public GoBackAndRefresh(s11.d dVar) {
                this.result = dVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final s11.d getResult() {
                return this.result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoBackAndRefresh) && fr.t.c(this.result, ((GoBackAndRefresh) other).result);
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            public String toString() {
                return "GoBackAndRefresh(result=" + this.result + ')';
            }
        }

        /* JADX INFO: renamed from: w11.a$e$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lw11/a$e$c;", "Lw11/a$e;", "Lv11/a;", "confirmation", "<init>", "(Lv11/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv11/a;", "()Lv11/a;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class GoToConfirmation implements e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f209178b = KeyValueData.f116329d;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ConfirmationScreenModel confirmation;

            public GoToConfirmation(ConfirmationScreenModel confirmationScreenModel) {
                this.confirmation = confirmationScreenModel;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ConfirmationScreenModel getConfirmation() {
                return this.confirmation;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoToConfirmation) && fr.t.c(this.confirmation, ((GoToConfirmation) other).confirmation);
            }

            public int hashCode() {
                return this.confirmation.hashCode();
            }

            public String toString() {
                return "GoToConfirmation(confirmation=" + this.confirmation + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lw11/a$e$d;", "Lw11/a$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f209180a = new d();

            private d() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 593941578;
            }

            public String toString() {
                return "GoToMoreScreen";
            }
        }

        /* JADX INFO: renamed from: w11.a$e$e, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lw11/a$e$e;", "Lw11/a$e;", "Lvw/a;", "navigationDialogModel", "<init>", "(Lvw/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvw/a;", "()Lvw/a;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ShowNavigationDialog implements e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f209181b = NavigationDialogModel.f208514i;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final NavigationDialogModel navigationDialogModel;

            public ShowNavigationDialog(NavigationDialogModel navigationDialogModel) {
                this.navigationDialogModel = navigationDialogModel;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final NavigationDialogModel getNavigationDialogModel() {
                return this.navigationDialogModel;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowNavigationDialog) && fr.t.c(this.navigationDialogModel, ((ShowNavigationDialog) other).navigationDialogModel);
            }

            public int hashCode() {
                return this.navigationDialogModel.hashCode();
            }

            public String toString() {
                return "ShowNavigationDialog(navigationDialogModel=" + this.navigationDialogModel + ')';
            }
        }
    }

    /* JADX INFO: renamed from: w11.a$f, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lw11/a$f;", "Lw11/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lz11/a;", "a", "Lz11/a;", "()Lz11/a;", "selectedCertificate", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RetryCertificateRevocation implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CertificateData selectedCertificate;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CertificateData getSelectedCertificate() {
            return this.selectedCertificate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RetryCertificateRevocation) && fr.t.c(this.selectedCertificate, ((RetryCertificateRevocation) other).selectedCertificate);
        }

        public int hashCode() {
            return this.selectedCertificate.hashCode();
        }

        public String toString() {
            return "RetryCertificateRevocation(selectedCertificate=" + this.selectedCertificate + ')';
        }
    }

    /* JADX INFO: renamed from: w11.a$g, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lw11/a$g;", "Lw11/a;", "Lz11/a;", "selectedCertificate", "<init>", "(Lz11/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz11/a;", "()Lz11/a;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevokeCertificate implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CertificateData selectedCertificate;

        public RevokeCertificate(CertificateData certificateData) {
            this.selectedCertificate = certificateData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CertificateData getSelectedCertificate() {
            return this.selectedCertificate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RevokeCertificate) && fr.t.c(this.selectedCertificate, ((RevokeCertificate) other).selectedCertificate);
        }

        public int hashCode() {
            return this.selectedCertificate.hashCode();
        }

        public String toString() {
            return "RevokeCertificate(selectedCertificate=" + this.selectedCertificate + ')';
        }
    }

    /* JADX INFO: renamed from: w11.a$h, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lw11/a$h;", "Lw11/a;", "Lth0/t;", "certificate", "<init>", "(Lth0/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lth0/t;", "()Lth0/t;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetupCertData implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final UserCertificateMobileApi certificate;

        public SetupCertData(UserCertificateMobileApi userCertificateMobileApi) {
            this.certificate = userCertificateMobileApi;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final UserCertificateMobileApi getCertificate() {
            return this.certificate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetupCertData) && fr.t.c(this.certificate, ((SetupCertData) other).certificate);
        }

        public int hashCode() {
            return this.certificate.hashCode();
        }

        public String toString() {
            return "SetupCertData(certificate=" + this.certificate + ')';
        }
    }

    /* JADX INFO: renamed from: w11.a$i, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lw11/a$i;", "Lw11/a;", "Lz11/a;", "selectedCertificate", "<init>", "(Lz11/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz11/a;", "()Lz11/a;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowConfirmationDialog implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CertificateData selectedCertificate;

        public ShowConfirmationDialog(CertificateData certificateData) {
            this.selectedCertificate = certificateData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CertificateData getSelectedCertificate() {
            return this.selectedCertificate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowConfirmationDialog) && fr.t.c(this.selectedCertificate, ((ShowConfirmationDialog) other).selectedCertificate);
        }

        public int hashCode() {
            return this.selectedCertificate.hashCode();
        }

        public String toString() {
            return "ShowConfirmationDialog(selectedCertificate=" + this.selectedCertificate + ')';
        }
    }
}
