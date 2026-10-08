package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.math.Primes;

/* JADX INFO: loaded from: classes3.dex */
final class h implements p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final p3 f29731a = new h();

    private h() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.p3
    public final boolean b(int i15) {
        if (i15 == 129 || i15 == 161 || i15 == 209 || i15 == 2705 || i15 == 20753 || i15 == 20769 || i15 == 215 || i15 == 216 || i15 == 1297 || i15 == 1298) {
            return true;
        }
        switch (i15) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                switch (i15) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        return true;
                    default:
                        switch (i15) {
                            case EACTags.ANSWER_TO_RESET /* 81 */:
                            case EACTags.HISTORICAL_BYTES /* 82 */:
                            case 83:
                            case 84:
                            case 85:
                                return true;
                            default:
                                switch (i15) {
                                    case 163:
                                    case 164:
                                    case 165:
                                    case 166:
                                    case 167:
                                    case 168:
                                    case 169:
                                        return true;
                                    default:
                                        switch (i15) {
                                            case Primes.SMALL_FACTOR_LIMIT /* 211 */:
                                            case 212:
                                            case 213:
                                                return true;
                                            default:
                                                return false;
                                        }
                                }
                        }
                }
        }
    }
}
