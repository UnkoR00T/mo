package x53;

import fr.k;
import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: x53.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lx53/a;", "", "Liy/b0;", "currentPassword", "currentPin", "<init>", "(Liy/b0;Liy/b0;)V", "a", "(Liy/b0;Liy/b0;)Lx53/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "c", "()Liy/b0;", "b", "d", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TurnOnSharedData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f216913c = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 currentPassword;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 currentPin;

    /* JADX WARN: Multi-variable type inference failed */
    public TurnOnSharedData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TurnOnSharedData b(TurnOnSharedData turnOnSharedData, b0 b0Var, b0 b0Var2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            b0Var = turnOnSharedData.currentPassword;
        }
        if ((i15 & 2) != 0) {
            b0Var2 = turnOnSharedData.currentPin;
        }
        return turnOnSharedData.a(b0Var, b0Var2);
    }

    public final TurnOnSharedData a(b0 currentPassword, b0 currentPin) {
        return new TurnOnSharedData(currentPassword, currentPin);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getCurrentPassword() {
        return this.currentPassword;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getCurrentPin() {
        return this.currentPin;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TurnOnSharedData)) {
            return false;
        }
        TurnOnSharedData turnOnSharedData = (TurnOnSharedData) other;
        return t.c(this.currentPassword, turnOnSharedData.currentPassword) && t.c(this.currentPin, turnOnSharedData.currentPin);
    }

    public int hashCode() {
        return (this.currentPassword.hashCode() * 31) + this.currentPin.hashCode();
    }

    public String toString() {
        return "TurnOnSharedData(currentPassword=" + this.currentPassword + ", currentPin=" + this.currentPin + ')';
    }

    public TurnOnSharedData(b0 b0Var, b0 b0Var2) {
        this.currentPassword = b0Var;
        this.currentPin = b0Var2;
    }

    public /* synthetic */ TurnOnSharedData(b0 b0Var, b0 b0Var2, int i15, k kVar) {
        this((i15 & 1) != 0 ? b0.INSTANCE.a() : b0Var, (i15 & 2) != 0 ? b0.INSTANCE.a() : b0Var2);
    }
}
