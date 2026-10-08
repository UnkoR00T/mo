package r10;

import android.os.Environment;
import java.io.File;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr10/c;", "Laz/c;", "<init>", "()V", "Ljava/io/File;", "a", "()Ljava/io/File;", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements az.c {
    @Override // az.c
    public File a() {
        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
    }
}
