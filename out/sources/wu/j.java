package wu;

import fr.t;
import fu.r;
import kotlinx.serialization.descriptors.SerialDescriptor;
import oq.i0;
import p071kotlin.Metadata;
import pq.n;
import yu.o1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\r\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001aI\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000f2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "serialName", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeParameters", "Lkotlin/Function1;", "Lwu/a;", "Loq/i0;", "builderAction", "c", "(Ljava/lang/String;[Lkotlinx/serialization/descriptors/SerialDescriptor;Ler/l;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lwu/e;", "kind", "b", "(Ljava/lang/String;Lwu/e;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lwu/k;", "builder", "d", "(Ljava/lang/String;Lwu/k;[Lkotlinx/serialization/descriptors/SerialDescriptor;Ler/l;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class j {
    public static final SerialDescriptor b(String str, e eVar) {
        if (r.t0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return o1.a(str, eVar);
    }

    public static final SerialDescriptor c(String str, SerialDescriptor[] serialDescriptorArr, er.l<? super a, i0> lVar) {
        if (r.t0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        a aVar = new a(str);
        lVar.b(aVar);
        return new g(str, l.a.f215113a, aVar.f().size(), n.n1(serialDescriptorArr), aVar);
    }

    public static final SerialDescriptor d(String str, k kVar, SerialDescriptor[] serialDescriptorArr, er.l<? super a, i0> lVar) {
        if (r.t0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (t.c(kVar, l.a.f215113a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        a aVar = new a(str);
        lVar.b(aVar);
        return new g(str, kVar, aVar.f().size(), n.n1(serialDescriptorArr), aVar);
    }

    public static /* synthetic */ SerialDescriptor e(String str, k kVar, SerialDescriptor[] serialDescriptorArr, er.l lVar, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            lVar = new er.l() { // from class: wu.i
                @Override // er.l
                public final Object b(Object obj2) {
                    return j.f((a) obj2);
                }
            };
        }
        return d(str, kVar, serialDescriptorArr, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(a aVar) {
        return i0.f148189a;
    }
}
