package rx1;

import dx1.EdoPinScreenData;
import fr.t;
import iy.b0;
import java.util.Arrays;
import p071kotlin.Metadata;
import sw1.EdoCanScreenData;

/* JADX INFO: renamed from: rx1.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b\u0018\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b\u001b\u0010#¨\u0006)"}, d2 = {"Lrx1/a;", "", "", "selectedFileName", "", "selectedFileBytes", "Lsw1/e;", "canScreenData", "Liy/b0;", "can", "Ldx1/e;", "pinScreenData", "pin", "<init>", "(Ljava/lang/String;[BLsw1/e;Liy/b0;Ldx1/e;Liy/b0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "[B", "c", "()[B", "Lsw1/e;", "getCanScreenData", "()Lsw1/e;", "Liy/b0;", "()Liy/b0;", "e", "Ldx1/e;", "getPinScreenData", "()Ldx1/e;", "f", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SignFileSharedData {

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

    public SignFileSharedData(String str, byte[] bArr, EdoCanScreenData edoCanScreenData, b0 b0Var, EdoPinScreenData edoPinScreenData, b0 b0Var2) {
        this.selectedFileName = str;
        this.selectedFileBytes = bArr;
        this.canScreenData = edoCanScreenData;
        this.can = b0Var;
        this.pinScreenData = edoPinScreenData;
        this.pin = b0Var2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getCan() {
        return this.can;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getPin() {
        return this.pin;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final byte[] getSelectedFileBytes() {
        return this.selectedFileBytes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSelectedFileName() {
        return this.selectedFileName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignFileSharedData)) {
            return false;
        }
        SignFileSharedData signFileSharedData = (SignFileSharedData) other;
        return t.c(this.selectedFileName, signFileSharedData.selectedFileName) && t.c(this.selectedFileBytes, signFileSharedData.selectedFileBytes) && t.c(this.canScreenData, signFileSharedData.canScreenData) && t.c(this.can, signFileSharedData.can) && t.c(this.pinScreenData, signFileSharedData.pinScreenData) && t.c(this.pin, signFileSharedData.pin);
    }

    public int hashCode() {
        return (((((((((this.selectedFileName.hashCode() * 31) + Arrays.hashCode(this.selectedFileBytes)) * 31) + this.canScreenData.hashCode()) * 31) + this.can.hashCode()) * 31) + this.pinScreenData.hashCode()) * 31) + this.pin.hashCode();
    }

    public String toString() {
        return "SignFileSharedData(selectedFileName=" + this.selectedFileName + ", selectedFileBytes=" + Arrays.toString(this.selectedFileBytes) + ", canScreenData=" + this.canScreenData + ", can=" + this.can + ", pinScreenData=" + this.pinScreenData + ", pin=" + this.pin + ')';
    }
}
