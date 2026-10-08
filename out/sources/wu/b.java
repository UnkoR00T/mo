package wu;

import kotlinx.serialization.descriptors.SerialDescriptor;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lmr/c;", "context", "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lmr/c;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class b {
    public static final SerialDescriptor a(SerialDescriptor serialDescriptor, mr.c<?> cVar) {
        return new ContextDescriptor(serialDescriptor, cVar);
    }
}
