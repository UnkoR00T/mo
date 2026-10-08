package pl.gov.coi.common.network.deserializer;

import com.google.gson.a0;
import com.google.gson.b0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p071kotlin.Metadata;
import px.c;
import px.f;
import zl.a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000e\"\u0004\b\u0000\u0010\t2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lpl/gov/coi/common/network/deserializer/EnumTypeAdapterFactory;", "Lcom/google/gson/b0;", "<init>", "()V", "", "className", "value", "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "T", "Lcom/google/gson/f;", "gson", "Lcom/google/gson/reflect/a;", "type", "Lcom/google/gson/a0;", "b", "(Lcom/google/gson/f;Lcom/google/gson/reflect/a;)Lcom/google/gson/a0;", "a", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EnumTypeAdapterFactory implements b0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/common/network/deserializer/EnumTypeAdapterFactory$b", "Lcom/google/gson/a0;", "Lzl/c;", "out", "value", "Loq/i0;", "d", "(Lzl/c;Ljava/lang/Object;)V", "Lzl/a;", "reader", "b", "(Lzl/a;)Ljava/lang/Object;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b<T> extends a0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map<String, T> f158100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumTypeAdapterFactory f158101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Class<T> f158102c;

        b(Map<String, T> map, EnumTypeAdapterFactory enumTypeAdapterFactory, Class<T> cls) {
            this.f158100a = map;
            this.f158101b = enumTypeAdapterFactory;
            this.f158102c = cls;
        }

        @Override // com.google.gson.a0
        public T b(a reader) throws IOException {
            if (reader.a0() == zl.b.NULL) {
                reader.O();
                T t15 = this.f158100a.get("UNKNOWN");
                f.f163100a.b(this.f158101b.c(this.f158102c.getName(), ""), c.a(this));
                return t15;
            }
            T t16 = this.f158100a.get(reader.q2());
            if (t16 != null) {
                return t16;
            }
            T t17 = this.f158100a.get("UNKNOWN");
            f.f163100a.b(this.f158101b.c(this.f158102c.getName(), ""), c.a(this));
            return t17;
        }

        @Override // com.google.gson.a0
        public void d(zl.c out, T value) throws IOException {
            if (value == null) {
                out.M();
            } else {
                out.H0(value.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c(String className, String value) {
        return "Contract has been changed on the BE side with value: " + value + " in class: " + className;
    }

    @Override // com.google.gson.b0
    public <T> a0<T> b(com.google.gson.f gson, com.google.gson.reflect.a<T> type) {
        Class<? super T> clsC = type.c();
        if (!clsC.isEnum()) {
            return null;
        }
        HashMap map = new HashMap();
        Object[] enumConstants = clsC.getEnumConstants();
        if (enumConstants == null) {
            return null;
        }
        for (Object obj : enumConstants) {
            map.put(String.valueOf(obj), obj);
        }
        return new b(map, this, clsC);
    }
}
