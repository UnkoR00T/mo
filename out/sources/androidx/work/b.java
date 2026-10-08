package androidx.work;

import er.l;
import fr.k;
import fr.q0;
import fr.t;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p071kotlin.Metadata;
import pq.n;
import pq.v;
import ub.f;
import ub.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0018\u001dB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0010\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0003\u0010\bJ)\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\r2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Landroidx/work/b;", "", "other", "<init>", "(Landroidx/work/b;)V", "", "", "values", "(Ljava/util/Map;)V", "T", "key", "Ljava/lang/Class;", "klass", "", "d", "(Ljava/lang/String;Ljava/lang/Class;)Z", "", "e", "()I", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "keyValueMap", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f13823c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> values;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\bJ\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/work/b$a;", "", "<init>", "()V", "", "key", "value", "e", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/b$a;", "f", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;", "Landroidx/work/b;", "data", "c", "(Landroidx/work/b;)Landroidx/work/b$a;", "", "values", "d", "(Ljava/util/Map;)Landroidx/work/b$a;", "b", "a", "()Landroidx/work/b;", "", "Ljava/util/Map;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> values = new LinkedHashMap();

        private final a e(String key, Object value) {
            this.values.put(key, value);
            return this;
        }

        public final b a() {
            b bVar = new b((Map<String, ?>) this.values);
            b.INSTANCE.e(bVar);
            return bVar;
        }

        public final a b(String key, Object value) {
            Map<String, Object> map = this.values;
            if (value == null) {
                value = null;
            } else {
                mr.c cVarC = q0.c(value.getClass());
                if (!t.c(cVarC, q0.c(Boolean.TYPE)) && !t.c(cVarC, q0.c(Byte.TYPE)) && !t.c(cVarC, q0.c(Integer.TYPE)) && !t.c(cVarC, q0.c(Long.TYPE)) && !t.c(cVarC, q0.c(Float.TYPE)) && !t.c(cVarC, q0.c(Double.TYPE)) && !t.c(cVarC, q0.c(String.class)) && !t.c(cVarC, q0.c(Boolean[].class)) && !t.c(cVarC, q0.c(Byte[].class)) && !t.c(cVarC, q0.c(Integer[].class)) && !t.c(cVarC, q0.c(Long[].class)) && !t.c(cVarC, q0.c(Float[].class)) && !t.c(cVarC, q0.c(Double[].class)) && !t.c(cVarC, q0.c(String[].class))) {
                    if (t.c(cVarC, q0.c(boolean[].class))) {
                        value = f.h((boolean[]) value);
                    } else if (t.c(cVarC, q0.c(byte[].class))) {
                        value = f.i((byte[]) value);
                    } else if (t.c(cVarC, q0.c(int[].class))) {
                        value = f.l((int[]) value);
                    } else if (t.c(cVarC, q0.c(long[].class))) {
                        value = f.m((long[]) value);
                    } else if (t.c(cVarC, q0.c(float[].class))) {
                        value = f.k((float[]) value);
                    } else {
                        if (!t.c(cVarC, q0.c(double[].class))) {
                            throw new IllegalArgumentException("Key " + key + " has invalid type " + cVarC);
                        }
                        value = f.j((double[]) value);
                    }
                }
            }
            map.put(key, value);
            return this;
        }

        public final a c(b data) {
            d(data.values);
            return this;
        }

        public final a d(Map<String, ? extends Object> values) {
            for (Map.Entry<String, ? extends Object> entry : values.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final a f(String key, String value) {
            return e(key, value);
        }
    }

    /* JADX INFO: renamed from: androidx.work.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013R\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0013R\u0014\u0010\u001f\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0013R\u0014\u0010 \u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0013R\u0014\u0010!\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0013R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010'¨\u0006)"}, d2 = {"Landroidx/work/b$b;", "", "<init>", "()V", "Landroidx/work/b;", "data", "", "e", "(Landroidx/work/b;)[B", "bytes", "a", "([B)Landroidx/work/b;", "EMPTY", "Landroidx/work/b;", "", "MAX_DATA_BYTES", "I", "", "TYPE_NULL", "B", "TYPE_BOOLEAN", "TYPE_BYTE", "TYPE_INTEGER", "TYPE_LONG", "TYPE_FLOAT", "TYPE_DOUBLE", "TYPE_STRING", "TYPE_BOOLEAN_ARRAY", "TYPE_BYTE_ARRAY", "TYPE_INTEGER_ARRAY", "TYPE_LONG_ARRAY", "TYPE_FLOAT_ARRAY", "TYPE_DOUBLE_ARRAY", "TYPE_STRING_ARRAY", "", "NULL_STRING_V1", "Ljava/lang/String;", "", "STREAM_MAGIC", ip.a.f96137b, "STREAM_VERSION", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private static final boolean b(ByteArrayInputStream byteArrayInputStream) throws IOException {
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            byte b15 = (byte) (-21267);
            boolean z15 = false;
            if (bArr[0] == ((byte) 16777132) && bArr[1] == b15) {
                z15 = true;
            }
            byteArrayInputStream.reset();
            return z15;
        }

        private static final void c(DataInputStream dataInputStream) throws IOException {
            short s15 = dataInputStream.readShort();
            if (s15 != -21521) {
                throw new IllegalStateException(("Magic number doesn't match: " + ((int) s15)).toString());
            }
            short s16 = dataInputStream.readShort();
            if (s16 == 1) {
                return;
            }
            throw new IllegalStateException(("Unsupported version number: " + ((int) s16)).toString());
        }

        private static final Object d(DataInputStream dataInputStream, byte b15) throws IOException {
            if (b15 == 0) {
                return null;
            }
            if (b15 == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b15 == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b15 == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b15 == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b15 == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b15 == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b15 == 7) {
                return dataInputStream.readUTF();
            }
            int i15 = 0;
            if (b15 == 8) {
                int i16 = dataInputStream.readInt();
                Boolean[] boolArr = new Boolean[i16];
                while (i15 < i16) {
                    boolArr[i15] = Boolean.valueOf(dataInputStream.readBoolean());
                    i15++;
                }
                return boolArr;
            }
            if (b15 == 9) {
                int i17 = dataInputStream.readInt();
                Byte[] bArr = new Byte[i17];
                while (i15 < i17) {
                    bArr[i15] = Byte.valueOf(dataInputStream.readByte());
                    i15++;
                }
                return bArr;
            }
            if (b15 == 10) {
                int i18 = dataInputStream.readInt();
                Integer[] numArr = new Integer[i18];
                while (i15 < i18) {
                    numArr[i15] = Integer.valueOf(dataInputStream.readInt());
                    i15++;
                }
                return numArr;
            }
            if (b15 == 11) {
                int i19 = dataInputStream.readInt();
                Long[] lArr = new Long[i19];
                while (i15 < i19) {
                    lArr[i15] = Long.valueOf(dataInputStream.readLong());
                    i15++;
                }
                return lArr;
            }
            if (b15 == 12) {
                int i25 = dataInputStream.readInt();
                Float[] fArr = new Float[i25];
                while (i15 < i25) {
                    fArr[i15] = Float.valueOf(dataInputStream.readFloat());
                    i15++;
                }
                return fArr;
            }
            if (b15 == 13) {
                int i26 = dataInputStream.readInt();
                Double[] dArr = new Double[i26];
                while (i15 < i26) {
                    dArr[i15] = Double.valueOf(dataInputStream.readDouble());
                    i15++;
                }
                return dArr;
            }
            if (b15 != 14) {
                throw new IllegalStateException("Unsupported type " + ((int) b15));
            }
            int i27 = dataInputStream.readInt();
            String[] strArr = new String[i27];
            while (i15 < i27) {
                String utf = dataInputStream.readUTF();
                if (t.c(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    utf = null;
                }
                strArr[i15] = utf;
                i15++;
            }
            return strArr;
        }

        private static final void f(DataOutputStream dataOutputStream, Object[] objArr) throws IOException {
            int i15;
            mr.c cVarC = q0.c(objArr.getClass());
            if (t.c(cVarC, q0.c(Boolean[].class))) {
                i15 = 8;
            } else if (t.c(cVarC, q0.c(Byte[].class))) {
                i15 = 9;
            } else if (t.c(cVarC, q0.c(Integer[].class))) {
                i15 = 10;
            } else if (t.c(cVarC, q0.c(Long[].class))) {
                i15 = 11;
            } else if (t.c(cVarC, q0.c(Float[].class))) {
                i15 = 12;
            } else if (t.c(cVarC, q0.c(Double[].class))) {
                i15 = 13;
            } else {
                if (!t.c(cVarC, q0.c(String[].class))) {
                    throw new IllegalArgumentException("Unsupported value type " + q0.c(objArr.getClass()).C());
                }
                i15 = 14;
            }
            dataOutputStream.writeByte(i15);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj : objArr) {
                if (i15 == 8) {
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i15 == 9) {
                    Byte b15 = obj instanceof Byte ? (Byte) obj : null;
                    dataOutputStream.writeByte(b15 != null ? b15.byteValue() : (byte) 0);
                } else if (i15 == 10) {
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i15 == 11) {
                    Long l15 = obj instanceof Long ? (Long) obj : null;
                    dataOutputStream.writeLong(l15 != null ? l15.longValue() : 0L);
                } else if (i15 == 12) {
                    Float f15 = obj instanceof Float ? (Float) obj : null;
                    dataOutputStream.writeFloat(f15 != null ? f15.floatValue() : 0.0f);
                } else if (i15 == 13) {
                    Double d15 = obj instanceof Double ? (Double) obj : null;
                    dataOutputStream.writeDouble(d15 != null ? d15.doubleValue() : 0.0d);
                } else if (i15 == 14) {
                    String str = obj instanceof String ? (String) obj : null;
                    if (str == null) {
                        str = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str);
                }
            }
        }

        private static final void g(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalArgumentException("Unsupported value type " + q0.c(obj.getClass()).D());
                }
                f(dataOutputStream, (Object[]) obj);
            }
            dataOutputStream.writeUTF(str);
        }

        private static final void h(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
        }

        public final b a(byte[] bytes) {
            if (bytes.length > 10240) {
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            }
            if (bytes.length == 0) {
                return b.f13823c;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                int i15 = 0;
                if (b(byteArrayInputStream)) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int i16 = objectInputStream.readInt();
                        while (i15 < i16) {
                            linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            i15++;
                        }
                        ar.b.a(objectInputStream, null);
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            ar.b.a(objectInputStream, th4);
                            throw th5;
                        }
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        c(dataInputStream);
                        int i17 = dataInputStream.readInt();
                        while (i15 < i17) {
                            linkedHashMap.put(dataInputStream.readUTF(), d(dataInputStream, dataInputStream.readByte()));
                            i15++;
                        }
                        ar.b.a(dataInputStream, null);
                    } catch (Throwable th6) {
                        try {
                            throw th6;
                        } catch (Throwable th7) {
                            ar.b.a(dataInputStream, th6);
                            throw th7;
                        }
                    }
                }
            } catch (IOException e15) {
                w.e().d(f.f197101a, "Error in Data#fromByteArray: ", e15);
            } catch (ClassNotFoundException e16) {
                w.e().d(f.f197101a, "Error in Data#fromByteArray: ", e16);
            }
            return new b(linkedHashMap);
        }

        public final byte[] e(b data) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    h(dataOutputStream);
                    dataOutputStream.writeInt(data.e());
                    for (Map.Entry entry : data.values.entrySet()) {
                        g(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    ar.b.a(dataOutputStream, null);
                    return byteArray;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        ar.b.a(dataOutputStream, th4);
                        throw th5;
                    }
                }
            } catch (IOException e15) {
                w.e().d(f.f197101a, "Error in Data#toByteArray: ", e15);
                return new byte[0];
            }
        }

        private Companion() {
        }
    }

    public b(b bVar) {
        this.values = new HashMap(bVar.values);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence f(Map.Entry entry) {
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str);
        sb5.append(" : ");
        if (value instanceof Object[]) {
            value = Arrays.toString((Object[]) value);
        }
        sb5.append(value);
        return sb5.toString();
    }

    public final Map<String, Object> c() {
        return Collections.unmodifiableMap(this.values);
    }

    public final <T> boolean d(String key, Class<T> klass) {
        Object obj = this.values.get(key);
        return obj != null && klass.isAssignableFrom(obj.getClass());
    }

    public final int e() {
        return this.values.size();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    public boolean equals(Object other) {
        boolean zC;
        if (this == other) {
            return true;
        }
        if (other == null || !t.c(b.class, other.getClass())) {
            return false;
        }
        b bVar = (b) other;
        Set<String> setKeySet = this.values.keySet();
        if (!t.c(setKeySet, bVar.values.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj = this.values.get(str);
            Object obj2 = bVar.values.get(str);
            if (obj == null || obj2 == null) {
                zC = obj == obj2;
            } else if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (obj2 instanceof Object[]) {
                    zC = n.d(objArr, (Object[]) obj2);
                } else {
                    zC = t.c(obj, obj2);
                }
            } else {
                zC = t.c(obj, obj2);
            }
            if (!zC) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = 0;
        for (Map.Entry<String, Object> entry : this.values.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ n.b((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public String toString() {
        return "Data {" + v.v0(this.values.entrySet(), null, null, null, 0, null, new l() { // from class: ub.e
            @Override // er.l
            public final Object b(Object obj) {
                return androidx.work.b.f((Map.Entry) obj);
            }
        }, 31, null) + "}";
    }

    public b(Map<String, ?> map) {
        this.values = new HashMap(map);
    }
}
