package io.sentry.android.core.internal.modules;

import android.content.Context;
import io.sentry.android.core.a1;
import io.sentry.b7;
import io.sentry.internal.modules.d;
import io.sentry.v0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f93928e;

    public b(Context context, v0 v0Var) {
        super(v0Var);
        this.f93928e = a1.g(context);
        new Thread(new Runnable() { // from class: io.sentry.android.core.internal.modules.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f93927a.a();
            }
        }).start();
    }

    @Override // io.sentry.internal.modules.d
    protected Map<String, String> b() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream inputStreamOpen = this.f93928e.getAssets().open("sentry-external-modules.txt");
            try {
                Map<String, String> mapC = c(inputStreamOpen);
                if (inputStreamOpen == null) {
                    return mapC;
                }
                inputStreamOpen.close();
                return mapC;
            } catch (Throwable th4) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (FileNotFoundException unused) {
            this.f95123a.c(b7.INFO, "%s file was not found.", "sentry-external-modules.txt");
            return treeMap;
        } catch (IOException e15) {
            this.f95123a.b(b7.ERROR, "Error extracting modules.", e15);
            return treeMap;
        }
    }
}
