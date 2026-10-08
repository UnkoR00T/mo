package tr;

import fr.k;
import fr.t;

/* JADX INFO: loaded from: classes4.dex */
public enum c {
    Function,
    SuspendFunction,
    KFunction,
    KSuspendFunction,
    UNKNOWN;


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ wq.a f191719h = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f191712a = new a(null);

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final c a(f fVar) {
            if (t.c(fVar, f.a.f191725f)) {
                return c.Function;
            }
            if (t.c(fVar, f.d.f191728f)) {
                return c.SuspendFunction;
            }
            if (t.c(fVar, f.b.f191726f)) {
                return c.KFunction;
            }
            return t.c(fVar, f.c.f191727f) ? c.KSuspendFunction : c.UNKNOWN;
        }

        private a() {
        }
    }
}
