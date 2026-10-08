package pr;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lpr/x2;", "V", "Lpr/q2;", "Lpr/g1;", "container", "Lvr/z0;", "descriptor", "<init>", "(Lpr/g1;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "Loq/k;", "Lpr/x2$a;", "r", "Loq/k;", "_getter", "q0", "()Lpr/x2$a;", "getter", "a", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class x2<V> extends q2<V> {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final oq.k<a<V>> _getter;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpr/x2$a;", "V", "Lpr/q2$c;", "Lpr/x2;", "property", "<init>", "(Lpr/x2;)V", "l", "Lpr/x2;", "k0", "()Lpr/x2;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a<V> extends q2.c<V> {

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final x2<V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public a(x2<? extends V> x2Var) {
            this.property = x2Var;
        }

        @Override // pr.q2.a
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public x2<V> e0() {
            return this.property;
        }
    }

    public x2(g1 g1Var, vr.z0 z0Var) {
        super(g1Var, z0Var);
        this._getter = oq.l.b(oq.o.PUBLICATION, new w2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a o0(x2 x2Var) {
        return new a(x2Var);
    }

    @Override // pr.q2
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a<V> l0() {
        return this._getter.getValue();
    }
}
