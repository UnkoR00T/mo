package yu;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u0004B1\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lyu/w1;", "A", "B", "C", "Lkotlinx/serialization/KSerializer;", "Loq/x;", "aSerializer", "bSerializer", "cSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loq/i0;", "d", "(Lkotlinx/serialization/encoding/Encoder;Loq/x;)V", "a", "Lkotlinx/serialization/KSerializer;", "b", "c", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w1<A, B, C> implements KSerializer<oq.x<? extends A, ? extends B, ? extends C>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final KSerializer<A> aSerializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final KSerializer<B> bSerializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final KSerializer<C> cSerializer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SerialDescriptor descriptor = wu.j.c("kotlin.Triple", new SerialDescriptor[0], new er.l() { // from class: yu.v1
        @Override // er.l
        public final Object b(Object obj) {
            return w1.c(this.f229522a, (wu.a) obj);
        }
    });

    public w1(KSerializer<A> kSerializer, KSerializer<B> kSerializer2, KSerializer<C> kSerializer3) {
        this.aSerializer = kSerializer;
        this.bSerializer = kSerializer2;
        this.cSerializer = kSerializer3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(w1 w1Var, wu.a aVar) {
        wu.a.b(aVar, "first", w1Var.aSerializer.getDescriptor(), null, false, 12, null);
        wu.a.b(aVar, "second", w1Var.bSerializer.getDescriptor(), null, false, 12, null);
        wu.a.b(aVar, "third", w1Var.cSerializer.getDescriptor(), null, false, 12, null);
        return oq.i0.f148189a;
    }

    @Override // uu.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, oq.x<? extends A, ? extends B, ? extends C> value) {
        xu.c cVarA = encoder.a(getDescriptor());
        cVarA.i(getDescriptor(), 0, this.aSerializer, value.d());
        cVarA.i(getDescriptor(), 1, this.bSerializer, value.e());
        cVarA.i(getDescriptor(), 2, this.cSerializer, value.f());
        cVarA.q(getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer, uu.o
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }
}
