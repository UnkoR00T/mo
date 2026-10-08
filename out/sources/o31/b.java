package o31;

import bl0.BEChildBirthApplicationResponse;
import bl0.BEChildBirthRegistration;
import bl0.BEChildBirthRegistrationSubmitApplication;
import bl0.BEChildBirthRegistrationSubmitApplicationXml;
import dx.i;
import er.p;
import fr.t;
import iy.c0;
import j44.Access;
import java.util.List;
import n31.RegistrationChildrenResult;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.k;
import wz3.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u0015B/\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001d¨\u0006\u001e"}, d2 = {"Lo31/b;", "Lgz/b;", "Lo31/b$a;", "Ldx/i;", "Lk44/a;", "Ln31/b;", "Lnl0/d;", "registerChildrenUseCase", "Lwz3/j;", "signBase64XmlUC", "Lnl0/e;", "registerChildrenXmlUseCase", "Ll44/a;", "callActionWithEdorAuthTokenUC", "Lpx/d;", "remoteLogger", "<init>", "(Lnl0/d;Lwz3/j;Lnl0/e;Ll44/a;Lpx/d;)V", "params", "e", "(Lo31/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lnl0/d;", "b", "Lwz3/j;", "c", "Lnl0/e;", "d", "Ll44/a;", "Lpx/d;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b<Params, i<? extends k44.a, ? extends RegistrationChildrenResult>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final nl0.d registerChildrenUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j signBase64XmlUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final nl0.e registerChildrenXmlUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l44.a callActionWithEdorAuthTokenUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: o31.b$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lo31/b$a;", "Lgz/b$a;", "Lbl0/h;", "childBirthRegistration", "Ln31/b;", "lastResult", "<init>", "(Lbl0/h;Ln31/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbl0/h;", "()Lbl0/h;", "b", "Ln31/b;", "()Ln31/b;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEChildBirthRegistration childBirthRegistration;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final RegistrationChildrenResult lastResult;

        public Params(BEChildBirthRegistration hVar, RegistrationChildrenResult bVar) {
            this.childBirthRegistration = hVar;
            this.lastResult = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BEChildBirthRegistration getChildBirthRegistration() {
            return this.childBirthRegistration;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final RegistrationChildrenResult getLastResult() {
            return this.lastResult;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.childBirthRegistration, params.childBirthRegistration) && t.c(this.lastResult, params.lastResult);
        }

        public int hashCode() {
            int iHashCode = this.childBirthRegistration.hashCode() * 31;
            RegistrationChildrenResult bVar = this.lastResult;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            return "Params(childBirthRegistration=" + this.childBirthRegistration + ", lastResult=" + this.lastResult + ')';
        }
    }

    /* JADX INFO: renamed from: o31.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3492b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f141830d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f141831e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f141832f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f141833g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f141834h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f141835j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f141836k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f141837l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f141838m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f141839n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f141840p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f141841q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f141842r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f141844t;

        C3492b(tq.e<? super C3492b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f141842r = obj;
            this.f141844t |= PKIFailureInfo.systemUnavail;
            return b.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj44/f;", "token", "Ldx/i;", "Ldx/b;", "Lbl0/a;", "<anonymous>", "(Lj44/f;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c extends k implements p<Access, tq.e<? super i<? extends dx.b, ? extends BEChildBirthApplicationResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141845e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141846f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<BEChildBirthRegistrationSubmitApplicationXml> f141848h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<BEChildBirthRegistrationSubmitApplicationXml> list, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f141848h = list;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Access access = (Access) this.f141846f;
            Object objE = uq.b.e();
            int i15 = this.f141845e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            nl0.e eVar = b.this.registerChildrenXmlUseCase;
            nl0.e.Params params = new nl0.e.Params(al0.a.a(c0.g(access.getValue())), new BEChildBirthRegistrationSubmitApplication(this.f141848h), null);
            this.f141846f = vq.j.a(access);
            this.f141845e = 1;
            Object objC = eVar.c(params, this);
            return objC == objE ? objE : objC;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Access access, tq.e<? super i<? extends dx.b, BEChildBirthApplicationResponse>> eVar) {
            return ((c) v(access, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = b.this.new c(this.f141848h, eVar);
            cVar.f141846f = obj;
            return cVar;
        }
    }

    public b(nl0.d dVar, j jVar, nl0.e eVar, l44.a aVar, px.d dVar2) {
        this.registerChildrenUseCase = dVar;
        this.signBase64XmlUC = jVar;
        this.registerChildrenXmlUseCase = eVar;
        this.callActionWithEdorAuthTokenUC = aVar;
        this.remoteLogger = dVar2;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0165  */
    /* JADX WARN: Code duplicated, block: B:49:0x018d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0191  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0165 -> B:45:0x0174). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object e(o31.b.Params r18, tq.e<? super dx.i<? extends k44.a, n31.RegistrationChildrenResult>> r19) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o31.b.e(o31.b$a, tq.e):java.lang.Object");
    }
}
