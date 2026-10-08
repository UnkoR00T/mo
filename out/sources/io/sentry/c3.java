package io.sentry;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class c3 implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c3 f94699a = new c3();

    private c3() {
    }

    public static c3 g() {
        return f94699a;
    }

    @Override // io.sentry.h1
    public <T> void a(T t15, Writer writer) {
    }

    @Override // io.sentry.h1
    public void b(p5 p5Var, OutputStream outputStream) {
    }

    @Override // io.sentry.h1
    public <T> T c(Reader reader, Class<T> cls) {
        return null;
    }

    @Override // io.sentry.h1
    public p5 d(InputStream inputStream) {
        return null;
    }

    @Override // io.sentry.h1
    public <T, R> T e(Reader reader, Class<T> cls, t1<R> t1Var) {
        return null;
    }

    @Override // io.sentry.h1
    public String f(Map<String, Object> map) {
        return "";
    }
}
