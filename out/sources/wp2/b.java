package wp2;

import al0.s0;
import fr.k;
import fr.t;
import iy.b0;
import p071kotlin.Metadata;
import xw.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lwp2/b;", "", "Lwp2/b$c;", "formData", "Loq/i0;", "h7", "(Lwp2/b$c;)V", "Lwp2/b$b;", "e0", "()Lwp2/b$b;", "Leq2/a;", "data", "w2", "(Leq2/a;)V", "a", "b", "c", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: wp2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lwp2/b$a;", "", "Lwp2/b$b;", "enterChildSetupData", "<init>", "(Lwp2/b$b;)V", "a", "(Lwp2/b$b;)Lwp2/b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwp2/b$b;", "b", "()Lwp2/b$b;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EnterChildContractData {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f214297b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnterChildSetupData enterChildSetupData;

        static {
            int i15 = b0.f97726c;
            f214297b = i15 | fz.b.LocalDate.f68860b | i15 | i15 | i15 | i15 | i15;
        }

        public EnterChildContractData(EnterChildSetupData enterChildSetupData) {
            this.enterChildSetupData = enterChildSetupData;
        }

        public final EnterChildContractData a(EnterChildSetupData enterChildSetupData) {
            return new EnterChildContractData(enterChildSetupData);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnterChildSetupData getEnterChildSetupData() {
            return this.enterChildSetupData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EnterChildContractData) && t.c(this.enterChildSetupData, ((EnterChildContractData) other).enterChildSetupData);
        }

        public int hashCode() {
            EnterChildSetupData enterChildSetupData = this.enterChildSetupData;
            if (enterChildSetupData == null) {
                return 0;
            }
            return enterChildSetupData.hashCode();
        }

        public String toString() {
            return "EnterChildContractData(enterChildSetupData=" + this.enterChildSetupData + ')';
        }
    }

    /* JADX INFO: renamed from: wp2.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lwp2/b$b;", "", "Lwp2/b$c;", "enterChildSetupFormData", "Lkq2/b;", "whoAgrees", "Lal0/s0;", "passportType", "<init>", "(Lwp2/b$c;Lkq2/b;Lal0/s0;)V", "a", "(Lwp2/b$c;Lkq2/b;Lal0/s0;)Lwp2/b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwp2/b$c;", "c", "()Lwp2/b$c;", "b", "Lkq2/b;", "e", "()Lkq2/b;", "Lal0/s0;", "d", "()Lal0/s0;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EnterChildSetupData {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f214299d;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c enterChildSetupFormData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final kq2.b whoAgrees;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final s0 passportType;

        static {
            int i15 = b0.f97726c;
            f214299d = i15 | fz.b.LocalDate.f68860b | i15 | i15 | i15 | i15 | i15;
        }

        public EnterChildSetupData(c cVar, kq2.b bVar, s0 s0Var) {
            this.enterChildSetupFormData = cVar;
            this.whoAgrees = bVar;
            this.passportType = s0Var;
        }

        public static /* synthetic */ EnterChildSetupData b(EnterChildSetupData enterChildSetupData, c cVar, kq2.b bVar, s0 s0Var, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                cVar = enterChildSetupData.enterChildSetupFormData;
            }
            if ((i15 & 2) != 0) {
                bVar = enterChildSetupData.whoAgrees;
            }
            if ((i15 & 4) != 0) {
                s0Var = enterChildSetupData.passportType;
            }
            return enterChildSetupData.a(cVar, bVar, s0Var);
        }

        public final EnterChildSetupData a(c enterChildSetupFormData, kq2.b whoAgrees, s0 passportType) {
            return new EnterChildSetupData(enterChildSetupFormData, whoAgrees, passportType);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final c getEnterChildSetupFormData() {
            return this.enterChildSetupFormData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final s0 getPassportType() {
            return this.passportType;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final kq2.b getWhoAgrees() {
            return this.whoAgrees;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EnterChildSetupData)) {
                return false;
            }
            EnterChildSetupData enterChildSetupData = (EnterChildSetupData) other;
            return t.c(this.enterChildSetupFormData, enterChildSetupData.enterChildSetupFormData) && this.whoAgrees == enterChildSetupData.whoAgrees && this.passportType == enterChildSetupData.passportType;
        }

        public int hashCode() {
            c cVar = this.enterChildSetupFormData;
            int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
            kq2.b bVar = this.whoAgrees;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            s0 s0Var = this.passportType;
            return iHashCode2 + (s0Var != null ? s0Var.hashCode() : 0);
        }

        public String toString() {
            return "EnterChildSetupData(enterChildSetupFormData=" + this.enterChildSetupFormData + ", whoAgrees=" + this.whoAgrees + ", passportType=" + this.passportType + ')';
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001b\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b!\u0010)\u001a\u0004\b%\u0010*R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b#\u0010*R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b(\u0010*¨\u0006+"}, d2 = {"Lwp2/b$c;", "", "Liy/b0;", "firstName", "secondName", "otherName", "lastName", "Lxw/g;", "pesel", "Lfz/b$c;", "birthDate", "birthPlace", "", "noNameSwitchChecked", "noLastNameSwitchChecked", "noPeselSwitchChecked", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Lfz/b$c;Liy/b0;ZZZLfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "c", "()Liy/b0;", "b", "j", "h", "d", "e", "i", "f", "Lfz/b$c;", "()Lfz/b$c;", "g", "Z", "()Z", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f214303k;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b0 firstName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final b0 secondName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final b0 otherName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final b0 lastName;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final b0 pesel;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final fz.b.LocalDate birthDate;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final b0 birthPlace;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final boolean noNameSwitchChecked;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final boolean noLastNameSwitchChecked;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final boolean noPeselSwitchChecked;

        static {
            int i15 = b0.f97726c;
            f214303k = i15 | fz.b.LocalDate.f68860b | i15 | i15 | i15 | i15 | i15;
        }

        public /* synthetic */ c(b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, b0 b0Var5, fz.b.LocalDate localDate, b0 b0Var6, boolean z15, boolean z16, boolean z17, k kVar) {
            this(b0Var, b0Var2, b0Var3, b0Var4, b0Var5, localDate, b0Var6, z15, z16, z17);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final fz.b.LocalDate getBirthDate() {
            return this.birthDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getBirthPlace() {
            return this.birthPlace;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getFirstName() {
            return this.firstName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b0 getLastName() {
            return this.lastName;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getNoLastNameSwitchChecked() {
            return this.noLastNameSwitchChecked;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0042  */
        public boolean equals(Object other) {
            boolean zF;
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            if (!t.c(this.firstName, cVar.firstName) || !t.c(this.secondName, cVar.secondName) || !t.c(this.otherName, cVar.otherName) || !t.c(this.lastName, cVar.lastName)) {
                return false;
            }
            b0 b0Var = this.pesel;
            b0 b0Var2 = cVar.pesel;
            if (b0Var == null) {
                if (b0Var2 == null) {
                    zF = true;
                } else {
                    zF = false;
                }
            } else if (b0Var2 == null) {
                zF = false;
            } else {
                zF = g.f(b0Var, b0Var2);
            }
            return zF && t.c(this.birthDate, cVar.birthDate) && t.c(this.birthPlace, cVar.birthPlace) && this.noNameSwitchChecked == cVar.noNameSwitchChecked && this.noLastNameSwitchChecked == cVar.noLastNameSwitchChecked && this.noPeselSwitchChecked == cVar.noPeselSwitchChecked;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getNoNameSwitchChecked() {
            return this.noNameSwitchChecked;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getNoPeselSwitchChecked() {
            return this.noPeselSwitchChecked;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final b0 getOtherName() {
            return this.otherName;
        }

        public int hashCode() {
            b0 b0Var = this.firstName;
            int iHashCode = (b0Var == null ? 0 : b0Var.hashCode()) * 31;
            b0 b0Var2 = this.secondName;
            int iHashCode2 = (iHashCode + (b0Var2 == null ? 0 : b0Var2.hashCode())) * 31;
            b0 b0Var3 = this.otherName;
            int iHashCode3 = (iHashCode2 + (b0Var3 == null ? 0 : b0Var3.hashCode())) * 31;
            b0 b0Var4 = this.lastName;
            int iHashCode4 = (iHashCode3 + (b0Var4 == null ? 0 : b0Var4.hashCode())) * 31;
            b0 b0Var5 = this.pesel;
            int iH = (iHashCode4 + (b0Var5 == null ? 0 : g.h(b0Var5))) * 31;
            fz.b.LocalDate localDate = this.birthDate;
            int iHashCode5 = (iH + (localDate == null ? 0 : localDate.hashCode())) * 31;
            b0 b0Var6 = this.birthPlace;
            return ((((((iHashCode5 + (b0Var6 != null ? b0Var6.hashCode() : 0)) * 31) + Boolean.hashCode(this.noNameSwitchChecked)) * 31) + Boolean.hashCode(this.noLastNameSwitchChecked)) * 31) + Boolean.hashCode(this.noPeselSwitchChecked);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final b0 getPesel() {
            return this.pesel;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final b0 getSecondName() {
            return this.secondName;
        }

        public String toString() {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("EnterChildSetupFormData(firstName=");
            sb5.append(this.firstName);
            sb5.append(", secondName=");
            sb5.append(this.secondName);
            sb5.append(", otherName=");
            sb5.append(this.otherName);
            sb5.append(", lastName=");
            sb5.append(this.lastName);
            sb5.append(", pesel=");
            b0 b0Var = this.pesel;
            sb5.append((Object) (b0Var == null ? "null" : g.i(b0Var)));
            sb5.append(", birthDate=");
            sb5.append(this.birthDate);
            sb5.append(", birthPlace=");
            sb5.append(this.birthPlace);
            sb5.append(", noNameSwitchChecked=");
            sb5.append(this.noNameSwitchChecked);
            sb5.append(", noLastNameSwitchChecked=");
            sb5.append(this.noLastNameSwitchChecked);
            sb5.append(", noPeselSwitchChecked=");
            sb5.append(this.noPeselSwitchChecked);
            sb5.append(')');
            return sb5.toString();
        }

        private c(b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, b0 b0Var5, fz.b.LocalDate localDate, b0 b0Var6, boolean z15, boolean z16, boolean z17) {
            this.firstName = b0Var;
            this.secondName = b0Var2;
            this.otherName = b0Var3;
            this.lastName = b0Var4;
            this.pesel = b0Var5;
            this.birthDate = localDate;
            this.birthPlace = b0Var6;
            this.noNameSwitchChecked = z15;
            this.noLastNameSwitchChecked = z16;
            this.noPeselSwitchChecked = z17;
        }
    }

    EnterChildSetupData e0();

    void h7(c formData);

    void w2(eq2.a data);
}
