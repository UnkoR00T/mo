package dw;

import iw.f;
import iw.g;
import iw.h;
import java.util.List;
import kw.d;
import mw.c;
import mw.e;
import mw.i;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import pq.n;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u00060\rR\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u00020\u00102\n\u0010\u000f\u001a\u00060\rR\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\t2\n\u0010\u000f\u001a\u00060\rR\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R*\u0010 \u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028\u0014@VX\u0094\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Ldw/b;", "Liw/f;", "Liw/f$a;", "Liw/h;", "productionHolder", "Ljw/b;", "constraintsBase", "<init>", "(Liw/h;Ljw/b;)V", "", "Lkw/d;", "g", "()Ljava/util/List;", "Liw/d$a;", "Liw/d;", "pos", "Loq/i0;", "q", "(Liw/d$a;)V", CryptoServicesPermission.CONSTRAINTS, "m", "(Liw/d$a;Ljw/b;Liw/h;)V", "Lkw/b;", "e", "(Liw/d$a;Liw/h;)Ljava/util/List;", "<set-?>", "h", "Liw/f$a;", "k", "()Liw/f$a;", "r", "(Liw/f$a;)V", "stateInfo", "i", "Ljava/util/List;", "markerBlockProviders", "a", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class b extends f<f.a> {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private f.a stateInfo;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<d<f.a>> markerBlockProviders;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ldw/b$a;", "Liw/g;", "<init>", "()V", "Liw/h;", "productionHolder", "Liw/f;", "a", "(Liw/h;)Liw/f;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f44736a = new a();

        private a() {
        }

        @Override // iw.g
        public f<?> a(h productionHolder) {
            return new b(productionHolder, jw.a.INSTANCE.c());
        }
    }

    public b(h hVar, jw.b bVar) {
        super(hVar, bVar);
        this.stateInfo = new f.a(getStartConstraints(), getStartConstraints(), h());
        this.markerBlockProviders = v.q(new c(), new e(), new mw.d(), new i(), new mw.b(), new mw.h(), new mw.a(), new mw.f(), new mw.g());
    }

    @Override // iw.f
    public List<kw.b> e(iw.d.a pos, h productionHolder) {
        return pos.getLocalPos() == -1 ? i() : super.e(pos, productionHolder);
    }

    @Override // iw.f
    protected List<d<f.a>> g() {
        return this.markerBlockProviders;
    }

    @Override // iw.f
    /* JADX INFO: renamed from: k, reason: from getter */
    protected f.a getStateInfo() {
        return this.stateInfo;
    }

    @Override // iw.f
    protected void m(iw.d.a pos, jw.b constraints, h productionHolder) {
        yv.a aVar;
        if (constraints.a() == 0) {
            return;
        }
        int globalPos = pos.getGlobalPos();
        int iMin = Math.min((pos.getGlobalPos() - pos.getLocalPos()) + jw.c.f(constraints, pos.getCurrentLine()), pos.g());
        Character chQ0 = n.Q0(constraints.getTypes());
        if (chQ0 != null && chQ0.charValue() == '>') {
            aVar = yv.e.f229923d;
        } else {
            aVar = ((chQ0 != null && chQ0.charValue() == '.') || (chQ0 != null && chQ0.charValue() == ')')) ? yv.e.D : yv.e.A;
        }
        productionHolder.b(v.e(new nw.f.Node(new lr.i(globalPos, iMin), aVar)));
    }

    @Override // iw.f
    protected void q(iw.d.a pos) {
        if (pos.getLocalPos() == -1) {
            r(new f.a(getStartConstraints(), getTopBlockConstraints().e(pos), h()));
            return;
        }
        if (d.INSTANCE.a(pos, getStateInfo().getNextConstraints())) {
            jw.b nextConstraints = getStateInfo().getNextConstraints();
            jw.b bVarB = getStateInfo().getNextConstraints().b(pos);
            if (bVarB == null) {
                bVarB = getStateInfo().getNextConstraints();
            }
            r(new f.a(nextConstraints, bVarB, h()));
        }
    }

    public void r(f.a aVar) {
        this.stateInfo = aVar;
    }
}
