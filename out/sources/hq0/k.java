package hq0;

import dq0.UnregisterFromDefenceTrainingDataDto;
import dq0.UnregisterFromDefenceTrainingRequestDto;
import er.p;
import fr.q0;
import iy.b0;
import iy.c0;
import java.util.concurrent.CancellationException;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhq0/k;", "Lhq0/j;", "Lay/j;", "jsonSerializer", "<init>", "(Lay/j;)V", "Lhq0/j$a;", "params", "Ldx/i;", "Ldx/b;", "Lry/a;", "d", "(Lhq0/j$a;Ltq/e;)Ljava/lang/Object;", "a", "Lay/j;", "militaryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ay.j jsonSerializer;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f86334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f86335e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f86336f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f86337g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f86338h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f86339j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f86340k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f86341l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f86342m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f86343n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f86344p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f86346r;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f86344p = obj;
            this.f86346r |= PKIFailureInfo.systemUnavail;
            return k.this.c(null, this);
        }
    }

    public k(ay.j jVar) {
        this.jsonSerializer = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(j.Params params, tq.e<? super dx.i<? extends dx.b, ry.a>> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.b bVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f86346r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f86346r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f86344p;
        ?? E = uq.b.e();
        int i16 = aVar.f86346r;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar2 = new ex.a();
                        p<b0, tq.e<? super dx.i<? extends dx.b, ry.a>>, Object> pVarB = params.b();
                        b0 b0VarG = c0.g(this.jsonSerializer.b(new UnregisterFromDefenceTrainingRequestDto(c0.e(params.getChallenge().getChallenge()), new UnregisterFromDefenceTrainingDataDto(params.getTrainingId())), q0.n(UnregisterFromDefenceTrainingRequestDto.class)));
                        aVar.f86334d = vq.j.a(params);
                        aVar.f86335e = jVarA;
                        aVar.f86336f = vq.j.a(aVar2);
                        aVar.f86337g = vq.j.a(aVar2);
                        aVar.f86338h = aVar2;
                        aVar.f86339j = 0;
                        aVar.f86340k = 0;
                        aVar.f86341l = 0;
                        aVar.f86342m = 0;
                        aVar.f86343n = 0;
                        aVar.f86346r = 1;
                        Object objB2 = pVarB.B(b0VarG, aVar);
                        if (objB2 == E) {
                            return E;
                        }
                        obj = objB2;
                        bVar = aVar2;
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        dx.i iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) aVar.f86338h;
                    try {
                        u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right(ry.a.a(((ry.a) bVar.a((dx.i) obj)).getData()));
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
