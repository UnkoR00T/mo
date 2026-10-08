package yu;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Encoder;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B%\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0016\u001a\u00028\u0000*\u00028\u00028$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0018\u0010\u000b\u001a\u00028\u0001*\u00028\u00028$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, d2 = {"Lyu/f0;", "K", "V", "R", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loq/i0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "a", "Lkotlinx/serialization/KSerializer;", "getKeySerializer", "()Lkotlinx/serialization/KSerializer;", "b", "getValueSerializer", "(Ljava/lang/Object;)Ljava/lang/Object;", "key", "c", "Lyu/o0;", "Lyu/a1;", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f0<K, V, R> implements KSerializer<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final KSerializer<K> keySerializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final KSerializer<V> valueSerializer;

    public /* synthetic */ f0(KSerializer kSerializer, KSerializer kSerializer2, fr.k kVar) {
        this(kSerializer, kSerializer2);
    }

    protected abstract K b(R r15);

    protected abstract V c(R r15);

    @Override // uu.o
    public void serialize(Encoder encoder, R value) {
        xu.c cVarA = encoder.a(getDescriptor());
        cVarA.i(getDescriptor(), 0, this.keySerializer, b(value));
        cVarA.i(getDescriptor(), 1, this.valueSerializer, c(value));
        cVarA.q(getDescriptor());
    }

    private f0(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        this.keySerializer = kSerializer;
        this.valueSerializer = kSerializer2;
    }
}
