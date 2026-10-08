package i81;

import k81.FieldItem;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i81.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0002\u0012\u0006\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015JÄ\u0001\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0002\u0010\u0013\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b&\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b(\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b0\u0010/R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b.\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b,\u0010/R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0006¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b*\u0010#R\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b4\u0010/¨\u00065"}, d2 = {"Li81/b;", "", "Lk81/b;", "Liy/b0;", "firstName", "secondName", "otherName", "lastName", "Lxw/g;", "pesel", "birthDate", "birthPlace", "", "noNameSwitchChecked", "noLastNameSwitchChecked", "Li61/t;", "whoAgrees", "datePickerEnabled", "citizenshipCheckBoxState", "scrollToCitizenshipCheckBox", "<init>", "(Lk81/b;Lk81/b;Lk81/b;Lk81/b;Lk81/b;Lk81/b;Lk81/b;ZZLi61/t;ZLk81/b;Z)V", "a", "(Lk81/b;Lk81/b;Lk81/b;Lk81/b;Lk81/b;Lk81/b;Lk81/b;ZZLi61/t;ZLk81/b;Z)Li81/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lk81/b;", "g", "()Lk81/b;", "b", "n", "c", "k", "d", "h", "e", "l", "f", "Z", "j", "()Z", "i", "Li61/t;", "getWhoAgrees", "()Li61/t;", "m", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f89956n;

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
    private final i61.t whoAgrees;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean datePickerEnabled;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final FieldItem<Boolean> citizenshipCheckBoxState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean scrollToCitizenshipCheckBox;

    static {
        int i15 = hz.b.f86845b;
        int i16 = iy.b0.f97726c;
        f89956n = i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15;
    }

    public State(FieldItem<iy.b0> fieldItem, FieldItem<iy.b0> fieldItem2, FieldItem<iy.b0> fieldItem3, FieldItem<iy.b0> fieldItem4, FieldItem<xw.g> fieldItem5, FieldItem<iy.b0> fieldItem6, FieldItem<iy.b0> fieldItem7, boolean z15, boolean z16, i61.t tVar, boolean z17, FieldItem<Boolean> fieldItem8, boolean z18) {
        this.firstName = fieldItem;
        this.secondName = fieldItem2;
        this.otherName = fieldItem3;
        this.lastName = fieldItem4;
        this.pesel = fieldItem5;
        this.birthDate = fieldItem6;
        this.birthPlace = fieldItem7;
        this.noNameSwitchChecked = z15;
        this.noLastNameSwitchChecked = z16;
        this.whoAgrees = tVar;
        this.datePickerEnabled = z17;
        this.citizenshipCheckBoxState = fieldItem8;
        this.scrollToCitizenshipCheckBox = z18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, FieldItem fieldItem, FieldItem fieldItem2, FieldItem fieldItem3, FieldItem fieldItem4, FieldItem fieldItem5, FieldItem fieldItem6, FieldItem fieldItem7, boolean z15, boolean z16, i61.t tVar, boolean z17, FieldItem fieldItem8, boolean z18, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            fieldItem = state.firstName;
        }
        return state.a(fieldItem, (i15 & 2) != 0 ? state.secondName : fieldItem2, (i15 & 4) != 0 ? state.otherName : fieldItem3, (i15 & 8) != 0 ? state.lastName : fieldItem4, (i15 & 16) != 0 ? state.pesel : fieldItem5, (i15 & 32) != 0 ? state.birthDate : fieldItem6, (i15 & 64) != 0 ? state.birthPlace : fieldItem7, (i15 & 128) != 0 ? state.noNameSwitchChecked : z15, (i15 & 256) != 0 ? state.noLastNameSwitchChecked : z16, (i15 & 512) != 0 ? state.whoAgrees : tVar, (i15 & 1024) != 0 ? state.datePickerEnabled : z17, (i15 & 2048) != 0 ? state.citizenshipCheckBoxState : fieldItem8, (i15 & PKIFailureInfo.certConfirmed) != 0 ? state.scrollToCitizenshipCheckBox : z18);
    }

    public final State a(FieldItem<iy.b0> firstName, FieldItem<iy.b0> secondName, FieldItem<iy.b0> otherName, FieldItem<iy.b0> lastName, FieldItem<xw.g> pesel, FieldItem<iy.b0> birthDate, FieldItem<iy.b0> birthPlace, boolean noNameSwitchChecked, boolean noLastNameSwitchChecked, i61.t whoAgrees, boolean datePickerEnabled, FieldItem<Boolean> citizenshipCheckBoxState, boolean scrollToCitizenshipCheckBox) {
        return new State(firstName, secondName, otherName, lastName, pesel, birthDate, birthPlace, noNameSwitchChecked, noLastNameSwitchChecked, whoAgrees, datePickerEnabled, citizenshipCheckBoxState, scrollToCitizenshipCheckBox);
    }

    public final FieldItem<iy.b0> c() {
        return this.birthDate;
    }

    public final FieldItem<iy.b0> d() {
        return this.birthPlace;
    }

    public final FieldItem<Boolean> e() {
        return this.citizenshipCheckBoxState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.firstName, state.firstName) && fr.t.c(this.secondName, state.secondName) && fr.t.c(this.otherName, state.otherName) && fr.t.c(this.lastName, state.lastName) && fr.t.c(this.pesel, state.pesel) && fr.t.c(this.birthDate, state.birthDate) && fr.t.c(this.birthPlace, state.birthPlace) && this.noNameSwitchChecked == state.noNameSwitchChecked && this.noLastNameSwitchChecked == state.noLastNameSwitchChecked && this.whoAgrees == state.whoAgrees && this.datePickerEnabled == state.datePickerEnabled && fr.t.c(this.citizenshipCheckBoxState, state.citizenshipCheckBoxState) && this.scrollToCitizenshipCheckBox == state.scrollToCitizenshipCheckBox;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getDatePickerEnabled() {
        return this.datePickerEnabled;
    }

    public final FieldItem<iy.b0> g() {
        return this.firstName;
    }

    public final FieldItem<iy.b0> h() {
        return this.lastName;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.firstName.hashCode() * 31) + this.secondName.hashCode()) * 31) + this.otherName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.pesel.hashCode()) * 31;
        FieldItem<iy.b0> fieldItem = this.birthDate;
        return ((((((((((((((iHashCode + (fieldItem == null ? 0 : fieldItem.hashCode())) * 31) + this.birthPlace.hashCode()) * 31) + Boolean.hashCode(this.noNameSwitchChecked)) * 31) + Boolean.hashCode(this.noLastNameSwitchChecked)) * 31) + this.whoAgrees.hashCode()) * 31) + Boolean.hashCode(this.datePickerEnabled)) * 31) + this.citizenshipCheckBoxState.hashCode()) * 31) + Boolean.hashCode(this.scrollToCitizenshipCheckBox);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getNoLastNameSwitchChecked() {
        return this.noLastNameSwitchChecked;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getNoNameSwitchChecked() {
        return this.noNameSwitchChecked;
    }

    public final FieldItem<iy.b0> k() {
        return this.otherName;
    }

    public final FieldItem<xw.g> l() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getScrollToCitizenshipCheckBox() {
        return this.scrollToCitizenshipCheckBox;
    }

    public final FieldItem<iy.b0> n() {
        return this.secondName;
    }

    public String toString() {
        return "State(firstName=" + this.firstName + ", secondName=" + this.secondName + ", otherName=" + this.otherName + ", lastName=" + this.lastName + ", pesel=" + this.pesel + ", birthDate=" + this.birthDate + ", birthPlace=" + this.birthPlace + ", noNameSwitchChecked=" + this.noNameSwitchChecked + ", noLastNameSwitchChecked=" + this.noLastNameSwitchChecked + ", whoAgrees=" + this.whoAgrees + ", datePickerEnabled=" + this.datePickerEnabled + ", citizenshipCheckBoxState=" + this.citizenshipCheckBoxState + ", scrollToCitizenshipCheckBox=" + this.scrollToCitizenshipCheckBox + ')';
    }
}
