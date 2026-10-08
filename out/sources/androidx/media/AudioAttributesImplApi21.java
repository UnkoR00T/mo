package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes3.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f12898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12899b;

    public AudioAttributesImplApi21() {
        this.f12899b = -1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f12898a.equals(((AudioAttributesImplApi21) obj).f12898a);
        }
        return false;
    }

    public int hashCode() {
        return this.f12898a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f12898a;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i15) {
        this.f12898a = audioAttributes;
        this.f12899b = i15;
    }
}
