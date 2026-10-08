package com.google.firebase.installations;

import android.content.Context;
import io.sentry.android.core.c2;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/* JADX INFO: loaded from: classes4.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileChannel f36404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileLock f36405b;

    private b(FileChannel fileChannel, FileLock fileLock) {
        this.f36404a = fileChannel;
        this.f36405b = fileLock;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static b a(Context context, String str) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), str), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new b(channel, fileLockLock);
                } catch (IOException e15) {
                    e = e15;
                    c2.f("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e16) {
                    e = e16;
                    c2.f("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e17) {
                    e = e17;
                    c2.f("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e18) {
                e = e18;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e19) {
            e = e19;
            channel = null;
            fileLockLock = null;
        }
    }

    void b() {
        try {
            this.f36405b.release();
            this.f36404a.close();
        } catch (IOException e15) {
            c2.f("CrossProcessLock", "encountered error while releasing, ignoring", e15);
        }
    }
}
