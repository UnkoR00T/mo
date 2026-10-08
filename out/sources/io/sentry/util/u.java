package io.sentry.util;

import io.sentry.b7;
import io.sentry.k3;
import io.sentry.t1;
import io.sentry.v0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deque<Map.Entry<String, Object>> f95826a;

    public u(Map<String, Object> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f95826a = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    private <T> T r() throws IOException {
        try {
            return (T) u(null, null);
        } catch (Exception e15) {
            throw new IOException(e15);
        }
    }

    private <T> T u(v0 v0Var, t1<T> t1Var) {
        Map.Entry<String, Object> entryPeekLast = this.f95826a.peekLast();
        if (entryPeekLast == null) {
            return null;
        }
        T t15 = (T) entryPeekLast.getValue();
        if (t1Var != null && v0Var != null) {
            return t1Var.a(this, v0Var);
        }
        this.f95826a.removeLast();
        return t15;
    }

    @Override // io.sentry.k3
    public Long E2() throws IOException {
        Object objR = r();
        if (objR instanceof Number) {
            return Long.valueOf(((Number) objR).longValue());
        }
        return null;
    }

    @Override // io.sentry.k3
    public void G0() {
    }

    @Override // io.sentry.k3
    public Object K3() {
        return r();
    }

    @Override // io.sentry.k3
    public <T> T M1(v0 v0Var, t1<T> t1Var) {
        return (T) u(v0Var, t1Var);
    }

    @Override // io.sentry.k3
    public TimeZone N0(v0 v0Var) {
        String strO2 = O2();
        if (strO2 != null) {
            return TimeZone.getTimeZone(strO2);
        }
        return null;
    }

    @Override // io.sentry.k3
    public String O2() {
        return (String) r();
    }

    @Override // io.sentry.k3
    public <T> Map<String, T> S2(v0 v0Var, t1<T> t1Var) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            p();
            return null;
        }
        try {
            Y();
            HashMap map = new HashMap();
            if (m()) {
                while (true) {
                    try {
                        map.put(h1(), t1Var.a(this, v0Var));
                    } catch (Exception e15) {
                        v0Var.b(b7.WARNING, "Failed to deserialize object in map.", e15);
                    }
                    if (peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        break;
                    }
                }
            }
            h0();
            return map;
        } catch (Exception e16) {
            throw new IOException(e16);
        }
    }

    @Override // io.sentry.k3
    public <T> List<T> T3(v0 v0Var, t1<T> t1Var) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            p();
            return null;
        }
        try {
            b();
            ArrayList arrayList = new ArrayList();
            if (m()) {
                do {
                    try {
                        arrayList.add(t1Var.a(this, v0Var));
                    } catch (Exception e15) {
                        v0Var.b(b7.WARNING, "Failed to deserialize object in list.", e15);
                    }
                } while (peek() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
            }
            h();
            return arrayList;
        } catch (Exception e16) {
            throw new IOException(e16);
        }
    }

    @Override // io.sentry.k3
    public void U2(v0 v0Var, Map<String, Object> map, String str) {
        try {
            map.put(str, K3());
        } catch (Exception e15) {
            v0Var.a(b7.ERROR, e15, "Error deserializing unknown key: %s", str);
        }
    }

    @Override // io.sentry.k3
    public void Y() throws IOException {
        Map.Entry<String, Object> entryRemoveLast = this.f95826a.removeLast();
        if (entryRemoveLast == null) {
            throw new IOException("No more entries");
        }
        Object value = entryRemoveLast.getValue();
        if (!(value instanceof Map)) {
            throw new IOException("Current token is not an object");
        }
        this.f95826a.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_OBJECT));
        Iterator it = ((Map) value).entrySet().iterator();
        while (it.hasNext()) {
            this.f95826a.addLast((Map.Entry) it.next());
        }
    }

    public void b() throws IOException {
        Map.Entry<String, Object> entryRemoveLast = this.f95826a.removeLast();
        if (entryRemoveLast == null) {
            throw new IOException("No more entries");
        }
        Object value = entryRemoveLast.getValue();
        if (!(value instanceof List)) {
            throw new IOException("Current token is not an object");
        }
        this.f95826a.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            this.f95826a.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f95826a.clear();
    }

    @Override // io.sentry.k3
    public void e0(boolean z15) {
    }

    @Override // io.sentry.k3
    public Double f1() throws IOException {
        Object objR = r();
        if (objR instanceof Number) {
            return Double.valueOf(((Number) objR).doubleValue());
        }
        return null;
    }

    public void h() {
        if (this.f95826a.size() > 1) {
            this.f95826a.removeLast();
        }
    }

    @Override // io.sentry.k3
    public void h0() {
        if (this.f95826a.size() > 1) {
            this.f95826a.removeLast();
        }
    }

    @Override // io.sentry.k3
    public String h1() throws IOException {
        Map.Entry<String, Object> entryPeekLast = this.f95826a.peekLast();
        if (entryPeekLast != null && entryPeekLast.getKey() != null) {
            return entryPeekLast.getKey();
        }
        throw new IOException("Expected a name but was " + peek());
    }

    public boolean m() {
        return !this.f95826a.isEmpty();
    }

    @Override // io.sentry.k3
    public double nextDouble() throws IOException {
        Object objR = r();
        if (objR instanceof Number) {
            return ((Number) objR).doubleValue();
        }
        throw new IOException("Expected double");
    }

    @Override // io.sentry.k3
    public float nextFloat() throws IOException {
        Object objR = r();
        if (objR instanceof Number) {
            return ((Number) objR).floatValue();
        }
        throw new IOException("Expected float");
    }

    @Override // io.sentry.k3
    public int nextInt() throws IOException {
        Object objR = r();
        if (objR instanceof Number) {
            return ((Number) objR).intValue();
        }
        throw new IOException("Expected int");
    }

    @Override // io.sentry.k3
    public long nextLong() throws IOException {
        Object objR = r();
        if (objR instanceof Number) {
            return ((Number) objR).longValue();
        }
        throw new IOException("Expected long");
    }

    public void p() throws IOException {
        if (r() == null) {
            return;
        }
        throw new IOException("Expected null but was " + peek());
    }

    @Override // io.sentry.k3
    public Date p1(v0 v0Var) {
        return k3.Z1(O2(), v0Var);
    }

    @Override // io.sentry.k3
    public io.sentry.vendor.gson.stream.b peek() {
        Map.Entry<String, Object> entryPeekLast;
        if (!this.f95826a.isEmpty() && (entryPeekLast = this.f95826a.peekLast()) != null) {
            if (entryPeekLast.getKey() != null) {
                return io.sentry.vendor.gson.stream.b.NAME;
            }
            Object value = entryPeekLast.getValue();
            if (value instanceof Map) {
                return io.sentry.vendor.gson.stream.b.BEGIN_OBJECT;
            }
            if (value instanceof List) {
                return io.sentry.vendor.gson.stream.b.BEGIN_ARRAY;
            }
            if (value instanceof String) {
                return io.sentry.vendor.gson.stream.b.STRING;
            }
            if (value instanceof Number) {
                return io.sentry.vendor.gson.stream.b.NUMBER;
            }
            if (value instanceof Boolean) {
                return io.sentry.vendor.gson.stream.b.BOOLEAN;
            }
            return value instanceof io.sentry.vendor.gson.stream.b ? (io.sentry.vendor.gson.stream.b) value : io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
        return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
    }

    @Override // io.sentry.k3
    public String q2() throws IOException {
        String str = (String) r();
        if (str != null) {
            return str;
        }
        throw new IOException("Expected string");
    }

    @Override // io.sentry.k3
    public Boolean u1() {
        return (Boolean) r();
    }

    @Override // io.sentry.k3
    public Integer z2() throws IOException {
        Object objR = r();
        if (objR instanceof Number) {
            return Integer.valueOf(((Number) objR).intValue());
        }
        return null;
    }

    @Override // io.sentry.k3
    public Float z3() throws IOException {
        Object objR = r();
        if (objR instanceof Number) {
            return Float.valueOf(((Number) objR).floatValue());
        }
        return null;
    }
}
