package sa;

import android.content.Context;
import io.sentry.android.core.c2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u0015J\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\u000e\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b%\u0010/R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00102R\u0016\u00106\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00109¨\u0006="}, d2 = {"Lsa/l;", "Lza/d;", "Loa/d;", "Landroid/content/Context;", "context", "", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "", "databaseVersion", "delegate", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILza/d;)V", "", "writable", "Loq/i0;", "r", "(Z)V", "destinationFile", "h", "(Ljava/io/File;Z)V", "databaseFile", "m", "enabled", "setWriteAheadLoggingEnabled", "close", "()V", "Loa/c;", "databaseConfiguration", "p", "(Loa/c;)V", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Ljava/io/File;", "d", "Ljava/util/concurrent/Callable;", "e", "I", "f", "Lza/d;", "()Lza/d;", "g", "Loa/c;", "Z", "verified", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lza/c;", "g3", "()Lza/c;", "writableDatabase", "c3", "readableDatabase", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements za.d, oa.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String copyFromAssetPath;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final File copyFromFile;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Callable<InputStream> copyFromInputStream;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int databaseVersion;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final za.d delegate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private oa.c databaseConfiguration;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean verified;

    public l(Context context, String str, File file, Callable<InputStream> callable, int i15, za.d dVar) {
        this.context = context;
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.databaseVersion = i15;
        this.delegate = dVar;
    }

    private final void h(File destinationFile, boolean writable) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.copyFromAssetPath != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.context.getAssets().open(this.copyFromAssetPath));
        } else if (this.copyFromFile != null) {
            File file = this.copyFromFile;
            readableByteChannelNewChannel = io.sentry.instrumentation.file.h.b.a(new FileInputStream(file), file).getChannel();
        } else {
            Callable<InputStream> callable = this.copyFromInputStream;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel(callable.call());
            } catch (Exception e15) {
                throw new IOException("inputStreamCallable exception on call", e15);
            }
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.context.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        ta.d.a(readableByteChannelNewChannel, io.sentry.instrumentation.file.l.b.a(new FileOutputStream(fileCreateTempFile), fileCreateTempFile).getChannel());
        File parentFile = destinationFile.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + destinationFile.getAbsolutePath());
        }
        m(fileCreateTempFile, writable);
        if (fileCreateTempFile.renameTo(destinationFile)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + destinationFile.getAbsolutePath() + ").");
    }

    private final void m(File databaseFile, boolean writable) {
        oa.c cVar = this.databaseConfiguration;
        if (cVar == null) {
            cVar = null;
        }
        cVar.getClass();
    }

    private final void r(boolean writable) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databasePath = this.context.getDatabasePath(databaseName);
        oa.c cVar = this.databaseConfiguration;
        oa.c cVar2 = null;
        if (cVar == null) {
            cVar = null;
        }
        cb.a aVar = new cb.a(databaseName, this.context.getFilesDir(), cVar.multiInstanceInvalidation);
        try {
            cb.a.c(aVar, false, 1, null);
            if (!databasePath.exists()) {
                try {
                    h(databasePath, writable);
                    aVar.d();
                    return;
                } catch (IOException e15) {
                    throw new RuntimeException("Unable to copy database file.", e15);
                }
            }
            try {
                int iF = ta.a.f(databasePath);
                int i15 = this.databaseVersion;
                if (iF == i15) {
                    aVar.d();
                    return;
                }
                oa.c cVar3 = this.databaseConfiguration;
                if (cVar3 == null) {
                    cVar3 = null;
                }
                if (cVar3.migrationContainer.d(iF, i15) != null) {
                    aVar.d();
                    return;
                }
                oa.c cVar4 = this.databaseConfiguration;
                if (cVar4 != null) {
                    cVar2 = cVar4;
                }
                if (cVar2.f(iF, this.databaseVersion)) {
                    aVar.d();
                    return;
                }
                if (this.context.deleteDatabase(databaseName)) {
                    try {
                        h(databasePath, writable);
                        i0 i0Var = i0.f148189a;
                    } catch (IOException e16) {
                        c2.h("ROOM", "Unable to copy database file.", e16);
                    }
                } else {
                    c2.g("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar.d();
                return;
            } catch (IOException e17) {
                c2.h("ROOM", "Unable to read database version.", e17);
                aVar.d();
                return;
            }
        } catch (Throwable th4) {
            aVar.d();
            throw th4;
        }
        aVar.d();
        throw th4;
    }

    @Override // oa.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public za.d getDelegate() {
        return this.delegate;
    }

    @Override // za.d
    public za.c c3() {
        if (!this.verified) {
            r(false);
            this.verified = true;
        }
        return getDelegate().c3();
    }

    @Override // za.d, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.verified = false;
    }

    @Override // za.d
    public za.c g3() {
        if (!this.verified) {
            r(true);
            this.verified = true;
        }
        return getDelegate().g3();
    }

    @Override // za.d
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    public final void p(oa.c databaseConfiguration) {
        this.databaseConfiguration = databaseConfiguration;
    }

    @Override // za.d
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        getDelegate().setWriteAheadLoggingEnabled(enabled);
    }
}
