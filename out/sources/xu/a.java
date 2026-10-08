package xu;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import p071kotlin.Metadata;
import uu.o;
import yu.s0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b1\u00102J%\u00103\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b3\u00104J%\u00105\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0017¢\u0006\u0004\b5\u00106J%\u00107\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u001a¢\u0006\u0004\b7\u00108J%\u00109\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b9\u0010:J%\u0010;\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u001f¢\u0006\u0004\b;\u0010<J%\u0010=\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\"¢\u0006\u0004\b=\u0010>J%\u0010?\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020%¢\u0006\u0004\b?\u0010@J%\u0010A\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020(¢\u0006\u0004\bA\u0010BJ%\u0010C\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020+¢\u0006\u0004\bC\u0010DJ\u001d\u0010E\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bE\u0010FJA\u0010J\u001a\u00020\t\"\n\b\u0000\u0010G*\u0004\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000H2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\bJ\u0010KJA\u0010L\u001a\u00020\t\"\b\b\u0000\u0010G*\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000H2\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\bL\u0010K¨\u0006M"}, d2 = {"Lxu/a;", "Lkotlinx/serialization/encoding/Encoder;", "Lxu/c;", "<init>", "()V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lxu/c;", "Loq/i0;", "q", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "index", "", "G", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "", "value", i.f37087n, "(Ljava/lang/Object;)V", "o", "(Z)V", "", "e", "(B)V", "", "n", "(S)V", "B", "(I)V", "", "j", "(J)V", "", "r", "(F)V", "", "d", "(D)V", "", "s", "(C)V", "", "F", "(Ljava/lang/String;)V", "enumDescriptor", "g", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "h", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "v", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V", "m", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IB)V", "C", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IS)V", "t", "(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V", "E", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IJ)V", "p", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IF)V", ip.a.f96138c, "(Lkotlinx/serialization/descriptors/SerialDescriptor;ID)V", "k", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IC)V", "w", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Encoder;", "T", "Luu/o;", "serializer", "i", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILuu/o;Ljava/lang/Object;)V", "z", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a implements Encoder, c {
    @Override // kotlinx.serialization.encoding.Encoder
    public /* bridge */ <T> void A(o<? super T> oVar, T t15) {
        super.A(oVar, t15);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void B(int value) {
        H(Integer.valueOf(value));
    }

    @Override // xu.c
    public final void C(SerialDescriptor descriptor, int index, short value) {
        if (G(descriptor, index)) {
            n(value);
        }
    }

    @Override // xu.c
    public final void D(SerialDescriptor descriptor, int index, double value) {
        if (G(descriptor, index)) {
            d(value);
        }
    }

    @Override // xu.c
    public final void E(SerialDescriptor descriptor, int index, long value) {
        if (G(descriptor, index)) {
            j(value);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void F(String value) {
        H(value);
    }

    public boolean G(SerialDescriptor descriptor, int index) {
        return true;
    }

    public abstract void H(Object value);

    @Override // kotlinx.serialization.encoding.Encoder
    public c a(SerialDescriptor descriptor) {
        return this;
    }

    @Override // xu.c
    public final Encoder c(SerialDescriptor descriptor, int index) {
        return G(descriptor, index) ? h(descriptor.r(index)) : s0.f229501a;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void d(double value) {
        H(Double.valueOf(value));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void e(byte value) {
        H(Byte.valueOf(value));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public /* bridge */ c f(SerialDescriptor serialDescriptor, int i15) {
        return super.f(serialDescriptor, i15);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void g(SerialDescriptor enumDescriptor, int index) {
        H(Integer.valueOf(index));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder h(SerialDescriptor descriptor) {
        return this;
    }

    @Override // xu.c
    public <T> void i(SerialDescriptor descriptor, int index, o<? super T> serializer, T value) {
        if (G(descriptor, index)) {
            x(serializer, value);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void j(long value) {
        H(Long.valueOf(value));
    }

    @Override // xu.c
    public final void k(SerialDescriptor descriptor, int index, char value) {
        if (G(descriptor, index)) {
            s(value);
        }
    }

    @Override // xu.c
    public final void m(SerialDescriptor descriptor, int index, byte value) {
        if (G(descriptor, index)) {
            e(value);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void n(short value) {
        H(Short.valueOf(value));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void o(boolean value) {
        H(Boolean.valueOf(value));
    }

    @Override // xu.c
    public final void p(SerialDescriptor descriptor, int index, float value) {
        if (G(descriptor, index)) {
            r(value);
        }
    }

    @Override // xu.c
    public void q(SerialDescriptor descriptor) {
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void r(float value) {
        H(Float.valueOf(value));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void s(char value) {
        H(Character.valueOf(value));
    }

    @Override // xu.c
    public final void t(SerialDescriptor descriptor, int index, int value) {
        if (G(descriptor, index)) {
            B(value);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public /* bridge */ void u() {
        super.u();
    }

    @Override // xu.c
    public final void v(SerialDescriptor descriptor, int index, boolean value) {
        if (G(descriptor, index)) {
            o(value);
        }
    }

    @Override // xu.c
    public final void w(SerialDescriptor descriptor, int index, String value) {
        if (G(descriptor, index)) {
            F(value);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public /* bridge */ <T> void x(o<? super T> oVar, T t15) {
        super.x(oVar, t15);
    }

    @Override // xu.c
    public /* bridge */ boolean y(SerialDescriptor serialDescriptor, int i15) {
        return super.y(serialDescriptor, i15);
    }

    @Override // xu.c
    public <T> void z(SerialDescriptor descriptor, int index, o<? super T> serializer, T value) {
        if (G(descriptor, index)) {
            A(serializer, value);
        }
    }
}
