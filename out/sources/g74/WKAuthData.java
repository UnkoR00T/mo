package g74;

import fr.t;
import iy.b0;
import my.JWSTokenStructure;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: g74.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lg74/a;", "", "Liy/b0;", "encryptionKey", "encryptionKeyId", "Lmy/f;", "jwsTokenStructure", "<init>", "(Liy/b0;Liy/b0;Lmy/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "c", "Lmy/f;", "()Lmy/f;", "wk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WKAuthData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 encryptionKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 encryptionKeyId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final JWSTokenStructure jwsTokenStructure;

    public WKAuthData(b0 b0Var, b0 b0Var2, JWSTokenStructure jWSTokenStructure) {
        this.encryptionKey = b0Var;
        this.encryptionKeyId = b0Var2;
        this.jwsTokenStructure = jWSTokenStructure;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getEncryptionKey() {
        return this.encryptionKey;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getEncryptionKeyId() {
        return this.encryptionKeyId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final JWSTokenStructure getJwsTokenStructure() {
        return this.jwsTokenStructure;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WKAuthData)) {
            return false;
        }
        WKAuthData wKAuthData = (WKAuthData) other;
        return t.c(this.encryptionKey, wKAuthData.encryptionKey) && t.c(this.encryptionKeyId, wKAuthData.encryptionKeyId) && t.c(this.jwsTokenStructure, wKAuthData.jwsTokenStructure);
    }

    public int hashCode() {
        return (((this.encryptionKey.hashCode() * 31) + this.encryptionKeyId.hashCode()) * 31) + this.jwsTokenStructure.hashCode();
    }

    public String toString() {
        return "WKAuthData(encryptionKey=" + this.encryptionKey + ", encryptionKeyId=" + this.encryptionKeyId + ", jwsTokenStructure=" + this.jwsTokenStructure + ')';
    }
}
