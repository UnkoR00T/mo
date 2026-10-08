package kotlinx.serialization.encoding;

import kotlinx.serialization.descriptors.SerialDescriptor;
import p071kotlin.Metadata;
import uu.o;
import xu.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0013H&¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\"H&¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010'\u001a\u00020\"H&¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020*2\u0006\u0010'\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0004\b.\u0010/J1\u00103\u001a\u00020\u0002\"\n\b\u0000\u00100*\u0004\u0018\u00010\u00012\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u0000012\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u00104J1\u00105\u001a\u00020\u0002\"\b\b\u0000\u00100*\u00020\u00012\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u0000012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b5\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:À\u0006\u0003"}, d2 = {"Lkotlinx/serialization/encoding/Encoder;", "", "Loq/i0;", "u", "()V", "l", "", "value", "o", "(Z)V", "", "e", "(B)V", "", "n", "(S)V", "", "s", "(C)V", "", "B", "(I)V", "", "j", "(J)V", "", "r", "(F)V", "", "d", "(D)V", "", "F", "(Ljava/lang/String;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "index", "g", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "descriptor", "h", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "Lxu/c;", "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lxu/c;", "collectionSize", "f", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lxu/c;", "T", "Luu/o;", "serializer", "x", "(Luu/o;Ljava/lang/Object;)V", "A", "Lbv/c;", "b", "()Lbv/c;", "serializersModule", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface Encoder {
    default <T> void A(o<? super T> serializer, T value) {
        if (serializer.getDescriptor().o()) {
            x(serializer, value);
        } else if (value == null) {
            l();
        } else {
            u();
            x(serializer, value);
        }
    }

    void B(int value);

    void F(String value);

    c a(SerialDescriptor descriptor);

    bv.c b();

    void d(double value);

    void e(byte value);

    default c f(SerialDescriptor descriptor, int collectionSize) {
        return a(descriptor);
    }

    void g(SerialDescriptor enumDescriptor, int index);

    Encoder h(SerialDescriptor descriptor);

    void j(long value);

    void l();

    void n(short value);

    void o(boolean value);

    void r(float value);

    void s(char value);

    default void u() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    default <T> void x(o<? super T> serializer, T value) {
        serializer.serialize(this, value);
    }
}
