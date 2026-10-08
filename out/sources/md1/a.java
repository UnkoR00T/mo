package md1;

import dx.i;
import fr.t;
import hb1.SignedBase64Xml;
import iy.b0;
import ld1.Base64Xml;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.j;
import wz3.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmd1/a;", "", "Lmd1/a$a;", "Lhb1/h;", "Lwz3/d;", "getBase64SignedValueUseCase", "<init>", "(Lwz3/d;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lmd1/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lwz3/d;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d getBase64SignedValueUseCase;

    /* JADX INFO: renamed from: md1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmd1/a$a;", "Lgz/b$a;", "Lld1/b;", "base64Xml", "<init>", "(Lld1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lld1/b;", "()Lld1/b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f125654b = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Base64Xml base64Xml;

        public Params(Base64Xml base64Xml) {
            this.base64Xml = base64Xml;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Base64Xml getBase64Xml() {
            return this.base64Xml;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.base64Xml, ((Params) other).base64Xml);
        }

        public int hashCode() {
            return this.base64Xml.hashCode();
        }

        public String toString() {
            return "Params(base64Xml=" + this.base64Xml + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f125656d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f125657e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f125659g;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f125657e = obj;
            this.f125659g |= PKIFailureInfo.systemUnavail;
            return a.this.d(null, this);
        }
    }

    public a(d dVar) {
        this.getBase64SignedValueUseCase = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Params params, e<? super i<? extends dx.b, SignedBase64Xml>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f125659g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f125659g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f125657e;
        Object objE = uq.b.e();
        int i16 = bVar.f125659g;
        if (i16 == 0) {
            u.b(objC);
            d dVar = this.getBase64SignedValueUseCase;
            d.Params params2 = new d.Params(params.getBase64Xml().getValue());
            bVar.f125656d = j.a(params);
            bVar.f125659g = 1;
            objC = dVar.c(params2, bVar);
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
        if (iVar instanceof i.Right) {
            return new i.Right(new SignedBase64Xml(((ry.a) ((i.Right) iVar).b()).getData()));
        }
        throw new p();
    }
}
