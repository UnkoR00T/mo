package io.sentry;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface h1 {
    <T> void a(T t15, Writer writer);

    void b(p5 p5Var, OutputStream outputStream);

    <T> T c(Reader reader, Class<T> cls);

    p5 d(InputStream inputStream);

    <T, R> T e(Reader reader, Class<T> cls, t1<R> t1Var);

    String f(Map<String, Object> map);
}
