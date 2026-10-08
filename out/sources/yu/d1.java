package yu;

import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "seen", "goldenMask", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Loq/i0;", "a", "(IILkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class d1 {
    public static final void a(int i15, int i16, SerialDescriptor serialDescriptor) {
        ArrayList arrayList = new ArrayList();
        int i17 = (~i15) & i16;
        for (int i18 = 0; i18 < 32; i18++) {
            if ((i17 & 1) != 0) {
                arrayList.add(serialDescriptor.q(i18));
            }
            i17 >>>= 1;
        }
        throw new uu.b(arrayList, serialDescriptor.s());
    }
}
