package org.conscrypt;

/* JADX INFO: loaded from: classes5.dex */
final class Preconditions {
    private Preconditions() {
    }

    private static String badPositionIndex(int i15, int i16, String str) {
        if (i15 < 0) {
            return String.format("%s (%s) must not be negative", str, Integer.valueOf(i15));
        }
        if (i16 >= 0) {
            return String.format("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i15), Integer.valueOf(i16));
        }
        throw new IllegalArgumentException("negative size: " + i16);
    }

    private static String badPositionIndexes(int i15, int i16, int i17) {
        if (i15 < 0 || i15 > i17) {
            return badPositionIndex(i15, i17, "start index");
        }
        return (i16 < 0 || i16 > i17) ? badPositionIndex(i16, i17, "end index") : String.format("end index (%s) must not be less than start index (%s)", Integer.valueOf(i16), Integer.valueOf(i15));
    }

    static void checkArgument(boolean z15, String str) {
        if (!z15) {
            throw new IllegalArgumentException(str);
        }
    }

    static <T> T checkNotNull(T t15, String str) {
        if (t15 != null) {
            return t15;
        }
        throw new NullPointerException(str);
    }

    static void checkPositionIndexes(int i15, int i16, int i17) {
        if (i15 < 0 || i16 < i15 || i16 > i17) {
            throw new IndexOutOfBoundsException(badPositionIndexes(i15, i16, i17));
        }
    }

    static void checkArgument(boolean z15, String str, Object obj) {
        if (!z15) {
            throw new IllegalArgumentException(String.format(str, obj));
        }
    }
}
