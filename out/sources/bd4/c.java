package bd4;

import dx.i;
import dx.j;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lbd4/c;", "Lz64/c;", "Lch1/c;", "clearDocumentsSettingsUseCase", "<init>", "(Lch1/c;)V", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lch1/c;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements z64.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ch1.c clearDocumentsSettingsUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f18578d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18579e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f18580f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f18581g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f18582h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f18583j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f18584k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f18585l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f18586m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f18588p;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f18586m = obj;
            this.f18588p |= PKIFailureInfo.systemUnavail;
            return c.this.a(this);
        }
    }

    public c(ch1.c cVar) {
        this.clearDocumentsSettingsUseCase = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [bd4.c$a, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    @Override // z64.c
    public Object a(tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        ?? aVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof a) {
            a aVar2 = (a) eVar;
            int i15 = aVar2.f18588p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar2.f18588p = i15 - PKIFailureInfo.systemUnavail;
                aVar = aVar2;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f18586m;
        Object objE = uq.b.e();
        int i16 = aVar.f18588p;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar3 = new ex.a();
                        ch1.c cVar = this.clearDocumentsSettingsUseCase;
                        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                        aVar.f18583j = jVarA;
                        aVar.f18584k = vq.j.a(aVar3);
                        aVar.f18585l = vq.j.a(aVar3);
                        aVar.f18578d = 0;
                        aVar.f18579e = 0;
                        aVar.f18580f = 0;
                        aVar.f18581g = 0;
                        aVar.f18582h = 0;
                        aVar.f18588p = 1;
                        if (cVar.c(c1792a, aVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        aVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(aVar));
                        i iVarA = aVar.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new i.Right(i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }
}
