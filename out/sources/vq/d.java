package vq;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0016"}, d2 = {"Lvq/d;", "Lvq/a;", "Ltq/e;", "", "completion", "Ltq/i;", "_context", "<init>", "(Ltq/e;Ltq/i;)V", "(Ltq/e;)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "()Ltq/e;", "Loq/i0;", "K", "()V", "b", "Ltq/i;", "c", "Ltq/e;", "intercepted", "()Ltq/i;", "context", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tq.i _context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private transient tq.e<Object> intercepted;

    public d(tq.e<Object> eVar, tq.i iVar) {
        super(eVar);
        this._context = iVar;
    }

    @Override // vq.a
    protected void K() {
        tq.e<?> eVar = this.intercepted;
        if (eVar != null && eVar != this) {
            ((tq.f) get_context().m(tq.f.INSTANCE)).K(eVar);
        }
        this.intercepted = c.f207891a;
    }

    public final tq.e<Object> L() {
        tq.e<Object> eVarO = this.intercepted;
        if (eVarO == null) {
            tq.f fVar = (tq.f) get_context().m(tq.f.INSTANCE);
            if (fVar == null || (eVarO = fVar.O(this)) == null) {
                eVarO = this;
            }
            this.intercepted = eVarO;
        }
        return eVarO;
    }

    @Override // tq.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public tq.i get_context() {
        return this._context;
    }

    public d(tq.e<Object> eVar) {
        this(eVar, eVar != null ? eVar.get_context() : null);
    }
}
