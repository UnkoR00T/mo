package uu;

import fr.v0;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Luu/f;", "", "T", "Lyu/b;", "Lmr/c;", "baseClass", "<init>", "(Lmr/c;)V", "", "toString", "()Ljava/lang/String;", "a", "Lmr/c;", "c", "()Lmr/c;", "", "", "b", "Ljava/util/List;", "_annotations", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Loq/k;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f<T> extends yu.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mr.c<T> baseClass;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<? extends Annotation> _annotations = v.n();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k descriptor = oq.l.b(oq.o.PUBLICATION, new er.a() { // from class: uu.d
        @Override // er.a
        public final Object a() {
            return f.f(this.f201447a);
        }
    });

    public f(mr.c<T> cVar) {
        this.baseClass = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor f(final f fVar) {
        return wu.b.a(wu.j.d("kotlinx.serialization.Polymorphic", wu.d.a.f215081a, new SerialDescriptor[0], new er.l() { // from class: uu.e
            @Override // er.l
            public final Object b(Object obj) {
                return f.g(this.f201448a, (wu.a) obj);
            }
        }), fVar.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(f fVar, wu.a aVar) {
        wu.a.b(aVar, "type", vu.a.D(v0.f66418a).getDescriptor(), null, false, 12, null);
        wu.a.b(aVar, "value", wu.j.e("kotlinx.serialization.Polymorphic<" + fVar.c().D() + '>', wu.k.a.f215111a, new SerialDescriptor[0], null, 8, null), null, false, 12, null);
        aVar.h(fVar._annotations);
        return i0.f148189a;
    }

    @Override // yu.b
    public mr.c<T> c() {
        return this.baseClass;
    }

    @Override // kotlinx.serialization.KSerializer, uu.o
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.descriptor.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + c() + ')';
    }
}
