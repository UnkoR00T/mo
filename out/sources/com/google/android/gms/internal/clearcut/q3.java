package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
final class q3 {
    static String a(a0 a0Var) {
        String str;
        r3 r3Var = new r3(a0Var);
        StringBuilder sb5 = new StringBuilder(r3Var.size());
        for (int i15 = 0; i15 < r3Var.size(); i15++) {
            int iA = r3Var.a(i15);
            if (iA == 34) {
                str = "\\\"";
            } else if (iA == 39) {
                str = "\\'";
            } else if (iA != 92) {
                switch (iA) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iA < 32 || iA > 126) {
                            sb5.append('\\');
                            sb5.append((char) (((iA >>> 6) & 3) + 48));
                            sb5.append((char) (((iA >>> 3) & 7) + 48));
                            iA = (iA & 7) + 48;
                        }
                        sb5.append((char) iA);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb5.append(str);
        }
        return sb5.toString();
    }
}
