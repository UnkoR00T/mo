package u6;

import java.io.File;
import java.io.IOException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lu6/s;", "", "<init>", "()V", "Ljava/io/File;", "file", "Ljava/io/IOException;", "cause", "c", "(Ljava/io/File;Ljava/io/IOException;)Ljava/io/IOException;", "origException", "b", "a", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f195734a = new s();

    private s() {
    }

    private final IOException b(File file, IOException origException) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Inoperable file:");
        try {
            sb5.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb5.append(" failed to attach additional metadata");
        }
        return new IOException(sb5.toString(), origException);
    }

    private final IOException c(File file, IOException cause) {
        File parentFile = file.getParentFile();
        if (parentFile != null && parentFile.exists()) {
            if (parentFile.isFile()) {
                if (parentFile.canRead()) {
                    return parentFile.canWrite() ? b(file, cause) : b(file, cause);
                }
                return parentFile.canWrite() ? b(file, cause) : b(file, cause);
            }
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? b(file, cause) : b(file, cause);
            }
            return parentFile.canWrite() ? b(file, cause) : b(file, cause);
        }
        return b(file, cause);
    }

    public final IOException a(File file, IOException cause) {
        if (!file.exists()) {
            return c(file, cause);
        }
        if (file.isFile()) {
            if (file.canRead()) {
                return file.canWrite() ? c(file, cause) : c(file, cause);
            }
            return file.canWrite() ? c(file, cause) : c(file, cause);
        }
        if (file.canRead()) {
            return file.canWrite() ? c(file, cause) : c(file, cause);
        }
        return file.canWrite() ? c(file, cause) : c(file, cause);
    }
}
