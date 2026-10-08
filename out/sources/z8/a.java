package z8;

import java.util.Arrays;
import java.util.Objects;
import t7.p;
import t7.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements v.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p f233313g = new p.b().A0("application/id3").Q();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p f233314h = new p.b().A0("application/x-scte35").Q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f233315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f233316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f233317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f233318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f233319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f233320f;

    public a(String str, String str2, long j15, long j16, byte[] bArr) {
        this.f233315a = str;
        this.f233316b = str2;
        this.f233317c = j15;
        this.f233318d = j16;
        this.f233319e = bArr;
    }

    @Override // t7.v.a
    public p a() {
        String str = this.f233315a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f233314h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f233313g;
            default:
                return null;
        }
    }

    @Override // t7.v.a
    public byte[] b() {
        if (a() != null) {
            return this.f233319e;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f233317c == aVar.f233317c && this.f233318d == aVar.f233318d && Objects.equals(this.f233315a, aVar.f233315a) && Objects.equals(this.f233316b, aVar.f233316b) && Arrays.equals(this.f233319e, aVar.f233319e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f233320f == 0) {
            String str = this.f233315a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f233316b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j15 = this.f233317c;
            int i15 = (((iHashCode + iHashCode2) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31;
            long j16 = this.f233318d;
            this.f233320f = ((i15 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + Arrays.hashCode(this.f233319e);
        }
        return this.f233320f;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f233315a + ", id=" + this.f233318d + ", durationMs=" + this.f233317c + ", value=" + this.f233316b;
    }
}
