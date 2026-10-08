package z7;

import android.media.MediaCodec;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f233214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f233215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f233216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f233217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f233218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f233219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f233220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f233221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f233222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f233223j;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f233224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f233225b;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i15, int i16) {
            this.f233225b.set(i15, i16);
            this.f233224a.setPattern(this.f233225b);
        }

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f233224a = cryptoInfo;
            this.f233225b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f233222i = cryptoInfo;
        this.f233223j = new b(cryptoInfo);
    }

    public MediaCodec.CryptoInfo a() {
        return this.f233222i;
    }

    public void b(int i15) {
        if (i15 == 0) {
            return;
        }
        if (this.f233217d == null) {
            int[] iArr = new int[1];
            this.f233217d = iArr;
            this.f233222i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f233217d;
        iArr2[0] = iArr2[0] + i15;
    }

    public void c(int i15, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i16, int i17, int i18) {
        this.f233219f = i15;
        this.f233217d = iArr;
        this.f233218e = iArr2;
        this.f233215b = bArr;
        this.f233214a = bArr2;
        this.f233216c = i16;
        this.f233220g = i17;
        this.f233221h = i18;
        MediaCodec.CryptoInfo cryptoInfo = this.f233222i;
        cryptoInfo.numSubSamples = i15;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i16;
        ((b) p.q(this.f233223j)).b(i17, i18);
    }
}
