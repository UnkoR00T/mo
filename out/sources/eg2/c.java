package eg2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Leg2/c;", "", "a", "b", "c", "Leg2/c$a;", "Leg2/c$b;", "Leg2/c$c;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: eg2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Leg2/c$a;", "Leg2/c;", "Ltq0/l;", "verificationCode", "<init>", "(Ljava/lang/String;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FetchingStatus implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationCode;

        public /* synthetic */ FetchingStatus(String str, fr.k kVar) {
            this(str);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getVerificationCode() {
            return this.verificationCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FetchingStatus) && tq0.l.d(this.verificationCode, ((FetchingStatus) other).verificationCode);
        }

        public int hashCode() {
            return tq0.l.e(this.verificationCode);
        }

        public String toString() {
            return "FetchingStatus(verificationCode=" + ((Object) tq0.l.f(this.verificationCode)) + ')';
        }

        private FetchingStatus(String str) {
            this.verificationCode = str;
        }
    }

    /* JADX INFO: renamed from: eg2.c$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\n¨\u0006\u001a"}, d2 = {"Leg2/c$b;", "Leg2/c;", "Lhb4/c;", "errorVMS", "Ltq0/l;", "verificationCode", "<init>", "(Lhb4/c;Ljava/lang/String;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "c", "()Lhb4/c;", "b", "Ljava/lang/String;", "d", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FetchingStatusError implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationCode;

        public /* synthetic */ FetchingStatusError(hb4.c cVar, String str, fr.k kVar) {
            this(cVar, str);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getVerificationCode() {
            return this.verificationCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FetchingStatusError)) {
                return false;
            }
            FetchingStatusError fetchingStatusError = (FetchingStatusError) other;
            return fr.t.c(this.errorVMS, fetchingStatusError.errorVMS) && tq0.l.d(this.verificationCode, fetchingStatusError.verificationCode);
        }

        public int hashCode() {
            return (this.errorVMS.hashCode() * 31) + tq0.l.e(this.verificationCode);
        }

        public String toString() {
            return "FetchingStatusError(errorVMS=" + this.errorVMS + ", verificationCode=" + ((Object) tq0.l.f(this.verificationCode)) + ')';
        }

        private FetchingStatusError(hb4.c cVar, String str) {
            this.errorVMS = cVar;
            this.verificationCode = str;
        }
    }

    /* JADX INFO: renamed from: eg2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0003\n\u0007\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Leg2/c$c;", "Leg2/c;", "Ltq0/n;", "a", "()Ltq0/n;", "verifyDocumentResponse", "", "b", "()Z", "isFromScan", "c", "d", "Leg2/c$c$a;", "Leg2/c$c$b;", "Leg2/c$c$c;", "Leg2/c$c$d;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC1200c extends c {

        /* JADX INFO: renamed from: eg2.c$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Leg2/c$c$a;", "Leg2/c$c;", "Ltq0/n;", "verifyDocumentResponse", "", "isFromScan", "<init>", "(Ltq0/n;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ltq0/n;", "()Ltq0/n;", "b", "Z", "()Z", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Content implements InterfaceC1200c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final tq0.n verifyDocumentResponse;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isFromScan;

            public Content(tq0.n nVar, boolean z15) {
                this.verifyDocumentResponse = nVar;
                this.isFromScan = z15;
            }

            @Override // eg2.c.InterfaceC1200c
            /* JADX INFO: renamed from: a, reason: from getter */
            public tq0.n getVerifyDocumentResponse() {
                return this.verifyDocumentResponse;
            }

            @Override // eg2.c.InterfaceC1200c
            /* JADX INFO: renamed from: b, reason: from getter */
            public boolean getIsFromScan() {
                return this.isFromScan;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Content)) {
                    return false;
                }
                Content content = (Content) other;
                return fr.t.c(this.verifyDocumentResponse, content.verifyDocumentResponse) && this.isFromScan == content.isFromScan;
            }

            public int hashCode() {
                return (this.verifyDocumentResponse.hashCode() * 31) + Boolean.hashCode(this.isFromScan);
            }

            public String toString() {
                return "Content(verifyDocumentResponse=" + this.verifyDocumentResponse + ", isFromScan=" + this.isFromScan + ')';
            }
        }

        /* JADX INFO: renamed from: eg2.c$c$b */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Leg2/c$c$b;", "Leg2/c$c;", "a", "b", "Leg2/c$c$b$a;", "Leg2/c$c$b$b;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface b extends InterfaceC1200c {

            /* JADX INFO: renamed from: eg2.c$c$b$a, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Leg2/c$c$b$a;", "Leg2/c$c$b;", "Ltq0/n;", "verifyDocumentResponse", "", "isFromScan", "<init>", "(Ltq0/n;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ltq0/n;", "()Ltq0/n;", "b", "Z", "()Z", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Content implements b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final tq0.n verifyDocumentResponse;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean isFromScan;

                public Content(tq0.n nVar, boolean z15) {
                    this.verifyDocumentResponse = nVar;
                    this.isFromScan = z15;
                }

                @Override // eg2.c.InterfaceC1200c
                /* JADX INFO: renamed from: a, reason: from getter */
                public tq0.n getVerifyDocumentResponse() {
                    return this.verifyDocumentResponse;
                }

                @Override // eg2.c.InterfaceC1200c
                /* JADX INFO: renamed from: b, reason: from getter */
                public boolean getIsFromScan() {
                    return this.isFromScan;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Content)) {
                        return false;
                    }
                    Content content = (Content) other;
                    return fr.t.c(this.verifyDocumentResponse, content.verifyDocumentResponse) && this.isFromScan == content.isFromScan;
                }

                public int hashCode() {
                    return (this.verifyDocumentResponse.hashCode() * 31) + Boolean.hashCode(this.isFromScan);
                }

                public String toString() {
                    return "Content(verifyDocumentResponse=" + this.verifyDocumentResponse + ", isFromScan=" + this.isFromScan + ')';
                }
            }

            /* JADX INFO: renamed from: eg2.c$c$b$b, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Leg2/c$c$b$b;", "Leg2/c$c$b;", "Ltq0/n;", "verifyDocumentResponse", "", "isFromScan", "Lcb4/i;", "dialogVMS", "<init>", "(Ltq0/n;ZLcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ltq0/n;", "()Ltq0/n;", "b", "Z", "()Z", "c", "Lcb4/i;", "()Lcb4/i;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class PermissionDialog implements b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final tq0.n verifyDocumentResponse;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean isFromScan;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final cb4.i dialogVMS;

                public PermissionDialog(tq0.n nVar, boolean z15, cb4.i iVar) {
                    this.verifyDocumentResponse = nVar;
                    this.isFromScan = z15;
                    this.dialogVMS = iVar;
                }

                @Override // eg2.c.InterfaceC1200c
                /* JADX INFO: renamed from: a, reason: from getter */
                public tq0.n getVerifyDocumentResponse() {
                    return this.verifyDocumentResponse;
                }

                @Override // eg2.c.InterfaceC1200c
                /* JADX INFO: renamed from: b, reason: from getter */
                public boolean getIsFromScan() {
                    return this.isFromScan;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final cb4.i getDialogVMS() {
                    return this.dialogVMS;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PermissionDialog)) {
                        return false;
                    }
                    PermissionDialog permissionDialog = (PermissionDialog) other;
                    return fr.t.c(this.verifyDocumentResponse, permissionDialog.verifyDocumentResponse) && this.isFromScan == permissionDialog.isFromScan && fr.t.c(this.dialogVMS, permissionDialog.dialogVMS);
                }

                public int hashCode() {
                    return (((this.verifyDocumentResponse.hashCode() * 31) + Boolean.hashCode(this.isFromScan)) * 31) + this.dialogVMS.hashCode();
                }

                public String toString() {
                    return "PermissionDialog(verifyDocumentResponse=" + this.verifyDocumentResponse + ", isFromScan=" + this.isFromScan + ", dialogVMS=" + this.dialogVMS + ')';
                }
            }
        }

        /* JADX INFO: renamed from: eg2.c$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Leg2/c$c$c;", "Leg2/c$c;", "a", "b", "Leg2/c$c$c$a;", "Leg2/c$c$c$b;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC1202c extends InterfaceC1200c {

            /* JADX INFO: renamed from: eg2.c$c$c$a, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Leg2/c$c$c$a;", "Leg2/c$c$c;", "Ltq0/n;", "verifyDocumentResponse", "", "isFromScan", "<init>", "(Ltq0/n;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ltq0/n;", "()Ltq0/n;", "b", "Z", "()Z", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Content implements InterfaceC1202c {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final tq0.n verifyDocumentResponse;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean isFromScan;

                public Content(tq0.n nVar, boolean z15) {
                    this.verifyDocumentResponse = nVar;
                    this.isFromScan = z15;
                }

                @Override // eg2.c.InterfaceC1200c
                /* JADX INFO: renamed from: a, reason: from getter */
                public tq0.n getVerifyDocumentResponse() {
                    return this.verifyDocumentResponse;
                }

                @Override // eg2.c.InterfaceC1200c
                /* JADX INFO: renamed from: b, reason: from getter */
                public boolean getIsFromScan() {
                    return this.isFromScan;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Content)) {
                        return false;
                    }
                    Content content = (Content) other;
                    return fr.t.c(this.verifyDocumentResponse, content.verifyDocumentResponse) && this.isFromScan == content.isFromScan;
                }

                public int hashCode() {
                    return (this.verifyDocumentResponse.hashCode() * 31) + Boolean.hashCode(this.isFromScan);
                }

                public String toString() {
                    return "Content(verifyDocumentResponse=" + this.verifyDocumentResponse + ", isFromScan=" + this.isFromScan + ')';
                }
            }

            /* JADX INFO: renamed from: eg2.c$c$c$b, reason: from toString */
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Leg2/c$c$c$b;", "Leg2/c$c$c;", "Ltq0/n;", "verifyDocumentResponse", "", "isFromScan", "Lcb4/i;", "dialogVMS", "<init>", "(Ltq0/n;ZLcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ltq0/n;", "()Ltq0/n;", "b", "Z", "()Z", "c", "Lcb4/i;", "()Lcb4/i;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class PermissionDialog implements InterfaceC1202c {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final tq0.n verifyDocumentResponse;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean isFromScan;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final cb4.i dialogVMS;

                public PermissionDialog(tq0.n nVar, boolean z15, cb4.i iVar) {
                    this.verifyDocumentResponse = nVar;
                    this.isFromScan = z15;
                    this.dialogVMS = iVar;
                }

                @Override // eg2.c.InterfaceC1200c
                /* JADX INFO: renamed from: a, reason: from getter */
                public tq0.n getVerifyDocumentResponse() {
                    return this.verifyDocumentResponse;
                }

                @Override // eg2.c.InterfaceC1200c
                /* JADX INFO: renamed from: b, reason: from getter */
                public boolean getIsFromScan() {
                    return this.isFromScan;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final cb4.i getDialogVMS() {
                    return this.dialogVMS;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PermissionDialog)) {
                        return false;
                    }
                    PermissionDialog permissionDialog = (PermissionDialog) other;
                    return fr.t.c(this.verifyDocumentResponse, permissionDialog.verifyDocumentResponse) && this.isFromScan == permissionDialog.isFromScan && fr.t.c(this.dialogVMS, permissionDialog.dialogVMS);
                }

                public int hashCode() {
                    return (((this.verifyDocumentResponse.hashCode() * 31) + Boolean.hashCode(this.isFromScan)) * 31) + this.dialogVMS.hashCode();
                }

                public String toString() {
                    return "PermissionDialog(verifyDocumentResponse=" + this.verifyDocumentResponse + ", isFromScan=" + this.isFromScan + ", dialogVMS=" + this.dialogVMS + ')';
                }
            }
        }

        /* JADX INFO: renamed from: eg2.c$c$d, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Leg2/c$c$d;", "Leg2/c$c;", "Ltq0/n;", "verifyDocumentResponse", "", "isFromScan", "Lhb4/c;", "errorVMS", "<init>", "(Ltq0/n;ZLhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ltq0/n;", "()Ltq0/n;", "b", "Z", "()Z", "c", "Lhb4/c;", "()Lhb4/c;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements InterfaceC1200c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final tq0.n verifyDocumentResponse;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isFromScan;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(tq0.n nVar, boolean z15, hb4.c cVar) {
                this.verifyDocumentResponse = nVar;
                this.isFromScan = z15;
                this.errorVMS = cVar;
            }

            @Override // eg2.c.InterfaceC1200c
            /* JADX INFO: renamed from: a, reason: from getter */
            public tq0.n getVerifyDocumentResponse() {
                return this.verifyDocumentResponse;
            }

            @Override // eg2.c.InterfaceC1200c
            /* JADX INFO: renamed from: b, reason: from getter */
            public boolean getIsFromScan() {
                return this.isFromScan;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return fr.t.c(this.verifyDocumentResponse, error.verifyDocumentResponse) && this.isFromScan == error.isFromScan && fr.t.c(this.errorVMS, error.errorVMS);
            }

            public int hashCode() {
                return (((this.verifyDocumentResponse.hashCode() * 31) + Boolean.hashCode(this.isFromScan)) * 31) + this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(verifyDocumentResponse=" + this.verifyDocumentResponse + ", isFromScan=" + this.isFromScan + ", errorVMS=" + this.errorVMS + ')';
            }
        }

        /* JADX INFO: renamed from: a */
        tq0.n getVerifyDocumentResponse();

        /* JADX INFO: renamed from: b */
        boolean getIsFromScan();
    }
}
