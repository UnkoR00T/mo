package nj3;

import java.time.LocalDate;
import mj3.AbroadListPayload;
import p071kotlin.Metadata;
import tj3.VehicleHistoryPayload;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lnj3/a;", "", "g", "a", "b", "f", "c", "h", "d", "i", "e", "k", "j", "Lnj3/a$a;", "Lnj3/a$b;", "Lnj3/a$c;", "Lnj3/a$d;", "Lnj3/a$e;", "Lnj3/a$f;", "Lnj3/a$h;", "Lnj3/a$i;", "Lnj3/a$j;", "Lnj3/a$k;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: nj3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnj3/a$a;", "Lnj3/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C3374a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3374a f136851a = new C3374a();

        private C3374a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C3374a);
        }

        public int hashCode() {
            return 911648955;
        }

        public String toString() {
            return "Back";
        }
    }

    /* JADX INFO: renamed from: nj3.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006!"}, d2 = {"Lnj3/a$b;", "Lnj3/a;", "Luv0/d;", "plateNumber", "Luv0/v;", "vin", "", "skipForm", "Ljava/time/LocalDate;", "firstRegistrationDate", "<init>", "(Ljava/lang/String;Liy/b0;ZLjava/time/LocalDate;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Liy/b0;", "d", "()Liy/b0;", "c", "Z", "()Z", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Check implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String plateNumber;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 vin;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean skipForm;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate firstRegistrationDate;

        public /* synthetic */ Check(String str, iy.b0 b0Var, boolean z15, LocalDate localDate, fr.k kVar) {
            this(str, b0Var, z15, localDate);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getFirstRegistrationDate() {
            return this.firstRegistrationDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPlateNumber() {
            return this.plateNumber;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getSkipForm() {
            return this.skipForm;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final iy.b0 getVin() {
            return this.vin;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Check)) {
                return false;
            }
            Check check = (Check) other;
            return uv0.d.e(this.plateNumber, check.plateNumber) && uv0.v.f(this.vin, check.vin) && this.skipForm == check.skipForm && fr.t.c(this.firstRegistrationDate, check.firstRegistrationDate);
        }

        public int hashCode() {
            int iF = ((((uv0.d.f(this.plateNumber) * 31) + uv0.v.g(this.vin)) * 31) + Boolean.hashCode(this.skipForm)) * 31;
            LocalDate localDate = this.firstRegistrationDate;
            return iF + (localDate == null ? 0 : localDate.hashCode());
        }

        public String toString() {
            return "Check(plateNumber=" + ((Object) uv0.d.h(this.plateNumber)) + ", vin=" + ((Object) uv0.v.i(this.vin)) + ", skipForm=" + this.skipForm + ", firstRegistrationDate=" + this.firstRegistrationDate + ')';
        }

        private Check(String str, iy.b0 b0Var, boolean z15, LocalDate localDate) {
            this.plateNumber = str;
            this.vin = b0Var;
            this.skipForm = z15;
            this.firstRegistrationDate = localDate;
        }

        public /* synthetic */ Check(String str, iy.b0 b0Var, boolean z15, LocalDate localDate, int i15, fr.k kVar) {
            this(str, b0Var, (i15 & 4) != 0 ? false : z15, localDate, null);
        }
    }

    /* JADX INFO: renamed from: nj3.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lnj3/a$c;", "Lnj3/a;", "Luv0/d;", "plateNumber", "", "forceWasVerified", "<init>", "(Ljava/lang/String;ZLfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CheckPlate implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String plateNumber;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean forceWasVerified;

        public /* synthetic */ CheckPlate(String str, boolean z15, fr.k kVar) {
            this(str, z15);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getForceWasVerified() {
            return this.forceWasVerified;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPlateNumber() {
            return this.plateNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckPlate)) {
                return false;
            }
            CheckPlate checkPlate = (CheckPlate) other;
            return uv0.d.e(this.plateNumber, checkPlate.plateNumber) && this.forceWasVerified == checkPlate.forceWasVerified;
        }

        public int hashCode() {
            return (uv0.d.f(this.plateNumber) * 31) + Boolean.hashCode(this.forceWasVerified);
        }

        public String toString() {
            return "CheckPlate(plateNumber=" + ((Object) uv0.d.h(this.plateNumber)) + ", forceWasVerified=" + this.forceWasVerified + ')';
        }

        private CheckPlate(String str, boolean z15) {
            this.plateNumber = str;
            this.forceWasVerified = z15;
        }

        public /* synthetic */ CheckPlate(String str, boolean z15, int i15, fr.k kVar) {
            this(str, (i15 & 2) != 0 ? false : z15, null);
        }
    }

    /* JADX INFO: renamed from: nj3.a$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lnj3/a$d;", "Lnj3/a;", "Luv0/v;", "vinNumber", "", "forceWasVerified", "<init>", "(Liy/b0;ZLfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "Z", "()Z", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CheckVin implements a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f136858c = iy.b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 vinNumber;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean forceWasVerified;

        public /* synthetic */ CheckVin(iy.b0 b0Var, boolean z15, fr.k kVar) {
            this(b0Var, z15);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getForceWasVerified() {
            return this.forceWasVerified;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final iy.b0 getVinNumber() {
            return this.vinNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckVin)) {
                return false;
            }
            CheckVin checkVin = (CheckVin) other;
            return uv0.v.f(this.vinNumber, checkVin.vinNumber) && this.forceWasVerified == checkVin.forceWasVerified;
        }

        public int hashCode() {
            return (uv0.v.g(this.vinNumber) * 31) + Boolean.hashCode(this.forceWasVerified);
        }

        public String toString() {
            return "CheckVin(vinNumber=" + ((Object) uv0.v.i(this.vinNumber)) + ", forceWasVerified=" + this.forceWasVerified + ')';
        }

        private CheckVin(iy.b0 b0Var, boolean z15) {
            this.vinNumber = b0Var;
            this.forceWasVerified = z15;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnj3/a$e;", "Lnj3/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f136861a = new e();

        private e() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        public int hashCode() {
            return 842300184;
        }

        public String toString() {
            return "ClearState";
        }
    }

    /* JADX INFO: renamed from: nj3.a$f, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006!"}, d2 = {"Lnj3/a$f;", "Lnj3/a;", "Luv0/d;", "plate", "Luv0/v;", "vin", "", "skipForm", "Ljava/time/LocalDate;", "firstRegistrationDate", "<init>", "(Ljava/lang/String;Liy/b0;ZLjava/time/LocalDate;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Liy/b0;", "d", "()Liy/b0;", "c", "Z", "()Z", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GetAbroad implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String plate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 vin;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean skipForm;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate firstRegistrationDate;

        public /* synthetic */ GetAbroad(String str, iy.b0 b0Var, boolean z15, LocalDate localDate, fr.k kVar) {
            this(str, b0Var, z15, localDate);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getFirstRegistrationDate() {
            return this.firstRegistrationDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPlate() {
            return this.plate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getSkipForm() {
            return this.skipForm;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final iy.b0 getVin() {
            return this.vin;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetAbroad)) {
                return false;
            }
            GetAbroad getAbroad = (GetAbroad) other;
            return uv0.d.e(this.plate, getAbroad.plate) && uv0.v.f(this.vin, getAbroad.vin) && this.skipForm == getAbroad.skipForm && fr.t.c(this.firstRegistrationDate, getAbroad.firstRegistrationDate);
        }

        public int hashCode() {
            int iF = ((((uv0.d.f(this.plate) * 31) + uv0.v.g(this.vin)) * 31) + Boolean.hashCode(this.skipForm)) * 31;
            LocalDate localDate = this.firstRegistrationDate;
            return iF + (localDate == null ? 0 : localDate.hashCode());
        }

        public String toString() {
            return "GetAbroad(plate=" + ((Object) uv0.d.h(this.plate)) + ", vin=" + ((Object) uv0.v.i(this.vin)) + ", skipForm=" + this.skipForm + ", firstRegistrationDate=" + this.firstRegistrationDate + ')';
        }

        private GetAbroad(String str, iy.b0 b0Var, boolean z15, LocalDate localDate) {
            this.plate = str;
            this.vin = b0Var;
            this.skipForm = z15;
            this.firstRegistrationDate = localDate;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lnj3/a$g;", "", "b", "c", "a", "d", "e", "f", "Lnj3/a$g$a;", "Lnj3/a$g$b;", "Lnj3/a$g$c;", "Lnj3/a$g$d;", "Lnj3/a$g$e;", "Lnj3/a$g$f;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface g {

        /* JADX INFO: renamed from: nj3.a$g$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lnj3/a$g$a;", "Lnj3/a$g;", "Lmj3/a;", "payloadData", "<init>", "(Lmj3/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmj3/a;", "()Lmj3/a;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Abroad implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbroadListPayload payloadData;

            public Abroad(AbroadListPayload abroadListPayload) {
                this.payloadData = abroadListPayload;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AbroadListPayload getPayloadData() {
                return this.payloadData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Abroad) && fr.t.c(this.payloadData, ((Abroad) other).payloadData);
            }

            public int hashCode() {
                return this.payloadData.hashCode();
            }

            public String toString() {
                return "Abroad(payloadData=" + this.payloadData + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnj3/a$g$b;", "Lnj3/a$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f136867a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1195147783;
            }

            public String toString() {
                return "Close";
            }
        }

        /* JADX INFO: renamed from: nj3.a$g$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lnj3/a$g$c;", "Lnj3/a$g;", "Ltj3/d;", "payloadData", "<init>", "(Ltj3/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltj3/d;", "()Ltj3/d;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Details implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final VehicleHistoryPayload payloadData;

            public Details(VehicleHistoryPayload vehicleHistoryPayload) {
                this.payloadData = vehicleHistoryPayload;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final VehicleHistoryPayload getPayloadData() {
                return this.payloadData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Details) && fr.t.c(this.payloadData, ((Details) other).payloadData);
            }

            public int hashCode() {
                return this.payloadData.hashCode();
            }

            public String toString() {
                return "Details(payloadData=" + this.payloadData + ')';
            }
        }

        /* JADX INFO: renamed from: nj3.a$g$d, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lnj3/a$g$d;", "Lnj3/a$g;", "Lnj3/b;", "emptyData", "<init>", "(Lnj3/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnj3/b;", "()Lnj3/b;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Empty implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final nj3.b emptyData;

            public Empty(nj3.b bVar) {
                this.emptyData = bVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final nj3.b getEmptyData() {
                return this.emptyData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Empty) && this.emptyData == ((Empty) other).emptyData;
            }

            public int hashCode() {
                return this.emptyData.hashCode();
            }

            public String toString() {
                return "Empty(emptyData=" + this.emptyData + ')';
            }
        }

        /* JADX INFO: renamed from: nj3.a$g$e, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lnj3/a$g$e;", "Lnj3/a$g;", "Ljb4/b;", "error", "<init>", "(Ljb4/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljb4/b;", "()Ljb4/b;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final jb4.b error;

            public Error(jb4.b bVar) {
                this.error = bVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final jb4.b getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.error, ((Error) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Error(error=" + this.error + ')';
            }
        }

        /* JADX INFO: renamed from: nj3.a$g$f, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lnj3/a$g$f;", "Lnj3/a$g;", "Ljava/time/LocalDate;", "selected", "maxDate", "Lkotlin/Function1;", "Loq/i0;", "onDateChange", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "c", "()Ljava/time/LocalDate;", "b", "Ler/l;", "()Ler/l;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ShowDatePicker implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final LocalDate selected;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final LocalDate maxDate;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<LocalDate, oq.i0> onDateChange;

            /* JADX WARN: Multi-variable type inference failed */
            public ShowDatePicker(LocalDate localDate, LocalDate localDate2, er.l<? super LocalDate, oq.i0> lVar) {
                this.selected = localDate;
                this.maxDate = localDate2;
                this.onDateChange = lVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final LocalDate getMaxDate() {
                return this.maxDate;
            }

            public final er.l<LocalDate, oq.i0> b() {
                return this.onDateChange;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final LocalDate getSelected() {
                return this.selected;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowDatePicker)) {
                    return false;
                }
                ShowDatePicker showDatePicker = (ShowDatePicker) other;
                return fr.t.c(this.selected, showDatePicker.selected) && fr.t.c(this.maxDate, showDatePicker.maxDate) && fr.t.c(this.onDateChange, showDatePicker.onDateChange);
            }

            public int hashCode() {
                return (((this.selected.hashCode() * 31) + this.maxDate.hashCode()) * 31) + this.onDateChange.hashCode();
            }

            public String toString() {
                return "ShowDatePicker(selected=" + this.selected + ", maxDate=" + this.maxDate + ", onDateChange=" + this.onDateChange + ')';
            }
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnj3/a$h;", "Lnj3/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f136874a = new h();

        private h() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof h);
        }

        public int hashCode() {
            return -268658420;
        }

        public String toString() {
            return "OffSkipPlateFocusChange";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnj3/a$i;", "Lnj3/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f136875a = new i();

        private i() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof i);
        }

        public int hashCode() {
            return 896456039;
        }

        public String toString() {
            return "OffSkipVinFocusChange";
        }
    }

    /* JADX INFO: renamed from: nj3.a$j, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lnj3/a$j;", "Lnj3/a;", "Ljava/time/LocalDate;", "newDate", "<init>", "(Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OnRegistrationDateChange implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate newDate;

        public OnRegistrationDateChange(LocalDate localDate) {
            this.newDate = localDate;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getNewDate() {
            return this.newDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnRegistrationDateChange) && fr.t.c(this.newDate, ((OnRegistrationDateChange) other).newDate);
        }

        public int hashCode() {
            return this.newDate.hashCode();
        }

        public String toString() {
            return "OnRegistrationDateChange(newDate=" + this.newDate + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnj3/a$k;", "Lnj3/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class k implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f136877a = new k();

        private k() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof k);
        }

        public int hashCode() {
            return 1589080270;
        }

        public String toString() {
            return "OnRegistrationDateClick";
        }
    }
}
