package vo3;

import co3.PinAuthResult;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lvo3/b;", "", "a", "b", "Lvo3/b$a;", "Lvo3/b$b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lvo3/b$a;", "Lvo3/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f207717a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 1752533420;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: vo3.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0003\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lvo3/b$b;", "Lvo3/b;", "Liy/b0;", "a", "()Liy/b0;", "pinValue", "b", "Lvo3/b$b$a;", "Lvo3/b$b$b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC5455b extends b {

        /* JADX INFO: renamed from: vo3.b$b$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lvo3/b$b$a;", "Lvo3/b$b;", "Liy/b0;", "pinValue", "", "isError", "Lco3/d;", "pinAuthResult", "<init>", "(Liy/b0;ZLco3/d;)V", "b", "(Liy/b0;ZLco3/d;)Lvo3/b$b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "Z", "e", "()Z", "c", "Lco3/d;", "d", "()Lco3/d;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Displaying implements InterfaceC5455b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final b0 pinValue;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isError;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final PinAuthResult pinAuthResult;

            public Displaying(b0 b0Var, boolean z15, PinAuthResult pinAuthResult) {
                this.pinValue = b0Var;
                this.isError = z15;
                this.pinAuthResult = pinAuthResult;
            }

            public static /* synthetic */ Displaying c(Displaying displaying, b0 b0Var, boolean z15, PinAuthResult pinAuthResult, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    b0Var = displaying.pinValue;
                }
                if ((i15 & 2) != 0) {
                    z15 = displaying.isError;
                }
                if ((i15 & 4) != 0) {
                    pinAuthResult = displaying.pinAuthResult;
                }
                return displaying.b(b0Var, z15, pinAuthResult);
            }

            @Override // vo3.b.InterfaceC5455b
            /* JADX INFO: renamed from: a, reason: from getter */
            public b0 getPinValue() {
                return this.pinValue;
            }

            public final Displaying b(b0 pinValue, boolean isError, PinAuthResult pinAuthResult) {
                return new Displaying(pinValue, isError, pinAuthResult);
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public PinAuthResult getPinAuthResult() {
                return this.pinAuthResult;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final boolean getIsError() {
                return this.isError;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Displaying)) {
                    return false;
                }
                Displaying displaying = (Displaying) other;
                return fr.t.c(this.pinValue, displaying.pinValue) && this.isError == displaying.isError && fr.t.c(this.pinAuthResult, displaying.pinAuthResult);
            }

            public int hashCode() {
                return (((this.pinValue.hashCode() * 31) + Boolean.hashCode(this.isError)) * 31) + this.pinAuthResult.hashCode();
            }

            public String toString() {
                return "Displaying(pinValue=" + this.pinValue + ", isError=" + this.isError + ", pinAuthResult=" + this.pinAuthResult + ')';
            }
        }

        /* JADX INFO: renamed from: vo3.b$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lvo3/b$b$b;", "Lvo3/b$b;", "Liy/b0;", "pinValue", "Lco3/d;", "pinAuthResult", "<init>", "(Liy/b0;Lco3/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Lco3/d;", "()Lco3/d;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ValidatePin implements InterfaceC5455b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final b0 pinValue;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final PinAuthResult pinAuthResult;

            public ValidatePin(b0 b0Var, PinAuthResult pinAuthResult) {
                this.pinValue = b0Var;
                this.pinAuthResult = pinAuthResult;
            }

            @Override // vo3.b.InterfaceC5455b
            /* JADX INFO: renamed from: a, reason: from getter */
            public b0 getPinValue() {
                return this.pinValue;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public PinAuthResult getPinAuthResult() {
                return this.pinAuthResult;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ValidatePin)) {
                    return false;
                }
                ValidatePin validatePin = (ValidatePin) other;
                return fr.t.c(this.pinValue, validatePin.pinValue) && fr.t.c(this.pinAuthResult, validatePin.pinAuthResult);
            }

            public int hashCode() {
                return (this.pinValue.hashCode() * 31) + this.pinAuthResult.hashCode();
            }

            public String toString() {
                return "ValidatePin(pinValue=" + this.pinValue + ", pinAuthResult=" + this.pinAuthResult + ')';
            }
        }

        /* JADX INFO: renamed from: a */
        b0 getPinValue();
    }
}
