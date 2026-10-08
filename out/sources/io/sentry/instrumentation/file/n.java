package io.sentry.instrumentation.file;

import java.io.File;
import java.io.OutputStreamWriter;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends OutputStreamWriter {
    public n(File file) {
        super(new l(file));
    }
}
