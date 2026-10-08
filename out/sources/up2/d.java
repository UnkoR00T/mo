package up2;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wp2.FieldItem;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lup2/d;", "", "b", "a", "Lup2/d$a;", "Lup2/d$b;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lup2/d$a;", "Lup2/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f199620a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 487720814;
        }

        public String toString() {
            return "AgreementExists";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lup2/d$b;", "Lup2/d;", "Lup2/d$b$a;", "data", "<init>", "(Lup2/d$b$a;)V", "a", "Lup2/d$b$a;", "getData", "()Lup2/d$b$a;", "c", "d", "b", "Lup2/d$b$b;", "Lup2/d$b$c;", "Lup2/d$b$d;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f199621b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Data data;

        /* JADX INFO: renamed from: up2.d$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J¾\u0001\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b&\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b(\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b,\u0010/R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b0\u0010/R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b'\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b*\u0010/¨\u00065"}, d2 = {"Lup2/d$b$a;", "", "Lwp2/a;", "Liy/b0;", "firstName", "secondName", "otherName", "lastName", "Lxw/g;", "pesel", "birthDate", "birthPlace", "", "noNameSwitchChecked", "noLastNameSwitchChecked", "noPeselSwitchChecked", "noPeselSwitchVisible", "Lkq2/b;", "whoAgrees", "datePickerEnabled", "<init>", "(Lwp2/a;Lwp2/a;Lwp2/a;Lwp2/a;Lwp2/a;Lwp2/a;Lwp2/a;ZZZZLkq2/b;Z)V", "a", "(Lwp2/a;Lwp2/a;Lwp2/a;Lwp2/a;Lwp2/a;Lwp2/a;Lwp2/a;ZZZZLkq2/b;Z)Lup2/d$b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lwp2/a;", "f", "()Lwp2/a;", "b", "n", "c", "l", "d", "g", "e", "m", "h", "Z", "i", "()Z", "j", "k", "Lkq2/b;", "o", "()Lkq2/b;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Data {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final int f199623n;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final FieldItem<iy.b0> firstName;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final FieldItem<iy.b0> secondName;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final FieldItem<iy.b0> otherName;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final FieldItem<iy.b0> lastName;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final FieldItem<xw.g> pesel;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final FieldItem<iy.b0> birthDate;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final FieldItem<iy.b0> birthPlace;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean noNameSwitchChecked;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean noLastNameSwitchChecked;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean noPeselSwitchChecked;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean noPeselSwitchVisible;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final kq2.b whoAgrees;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean datePickerEnabled;

            static {
                int i15 = iy.b0.f97726c;
                int i16 = hz.b.f86845b;
                f199623n = i15 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i16;
            }

            public Data(FieldItem<iy.b0> fieldItem, FieldItem<iy.b0> fieldItem2, FieldItem<iy.b0> fieldItem3, FieldItem<iy.b0> fieldItem4, FieldItem<xw.g> fieldItem5, FieldItem<iy.b0> fieldItem6, FieldItem<iy.b0> fieldItem7, boolean z15, boolean z16, boolean z17, boolean z18, kq2.b bVar, boolean z19) {
                this.firstName = fieldItem;
                this.secondName = fieldItem2;
                this.otherName = fieldItem3;
                this.lastName = fieldItem4;
                this.pesel = fieldItem5;
                this.birthDate = fieldItem6;
                this.birthPlace = fieldItem7;
                this.noNameSwitchChecked = z15;
                this.noLastNameSwitchChecked = z16;
                this.noPeselSwitchChecked = z17;
                this.noPeselSwitchVisible = z18;
                this.whoAgrees = bVar;
                this.datePickerEnabled = z19;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Data b(Data data, FieldItem fieldItem, FieldItem fieldItem2, FieldItem fieldItem3, FieldItem fieldItem4, FieldItem fieldItem5, FieldItem fieldItem6, FieldItem fieldItem7, boolean z15, boolean z16, boolean z17, boolean z18, kq2.b bVar, boolean z19, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    fieldItem = data.firstName;
                }
                return data.a(fieldItem, (i15 & 2) != 0 ? data.secondName : fieldItem2, (i15 & 4) != 0 ? data.otherName : fieldItem3, (i15 & 8) != 0 ? data.lastName : fieldItem4, (i15 & 16) != 0 ? data.pesel : fieldItem5, (i15 & 32) != 0 ? data.birthDate : fieldItem6, (i15 & 64) != 0 ? data.birthPlace : fieldItem7, (i15 & 128) != 0 ? data.noNameSwitchChecked : z15, (i15 & 256) != 0 ? data.noLastNameSwitchChecked : z16, (i15 & 512) != 0 ? data.noPeselSwitchChecked : z17, (i15 & 1024) != 0 ? data.noPeselSwitchVisible : z18, (i15 & 2048) != 0 ? data.whoAgrees : bVar, (i15 & PKIFailureInfo.certConfirmed) != 0 ? data.datePickerEnabled : z19);
            }

            public final Data a(FieldItem<iy.b0> firstName, FieldItem<iy.b0> secondName, FieldItem<iy.b0> otherName, FieldItem<iy.b0> lastName, FieldItem<xw.g> pesel, FieldItem<iy.b0> birthDate, FieldItem<iy.b0> birthPlace, boolean noNameSwitchChecked, boolean noLastNameSwitchChecked, boolean noPeselSwitchChecked, boolean noPeselSwitchVisible, kq2.b whoAgrees, boolean datePickerEnabled) {
                return new Data(firstName, secondName, otherName, lastName, pesel, birthDate, birthPlace, noNameSwitchChecked, noLastNameSwitchChecked, noPeselSwitchChecked, noPeselSwitchVisible, whoAgrees, datePickerEnabled);
            }

            public final FieldItem<iy.b0> c() {
                return this.birthDate;
            }

            public final FieldItem<iy.b0> d() {
                return this.birthPlace;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final boolean getDatePickerEnabled() {
                return this.datePickerEnabled;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Data)) {
                    return false;
                }
                Data data = (Data) other;
                return fr.t.c(this.firstName, data.firstName) && fr.t.c(this.secondName, data.secondName) && fr.t.c(this.otherName, data.otherName) && fr.t.c(this.lastName, data.lastName) && fr.t.c(this.pesel, data.pesel) && fr.t.c(this.birthDate, data.birthDate) && fr.t.c(this.birthPlace, data.birthPlace) && this.noNameSwitchChecked == data.noNameSwitchChecked && this.noLastNameSwitchChecked == data.noLastNameSwitchChecked && this.noPeselSwitchChecked == data.noPeselSwitchChecked && this.noPeselSwitchVisible == data.noPeselSwitchVisible && this.whoAgrees == data.whoAgrees && this.datePickerEnabled == data.datePickerEnabled;
            }

            public final FieldItem<iy.b0> f() {
                return this.firstName;
            }

            public final FieldItem<iy.b0> g() {
                return this.lastName;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final boolean getNoLastNameSwitchChecked() {
                return this.noLastNameSwitchChecked;
            }

            public int hashCode() {
                int iHashCode = ((((((((this.firstName.hashCode() * 31) + this.secondName.hashCode()) * 31) + this.otherName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.pesel.hashCode()) * 31;
                FieldItem<iy.b0> fieldItem = this.birthDate;
                return ((((((((((((((iHashCode + (fieldItem == null ? 0 : fieldItem.hashCode())) * 31) + this.birthPlace.hashCode()) * 31) + Boolean.hashCode(this.noNameSwitchChecked)) * 31) + Boolean.hashCode(this.noLastNameSwitchChecked)) * 31) + Boolean.hashCode(this.noPeselSwitchChecked)) * 31) + Boolean.hashCode(this.noPeselSwitchVisible)) * 31) + this.whoAgrees.hashCode()) * 31) + Boolean.hashCode(this.datePickerEnabled);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final boolean getNoNameSwitchChecked() {
                return this.noNameSwitchChecked;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final boolean getNoPeselSwitchChecked() {
                return this.noPeselSwitchChecked;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final boolean getNoPeselSwitchVisible() {
                return this.noPeselSwitchVisible;
            }

            public final FieldItem<iy.b0> l() {
                return this.otherName;
            }

            public final FieldItem<xw.g> m() {
                return this.pesel;
            }

            public final FieldItem<iy.b0> n() {
                return this.secondName;
            }

            /* JADX INFO: renamed from: o, reason: from getter */
            public final kq2.b getWhoAgrees() {
                return this.whoAgrees;
            }

            public String toString() {
                return "Data(firstName=" + this.firstName + ", secondName=" + this.secondName + ", otherName=" + this.otherName + ", lastName=" + this.lastName + ", pesel=" + this.pesel + ", birthDate=" + this.birthDate + ", birthPlace=" + this.birthPlace + ", noNameSwitchChecked=" + this.noNameSwitchChecked + ", noLastNameSwitchChecked=" + this.noLastNameSwitchChecked + ", noPeselSwitchChecked=" + this.noPeselSwitchChecked + ", noPeselSwitchVisible=" + this.noPeselSwitchVisible + ", whoAgrees=" + this.whoAgrees + ", datePickerEnabled=" + this.datePickerEnabled + ')';
            }
        }

        /* JADX INFO: renamed from: up2.d$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lup2/d$b$b;", "Lup2/d$b;", "Lup2/d$b$a;", "data", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Lup2/d$b$a;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lup2/d$b$a;", "a", "()Lup2/d$b$a;", "d", "Lhb4/c;", "b", "()Lhb4/c;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Data data;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMSAdapter;

            public Error(Data data, hb4.c cVar) {
                super(data, null);
                this.data = data;
                this.errorVMSAdapter = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public Data getData() {
                return this.data;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final hb4.c getErrorVMSAdapter() {
                return this.errorVMSAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return fr.t.c(this.data, error.data) && fr.t.c(this.errorVMSAdapter, error.errorVMSAdapter);
            }

            public int hashCode() {
                return (this.data.hashCode() * 31) + this.errorVMSAdapter.hashCode();
            }

            public String toString() {
                return "Error(data=" + this.data + ", errorVMSAdapter=" + this.errorVMSAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: up2.d$b$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lup2/d$b$c;", "Lup2/d$b;", "Lup2/d$b$a;", "data", "<init>", "(Lup2/d$b$a;)V", "a", "(Lup2/d$b$a;)Lup2/d$b$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lup2/d$b$a;", "b", "()Lup2/d$b$a;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Presentation extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f199639d;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Data data;

            static {
                int i15 = iy.b0.f97726c;
                int i16 = hz.b.f86845b;
                f199639d = i15 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i16;
            }

            public Presentation(Data data) {
                super(data, null);
                this.data = data;
            }

            public final Presentation a(Data data) {
                return new Presentation(data);
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public Data getData() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Presentation) && fr.t.c(this.data, ((Presentation) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "Presentation(data=" + this.data + ')';
            }
        }

        /* JADX INFO: renamed from: up2.d$b$d, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lup2/d$b$d;", "Lup2/d$b;", "Lup2/d$b$a;", "data", "<init>", "(Lup2/d$b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lup2/d$b$a;", "a", "()Lup2/d$b$a;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class VerifyingAgreement extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f199641d;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Data data;

            static {
                int i15 = iy.b0.f97726c;
                int i16 = hz.b.f86845b;
                f199641d = i15 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i16;
            }

            public VerifyingAgreement(Data data) {
                super(data, null);
                this.data = data;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public Data getData() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof VerifyingAgreement) && fr.t.c(this.data, ((VerifyingAgreement) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "VerifyingAgreement(data=" + this.data + ')';
            }
        }

        static {
            int i15 = iy.b0.f97726c;
            int i16 = hz.b.f86845b;
            f199621b = i15 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i16;
        }

        public /* synthetic */ b(Data data, fr.k kVar) {
            this(data);
        }

        private b(Data data) {
            this.data = data;
        }
    }
}
