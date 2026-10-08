package sd;

/* JADX INFO: loaded from: classes3.dex */
final class d {
    static String a(int i15, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append('$');
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = iArr[i16];
            if (i17 == 1 || i17 == 2) {
                sb5.append('[');
                sb5.append(iArr2[i16]);
                sb5.append(']');
            } else if (i17 == 3 || i17 == 4 || i17 == 5) {
                sb5.append('.');
                String str = strArr[i16];
                if (str != null) {
                    sb5.append(str);
                }
            }
        }
        return sb5.toString();
    }
}
