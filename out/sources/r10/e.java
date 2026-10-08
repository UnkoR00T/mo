package r10;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lr10/e;", "Laz/e;", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "", "name", "extension", "Laz/e$a;", "directory", "Ljava/io/File;", "a", "(Ljava/lang/String;Ljava/lang/String;Laz/e$a;Ltq/e;)Ljava/lang/Object;", "Landroid/content/Context;", "b", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements az.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f170415a;

        static {
            int[] iArr = new int[az.e.a.values().length];
            try {
                iArr[az.e.a.PICTURES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f170415a = iArr;
        }
    }

    public e(Context context) {
        this.applicationContext = context;
    }

    @Override // az.e
    public Object a(String str, String str2, az.e.a aVar, tq.e<? super File> eVar) throws IOException {
        if (b.f170415a[aVar.ordinal()] != 1) {
            throw new p();
        }
        File file = new File(this.applicationContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES), str + str2);
        file.createNewFile();
        return file;
    }
}
