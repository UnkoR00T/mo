package vq;

import fr.o;
import fr.q0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lvq/k;", "Lvq/d;", "Lfr/o;", "", "", "arity", "Ltq/e;", "completion", "<init>", "(ILtq/e;)V", "", "toString", "()Ljava/lang/String;", "d", "I", "p", "()I", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class k extends d implements o<Object> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int arity;

    public k(int i15, tq.e<Object> eVar) {
        super(eVar);
        this.arity = i15;
    }

    @Override // fr.o
    /* JADX INFO: renamed from: p, reason: from getter */
    public int getArity() {
        return this.arity;
    }

    @Override // vq.a
    public String toString() {
        return H() == null ? q0.l(this) : super.toString();
    }
}
