package net.zetetic.database;

import android.database.CharArrayBuffer;
import net.zetetic.database.sqlcipher.SQLiteClosable;

/* JADX INFO: loaded from: classes3.dex */
public class CursorWindow extends SQLiteClosable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f135354f = 16384;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f135355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f135356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f135357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f135358e;

    public CursorWindow(String str) {
        this(str, 16384);
    }

    private void j() {
        long j15 = this.f135356c;
        if (j15 != 0) {
            nativeDispose(j15);
            this.f135356c = 0L;
        }
    }

    private static native boolean nativeAllocRow(long j15);

    private static native void nativeClear(long j15);

    private static native long nativeCreate(String str, int i15);

    private static native void nativeDispose(long j15);

    private static native void nativeFreeLastRow(long j15);

    private static native byte[] nativeGetBlob(long j15, int i15, int i16);

    private static native double nativeGetDouble(long j15, int i15, int i16);

    private static native long nativeGetLong(long j15, int i15, int i16);

    private static native String nativeGetName(long j15);

    private static native int nativeGetNumRows(long j15);

    private static native String nativeGetString(long j15, int i15, int i16);

    private static native int nativeGetType(long j15, int i15, int i16);

    private static native boolean nativePutBlob(long j15, byte[] bArr, int i15, int i16);

    private static native boolean nativePutDouble(long j15, double d15, int i15, int i16);

    private static native boolean nativePutLong(long j15, long j16, int i15, int i16);

    private static native boolean nativePutNull(long j15, int i15, int i16);

    private static native boolean nativePutString(long j15, String str, int i15, int i16);

    private static native boolean nativeSetNumColumns(long j15, int i15);

    public float C(int i15, int i16) {
        return (float) y(i15, i16);
    }

    public int E(int i15, int i16) {
        return (int) H(i15, i16);
    }

    public long H(int i15, int i16) {
        return nativeGetLong(this.f135356c, i15 - this.f135357d, i16);
    }

    public String I() {
        return this.f135358e;
    }

    public int J() {
        return nativeGetNumRows(this.f135356c);
    }

    public short K(int i15, int i16) {
        return (short) H(i15, i16);
    }

    public int L() {
        return this.f135357d;
    }

    public String M(int i15, int i16) {
        return nativeGetString(this.f135356c, i15 - this.f135357d, i16);
    }

    public int N(int i15, int i16) {
        return nativeGetType(this.f135356c, i15 - this.f135357d, i16);
    }

    public void O(int i15) {
        this.f135357d = i15;
    }

    protected void finalize() throws Throwable {
        try {
            j();
        } finally {
            super.finalize();
        }
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteClosable
    protected void h() {
        j();
    }

    public void p() {
        this.f135357d = 0;
        nativeClear(this.f135356c);
    }

    public void r(int i15, int i16, CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer == null) {
            throw new IllegalArgumentException("CharArrayBuffer should not be null");
        }
        char[] charArray = M(i15, i16).toCharArray();
        charArrayBuffer.data = charArray;
        charArrayBuffer.sizeCopied = charArray.length;
    }

    public String toString() {
        return I() + " {" + Long.toHexString(this.f135356c) + "}";
    }

    public byte[] u(int i15, int i16) {
        return nativeGetBlob(this.f135356c, i15 - this.f135357d, i16);
    }

    public double y(int i15, int i16) {
        return nativeGetDouble(this.f135356c, i15 - this.f135357d, i16);
    }

    public CursorWindow(String str, int i15) {
        this.f135357d = 0;
        this.f135355b = i15;
        str = (str == null || str.length() == 0) ? "<unnamed>" : str;
        this.f135358e = str;
        long jNativeCreate = nativeCreate(str, i15);
        this.f135356c = jNativeCreate;
        if (jNativeCreate != 0) {
            return;
        }
        throw new CursorWindowAllocationException("Cursor window allocation of " + (i15 / 1024) + " kb failed. ");
    }
}
