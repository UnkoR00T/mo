package pg0;

import fr.t;
import iy.a0;
import javax.crypto.SecretKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: pg0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lpg0/a;", "", "Liy/a0;", "wrappedMasterKey", "Lpg0/c;", "keyParams", "Ljavax/crypto/SecretKey;", "deviceKey", "<init>", "(Liy/a0;Lpg0/c;Ljavax/crypto/SecretKey;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/a0;", "c", "()Liy/a0;", "b", "Lpg0/c;", "()Lpg0/c;", "Ljavax/crypto/SecretKey;", "()Ljavax/crypto/SecretKey;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DecryptedUserKeyData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a0 wrappedMasterKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final KeyParamsData keyParams;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final SecretKey deviceKey;

    public DecryptedUserKeyData(a0 a0Var, KeyParamsData keyParamsData, SecretKey secretKey) {
        this.wrappedMasterKey = a0Var;
        this.keyParams = keyParamsData;
        this.deviceKey = secretKey;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final SecretKey getDeviceKey() {
        return this.deviceKey;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final KeyParamsData getKeyParams() {
        return this.keyParams;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a0 getWrappedMasterKey() {
        return this.wrappedMasterKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DecryptedUserKeyData)) {
            return false;
        }
        DecryptedUserKeyData decryptedUserKeyData = (DecryptedUserKeyData) other;
        return t.c(this.wrappedMasterKey, decryptedUserKeyData.wrappedMasterKey) && t.c(this.keyParams, decryptedUserKeyData.keyParams) && t.c(this.deviceKey, decryptedUserKeyData.deviceKey);
    }

    public int hashCode() {
        return (((this.wrappedMasterKey.hashCode() * 31) + this.keyParams.hashCode()) * 31) + this.deviceKey.hashCode();
    }

    public String toString() {
        return "DecryptedUserKeyData(wrappedMasterKey=" + this.wrappedMasterKey + ", keyParams=" + this.keyParams + ", deviceKey=" + this.deviceKey + ")";
    }
}
