package m0;

import android.content.Context;
import com.google.common.util.concurrent.q;
import java.util.Arrays;
import o.j2;
import o.s;
import p071kotlin.Metadata;
import p105prN.o2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0019B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0013\"\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lm0/n;", "", "Lm0/i;", "lifecycleCameraProvider", "<init>", "(Lm0/i;)V", "Landroid/content/Context;", "context", "Lcom/google/common/util/concurrent/q;", "Ljava/lang/Void;", "d", "(Landroid/content/Context;)Lcom/google/common/util/concurrent/q;", "Loq/i0;", "e", "()V", "Landroidx/lifecycle/q;", "lifecycleOwner", "Lo/s;", "cameraSelector", "", "Lo/j2;", "useCases", "Lo/i;", "c", "(Landroidx/lifecycle/q;Lo/s;[Lo/j2;)Lo/i;", "a", "Lm0/i;", "b", "camera-lifecycle"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final n f121973c = new n(new i());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i lifecycleCameraProvider;

    /* JADX INFO: renamed from: m0.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lm0/n$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/google/common/util/concurrent/q;", "Lm0/n;", "c", "(Landroid/content/Context;)Lcom/google/common/util/concurrent/q;", "sAppInstance", "Lm0/n;", "camera-lifecycle"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n d(Void r15) {
            return n.f121973c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n e(er.l lVar, Object obj) {
            return (n) lVar.b(obj);
        }

        public final q<n> c(Context context) {
            i6.i.g(context);
            q qVarD = n.f121973c.d(context);
            final er.l lVar = new er.l() { // from class: m0.l
                @Override // er.l
                public final Object b(Object obj) {
                    return n.Companion.d((Void) obj);
                }
            };
            return a0.f.n(qVarD, new o2() { // from class: m0.m
                @Override // p105prN.o2
                public final Object apply(Object obj) {
                    return n.Companion.e(lVar, obj);
                }
            }, z.a.a());
        }

        private Companion() {
        }
    }

    private n(i iVar) {
        this.lifecycleCameraProvider = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q<Void> d(Context context) {
        return this.lifecycleCameraProvider.z(context, null);
    }

    public final o.i c(androidx.p016lifecycle.q lifecycleOwner, s cameraSelector, j2... useCases) {
        return this.lifecycleCameraProvider.q(lifecycleOwner, cameraSelector, (j2[]) Arrays.copyOf(useCases, useCases.length));
    }

    public final void e() {
        this.lifecycleCameraProvider.L();
    }
}
