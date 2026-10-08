package wd0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\t\n\u000b\f\r\u0006\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lwd0/g;", "", "Lwd0/g$i;", "data", "<init>", "(Lwd0/g$i;)V", "a", "Lwd0/g$i;", "()Lwd0/g$i;", "d", "b", "g", "c", "e", "h", "f", "i", "Lwd0/g$a;", "Lwd0/g$b;", "Lwd0/g$c;", "Lwd0/g$d;", "Lwd0/g$e;", "Lwd0/g$f;", "Lwd0/g$g;", "Lwd0/g$h;", "setpin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f212251b = iy.b0.f97726c | hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final StateData data;

    /* JADX INFO: renamed from: wd0.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lwd0/g$a;", "Lwd0/g;", "Lwd0/g$i;", "data", "<init>", "(Lwd0/g$i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lwd0/g$i;", "a", "()Lwd0/g$i;", "setpin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CheckConfirmedNewPin extends g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f212253d;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final StateData data;

        static {
            int i15 = iy.b0.f97726c;
            int i16 = hz.b.f86845b;
            f212253d = i15 | i15 | i16 | i15 | i15 | i16;
        }

        public CheckConfirmedNewPin(StateData stateData) {
            super(stateData, null);
            this.data = stateData;
        }

        @Override // wd0.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public StateData getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckConfirmedNewPin) && fr.t.c(this.data, ((CheckConfirmedNewPin) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "CheckConfirmedNewPin(data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: wd0.g$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lwd0/g$b;", "Lwd0/g;", "Lwd0/g$i;", "data", "<init>", "(Lwd0/g$i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lwd0/g$i;", "a", "()Lwd0/g$i;", "setpin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CheckCurrentPin extends g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f212255d;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final StateData data;

        static {
            int i15 = iy.b0.f97726c;
            int i16 = hz.b.f86845b;
            f212255d = i15 | i15 | i16 | i15 | i15 | i16;
        }

        public CheckCurrentPin(StateData stateData) {
            super(stateData, null);
            this.data = stateData;
        }

        @Override // wd0.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public StateData getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckCurrentPin) && fr.t.c(this.data, ((CheckCurrentPin) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "CheckCurrentPin(data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: wd0.g$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lwd0/g$c;", "Lwd0/g;", "Lwd0/g$i;", "data", "<init>", "(Lwd0/g$i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lwd0/g$i;", "a", "()Lwd0/g$i;", "setpin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CheckNewPin extends g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f212257d;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final StateData data;

        static {
            int i15 = iy.b0.f97726c;
            int i16 = hz.b.f86845b;
            f212257d = i15 | i15 | i16 | i15 | i15 | i16;
        }

        public CheckNewPin(StateData stateData) {
            super(stateData, null);
            this.data = stateData;
        }

        @Override // wd0.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public StateData getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckNewPin) && fr.t.c(this.data, ((CheckNewPin) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "CheckNewPin(data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: wd0.g$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lwd0/g$d;", "Lwd0/g;", "Lwd0/g$i;", "data", "<init>", "(Lwd0/g$i;)V", "b", "(Lwd0/g$i;)Lwd0/g$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lwd0/g$i;", "a", "()Lwd0/g$i;", "setpin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmCurrentPin extends g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f212259d;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final StateData data;

        static {
            int i15 = iy.b0.f97726c;
            int i16 = hz.b.f86845b;
            f212259d = i15 | i15 | i16 | i15 | i15 | i16;
        }

        public ConfirmCurrentPin(StateData stateData) {
            super(stateData, null);
            this.data = stateData;
        }

        @Override // wd0.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public StateData getData() {
            return this.data;
        }

        public final ConfirmCurrentPin b(StateData data) {
            return new ConfirmCurrentPin(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConfirmCurrentPin) && fr.t.c(this.data, ((ConfirmCurrentPin) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "ConfirmCurrentPin(data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: wd0.g$e, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lwd0/g$e;", "Lwd0/g;", "Lwd0/g$i;", "data", "<init>", "(Lwd0/g$i;)V", "b", "(Lwd0/g$i;)Lwd0/g$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lwd0/g$i;", "a", "()Lwd0/g$i;", "setpin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmNewPin extends g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f212261d;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final StateData data;

        static {
            int i15 = iy.b0.f97726c;
            int i16 = hz.b.f86845b;
            f212261d = i15 | i15 | i16 | i15 | i15 | i16;
        }

        public ConfirmNewPin(StateData stateData) {
            super(stateData, null);
            this.data = stateData;
        }

        @Override // wd0.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public StateData getData() {
            return this.data;
        }

        public final ConfirmNewPin b(StateData data) {
            return new ConfirmNewPin(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConfirmNewPin) && fr.t.c(this.data, ((ConfirmNewPin) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "ConfirmNewPin(data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: wd0.g$f, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lwd0/g$f;", "Lwd0/g;", "Lwd0/g$i;", "data", "Lhb4/c;", "errorVMS", "<init>", "(Lwd0/g$i;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lwd0/g$i;", "a", "()Lwd0/g$i;", "d", "Lhb4/c;", "b", "()Lhb4/c;", "setpin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final StateData data;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        public Error(StateData stateData, hb4.c cVar) {
            super(stateData, null);
            this.data = stateData;
            this.errorVMS = cVar;
        }

        @Override // wd0.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public StateData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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

    /* JADX INFO: renamed from: wd0.g$g, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lwd0/g$g;", "Lwd0/g;", "Lwd0/g$i;", "data", "<init>", "(Lwd0/g$i;)V", "b", "(Lwd0/g$i;)Lwd0/g$g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lwd0/g$i;", "a", "()Lwd0/g$i;", "setpin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewPin extends g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f212265d;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final StateData data;

        static {
            int i15 = iy.b0.f97726c;
            int i16 = hz.b.f86845b;
            f212265d = i15 | i15 | i16 | i15 | i15 | i16;
        }

        public NewPin(StateData stateData) {
            super(stateData, null);
            this.data = stateData;
        }

        @Override // wd0.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public StateData getData() {
            return this.data;
        }

        public final NewPin b(StateData data) {
            return new NewPin(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NewPin) && fr.t.c(this.data, ((NewPin) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "NewPin(data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: wd0.g$h, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lwd0/g$h;", "Lwd0/g;", "Lwd0/g$i;", "data", "<init>", "(Lwd0/g$i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lwd0/g$i;", "a", "()Lwd0/g$i;", "setpin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetNewPin extends g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f212267d;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final StateData data;

        static {
            int i15 = iy.b0.f97726c;
            int i16 = hz.b.f86845b;
            f212267d = i15 | i15 | i16 | i15 | i15 | i16;
        }

        public SetNewPin(StateData stateData) {
            super(stateData, null);
            this.data = stateData;
        }

        @Override // wd0.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public StateData getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetNewPin) && fr.t.c(this.data, ((SetNewPin) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "SetNewPin(data=" + this.data + ')';
        }
    }

    public /* synthetic */ g(StateData stateData, fr.k kVar) {
        this(stateData);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public StateData getData() {
        return this.data;
    }

    private g(StateData stateData) {
        this.data = stateData;
    }

    /* JADX INFO: renamed from: wd0.g$i, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, d2 = {"Lwd0/g$i;", "", "Lhz/b;", "validationState", "Liy/b0;", "currentPin", "newPin", "repeatedNewPin", "<init>", "(Lhz/b;Liy/b0;Liy/b0;Liy/b0;)V", "a", "(Lhz/b;Liy/b0;Liy/b0;Liy/b0;)Lwd0/g$i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "f", "()Lhz/b;", "b", "Liy/b0;", "c", "()Liy/b0;", "d", "e", "setpin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StateData {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f212269e = iy.b0.f97726c | hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 currentPin;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 newPin;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 repeatedNewPin;

        public StateData(hz.b bVar, iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3) {
            this.validationState = bVar;
            this.currentPin = b0Var;
            this.newPin = b0Var2;
            this.repeatedNewPin = b0Var3;
        }

        public static /* synthetic */ StateData b(StateData stateData, hz.b bVar, iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                bVar = stateData.validationState;
            }
            if ((i15 & 2) != 0) {
                b0Var = stateData.currentPin;
            }
            if ((i15 & 4) != 0) {
                b0Var2 = stateData.newPin;
            }
            if ((i15 & 8) != 0) {
                b0Var3 = stateData.repeatedNewPin;
            }
            return stateData.a(bVar, b0Var, b0Var2, b0Var3);
        }

        public final StateData a(hz.b validationState, iy.b0 currentPin, iy.b0 newPin, iy.b0 repeatedNewPin) {
            return new StateData(validationState, currentPin, newPin, repeatedNewPin);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final iy.b0 getCurrentPin() {
            return this.currentPin;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final iy.b0 getNewPin() {
            return this.newPin;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final iy.b0 getRepeatedNewPin() {
            return this.repeatedNewPin;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateData)) {
                return false;
            }
            StateData stateData = (StateData) other;
            return fr.t.c(this.validationState, stateData.validationState) && fr.t.c(this.currentPin, stateData.currentPin) && fr.t.c(this.newPin, stateData.newPin) && fr.t.c(this.repeatedNewPin, stateData.repeatedNewPin);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final hz.b getValidationState() {
            return this.validationState;
        }

        public int hashCode() {
            return (((((this.validationState.hashCode() * 31) + this.currentPin.hashCode()) * 31) + this.newPin.hashCode()) * 31) + this.repeatedNewPin.hashCode();
        }

        public String toString() {
            return "StateData(validationState=" + this.validationState + ", currentPin=" + this.currentPin + ", newPin=" + this.newPin + ", repeatedNewPin=" + this.repeatedNewPin + ')';
        }

        public /* synthetic */ StateData(hz.b bVar, iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 2) != 0 ? iy.b0.INSTANCE.a() : b0Var, (i15 & 4) != 0 ? iy.b0.INSTANCE.a() : b0Var2, (i15 & 8) != 0 ? iy.b0.INSTANCE.a() : b0Var3);
        }
    }
}
