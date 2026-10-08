package pr;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001cB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lpr/n1;", "V", "Lpr/h2;", "Lmr/i;", "Lpr/g1;", "container", "Lvr/z0;", "descriptor", "<init>", "(Lpr/g1;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lpr/g1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "value", "Loq/i0;", "w0", "(Ljava/lang/Object;)V", "Loq/k;", "Lpr/n1$a;", "t", "Loq/k;", "_setter", "v0", "()Lpr/n1$a;", "setter", "a", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n1<V> extends h2<V> implements mr.i<V> {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final oq.k<a<V>> _setter;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lpr/n1$a;", "R", "Lpr/q2$d;", "Lmr/i$a;", "Lpr/n1;", "property", "<init>", "(Lpr/n1;)V", "value", "Loq/i0;", "l0", "(Ljava/lang/Object;)V", "l", "Lpr/n1;", "k0", "()Lpr/n1;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a<R> extends q2.d<R> implements mr.i.a<R> {

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final n1<R> property;

        public a(n1<R> n1Var) {
            this.property = n1Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(Object obj) throws nr.a {
            l0(obj);
            return oq.i0.f148189a;
        }

        @Override // pr.q2.a
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public n1<R> e0() {
            return this.property;
        }

        public void l0(R value) throws nr.a {
            e0().w0(value);
        }
    }

    public n1(g1 g1Var, vr.z0 z0Var) {
        super(g1Var, z0Var);
        this._setter = oq.l.b(oq.o.PUBLICATION, new m1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a t0(n1 n1Var) {
        return new a(n1Var);
    }

    @Override // mr.i, mr.h
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public a<V> j() {
        return this._setter.getValue();
    }

    public void w0(V value) throws nr.a {
        j().v(value);
    }

    public n1(g1 g1Var, String str, String str2, Object obj) {
        super(g1Var, str, str2, obj);
        this._setter = oq.l.b(oq.o.PUBLICATION, new m1(this));
    }
}
