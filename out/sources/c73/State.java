package c73;

import iy.b0;
import iy.c0;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;
import xw.PhoneNumber;

/* JADX INFO: renamed from: c73.c, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJd\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b%\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b\u000b\u0010'R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b(\u0010'R\u0017\u0010*\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b)\u0010'R\u0017\u0010,\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b+\u0010'R\u0017\u00101\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u001f\u00100¨\u00062"}, d2 = {"Lc73/c;", "", "Lhz/b;", "prefixValidationState", "numberValidationState", "Liy/b0;", "prefix", "number", "previousPrefix", "previousPhoneNumber", "", "isSameErrorActive", "scrollToError", "<init>", "(Lhz/b;Lhz/b;Liy/b0;Liy/b0;Liy/b0;Liy/b0;ZZ)V", "a", "(Lhz/b;Lhz/b;Liy/b0;Liy/b0;Liy/b0;Liy/b0;ZZ)Lc73/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "g", "()Lhz/b;", "b", "e", "c", "Liy/b0;", "f", "()Liy/b0;", "d", "getPreviousPrefix", "getPreviousPhoneNumber", "Z", "()Z", "h", "i", "isPrefixAndPhoneSameAsPrevious", "j", "isSameError", "Lxw/h;", "k", "Lxw/h;", "()Lxw/h;", "fullPhoneNumber", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f23966l;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b prefixValidationState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b numberValidationState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 prefix;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 number;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 previousPrefix;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 previousPhoneNumber;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSameErrorActive;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean scrollToError;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean isPrefixAndPhoneSameAsPrevious;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean isSameError;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final PhoneNumber fullPhoneNumber;

    static {
        int i15 = PhoneNumber.f221634d;
        int i16 = b0.f97726c;
        int i17 = i15 | i16 | i16 | i16 | i16;
        int i18 = hz.b.f86845b;
        f23966l = i17 | i18 | i18;
    }

    public State() {
        this(null, null, null, null, null, null, false, false, GF2Field.MASK, null);
    }

    public static /* synthetic */ State b(State state, hz.b bVar, hz.b bVar2, b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bVar = state.prefixValidationState;
        }
        if ((i15 & 2) != 0) {
            bVar2 = state.numberValidationState;
        }
        if ((i15 & 4) != 0) {
            b0Var = state.prefix;
        }
        if ((i15 & 8) != 0) {
            b0Var2 = state.number;
        }
        if ((i15 & 16) != 0) {
            b0Var3 = state.previousPrefix;
        }
        if ((i15 & 32) != 0) {
            b0Var4 = state.previousPhoneNumber;
        }
        if ((i15 & 64) != 0) {
            z15 = state.isSameErrorActive;
        }
        if ((i15 & 128) != 0) {
            z16 = state.scrollToError;
        }
        boolean z17 = z15;
        boolean z18 = z16;
        b0 b0Var5 = b0Var3;
        b0 b0Var6 = b0Var4;
        return state.a(bVar, bVar2, b0Var, b0Var2, b0Var5, b0Var6, z17, z18);
    }

    public final State a(hz.b prefixValidationState, hz.b numberValidationState, b0 prefix, b0 number, b0 previousPrefix, b0 previousPhoneNumber, boolean isSameErrorActive, boolean scrollToError) {
        return new State(prefixValidationState, numberValidationState, prefix, number, previousPrefix, previousPhoneNumber, isSameErrorActive, scrollToError);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final PhoneNumber getFullPhoneNumber() {
        return this.fullPhoneNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final hz.b getNumberValidationState() {
        return this.numberValidationState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.prefixValidationState, state.prefixValidationState) && fr.t.c(this.numberValidationState, state.numberValidationState) && fr.t.c(this.prefix, state.prefix) && fr.t.c(this.number, state.number) && fr.t.c(this.previousPrefix, state.previousPrefix) && fr.t.c(this.previousPhoneNumber, state.previousPhoneNumber) && this.isSameErrorActive == state.isSameErrorActive && this.scrollToError == state.scrollToError;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b0 getPrefix() {
        return this.prefix;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final hz.b getPrefixValidationState() {
        return this.prefixValidationState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getScrollToError() {
        return this.scrollToError;
    }

    public int hashCode() {
        int iHashCode = ((((((this.prefixValidationState.hashCode() * 31) + this.numberValidationState.hashCode()) * 31) + this.prefix.hashCode()) * 31) + this.number.hashCode()) * 31;
        b0 b0Var = this.previousPrefix;
        int iHashCode2 = (iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        b0 b0Var2 = this.previousPhoneNumber;
        return ((((iHashCode2 + (b0Var2 != null ? b0Var2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSameErrorActive)) * 31) + Boolean.hashCode(this.scrollToError);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsPrefixAndPhoneSameAsPrevious() {
        return this.isPrefixAndPhoneSameAsPrevious;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsSameError() {
        return this.isSameError;
    }

    public String toString() {
        return "State(prefixValidationState=" + this.prefixValidationState + ", numberValidationState=" + this.numberValidationState + ", prefix=" + this.prefix + ", number=" + this.number + ", previousPrefix=" + this.previousPrefix + ", previousPhoneNumber=" + this.previousPhoneNumber + ", isSameErrorActive=" + this.isSameErrorActive + ", scrollToError=" + this.scrollToError + ')';
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    public State(hz.b bVar, hz.b bVar2, b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, boolean z15, boolean z16) {
        boolean z17;
        this.prefixValidationState = bVar;
        this.numberValidationState = bVar2;
        this.prefix = b0Var;
        this.number = b0Var2;
        this.previousPrefix = b0Var3;
        this.previousPhoneNumber = b0Var4;
        this.isSameErrorActive = z15;
        this.scrollToError = z16;
        boolean zC = fr.t.c(fu.r.u1(c0.e(b0Var)).toString(), b0Var3 != null ? c0.e(b0Var3) : null);
        boolean z18 = false;
        if (zC) {
            if (fr.t.c(fu.r.u1(c0.e(b0Var2)).toString(), b0Var4 != null ? c0.e(b0Var4) : null)) {
                z17 = true;
            } else {
                z17 = false;
            }
        } else {
            z17 = false;
        }
        this.isPrefixAndPhoneSameAsPrevious = z17;
        if (z17 && z15) {
            z18 = true;
        }
        this.isSameError = z18;
        this.fullPhoneNumber = new PhoneNumber(PhoneNumber.c.c(b0Var), PhoneNumber.b.c(b0Var2), null);
    }

    public /* synthetic */ State(hz.b bVar, hz.b bVar2, b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, boolean z15, boolean z16, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? hz.b.d.f86848c : bVar, (i15 & 2) != 0 ? hz.b.d.f86848c : bVar2, (i15 & 4) != 0 ? PhoneNumber.c.INSTANCE.a() : b0Var, (i15 & 8) != 0 ? b0.INSTANCE.a() : b0Var2, (i15 & 16) != 0 ? null : b0Var3, (i15 & 32) != 0 ? null : b0Var4, (i15 & 64) != 0 ? false : z15, (i15 & 128) != 0 ? false : z16);
    }
}
