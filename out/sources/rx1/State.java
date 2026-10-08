package rx1;

import dx1.EdoPinScreenData;
import fr.t;
import iy.b0;
import java.util.Arrays;
import p071kotlin.Metadata;
import sw1.EdoCanScreenData;

/* JADX INFO: renamed from: rx1.f, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJL\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b \u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b&\u0010%¨\u0006*"}, d2 = {"Lrx1/f;", "", "", "selectedFileName", "", "selectedFileBytes", "Lsw1/e;", "canScreenData", "Liy/b0;", "can", "Ldx1/e;", "pinScreenData", "pin", "<init>", "(Ljava/lang/String;[BLsw1/e;Liy/b0;Ldx1/e;Liy/b0;)V", "a", "(Ljava/lang/String;[BLsw1/e;Liy/b0;Ldx1/e;Liy/b0;)Lrx1/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "h", "b", "[B", "g", "()[B", "c", "Lsw1/e;", "d", "()Lsw1/e;", "Liy/b0;", "()Liy/b0;", "e", "Ldx1/e;", "f", "()Ldx1/e;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectedFileName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] selectedFileBytes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final EdoCanScreenData canScreenData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 can;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final EdoPinScreenData pinScreenData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 pin;

    public State(String str, byte[] bArr, EdoCanScreenData edoCanScreenData, b0 b0Var, EdoPinScreenData edoPinScreenData, b0 b0Var2) {
        this.selectedFileName = str;
        this.selectedFileBytes = bArr;
        this.canScreenData = edoCanScreenData;
        this.can = b0Var;
        this.pinScreenData = edoPinScreenData;
        this.pin = b0Var2;
    }

    public static /* synthetic */ State b(State state, String str, byte[] bArr, EdoCanScreenData edoCanScreenData, b0 b0Var, EdoPinScreenData edoPinScreenData, b0 b0Var2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = state.selectedFileName;
        }
        if ((i15 & 2) != 0) {
            bArr = state.selectedFileBytes;
        }
        if ((i15 & 4) != 0) {
            edoCanScreenData = state.canScreenData;
        }
        if ((i15 & 8) != 0) {
            b0Var = state.can;
        }
        if ((i15 & 16) != 0) {
            edoPinScreenData = state.pinScreenData;
        }
        if ((i15 & 32) != 0) {
            b0Var2 = state.pin;
        }
        EdoPinScreenData edoPinScreenData2 = edoPinScreenData;
        b0 b0Var3 = b0Var2;
        return state.a(str, bArr, edoCanScreenData, b0Var, edoPinScreenData2, b0Var3);
    }

    public final State a(String selectedFileName, byte[] selectedFileBytes, EdoCanScreenData canScreenData, b0 can, EdoPinScreenData pinScreenData, b0 pin) {
        return new State(selectedFileName, selectedFileBytes, canScreenData, can, pinScreenData, pin);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getCan() {
        return this.can;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EdoCanScreenData getCanScreenData() {
        return this.canScreenData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b0 getPin() {
        return this.pin;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return t.c(this.selectedFileName, state.selectedFileName) && t.c(this.selectedFileBytes, state.selectedFileBytes) && t.c(this.canScreenData, state.canScreenData) && t.c(this.can, state.can) && t.c(this.pinScreenData, state.pinScreenData) && t.c(this.pin, state.pin);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EdoPinScreenData getPinScreenData() {
        return this.pinScreenData;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final byte[] getSelectedFileBytes() {
        return this.selectedFileBytes;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSelectedFileName() {
        return this.selectedFileName;
    }

    public int hashCode() {
        return (((((((((this.selectedFileName.hashCode() * 31) + Arrays.hashCode(this.selectedFileBytes)) * 31) + this.canScreenData.hashCode()) * 31) + this.can.hashCode()) * 31) + this.pinScreenData.hashCode()) * 31) + this.pin.hashCode();
    }

    public String toString() {
        return "State(selectedFileName=" + this.selectedFileName + ", selectedFileBytes=" + Arrays.toString(this.selectedFileBytes) + ", canScreenData=" + this.canScreenData + ", can=" + this.can + ", pinScreenData=" + this.pinScreenData + ", pin=" + this.pin + ')';
    }

    public /* synthetic */ State(String str, byte[] bArr, EdoCanScreenData edoCanScreenData, b0 b0Var, EdoPinScreenData edoPinScreenData, b0 b0Var2, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? new byte[]{0} : bArr, edoCanScreenData, (i15 & 8) != 0 ? b0.INSTANCE.a() : b0Var, edoPinScreenData, (i15 & 32) != 0 ? b0.INSTANCE.a() : b0Var2);
    }
}
