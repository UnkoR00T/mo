package pr;

import java.lang.reflect.Member;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001 B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0010J\u0017\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0013R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lpr/k2;", "T", "V", "Lmr/n;", "Lpr/q2;", "Lpr/g1;", "container", "Lvr/z0;", "descriptor", "<init>", "(Lpr/g1;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lpr/g1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "receiver", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "Loq/k;", "Lpr/k2$a;", "r", "Loq/k;", "_getter", "Ljava/lang/reflect/Member;", "s", "delegateSource", "s0", "()Lpr/k2$a;", "getter", "a", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class k2<T, V> extends q2<V> implements mr.n<T, V> {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final oq.k<a<T, V>> _getter;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final oq.k<Member> delegateSource;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lpr/k2$a;", "T", "V", "Lpr/q2$c;", "Lmr/n$a;", "Lpr/k2;", "property", "<init>", "(Lpr/k2;)V", "receiver", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "l", "Lpr/k2;", "k0", "()Lpr/k2;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a<T, V> extends q2.c<V> implements mr.n.a<T, V> {

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final k2<T, V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public a(k2<T, ? extends V> k2Var) {
            this.property = k2Var;
        }

        @Override // er.l
        public V b(T receiver) {
            return e0().get(receiver);
        }

        @Override // pr.q2.a
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public k2<T, V> e0() {
            return this.property;
        }
    }

    public k2(g1 g1Var, String str, String str2, Object obj) {
        super(g1Var, str, str2, obj);
        oq.o oVar = oq.o.PUBLICATION;
        this._getter = oq.l.b(oVar, new i2(this));
        this.delegateSource = oq.l.b(oVar, new j2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a o0(k2 k2Var) {
        return new a(k2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Member r0(k2 k2Var) {
        return k2Var.h0();
    }

    @Override // er.l
    public V b(T receiver) {
        return get(receiver);
    }

    @Override // mr.n
    public V get(T receiver) {
        return l0().v(receiver);
    }

    @Override // pr.q2
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public a<T, V> l0() {
        return this._getter.getValue();
    }

    public k2(g1 g1Var, vr.z0 z0Var) {
        super(g1Var, z0Var);
        oq.o oVar = oq.o.PUBLICATION;
        this._getter = oq.l.b(oVar, new i2(this));
        this.delegateSource = oq.l.b(oVar, new j2(this));
    }
}
