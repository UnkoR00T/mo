package wv0;

import fr.k;
import fr.t;
import iy.b0;
import iy.c0;
import p071kotlin.Metadata;
import uv0.v;

/* JADX INFO: renamed from: wv0.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lwv0/c;", "", "Lfz/b$f;", "date", "Lwv0/c$a;", "number", "<init>", "(Lfz/b$f;Lwv0/c$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfz/b$f;", "()Lfz/b$f;", "b", "Lwv0/c$a;", "()Lwv0/c$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RequestedInsuranceData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetDateTime date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a number;

    /* JADX INFO: renamed from: wv0.c$a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0006\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lwv0/c$a;", "", "Liy/b0;", "value", "<init>", "(Liy/b0;)V", "a", "Liy/b0;", "()Liy/b0;", "c", "b", "Lwv0/c$a$a;", "Lwv0/c$a$b;", "Lwv0/c$a$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b0 value;

        /* JADX INFO: renamed from: wv0.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lwv0/c$a$a;", "Lwv0/c$a;", "Liy/b0;", "number", "<init>", "(Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Liy/b0;", "getNumber", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Insurance extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final b0 number;

            public Insurance(b0 b0Var) {
                super(b0Var, null);
                this.number = b0Var;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Insurance) && t.c(this.number, ((Insurance) other).number);
            }

            public int hashCode() {
                return this.number.hashCode();
            }

            public String toString() {
                return "Insurance(number=" + this.number + ")";
            }
        }

        /* JADX INFO: renamed from: wv0.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lwv0/c$a$b;", "Lwv0/c$a;", "Luv0/d;", "plate", "<init>", "(Ljava/lang/String;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getPlate-xAcEMz0", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Plate extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String plate;

            public /* synthetic */ Plate(String str, k kVar) {
                this(str);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Plate) && uv0.d.e(this.plate, ((Plate) other).plate);
            }

            public int hashCode() {
                return uv0.d.f(this.plate);
            }

            public String toString() {
                return "Plate(plate=" + uv0.d.h(this.plate) + ")";
            }

            private Plate(String str) {
                super(c0.g(str), null);
                this.plate = str;
            }
        }

        /* JADX INFO: renamed from: wv0.c$a$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lwv0/c$a$c;", "Lwv0/c$a;", "Luv0/v;", "vin", "<init>", "(Liy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Liy/b0;", "getVin-UPv4E9o", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Vehicle extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final b0 vin;

            public /* synthetic */ Vehicle(b0 b0Var, k kVar) {
                this(b0Var);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Vehicle) && v.f(this.vin, ((Vehicle) other).vin);
            }

            public int hashCode() {
                return v.g(this.vin);
            }

            public String toString() {
                return "Vehicle(vin=" + v.i(this.vin) + ")";
            }

            private Vehicle(b0 b0Var) {
                super(b0Var, null);
                this.vin = b0Var;
            }
        }

        public /* synthetic */ a(b0 b0Var, k kVar) {
            this(b0Var);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getValue() {
            return this.value;
        }

        private a(b0 b0Var) {
            this.value = b0Var;
        }
    }

    public RequestedInsuranceData(fz.b.OffsetDateTime offsetDateTime, a aVar) {
        this.date = offsetDateTime;
        this.number = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final fz.b.OffsetDateTime getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getNumber() {
        return this.number;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestedInsuranceData)) {
            return false;
        }
        RequestedInsuranceData requestedInsuranceData = (RequestedInsuranceData) other;
        return t.c(this.date, requestedInsuranceData.date) && t.c(this.number, requestedInsuranceData.number);
    }

    public int hashCode() {
        return (this.date.hashCode() * 31) + this.number.hashCode();
    }

    public String toString() {
        return "RequestedInsuranceData(date=" + this.date + ", number=" + this.number + ")";
    }
}
