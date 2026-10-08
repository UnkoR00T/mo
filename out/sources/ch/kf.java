package ch;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public enum kf implements n2 {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(128),
    FORMAT_QR_CODE(256),
    FORMAT_UPC_A(512),
    FORMAT_UPC_E(1024),
    FORMAT_PDF417(2048),
    FORMAT_AZTEC(PKIFailureInfo.certConfirmed);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26101a;

    kf(int i15) {
        this.f26101a = i15;
    }

    @Override // ch.n2
    public final int zza() {
        return this.f26101a;
    }
}
