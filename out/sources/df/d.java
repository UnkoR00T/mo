package df;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f41336c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f41338b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f41339a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<c> f41340b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f41339a, Collections.unmodifiableList(this.f41340b));
        }

        public a b(List<c> list) {
            this.f41340b = list;
            return this;
        }

        public a c(String str) {
            this.f41339a = str;
            return this;
        }
    }

    d(String str, List<c> list) {
        this.f41337a = str;
        this.f41338b = list;
    }

    public static a c() {
        return new a();
    }

    @gl.d(tag = 2)
    public List<c> a() {
        return this.f41338b;
    }

    @gl.d(tag = 1)
    public String b() {
        return this.f41337a;
    }
}
