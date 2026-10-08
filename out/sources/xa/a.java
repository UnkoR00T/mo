package xa;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import fk.e;
import fk.l;
import fk.m;
import fk.n;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class a implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SharedPreferences f217710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final CopyOnWriteArrayList<SharedPreferences.OnSharedPreferenceChangeListener> f217711b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f217712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f217713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final fk.a f217714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final e f217715f;

    /* JADX INFO: renamed from: xa.a$a, reason: collision with other inner class name */
    private static final class SharedPreferencesEditorC5810a implements SharedPreferences.Editor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f217716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SharedPreferences.Editor f217717b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f217719d = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<String> f217718c = new CopyOnWriteArrayList();

        SharedPreferencesEditorC5810a(a aVar, SharedPreferences.Editor editor) {
            this.f217716a = aVar;
            this.f217717b = editor;
        }

        private void a() {
            if (this.f217719d.getAndSet(false)) {
                for (String str : this.f217716a.getAll().keySet()) {
                    if (!this.f217718c.contains(str) && !this.f217716a.f(str)) {
                        this.f217717b.remove(this.f217716a.c(str));
                    }
                }
            }
        }

        private void b() {
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f217716a.f217711b) {
                Iterator<String> it = this.f217718c.iterator();
                while (it.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f217716a, it.next());
                }
            }
        }

        private void c(String str, byte[] bArr) {
            if (this.f217716a.f(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.f217718c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                Pair<String, String> pairD = this.f217716a.d(str, bArr);
                this.f217717b.putString((String) pairD.first, (String) pairD.second);
            } catch (GeneralSecurityException e15) {
                throw new SecurityException("Could not encrypt data: " + e15.getMessage(), e15);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            a();
            this.f217717b.apply();
            b();
            this.f217718c.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f217719d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            a();
            try {
                return this.f217717b.commit();
            } finally {
                b();
                this.f217718c.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z15) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
            byteBufferAllocate.putInt(b.BOOLEAN.g());
            byteBufferAllocate.put(z15 ? (byte) 1 : (byte) 0);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f15) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(b.FLOAT.g());
            byteBufferAllocate.putFloat(f15);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i15) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(b.INT.g());
            byteBufferAllocate.putInt(i15);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j15) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
            byteBufferAllocate.putInt(b.LONG.g());
            byteBufferAllocate.putLong(j15);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
            byteBufferAllocate.putInt(b.STRING.g());
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bytes);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new r0.b<>();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                byte[] bytes = it.next().getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
            byteBufferAllocate.putInt(b.STRING_SET.g());
            for (byte[] bArr : arrayList) {
                byteBufferAllocate.putInt(bArr.length);
                byteBufferAllocate.put(bArr);
            }
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f217716a.f(str)) {
                this.f217717b.remove(this.f217716a.c(str));
                this.f217718c.add(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    private enum b {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f217727a;

        b(int i15) {
            this.f217727a = i15;
        }

        public static b e(int i15) {
            if (i15 == 0) {
                return STRING;
            }
            if (i15 == 1) {
                return STRING_SET;
            }
            if (i15 == 2) {
                return INT;
            }
            if (i15 == 3) {
                return LONG;
            }
            if (i15 == 4) {
                return FLOAT;
            }
            if (i15 != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int g() {
            return this.f217727a;
        }
    }

    @Deprecated
    public enum c {
        AES256_SIV("AES256_SIV");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f217730a;

        c(String str) {
            this.f217730a = str;
        }

        l e() {
            return m.a(this.f217730a);
        }
    }

    @Deprecated
    public enum d {
        AES256_GCM("AES256_GCM");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f217733a;

        d(String str) {
            this.f217733a = str;
        }

        l e() {
            return m.a(this.f217733a);
        }
    }

    a(String str, String str2, SharedPreferences sharedPreferences, fk.a aVar, e eVar) {
        this.f217712c = str;
        this.f217710a = sharedPreferences;
        this.f217713d = str2;
        this.f217714e = aVar;
        this.f217715f = eVar;
    }

    @Deprecated
    public static SharedPreferences a(String str, String str2, Context context, c cVar, d dVar) {
        lk.b.a();
        gk.a.b();
        Context applicationContext = context.getApplicationContext();
        n nVarD = new mk.a.b().l(cVar.e()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).m("android-keystore://" + str2).f().d();
        n nVarD2 = new mk.a.b().l(dVar.e()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).m("android-keystore://" + str2).f().d();
        return new a(str, str2, applicationContext.getSharedPreferences(str, 0), (fk.a) nVarD2.k(fk.a.class), (e) nVarD.k(e.class));
    }

    private Object e(String str) {
        if (f(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strC = c(str);
            String string = this.f217710a.getString(strC, null);
            if (string == null) {
                return null;
            }
            byte[] bArrA = tk.e.a(string, 0);
            fk.a aVar = this.f217714e;
            Charset charset = StandardCharsets.UTF_8;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(aVar.decrypt(bArrA, strC.getBytes(charset)));
            byteBufferWrap.position(0);
            int i15 = byteBufferWrap.getInt();
            b bVarE = b.e(i15);
            if (bVarE == null) {
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i15);
            }
            int iOrdinal = bVarE.ordinal();
            if (iOrdinal == 0) {
                int i16 = byteBufferWrap.getInt();
                ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                byteBufferWrap.limit(i16);
                String string2 = charset.decode(byteBufferSlice).toString();
                if (string2.equals("__NULL__")) {
                    return null;
                }
                return string2;
            }
            if (iOrdinal == 1) {
                r0.b bVar = new r0.b();
                while (byteBufferWrap.hasRemaining()) {
                    int i17 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                    byteBufferSlice2.limit(i17);
                    byteBufferWrap.position(byteBufferWrap.position() + i17);
                    bVar.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                }
                if (bVar.size() == 1 && "__NULL__".equals(bVar.q(0))) {
                    return null;
                }
                return bVar;
            }
            if (iOrdinal == 2) {
                return Integer.valueOf(byteBufferWrap.getInt());
            }
            if (iOrdinal == 3) {
                return Long.valueOf(byteBufferWrap.getLong());
            }
            if (iOrdinal == 4) {
                return Float.valueOf(byteBufferWrap.getFloat());
            }
            if (iOrdinal == 5) {
                return Boolean.valueOf(byteBufferWrap.get() != 0);
            }
            throw new SecurityException("Unhandled type for encrypted pref value: " + bVarE);
        } catch (GeneralSecurityException e15) {
            throw new SecurityException("Could not decrypt value. " + e15.getMessage(), e15);
        }
    }

    String b(String str) {
        try {
            String str2 = new String(this.f217715f.b(tk.e.a(str, 0), this.f217712c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e15) {
            throw new SecurityException("Could not decrypt key. " + e15.getMessage(), e15);
        }
    }

    String c(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return tk.e.d(this.f217715f.a(str.getBytes(StandardCharsets.UTF_8), this.f217712c.getBytes()));
        } catch (GeneralSecurityException e15) {
            throw new SecurityException("Could not encrypt key. " + e15.getMessage(), e15);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!f(str)) {
            return this.f217710a.contains(c(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    Pair<String, String> d(String str, byte[] bArr) {
        String strC = c(str);
        return new Pair<>(strC, tk.e.d(this.f217714e.a(bArr, strC.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC5810a(this, this.f217710a.edit());
    }

    boolean f(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f217710a.getAll().entrySet()) {
            if (!f(entry.getKey())) {
                String strB = b(entry.getKey());
                map.put(strB, e(strB));
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z15) {
        Object objE = e(str);
        return objE instanceof Boolean ? ((Boolean) objE).booleanValue() : z15;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f15) {
        Object objE = e(str);
        return objE instanceof Float ? ((Float) objE).floatValue() : f15;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i15) {
        Object objE = e(str);
        return objE instanceof Integer ? ((Integer) objE).intValue() : i15;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j15) {
        Object objE = e(str);
        return objE instanceof Long ? ((Long) objE).longValue() : j15;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object objE = e(str);
        return objE instanceof String ? (String) objE : str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Object objE = e(str);
        Set<String> bVar = objE instanceof Set ? (Set) objE : new r0.b<>();
        return bVar.size() > 0 ? bVar : set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f217711b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f217711b.remove(onSharedPreferenceChangeListener);
    }
}
