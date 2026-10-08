package h10;

import fr.t;
import iy.a0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: h10.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\f¨\u0006\u0016"}, d2 = {"Lh10/a;", "", "Liy/a0;", "salt", "", "iterations", "<init>", "(Liy/a0;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/a0;", "b", "()Liy/a0;", "I", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DecodedPasswordKeyData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a0 salt;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int iterations;

    public DecodedPasswordKeyData(a0 a0Var, int i15) {
        this.salt = a0Var;
        this.iterations = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIterations() {
        return this.iterations;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a0 getSalt() {
        return this.salt;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DecodedPasswordKeyData)) {
            return false;
        }
        DecodedPasswordKeyData decodedPasswordKeyData = (DecodedPasswordKeyData) other;
        return t.c(this.salt, decodedPasswordKeyData.salt) && this.iterations == decodedPasswordKeyData.iterations;
    }

    public int hashCode() {
        return (this.salt.hashCode() * 31) + Integer.hashCode(this.iterations);
    }

    public String toString() {
        return "DecodedPasswordKeyData(salt=" + this.salt + ", iterations=" + this.iterations + ')';
    }
}
