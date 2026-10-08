package zx2;

import mu.b0;
import mu.i;
import mu.p0;
import mu.r0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lzx2/b;", "Lzx2/a;", "<init>", "()V", "Lzx2/a$a;", "state", "Loq/i0;", "y", "(Lzx2/a$a;)V", "Lmu/b0;", "a", "Lmu/b0;", "_faceDetectionInstallationState", "Lmu/p0;", "b", "Lmu/p0;", "d", "()Lmu/p0;", "faceDetectionInstallationState", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0<a.EnumC6438a> _faceDetectionInstallationState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p0<a.EnumC6438a> faceDetectionInstallationState;

    public b() {
        b0<a.EnumC6438a> b0VarA = r0.a(a.EnumC6438a.NOT_STARTED);
        this._faceDetectionInstallationState = b0VarA;
        this.faceDetectionInstallationState = i.b(b0VarA);
    }

    @Override // zx2.a, bw2.a
    public p0<a.EnumC6438a> d() {
        return this.faceDetectionInstallationState;
    }

    @Override // zx2.a
    public void y(a.EnumC6438a state) {
        b0<a.EnumC6438a> b0Var = this._faceDetectionInstallationState;
        while (!b0Var.s(b0Var.getValue(), state)) {
        }
    }
}
