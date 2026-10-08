package ak2;

import iy.a0;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lak2/b;", "", "Lak2/b$b;", "b", "()Lak2/b$b;", "stateData", "a", "c", "Lak2/b$a;", "Lak2/b$c;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: ak2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lak2/b$a;", "Lak2/b;", "Lak2/b$b;", "stateData", "<init>", "(Lak2/b$b;)V", "a", "(Lak2/b$b;)Lak2/b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lak2/b$b;", "b", "()Lak2/b$b;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f7152b = (hz.b.f86845b | b0.f97726c) | a0.f97720c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final StateData stateData;

        public Initialized(StateData stateData) {
            this.stateData = stateData;
        }

        public final Initialized a(StateData stateData) {
            return new Initialized(stateData);
        }

        @Override // ak2.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public StateData getStateData() {
            return this.stateData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initialized) && fr.t.c(this.stateData, ((Initialized) other).stateData);
        }

        public int hashCode() {
            return this.stateData.hashCode();
        }

        public String toString() {
            return "Initialized(stateData=" + this.stateData + ')';
        }
    }

    /* JADX INFO: renamed from: ak2.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010JV\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b-\u0010,¨\u0006."}, d2 = {"Lak2/b$b;", "", "Liy/a0;", "biometricResult", "Liy/b0;", "pinValue", "Lhz/b;", "validationState", "", "appVersion", "Lac4/p;", "partOfTheDay", "", "isImeVisible", "shouldFocusWithKeyboard", "<init>", "(Liy/a0;Liy/b0;Lhz/b;Ljava/lang/String;Lac4/p;ZZ)V", "a", "(Liy/a0;Liy/b0;Lhz/b;Ljava/lang/String;Lac4/p;ZZ)Lak2/b$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Liy/a0;", "d", "()Liy/a0;", "b", "Liy/b0;", "f", "()Liy/b0;", "c", "Lhz/b;", "h", "()Lhz/b;", "Ljava/lang/String;", "e", "Lac4/p;", "()Lac4/p;", "Z", "i", "()Z", "g", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StateData {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f7154h = (hz.b.f86845b | b0.f97726c) | a0.f97720c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a0 biometricResult;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 pinValue;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String appVersion;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final ac4.p partOfTheDay;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isImeVisible;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldFocusWithKeyboard;

        public StateData(a0 a0Var, b0 b0Var, hz.b bVar, String str, ac4.p pVar, boolean z15, boolean z16) {
            this.biometricResult = a0Var;
            this.pinValue = b0Var;
            this.validationState = bVar;
            this.appVersion = str;
            this.partOfTheDay = pVar;
            this.isImeVisible = z15;
            this.shouldFocusWithKeyboard = z16;
        }

        public static /* synthetic */ StateData b(StateData stateData, a0 a0Var, b0 b0Var, hz.b bVar, String str, ac4.p pVar, boolean z15, boolean z16, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                a0Var = stateData.biometricResult;
            }
            if ((i15 & 2) != 0) {
                b0Var = stateData.pinValue;
            }
            if ((i15 & 4) != 0) {
                bVar = stateData.validationState;
            }
            if ((i15 & 8) != 0) {
                str = stateData.appVersion;
            }
            if ((i15 & 16) != 0) {
                pVar = stateData.partOfTheDay;
            }
            if ((i15 & 32) != 0) {
                z15 = stateData.isImeVisible;
            }
            if ((i15 & 64) != 0) {
                z16 = stateData.shouldFocusWithKeyboard;
            }
            boolean z17 = z15;
            boolean z18 = z16;
            ac4.p pVar2 = pVar;
            hz.b bVar2 = bVar;
            return stateData.a(a0Var, b0Var, bVar2, str, pVar2, z17, z18);
        }

        public final StateData a(a0 biometricResult, b0 pinValue, hz.b validationState, String appVersion, ac4.p partOfTheDay, boolean isImeVisible, boolean shouldFocusWithKeyboard) {
            return new StateData(biometricResult, pinValue, validationState, appVersion, partOfTheDay, isImeVisible, shouldFocusWithKeyboard);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getAppVersion() {
            return this.appVersion;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final a0 getBiometricResult() {
            return this.biometricResult;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ac4.p getPartOfTheDay() {
            return this.partOfTheDay;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateData)) {
                return false;
            }
            StateData stateData = (StateData) other;
            return fr.t.c(this.biometricResult, stateData.biometricResult) && fr.t.c(this.pinValue, stateData.pinValue) && fr.t.c(this.validationState, stateData.validationState) && fr.t.c(this.appVersion, stateData.appVersion) && this.partOfTheDay == stateData.partOfTheDay && this.isImeVisible == stateData.isImeVisible && this.shouldFocusWithKeyboard == stateData.shouldFocusWithKeyboard;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final b0 getPinValue() {
            return this.pinValue;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getShouldFocusWithKeyboard() {
            return this.shouldFocusWithKeyboard;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final hz.b getValidationState() {
            return this.validationState;
        }

        public int hashCode() {
            return (((((((((((this.biometricResult.hashCode() * 31) + this.pinValue.hashCode()) * 31) + this.validationState.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.partOfTheDay.hashCode()) * 31) + Boolean.hashCode(this.isImeVisible)) * 31) + Boolean.hashCode(this.shouldFocusWithKeyboard);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getIsImeVisible() {
            return this.isImeVisible;
        }

        public String toString() {
            return "StateData(biometricResult=" + this.biometricResult + ", pinValue=" + this.pinValue + ", validationState=" + this.validationState + ", appVersion=" + this.appVersion + ", partOfTheDay=" + this.partOfTheDay + ", isImeVisible=" + this.isImeVisible + ", shouldFocusWithKeyboard=" + this.shouldFocusWithKeyboard + ')';
        }
    }

    /* JADX INFO: renamed from: ak2.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lak2/b$c;", "Lak2/b;", "Lak2/b$b;", "stateData", "<init>", "(Lak2/b$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak2/b$b;", "b", "()Lak2/b$b;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Verifying implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f7162b = (hz.b.f86845b | b0.f97726c) | a0.f97720c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final StateData stateData;

        public Verifying(StateData stateData) {
            this.stateData = stateData;
        }

        @Override // ak2.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public StateData getStateData() {
            return this.stateData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Verifying) && fr.t.c(this.stateData, ((Verifying) other).stateData);
        }

        public int hashCode() {
            return this.stateData.hashCode();
        }

        public String toString() {
            return "Verifying(stateData=" + this.stateData + ')';
        }
    }

    /* JADX INFO: renamed from: b */
    StateData getStateData();
}
