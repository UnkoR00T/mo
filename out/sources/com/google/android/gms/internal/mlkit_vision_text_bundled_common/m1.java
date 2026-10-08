package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes3.dex */
final class m1 implements fw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final fw f30497a = new m1();

    private m1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.fw
    public final boolean a(int i15) {
        if (i15 == 200 || i15 == 300 || i15 == 302 || i15 == 312 || i15 == 15000 || i15 == 304 || i15 == 305) {
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
                return true;
            default:
                switch (i15) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        return true;
                    default:
                        switch (i15) {
                            case EACTags.DATE_OF_BIRTH /* 43 */:
                            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                                return true;
                            default:
                                switch (i15) {
                                    case 220:
                                    case 221:
                                    case 222:
                                    case 223:
                                    case BERTags.FLAGS /* 224 */:
                                    case 225:
                                    case 226:
                                    case 227:
                                        return true;
                                    default:
                                        switch (i15) {
                                            case 238:
                                            case 239:
                                            case 240:
                                            case 241:
                                            case 242:
                                            case 243:
                                                return true;
                                            default:
                                                switch (i15) {
                                                    case 314:
                                                    case 315:
                                                    case 316:
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
}
