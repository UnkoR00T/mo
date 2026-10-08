package org.bouncycastle.pqc.crypto.rainbow;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;

/* JADX INFO: loaded from: classes5.dex */
public class RainbowParameters implements CipherParameters {
    private static final int len_pkseed = 32;
    private static final int len_salt = 16;
    private static final int len_skseed = 32;
    public static final RainbowParameters rainbowIIIcircumzenithal;
    public static final RainbowParameters rainbowIIIclassic;
    public static final RainbowParameters rainbowIIIcompressed;
    public static final RainbowParameters rainbowVcircumzenithal;
    public static final RainbowParameters rainbowVclassic;
    public static final RainbowParameters rainbowVcompressed;
    private final Digest hash_algo;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f149536m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f149537n;
    private final String name;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private final int f149538o1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    private final int f149539o2;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private final int f149540v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    private final int f149541v2;
    private final Version version;

    static {
        Version version = Version.CLASSIC;
        rainbowIIIclassic = new RainbowParameters("rainbow-III-classic", 3, version);
        Version version2 = Version.CIRCUMZENITHAL;
        rainbowIIIcircumzenithal = new RainbowParameters("rainbow-III-circumzenithal", 3, version2);
        Version version3 = Version.COMPRESSED;
        rainbowIIIcompressed = new RainbowParameters("rainbow-III-compressed", 3, version3);
        rainbowVclassic = new RainbowParameters("rainbow-V-classic", 5, version);
        rainbowVcircumzenithal = new RainbowParameters("rainbow-V-circumzenithal", 5, version2);
        rainbowVcompressed = new RainbowParameters("rainbow-V-compressed", 5, version3);
    }

    private RainbowParameters(String str, int i15, Version version) {
        Digest sHA384Digest;
        this.name = str;
        if (i15 == 3) {
            this.f149540v1 = 68;
            this.f149538o1 = 32;
            this.f149539o2 = 48;
            sHA384Digest = new SHA384Digest();
        } else {
            if (i15 != 5) {
                throw new IllegalArgumentException("No valid version. Please choose one of the following: 3, 5");
            }
            this.f149540v1 = 96;
            this.f149538o1 = 36;
            this.f149539o2 = 64;
            sHA384Digest = new SHA512Digest();
        }
        this.hash_algo = sHA384Digest;
        int i16 = this.f149540v1;
        int i17 = this.f149538o1;
        this.f149541v2 = i16 + i17;
        int i18 = this.f149539o2;
        this.f149537n = i16 + i17 + i18;
        this.f149536m = i17 + i18;
        this.version = version;
    }

    Digest getHash_algo() {
        return this.hash_algo;
    }

    int getLen_pkseed() {
        return 32;
    }

    int getLen_salt() {
        return 16;
    }

    int getLen_skseed() {
        return 32;
    }

    int getM() {
        return this.f149536m;
    }

    int getN() {
        return this.f149537n;
    }

    public String getName() {
        return this.name;
    }

    int getO1() {
        return this.f149538o1;
    }

    int getO2() {
        return this.f149539o2;
    }

    int getV1() {
        return this.f149540v1;
    }

    int getV2() {
        return this.f149541v2;
    }

    Version getVersion() {
        return this.version;
    }
}
