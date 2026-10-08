package wg0;

import fr.t;
import javax.crypto.SecretKey;
import p071kotlin.Metadata;
import pg0.KeyParamsData;

/* JADX INFO: renamed from: wg0.l, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lwg0/l;", "", "Ljavax/crypto/SecretKey;", "passwordKey", "Lpg0/c;", "keyParams", "<init>", "(Ljavax/crypto/SecretKey;Lpg0/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljavax/crypto/SecretKey;", "b", "()Ljavax/crypto/SecretKey;", "Lpg0/c;", "()Lpg0/c;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassKeyAndParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SecretKey passwordKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final KeyParamsData keyParams;

    public PassKeyAndParams(SecretKey secretKey, KeyParamsData keyParamsData) {
        this.passwordKey = secretKey;
        this.keyParams = keyParamsData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final KeyParamsData getKeyParams() {
        return this.keyParams;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final SecretKey getPasswordKey() {
        return this.passwordKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassKeyAndParams)) {
            return false;
        }
        PassKeyAndParams passKeyAndParams = (PassKeyAndParams) other;
        return t.c(this.passwordKey, passKeyAndParams.passwordKey) && t.c(this.keyParams, passKeyAndParams.keyParams);
    }

    public int hashCode() {
        return (this.passwordKey.hashCode() * 31) + this.keyParams.hashCode();
    }

    public String toString() {
        return "PassKeyAndParams(passwordKey=" + this.passwordKey + ", keyParams=" + this.keyParams + ')';
    }
}
