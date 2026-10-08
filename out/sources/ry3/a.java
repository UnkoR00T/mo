package ry3;

import al0.CommunityOffice;
import dx.i;
import fr.t;
import fu.r;
import mx.c;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lry3/a;", "", "Lry3/a$a;", "", "Lml0/b;", "getOfficeEdorAddressUC", "Lmx/c;", "labelProvider", "<init>", "(Lml0/b;Lmx/c;)V", "params", "Ldx/i;", "Ldx/b;", "e", "(Lry3/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lml0/b;", "b", "Lmx/c;", "Ldx/b$c;", "d", "()Ldx/b$c;", "missingEdorAddressDomainError", "officeselection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ml0.b getOfficeEdorAddressUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: ry3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lry3/a$a;", "Lgz/b$a;", "Lal0/v;", "communityOffice", "<init>", "(Lal0/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/v;", "()Lal0/v;", "officeselection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CommunityOffice communityOffice;

        public Params(CommunityOffice communityOffice) {
            this.communityOffice = communityOffice;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CommunityOffice getCommunityOffice() {
            return this.communityOffice;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.communityOffice, ((Params) other).communityOffice);
        }

        public int hashCode() {
            return this.communityOffice.hashCode();
        }

        public String toString() {
            return "Params(communityOffice=" + this.communityOffice + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f176917d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f176918e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f176920g;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f176918e = obj;
            this.f176920g |= PKIFailureInfo.systemUnavail;
            return a.this.e(null, this);
        }
    }

    public a(ml0.b bVar, c cVar) {
        this.getOfficeEdorAddressUC = bVar;
        this.labelProvider = cVar;
    }

    private final dx.b.Business d() {
        c cVar = this.labelProvider;
        return new dx.b.Business(null, dx.b.f.WARNING, cVar.c(oy3.a.f150704f), cVar.c(oy3.a.f150703e), null, cVar.c(oy3.a.f150701c), null, 81, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(Params params, e<? super i<? extends dx.b, String>> eVar) {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f176920g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f176920g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f176918e;
        Object objE = uq.b.e();
        int i16 = bVar.f176920g;
        if (i16 == 0) {
            u.b(objC);
            ml0.b bVar2 = this.getOfficeEdorAddressUC;
            ml0.b.Params params2 = new ml0.b.Params(params.getCommunityOffice().getId(), null);
            bVar.f176917d = j.a(params);
            bVar.f176920g = 1;
            objC = bVar2.c(params2, bVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        String str = (String) ((i.Right) iVar).b();
        return (str == null || r.t0(str)) ? new i.Left(d()) : new i.Right(str);
    }
}
