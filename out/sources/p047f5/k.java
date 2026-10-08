package p047f5;

import er.l;
import fr.t;
import oq.i0;
import p036e4.h0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lf5/k;", "Le4/h0;", "Lf5/f;", "ref", "Lkotlin/Function1;", "Lf5/e;", "Loq/i0;", "constrain", "<init>", "(Lf5/f;Ler/l;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lf5/f;", "b", "()Lf5/f;", "Ler/l;", "()Ler/l;", "c", "Ljava/lang/Object;", "J1", "()Ljava/lang/Object;", "layoutId", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class k implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f ref;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<e, i0> constrain;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object layoutId;

    /* JADX WARN: Multi-variable type inference failed */
    public k(f fVar, l<? super e, i0> lVar) {
        this.ref = fVar;
        this.constrain = lVar;
        this.layoutId = fVar.getId();
    }

    @Override // p036e4.h0
    /* JADX INFO: renamed from: J1, reason: from getter */
    public Object getLayoutId() {
        return this.layoutId;
    }

    public final l<e, i0> a() {
        return this.constrain;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getRef() {
        return this.ref;
    }

    public boolean equals(Object other) {
        if (!(other instanceof k)) {
            return false;
        }
        k kVar = (k) other;
        return t.c(this.ref.getId(), kVar.ref.getId()) && this.constrain == kVar.constrain;
    }

    public int hashCode() {
        return (this.ref.getId().hashCode() * 31) + this.constrain.hashCode();
    }
}
