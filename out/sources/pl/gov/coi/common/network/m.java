package pl.gov.coi.common.network;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.deserializer.ByteArrayDeserializer;
import pl.gov.coi.common.network.deserializer.EnumTypeAdapterFactory;
import pl.gov.coi.common.network.deserializer.LocalDateDeserializer;
import pl.gov.coi.common.network.deserializer.OffsetDateTimeDeserializer;
import pl.gov.coi.common.network.serializer.LocalDateSerializer;
import pl.gov.coi.common.network.serializer.OffsetDateTimeSerializer;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\n \u001f*\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lpl/gov/coi/common/network/m;", "Lay/h;", "Lpl/gov/coi/common/network/deserializer/OffsetDateTimeDeserializer;", "offsetDateTimeDeserializer", "Lpl/gov/coi/common/network/serializer/OffsetDateTimeSerializer;", "offsetDateTimeSerializer", "Lpl/gov/coi/common/network/deserializer/LocalDateDeserializer;", "localDateDeserializer", "Lpl/gov/coi/common/network/serializer/LocalDateSerializer;", "localDateSerializer", "Lpl/gov/coi/common/network/deserializer/ByteArrayDeserializer;", "byteArrayDeserializer", "Lpl/gov/coi/common/network/deserializer/EnumTypeAdapterFactory;", "enumTypeAdapterFactory", "<init>", "(Lpl/gov/coi/common/network/deserializer/OffsetDateTimeDeserializer;Lpl/gov/coi/common/network/serializer/OffsetDateTimeSerializer;Lpl/gov/coi/common/network/deserializer/LocalDateDeserializer;Lpl/gov/coi/common/network/serializer/LocalDateSerializer;Lpl/gov/coi/common/network/deserializer/ByteArrayDeserializer;Lpl/gov/coi/common/network/deserializer/EnumTypeAdapterFactory;)V", "Lpl/gov/coi/common/network/o;", "e", "()Lpl/gov/coi/common/network/o;", "Ljava/lang/reflect/Type;", "type", "", "adapter", "g", "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lpl/gov/coi/common/network/o;", "factory", "f", "(Ljava/lang/Object;)Lpl/gov/coi/common/network/o;", "Lcom/google/gson/f;", "d", "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/f;", "kotlin.jvm.PlatformType", "a", "Lcom/google/gson/f;", "gson", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class m implements ay.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.google.gson.f gson;

    public m(OffsetDateTimeDeserializer offsetDateTimeDeserializer, OffsetDateTimeSerializer offsetDateTimeSerializer, LocalDateDeserializer localDateDeserializer, LocalDateSerializer localDateSerializer, ByteArrayDeserializer byteArrayDeserializer, EnumTypeAdapterFactory enumTypeAdapterFactory) {
        this.gson = new com.google.gson.g().f(enumTypeAdapterFactory).e(OffsetDateTime.class, offsetDateTimeDeserializer).e(OffsetDateTime.class, offsetDateTimeSerializer).e(LocalDate.class, localDateDeserializer).e(LocalDate.class, localDateSerializer).e(byte[].class, byteArrayDeserializer).b();
    }

    public final com.google.gson.f d(Type type, Object adapter) {
        com.google.gson.g gVarP = this.gson.p();
        gVarP.e(type, adapter);
        return gVarP.b();
    }

    @Override // ay.h
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public o b() {
        return new o(this.gson);
    }

    @Override // ay.h
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public o a(Object factory) {
        return new o(this.gson.p().f((com.google.gson.b0) factory).b());
    }

    @Override // ay.h
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public o c(Type type, Object adapter) {
        return new o(d(type, adapter));
    }
}
