package g;

import fr.k;
import o.j0;
import p071kotlin.Metadata;
import v.h3;
import v.p1;
import v.t2;
import v.u2;
import v.z2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001:\u0001\tB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lg/f;", "Lv/h3;", "Lv/p1;", "config", "", "unused", "<init>", "(Lv/p1;Z)V", "(Lv/p1;)V", "a", "()Lv/p1;", "R", "Lv/p1;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class f implements h3 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final p1 config;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \b2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\r"}, d2 = {"Lg/f$a;", "Lo/j0;", "Lg/f;", "<init>", "()V", "Lv/t2;", "a", "()Lv/t2;", "b", "()Lg/f;", "Lv/u2;", "Lv/u2;", "mutableOptionsBundle", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements j0<f> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final u2 mutableOptionsBundle = u2.l0();

        /* JADX INFO: renamed from: g.f$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lg/f$a$a;", "", "<init>", "()V", "Lv/p1;", "config", "Lg/f$a;", "b", "(Lv/p1;)Lg/f$a;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean c(a aVar, p1 p1Var, p1.a aVar2) {
                aVar.a().e0(aVar2, p1Var.c(aVar2), p1Var.d(aVar2));
                return true;
            }

            public final a b(final p1 config) {
                final a aVar = new a();
                config.g("camera2.captureRequest.option.", new p1.b() { // from class: g.e
                    @Override // v.p1.b
                    public final boolean a(p1.a aVar2) {
                        return f.a.Companion.c(aVar, config, aVar2);
                    }
                });
                return aVar;
            }

            private Companion() {
            }
        }

        @Override // o.j0
        public t2 a() {
            return this.mutableOptionsBundle;
        }

        public f b() {
            return new f(z2.k0(this.mutableOptionsBundle));
        }
    }

    private f(p1 p1Var, boolean z15) {
        this.config = p1Var;
    }

    @Override // v.h3
    /* JADX INFO: renamed from: a, reason: from getter */
    public p1 getConfig() {
        return this.config;
    }

    public f(p1 p1Var) {
        this(p1Var, false);
    }
}
