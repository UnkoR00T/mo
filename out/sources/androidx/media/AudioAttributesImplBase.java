package androidx.media;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12900a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12901b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12902c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12903d = -1;

    public int a() {
        return this.f12901b;
    }

    public int b() {
        int i15 = this.f12902c;
        int iC = c();
        if (iC == 6) {
            i15 |= 4;
        } else if (iC == 7) {
            i15 |= 1;
        }
        return i15 & 273;
    }

    public int c() {
        int i15 = this.f12903d;
        return i15 != -1 ? i15 : AudioAttributesCompat.a(false, this.f12902c, this.f12900a);
    }

    public int d() {
        return this.f12900a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f12901b == audioAttributesImplBase.a() && this.f12902c == audioAttributesImplBase.b() && this.f12900a == audioAttributesImplBase.d() && this.f12903d == audioAttributesImplBase.f12903d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12901b), Integer.valueOf(this.f12902c), Integer.valueOf(this.f12900a), Integer.valueOf(this.f12903d)});
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder("AudioAttributesCompat:");
        if (this.f12903d != -1) {
            sb5.append(" stream=");
            sb5.append(this.f12903d);
            sb5.append(" derived");
        }
        sb5.append(" usage=");
        sb5.append(AudioAttributesCompat.b(this.f12900a));
        sb5.append(" content=");
        sb5.append(this.f12901b);
        sb5.append(" flags=0x");
        sb5.append(Integer.toHexString(this.f12902c).toUpperCase());
        return sb5.toString();
    }
}
