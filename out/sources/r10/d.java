package r10;

import android.content.Context;
import androidx.core.content.FileProvider;
import java.io.File;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lr10/d;", "Laz/d;", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "Ljava/io/File;", "file", "", "a", "(Ljava/io/File;)Ljava/lang/String;", "Landroid/content/Context;", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements az.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    public d(Context context) {
        this.applicationContext = context;
    }

    @Override // az.d
    public String a(File file) {
        return FileProvider.h(this.applicationContext, this.applicationContext.getPackageName() + ".provider", file).toString();
    }
}
