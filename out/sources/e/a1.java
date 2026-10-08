package e;

import PRN.EvCompValue;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u0006\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R$\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010&R(\u0010*\u001a\u0004\u0018\u00010%2\b\u0010\u0017\u001a\u0004\u0018\u00010%8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010(\"\u0004\b\u0018\u0010)¨\u0006+"}, d2 = {"Le/a1;", "Le/z1;", "La/p;", "compat", "<init>", "(La/p;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Lju/x;", "", "a", "(Ljava/lang/Exception;)Lju/x;", "Loq/i0;", "reset", "()V", "exposureIndex", "", "cancelPreviousTask", "Lju/w0;", "e", "(IZ)Lju/w0;", "La/p;", "value", "b", "I", "d", "(I)V", "evCompIndex", "LPRN/c0;", "c", "LPRN/c0;", "getExposureState", "()LPRN/c0;", "setExposureState", "(LPRN/c0;)V", "exposureState", "Le/f2;", "Le/f2;", "_requestControl", "()Le/f2;", "(Le/f2;)V", "requestControl", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a1 implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a.p compat;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int evCompIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private EvCompValue exposureState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private f2 _requestControl;

    public a1(a.p pVar) {
        this.compat = pVar;
        this.exposureState = new EvCompValue(pVar.b(), this.evCompIndex, pVar.a(), pVar.e());
    }

    private final ju.x<Integer> a(Exception exception) {
        ju.x<Integer> xVarC = ju.z.c(null, 1, null);
        xVarC.p(exception);
        return xVarC;
    }

    private final void d(int i15) {
        this.evCompIndex = i15;
        this.exposureState = this.exposureState.c(i15);
    }

    public static /* synthetic */ ju.w0 f(a1 a1Var, int i15, boolean z15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            z15 = true;
        }
        return a1Var.e(i15, z15);
    }

    @Override // e.z1
    public void b(f2 f2Var) {
        this._requestControl = f2Var;
        e(this.evCompIndex, false);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public f2 get_requestControl() {
        return this._requestControl;
    }

    public final ju.w0<Integer> e(int exposureIndex, boolean cancelPreviousTask) {
        if (!this.compat.b()) {
            return a(new IllegalArgumentException("ExposureCompensation is not supported"));
        }
        if (this.compat.a().contains(Integer.valueOf(exposureIndex))) {
            f2 f2Var = get_requestControl();
            if (f2Var != null) {
                d(exposureIndex);
                ju.w0<Integer> w0VarD = this.compat.d(exposureIndex, f2Var, cancelPreviousTask);
                if (w0VarD != null) {
                    return w0VarD;
                }
            }
            o.j.a aVar = new o.j.a("Camera is not active.");
            this.compat.c(aVar);
            return a(aVar);
        }
        return a(new IllegalArgumentException("Requested ExposureCompensation " + exposureIndex + " is not within valid range [" + this.compat.a().getUpper() + " .. " + this.compat.a().getLower() + ']'));
    }

    @Override // e.z1
    public void reset() {
        d(0);
        f(this, 0, false, 2, null);
    }
}
