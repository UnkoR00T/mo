package ca;

import er.q;
import fr.q0;
import fr.t;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import oq.i0;
import p071kotlin.Metadata;
import p136y9.l1;
import uu.p;
import wu.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a=\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00050\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001ac\u0010\u0010\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\t2\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00050\u00032&\u0010\u000f\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"", "T", "route", "", "", "Ly9/l1;", "typeMap", "d", "(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "", "c", "(Lkotlinx/serialization/KSerializer;)I", "Lkotlin/Function3;", "Loq/i0;", "operation", "b", "(Lkotlinx/serialization/KSerializer;Ljava/util/Map;Ler/q;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "f", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z", "navigation-common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {
    private static final <T> void b(KSerializer<T> kSerializer, Map<String, ? extends l1<Object>> map, q<? super Integer, ? super String, ? super l1<Object>, i0> qVar) {
        int elementsCount = kSerializer.getDescriptor().getElementsCount();
        for (int i15 = 0; i15 < elementsCount; i15++) {
            String strQ = kSerializer.getDescriptor().q(i15);
            l1<Object> l1Var = map.get(strQ);
            if (l1Var == null) {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + strQ + ']').toString());
            }
            qVar.w(Integer.valueOf(i15), strQ, l1Var);
        }
    }

    public static final <T> int c(KSerializer<T> kSerializer) {
        int iHashCode = kSerializer.getDescriptor().getSerialName().hashCode();
        int elementsCount = kSerializer.getDescriptor().getElementsCount();
        for (int i15 = 0; i15 < elementsCount; i15++) {
            iHashCode = (iHashCode * 31) + kSerializer.getDescriptor().q(i15).hashCode();
        }
        return iHashCode;
    }

    public static final <T> String d(T t15, Map<String, ? extends l1<Object>> map) {
        KSerializer kSerializerB = p.b(q0.c(t15.getClass()));
        final Map<String, List<String>> mapI = new b(kSerializerB, map).I(t15);
        final a aVar = new a(kSerializerB);
        b(kSerializerB, map, new q() { // from class: ca.c
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d.e(mapI, aVar, ((Integer) obj).intValue(), (String) obj2, (l1) obj3);
            }
        });
        return aVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(Map map, a aVar, int i15, String str, l1 l1Var) {
        aVar.c(i15, str, l1Var, (List) map.get(str));
        return i0.f148189a;
    }

    public static final boolean f(SerialDescriptor serialDescriptor) {
        return t.c(serialDescriptor.getKind(), l.a.f215113a) && serialDescriptor.getIsInline() && serialDescriptor.getElementsCount() == 1;
    }
}
