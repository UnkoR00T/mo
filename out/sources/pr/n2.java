package pr;

import java.lang.reflect.Member;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000fJ\u001f\u0010\u0001\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0001\u0010\u0012J \u0010\u0013\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0012R,\u0010\u0018\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R&\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lpr/n2;", ip.a.f96138c, "E", "V", "Lmr/o;", "Lpr/q2;", "Lpr/g1;", "container", "Lvr/z0;", "descriptor", "<init>", "(Lpr/g1;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "(Lpr/g1;Ljava/lang/String;Ljava/lang/String;)V", "receiver1", "receiver2", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "B", "Loq/k;", "Lpr/n2$a;", "r", "Loq/k;", "_getter", "Ljava/lang/reflect/Member;", "s", "delegateSource", "s0", "()Lpr/n2$a;", "getter", "a", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class n2<D, E, V> extends q2<V> implements mr.o<D, E, V> {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final oq.k<a<D, E, V>> _getter;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final oq.k<Member> delegateSource;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00028\u00052\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u0004H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lpr/n2$a;", ip.a.f96138c, "E", "V", "Lpr/q2$c;", "Lmr/o$a;", "Lpr/n2;", "property", "<init>", "(Lpr/n2;)V", "receiver1", "receiver2", "B", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "l", "Lpr/n2;", "k0", "()Lpr/n2;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a<D, E, V> extends q2.c<V> implements mr.o.a<D, E, V> {

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final n2<D, E, V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public a(n2<D, E, ? extends V> n2Var) {
            this.property = n2Var;
        }

        @Override // er.p
        public V B(D receiver1, E receiver2) {
            return e0().D(receiver1, receiver2);
        }

        @Override // pr.q2.a
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public n2<D, E, V> e0() {
            return this.property;
        }
    }

    public n2(g1 g1Var, String str, String str2) {
        super(g1Var, str, str2, fr.f.f66389g);
        oq.o oVar = oq.o.PUBLICATION;
        this._getter = oq.l.b(oVar, new l2(this));
        this.delegateSource = oq.l.b(oVar, new m2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a o0(n2 n2Var) {
        return new a(n2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Member r0(n2 n2Var) {
        return n2Var.h0();
    }

    @Override // er.p
    public V B(D receiver1, E receiver2) {
        return D(receiver1, receiver2);
    }

    @Override // mr.o
    public V D(D receiver1, E receiver2) {
        return l0().v(receiver1, receiver2);
    }

    @Override // pr.q2
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public a<D, E, V> l0() {
        return this._getter.getValue();
    }

    public n2(g1 g1Var, vr.z0 z0Var) {
        super(g1Var, z0Var);
        oq.o oVar = oq.o.PUBLICATION;
        this._getter = oq.l.b(oVar, new l2(this));
        this.delegateSource = oq.l.b(oVar, new m2(this));
    }
}
