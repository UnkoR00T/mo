package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
final class y4 {
    static String a(e1 e1Var) {
        b5 b5Var = new b5(e1Var);
        StringBuilder sb5 = new StringBuilder(b5Var.zza());
        for (int i15 = 0; i15 < b5Var.zza(); i15++) {
            byte b15 = b5Var.b(i15);
            if (b15 == 34) {
                sb5.append("\\\"");
            } else if (b15 == 39) {
                sb5.append("\\'");
            } else if (b15 != 92) {
                switch (b15) {
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
                        if (b15 < 32 || b15 > 126) {
                            sb5.append('\\');
                            sb5.append((char) (((b15 >>> 6) & 3) + 48));
                            sb5.append((char) (((b15 >>> 3) & 7) + 48));
                            sb5.append((char) ((b15 & 7) + 48));
                        } else {
                            sb5.append((char) b15);
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
