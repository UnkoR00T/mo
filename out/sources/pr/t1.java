package pr;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0012B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lpr/t1;", "V", "Lpr/x2;", "Lmr/h;", "Lpr/g1;", "container", "Lvr/z0;", "descriptor", "<init>", "(Lpr/g1;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "Loq/k;", "Lpr/t1$a;", "s", "Loq/k;", "_setter", "t0", "()Lpr/t1$a;", "setter", "a", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t1<V> extends x2<V> implements mr.h<V> {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final oq.k<a<V>> _setter;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpr/t1$a;", "V", "Lpr/q2$d;", "Lpr/t1;", "property", "<init>", "(Lpr/t1;)V", "l", "Lpr/t1;", "k0", "()Lpr/t1;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a<V> extends q2.d<V> {

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final t1<V> property;

        public a(t1<V> t1Var) {
            this.property = t1Var;
        }

        @Override // pr.q2.a
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public t1<V> e0() {
            return this.property;
        }
    }

    public t1(g1 g1Var, vr.z0 z0Var) {
        super(g1Var, z0Var);
        this._setter = oq.l.b(oq.o.PUBLICATION, new s1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a r0(t1 t1Var) {
        return new a(t1Var);
    }

    @Override // mr.h
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public a<V> j() {
        return this._setter.getValue();
    }
}
