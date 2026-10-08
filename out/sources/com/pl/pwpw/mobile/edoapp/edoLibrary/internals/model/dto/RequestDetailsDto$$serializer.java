package com.pl.pwpw.mobile.edoapp.edoLibrary.internals.model.dto;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import oq.k;
import p071kotlin.Metadata;
import uu.o;
import yu.e0;
import yu.h1;
import yu.u1;
import yu.z;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/RequestDetailsDto.$serializer", "Lyu/z;", "Lcom/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/RequestDetailsDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loq/i0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/RequestDetailsDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/RequestDetailsDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "edoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@oq.a
public /* synthetic */ class RequestDetailsDto$$serializer implements z<RequestDetailsDto> {
    public static final RequestDetailsDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RequestDetailsDto$$serializer requestDetailsDto$$serializer = new RequestDetailsDto$$serializer();
        INSTANCE = requestDetailsDto$$serializer;
        h1 h1Var = new h1("com.pl.pwpw.mobile.edoapp.edoLibrary.internals.model.dto.RequestDetailsDto", requestDetailsDto$$serializer, 10);
        h1Var.f("client", true);
        h1Var.f("fields", true);
        h1Var.f("infoFromPartner", true);
        h1Var.f("requestType", false);
        h1Var.f("signInfo", true);
        h1Var.f("challenge", false);
        h1Var.f("remainingSessionTime", false);
        h1Var.f("maxSessionTime", false);
        h1Var.f("certificateType", false);
        h1Var.f("operationSecurity", false);
        descriptor = h1Var;
    }

    private RequestDetailsDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yu.z
    public final KSerializer<?>[] childSerializers() {
        k[] kVarArr = RequestDetailsDto.f36949k;
        u1 u1Var = u1.f229515a;
        e0 e0Var = e0.f229430a;
        return new KSerializer[]{vu.a.u(Client$$serializer.INSTANCE), vu.a.u(RequestDetailsFields$$serializer.INSTANCE), vu.a.u(u1Var), kVarArr[3].getValue(), vu.a.u(SignInfo$$serializer.INSTANCE), vu.a.u(u1Var), e0Var, e0Var, vu.a.u((KSerializer) kVarArr[8].getValue()), kVarArr[9].getValue()};
    }

    /* JADX INFO: renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final RequestDetailsDto m34deserialize(Decoder decoder) {
        decoder.a(descriptor);
        e eVar = RequestDetailsDto.Companion;
        throw null;
    }

    @Override // kotlinx.serialization.KSerializer, uu.o
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // uu.o
    public final void serialize(Encoder encoder, RequestDetailsDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        xu.c cVarA = encoder.a(serialDescriptor);
        k[] kVarArr = RequestDetailsDto.f36949k;
        if (cVarA.y(serialDescriptor, 0) || value.f36950a != null) {
            cVarA.z(serialDescriptor, 0, Client$$serializer.INSTANCE, value.f36950a);
        }
        if (cVarA.y(serialDescriptor, 1) || value.f36951b != null) {
            cVarA.z(serialDescriptor, 1, RequestDetailsFields$$serializer.INSTANCE, value.f36951b);
        }
        if (cVarA.y(serialDescriptor, 2) || value.f36952c != null) {
            cVarA.z(serialDescriptor, 2, u1.f229515a, value.f36952c);
        }
        cVarA.i(serialDescriptor, 3, (o) kVarArr[3].getValue(), value.f36953d);
        if (cVarA.y(serialDescriptor, 4) || value.f36954e != null) {
            cVarA.z(serialDescriptor, 4, SignInfo$$serializer.INSTANCE, value.f36954e);
        }
        cVarA.z(serialDescriptor, 5, u1.f229515a, value.f36955f);
        cVarA.t(serialDescriptor, 6, value.f36956g);
        cVarA.t(serialDescriptor, 7, value.f36957h);
        cVarA.z(serialDescriptor, 8, (o) kVarArr[8].getValue(), value.f36958i);
        cVarA.i(serialDescriptor, 9, (o) kVarArr[9].getValue(), value.f36959j);
        cVarA.q(serialDescriptor);
    }

    @Override // yu.z
    public KSerializer<?>[] typeParametersSerializers() {
        return z.a.a(this);
    }
}
