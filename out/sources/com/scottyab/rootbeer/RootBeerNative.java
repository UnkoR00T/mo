package com.scottyab.rootbeer;

import com.scottyab.rootbeer.util.QLog;

/* JADX INFO: loaded from: classes4.dex */
public class RootBeerNative {
    private static boolean libraryLoaded = false;

    static {
        try {
            System.loadLibrary("toolChecker");
            libraryLoaded = true;
        } catch (UnsatisfiedLinkError e15) {
            QLog.e(e15);
        }
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z15);

    public boolean wasNativeLibraryLoaded() {
        return libraryLoaded;
    }
}
