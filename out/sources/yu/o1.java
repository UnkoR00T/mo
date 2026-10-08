package yu;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u000b*\u00020\n*\b\u0012\u0004\u0012\u00028\u00000\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"(\u0010\u0012\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0013"}, d2 = {"", "serialName", "Lwu/e;", "kind", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "(Ljava/lang/String;Lwu/e;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "Loq/i0;", "c", "(Ljava/lang/String;)V", "", "T", "Lmr/c;", "Lkotlinx/serialization/KSerializer;", "b", "(Lmr/c;)Lkotlinx/serialization/KSerializer;", "", "Ljava/util/Map;", "BUILTIN_SERIALIZERS", "kotlinx-serialization-core"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<mr.c<?>, KSerializer<?>> f229481a = b1.i();

    public static final SerialDescriptor a(String str, wu.e eVar) {
        c(str);
        return new PrimitiveDescriptor(str, eVar);
    }

    public static final <T> KSerializer<T> b(mr.c<T> cVar) {
        return (KSerializer) f229481a.get(cVar);
    }

    public static final void c(String str) {
        for (KSerializer<?> kSerializer : f229481a.values()) {
            if (fr.t.c(str, kSerializer.getDescriptor().getSerialName())) {
                throw new IllegalArgumentException(fu.r.n("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exists " + fr.q0.c(kSerializer.getClass()).D() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
