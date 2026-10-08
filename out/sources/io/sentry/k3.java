package io.sentry;

import java.io.Closeable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public interface k3 extends Closeable {
    static Date Z1(String str, v0 v0Var) {
        if (str == null) {
            return null;
        }
        try {
            try {
                return m.f(str);
            } catch (Exception e15) {
                v0Var.b(b7.ERROR, "Error when deserializing millis timestamp format.", e15);
                return null;
            }
        } catch (Exception unused) {
            return m.g(str);
        }
    }

    Long E2();

    void G0();

    Object K3();

    <T> T M1(v0 v0Var, t1<T> t1Var);

    TimeZone N0(v0 v0Var);

    String O2();

    <T> Map<String, T> S2(v0 v0Var, t1<T> t1Var);

    <T> List<T> T3(v0 v0Var, t1<T> t1Var);

    void U2(v0 v0Var, Map<String, Object> map, String str);

    void Y();

    void e0(boolean z15);

    Double f1();

    void h0();

    String h1();

    double nextDouble();

    float nextFloat();

    int nextInt();

    long nextLong();

    Date p1(v0 v0Var);

    io.sentry.vendor.gson.stream.b peek();

    String q2();

    Boolean u1();

    Integer z2();

    Float z3();
}
