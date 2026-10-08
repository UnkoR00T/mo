package io.sentry.instrumentation.file;

import java.io.File;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends InputStreamReader {
    public m(String str) {
        super(new h(str));
    }

    public m(File file) {
        super(new h(file));
    }
}
