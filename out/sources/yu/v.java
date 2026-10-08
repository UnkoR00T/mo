package yu;

import java.lang.Enum;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lyu/v;", "", "T", "Lkotlinx/serialization/KSerializer;", "", "serialName", "", "values", "<init>", "(Ljava/lang/String;[Ljava/lang/Enum;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "(Ljava/lang/String;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loq/i0;", "e", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Enum;)V", "toString", "()Ljava/lang/String;", "a", "[Ljava/lang/Enum;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "overriddenDescriptor", "Loq/k;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v<T extends Enum<T>> implements KSerializer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T[] values;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private SerialDescriptor overriddenDescriptor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k descriptor;

    public v(final String str, T[] tArr) {
        this.values = tArr;
        this.descriptor = oq.l.a(new er.a() { // from class: yu.u
            @Override // er.a
            public final Object a() {
                return v.d(this.f229511a, str);
            }
        });
    }

    private final SerialDescriptor c(String serialName) {
        t tVar = new t(serialName, this.values.length);
        for (T t15 : this.values) {
            h1.g(tVar, t15.name(), false, 2, null);
        }
        return tVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor d(v vVar, String str) {
        SerialDescriptor serialDescriptor = vVar.overriddenDescriptor;
        return serialDescriptor == null ? vVar.c(str) : serialDescriptor;
    }

    @Override // uu.o
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, T value) {
        int iD0 = pq.n.D0(this.values, value);
        if (iD0 != -1) {
            encoder.g(getDescriptor(), iD0);
            return;
        }
        throw new uu.n(value + " is not a valid enum " + getDescriptor().getSerialName() + ", must be one of " + Arrays.toString(this.values));
    }

    @Override // kotlinx.serialization.KSerializer, uu.o
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.descriptor.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().getSerialName() + '>';
    }
}
