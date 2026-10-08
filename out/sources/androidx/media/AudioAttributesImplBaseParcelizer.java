package androidx.media;

import androidx.versionedparcelable.a;

/* JADX INFO: loaded from: classes3.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f12900a = aVar.p(audioAttributesImplBase.f12900a, 1);
        audioAttributesImplBase.f12901b = aVar.p(audioAttributesImplBase.f12901b, 2);
        audioAttributesImplBase.f12902c = aVar.p(audioAttributesImplBase.f12902c, 3);
        audioAttributesImplBase.f12903d = aVar.p(audioAttributesImplBase.f12903d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.f12900a, 1);
        aVar.F(audioAttributesImplBase.f12901b, 2);
        aVar.F(audioAttributesImplBase.f12902c, 3);
        aVar.F(audioAttributesImplBase.f12903d, 4);
    }
}
