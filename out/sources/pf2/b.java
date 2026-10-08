package pf2;

import java.util.List;
import p071kotlin.Metadata;
import zi0.InternetSpeed;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lpf2/b;", "", "b", "c", "d", "e", "a", "f", "Lpf2/b$a;", "Lpf2/b$b;", "Lpf2/b$c;", "Lpf2/b$d;", "Lpf2/b$e;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: pf2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpf2/b$a;", "Lpf2/b;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements b {

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

    /* JADX INFO: renamed from: pf2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpf2/b$b;", "Lpf2/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C3891b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3891b f157229a = new C3891b();

        private C3891b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C3891b);
        }

        public int hashCode() {
            return -1210905844;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: pf2.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lpf2/b$c;", "Lpf2/b;", "Lpf2/b$f;", "data", "<init>", "(Lpf2/b$f;)V", "a", "(Lpf2/b$f;)Lpf2/b$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lpf2/b$f;", "b", "()Lpf2/b$f;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final StateData data;

        public Initialized(StateData stateData) {
            this.data = stateData;
        }

        public final Initialized a(StateData data) {
            return new Initialized(data);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final StateData getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initialized) && fr.t.c(this.data, ((Initialized) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Initialized(data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: pf2.b$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpf2/b$d;", "Lpf2/b;", "Lpf2/b$f;", "data", "<init>", "(Lpf2/b$f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpf2/b$f;", "()Lpf2/b$f;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectingDownlinkSpeeds implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final StateData data;

        public SelectingDownlinkSpeeds(StateData stateData) {
            this.data = stateData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final StateData getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectingDownlinkSpeeds) && fr.t.c(this.data, ((SelectingDownlinkSpeeds) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "SelectingDownlinkSpeeds(data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: pf2.b$e, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpf2/b$e;", "Lpf2/b;", "Lpf2/b$f;", "data", "<init>", "(Lpf2/b$f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpf2/b$f;", "()Lpf2/b$f;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectingUplinkSpeeds implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final StateData data;

        public SelectingUplinkSpeeds(StateData stateData) {
            this.data = stateData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final StateData getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectingUplinkSpeeds) && fr.t.c(this.data, ((SelectingUplinkSpeeds) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "SelectingUplinkSpeeds(data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: pf2.b$f, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012J~\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b(\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010)\u001a\u0004\b$\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010#R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b0\u0010*R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b.\u0010-¨\u00061"}, d2 = {"Lpf2/b$f;", "", "Lrf2/b;", "reason", "", "isValidReason", "Lrf2/c;", "internetSpeed", "isValidInternetSpeed", "", "Lzi0/g;", "downlinkSpeeds", "", "selectedDownlinkSpeeds", "isValidDownlinkSpeeds", "uplinkSpeeds", "selectedUplinkSpeeds", "<init>", "(Lrf2/b;ZLrf2/c;ZLjava/util/List;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Integer;)V", "a", "(Lrf2/b;ZLrf2/c;ZLjava/util/List;Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Integer;)Lpf2/b$f;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lrf2/b;", "e", "()Lrf2/b;", "b", "Z", "k", "()Z", "c", "Lrf2/c;", "d", "()Lrf2/c;", "j", "Ljava/util/List;", "()Ljava/util/List;", "f", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "g", "i", "h", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StateData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final rf2.b reason;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isValidReason;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final rf2.c internetSpeed;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isValidInternetSpeed;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<InternetSpeed> downlinkSpeeds;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer selectedDownlinkSpeeds;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isValidDownlinkSpeeds;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<InternetSpeed> uplinkSpeeds;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer selectedUplinkSpeeds;

        public StateData(rf2.b bVar, boolean z15, rf2.c cVar, boolean z16, List<InternetSpeed> list, Integer num, boolean z17, List<InternetSpeed> list2, Integer num2) {
            this.reason = bVar;
            this.isValidReason = z15;
            this.internetSpeed = cVar;
            this.isValidInternetSpeed = z16;
            this.downlinkSpeeds = list;
            this.selectedDownlinkSpeeds = num;
            this.isValidDownlinkSpeeds = z17;
            this.uplinkSpeeds = list2;
            this.selectedUplinkSpeeds = num2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateData b(StateData stateData, rf2.b bVar, boolean z15, rf2.c cVar, boolean z16, List list, Integer num, boolean z17, List list2, Integer num2, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                bVar = stateData.reason;
            }
            if ((i15 & 2) != 0) {
                z15 = stateData.isValidReason;
            }
            if ((i15 & 4) != 0) {
                cVar = stateData.internetSpeed;
            }
            if ((i15 & 8) != 0) {
                z16 = stateData.isValidInternetSpeed;
            }
            if ((i15 & 16) != 0) {
                list = stateData.downlinkSpeeds;
            }
            if ((i15 & 32) != 0) {
                num = stateData.selectedDownlinkSpeeds;
            }
            if ((i15 & 64) != 0) {
                z17 = stateData.isValidDownlinkSpeeds;
            }
            if ((i15 & 128) != 0) {
                list2 = stateData.uplinkSpeeds;
            }
            if ((i15 & 256) != 0) {
                num2 = stateData.selectedUplinkSpeeds;
            }
            List list3 = list2;
            Integer num3 = num2;
            Integer num4 = num;
            boolean z18 = z17;
            List list4 = list;
            rf2.c cVar2 = cVar;
            return stateData.a(bVar, z15, cVar2, z16, list4, num4, z18, list3, num3);
        }

        public final StateData a(rf2.b reason, boolean isValidReason, rf2.c internetSpeed, boolean isValidInternetSpeed, List<InternetSpeed> downlinkSpeeds, Integer selectedDownlinkSpeeds, boolean isValidDownlinkSpeeds, List<InternetSpeed> uplinkSpeeds, Integer selectedUplinkSpeeds) {
            return new StateData(reason, isValidReason, internetSpeed, isValidInternetSpeed, downlinkSpeeds, selectedDownlinkSpeeds, isValidDownlinkSpeeds, uplinkSpeeds, selectedUplinkSpeeds);
        }

        public final List<InternetSpeed> c() {
            return this.downlinkSpeeds;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final rf2.c getInternetSpeed() {
            return this.internetSpeed;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final rf2.b getReason() {
            return this.reason;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateData)) {
                return false;
            }
            StateData stateData = (StateData) other;
            return this.reason == stateData.reason && this.isValidReason == stateData.isValidReason && this.internetSpeed == stateData.internetSpeed && this.isValidInternetSpeed == stateData.isValidInternetSpeed && fr.t.c(this.downlinkSpeeds, stateData.downlinkSpeeds) && fr.t.c(this.selectedDownlinkSpeeds, stateData.selectedDownlinkSpeeds) && this.isValidDownlinkSpeeds == stateData.isValidDownlinkSpeeds && fr.t.c(this.uplinkSpeeds, stateData.uplinkSpeeds) && fr.t.c(this.selectedUplinkSpeeds, stateData.selectedUplinkSpeeds);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Integer getSelectedDownlinkSpeeds() {
            return this.selectedDownlinkSpeeds;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Integer getSelectedUplinkSpeeds() {
            return this.selectedUplinkSpeeds;
        }

        public final List<InternetSpeed> h() {
            return this.uplinkSpeeds;
        }

        public int hashCode() {
            rf2.b bVar = this.reason;
            int iHashCode = (((bVar == null ? 0 : bVar.hashCode()) * 31) + Boolean.hashCode(this.isValidReason)) * 31;
            rf2.c cVar = this.internetSpeed;
            int iHashCode2 = (((((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + Boolean.hashCode(this.isValidInternetSpeed)) * 31) + this.downlinkSpeeds.hashCode()) * 31;
            Integer num = this.selectedDownlinkSpeeds;
            int iHashCode3 = (((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.isValidDownlinkSpeeds)) * 31) + this.uplinkSpeeds.hashCode()) * 31;
            Integer num2 = this.selectedUplinkSpeeds;
            return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getIsValidDownlinkSpeeds() {
            return this.isValidDownlinkSpeeds;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getIsValidInternetSpeed() {
            return this.isValidInternetSpeed;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getIsValidReason() {
            return this.isValidReason;
        }

        public String toString() {
            return "StateData(reason=" + this.reason + ", isValidReason=" + this.isValidReason + ", internetSpeed=" + this.internetSpeed + ", isValidInternetSpeed=" + this.isValidInternetSpeed + ", downlinkSpeeds=" + this.downlinkSpeeds + ", selectedDownlinkSpeeds=" + this.selectedDownlinkSpeeds + ", isValidDownlinkSpeeds=" + this.isValidDownlinkSpeeds + ", uplinkSpeeds=" + this.uplinkSpeeds + ", selectedUplinkSpeeds=" + this.selectedUplinkSpeeds + ')';
        }

        public /* synthetic */ StateData(rf2.b bVar, boolean z15, rf2.c cVar, boolean z16, List list, Integer num, boolean z17, List list2, Integer num2, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : bVar, (i15 & 2) != 0 ? true : z15, (i15 & 4) != 0 ? null : cVar, (i15 & 8) != 0 ? true : z16, list, (i15 & 32) != 0 ? null : num, (i15 & 64) != 0 ? true : z17, list2, (i15 & 256) != 0 ? null : num2);
        }
    }
}
