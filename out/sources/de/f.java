package de;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends d {

    class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f41103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41104b;

        a(Context context, String str) {
            this.f41103a = context;
            this.f41104b = str;
        }

        @Override // de.d.a
        public File a() {
            File cacheDir = this.f41103a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f41104b != null ? new File(cacheDir, this.f41104b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, String str, long j15) {
        super(new a(context, str), j15);
    }
}
