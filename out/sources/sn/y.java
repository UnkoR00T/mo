package sn;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f182571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f182572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f182573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f182574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.c f182575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s f182576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final jo.b f182577g;

    public enum a {
        JSON,
        STRING,
        BYTE_ARRAY,
        BASE64URL,
        JWS_OBJECT,
        SIGNED_JWT
    }

    public y(Map<String, Object> map) {
        Map<String, Object> mapL = io.k.l();
        this.f182572b = mapL;
        Objects.requireNonNull(map, "The JSON object must not be null");
        mapL.putAll(map);
        this.f182573c = null;
        this.f182574d = null;
        this.f182575e = null;
        this.f182576f = null;
        this.f182577g = null;
        this.f182571a = a.JSON;
    }

    private static String a(byte[] bArr) {
        if (bArr != null) {
            return new String(bArr, io.m.f93605a);
        }
        return null;
    }

    private static byte[] b(String str) {
        if (str != null) {
            return str.getBytes(io.m.f93605a);
        }
        return null;
    }

    public io.c c() {
        io.c cVar = this.f182575e;
        return cVar != null ? cVar : io.c.h(d());
    }

    public byte[] d() {
        byte[] bArr = this.f182574d;
        if (bArr != null) {
            return bArr;
        }
        io.c cVar = this.f182575e;
        return cVar != null ? cVar.a() : b(toString());
    }

    public <T> T e(z<T> zVar) {
        return zVar.a(this);
    }

    public String toString() {
        String str = this.f182573c;
        if (str != null) {
            return str;
        }
        s sVar = this.f182576f;
        if (sVar != null) {
            return sVar.a() != null ? this.f182576f.a() : this.f182576f.o();
        }
        Map<String, Object> map = this.f182572b;
        if (map != null) {
            return io.k.o(map);
        }
        byte[] bArr = this.f182574d;
        if (bArr != null) {
            return a(bArr);
        }
        io.c cVar = this.f182575e;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    public y(String str) {
        this.f182572b = null;
        Objects.requireNonNull(str, "The string must not be null");
        this.f182573c = str;
        this.f182574d = null;
        this.f182575e = null;
        this.f182576f = null;
        this.f182577g = null;
        this.f182571a = a.STRING;
    }

    public y(byte[] bArr) {
        this.f182572b = null;
        this.f182573c = null;
        Objects.requireNonNull(bArr, "The byte array must not be null");
        this.f182574d = bArr;
        this.f182575e = null;
        this.f182576f = null;
        this.f182577g = null;
        this.f182571a = a.BYTE_ARRAY;
    }

    public y(io.c cVar) {
        this.f182572b = null;
        this.f182573c = null;
        this.f182574d = null;
        Objects.requireNonNull(cVar, "The Base64URL-encoded object must not be null");
        this.f182575e = cVar;
        this.f182576f = null;
        this.f182577g = null;
        this.f182571a = a.BASE64URL;
    }

    public y(s sVar) {
        if (sVar.m() != s.b.UNSIGNED) {
            this.f182572b = null;
            this.f182573c = null;
            this.f182574d = null;
            this.f182575e = null;
            this.f182576f = sVar;
            this.f182577g = null;
            this.f182571a = a.JWS_OBJECT;
            return;
        }
        throw new IllegalArgumentException("The JWS object must be signed");
    }
}
