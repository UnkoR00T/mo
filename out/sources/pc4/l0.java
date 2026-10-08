package pc4;

import pl.gov.coi.common.network.deserializer.ByteArrayDeserializer;
import pl.gov.coi.common.network.deserializer.EnumTypeAdapterFactory;
import pl.gov.coi.common.network.deserializer.LocalDateDeserializer;
import pl.gov.coi.common.network.deserializer.OffsetDateTimeDeserializer;
import pl.gov.coi.common.network.serializer.LocalDateSerializer;
import pl.gov.coi.common.network.serializer.OffsetDateTimeSerializer;
import pl.gov.coi.mobywatel.be.offlinedocumentsservice.deserializer.DocumentTypeDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 implements mq.e {
    public static ay.h a(OffsetDateTimeDeserializer offsetDateTimeDeserializer, OffsetDateTimeSerializer offsetDateTimeSerializer, LocalDateDeserializer localDateDeserializer, LocalDateSerializer localDateSerializer, ByteArrayDeserializer byteArrayDeserializer, EnumTypeAdapterFactory enumTypeAdapterFactory, DocumentTypeDeserializer documentTypeDeserializer) {
        return (ay.h) mq.d.d(j.f155026a.B(offsetDateTimeDeserializer, offsetDateTimeSerializer, localDateDeserializer, localDateSerializer, byteArrayDeserializer, enumTypeAdapterFactory, documentTypeDeserializer));
    }
}
