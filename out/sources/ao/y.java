package ao;

/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f13951a = a();

    private static int a() {
        return e(System.getProperty("java.version"));
    }

    private static int b(String str) {
        try {
            StringBuilder sb5 = new StringBuilder();
            for (int i15 = 0; i15 < str.length(); i15++) {
                char cCharAt = str.charAt(i15);
                if (!Character.isDigit(cCharAt)) {
                    break;
                }
                sb5.append(cCharAt);
            }
            return Integer.parseInt(sb5.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static boolean c() {
        return f13951a >= 9;
    }

    private static int d(String str) {
        try {
            String[] strArrSplit = str.split("[._]", 3);
            int i15 = Integer.parseInt(strArrSplit[0]);
            return (i15 != 1 || strArrSplit.length <= 1) ? i15 : Integer.parseInt(strArrSplit[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    static int e(String str) {
        int iD = d(str);
        if (iD == -1) {
            iD = b(str);
        }
        if (iD == -1) {
            return 6;
        }
        return iD;
    }
}
