package yu;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lyu/f2;", "Lkotlinx/serialization/KSerializer;", "Loq/i0;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "b", "(Lkotlinx/serialization/encoding/Encoder;Loq/i0;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f2 implements KSerializer<oq.i0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f2 f229439b = new f2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ y0<oq.i0> f229440a = new y0<>("kotlin.Unit", oq.i0.f148189a);

    private f2() {
    }

    @Override // uu.o
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, oq.i0 value) {
        this.f229440a.serialize(encoder, value);
    }

    @Override // kotlinx.serialization.KSerializer, uu.o
    public SerialDescriptor getDescriptor() {
        return this.f229440a.getDescriptor();
    }
}
