package xr;

import vr.e;
import vr.g1;

/* JADX INFO: loaded from: classes4.dex */
public interface c {

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f220526a = new a();

        private a() {
        }

        @Override // xr.c
        public boolean b(e eVar, g1 g1Var) {
            return true;
        }
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f220527a = new b();

        private b() {
        }

        @Override // xr.c
        public boolean b(e eVar, g1 g1Var) {
            return !g1Var.getAnnotations().d2(d.a());
        }
    }

    boolean b(e eVar, g1 g1Var);
}
