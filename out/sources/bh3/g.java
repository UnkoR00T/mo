package bh3;

import p071kotlin.Metadata;
import sv0.ProcessId;
import sv0.StatementReady;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lbh3/g;", "", "a", "b", "Lbh3/g$a;", "Lbh3/g$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lbh3/g$a;", "Lbh3/g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19651a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -855423098;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: bh3.g$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lbh3/g$b;", "Lbh3/g;", "Lsv0/y;", "processId", "Lsv0/g0;", "statementReady", "Lbh3/g$b$a;", "successScreenType", "<init>", "(Lsv0/y;Lsv0/g0;Lbh3/g$b$a;)V", "a", "(Lsv0/y;Lsv0/g0;Lbh3/g$b$a;)Lbh3/g$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsv0/y;", "c", "()Lsv0/y;", "b", "Lsv0/g0;", "d", "()Lsv0/g0;", "Lbh3/g$b$a;", "e", "()Lbh3/g$b$a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProcessId processId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final StatementReady statementReady;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final a successScreenType;

        /* JADX INFO: renamed from: bh3.g$b$a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lbh3/g$b$a;", "", "b", "a", "Lbh3/g$b$a$a;", "Lbh3/g$b$a$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface a {

            /* JADX INFO: renamed from: bh3.g$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lbh3/g$b$a$a;", "Lbh3/g$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C0506a implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0506a f19655a = new C0506a();

                private C0506a() {
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof C0506a);
                }

                public int hashCode() {
                    return -1479365431;
                }

                public String toString() {
                    return "Perpetrator";
                }
            }

            /* JADX INFO: renamed from: bh3.g$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lbh3/g$b$a$b;", "Lbh3/g$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C0507b implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0507b f19656a = new C0507b();

                private C0507b() {
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof C0507b);
                }

                public int hashCode() {
                    return -612653272;
                }

                public String toString() {
                    return "ReportDamageVictim";
                }
            }
        }

        public Initialized(ProcessId processId, StatementReady statementReady, a aVar) {
            this.processId = processId;
            this.statementReady = statementReady;
            this.successScreenType = aVar;
        }

        public static /* synthetic */ Initialized b(Initialized initialized, ProcessId processId, StatementReady statementReady, a aVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                processId = initialized.processId;
            }
            if ((i15 & 2) != 0) {
                statementReady = initialized.statementReady;
            }
            if ((i15 & 4) != 0) {
                aVar = initialized.successScreenType;
            }
            return initialized.a(processId, statementReady, aVar);
        }

        public final Initialized a(ProcessId processId, StatementReady statementReady, a successScreenType) {
            return new Initialized(processId, statementReady, successScreenType);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ProcessId getProcessId() {
            return this.processId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final StatementReady getStatementReady() {
            return this.statementReady;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final a getSuccessScreenType() {
            return this.successScreenType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.processId, initialized.processId) && fr.t.c(this.statementReady, initialized.statementReady) && fr.t.c(this.successScreenType, initialized.successScreenType);
        }

        public int hashCode() {
            return (((this.processId.hashCode() * 31) + this.statementReady.hashCode()) * 31) + this.successScreenType.hashCode();
        }

        public String toString() {
            return "Initialized(processId=" + this.processId + ", statementReady=" + this.statementReady + ", successScreenType=" + this.successScreenType + ')';
        }
    }
}
