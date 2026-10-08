package y2;

import java.util.Set;
import p071kotlin.Metadata;
import p076m2.u4;
import p076m2.v4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0013"}, d2 = {"Ly2/p;", "Lm2/u4;", "", "abandoning", "<init>", "(Ljava/util/Set;)V", "Loq/i0;", "c", "()V", "e", "d", "a", "Ljava/util/Set;", "Ln2/c;", "Lm2/v4;", "b", "Ln2/c;", "()Ln2/c;", "pausedRemembers", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p implements u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<u4> abandoning;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n2.c<v4> pausedRemembers = new n2.c<>(new v4[16], 0);

    public p(Set<u4> set) {
        this.abandoning = set;
    }

    public final n2.c<v4> a() {
        return this.pausedRemembers;
    }

    @Override // p076m2.u4
    public void c() {
        n2.c<v4> cVar = this.pausedRemembers;
        v4[] v4VarArr = cVar.content;
        int size = cVar.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            u4 wrapped = v4VarArr[i15].getWrapped();
            this.abandoning.remove(wrapped);
            wrapped.c();
        }
    }

    @Override // p076m2.u4
    public void d() {
    }

    @Override // p076m2.u4
    public void e() {
    }
}
