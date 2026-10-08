package pr;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0012B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ\u000f\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0011R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lpr/h2;", "V", "Lmr/m;", "Lpr/q2;", "Lpr/g1;", "container", "Lvr/z0;", "descriptor", "<init>", "(Lpr/g1;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lpr/g1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "get", "()Ljava/lang/Object;", "a", "Loq/k;", "Lpr/h2$a;", "r", "Loq/k;", "_getter", "s", "delegateValue", "s0", "()Lpr/h2$a;", "getter", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class h2<V> extends q2<V> implements mr.m<V> {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final oq.k<a<V>> _getter;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final oq.k<Object> delegateValue;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lpr/h2$a;", "R", "Lpr/q2$c;", "Lmr/m$a;", "Lpr/h2;", "property", "<init>", "(Lpr/h2;)V", "a", "()Ljava/lang/Object;", "l", "Lpr/h2;", "k0", "()Lpr/h2;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a<R> extends q2.c<R> implements mr.m.a<R> {

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final h2<R> property;

        /* JADX WARN: Multi-variable type inference failed */
        public a(h2<? extends R> h2Var) {
            this.property = h2Var;
        }

        @Override // er.a
        public R a() {
            return e0().get();
        }

        @Override // pr.q2.a
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public h2<R> e0() {
            return this.property;
        }
    }

    public h2(g1 g1Var, vr.z0 z0Var) {
        super(g1Var, z0Var);
        oq.o oVar = oq.o.PUBLICATION;
        this._getter = oq.l.b(oVar, new f2(this));
        this.delegateValue = oq.l.b(oVar, new g2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a o0(h2 h2Var) {
        return new a(h2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object r0(h2 h2Var) {
        return h2Var.j0(h2Var.h0(), null, null);
    }

    @Override // er.a
    public V a() {
        return get();
    }

    @Override // mr.m
    public V get() {
        return l0().v(new Object[0]);
    }

    @Override // pr.q2
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public a<V> l0() {
        return this._getter.getValue();
    }

    public h2(g1 g1Var, String str, String str2, Object obj) {
        super(g1Var, str, str2, obj);
        oq.o oVar = oq.o.PUBLICATION;
        this._getter = oq.l.b(oVar, new f2(this));
        this.delegateValue = oq.l.b(oVar, new g2(this));
    }
}
