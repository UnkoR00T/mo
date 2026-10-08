package org.conscrypt.ct;

/* JADX INFO: loaded from: classes5.dex */
public interface LogStore {

    public enum State {
        UNINITIALIZED,
        NOT_FOUND,
        MALFORMED,
        LOADED,
        COMPLIANT,
        NON_COMPLIANT
    }

    int getCompatVersion();

    LogInfo getKnownLog(byte[] bArr);

    int getMajorVersion();

    int getMinCompatVersionAvailable();

    int getMinorVersion();

    State getState();

    long getTimestamp();
}
