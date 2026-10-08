package ra3;

import p071kotlin.Metadata;
import v93.CountryDetailsFormatted;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lra3/k;", "", "", "a", "()Z", "isSubscribed", "Lra3/k$a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0003\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lra3/k$a;", "Lra3/k;", "Lv93/e;", "b", "()Lv93/e;", "countryDetails", "a", "Lra3/k$a$a;", "Lra3/k$a$b;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends k {

        /* JADX INFO: renamed from: ra3.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lra3/k$a$a;", "Lra3/k$a;", "a", "b", "c", "Lra3/k$a$a$a;", "Lra3/k$a$a$b;", "Lra3/k$a$a$c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC4401a extends a {

            /* JADX INFO: renamed from: ra3.k$a$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lra3/k$a$a$a;", "Lra3/k$a$a;", "", "isSubscribed", "Lv93/e;", "countryDetails", "<init>", "(ZLv93/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Lv93/e;", "()Lv93/e;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Checking implements InterfaceC4401a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean isSubscribed;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final CountryDetailsFormatted countryDetails;

                public Checking(boolean z15, CountryDetailsFormatted countryDetailsFormatted) {
                    this.isSubscribed = z15;
                    this.countryDetails = countryDetailsFormatted;
                }

                @Override // ra3.k
                /* JADX INFO: renamed from: a, reason: from getter */
                public boolean getIsSubscribed() {
                    return this.isSubscribed;
                }

                @Override // ra3.k.a
                /* JADX INFO: renamed from: b, reason: from getter */
                public CountryDetailsFormatted getCountryDetails() {
                    return this.countryDetails;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Checking)) {
                        return false;
                    }
                    Checking checking = (Checking) other;
                    return this.isSubscribed == checking.isSubscribed && fr.t.c(this.countryDetails, checking.countryDetails);
                }

                public int hashCode() {
                    return (Boolean.hashCode(this.isSubscribed) * 31) + this.countryDetails.hashCode();
                }

                public String toString() {
                    return "Checking(isSubscribed=" + this.isSubscribed + ", countryDetails=" + this.countryDetails + ')';
                }
            }

            /* JADX INFO: renamed from: ra3.k$a$a$b, reason: from toString */
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lra3/k$a$a$b;", "Lra3/k$a$a;", "", "isSubscribed", "Lv93/e;", "countryDetails", "Lcb4/i;", "dialogVmsAdapter", "<init>", "(ZLv93/e;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Lv93/e;", "()Lv93/e;", "c", "Lcb4/i;", "()Lcb4/i;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Dialog implements InterfaceC4401a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean isSubscribed;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final CountryDetailsFormatted countryDetails;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final cb4.i dialogVmsAdapter;

                public Dialog(boolean z15, CountryDetailsFormatted countryDetailsFormatted, cb4.i iVar) {
                    this.isSubscribed = z15;
                    this.countryDetails = countryDetailsFormatted;
                    this.dialogVmsAdapter = iVar;
                }

                @Override // ra3.k
                /* JADX INFO: renamed from: a, reason: from getter */
                public boolean getIsSubscribed() {
                    return this.isSubscribed;
                }

                @Override // ra3.k.a
                /* JADX INFO: renamed from: b, reason: from getter */
                public CountryDetailsFormatted getCountryDetails() {
                    return this.countryDetails;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final cb4.i getDialogVmsAdapter() {
                    return this.dialogVmsAdapter;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Dialog)) {
                        return false;
                    }
                    Dialog dialog = (Dialog) other;
                    return this.isSubscribed == dialog.isSubscribed && fr.t.c(this.countryDetails, dialog.countryDetails) && fr.t.c(this.dialogVmsAdapter, dialog.dialogVmsAdapter);
                }

                public int hashCode() {
                    return (((Boolean.hashCode(this.isSubscribed) * 31) + this.countryDetails.hashCode()) * 31) + this.dialogVmsAdapter.hashCode();
                }

                public String toString() {
                    return "Dialog(isSubscribed=" + this.isSubscribed + ", countryDetails=" + this.countryDetails + ", dialogVmsAdapter=" + this.dialogVmsAdapter + ')';
                }
            }

            /* JADX INFO: renamed from: ra3.k$a$a$c, reason: from toString */
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lra3/k$a$a$c;", "Lra3/k$a$a;", "", "isSubscribed", "Lv93/e;", "countryDetails", "Lhb4/c;", "errorVMSAdapter", "<init>", "(ZLv93/e;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Lv93/e;", "()Lv93/e;", "c", "Lhb4/c;", "()Lhb4/c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Error implements InterfaceC4401a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean isSubscribed;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final CountryDetailsFormatted countryDetails;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final hb4.c errorVMSAdapter;

                public Error(boolean z15, CountryDetailsFormatted countryDetailsFormatted, hb4.c cVar) {
                    this.isSubscribed = z15;
                    this.countryDetails = countryDetailsFormatted;
                    this.errorVMSAdapter = cVar;
                }

                @Override // ra3.k
                /* JADX INFO: renamed from: a, reason: from getter */
                public boolean getIsSubscribed() {
                    return this.isSubscribed;
                }

                @Override // ra3.k.a
                /* JADX INFO: renamed from: b, reason: from getter */
                public CountryDetailsFormatted getCountryDetails() {
                    return this.countryDetails;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
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
                    return this.isSubscribed == error.isSubscribed && fr.t.c(this.countryDetails, error.countryDetails) && fr.t.c(this.errorVMSAdapter, error.errorVMSAdapter);
                }

                public int hashCode() {
                    return (((Boolean.hashCode(this.isSubscribed) * 31) + this.countryDetails.hashCode()) * 31) + this.errorVMSAdapter.hashCode();
                }

                public String toString() {
                    return "Error(isSubscribed=" + this.isSubscribed + ", countryDetails=" + this.countryDetails + ", errorVMSAdapter=" + this.errorVMSAdapter + ')';
                }
            }
        }

        /* JADX INFO: renamed from: ra3.k$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lra3/k$a$b;", "Lra3/k$a;", "", "isSubscribed", "Lv93/e;", "countryDetails", "<init>", "(ZLv93/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Lv93/e;", "()Lv93/e;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isSubscribed;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final CountryDetailsFormatted countryDetails;

            public Initialized(boolean z15, CountryDetailsFormatted countryDetailsFormatted) {
                this.isSubscribed = z15;
                this.countryDetails = countryDetailsFormatted;
            }

            @Override // ra3.k
            /* JADX INFO: renamed from: a, reason: from getter */
            public boolean getIsSubscribed() {
                return this.isSubscribed;
            }

            @Override // ra3.k.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public CountryDetailsFormatted getCountryDetails() {
                return this.countryDetails;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return this.isSubscribed == initialized.isSubscribed && fr.t.c(this.countryDetails, initialized.countryDetails);
            }

            public int hashCode() {
                return (Boolean.hashCode(this.isSubscribed) * 31) + this.countryDetails.hashCode();
            }

            public String toString() {
                return "Initialized(isSubscribed=" + this.isSubscribed + ", countryDetails=" + this.countryDetails + ')';
            }
        }

        /* JADX INFO: renamed from: b */
        CountryDetailsFormatted getCountryDetails();
    }

    /* JADX INFO: renamed from: a */
    boolean getIsSubscribed();
}
