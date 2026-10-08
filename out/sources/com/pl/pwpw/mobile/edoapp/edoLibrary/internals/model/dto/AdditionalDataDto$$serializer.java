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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/AdditionalDataDto.$serializer", "Lyu/z;", "Lcom/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/AdditionalDataDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loq/i0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/AdditionalDataDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/AdditionalDataDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "edoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@oq.a
public /* synthetic */ class AdditionalDataDto$$serializer implements z<AdditionalDataDto> {
    public static final AdditionalDataDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AdditionalDataDto$$serializer additionalDataDto$$serializer = new AdditionalDataDto$$serializer();
        INSTANCE = additionalDataDto$$serializer;
        h1 h1Var = new h1("com.pl.pwpw.mobile.edoapp.edoLibrary.internals.model.dto.AdditionalDataDto", additionalDataDto$$serializer, 21);
        h1Var.f("email", true);
        h1Var.f("phoneCode", true);
        h1Var.f("phoneNumber", true);
        h1Var.f("street", true);
        h1Var.f("buildingNumber", true);
        h1Var.f("apartmentNumber", true);
        h1Var.f("code", true);
        h1Var.f("town", true);
        h1Var.f("country", true);
        h1Var.f("mailing_address_street", true);
        h1Var.f("mailing_address_buildingNumber", true);
        h1Var.f("mailing_address_apartmentNumber", true);
        h1Var.f("mailing_address_code", true);
        h1Var.f("mailing_address_city", true);
        h1Var.f("mailing_address_country", true);
        h1Var.f("address_street", true);
        h1Var.f("address_buildingNumber", true);
        h1Var.f("address_apartmentNumber", true);
        h1Var.f("address_code", true);
        h1Var.f("address_city", true);
        h1Var.f("address_country", true);
        descriptor = h1Var;
    }

    private AdditionalDataDto$$serializer() {
    }

    @Override // yu.z
    public final KSerializer<?>[] childSerializers() {
        u1 u1Var = u1.f229515a;
        return new KSerializer[]{u1Var, u1Var, u1Var, u1Var, u1Var, u1Var, u1Var, u1Var, u1Var, u1Var, u1Var, u1Var, u1Var, u1Var, u1Var, u1Var, u1Var, u1Var, u1Var, u1Var, u1Var};
    }

    /* JADX INFO: renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final AdditionalDataDto m30deserialize(Decoder decoder) {
        decoder.a(descriptor);
        throw null;
    }

    @Override // kotlinx.serialization.KSerializer, uu.o
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // uu.o
    public final void serialize(Encoder encoder, AdditionalDataDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        xu.c cVarA = encoder.a(serialDescriptor);
        if (cVarA.y(serialDescriptor, 0) || !t.c(value.f36916a, "")) {
            cVarA.w(serialDescriptor, 0, value.f36916a);
        }
        if (cVarA.y(serialDescriptor, 1) || !t.c(value.f36917b, "")) {
            cVarA.w(serialDescriptor, 1, value.f36917b);
        }
        if (cVarA.y(serialDescriptor, 2) || !t.c(value.f36918c, "")) {
            cVarA.w(serialDescriptor, 2, value.f36918c);
        }
        if (cVarA.y(serialDescriptor, 3) || !t.c(value.f36919d, "")) {
            cVarA.w(serialDescriptor, 3, value.f36919d);
        }
        if (cVarA.y(serialDescriptor, 4) || !t.c(value.f36920e, "")) {
            cVarA.w(serialDescriptor, 4, value.f36920e);
        }
        if (cVarA.y(serialDescriptor, 5) || !t.c(value.f36921f, "")) {
            cVarA.w(serialDescriptor, 5, value.f36921f);
        }
        if (cVarA.y(serialDescriptor, 6) || !t.c(value.f36922g, "")) {
            cVarA.w(serialDescriptor, 6, value.f36922g);
        }
        if (cVarA.y(serialDescriptor, 7) || !t.c(value.f36923h, "")) {
            cVarA.w(serialDescriptor, 7, value.f36923h);
        }
        if (cVarA.y(serialDescriptor, 8) || !t.c(value.f36924i, "")) {
            cVarA.w(serialDescriptor, 8, value.f36924i);
        }
        if (cVarA.y(serialDescriptor, 9) || !t.c(value.f36925j, "")) {
            cVarA.w(serialDescriptor, 9, value.f36925j);
        }
        if (cVarA.y(serialDescriptor, 10) || !t.c(value.f36926k, "")) {
            cVarA.w(serialDescriptor, 10, value.f36926k);
        }
        if (cVarA.y(serialDescriptor, 11) || !t.c(value.f36927l, "")) {
            cVarA.w(serialDescriptor, 11, value.f36927l);
        }
        if (cVarA.y(serialDescriptor, 12) || !t.c(value.f36928m, "")) {
            cVarA.w(serialDescriptor, 12, value.f36928m);
        }
        if (cVarA.y(serialDescriptor, 13) || !t.c(value.f36929n, "")) {
            cVarA.w(serialDescriptor, 13, value.f36929n);
        }
        if (cVarA.y(serialDescriptor, 14) || !t.c(value.f36930o, "")) {
            cVarA.w(serialDescriptor, 14, value.f36930o);
        }
        if (cVarA.y(serialDescriptor, 15) || !t.c(value.f36931p, "")) {
            cVarA.w(serialDescriptor, 15, value.f36931p);
        }
        if (cVarA.y(serialDescriptor, 16) || !t.c(value.f36932q, "")) {
            cVarA.w(serialDescriptor, 16, value.f36932q);
        }
        if (cVarA.y(serialDescriptor, 17) || !t.c(value.f36933r, "")) {
            cVarA.w(serialDescriptor, 17, value.f36933r);
        }
        if (cVarA.y(serialDescriptor, 18) || !t.c(value.f36934s, "")) {
            cVarA.w(serialDescriptor, 18, value.f36934s);
        }
        if (cVarA.y(serialDescriptor, 19) || !t.c(value.f36935t, "")) {
            cVarA.w(serialDescriptor, 19, value.f36935t);
        }
        if (cVarA.y(serialDescriptor, 20) || !t.c(value.f36936u, "")) {
            cVarA.w(serialDescriptor, 20, value.f36936u);
        }
        cVarA.q(serialDescriptor);
    }

    @Override // yu.z
    public KSerializer<?>[] typeParametersSerializers() {
        return z.a.a(this);
    }
}
