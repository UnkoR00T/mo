package io.sentry.android.core.internal.debugmeta;

import android.content.Context;
import io.sentry.android.core.a1;
import io.sentry.b7;
import io.sentry.util.d;
import io.sentry.v0;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements io.sentry.internal.debugmeta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f93897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v0 f93898b;

    public a(Context context, v0 v0Var) {
        this.f93897a = a1.g(context);
        this.f93898b = v0Var;
    }

    @Override // io.sentry.internal.debugmeta.a
    public List<Properties> a() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f93897a.getAssets().open(d.f95796a));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                List<Properties> listSingletonList = Collections.singletonList(properties);
                bufferedInputStream.close();
                return listSingletonList;
            } catch (Throwable th4) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (FileNotFoundException unused) {
            this.f93898b.c(b7.INFO, "%s file was not found.", d.f95796a);
            return null;
        } catch (IOException e15) {
            this.f93898b.b(b7.ERROR, "Error getting Proguard UUIDs.", e15);
            return null;
        } catch (RuntimeException e16) {
            this.f93898b.a(b7.ERROR, e16, "%s file is malformed.", d.f95796a);
            return null;
        }
    }
}
