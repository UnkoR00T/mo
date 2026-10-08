package com.pl.pwpw.mobile.edoapp.edoLibrary.internals.model.dto;

import fr.t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p071kotlin.Metadata;
import yu.h1;
import yu.u1;
import yu.z;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/SignaturePayloadDto.$serializer", "Lyu/z;", "Lcom/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/SignaturePayloadDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loq/i0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/SignaturePayloadDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/SignaturePayloadDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "edoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@oq.a
public /* synthetic */ class SignaturePayloadDto$$serializer implements z<SignaturePayloadDto> {
    public static final SignaturePayloadDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SignaturePayloadDto$$serializer signaturePayloadDto$$serializer = new SignaturePayloadDto$$serializer();
        INSTANCE = signaturePayloadDto$$serializer;
        h1 h1Var = new h1("com.pl.pwpw.mobile.edoapp.edoLibrary.internals.model.dto.SignaturePayloadDto", signaturePayloadDto$$serializer, 4);
        h1Var.f("challenge", true);
        h1Var.f("certificate", true);
        h1Var.f("timestamp", true);
        h1Var.f("data", true);
        descriptor = h1Var;
    }

    private SignaturePayloadDto$$serializer() {
    }

    @Override // yu.z
    public final KSerializer<?>[] childSerializers() {
        u1 u1Var = u1.f229515a;
        return new KSerializer[]{u1Var, u1Var, u1Var, SignatureDataDto$$serializer.INSTANCE};
    }

    /* JADX INFO: renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final SignaturePayloadDto m38deserialize(Decoder decoder) {
        decoder.a(descriptor);
        throw null;
    }

    @Override // kotlinx.serialization.KSerializer, uu.o
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // uu.o
    public final void serialize(Encoder encoder, SignaturePayloadDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        xu.c cVarA = encoder.a(serialDescriptor);
        if (cVarA.y(serialDescriptor, 0) || !t.c(value.f36969a, "")) {
            cVarA.w(serialDescriptor, 0, value.f36969a);
        }
        if (cVarA.y(serialDescriptor, 1) || !t.c(value.f36970b, "")) {
            cVarA.w(serialDescriptor, 1, value.f36970b);
        }
        if (cVarA.y(serialDescriptor, 2) || !t.c(value.f36971c, "")) {
            cVarA.w(serialDescriptor, 2, value.f36971c);
        }
        if (cVarA.y(serialDescriptor, 3) || !t.c(value.f36972d, new SignatureDataDto())) {
            cVarA.i(serialDescriptor, 3, SignatureDataDto$$serializer.INSTANCE, value.f36972d);
        }
        cVarA.q(serialDescriptor);
    }

    @Override // yu.z
    public KSerializer<?>[] typeParametersSerializers() {
        return z.a.a(this);
    }
}
