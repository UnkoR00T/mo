package fu1;

import hu1.FormFieldData;
import iy.b0;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fu1.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJX\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001f\u0010'¨\u0006("}, d2 = {"Lfu1/b;", "", "Liy/b0;", "name", "surname", "seriesAndNumber", "Lhz/b;", "nameValidationState", "surnameValidationState", "seriesAndNumberValidationState", "Lhu1/a$a;", "fieldTypeToScroll", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Lhz/b;Lhz/b;Lhz/b;Lhu1/a$a;)V", "a", "(Liy/b0;Liy/b0;Liy/b0;Lhz/b;Lhz/b;Lhz/b;Lhu1/a$a;)Lfu1/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "d", "()Liy/b0;", "b", "h", "c", "f", "Lhz/b;", "e", "()Lhz/b;", "i", "g", "Lhu1/a$a;", "()Lhu1/a$a;", "driverqualifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f67125h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 surname;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 seriesAndNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b nameValidationState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b surnameValidationState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b seriesAndNumberValidationState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final FormFieldData.EnumC2027a fieldTypeToScroll;

    static {
        int i15 = hz.b.f86845b;
        int i16 = b0.f97726c;
        f67125h = i15 | i16 | i16 | i16;
    }

    public State() {
        this(null, null, null, null, null, null, null, CertificateBody.profileType, null);
    }

    public static /* synthetic */ State b(State state, b0 b0Var, b0 b0Var2, b0 b0Var3, hz.b bVar, hz.b bVar2, hz.b bVar3, FormFieldData.EnumC2027a enumC2027a, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            b0Var = state.name;
        }
        if ((i15 & 2) != 0) {
            b0Var2 = state.surname;
        }
        if ((i15 & 4) != 0) {
            b0Var3 = state.seriesAndNumber;
        }
        if ((i15 & 8) != 0) {
            bVar = state.nameValidationState;
        }
        if ((i15 & 16) != 0) {
            bVar2 = state.surnameValidationState;
        }
        if ((i15 & 32) != 0) {
            bVar3 = state.seriesAndNumberValidationState;
        }
        if ((i15 & 64) != 0) {
            enumC2027a = state.fieldTypeToScroll;
        }
        hz.b bVar4 = bVar3;
        FormFieldData.EnumC2027a enumC2027a2 = enumC2027a;
        hz.b bVar5 = bVar2;
        b0 b0Var4 = b0Var3;
        return state.a(b0Var, b0Var2, b0Var4, bVar, bVar5, bVar4, enumC2027a2);
    }

    public final State a(b0 name, b0 surname, b0 seriesAndNumber, hz.b nameValidationState, hz.b surnameValidationState, hz.b seriesAndNumberValidationState, FormFieldData.EnumC2027a fieldTypeToScroll) {
        return new State(name, surname, seriesAndNumber, nameValidationState, surnameValidationState, seriesAndNumberValidationState, fieldTypeToScroll);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final FormFieldData.EnumC2027a getFieldTypeToScroll() {
        return this.fieldTypeToScroll;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final hz.b getNameValidationState() {
        return this.nameValidationState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.name, state.name) && fr.t.c(this.surname, state.surname) && fr.t.c(this.seriesAndNumber, state.seriesAndNumber) && fr.t.c(this.nameValidationState, state.nameValidationState) && fr.t.c(this.surnameValidationState, state.surnameValidationState) && fr.t.c(this.seriesAndNumberValidationState, state.seriesAndNumberValidationState) && this.fieldTypeToScroll == state.fieldTypeToScroll;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b0 getSeriesAndNumber() {
        return this.seriesAndNumber;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final hz.b getSeriesAndNumberValidationState() {
        return this.seriesAndNumberValidationState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b0 getSurname() {
        return this.surname;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.name.hashCode() * 31) + this.surname.hashCode()) * 31) + this.seriesAndNumber.hashCode()) * 31) + this.nameValidationState.hashCode()) * 31) + this.surnameValidationState.hashCode()) * 31) + this.seriesAndNumberValidationState.hashCode()) * 31;
        FormFieldData.EnumC2027a enumC2027a = this.fieldTypeToScroll;
        return iHashCode + (enumC2027a == null ? 0 : enumC2027a.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final hz.b getSurnameValidationState() {
        return this.surnameValidationState;
    }

    public String toString() {
        return "State(name=" + this.name + ", surname=" + this.surname + ", seriesAndNumber=" + this.seriesAndNumber + ", nameValidationState=" + this.nameValidationState + ", surnameValidationState=" + this.surnameValidationState + ", seriesAndNumberValidationState=" + this.seriesAndNumberValidationState + ", fieldTypeToScroll=" + this.fieldTypeToScroll + ')';
    }

    public State(b0 b0Var, b0 b0Var2, b0 b0Var3, hz.b bVar, hz.b bVar2, hz.b bVar3, FormFieldData.EnumC2027a enumC2027a) {
        this.name = b0Var;
        this.surname = b0Var2;
        this.seriesAndNumber = b0Var3;
        this.nameValidationState = bVar;
        this.surnameValidationState = bVar2;
        this.seriesAndNumberValidationState = bVar3;
        this.fieldTypeToScroll = enumC2027a;
    }

    public /* synthetic */ State(b0 b0Var, b0 b0Var2, b0 b0Var3, hz.b bVar, hz.b bVar2, hz.b bVar3, FormFieldData.EnumC2027a enumC2027a, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? b0.INSTANCE.a() : b0Var, (i15 & 2) != 0 ? b0.INSTANCE.a() : b0Var2, (i15 & 4) != 0 ? b0.INSTANCE.a() : b0Var3, (i15 & 8) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 16) != 0 ? hz.b.C2039b.f86846c : bVar2, (i15 & 32) != 0 ? hz.b.C2039b.f86846c : bVar3, (i15 & 64) != 0 ? null : enumC2027a);
    }
}
