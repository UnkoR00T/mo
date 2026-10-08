package gy1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0003\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lgy1/c;", "", "", "a", "()Z", "areAnimationsEnabled", "b", "c", "Lgy1/c$a;", "Lgy1/c$b;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: gy1.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lgy1/c$a;", "Lgy1/c;", "", "areAnimationsEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Init implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean areAnimationsEnabled;

        public Init(boolean z15) {
            this.areAnimationsEnabled = z15;
        }

        @Override // gy1.c
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

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0006\r\b\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000b\u0082\u0001\u0006\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lgy1/c$b;", "Lgy1/c;", "Lgy1/c$b$f;", "data", "<init>", "(Lgy1/c$b$f;)V", "a", "Lgy1/c$b$f;", "c", "()Lgy1/c$b$f;", "", "()Z", "areAnimationsEnabled", "e", "d", "g", "b", "f", "Lgy1/c$b$a;", "Lgy1/c$b$b;", "Lgy1/c$b$c;", "Lgy1/c$b$d;", "Lgy1/c$b$e;", "Lgy1/c$b$g;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f78274b = iy.b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final StateData data;

        /* JADX INFO: renamed from: gy1.c$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgy1/c$b$a;", "Lgy1/c$b;", "Lgy1/c$b$f;", "data", "<init>", "(Lgy1/c$b$f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lgy1/c$b$f;", "()Lgy1/c$b$f;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CheckNfc extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f78276d = iy.b0.f97726c;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            public CheckNfc(StateData stateData) {
                super(stateData, null);
                this.data = stateData;
            }

            @Override // gy1.c.b
            /* JADX INFO: renamed from: c, reason: from getter */
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

        /* JADX INFO: renamed from: gy1.c$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lgy1/c$b$b;", "Lgy1/c$b;", "Lgy1/c$b$f;", "data", "Lhb4/c;", "errorVMS", "<init>", "(Lgy1/c$b$f;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lgy1/c$b$f;", "()Lgy1/c$b$f;", "d", "Lhb4/c;", "()Lhb4/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(StateData stateData, hb4.c cVar) {
                super(stateData, null);
                this.data = stateData;
                this.errorVMS = cVar;
            }

            @Override // gy1.c.b
            /* JADX INFO: renamed from: c, reason: from getter */
            public StateData getData() {
                return this.data;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
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

        /* JADX INFO: renamed from: gy1.c$b$g, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgy1/c$b$g;", "Lgy1/c$b;", "Lgy1/c$b$f;", "data", "<init>", "(Lgy1/c$b$f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lgy1/c$b$f;", "()Lgy1/c$b$f;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Success extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f78295d = iy.b0.f97726c;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            public Success(StateData stateData) {
                super(stateData, null);
                this.data = stateData;
            }

            @Override // gy1.c.b
            /* JADX INFO: renamed from: c, reason: from getter */
            public StateData getData() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && fr.t.c(this.data, ((Success) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "Success(data=" + this.data + ')';
            }
        }

        public /* synthetic */ b(StateData stateData, fr.k kVar) {
            this(stateData);
        }

        @Override // gy1.c
        /* JADX INFO: renamed from: a */
        public boolean getAreAnimationsEnabled() {
            return getData().getAreAnimationsEnabled();
        }

        /* JADX INFO: renamed from: c */
        public abstract StateData getData();

        private b(StateData stateData) {
            this.data = stateData;
        }

        /* JADX INFO: renamed from: gy1.c$b$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lgy1/c$b$c;", "Lgy1/c$b;", "Lgy1/c$c;", "Lgy1/c$b$f;", "data", "Lcy/c;", "lastReadingData", "<init>", "(Lgy1/c$b$f;Lcy/c;)V", "d", "(Lgy1/c$b$f;Lcy/c;)Lgy1/c$b$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lgy1/c$b$f;", "()Lgy1/c$b$f;", "Lcy/c;", "b", "()Lcy/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ReadAuthenticationCert extends b implements InterfaceC1782c {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f78280e;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final cy.c lastReadingData;

            static {
                int i15 = iy.b0.f97726c;
                f78280e = i15 | cy.c.f38445c | i15;
            }

            public ReadAuthenticationCert(StateData stateData, cy.c cVar) {
                super(stateData, null);
                this.data = stateData;
                this.lastReadingData = cVar;
            }

            public static /* synthetic */ ReadAuthenticationCert e(ReadAuthenticationCert readAuthenticationCert, StateData stateData, cy.c cVar, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    stateData = readAuthenticationCert.data;
                }
                if ((i15 & 2) != 0) {
                    cVar = readAuthenticationCert.lastReadingData;
                }
                return readAuthenticationCert.d(stateData, cVar);
            }

            @Override // gy1.c.InterfaceC1782c
            /* JADX INFO: renamed from: b, reason: from getter */
            public cy.c getLastReadingData() {
                return this.lastReadingData;
            }

            @Override // gy1.c.b
            /* JADX INFO: renamed from: c, reason: from getter */
            public StateData getData() {
                return this.data;
            }

            public final ReadAuthenticationCert d(StateData data, cy.c lastReadingData) {
                return new ReadAuthenticationCert(data, lastReadingData);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReadAuthenticationCert)) {
                    return false;
                }
                ReadAuthenticationCert readAuthenticationCert = (ReadAuthenticationCert) other;
                return fr.t.c(this.data, readAuthenticationCert.data) && fr.t.c(this.lastReadingData, readAuthenticationCert.lastReadingData);
            }

            public int hashCode() {
                int iHashCode = this.data.hashCode() * 31;
                cy.c cVar = this.lastReadingData;
                return iHashCode + (cVar == null ? 0 : cVar.hashCode());
            }

            public String toString() {
                return "ReadAuthenticationCert(data=" + this.data + ", lastReadingData=" + this.lastReadingData + ')';
            }

            public /* synthetic */ ReadAuthenticationCert(StateData stateData, cy.c cVar, int i15, fr.k kVar) {
                this(stateData, (i15 & 2) != 0 ? null : cVar);
            }
        }

        /* JADX INFO: renamed from: gy1.c$b$d, reason: from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lgy1/c$b$d;", "Lgy1/c$b;", "Lgy1/c$c;", "Lgy1/c$b$f;", "data", "Lcy/c;", "lastReadingData", "<init>", "(Lgy1/c$b$f;Lcy/c;)V", "d", "(Lgy1/c$b$f;Lcy/c;)Lgy1/c$b$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lgy1/c$b$f;", "()Lgy1/c$b$f;", "Lcy/c;", "b", "()Lcy/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ReadAuthorizationCert extends b implements InterfaceC1782c {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f78283e;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final cy.c lastReadingData;

            static {
                int i15 = iy.b0.f97726c;
                f78283e = i15 | cy.c.f38445c | i15;
            }

            public ReadAuthorizationCert(StateData stateData, cy.c cVar) {
                super(stateData, null);
                this.data = stateData;
                this.lastReadingData = cVar;
            }

            public static /* synthetic */ ReadAuthorizationCert e(ReadAuthorizationCert readAuthorizationCert, StateData stateData, cy.c cVar, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    stateData = readAuthorizationCert.data;
                }
                if ((i15 & 2) != 0) {
                    cVar = readAuthorizationCert.lastReadingData;
                }
                return readAuthorizationCert.d(stateData, cVar);
            }

            @Override // gy1.c.InterfaceC1782c
            /* JADX INFO: renamed from: b, reason: from getter */
            public cy.c getLastReadingData() {
                return this.lastReadingData;
            }

            @Override // gy1.c.b
            /* JADX INFO: renamed from: c, reason: from getter */
            public StateData getData() {
                return this.data;
            }

            public final ReadAuthorizationCert d(StateData data, cy.c lastReadingData) {
                return new ReadAuthorizationCert(data, lastReadingData);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReadAuthorizationCert)) {
                    return false;
                }
                ReadAuthorizationCert readAuthorizationCert = (ReadAuthorizationCert) other;
                return fr.t.c(this.data, readAuthorizationCert.data) && fr.t.c(this.lastReadingData, readAuthorizationCert.lastReadingData);
            }

            public int hashCode() {
                int iHashCode = this.data.hashCode() * 31;
                cy.c cVar = this.lastReadingData;
                return iHashCode + (cVar == null ? 0 : cVar.hashCode());
            }

            public String toString() {
                return "ReadAuthorizationCert(data=" + this.data + ", lastReadingData=" + this.lastReadingData + ')';
            }

            public /* synthetic */ ReadAuthorizationCert(StateData stateData, cy.c cVar, int i15, fr.k kVar) {
                this(stateData, (i15 & 2) != 0 ? null : cVar);
            }
        }

        /* JADX INFO: renamed from: gy1.c$b$e, reason: from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lgy1/c$b$e;", "Lgy1/c$b;", "Lgy1/c$c;", "Lgy1/c$b$f;", "data", "Lcy/c;", "lastReadingData", "<init>", "(Lgy1/c$b$f;Lcy/c;)V", "d", "(Lgy1/c$b$f;Lcy/c;)Lgy1/c$b$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lgy1/c$b$f;", "()Lgy1/c$b$f;", "Lcy/c;", "b", "()Lcy/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ReadPresenceCert extends b implements InterfaceC1782c {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f78286e;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final cy.c lastReadingData;

            static {
                int i15 = iy.b0.f97726c;
                f78286e = i15 | cy.c.f38445c | i15;
            }

            public ReadPresenceCert(StateData stateData, cy.c cVar) {
                super(stateData, null);
                this.data = stateData;
                this.lastReadingData = cVar;
            }

            public static /* synthetic */ ReadPresenceCert e(ReadPresenceCert readPresenceCert, StateData stateData, cy.c cVar, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    stateData = readPresenceCert.data;
                }
                if ((i15 & 2) != 0) {
                    cVar = readPresenceCert.lastReadingData;
                }
                return readPresenceCert.d(stateData, cVar);
            }

            @Override // gy1.c.InterfaceC1782c
            /* JADX INFO: renamed from: b, reason: from getter */
            public cy.c getLastReadingData() {
                return this.lastReadingData;
            }

            @Override // gy1.c.b
            /* JADX INFO: renamed from: c, reason: from getter */
            public StateData getData() {
                return this.data;
            }

            public final ReadPresenceCert d(StateData data, cy.c lastReadingData) {
                return new ReadPresenceCert(data, lastReadingData);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReadPresenceCert)) {
                    return false;
                }
                ReadPresenceCert readPresenceCert = (ReadPresenceCert) other;
                return fr.t.c(this.data, readPresenceCert.data) && fr.t.c(this.lastReadingData, readPresenceCert.lastReadingData);
            }

            public int hashCode() {
                int iHashCode = this.data.hashCode() * 31;
                cy.c cVar = this.lastReadingData;
                return iHashCode + (cVar == null ? 0 : cVar.hashCode());
            }

            public String toString() {
                return "ReadPresenceCert(data=" + this.data + ", lastReadingData=" + this.lastReadingData + ')';
            }

            public /* synthetic */ ReadPresenceCert(StateData stateData, cy.c cVar, int i15, fr.k kVar) {
                this(stateData, (i15 & 2) != 0 ? null : cVar);
            }
        }

        /* JADX INFO: renamed from: gy1.c$b$f, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJB\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\"¨\u0006#"}, d2 = {"Lgy1/c$b$f;", "", "Liy/b0;", "can", "Lgy1/a;", "presenceCert", "authenticationCert", "authorizationCert", "", "areAnimationsEnabled", "<init>", "(Liy/b0;Lgy1/a;Lgy1/a;Lgy1/a;Z)V", "a", "(Liy/b0;Lgy1/a;Lgy1/a;Lgy1/a;Z)Lgy1/c$b$f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "f", "()Liy/b0;", "b", "Lgy1/a;", "g", "()Lgy1/a;", "c", "d", "e", "Z", "()Z", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class StateData {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f78289f = iy.b0.f97726c;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 can;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final a presenceCert;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final a authenticationCert;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final a authorizationCert;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean areAnimationsEnabled;

            public StateData(iy.b0 b0Var, a aVar, a aVar2, a aVar3, boolean z15) {
                this.can = b0Var;
                this.presenceCert = aVar;
                this.authenticationCert = aVar2;
                this.authorizationCert = aVar3;
                this.areAnimationsEnabled = z15;
            }

            public static /* synthetic */ StateData b(StateData stateData, iy.b0 b0Var, a aVar, a aVar2, a aVar3, boolean z15, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    b0Var = stateData.can;
                }
                if ((i15 & 2) != 0) {
                    aVar = stateData.presenceCert;
                }
                if ((i15 & 4) != 0) {
                    aVar2 = stateData.authenticationCert;
                }
                if ((i15 & 8) != 0) {
                    aVar3 = stateData.authorizationCert;
                }
                if ((i15 & 16) != 0) {
                    z15 = stateData.areAnimationsEnabled;
                }
                boolean z16 = z15;
                a aVar4 = aVar2;
                return stateData.a(b0Var, aVar, aVar4, aVar3, z16);
            }

            public final StateData a(iy.b0 can, a presenceCert, a authenticationCert, a authorizationCert, boolean areAnimationsEnabled) {
                return new StateData(can, presenceCert, authenticationCert, authorizationCert, areAnimationsEnabled);
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getAreAnimationsEnabled() {
                return this.areAnimationsEnabled;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final a getAuthenticationCert() {
                return this.authenticationCert;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final a getAuthorizationCert() {
                return this.authorizationCert;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StateData)) {
                    return false;
                }
                StateData stateData = (StateData) other;
                return fr.t.c(this.can, stateData.can) && fr.t.c(this.presenceCert, stateData.presenceCert) && fr.t.c(this.authenticationCert, stateData.authenticationCert) && fr.t.c(this.authorizationCert, stateData.authorizationCert) && this.areAnimationsEnabled == stateData.areAnimationsEnabled;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final iy.b0 getCan() {
                return this.can;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final a getPresenceCert() {
                return this.presenceCert;
            }

            public int hashCode() {
                return (((((((this.can.hashCode() * 31) + this.presenceCert.hashCode()) * 31) + this.authenticationCert.hashCode()) * 31) + this.authorizationCert.hashCode()) * 31) + Boolean.hashCode(this.areAnimationsEnabled);
            }

            public String toString() {
                return "StateData(can=" + this.can + ", presenceCert=" + this.presenceCert + ", authenticationCert=" + this.authenticationCert + ", authorizationCert=" + this.authorizationCert + ", areAnimationsEnabled=" + this.areAnimationsEnabled + ')';
            }

            public /* synthetic */ StateData(iy.b0 b0Var, a aVar, a aVar2, a aVar3, boolean z15, int i15, fr.k kVar) {
                this((i15 & 1) != 0 ? iy.b0.INSTANCE.a() : b0Var, (i15 & 2) != 0 ? a.c.f78260a : aVar, (i15 & 4) != 0 ? a.c.f78260a : aVar2, (i15 & 8) != 0 ? a.c.f78260a : aVar3, z15);
            }
        }
    }

    /* JADX INFO: renamed from: gy1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lgy1/c$c;", "", "Lcy/c;", "b", "()Lcy/c;", "lastReadingData", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC1782c {
        /* JADX INFO: renamed from: b */
        cy.c getLastReadingData();
    }

    /* JADX INFO: renamed from: a */
    boolean getAreAnimationsEnabled();
}
