package org.conscrypt;

import io.sentry.instrumentation.file.h;
import io.sentry.instrumentation.file.l;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSession;
import org.conscrypt.io.IoUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class FileClientSessionCache {
    public static final int MAX_SIZE = 12;
    private static final Logger logger = Logger.getLogger(FileClientSessionCache.class.getName());
    static final Map<File, Impl> caches = new HashMap();

    static class CacheFile extends File {
        long lastModified;
        final String name;

        CacheFile(File file, String str) {
            super(file, str);
            this.lastModified = -1L;
            this.name = str;
        }

        @Override // java.io.File
        public long lastModified() {
            long j15 = this.lastModified;
            if (j15 != -1) {
                return j15;
            }
            long jLastModified = super.lastModified();
            this.lastModified = jLastModified;
            return jLastModified;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.Comparable
        public int compareTo(File file) {
            long jLastModified = lastModified() - file.lastModified();
            if (jLastModified == 0) {
                return super.compareTo(file);
            }
            return jLastModified < 0 ? -1 : 1;
        }
    }

    static class Impl implements SSLClientSessionCache {
        Map<String, File> accessOrder = newAccessOrder();
        final File directory;
        String[] initialFiles;
        int size;

        Impl(File file) throws IOException {
            boolean zExists = file.exists();
            if (zExists && !file.isDirectory()) {
                throw new IOException(file + " exists but is not a directory.");
            }
            if (zExists) {
                String[] list = file.list();
                this.initialFiles = list;
                if (list == null) {
                    throw new IOException(file + " exists but cannot list contents.");
                }
                Arrays.sort(list);
                this.size = this.initialFiles.length;
            } else {
                if (!file.mkdirs()) {
                    throw new IOException("Creation of " + file + " directory failed.");
                }
                this.size = 0;
            }
            this.directory = file;
        }

        private void delete(File file) {
            if (!file.delete()) {
                IOException iOException = new IOException("FileClientSessionCache: Failed to delete " + file + ".");
                FileClientSessionCache.logger.log(Level.WARNING, iOException.getMessage(), (Throwable) iOException);
            }
            this.size--;
        }

        private static String fileName(String str, int i15) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            return str + "." + i15;
        }

        private void indexFiles() {
            String[] strArr = this.initialFiles;
            if (strArr != null) {
                this.initialFiles = null;
                TreeSet<CacheFile> treeSet = new TreeSet();
                for (String str : strArr) {
                    if (!this.accessOrder.containsKey(str)) {
                        treeSet.add(new CacheFile(this.directory, str));
                    }
                }
                if (treeSet.isEmpty()) {
                    return;
                }
                Map<String, File> mapNewAccessOrder = newAccessOrder();
                for (CacheFile cacheFile : treeSet) {
                    mapNewAccessOrder.put(cacheFile.name, cacheFile);
                }
                mapNewAccessOrder.putAll(this.accessOrder);
                this.accessOrder = mapNewAccessOrder;
            }
        }

        static void logReadError(String str, File file, Throwable th4) {
            FileClientSessionCache.logger.log(Level.WARNING, "FileClientSessionCache: Error reading session data for " + str + " from " + file + ".", th4);
        }

        static void logWriteError(String str, File file, Throwable th4) {
            FileClientSessionCache.logger.log(Level.WARNING, "FileClientSessionCache: Error writing session data for " + str + " to " + file + ".", th4);
        }

        private void makeRoom() {
            if (this.size <= 12) {
                return;
            }
            indexFiles();
            int i15 = this.size - 12;
            Iterator<File> it = this.accessOrder.values().iterator();
            do {
                delete(it.next());
                it.remove();
                i15--;
            } while (i15 > 0);
        }

        private static Map<String, File> newAccessOrder() {
            return new LinkedHashMap(12, 0.75f, true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r6v5, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
        @Override // org.conscrypt.SSLClientSessionCache
        public synchronized byte[] getSessionData(String str, int i15) {
            ?? FileName = fileName(str, i15);
            File file = this.accessOrder.get(FileName);
            if (file == null) {
                String[] strArr = this.initialFiles;
                if (strArr == null) {
                    return null;
                }
                if (Arrays.binarySearch(strArr, (Object) FileName) < 0) {
                    return null;
                }
                file = new File(this.directory, (String) FileName);
                this.accessOrder.put((String) FileName, file);
            }
            try {
                try {
                    FileName = h.b.a(new FileInputStream(file), file);
                    try {
                        byte[] bArr = new byte[(int) file.length()];
                        new DataInputStream(FileName).readFully(bArr);
                        IoUtils.closeQuietly((Closeable) FileName);
                        return bArr;
                    } catch (IOException e15) {
                        logReadError(str, file, e15);
                        IoUtils.closeQuietly((Closeable) FileName);
                        return null;
                    }
                } catch (FileNotFoundException e16) {
                    logReadError(str, file, e16);
                    return null;
                }
            } catch (Throwable th4) {
                IoUtils.closeQuietly((Closeable) FileName);
                throw th4;
            }
        }

        @Override // org.conscrypt.SSLClientSessionCache
        public synchronized void putSessionData(SSLSession sSLSession, byte[] bArr) {
            String peerHost = sSLSession.getPeerHost();
            if (bArr == null) {
                throw new NullPointerException("sessionData == null");
            }
            String strFileName = fileName(peerHost, sSLSession.getPeerPort());
            File file = new File(this.directory, strFileName);
            boolean zExists = file.exists();
            try {
                FileOutputStream fileOutputStreamA = l.b.a(new FileOutputStream(file), file);
                if (!zExists) {
                    this.size++;
                    makeRoom();
                }
                try {
                    try {
                        fileOutputStreamA.write(bArr);
                        try {
                            try {
                                fileOutputStreamA.close();
                                this.accessOrder.put(strFileName, file);
                            } catch (IOException e15) {
                                logWriteError(peerHost, file, e15);
                                delete(file);
                            }
                        } catch (Throwable th4) {
                            delete(file);
                            throw th4;
                        }
                    } catch (IOException e16) {
                        logWriteError(peerHost, file, e16);
                        try {
                            try {
                                fileOutputStreamA.close();
                            } catch (IOException e17) {
                                logWriteError(peerHost, file, e17);
                                delete(file);
                            }
                            delete(file);
                        } catch (Throwable th5) {
                            delete(file);
                            throw th5;
                        }
                    }
                } catch (Throwable th6) {
                    try {
                        try {
                            fileOutputStreamA.close();
                        } catch (IOException e18) {
                            logWriteError(peerHost, file, e18);
                            throw th6;
                        }
                        throw th6;
                    } finally {
                        delete(file);
                    }
                }
            } catch (FileNotFoundException e19) {
                logWriteError(peerHost, file, e19);
            }
        }
    }

    private FileClientSessionCache() {
    }

    static synchronized void reset() {
        caches.clear();
    }

    public static synchronized SSLClientSessionCache usingDirectory(File file) {
        Impl impl;
        Map<File, Impl> map = caches;
        impl = map.get(file);
        if (impl == null) {
            impl = new Impl(file);
            map.put(file, impl);
        }
        return impl;
    }
}
