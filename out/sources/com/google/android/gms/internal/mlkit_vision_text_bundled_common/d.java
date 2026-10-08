package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes3.dex */
final class d implements fw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final fw f30398a = new d();

    private d() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.fw
    public final boolean a(int i15) {
        if (i15 == 3000 || i15 == 4000 || i15 == 5000 || i15 == 6000 || i15 == 6001 || i15 == 7000 || i15 == 7001) {
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
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                        return true;
                    default:
                        switch (i15) {
                            case 40:
                            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                            case EACTags.CURRENCY_CODE /* 42 */:
                                return true;
                            default:
                                switch (i15) {
                                    case 1000:
                                    case 1001:
                                    case 1002:
                                    case 1003:
                                    case 1004:
                                    case 1005:
                                    case 1006:
                                    case 1007:
                                    case 1008:
                                    case 1009:
                                    case 1010:
                                    case 1011:
                                    case 1012:
                                    case 1013:
                                    case 1014:
                                    case 1015:
                                    case 1016:
                                        return true;
                                    default:
                                        switch (i15) {
                                            case 2000:
                                            case 2001:
                                            case 2002:
                                            case 2003:
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
