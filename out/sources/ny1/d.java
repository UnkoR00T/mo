package ny1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0003\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lny1/d;", "", "", "a", "()Z", "areAnimationsEnabled", "b", "Lny1/d$a;", "Lny1/d$b;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: ny1.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lny1/d$a;", "Lny1/d;", "", "areAnimationsEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initial implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean areAnimationsEnabled;

        public Initial(boolean z15) {
            this.areAnimationsEnabled = z15;
        }

        @Override // ny1.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getAreAnimationsEnabled() {
            return this.areAnimationsEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initial) && this.areAnimationsEnabled == ((Initial) other).areAnimationsEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.areAnimationsEnabled);
        }

        public String toString() {
            return "Initial(areAnimationsEnabled=" + this.areAnimationsEnabled + ')';
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0006\r\b\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000b\u0082\u0001\u0006\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lny1/d$b;", "Lny1/d;", "Lny1/d$b$d;", "formData", "<init>", "(Lny1/d$b$d;)V", "a", "Lny1/d$b$d;", "b", "()Lny1/d$b$d;", "", "()Z", "areAnimationsEnabled", "e", "f", "g", "c", "d", "Lny1/d$b$a;", "Lny1/d$b$b;", "Lny1/d$b$c;", "Lny1/d$b$e;", "Lny1/d$b$f;", "Lny1/d$b$g;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f139520b = iy.b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final FormData formData;

        /* JADX INFO: renamed from: ny1.d$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lny1/d$b$b;", "Lny1/d$b;", "Lny1/d$b$d;", "formData", "Liy/b0;", "authorizationCert", "<init>", "(Lny1/d$b$d;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lny1/d$b$d;", "b", "()Lny1/d$b$d;", "d", "Liy/b0;", "()Liy/b0;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CompareCertData extends b {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f139525e = iy.b0.f97726c;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final FormData formData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 authorizationCert;

            public CompareCertData(FormData formData, iy.b0 b0Var) {
                super(formData, null);
                this.formData = formData;
                this.authorizationCert = b0Var;
            }

            @Override // ny1.d.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public FormData getFormData() {
                return this.formData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final iy.b0 getAuthorizationCert() {
                return this.authorizationCert;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CompareCertData)) {
                    return false;
                }
                CompareCertData compareCertData = (CompareCertData) other;
                return fr.t.c(this.formData, compareCertData.formData) && fr.t.c(this.authorizationCert, compareCertData.authorizationCert);
            }

            public int hashCode() {
                return (this.formData.hashCode() * 31) + this.authorizationCert.hashCode();
            }

            public String toString() {
                return "CompareCertData(formData=" + this.formData + ", authorizationCert=" + this.authorizationCert + ')';
            }
        }

        /* JADX INFO: renamed from: ny1.d$b$c, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lny1/d$b$c;", "Lny1/d$b;", "Lny1/d$b$d;", "formData", "Lhb4/c;", "errorVMS", "<init>", "(Lny1/d$b$d;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lny1/d$b$d;", "b", "()Lny1/d$b$d;", "d", "Lhb4/c;", "()Lhb4/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final FormData formData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(FormData formData, hb4.c cVar) {
                super(formData, null);
                this.formData = formData;
                this.errorVMS = cVar;
            }

            @Override // ny1.d.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public FormData getFormData() {
                return this.formData;
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
                return fr.t.c(this.formData, error.formData) && fr.t.c(this.errorVMS, error.errorVMS);
            }

            public int hashCode() {
                return (this.formData.hashCode() * 31) + this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(formData=" + this.formData + ", errorVMS=" + this.errorVMS + ')';
            }
        }

        /* JADX INFO: renamed from: ny1.d$b$d, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJB\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001c\u0010\"¨\u0006#"}, d2 = {"Lny1/d$b$d;", "", "Liy/b0;", "newPin", "puk", "can", "Lyw1/a;", "certificateType", "", "areAnimationsEnabled", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Lyw1/a;Z)V", "a", "(Liy/b0;Liy/b0;Liy/b0;Lyw1/a;Z)Lny1/d$b$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "f", "()Liy/b0;", "b", "g", "c", "d", "Lyw1/a;", "e", "()Lyw1/a;", "Z", "()Z", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FormData {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f139530f = iy.b0.f97726c;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 newPin;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 puk;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 can;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final yw1.a certificateType;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean areAnimationsEnabled;

            public FormData(iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, yw1.a aVar, boolean z15) {
                this.newPin = b0Var;
                this.puk = b0Var2;
                this.can = b0Var3;
                this.certificateType = aVar;
                this.areAnimationsEnabled = z15;
            }

            public static /* synthetic */ FormData b(FormData formData, iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, yw1.a aVar, boolean z15, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    b0Var = formData.newPin;
                }
                if ((i15 & 2) != 0) {
                    b0Var2 = formData.puk;
                }
                if ((i15 & 4) != 0) {
                    b0Var3 = formData.can;
                }
                if ((i15 & 8) != 0) {
                    aVar = formData.certificateType;
                }
                if ((i15 & 16) != 0) {
                    z15 = formData.areAnimationsEnabled;
                }
                boolean z16 = z15;
                iy.b0 b0Var4 = b0Var3;
                return formData.a(b0Var, b0Var2, b0Var4, aVar, z16);
            }

            public final FormData a(iy.b0 newPin, iy.b0 puk, iy.b0 can, yw1.a certificateType, boolean areAnimationsEnabled) {
                return new FormData(newPin, puk, can, certificateType, areAnimationsEnabled);
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getAreAnimationsEnabled() {
                return this.areAnimationsEnabled;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final iy.b0 getCan() {
                return this.can;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final yw1.a getCertificateType() {
                return this.certificateType;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FormData)) {
                    return false;
                }
                FormData formData = (FormData) other;
                return fr.t.c(this.newPin, formData.newPin) && fr.t.c(this.puk, formData.puk) && fr.t.c(this.can, formData.can) && this.certificateType == formData.certificateType && this.areAnimationsEnabled == formData.areAnimationsEnabled;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final iy.b0 getNewPin() {
                return this.newPin;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final iy.b0 getPuk() {
                return this.puk;
            }

            public int hashCode() {
                return (((((((this.newPin.hashCode() * 31) + this.puk.hashCode()) * 31) + this.can.hashCode()) * 31) + this.certificateType.hashCode()) * 31) + Boolean.hashCode(this.areAnimationsEnabled);
            }

            public String toString() {
                return "FormData(newPin=" + this.newPin + ", puk=" + this.puk + ", can=" + this.can + ", certificateType=" + this.certificateType + ", areAnimationsEnabled=" + this.areAnimationsEnabled + ')';
            }
        }

        /* JADX INFO: renamed from: ny1.d$b$g, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lny1/d$b$g;", "Lny1/d$b;", "Lny1/d$b$d;", "formData", "<init>", "(Lny1/d$b$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lny1/d$b$d;", "b", "()Lny1/d$b$d;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Successful extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f139542d = iy.b0.f97726c;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final FormData formData;

            public Successful(FormData formData) {
                super(formData, null);
                this.formData = formData;
            }

            @Override // ny1.d.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public FormData getFormData() {
                return this.formData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Successful) && fr.t.c(this.formData, ((Successful) other).formData);
            }

            public int hashCode() {
                return this.formData.hashCode();
            }

            public String toString() {
                return "Successful(formData=" + this.formData + ')';
            }
        }

        public /* synthetic */ b(FormData formData, fr.k kVar) {
            this(formData);
        }

        @Override // ny1.d
        /* JADX INFO: renamed from: a */
        public boolean getAreAnimationsEnabled() {
            return getFormData().getAreAnimationsEnabled();
        }

        /* JADX INFO: renamed from: b */
        public abstract FormData getFormData();

        private b(FormData formData) {
            this.formData = formData;
        }

        /* JADX INFO: renamed from: ny1.d$b$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lny1/d$b$a;", "Lny1/d$b;", "Lny1/d$b$d;", "formData", "Lcy/c;", "lastReadingData", "<init>", "(Lny1/d$b$d;Lcy/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lny1/d$b$d;", "b", "()Lny1/d$b$d;", "d", "Lcy/c;", "getLastReadingData", "()Lcy/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CheckNfc extends b {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f139522e;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final FormData formData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final cy.c lastReadingData;

            static {
                int i15 = iy.b0.f97726c;
                f139522e = i15 | cy.c.f38445c | i15 | i15 | i15;
            }

            public CheckNfc(FormData formData, cy.c cVar) {
                super(formData, null);
                this.formData = formData;
                this.lastReadingData = cVar;
            }

            @Override // ny1.d.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public FormData getFormData() {
                return this.formData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CheckNfc)) {
                    return false;
                }
                CheckNfc checkNfc = (CheckNfc) other;
                return fr.t.c(this.formData, checkNfc.formData) && fr.t.c(this.lastReadingData, checkNfc.lastReadingData);
            }

            public int hashCode() {
                int iHashCode = this.formData.hashCode() * 31;
                cy.c cVar = this.lastReadingData;
                return iHashCode + (cVar == null ? 0 : cVar.hashCode());
            }

            public String toString() {
                return "CheckNfc(formData=" + this.formData + ", lastReadingData=" + this.lastReadingData + ')';
            }

            public /* synthetic */ CheckNfc(FormData formData, cy.c cVar, int i15, fr.k kVar) {
                this(formData, (i15 & 2) != 0 ? null : cVar);
            }
        }

        /* JADX INFO: renamed from: ny1.d$b$e, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lny1/d$b$e;", "Lny1/d$b;", "Lny1/d$b$d;", "formData", "Lcy/c;", "lastReadingData", "<init>", "(Lny1/d$b$d;Lcy/c;)V", "c", "(Lny1/d$b$d;Lcy/c;)Lny1/d$b$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lny1/d$b$d;", "b", "()Lny1/d$b$d;", "d", "Lcy/c;", "e", "()Lcy/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ReadCert extends b {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f139536e;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final FormData formData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final cy.c lastReadingData;

            static {
                int i15 = iy.b0.f97726c;
                f139536e = i15 | cy.c.f38445c | i15 | i15 | i15;
            }

            public ReadCert(FormData formData, cy.c cVar) {
                super(formData, null);
                this.formData = formData;
                this.lastReadingData = cVar;
            }

            public static /* synthetic */ ReadCert d(ReadCert readCert, FormData formData, cy.c cVar, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    formData = readCert.formData;
                }
                if ((i15 & 2) != 0) {
                    cVar = readCert.lastReadingData;
                }
                return readCert.c(formData, cVar);
            }

            @Override // ny1.d.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public FormData getFormData() {
                return this.formData;
            }

            public final ReadCert c(FormData formData, cy.c lastReadingData) {
                return new ReadCert(formData, lastReadingData);
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final cy.c getLastReadingData() {
                return this.lastReadingData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReadCert)) {
                    return false;
                }
                ReadCert readCert = (ReadCert) other;
                return fr.t.c(this.formData, readCert.formData) && fr.t.c(this.lastReadingData, readCert.lastReadingData);
            }

            public int hashCode() {
                int iHashCode = this.formData.hashCode() * 31;
                cy.c cVar = this.lastReadingData;
                return iHashCode + (cVar == null ? 0 : cVar.hashCode());
            }

            public String toString() {
                return "ReadCert(formData=" + this.formData + ", lastReadingData=" + this.lastReadingData + ')';
            }

            public /* synthetic */ ReadCert(FormData formData, cy.c cVar, int i15, fr.k kVar) {
                this(formData, (i15 & 2) != 0 ? null : cVar);
            }
        }

        /* JADX INFO: renamed from: ny1.d$b$f, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lny1/d$b$f;", "Lny1/d$b;", "Lny1/d$b$d;", "formData", "Lcy/c;", "lastReadingData", "<init>", "(Lny1/d$b$d;Lcy/c;)V", "c", "(Lny1/d$b$d;Lcy/c;)Lny1/d$b$f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lny1/d$b$d;", "b", "()Lny1/d$b$d;", "d", "Lcy/c;", "e", "()Lcy/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ResetPin extends b {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f139539e;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final FormData formData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final cy.c lastReadingData;

            static {
                int i15 = iy.b0.f97726c;
                f139539e = i15 | cy.c.f38445c | i15 | i15 | i15;
            }

            public ResetPin(FormData formData, cy.c cVar) {
                super(formData, null);
                this.formData = formData;
                this.lastReadingData = cVar;
            }

            public static /* synthetic */ ResetPin d(ResetPin resetPin, FormData formData, cy.c cVar, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    formData = resetPin.formData;
                }
                if ((i15 & 2) != 0) {
                    cVar = resetPin.lastReadingData;
                }
                return resetPin.c(formData, cVar);
            }

            @Override // ny1.d.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public FormData getFormData() {
                return this.formData;
            }

            public final ResetPin c(FormData formData, cy.c lastReadingData) {
                return new ResetPin(formData, lastReadingData);
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final cy.c getLastReadingData() {
                return this.lastReadingData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ResetPin)) {
                    return false;
                }
                ResetPin resetPin = (ResetPin) other;
                return fr.t.c(this.formData, resetPin.formData) && fr.t.c(this.lastReadingData, resetPin.lastReadingData);
            }

            public int hashCode() {
                int iHashCode = this.formData.hashCode() * 31;
                cy.c cVar = this.lastReadingData;
                return iHashCode + (cVar == null ? 0 : cVar.hashCode());
            }

            public String toString() {
                return "ResetPin(formData=" + this.formData + ", lastReadingData=" + this.lastReadingData + ')';
            }

            public /* synthetic */ ResetPin(FormData formData, cy.c cVar, int i15, fr.k kVar) {
                this(formData, (i15 & 2) != 0 ? null : cVar);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    boolean getAreAnimationsEnabled();
}
