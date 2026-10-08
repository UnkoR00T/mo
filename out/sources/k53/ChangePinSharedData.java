package k53;

import fr.k;
import fr.t;
import iy.a0;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: k53.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lk53/a;", "", "Liy/a0;", "biometricResult", "Liy/b0;", "currentPin", "decryptedPassword", "<init>", "(Liy/a0;Liy/b0;Liy/b0;)V", "a", "(Liy/a0;Liy/b0;Liy/b0;)Lk53/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Liy/a0;", "c", "()Liy/a0;", "b", "Liy/b0;", "d", "()Liy/b0;", "e", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChangePinSharedData {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f108605d = b0.f97726c | a0.f97720c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a0 biometricResult;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 currentPin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 decryptedPassword;

    public ChangePinSharedData() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ChangePinSharedData b(ChangePinSharedData changePinSharedData, a0 a0Var, b0 b0Var, b0 b0Var2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            a0Var = changePinSharedData.biometricResult;
        }
        if ((i15 & 2) != 0) {
            b0Var = changePinSharedData.currentPin;
        }
        if ((i15 & 4) != 0) {
            b0Var2 = changePinSharedData.decryptedPassword;
        }
        return changePinSharedData.a(a0Var, b0Var, b0Var2);
    }

    public final ChangePinSharedData a(a0 biometricResult, b0 currentPin, b0 decryptedPassword) {
        return new ChangePinSharedData(biometricResult, currentPin, decryptedPassword);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a0 getBiometricResult() {
        return this.biometricResult;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getCurrentPin() {
        return this.currentPin;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b0 getDecryptedPassword() {
        return this.decryptedPassword;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangePinSharedData)) {
            return false;
        }
        ChangePinSharedData changePinSharedData = (ChangePinSharedData) other;
        return t.c(this.biometricResult, changePinSharedData.biometricResult) && t.c(this.currentPin, changePinSharedData.currentPin) && t.c(this.decryptedPassword, changePinSharedData.decryptedPassword);
    }

    public int hashCode() {
        int iHashCode = ((this.biometricResult.hashCode() * 31) + this.currentPin.hashCode()) * 31;
        b0 b0Var = this.decryptedPassword;
        return iHashCode + (b0Var == null ? 0 : b0Var.hashCode());
    }

    public String toString() {
        return "ChangePinSharedData(biometricResult=" + this.biometricResult + ", currentPin=" + this.currentPin + ", decryptedPassword=" + this.decryptedPassword + ')';
    }

    public ChangePinSharedData(a0 a0Var, b0 b0Var, b0 b0Var2) {
        this.biometricResult = a0Var;
        this.currentPin = b0Var;
        this.decryptedPassword = b0Var2;
    }

    public /* synthetic */ ChangePinSharedData(a0 a0Var, b0 b0Var, b0 b0Var2, int i15, k kVar) {
        this((i15 & 1) != 0 ? a0.INSTANCE.a() : a0Var, (i15 & 2) != 0 ? b0.INSTANCE.a() : b0Var, (i15 & 4) != 0 ? null : b0Var2);
    }
}
