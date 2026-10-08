package h3;

import java.util.List;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R%\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"Lh3/o;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "Lh3/q;", "a", "Ljava/util/List;", "()Ljava/util/List;", "autofillTypes", "Lm3/g;", "b", "Lm3/g;", "()Lm3/g;", "setBoundingBox", "(Lm3/g;)V", "boundingBox", "Lkotlin/Function1;", "", "Loq/i0;", "c", "Ler/l;", "()Ler/l;", "onFill", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
@oq.a
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<q> autofillTypes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private m3.g boundingBox;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final er.l<String, i0> onFill;

    public final List<q> a() {
        return this.autofillTypes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final m3.g getBoundingBox() {
        return this.boundingBox;
    }

    public final er.l<String, i0> c() {
        return this.onFill;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof o)) {
            return false;
        }
        o oVar = (o) other;
        return fr.t.c(this.autofillTypes, oVar.autofillTypes) && fr.t.c(this.boundingBox, oVar.boundingBox) && this.onFill == oVar.onFill;
    }

    public int hashCode() {
        int iHashCode = this.autofillTypes.hashCode() * 31;
        m3.g gVar = this.boundingBox;
        int iHashCode2 = (iHashCode + (gVar != null ? gVar.hashCode() : 0)) * 31;
        er.l<String, i0> lVar = this.onFill;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }
}
