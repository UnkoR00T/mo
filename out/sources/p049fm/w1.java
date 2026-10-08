package p049fm;

import android.os.Bundle;
import androidx.p016lifecycle.j;
import androidx.p016lifecycle.n;
import androidx.p016lifecycle.q;
import lh.e;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\fJ\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019¨\u0006\u001b"}, d2 = {"Lfm/w1;", "Landroidx/lifecycle/n;", "Llh/e;", "mapView", "<init>", "(Llh/e;)V", "Landroidx/lifecycle/j$b;", "targetState", "Loq/i0;", "e", "(Landroidx/lifecycle/j$b;)V", "b", "()V", "f", "Landroidx/lifecycle/j$a;", "event", "a", "(Landroidx/lifecycle/j$a;)V", "Landroidx/lifecycle/q;", "source", "m", "(Landroidx/lifecycle/q;Landroidx/lifecycle/j$a;)V", "c", "d", "Llh/e;", "Landroidx/lifecycle/j$b;", "currentLifecycleState", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class w1 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e mapView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private j.b currentLifecycleState = j.b.INITIALIZED;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65342a;

        static {
            int[] iArr = new int[j.a.values().length];
            try {
                iArr[j.a.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.a.ON_CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.a.ON_RESUME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[j.a.ON_PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[j.a.ON_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f65342a = iArr;
        }
    }

    public w1(e eVar) {
        this.mapView = eVar;
    }

    private final void a(j.a event) {
        switch (a.f65342a[event.ordinal()]) {
            case 1:
                this.mapView.c();
                break;
            case 2:
                this.mapView.b(new Bundle());
                break;
            case 3:
                this.mapView.g();
                break;
            case 4:
                this.mapView.f();
                break;
            case 5:
                this.mapView.e();
                break;
            case 6:
                this.mapView.h();
                break;
            default:
                throw new IllegalStateException(("Unsupported lifecycle event: " + event).toString());
        }
        this.currentLifecycleState = event.e();
    }

    private final void b() {
        j.a aVarA = j.a.INSTANCE.a(this.currentLifecycleState);
        if (aVarA != null) {
            a(aVarA);
            return;
        }
        throw new IllegalStateException(("no event down from " + this.currentLifecycleState).toString());
    }

    private final void e(j.b targetState) {
        while (true) {
            j.b bVar = this.currentLifecycleState;
            if (bVar == targetState) {
                return;
            }
            if (bVar.compareTo(targetState) < 0) {
                f();
            } else if (this.currentLifecycleState.compareTo(targetState) > 0) {
                b();
            }
        }
    }

    private final void f() {
        j.a aVarB = j.a.INSTANCE.b(this.currentLifecycleState);
        if (aVarB != null) {
            a(aVarB);
            return;
        }
        throw new IllegalStateException(("no event up from " + this.currentLifecycleState).toString());
    }

    public final void c() {
        j.b bVar = this.currentLifecycleState;
        j.b bVar2 = j.b.CREATED;
        if (bVar.compareTo(bVar2) > 0) {
            e(bVar2);
        }
    }

    public final void d() {
        if (this.currentLifecycleState.compareTo(j.b.INITIALIZED) > 0) {
            e(j.b.DESTROYED);
        }
    }

    @Override // androidx.p016lifecycle.n
    public void m(q source, j.a event) {
        if (a.f65342a[event.ordinal()] == 1) {
            c();
        } else {
            e(event.e());
        }
    }
}
