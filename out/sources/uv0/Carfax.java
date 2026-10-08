package uv0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: uv0.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u0019\u0010 ¨\u0006!"}, d2 = {"Luv0/f;", "", "", "name", "", "Luv0/k;", "risks", "Luv0/a;", "abroadBasicData", "Luv0/b;", "error", "<init>", "(Ljava/lang/String;Ljava/util/List;Luv0/a;Luv0/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "Luv0/a;", "()Luv0/a;", "Luv0/b;", "()Luv0/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Carfax {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Risk> risks;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbroadBasicData abroadBasicData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b error;

    public Carfax(String str, List<Risk> list, AbroadBasicData abroadBasicData, b bVar) {
        this.name = str;
        this.risks = list;
        this.abroadBasicData = abroadBasicData;
        this.error = bVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbroadBasicData getAbroadBasicData() {
        return this.abroadBasicData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<Risk> d() {
        return this.risks;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Carfax)) {
            return false;
        }
        Carfax carfax = (Carfax) other;
        return fr.t.c(this.name, carfax.name) && fr.t.c(this.risks, carfax.risks) && fr.t.c(this.abroadBasicData, carfax.abroadBasicData) && fr.t.c(this.error, carfax.error);
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.risks.hashCode()) * 31;
        AbroadBasicData abroadBasicData = this.abroadBasicData;
        int iHashCode2 = (iHashCode + (abroadBasicData == null ? 0 : abroadBasicData.hashCode())) * 31;
        b bVar = this.error;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "Carfax(name=" + this.name + ", risks=" + this.risks + ", abroadBasicData=" + this.abroadBasicData + ", error=" + this.error + ")";
    }
}
