package e04;

import fr.t;
import iy.a0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: e04.c, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Le04/c;", "", "Le04/d;", "inAppStatus", "Liy/a0;", "encryptedCredential", "<init>", "(Le04/d;Liy/a0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Le04/d;", "b", "()Le04/d;", "Liy/a0;", "()Liy/a0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final d inAppStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a0 encryptedCredential;

    public BiometricData(d dVar, a0 a0Var) {
        this.inAppStatus = dVar;
        this.encryptedCredential = a0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a0 getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getInAppStatus() {
        return this.inAppStatus;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometricData)) {
            return false;
        }
        BiometricData biometricData = (BiometricData) other;
        return t.c(this.inAppStatus, biometricData.inAppStatus) && t.c(this.encryptedCredential, biometricData.encryptedCredential);
    }

    public int hashCode() {
        return (this.inAppStatus.hashCode() * 31) + this.encryptedCredential.hashCode();
    }

    public String toString() {
        return "BiometricData(inAppStatus=" + this.inAppStatus + ", encryptedCredential=" + this.encryptedCredential + ")";
    }
}
