package sg;

import android.os.Looper;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ClassLoader f181443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Thread f181444b;

    /* JADX WARN: Code duplicated, block: B:52:0x00b6 A[Catch: all -> 0x00b2, PHI: r2
      0x00b6: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:46:0x00af] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:45:0x00ad, B:60:0x00e4, B:12:0x0023, B:51:0x00b5, B:52:0x00b6, B:63:0x00e8, B:64:0x00e9, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:42:0x0089, B:43:0x00ab, B:18:0x0040, B:53:0x00b7, B:59:0x00e3, B:58:0x00c1), top: B:71:0x0003, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader a() {
        SecurityException e15;
        Thread thread;
        ThreadGroup threadGroup;
        if (f181443a == null) {
            Thread thread2 = f181444b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f181444b.getContextClassLoader();
                    } catch (SecurityException e16) {
                        String message = e16.getMessage();
                        StringBuilder sb5 = new StringBuilder(String.valueOf(message).length() + 41);
                        sb5.append("Failed to get thread context classloader ");
                        sb5.append(message);
                        c2.g("DynamiteLoaderV2CL", sb5.toString());
                    }
                }
                f181443a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i15 = 0;
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i16];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i16++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i15 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i15];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i15++;
                                }
                                if (thread == null) {
                                    try {
                                        c cVar = new c(threadGroup, "GmsDynamite");
                                        try {
                                            cVar.setContextClassLoader(null);
                                            cVar.start();
                                            thread = cVar;
                                        } catch (SecurityException e17) {
                                            e15 = e17;
                                            thread = cVar;
                                            String message2 = e15.getMessage();
                                            StringBuilder sb6 = new StringBuilder(String.valueOf(message2).length() + 39);
                                            sb6.append("Failed to enumerate thread/threadgroup ");
                                            sb6.append(message2);
                                            c2.g("DynamiteLoaderV2CL", sb6.toString());
                                        }
                                    } catch (SecurityException e18) {
                                        e15 = e18;
                                    }
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        } catch (SecurityException e19) {
                            e15 = e19;
                            thread = null;
                        }
                    }
                    thread2 = thread;
                }
                f181444b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = f181444b.getContextClassLoader();
                    }
                }
                f181443a = contextClassLoader;
            }
        }
        return f181443a;
    }
}
