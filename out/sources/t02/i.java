package t02;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lt02/i;", "Lgz/b;", "Lt02/i$a;", "", "Lt02/g;", "formValidationUseCase", "<init>", "(Lt02/g;)V", "params", "d", "(Lt02/i$a;Ltq/e;)Ljava/lang/Object;", "a", "Lt02/g;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements gz.b<Params, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g formValidationUseCase;

    /* JADX INFO: renamed from: t02.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lt02/i$a;", "Lgz/b$a;", "Leo0/v;", "draftMessageRequest", "<init>", "(Leo0/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/v;", "()Leo0/v;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final eo0.v draftMessageRequest;

        public Params(eo0.v vVar) {
            this.draftMessageRequest = vVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final eo0.v getDraftMessageRequest() {
            return this.draftMessageRequest;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.draftMessageRequest, ((Params) other).draftMessageRequest);
        }

        public int hashCode() {
            return this.draftMessageRequest.hashCode();
        }

        public String toString() {
            return "Params(draftMessageRequest=" + this.draftMessageRequest + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f186648d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f186649e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f186650f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f186651g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f186652h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f186654k;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f186652h = obj;
            this.f186654k |= PKIFailureInfo.systemUnavail;
            return i.this.d(null, this);
        }
    }

    public i(g gVar) {
        this.formValidationUseCase = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:45:0x0102  */
    /* JADX WARN: Code duplicated, block: B:48:0x010c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[LOOP:0: B:46:0x0106->B:54:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Params params, tq.e<? super Boolean> eVar) throws Throwable {
        b bVar;
        Object[] objArr;
        Params params2;
        Object[] objArr2;
        int i15;
        int i16;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        Set setI;
        Iterator it;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i17 = bVar.f186654k;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f186654k = i17 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objQ = bVar.f186652h;
        Object objE = uq.b.e();
        int i18 = bVar.f186654k;
        int i19 = 2;
        boolean z15 = false;
        if (i18 == 0) {
            oq.u.b(objQ);
            objArr = new hz.g[3];
            g gVar = this.formValidationUseCase;
            String subject = params.getDraftMessageRequest().getSubject();
            if (subject == null) {
                subject = "";
            }
            g.b.c cVar = new g.b.c(subject, false);
            bVar.f186648d = params;
            bVar.f186649e = objArr;
            bVar.f186650f = objArr;
            bVar.f186651g = 0;
            bVar.f186654k = 1;
            objQ = gVar.q(cVar, bVar);
            if (objQ != objE) {
                params2 = params;
                objArr2 = objArr;
                i15 = 0;
            }
            return objE;
        }
        if (i18 == 1) {
            i15 = bVar.f186651g;
            objArr = (hz.g[]) bVar.f186650f;
            objArr2 = (hz.g[]) bVar.f186649e;
            params2 = (Params) bVar.f186648d;
            oq.u.b(objQ);
        } else {
            if (i18 == 2) {
                i16 = bVar.f186651g;
                objArr3 = (hz.g[]) bVar.f186650f;
                objArr2 = (hz.g[]) bVar.f186649e;
                params2 = (Params) bVar.f186648d;
                oq.u.b(objQ);
                objArr3[i16] = objQ;
                g gVar2 = this.formValidationUseCase;
                String caseId = params2.getDraftMessageRequest().getCaseId();
                g.b.a aVar = new g.b.a(caseId != null ? caseId : "");
                bVar.f186648d = vq.j.a(params2);
                bVar.f186649e = objArr2;
                bVar.f186650f = objArr2;
                bVar.f186651g = 2;
                bVar.f186654k = 3;
                objQ = gVar2.q(aVar, bVar);
                if (objQ != objE) {
                    objArr4 = objArr2;
                    objArr5 = objArr4;
                }
                return objE;
            }
            if (i18 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i19 = bVar.f186651g;
            objArr4 = (hz.g[]) bVar.f186650f;
            objArr5 = (hz.g[]) bVar.f186649e;
            oq.u.b(objQ);
        }
        objArr4[i19] = objQ;
        setI = e1.i(objArr5);
        if ((setI instanceof Collection) || !setI.isEmpty()) {
            it = setI.iterator();
            while (it.hasNext()) {
                if (!(((hz.g) it.next()) instanceof hz.g.b)) {
                }
            }
            z15 = true;
        } else {
            z15 = true;
        }
        return vq.b.a(z15);
        objArr[i15] = objQ;
        g gVar3 = this.formValidationUseCase;
        String textBody = params2.getDraftMessageRequest().getTextBody();
        if (textBody == null) {
            textBody = "";
        }
        g.b.Content content = new g.b.Content(textBody, false);
        bVar.f186648d = params2;
        bVar.f186649e = objArr2;
        bVar.f186650f = objArr2;
        bVar.f186651g = 1;
        bVar.f186654k = 2;
        objQ = gVar3.q(content, bVar);
        if (objQ != objE) {
            i16 = 1;
            objArr3 = objArr2;
            objArr3[i16] = objQ;
            g gVar4 = this.formValidationUseCase;
            String caseId2 = params2.getDraftMessageRequest().getCaseId();
            g.b.a aVar2 = new g.b.a(caseId2 != null ? caseId2 : "");
            bVar.f186648d = vq.j.a(params2);
            bVar.f186649e = objArr2;
            bVar.f186650f = objArr2;
            bVar.f186651g = 2;
            bVar.f186654k = 3;
            objQ = gVar4.q(aVar2, bVar);
            if (objQ != objE) {
                objArr4 = objArr2;
                objArr5 = objArr4;
                objArr4[i19] = objQ;
                setI = e1.i(objArr5);
                if (setI instanceof Collection) {
                    it = setI.iterator();
                    while (it.hasNext()) {
                        if (!(((hz.g) it.next()) instanceof hz.g.b)) {
                        }
                    }
                    z15 = true;
                } else {
                    it = setI.iterator();
                    while (it.hasNext()) {
                        if (!(((hz.g) it.next()) instanceof hz.g.b)) {
                        }
                    }
                    z15 = true;
                }
                return vq.b.a(z15);
            }
        }
        return objE;
    }
}
