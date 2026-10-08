package yu;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B#\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0014\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"Lyu/a1;", "K", "V", "Lyu/f0;", "Loq/r;", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "f", "(Loq/r;)Ljava/lang/Object;", "key", "g", "value", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a1<K, V> extends f0<K, V, oq.r<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SerialDescriptor descriptor;

    public a1(final KSerializer<K> kSerializer, final KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, null);
        this.descriptor = wu.j.c("kotlin.Pair", new SerialDescriptor[0], new er.l() { // from class: yu.z0
            @Override // er.l
            public final Object b(Object obj) {
                return a1.e(kSerializer, kSerializer2, (wu.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(KSerializer kSerializer, KSerializer kSerializer2, wu.a aVar) {
        wu.a.b(aVar, "first", kSerializer.getDescriptor(), null, false, 12, null);
        wu.a.b(aVar, "second", kSerializer2.getDescriptor(), null, false, 12, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yu.f0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public K b(oq.r<? extends K, ? extends V> rVar) {
        return rVar.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yu.f0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public V c(oq.r<? extends K, ? extends V> rVar) {
        return rVar.d();
    }

    @Override // kotlinx.serialization.KSerializer, uu.o
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }
}
