package zu;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lzu/i;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonElement;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loq/i0;", "n", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/json/JsonElement;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements KSerializer<JsonElement> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f237674a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final SerialDescriptor descriptor = wu.j.d("kotlinx.serialization.json.JsonElement", wu.d.b.f215082a, new SerialDescriptor[0], new er.l() { // from class: zu.c
        @Override // er.l
        public final Object b(Object obj) {
            return i.h((wu.a) obj);
        }
    });

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(wu.a aVar) {
        wu.a.b(aVar, "JsonPrimitive", j.d(new er.a() { // from class: zu.d
            @Override // er.a
            public final Object a() {
                return i.i();
            }
        }), null, false, 12, null);
        wu.a.b(aVar, "JsonNull", j.d(new er.a() { // from class: zu.e
            @Override // er.a
            public final Object a() {
                return i.j();
            }
        }), null, false, 12, null);
        wu.a.b(aVar, "JsonLiteral", j.d(new er.a() { // from class: zu.f
            @Override // er.a
            public final Object a() {
                return i.k();
            }
        }), null, false, 12, null);
        wu.a.b(aVar, "JsonObject", j.d(new er.a() { // from class: zu.g
            @Override // er.a
            public final Object a() {
                return i.l();
            }
        }), null, false, 12, null);
        wu.a.b(aVar, "JsonArray", j.d(new er.a() { // from class: zu.h
            @Override // er.a
            public final Object a() {
                return i.m();
            }
        }), null, false, 12, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor i() {
        return q.f237689a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor j() {
        return n.f237682a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor k() {
        return m.f237680a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor l() {
        return p.f237684a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor m() {
        return b.f237669a.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer, uu.o
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // uu.o
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, JsonElement value) {
        j.e(encoder);
        if (value instanceof JsonPrimitive) {
            encoder.x(q.f237689a, value);
        } else if (value instanceof JsonObject) {
            encoder.x(p.f237684a, value);
        } else {
            if (!(value instanceof JsonArray)) {
                throw new oq.p();
            }
            encoder.x(b.f237669a, value);
        }
    }
}
