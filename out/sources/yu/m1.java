package yu;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0017\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n*\u00028\u0001H\u0004¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0010H$¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lyu/m1;", "Element", "Array", "", "Builder", "Lyu/n;", "Lkotlinx/serialization/KSerializer;", "primitiveSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "", "b", "(Ljava/lang/Object;)Ljava/util/Iterator;", "Lxu/c;", "encoder", "content", "", "size", "Loq/i0;", "e", "(Lxu/c;Ljava/lang/Object;I)V", "Lkotlinx/serialization/encoding/Encoder;", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class m1<Element, Array, Builder> extends n<Element, Array, Builder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SerialDescriptor descriptor;

    public m1(KSerializer<Element> kSerializer) {
        super(kSerializer, null);
        this.descriptor = new l1(kSerializer.getDescriptor());
    }

    @Override // yu.a
    protected final Iterator<Element> b(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    protected abstract void e(xu.c encoder, Array content, int size);

    @Override // yu.n, kotlinx.serialization.KSerializer, uu.o
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // yu.n, uu.o
    public final void serialize(Encoder encoder, Array value) {
        int iC = c(value);
        SerialDescriptor serialDescriptor = this.descriptor;
        xu.c cVarF = encoder.f(serialDescriptor, iC);
        e(cVarF, value, iC);
        cVarF.q(serialDescriptor);
    }
}
