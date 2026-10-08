package a8;

import android.media.MediaFormat;
import android.os.Bundle;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f4259b = new b().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f4260a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, Object> f4261a;

        public c a() {
            return new c(this.f4261a);
        }

        public b b(String str) {
            this.f4261a.remove(str);
            return this;
        }

        public b c(String str, ByteBuffer byteBuffer) {
            if (byteBuffer == null) {
                this.f4261a.put(str, null);
                return this;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            byteBufferAllocate.put(byteBuffer.duplicate());
            byteBufferAllocate.flip();
            this.f4261a.put(str, byteBufferAllocate);
            return this;
        }

        public b d(String str, float f15) {
            this.f4261a.put(str, Float.valueOf(f15));
            return this;
        }

        public b e(String str, int i15) {
            this.f4261a.put(str, Integer.valueOf(i15));
            return this;
        }

        public b f(String str, long j15) {
            this.f4261a.put(str, Long.valueOf(j15));
            return this;
        }

        public b g(String str, String str2) {
            this.f4261a.put(str, str2);
            return this;
        }

        public b() {
            this.f4261a = new HashMap();
        }

        private b(c cVar) {
            this.f4261a = new HashMap(cVar.f4260a);
        }
    }

    public static b d(MediaFormat mediaFormat, Set<String> set) {
        b bVar = new b();
        for (String str : set) {
            if (mediaFormat.containsKey(str)) {
                int valueTypeForKey = mediaFormat.getValueTypeForKey(str);
                if (valueTypeForKey == 1) {
                    bVar.e(str, mediaFormat.getInteger(str));
                } else if (valueTypeForKey == 2) {
                    bVar.f(str, mediaFormat.getLong(str));
                } else if (valueTypeForKey == 3) {
                    bVar.d(str, mediaFormat.getFloat(str));
                } else if (valueTypeForKey == 4) {
                    bVar.g(str, mediaFormat.getString(str));
                } else if (valueTypeForKey == 5) {
                    bVar.c(str, mediaFormat.getByteBuffer(str));
                }
            }
        }
        return bVar;
    }

    public void b(MediaFormat mediaFormat) {
        for (Map.Entry<String, Object> entry : this.f4260a.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                mediaFormat.setString(key, null);
            } else if (value instanceof Integer) {
                mediaFormat.setInteger(key, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                mediaFormat.setLong(key, ((Long) value).longValue());
            } else if (value instanceof Float) {
                mediaFormat.setFloat(key, ((Float) value).floatValue());
            } else if (value instanceof String) {
                mediaFormat.setString(key, (String) value);
            } else if (value instanceof ByteBuffer) {
                mediaFormat.setByteBuffer(key, (ByteBuffer) value);
            }
        }
    }

    public b c() {
        return new b();
    }

    public Set<String> e() {
        return this.f4260a.keySet();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f4260a.equals(((c) obj).f4260a);
        }
        return false;
    }

    public Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Object> entry : this.f4260a.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                if (value instanceof Integer) {
                    bundle.putInt(key, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    bundle.putLong(key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    bundle.putFloat(key, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    bundle.putString(key, (String) value);
                } else if (value instanceof ByteBuffer) {
                    ByteBuffer byteBuffer = (ByteBuffer) value;
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.duplicate().get(bArr);
                    bundle.putByteArray(key, bArr);
                }
            }
        }
        return bundle;
    }

    public int hashCode() {
        return this.f4260a.hashCode();
    }

    private c(Map<String, Object> map) {
        this.f4260a = Collections.unmodifiableMap(map);
    }
}
