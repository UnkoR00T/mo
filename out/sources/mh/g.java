package mh;

/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public static byte a(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    public static Boolean b(byte b15) {
        if (b15 == 0) {
            return Boolean.FALSE;
        }
        if (b15 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}
