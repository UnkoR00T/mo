package ny;

import fr.k;
import iy.b0;
import my.e;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ny.b, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lny/b;", "", "Lmy/e;", "jwsToken", "Lny/a;", "jwseToken", "<init>", "(Liy/b0;Liy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JWSETokenPair {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 jwsToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 jwseToken;

    public /* synthetic */ JWSETokenPair(b0 b0Var, b0 b0Var2, k kVar) {
        this(b0Var, b0Var2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getJwsToken() {
        return this.jwsToken;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getJwseToken() {
        return this.jwseToken;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JWSETokenPair)) {
            return false;
        }
        JWSETokenPair jWSETokenPair = (JWSETokenPair) other;
        return e.b(this.jwsToken, jWSETokenPair.jwsToken) && a.d(this.jwseToken, jWSETokenPair.jwseToken);
    }

    public int hashCode() {
        return (e.c(this.jwsToken) * 31) + a.e(this.jwseToken);
    }

    public String toString() {
        return "JWSETokenPair(jwsToken=" + e.d(this.jwsToken) + ", jwseToken=" + a.f(this.jwseToken) + ")";
    }

    private JWSETokenPair(b0 b0Var, b0 b0Var2) {
        this.jwsToken = b0Var;
        this.jwseToken = b0Var2;
    }
}
