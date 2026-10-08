package w34;

import dx.b;
import dx.i;
import g34.c;
import i34.IdentityDeactivateData;
import k34.u;
import oq.p;
import p071kotlin.Metadata;
import q34.g1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lw34/a;", "Ldx/a;", "Lg34/c;", "identityManager", "Lq34/g1;", "hasDocumentWithActiveCertUseCase", "<init>", "(Lg34/c;Lq34/g1;)V", "", "clearData", "Ldx/b;", "b", "(Z)Ldx/b;", "a", "Lg34/c;", "Lq34/g1;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements dx.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c identityManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g1 hasDocumentWithActiveCertUseCase;

    public a(c cVar, g1 g1Var) {
        this.identityManager = cVar;
        this.hasDocumentWithActiveCertUseCase = g1Var;
    }

    @Override // dx.a
    public b b(boolean clearData) {
        Object objB;
        i<b, u> iVarG = this.identityManager.g(false);
        if (iVarG instanceof i.Left) {
            return (b) ((i.Left) iVarG).b();
        }
        if (!(iVarG instanceof i.Right)) {
            throw new p();
        }
        u uVar = (u) ((i.Right) iVarG).b();
        i<? extends b, ? extends Boolean> iVarA = this.hasDocumentWithActiveCertUseCase.a(gz.b.a.C1792a.f78542a);
        if (iVarA instanceof i.Left) {
            objB = Boolean.FALSE;
        } else {
            if (!(iVarA instanceof i.Right)) {
                throw new p();
            }
            objB = ((i.Right) iVarA).b();
        }
        return new b.Deactivate(new IdentityDeactivateData(uVar, clearData, ((Boolean) objB).booleanValue()));
    }
}
