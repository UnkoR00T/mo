package kz2;

import c74.WKAuthSigningParams;
import my.JWSTokenStructure;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lkz2/n;", "", "", "a", "()Z", "areAnimationsEnabled", "b", "d", "c", "Lkz2/n$a;", "Lkz2/n$b;", "Lkz2/n$c;", "Lkz2/n$d;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface n {

    /* JADX INFO: renamed from: kz2.n$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkz2/n$a;", "Lkz2/n;", "", "areAnimationsEnabled", "Lhb4/c;", "errorVMS", "<init>", "(ZLhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Lhb4/c;", "()Lhb4/c;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ErrorData implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean areAnimationsEnabled;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        public ErrorData(boolean z15, hb4.c cVar) {
            this.areAnimationsEnabled = z15;
            this.errorVMS = cVar;
        }

        @Override // kz2.n
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getAreAnimationsEnabled() {
            return this.areAnimationsEnabled;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorData)) {
                return false;
            }
            ErrorData errorData = (ErrorData) other;
            return this.areAnimationsEnabled == errorData.areAnimationsEnabled && fr.t.c(this.errorVMS, errorData.errorVMS);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.areAnimationsEnabled) * 31) + this.errorVMS.hashCode();
        }

        public String toString() {
            return "ErrorData(areAnimationsEnabled=" + this.areAnimationsEnabled + ", errorVMS=" + this.errorVMS + ')';
        }
    }

    /* JADX INFO: renamed from: kz2.n$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkz2/n$b;", "Lkz2/n;", "", "areAnimationsEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Init implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean areAnimationsEnabled;

        public Init(boolean z15) {
            this.areAnimationsEnabled = z15;
        }

        @Override // kz2.n
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getAreAnimationsEnabled() {
            return this.areAnimationsEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Init) && this.areAnimationsEnabled == ((Init) other).areAnimationsEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.areAnimationsEnabled);
        }

        public String toString() {
            return "Init(areAnimationsEnabled=" + this.areAnimationsEnabled + ')';
        }
    }

    /* JADX INFO: renamed from: kz2.n$c, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001b"}, d2 = {"Lkz2/n$c;", "Lkz2/n;", "", "areAnimationsEnabled", "", "providerUrl", "Lgz2/i0;", "entryPoint", "<init>", "(ZLjava/lang/String;Lgz2/i0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "c", "Lgz2/i0;", "()Lgz2/i0;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean areAnimationsEnabled;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String providerUrl;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final gz2.i0 entryPoint;

        public Success(boolean z15, String str, gz2.i0 i0Var) {
            this.areAnimationsEnabled = z15;
            this.providerUrl = str;
            this.entryPoint = i0Var;
        }

        @Override // kz2.n
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getAreAnimationsEnabled() {
            return this.areAnimationsEnabled;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final gz2.i0 getEntryPoint() {
            return this.entryPoint;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getProviderUrl() {
            return this.providerUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return this.areAnimationsEnabled == success.areAnimationsEnabled && fr.t.c(this.providerUrl, success.providerUrl) && this.entryPoint == success.entryPoint;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.areAnimationsEnabled) * 31) + this.providerUrl.hashCode()) * 31) + this.entryPoint.hashCode();
        }

        public String toString() {
            return "Success(areAnimationsEnabled=" + this.areAnimationsEnabled + ", providerUrl=" + this.providerUrl + ", entryPoint=" + this.entryPoint + ')';
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\b\r\u000e\u000f\u0010\u0011\u0006\u0012\u0013B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000b\u0082\u0001\b\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lkz2/n$d;", "Lkz2/n;", "Lkz2/n$d$i;", "data", "<init>", "(Lkz2/n$d$i;)V", "a", "Lkz2/n$d$i;", "b", "()Lkz2/n$d$i;", "", "()Z", "areAnimationsEnabled", "c", "g", "f", "h", "d", "e", "i", "Lkz2/n$d$a;", "Lkz2/n$d$b;", "Lkz2/n$d$c;", "Lkz2/n$d$d;", "Lkz2/n$d$e;", "Lkz2/n$d$f;", "Lkz2/n$d$g;", "Lkz2/n$d$h;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class d implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final StateData data;

        /* JADX INFO: renamed from: kz2.n$d$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lkz2/n$d$a;", "Lkz2/n$d;", "Lkz2/n$d$i;", "data", "Lny/a;", "eIdCardJWSEToken", "mIdCardJWSEToken", "<init>", "(Lkz2/n$d$i;Liy/b0;Liy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lkz2/n$d$i;", "()Lkz2/n$d$i;", "c", "Liy/b0;", "()Liy/b0;", "d", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Authenticate extends d {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 eIdCardJWSEToken;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 mIdCardJWSEToken;

            public /* synthetic */ Authenticate(StateData stateData, iy.b0 b0Var, iy.b0 b0Var2, fr.k kVar) {
                this(stateData, b0Var, b0Var2);
            }

            @Override // kz2.n.d
            /* JADX INFO: renamed from: b, reason: from getter */
            public StateData getData() {
                return this.data;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final iy.b0 getEIdCardJWSEToken() {
                return this.eIdCardJWSEToken;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final iy.b0 getMIdCardJWSEToken() {
                return this.mIdCardJWSEToken;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Authenticate)) {
                    return false;
                }
                Authenticate authenticate = (Authenticate) other;
                return fr.t.c(this.data, authenticate.data) && ny.a.d(this.eIdCardJWSEToken, authenticate.eIdCardJWSEToken) && ny.a.d(this.mIdCardJWSEToken, authenticate.mIdCardJWSEToken);
            }

            public int hashCode() {
                return (((this.data.hashCode() * 31) + ny.a.e(this.eIdCardJWSEToken)) * 31) + ny.a.e(this.mIdCardJWSEToken);
            }

            public String toString() {
                return "Authenticate(data=" + this.data + ", eIdCardJWSEToken=" + ((Object) ny.a.f(this.eIdCardJWSEToken)) + ", mIdCardJWSEToken=" + ((Object) ny.a.f(this.mIdCardJWSEToken)) + ')';
            }

            private Authenticate(StateData stateData, iy.b0 b0Var, iy.b0 b0Var2) {
                super(stateData, null);
                this.data = stateData;
                this.eIdCardJWSEToken = b0Var;
                this.mIdCardJWSEToken = b0Var2;
            }
        }

        /* JADX INFO: renamed from: kz2.n$d$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkz2/n$d$b;", "Lkz2/n$d;", "Lkz2/n$d$i;", "data", "<init>", "(Lkz2/n$d$i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lkz2/n$d$i;", "()Lkz2/n$d$i;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CheckNfc extends d {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            public CheckNfc(StateData stateData) {
                super(stateData, null);
                this.data = stateData;
            }

            @Override // kz2.n.d
            /* JADX INFO: renamed from: b, reason: from getter */
            public StateData getData() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CheckNfc) && fr.t.c(this.data, ((CheckNfc) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "CheckNfc(data=" + this.data + ')';
            }
        }

        /* JADX INFO: renamed from: kz2.n$d$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkz2/n$d$c;", "Lkz2/n$d;", "Lkz2/n$d$i;", "data", "<init>", "(Lkz2/n$d$i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lkz2/n$d$i;", "()Lkz2/n$d$i;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CreateJWSEForMID extends d {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            public CreateJWSEForMID(StateData stateData) {
                super(stateData, null);
                this.data = stateData;
            }

            @Override // kz2.n.d
            /* JADX INFO: renamed from: b, reason: from getter */
            public StateData getData() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CreateJWSEForMID) && fr.t.c(this.data, ((CreateJWSEForMID) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "CreateJWSEForMID(data=" + this.data + ')';
            }
        }

        /* JADX INFO: renamed from: kz2.n$d$d, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001d\u0010 ¨\u0006!"}, d2 = {"Lkz2/n$d$d;", "Lkz2/n$d;", "Lkz2/n$d$i;", "data", "Lmy/f;", "jwsStructure", "Liy/b0;", "signedWithIDCardBase64", "Lny/a;", "mIdCardJWSEToken", "<init>", "(Lkz2/n$d$i;Lmy/f;Liy/b0;Liy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lkz2/n$d$i;", "()Lkz2/n$d$i;", "c", "Lmy/f;", "()Lmy/f;", "d", "Liy/b0;", "e", "()Liy/b0;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CreateJWSEToken extends d {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final JWSTokenStructure jwsStructure;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 signedWithIDCardBase64;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 mIdCardJWSEToken;

            public /* synthetic */ CreateJWSEToken(StateData stateData, JWSTokenStructure jWSTokenStructure, iy.b0 b0Var, iy.b0 b0Var2, fr.k kVar) {
                this(stateData, jWSTokenStructure, b0Var, b0Var2);
            }

            @Override // kz2.n.d
            /* JADX INFO: renamed from: b, reason: from getter */
            public StateData getData() {
                return this.data;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final JWSTokenStructure getJwsStructure() {
                return this.jwsStructure;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final iy.b0 getMIdCardJWSEToken() {
                return this.mIdCardJWSEToken;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final iy.b0 getSignedWithIDCardBase64() {
                return this.signedWithIDCardBase64;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CreateJWSEToken)) {
                    return false;
                }
                CreateJWSEToken createJWSEToken = (CreateJWSEToken) other;
                return fr.t.c(this.data, createJWSEToken.data) && fr.t.c(this.jwsStructure, createJWSEToken.jwsStructure) && fr.t.c(this.signedWithIDCardBase64, createJWSEToken.signedWithIDCardBase64) && ny.a.d(this.mIdCardJWSEToken, createJWSEToken.mIdCardJWSEToken);
            }

            public int hashCode() {
                return (((((this.data.hashCode() * 31) + this.jwsStructure.hashCode()) * 31) + this.signedWithIDCardBase64.hashCode()) * 31) + ny.a.e(this.mIdCardJWSEToken);
            }

            public String toString() {
                return "CreateJWSEToken(data=" + this.data + ", jwsStructure=" + this.jwsStructure + ", signedWithIDCardBase64=" + this.signedWithIDCardBase64 + ", mIdCardJWSEToken=" + ((Object) ny.a.f(this.mIdCardJWSEToken)) + ')';
            }

            private CreateJWSEToken(StateData stateData, JWSTokenStructure jWSTokenStructure, iy.b0 b0Var, iy.b0 b0Var2) {
                super(stateData, null);
                this.data = stateData;
                this.jwsStructure = jWSTokenStructure;
                this.signedWithIDCardBase64 = b0Var;
                this.mIdCardJWSEToken = b0Var2;
            }
        }

        /* JADX INFO: renamed from: kz2.n$d$e, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lkz2/n$d$e;", "Lkz2/n$d;", "Lkz2/n$d$i;", "data", "Lhb4/c;", "errorVMS", "<init>", "(Lkz2/n$d$i;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lkz2/n$d$i;", "()Lkz2/n$d$i;", "c", "Lhb4/c;", "()Lhb4/c;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends d {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(StateData stateData, hb4.c cVar) {
                super(stateData, null);
                this.data = stateData;
                this.errorVMS = cVar;
            }

            @Override // kz2.n.d
            /* JADX INFO: renamed from: b, reason: from getter */
            public StateData getData() {
                return this.data;
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
                return fr.t.c(this.data, error.data) && fr.t.c(this.errorVMS, error.errorVMS);
            }

            public int hashCode() {
                return (this.data.hashCode() * 31) + this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(data=" + this.data + ", errorVMS=" + this.errorVMS + ')';
            }
        }

        /* JADX INFO: renamed from: kz2.n$d$f, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lkz2/n$d$f;", "Lkz2/n$d;", "Lkz2/n$d$i;", "data", "Lny/a;", "mIdCardJWSEToken", "Lmy/e;", "mIdCardJWSToken", "<init>", "(Lkz2/n$d$i;Liy/b0;Liy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lkz2/n$d$i;", "()Lkz2/n$d$i;", "c", "Liy/b0;", "()Liy/b0;", "d", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InitAuthentication extends d {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 mIdCardJWSEToken;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 mIdCardJWSToken;

            public /* synthetic */ InitAuthentication(StateData stateData, iy.b0 b0Var, iy.b0 b0Var2, fr.k kVar) {
                this(stateData, b0Var, b0Var2);
            }

            @Override // kz2.n.d
            /* JADX INFO: renamed from: b, reason: from getter */
            public StateData getData() {
                return this.data;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final iy.b0 getMIdCardJWSEToken() {
                return this.mIdCardJWSEToken;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final iy.b0 getMIdCardJWSToken() {
                return this.mIdCardJWSToken;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InitAuthentication)) {
                    return false;
                }
                InitAuthentication initAuthentication = (InitAuthentication) other;
                return fr.t.c(this.data, initAuthentication.data) && ny.a.d(this.mIdCardJWSEToken, initAuthentication.mIdCardJWSEToken) && my.e.b(this.mIdCardJWSToken, initAuthentication.mIdCardJWSToken);
            }

            public int hashCode() {
                return (((this.data.hashCode() * 31) + ny.a.e(this.mIdCardJWSEToken)) * 31) + my.e.c(this.mIdCardJWSToken);
            }

            public String toString() {
                return "InitAuthentication(data=" + this.data + ", mIdCardJWSEToken=" + ((Object) ny.a.f(this.mIdCardJWSEToken)) + ", mIdCardJWSToken=" + ((Object) my.e.d(this.mIdCardJWSToken)) + ')';
            }

            private InitAuthentication(StateData stateData, iy.b0 b0Var, iy.b0 b0Var2) {
                super(stateData, null);
                this.data = stateData;
                this.mIdCardJWSEToken = b0Var;
                this.mIdCardJWSToken = b0Var2;
            }
        }

        /* JADX INFO: renamed from: kz2.n$d$g, reason: from toString */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lkz2/n$d$g;", "Lkz2/n$d;", "Lkz2/n$d$i;", "data", "Lcy/c;", "lastReadingData", "Lny/a;", "mIdCardJWSEToken", "Lmy/e;", "mIdCardJWSToken", "<init>", "(Lkz2/n$d$i;Lcy/c;Liy/b0;Liy/b0;Lfr/k;)V", "c", "(Lkz2/n$d$i;Lcy/c;Liy/b0;Liy/b0;)Lkz2/n$d$g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lkz2/n$d$i;", "()Lkz2/n$d$i;", "Lcy/c;", "e", "()Lcy/c;", "d", "Liy/b0;", "f", "()Liy/b0;", "g", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ReadCert extends d {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final cy.c lastReadingData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 mIdCardJWSEToken;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 mIdCardJWSToken;

            public /* synthetic */ ReadCert(StateData stateData, cy.c cVar, iy.b0 b0Var, iy.b0 b0Var2, fr.k kVar) {
                this(stateData, cVar, b0Var, b0Var2);
            }

            public static /* synthetic */ ReadCert d(ReadCert readCert, StateData stateData, cy.c cVar, iy.b0 b0Var, iy.b0 b0Var2, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    stateData = readCert.data;
                }
                if ((i15 & 2) != 0) {
                    cVar = readCert.lastReadingData;
                }
                if ((i15 & 4) != 0) {
                    b0Var = readCert.mIdCardJWSEToken;
                }
                if ((i15 & 8) != 0) {
                    b0Var2 = readCert.mIdCardJWSToken;
                }
                return readCert.c(stateData, cVar, b0Var, b0Var2);
            }

            @Override // kz2.n.d
            /* JADX INFO: renamed from: b, reason: from getter */
            public StateData getData() {
                return this.data;
            }

            public final ReadCert c(StateData data, cy.c lastReadingData, iy.b0 mIdCardJWSEToken, iy.b0 mIdCardJWSToken) {
                return new ReadCert(data, lastReadingData, mIdCardJWSEToken, mIdCardJWSToken, null);
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
                return fr.t.c(this.data, readCert.data) && fr.t.c(this.lastReadingData, readCert.lastReadingData) && ny.a.d(this.mIdCardJWSEToken, readCert.mIdCardJWSEToken) && my.e.b(this.mIdCardJWSToken, readCert.mIdCardJWSToken);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final iy.b0 getMIdCardJWSEToken() {
                return this.mIdCardJWSEToken;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final iy.b0 getMIdCardJWSToken() {
                return this.mIdCardJWSToken;
            }

            public int hashCode() {
                int iHashCode = this.data.hashCode() * 31;
                cy.c cVar = this.lastReadingData;
                return ((((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + ny.a.e(this.mIdCardJWSEToken)) * 31) + my.e.c(this.mIdCardJWSToken);
            }

            public String toString() {
                return "ReadCert(data=" + this.data + ", lastReadingData=" + this.lastReadingData + ", mIdCardJWSEToken=" + ((Object) ny.a.f(this.mIdCardJWSEToken)) + ", mIdCardJWSToken=" + ((Object) my.e.d(this.mIdCardJWSToken)) + ')';
            }

            private ReadCert(StateData stateData, cy.c cVar, iy.b0 b0Var, iy.b0 b0Var2) {
                super(stateData, null);
                this.data = stateData;
                this.lastReadingData = cVar;
                this.mIdCardJWSEToken = b0Var;
                this.mIdCardJWSToken = b0Var2;
            }

            public /* synthetic */ ReadCert(StateData stateData, cy.c cVar, iy.b0 b0Var, iy.b0 b0Var2, int i15, fr.k kVar) {
                this(stateData, (i15 & 2) != 0 ? null : cVar, b0Var, b0Var2, null);
            }
        }

        /* JADX INFO: renamed from: kz2.n$d$h, reason: from toString */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lkz2/n$d$h;", "Lkz2/n$d;", "Lkz2/n$d$i;", "data", "Lcy/c;", "lastReadingData", "Lmy/f;", "jwsStructure", "Lny/a;", "mIdCardJWSEToken", "<init>", "(Lkz2/n$d$i;Lcy/c;Lmy/f;Liy/b0;Lfr/k;)V", "c", "(Lkz2/n$d$i;Lcy/c;Lmy/f;Liy/b0;)Lkz2/n$d$h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lkz2/n$d$i;", "()Lkz2/n$d$i;", "Lcy/c;", "f", "()Lcy/c;", "d", "Lmy/f;", "e", "()Lmy/f;", "Liy/b0;", "g", "()Liy/b0;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SignWithIdCard extends d {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final cy.c lastReadingData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final JWSTokenStructure jwsStructure;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 mIdCardJWSEToken;

            public /* synthetic */ SignWithIdCard(StateData stateData, cy.c cVar, JWSTokenStructure jWSTokenStructure, iy.b0 b0Var, fr.k kVar) {
                this(stateData, cVar, jWSTokenStructure, b0Var);
            }

            public static /* synthetic */ SignWithIdCard d(SignWithIdCard signWithIdCard, StateData stateData, cy.c cVar, JWSTokenStructure jWSTokenStructure, iy.b0 b0Var, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    stateData = signWithIdCard.data;
                }
                if ((i15 & 2) != 0) {
                    cVar = signWithIdCard.lastReadingData;
                }
                if ((i15 & 4) != 0) {
                    jWSTokenStructure = signWithIdCard.jwsStructure;
                }
                if ((i15 & 8) != 0) {
                    b0Var = signWithIdCard.mIdCardJWSEToken;
                }
                return signWithIdCard.c(stateData, cVar, jWSTokenStructure, b0Var);
            }

            @Override // kz2.n.d
            /* JADX INFO: renamed from: b, reason: from getter */
            public StateData getData() {
                return this.data;
            }

            public final SignWithIdCard c(StateData data, cy.c lastReadingData, JWSTokenStructure jwsStructure, iy.b0 mIdCardJWSEToken) {
                return new SignWithIdCard(data, lastReadingData, jwsStructure, mIdCardJWSEToken, null);
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final JWSTokenStructure getJwsStructure() {
                return this.jwsStructure;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SignWithIdCard)) {
                    return false;
                }
                SignWithIdCard signWithIdCard = (SignWithIdCard) other;
                return fr.t.c(this.data, signWithIdCard.data) && fr.t.c(this.lastReadingData, signWithIdCard.lastReadingData) && fr.t.c(this.jwsStructure, signWithIdCard.jwsStructure) && ny.a.d(this.mIdCardJWSEToken, signWithIdCard.mIdCardJWSEToken);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final cy.c getLastReadingData() {
                return this.lastReadingData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final iy.b0 getMIdCardJWSEToken() {
                return this.mIdCardJWSEToken;
            }

            public int hashCode() {
                int iHashCode = this.data.hashCode() * 31;
                cy.c cVar = this.lastReadingData;
                return ((((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.jwsStructure.hashCode()) * 31) + ny.a.e(this.mIdCardJWSEToken);
            }

            public String toString() {
                return "SignWithIdCard(data=" + this.data + ", lastReadingData=" + this.lastReadingData + ", jwsStructure=" + this.jwsStructure + ", mIdCardJWSEToken=" + ((Object) ny.a.f(this.mIdCardJWSEToken)) + ')';
            }

            private SignWithIdCard(StateData stateData, cy.c cVar, JWSTokenStructure jWSTokenStructure, iy.b0 b0Var) {
                super(stateData, null);
                this.data = stateData;
                this.lastReadingData = cVar;
                this.jwsStructure = jWSTokenStructure;
                this.mIdCardJWSEToken = b0Var;
            }

            public /* synthetic */ SignWithIdCard(StateData stateData, cy.c cVar, JWSTokenStructure jWSTokenStructure, iy.b0 b0Var, int i15, fr.k kVar) {
                this(stateData, (i15 & 2) != 0 ? null : cVar, jWSTokenStructure, b0Var, null);
            }
        }

        public /* synthetic */ d(StateData stateData, fr.k kVar) {
            this(stateData);
        }

        @Override // kz2.n
        /* JADX INFO: renamed from: a */
        public boolean getAreAnimationsEnabled() {
            return getData().getAreAnimationsEnabled();
        }

        /* JADX INFO: renamed from: b */
        public abstract StateData getData();

        private d(StateData stateData) {
            this.data = stateData;
        }

        /* JADX INFO: renamed from: kz2.n$d$i, reason: from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001e\u0010#¨\u0006$"}, d2 = {"Lkz2/n$d$i;", "", "Lc74/b;", "signingParams", "Lkz2/l;", "verificationData", "Liy/b0;", "presenceCert", "", "areAnimationsEnabled", "<init>", "(Lc74/b;Lkz2/l;Liy/b0;Z)V", "a", "(Lc74/b;Lkz2/l;Liy/b0;Z)Lkz2/n$d$i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lc74/b;", "e", "()Lc74/b;", "b", "Lkz2/l;", "f", "()Lkz2/l;", "c", "Liy/b0;", "d", "()Liy/b0;", "Z", "()Z", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class StateData {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final WKAuthSigningParams signingParams;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final VerificationSharedData verificationData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 presenceCert;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean areAnimationsEnabled;

            public StateData(WKAuthSigningParams wKAuthSigningParams, VerificationSharedData verificationSharedData, iy.b0 b0Var, boolean z15) {
                this.signingParams = wKAuthSigningParams;
                this.verificationData = verificationSharedData;
                this.presenceCert = b0Var;
                this.areAnimationsEnabled = z15;
            }

            public static /* synthetic */ StateData b(StateData stateData, WKAuthSigningParams wKAuthSigningParams, VerificationSharedData verificationSharedData, iy.b0 b0Var, boolean z15, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    wKAuthSigningParams = stateData.signingParams;
                }
                if ((i15 & 2) != 0) {
                    verificationSharedData = stateData.verificationData;
                }
                if ((i15 & 4) != 0) {
                    b0Var = stateData.presenceCert;
                }
                if ((i15 & 8) != 0) {
                    z15 = stateData.areAnimationsEnabled;
                }
                return stateData.a(wKAuthSigningParams, verificationSharedData, b0Var, z15);
            }

            public final StateData a(WKAuthSigningParams signingParams, VerificationSharedData verificationData, iy.b0 presenceCert, boolean areAnimationsEnabled) {
                return new StateData(signingParams, verificationData, presenceCert, areAnimationsEnabled);
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getAreAnimationsEnabled() {
                return this.areAnimationsEnabled;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final iy.b0 getPresenceCert() {
                return this.presenceCert;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final WKAuthSigningParams getSigningParams() {
                return this.signingParams;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StateData)) {
                    return false;
                }
                StateData stateData = (StateData) other;
                return fr.t.c(this.signingParams, stateData.signingParams) && fr.t.c(this.verificationData, stateData.verificationData) && fr.t.c(this.presenceCert, stateData.presenceCert) && this.areAnimationsEnabled == stateData.areAnimationsEnabled;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final VerificationSharedData getVerificationData() {
                return this.verificationData;
            }

            public int hashCode() {
                return (((((this.signingParams.hashCode() * 31) + this.verificationData.hashCode()) * 31) + this.presenceCert.hashCode()) * 31) + Boolean.hashCode(this.areAnimationsEnabled);
            }

            public String toString() {
                return "StateData(signingParams=" + this.signingParams + ", verificationData=" + this.verificationData + ", presenceCert=" + this.presenceCert + ", areAnimationsEnabled=" + this.areAnimationsEnabled + ')';
            }

            public /* synthetic */ StateData(WKAuthSigningParams wKAuthSigningParams, VerificationSharedData verificationSharedData, iy.b0 b0Var, boolean z15, int i15, fr.k kVar) {
                this(wKAuthSigningParams, verificationSharedData, (i15 & 4) != 0 ? iy.b0.INSTANCE.a() : b0Var, z15);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    boolean getAreAnimationsEnabled();
}
