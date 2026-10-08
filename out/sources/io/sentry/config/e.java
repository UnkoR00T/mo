package io.sentry.config;

import io.sentry.b7;
import io.sentry.v0;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: loaded from: classes4.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v0 f94817b;

    public e(String str, v0 v0Var) {
        this.f94816a = str;
        this.f94817b = v0Var;
    }

    public Properties a() {
        try {
            File file = new File(this.f94816a);
            if (!file.isFile() || !file.canRead()) {
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } catch (Throwable th4) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException e15) {
            this.f94817b.a(b7.ERROR, e15, "Failed to load Sentry configuration from file: %s", this.f94816a);
            return null;
        }
    }
}
