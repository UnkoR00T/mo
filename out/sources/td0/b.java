package td0;

import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ltd0/b;", "", "c", "b", "a", "Ltd0/b$a;", "Ltd0/b$b;", "Ltd0/b$c;", "setpin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: td0.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ltd0/b$a;", "Ltd0/b;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "setpin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    /* JADX INFO: renamed from: td0.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Ltd0/b$b;", "Ltd0/b;", "Liy/b0;", "pinValue", "repeatedPinValue", "Lhz/b;", "validationState", "<init>", "(Liy/b0;Liy/b0;Lhz/b;)V", "a", "(Liy/b0;Liy/b0;Lhz/b;)Ltd0/b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "c", "()Liy/b0;", "b", "d", "Lhz/b;", "e", "()Lhz/b;", "setpin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RepeatPin implements b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f189657d;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 pinValue;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 repeatedPinValue;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        static {
            int i15 = hz.b.f86845b;
            int i16 = b0.f97726c;
            f189657d = i15 | i16 | i16;
        }

        public RepeatPin() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ RepeatPin b(RepeatPin repeatPin, b0 b0Var, b0 b0Var2, hz.b bVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                b0Var = repeatPin.pinValue;
            }
            if ((i15 & 2) != 0) {
                b0Var2 = repeatPin.repeatedPinValue;
            }
            if ((i15 & 4) != 0) {
                bVar = repeatPin.validationState;
            }
            return repeatPin.a(b0Var, b0Var2, bVar);
        }

        public final RepeatPin a(b0 pinValue, b0 repeatedPinValue, hz.b validationState) {
            return new RepeatPin(pinValue, repeatedPinValue, validationState);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getPinValue() {
            return this.pinValue;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b0 getRepeatedPinValue() {
            return this.repeatedPinValue;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final hz.b getValidationState() {
            return this.validationState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RepeatPin)) {
                return false;
            }
            RepeatPin repeatPin = (RepeatPin) other;
            return fr.t.c(this.pinValue, repeatPin.pinValue) && fr.t.c(this.repeatedPinValue, repeatPin.repeatedPinValue) && fr.t.c(this.validationState, repeatPin.validationState);
        }

        public int hashCode() {
            return (((this.pinValue.hashCode() * 31) + this.repeatedPinValue.hashCode()) * 31) + this.validationState.hashCode();
        }

        public String toString() {
            return "RepeatPin(pinValue=" + this.pinValue + ", repeatedPinValue=" + this.repeatedPinValue + ", validationState=" + this.validationState + ')';
        }

        public RepeatPin(b0 b0Var, b0 b0Var2, hz.b bVar) {
            this.pinValue = b0Var;
            this.repeatedPinValue = b0Var2;
            this.validationState = bVar;
        }

        public /* synthetic */ RepeatPin(b0 b0Var, b0 b0Var2, hz.b bVar, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? b0.INSTANCE.a() : b0Var, (i15 & 2) != 0 ? b0.INSTANCE.a() : b0Var2, (i15 & 4) != 0 ? hz.b.C2039b.f86846c : bVar);
        }
    }

    /* JADX INFO: renamed from: td0.b$c, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ltd0/b$c;", "Ltd0/b;", "Liy/b0;", "pinValue", "Lhz/b;", "validationState", "<init>", "(Liy/b0;Lhz/b;)V", "a", "(Liy/b0;Lhz/b;)Ltd0/b$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "c", "()Liy/b0;", "b", "Lhz/b;", "d", "()Lhz/b;", "setpin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetPin implements b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f189661c = hz.b.f86845b | b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 pinValue;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        /* JADX WARN: Multi-variable type inference failed */
        public SetPin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SetPin b(SetPin setPin, b0 b0Var, hz.b bVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                b0Var = setPin.pinValue;
            }
            if ((i15 & 2) != 0) {
                bVar = setPin.validationState;
            }
            return setPin.a(b0Var, bVar);
        }

        public final SetPin a(b0 pinValue, hz.b validationState) {
            return new SetPin(pinValue, validationState);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getPinValue() {
            return this.pinValue;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final hz.b getValidationState() {
            return this.validationState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetPin)) {
                return false;
            }
            SetPin setPin = (SetPin) other;
            return fr.t.c(this.pinValue, setPin.pinValue) && fr.t.c(this.validationState, setPin.validationState);
        }

        public int hashCode() {
            return (this.pinValue.hashCode() * 31) + this.validationState.hashCode();
        }

        public String toString() {
            return "SetPin(pinValue=" + this.pinValue + ", validationState=" + this.validationState + ')';
        }

        public SetPin(b0 b0Var, hz.b bVar) {
            this.pinValue = b0Var;
            this.validationState = bVar;
        }

        public /* synthetic */ SetPin(b0 b0Var, hz.b bVar, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? b0.INSTANCE.a() : b0Var, (i15 & 2) != 0 ? hz.b.C2039b.f86846c : bVar);
        }
    }
}
