package yu;

import java.util.Arrays;
import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "typeParams", "", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;[Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/lang/String;", "kotlinx-serialization-core"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class j1 {
    public static final int b(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        int iHashCode = (serialDescriptor.getSerialName().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        Iterable<SerialDescriptor> iterableA = wu.h.a(serialDescriptor);
        Iterator<SerialDescriptor> it = iterableA.iterator();
        int iHashCode2 = 1;
        int i15 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i16 = i15 * 31;
            String serialName = it.next().getSerialName();
            if (serialName != null) {
                iHashCode3 = serialName.hashCode();
            }
            i15 = i16 + iHashCode3;
        }
        Iterator<SerialDescriptor> it4 = iterableA.iterator();
        while (it4.hasNext()) {
            int i17 = iHashCode2 * 31;
            wu.k kind = it4.next().getKind();
            iHashCode2 = i17 + (kind != null ? kind.hashCode() : 0);
        }
        return (((iHashCode * 31) + i15) * 31) + iHashCode2;
    }

    public static final String c(final SerialDescriptor serialDescriptor) {
        return pq.v.v0(lr.m.w(0, serialDescriptor.getElementsCount()), ", ", serialDescriptor.getSerialName() + '(', ")", 0, null, new er.l() { // from class: yu.i1
            @Override // er.l
            public final Object b(Object obj) {
                return j1.d(serialDescriptor, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence d(SerialDescriptor serialDescriptor, int i15) {
        return serialDescriptor.q(i15) + ": " + serialDescriptor.r(i15).getSerialName();
    }
}
