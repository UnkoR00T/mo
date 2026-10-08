package vd;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface b {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f206142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f206143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f206144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f206145d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f206146e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f206147f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Map<String, String> f206148g = Collections.EMPTY_MAP;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<g> f206149h;

        public boolean a() {
            return b(System.currentTimeMillis());
        }

        boolean b(long j15) {
            return this.f206146e < j15;
        }

        boolean c(long j15) {
            return this.f206147f < j15;
        }
    }

    void a();

    void b(String str, a aVar);

    void c(String str, boolean z15);

    a get(String str);
}
