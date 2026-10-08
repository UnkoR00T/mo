package vb;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lvb/h0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Loq/i0;", "c", "(Landroid/content/Context;)V", "", "Ljava/io/File;", "d", "(Landroid/content/Context;)Ljava/util/Map;", "b", "(Landroid/content/Context;)Ljava/io/File;", "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f205787a = new h0();

    private h0() {
    }

    public static final void c(Context context) {
        h0 h0Var = f205787a;
        if (h0Var.b(context).exists()) {
            ub.w.e().a(i0.f205792a, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry<File, File> entry : h0Var.d(context).entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    if (value.exists()) {
                        ub.w.e().k(i0.f205792a, "Over-writing contents of " + value);
                    }
                    ub.w.e().a(i0.f205792a, key.renameTo(value) ? "Migrated " + key + "to " + value : "Renaming " + key + " to " + value + " failed");
                }
            }
        }
    }

    public final File a(Context context) {
        return context.getNoBackupFilesDir();
    }

    public final File b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    public final Map<File, File> d(Context context) {
        File fileB = b(context);
        File fileA = a(context);
        String[] strArr = i0.f205793b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(pq.v0.e(strArr.length), 16));
        for (String str : strArr) {
            oq.r rVarA = oq.y.a(new File(fileB.getPath() + str), new File(fileA.getPath() + str));
            linkedHashMap.put(rVarA.c(), rVarA.d());
        }
        return pq.v0.p(linkedHashMap, oq.y.a(fileB, fileA));
    }
}
