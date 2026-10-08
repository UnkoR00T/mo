package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
final class iy {
    static String a(yu yuVar) {
        StringBuilder sb5 = new StringBuilder(yuVar.g());
        for (int i15 = 0; i15 < yuVar.g(); i15++) {
            byte bE = yuVar.e(i15);
            if (bE == 34) {
                sb5.append("\\\"");
            } else if (bE == 39) {
                sb5.append("\\'");
            } else if (bE != 92) {
                switch (bE) {
                    case 7:
                        sb5.append("\\a");
                        break;
                    case 8:
                        sb5.append("\\b");
                        break;
                    case 9:
                        sb5.append("\\t");
                        break;
                    case 10:
                        sb5.append("\\n");
                        break;
                    case 11:
                        sb5.append("\\v");
                        break;
                    case 12:
                        sb5.append("\\f");
                        break;
                    case 13:
                        sb5.append("\\r");
                        break;
                    default:
                        if (bE < 32 || bE > 126) {
                            sb5.append('\\');
                            sb5.append((char) (((bE >>> 6) & 3) + 48));
                            sb5.append((char) (((bE >>> 3) & 7) + 48));
                            sb5.append((char) ((bE & 7) + 48));
                        } else {
                            sb5.append((char) bE);
                        }
                        break;
                }
            } else {
                sb5.append("\\\\");
            }
        }
        return sb5.toString();
    }
}
