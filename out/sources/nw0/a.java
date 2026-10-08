package nw0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.ProcessId;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnw0/a;", "Law0/a;", "Ljw0/e;", "repository", "<init>", "(Ljw0/e;)V", "Law0/a$a;", "params", "Ldx/i;", "Ldx/b;", "Law0/a$b;", "d", "(Law0/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Ljw0/e;", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements aw0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jw0.e repository;

    /* JADX INFO: renamed from: nw0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3439a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f139137d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f139138e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f139140g;

        C3439a(tq.e<? super C3439a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f139138e = obj;
            this.f139140g |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(jw0.e eVar) {
        this.repository = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(aw0.a.Params params, tq.e<? super dx.i<? extends dx.b, aw0.a.Result>> eVar) throws Throwable {
        C3439a c3439a;
        if (eVar instanceof C3439a) {
            c3439a = (C3439a) eVar;
            int i15 = c3439a.f139140g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c3439a.f139140g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c3439a = new C3439a(eVar);
            }
        } else {
            c3439a = new C3439a(eVar);
        }
        Object objB = c3439a.f139138e;
        Object objE = uq.b.e();
        int i16 = c3439a.f139140g;
        if (i16 == 0) {
            oq.u.b(objB);
            jw0.e eVar2 = this.repository;
            ProcessId processId = params.getProcessId();
            c3439a.f139137d = params;
            c3439a.f139140g = 1;
            objB = eVar2.B(processId, c3439a);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (aw0.a.Params) c3439a.f139137d;
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return new dx.i.Right(new aw0.a.Result(params.getProcessId(), (sv0.o) ((dx.i.Right) iVar).b()));
    }
}
