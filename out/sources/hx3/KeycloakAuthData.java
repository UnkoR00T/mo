package hx3;

import er.l;
import fr.t;
import iy.b0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: hx3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lhx3/a;", "", "Lkotlin/Function1;", "Liy/b0;", "Loq/i0;", "onSuccess", "Lkotlin/Function0;", "onError", "<init>", "(Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/l;", "b", "()Ler/l;", "Ler/a;", "()Ler/a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class KeycloakAuthData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final l<b0, i0> onSuccess;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onError;

    /* JADX WARN: Multi-variable type inference failed */
    public KeycloakAuthData(l<? super b0, i0> lVar, er.a<i0> aVar) {
        this.onSuccess = lVar;
        this.onError = aVar;
    }

    public final er.a<i0> a() {
        return this.onError;
    }

    public final l<b0, i0> b() {
        return this.onSuccess;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeycloakAuthData)) {
            return false;
        }
        KeycloakAuthData keycloakAuthData = (KeycloakAuthData) other;
        return t.c(this.onSuccess, keycloakAuthData.onSuccess) && t.c(this.onError, keycloakAuthData.onError);
    }

    public int hashCode() {
        int iHashCode = this.onSuccess.hashCode() * 31;
        er.a<i0> aVar = this.onError;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "KeycloakAuthData(onSuccess=" + this.onSuccess + ", onError=" + this.onError + ")";
    }
}
