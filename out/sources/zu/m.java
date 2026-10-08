package zu;

import fu.k0;
import fu.r;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import oq.d0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lzu/m;", "Lkotlinx/serialization/KSerializer;", "Lzu/l;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loq/i0;", "b", "(Lkotlinx/serialization/encoding/Encoder;Lzu/l;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class m implements KSerializer<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f237680a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final SerialDescriptor descriptor = wu.j.b("kotlinx.serialization.json.JsonLiteral", wu.e.i.f215091a);

    private m() {
    }

    @Override // uu.o
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, l value) {
        j.e(encoder);
        if (value.getIsString()) {
            encoder.F(value.getContent());
            return;
        }
        if (value.getCoerceToInlineType() != null) {
            encoder.h(value.getCoerceToInlineType()).F(value.getContent());
            return;
        }
        Long lW = r.w(value.getContent());
        if (lW != null) {
            encoder.j(lW.longValue());
            return;
        }
        d0 d0VarC = k0.c(value.getContent());
        if (d0VarC != null) {
            encoder.h(vu.a.J(d0.INSTANCE).getDescriptor()).j(d0VarC.getData());
            return;
        }
        Double dS = r.s(value.getContent());
        if (dS != null) {
            encoder.d(dS.doubleValue());
            return;
        }
        Boolean boolT1 = r.t1(value.getContent());
        if (boolT1 != null) {
            encoder.o(boolT1.booleanValue());
        } else {
            encoder.F(value.getContent());
        }
    }

    @Override // kotlinx.serialization.KSerializer, uu.o
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }
}
